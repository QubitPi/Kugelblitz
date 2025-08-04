---
sidebar_position: 3
title: Tests ausführen
---

Unit-Tests
----------

Unit-Tests werden alle in [Groovy Spock](https://spock.qubitpi.org/) geschrieben, da es die Logik in einem viel
natürlicheren Englisch ausdrücken, private Methoden einfach testen und vieles mehr ermöglicht, was mit JUnit einfach
nicht möglich ist.

Der folgende Befehl führt Unit-Tests für ein bestimmtes Datenbank-Backend aus:

```bash
mvn clean test -P <Profil>
```

wobei `<Profil>` eines der folgenden ist:

- `arango`: mit ArangoDB-Backend: _Standardmäßig aktiviert_
- `neo4j`: mit Neo4J-Backend

:::tip

Weitere Informationen finden Sie im Abschnitt
[Profil](profile). <img src="https://github.com/QubitPi/QubitPi/blob/master/img/%E5%BF%83%E6%B5%B7.png?raw=true" width="70px" />

:::

Integrationstests
-----------------

Die folgenden Befehle führen sowohl Unit- als auch Integrationstests für ein bestimmtes Datenbank-Backend aus:

```bash
mvn clean verify -P <Profil>
```

`<Profil>` ist dabei identisch mit dem in [Unit-Tests](#unit-tests) verwendeten.
