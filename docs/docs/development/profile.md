---
sidebar_position: 2
title: Profiles
---

Kugelblitz has first-class support for graph database as a back-end and flexible pipeline-style architecture which
handles nearly any back-end for data storage. One challenge that comes with it is the dependency resolution both at
compile-time and runtime. For example, when we have ArangoDB as the backend, we do not want to compile in or inject any
Neo4J dependencies. Similarly, any Neo4J-backed tests must not touch any ArangoDB-backed test files.

To address that, Kugelblitz utilizes
[Maven Profiles](https://maven.apache.org/guides/introduction/introduction-to-profiles.html). By specifying which
profiles to compile and run Kugelblitz, we can control which dependencies and source files are picked up in any
[Maven lifecycles](https://maven.apache.org/guides/introduction/introduction-to-the-lifecycle.html). For example, to
build Kugelblitz with Neo4J as backing database, specify by profiling all `mvn` commands with `neo4j`:

```console
mvn clean verify -P neo4j
```

In the example above, we compile and run tests with all Neo4J dependencies and related source codes, and not others.

The available profiles are:

- __arango__: ArangoDB as exclusive backend. _Activated by default_
- __neo4j__: Neo4J database as exclusive backend
- __javadoc__: For generating Javadoc of all source files of all databases: `mvn clean javadoc:javadoc -P javadoc`

Since the default persistence database is [ArangoDB](https://arango.qubitpi.org/), any Maven commands is going to assume
the __exclusive__ dependencies and source files for ArangoDB. What this means is that

- all Maven dependencies and configs of other databases are not included in `mvn` invocations
- source codes regarding these databases are _not_ compiled

:::info[Important]

<img src="https://github.com/QubitPi/QubitPi/blob/master/img/Emilie-taking-notes.png?raw=true" width="70px"/> Always
specify profile in any `mvn` commands

:::
