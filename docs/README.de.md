Kugelblitz-Dokumentation
========================

Eine weitere großartige Möglichkeit, Kugelblitz zu unterstützen, ist die Unterstützung bei der Erstellung und Pflege
unserer Dokumentation.

Kugelblitz verfolgt die Philosophie
[„Dokumente als Code“](https://writethedocs.qubitpi.org/en/latest/guide/docs-as-code/). Das bedeutet, dass wir dieselben
Tools für die Pflege und CI/CD unseres Codes und unserer Dokumentation verwenden. Die Dokumentation wird daher direkt in
der Kugelblitz-Codebasis unter `docs/` gepflegt. Diese Dokumentation wurde mit
[Docusaurus](https://docusaurus.qubitpi.org/), einem modernen statischen Website-Generator, erstellt.

Markdown
--------

Unsere Dokumentation ist in [Markdown](https://en.wikipedia.org/wiki/Markdown) verfasst, einer Auszeichnungssprache für
technische Inhalte. Markdown unterstützt viele erweiterte Funktionen, wie z. B. die robuste Verlinkung verschiedener
Dokumentationssätze, und bleibt dabei lesbar.

Kugelblitz nutzt zwar viele dieser Funktionen, aber man muss kein Markdown-Experte sein, um an unserer Dokumentation
mitzuwirken. Ein paar kurze Regeln aus unserem Leitfaden für Mitwirkende reichen völlig aus, um Ihnen den Einstieg zu
erleichtern.

Lokale Entwicklung
------------------

Um die Dokumentation lokal zu erstellen, müssen wir zunächst sicherstellen, dass Node
[installiert](https://nodesource.com/products/distributions) ist. Anschließend führen wir den folgenden Befehl aus dem
Ordner `docs/` des Kugelblitz-Projekts aus:

```console
yarn
```

Die Dokumentation wird in Kugelblitz als separate Einheit verwaltet, sodass wir sie unabhängig vom Rest des Projekts
erstellen können. Anschließend starten wir mit dem folgenden Befehl einen lokalen Entwicklungsserver. Sobald dieser
bereit ist, öffnet sich automatisch ein Browserfenster:

```console
yarn start
```

Die meisten Änderungen werden live übernommen, ohne dass der Server neu gestartet werden muss.

CI/CD
-----

```console
yarn build
```

Dieser Befehl generiert statische Inhalte im Verzeichnis `build` und kann über jeden beliebigen Hosting-Dienst für
statische Inhalte bereitgestellt werden.

Internationalisierung
---------------------

Nach der Aktualisierung der Docusaurus-Metakonfiguration kann die entsprechende i18n-Datei mit folgendem Befehl
[automatisch erkannt und konfiguriert](https://docusaurus.qubitpi.org/docs/i18n/tutorial#translate-plugin-data) werden:

```console
yarn write-translations --locale de
```

> [!IMPORTANT]
>
> Die Inhalte müssen weiterhin manuell übersetzt werden, z. B.
> [die automatisch generierten `message`-Feld](i18n/de/docusaurus-plugin-content-docs/current.json).
