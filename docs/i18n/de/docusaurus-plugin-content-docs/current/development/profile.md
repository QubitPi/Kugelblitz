---
sidebar_position: 2
title: Profile
---

Kugelblitz bietet erstklassige Unterstützung für Graphdatenbanken als Backend und eine flexible Pipeline-Architektur,
die nahezu jedes Backend zur Datenspeicherung unterstützt. Eine Herausforderung dabei ist die Abhängigkeitsauflösung
sowohl zur Kompilier-als auch zur Laufzeit. Beispielsweise möchten wir bei ArangoDB als Backend keine
Neo4J-Abhängigkeiten kompilieren oder einfügen. Ebenso dürfen Neo4J-basierte Tests keine ArangoDB-basierten Testdateien
berühren.

Um dies zu gewährleisten, nutzt Kugelblitz
[Maven-Profile](https://maven.apache.org/guides/introduction/introduction-to-profiles.html). Indem wir festlegen, welche
Profile Kugelblitz kompilieren und ausführen soll, können wir steuern, welche Abhängigkeiten und Quelldateien in den
[Maven-Lebenszyklen](https://maven.apache.org/guides/introduction/introduction-to-the-lifecycle.html)) berücksichtigt
werden. Um beispielsweise Kugelblitz mit Neo4J als Hintergrunddatenbank zu erstellen, spezifizieren Sie alle
`mvn`-Befehle durch Profilierung mit `neo4j`:

```console
mvn clean verify -P neo4j
```

Im obigen Beispiel kompilieren und führen wir Tests mit allen Neo4J-Abhängigkeiten und zugehörigen Quellcodes aus, nicht
mit anderen.

Die verfügbaren Profile sind:

- __arango__: ArangoDB als exklusives Backend. _Standardmäßig aktiviert_
- __neo4j__: Neo4J-Datenbank als exklusives Backend
- __javadoc__: Zum Generieren von Javadoc aller Quelldateien aller Datenbanken: `mvn clean javadoc:javadoc -P javadoc`

Da die Standard-Persistenzdatenbank [ArangoDB](https://arango.qubitpi.org/) ist, übernehmen alle Maven-Befehle
die __exklusiven__ Abhängigkeiten und Quelldateien für ArangoDB. Das bedeutet:

– Maven-Abhängigkeiten und Konfigurationen anderer Datenbanken werden nicht in `mvn`-Aufrufen berücksichtigt.
– Quellcodes dieser Datenbanken werden nicht kompiliert.

:::info [Wichtig]

<img src="https://github.com/QubitPi/QubitPi/blob/master/img/Emilie-taking-notes.png?raw=true" width="70px"/> Geben Sie in allen `mvn`-Befehlen immer das Profil an.

:::
