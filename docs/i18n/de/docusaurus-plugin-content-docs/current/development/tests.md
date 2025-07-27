---
sidebar_position: 3
title: Running Tests
---

Die folgenden Befehle führen sowohl Unit- als auch Integrationstests für ein bestimmtes Datenbank-Backend aus:

```bash
mvn clean verify -P <Profil>
```

wobei `<Profil>` eines der folgenden ist:

- `arango`: mit ArangoDB-Backend: _Standardmäßig aktiviert_
- `neo4j`: mit Neo4J-Backend

:::tip

Weitere Informationen finden Sie im Abschnitt
[Profil](profile). <img src="https://github.com/QubitPi/QubitPi/blob/master/img/%E5%BF%83%E6%B5%B7.png?raw=true" width="70px" />

:::
