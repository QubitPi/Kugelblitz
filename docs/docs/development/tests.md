---
sidebar_position: 3
title: Running Tests
---

The following commands runs both unit and integration tests associated with one particular database backend:

```bash
mvn clean verify -P <profile>
```

where `<profile>` is one of the following:

- `arango`: with ArangoDB backend: _Activated by default_
- `neo4j`: with Neo4J backend

:::tip

Please refer to [Profile](profile) section for more
details. <img src="https://github.com/QubitPi/QubitPi/blob/master/img/%E5%BF%83%E6%B5%B7.png?raw=true" width="70px" />

:::
