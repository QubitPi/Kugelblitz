Kugelblitz
==========

![Java-Versionsabzeichen][Java-Versionsabzeichen]
[![API-Dokument-Badge]][API-Dokument-URL]
[![Docker Hub][Docker Pulls Badge]][Docker Hub URL]
[![Apache-Lizenz-Badge]][Apache-Lizenz, Version 2.0]

__Kugelblitz__ ist eine Spring-Boot-Anwendungsvorlage, mit der wir mit minimalem Aufwand einen REST-JSON-API-Webservice
einrichten können. Ziel ist die schnelle Produktion eines persistenten Webservices mit allen Elementen moderner
Microservices, wie z. B. CI/CD-Unterstützung.

Kugelblitz ist konzipiert für:

- nicht-geschäftliche Persistenzfunktionen, die Funktionen maximieren und gleichzeitig die konzeptionelle Komplexität
  minimieren (alles basiert auf bestehenden Best Practices; keine neuen Konzepte werden entwickelt)
- Performance-optimiertes Caching

Es ist nicht für folgende Zwecke konzipiert:

- Sicherheitsaspekte wie Authentifizierung oder Autorisierung
- jegliche Logik der Geschäftsebene

Aus diesem Grund eignet sich Kugelblitz für eine Microservice-Architektur.

✨ Funktionen
-------------

- __Explizite Schnittstelle__: Kugelblitz unterstützt speziell impersonationsfreie CRUD-Operationen.
- __Technologieunabhängige API__: In einer Welt des ständigen und schnellen Wandels benötigt Kugelblitz keine
  Integrationstechnologie, die vorgibt, welcher Technologie-Stack für Interaktionen verwendet werden soll.
- __Einfach__: Kugelblitz bietet Kunden volle Freiheit bei der Technologiewahl durch [![API-Dokument-Badge]][API-Dokument-URL]

🚀 Schnellstart
--------------

Starten Sie einen Service in Produktionsqualität unter
[kugelblitz.qubitpi.org](https://kugelblitz.qubitpi.org/de/docs/intro).

Lizenz
-------

Die Nutzung und Verbreitung von [Kugelblitz]() unterliegen der [Apache-Lizenz, Version 2.0].

[Apache-Lizenz-Badge]: https://img.shields.io/badge/Apache%202.0-F25910.svg?style=for-the-badge&logo=Apache&logoColor=white
[Apache-Lizenz, Version 2.0]: https://www.apache.org/licenses/LICENSE-2.0
[API-Dokument-Badge]: https://img.shields.io/badge/Open%20API-Swagger-85EA2D.svg?style=for-the-badge&logo=openapiinitiative&logoColor=white&labelColor=6BA539
[API-Dokument-URL]: https://springdoc.org/

[Docker Pulls Badge]: https://img.shields.io/docker/pulls/jack20191124/kugelblitz?style=for-the-badge&logo=docker&color=2596EC
[Docker Hub URL]: https://hub.docker.com/r/jack20191124/kugelblitz

[Java-Versionsabzeichen]: https://img.shields.io/badge/Java-17-brightgreen?style=for-the-badge&logo=OpenJDK&logoColor=white
