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

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.springframework.test.web.servlet.MockMvc;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.containers.wait.strategy.LogMessageWaitStrategy;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.utility.DockerImageName;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.Map;

/**
 * {@link Controller Neo4J-backed entity controller} integration tests.
 */
@Testcontainers
@WebMvcTest(Controller.class)
public class ControllerIT {

    private static final ObjectMapper JSON_MAPPER = new ObjectMapper();

    @Container
    private static final GenericContainer NEO4J_CONTAINER = new GenericContainer<>(
            DockerImageName.parse("jack20191124/antiqua")
    )
            .withExposedPorts(7474, 7687)
            .withEnv(Map.of(
                    "NEO4J_AUTH", "none",
                    "NEO4J_ACCEPT_LICENSE_AGREEMENT", "yes",
                    "NEO4JLABS_PLUGINS", "[\"apoc\"]"
            ))
            .waitingFor(new LogMessageWaitStrategy().withRegEx(".*INFO  Started.*"))
            .withStartupTimeout(Duration.of(60, ChronoUnit.SECONDS));

    @Autowired
    private MockMvc mockMvc;

    /**
     * Dynamically set Neo4J container connection info.
     *
     * @param registry  {@code application.properties} mutator at runtime
     */
    @DynamicPropertySource
    static void registerPgProperties(final DynamicPropertyRegistry registry) {
        registry.add(
                "kugelblitz.neo4j.url",
                () -> String.format("neo4j://%s:%d", NEO4J_CONTAINER.getHost(), NEO4J_CONTAINER.getMappedPort(7687))
        );
    }

    /**
     * Make sure new document can be created.
     *
     * @throws Exception if any error occurs in tests
     */
    @Test
    public void testExpandApoc() throws Exception {
        mockMvc.perform(get("/neo4j/expandApoc/dreißig"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$._id").exists())
                .andExpect(jsonPath("$._key").exists())
                .andExpect(jsonPath("$._rev").exists());
    }
}
