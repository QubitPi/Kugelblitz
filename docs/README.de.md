Kugelblitz-Dokumentation
========================

Diese Website wurde mit [Docusaurus](https://docusaurus.io/), einem modernen statischen Website-Generator, erstellt.

Installation
------------

```console
yarn
```

Lokale Entwicklung
------------------

```console
yarn start
```

Dieser Befehl startet einen lokalen Entwicklungsserver und öffnet ein Browserfenster. Die meisten Änderungen werden live
übernommen, ohne dass der Server neu gestartet werden muss.

Build
-----

```console
yarn build
```

Dieser Befehl generiert statische Inhalte im Verzeichnis „build“ und kann über jeden beliebigen Hosting-Dienst für
statische Inhalte bereitgestellt werden.

Internationalisierung
--------------------

Nach der Aktualisierung der Docusaurus-Metakonfiguration kann die entsprechende i18n-Datei mit folgendem Befehl
[automatisch erkannt und konfiguriert](https://docusaurus.qubitpi.org/docs/i18n/tutorial#translate-plugin-data) werden:

```console
yarn write-translations --locale de
```

> [!IMPORTANT]
>
> Die Inhalte müssen weiterhin manuell übersetzt werden, z. B.
> [die automatisch generierten Nachrichtenfelder]((i18n/de/docusaurus-plugin-content-docs/current.json)).
