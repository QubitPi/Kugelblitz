/*
 * Copyright 2025 Jiaqi Liu. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.qubitpi.kugelblitz.neo4j;

import org.neo4j.driver.AuthTokens;
import org.neo4j.driver.Driver;
import org.neo4j.driver.EagerResult;
import org.neo4j.driver.GraphDatabase;
import org.neo4j.driver.QueryConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.constraints.NotNull;

import java.util.HashSet;
import java.util.Set;

/**
 * The entity endpoint backed by Neo4J.
 */
@RestController
@RequestMapping("/neo4j")
class Controller {

    private static final Logger LOG = LoggerFactory.getLogger(Controller.class);

    @Value("${kugelblitz.neo4j.url}")
    protected String url;

    @Value("${kugelblitz.neo4j.username}")
    protected String username;

    @Value("${kugelblitz.neo4j.password}")
    protected String password;

    @Value("${kugelblitz.neo4j.database}")
    protected String database;

    /**
     * Recursively find all related terms and definitions of a word using a single Cypher query with apoc extension.
     * <p>
     * This is bad for large sub-graph expand because it will exhaust memories allocated for the query in database. This
     * is good for small-subgraph expand when WS and database are far away from each other.
     *
     * @param value  The node to expand that have the {@link Node#LABEL_ATTRIBUTE} equal to the specified value
     * @param maxHops  The max length of expanded path. Use "-1" for unlimitedly long path.
     *
     * @return a JSON representation of the expanded sub-graph. The format of the JSON would be
     */
    @GetMapping(value = "/expandApoc/{value}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Graph expandApoc(
            @PathVariable(value = "value", required = true) final String value,
            @NotNull @RequestParam(required = false, defaultValue = "-1") final String maxHops
    ) {
        LOG.info("apoc expanding '{}' with max hops of {}", value, maxHops);

        final String query = String.format(
                """
                        MATCH (node{%s:'%s'})
                        CALL apoc.path.expand(node, "LINK", null, 1, %s)
                        YIELD path
                        RETURN path, length(path) AS hops
                        ORDER BY hops;
                """,
                Node.LABEL_ATTRIBUTE,
                value.replace("'", "\\'"),
                maxHops
        );

        final EagerResult result = executeNativeQuery(query);

        final Set<Node> nodes = new HashSet<>();
        final Set<Link> links = new HashSet<>();

        result.records().stream()
                .map(record -> record.get("path").asPath())
                .forEach(path -> {
                    path.nodes().forEach(node -> nodes.add(Node.valueOf(node)));
                    path.relationships().forEach(relationship -> links.add(Link.valueOf(relationship)));
                });

        return new Graph(nodes, links);
    }

    /**
     * Runs a cypher query against Neo4J database and return the query result unmodified.
     *
     * @param query  A standard cypher query string
     *
     * @return query's native result
     *
     * @throws IllegalStateException if a query execution error occurs
     */
    @NotNull
    private EagerResult executeNativeQuery(@NotNull final String query) {
        try (Driver driver = GraphDatabase.driver(url, AuthTokens.basic(username, password))) {
            driver.verifyConnectivity();

            return driver.executableQuery(query)
                    .withConfig(QueryConfig.builder().withDatabase(database).build())
                    .execute();
        }
    }
}
