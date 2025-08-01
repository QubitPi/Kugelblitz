---
sidebar_position: 1
title: Vorbereitung für die lokale Entwicklung
---

Dieser Abschnitt beschreibt die einmalige Einrichtung für die Entwicklung von Kugelblitz.

Java & Maven installieren (auf dem Mac)
---------------------------------------

```bash
brew update
brew install openjdk@17
```

Am Ende der letzten Eingabeaufforderung wird etwa Folgendes angezeigt:

```bash
For the system Java wrappers to find this JDK, symlink it with
  sudo ln -sfn ...openjdk@17/libexec/openjdk.jdk .../JavaVirtualMachines/openjdk-17.jdk

openjdk@17 is keg-only, which means it was not symlinked into /usr/local,
because this is an alternate version of another formula.

If you need to have openjdk@17 first in your PATH, run:
  echo 'export PATH=".../openjdk@17/bin:$PATH"' >> .../.bash_profile

For compilers to find openjdk@17 you may need to set:
  export CPPFLAGS="-I.../openjdk@17/include"
```

Führen Sie unbedingt die oben genannten Befehle `sudo ln -sfn`, `echo 'export PATH=...` und `export CPPFLAGS=` aus.

:::tip

Kugelblitz wird mit Maven erstellt, das eine separate JDK-Version verwendet. Dies kann über `mvn -v` überprüft werden.
Wenn es sich nicht um JDK 17 handelt, sollte Maven mit [JAVA_HOME](https://stackoverflow.com/a/2503679) auf unser JDK 17
verweisen:

```bash
$ /usr/libexec/java_home
/Library/Java/JavaVirtualMachines/jdk-17.jdk/Contents/Home

$ export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk-17.jdk/Contents/Home
```

:::

Wenn wir nach der Eingabe des Befehls mit dem unten stehenden Versionsflag etwas Ähnliches sehen, können wir loslegen.

```bash
$ java --version
openjdk 17.0.10 2021-01-19
OpenJDK Runtime Environment (Build 17.0.10+9)
OpenJDK 64-Bit-Server-VM (Build 17.0.10+9, gemischter Modus)
```

Docker Engine installieren
--------------------------

Kugelblitz bietet
[Docker-basierte Integrationstests](https://github.com/QubitPi/Kugelblitz/blob/master/src/test/java/org/qubitpi/kugelblitz/arango/ArangoControllerIT.java);
es unterstützt außerdem
[das Ausführen von Template-Webdiensten in Docker](https://github.com/QubitPi/Kugelblitz/blob/master/src/test/java/org/qubitpi/kugelblitz/DockerComposeIT.java).
Docker kann mit [dieser Anleitung](https://docker.qubitpi.org/desktop/setup/install/mac-install/) installiert werden.

Code Style Checker installieren
-------------------------------

Kugelblitz verwendet [pre-commit](https://pre-commit.com/), das manchmal wenig aussagekräftige Meldungen ausgibt, wenn
die Prüfung in Kugelblitzs CI/CD fehlschlägt. Um sicherzustellen, dass Pre-Commit erfolgreich ist, führen Sie es zunächst lokal aus:

```console
pip3 install pre-commit
```

Führen Sie anschließend die Pre-Commit-Prüfung aus, die alle Probleme auf einmal behebt:

```console
pre-commit run -a
```

Quellcode abrufen
-------------------

```bash
git clone git@github.com:QubitPi/Kugelblitz.git
cd Kugelblitz
```

### Kugelblitz-Codestile mit IntelliJ synchronisieren

Die wichtigsten Codestilkonventionen für Kugelblitz-Code haben wir hier als IntelliJ-Einstellungen zusammengefasst. Wird
IntelliJ als IDE verwendet, können diese Codestileinstellungen durch Importieren der Datei
[Kugelblitz-Project-intellij-code-style.xml](https://github.com/QubitPi/Kugelblitz/blob/master/Kugelblitz-Project-intellij-code-style.xml)
im Stammverzeichnis des Repositorys importiert werden. Die Projekteinstellung erscheint als neues Schema mit dem Namen
„Kugelblitz-Projekt“ im IDE-Bereich __Editor__ -> __Code Style__.

Aktivieren Sie außerdem die Option „Nicht verwendete Importe entfernen“ unter __Editor__ -> __General__ -> __Auto
Import__ -> __Optimize Imports on the Fly__. Dadurch werden nicht verwendete Importe automatisch entfernt.

#### Fehlerbehebung

##### IntelliJ kann Ressourcendatei nicht lesen

Bei Unit-Tests in IntelliJ tritt manchmal die Fehlermeldung „Eine Ressourcendatei kann nicht gefunden werden“ auf. Wir
wissen jedoch, dass der Pfad korrekt ist. In diesem Fall handelt es sich lediglich um ein IntelliJ-Problem. Dieses lässt
sich lösen, indem die Ressourcen explizit geladen werden. Geben Sie IntelliJ an, wo sich diese Ressourcen befinden:

![Fehler beim Laden von intelliJ-find-resource.png](img/intelliJ-find-resource.png)

##### Tabulatorbreite

Wir verwenden vier Leerzeichen als Tabulator. Dies kann unter __Code Style__ -> __Java__ -> __Tabs and Indents__ mit den
folgenden Einstellungen konfiguriert werden:

- Tabulatorgröße: 4
- Einzug: 4
- Fortsetzungseinzug: 8

Wenn Tabulatoren beim Drücken von TAB oder Eingabe immer noch mit 2 Leerzeichen und nicht mit 4 Leerzeichen angezeigt
werden, versuchen Sie Folgendes:

1. „Settings | Editor | Code Style“ - Deaktivieren Sie „Detect and use existing file indents for editing“, falls diese
   Option aktiviert ist (standardmäßig). HINWEIS: Möglicherweise müssen Sie die Datei erneut im Editor öffnen.
2. Befinden sich im Pfad dieser Datei .editorconfig-Dateien? Einstellungen aus .editorconfig
   („Settings | Editor | Code Style“) haben Vorrang vor Ihren IDE-Einstellungen (werden überschrieben).
