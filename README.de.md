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

Aus diesem Grund eignet sich Kugelblitz für eine Microservice-Architektur. Weitere Details zum Design von Kugelblitz
finden Sie unter [![DeepWiki](https://img.shields.io/badge/DeepWiki-QubitPi%2FKugelblitz-blue.svg?style=for-the-badge&logo=data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACwAAAAyCAYAAAAnWDnqAAAAAXNSR0IArs4c6QAAA05JREFUaEPtmUtyEzEQhtWTQyQLHNak2AB7ZnyXZMEjXMGeK/AIi+QuHrMnbChYY7MIh8g01fJoopFb0uhhEqqcbWTp06/uv1saEDv4O3n3dV60RfP947Mm9/SQc0ICFQgzfc4CYZoTPAswgSJCCUJUnAAoRHOAUOcATwbmVLWdGoH//PB8mnKqScAhsD0kYP3j/Yt5LPQe2KvcXmGvRHcDnpxfL2zOYJ1mFwrryWTz0advv1Ut4CJgf5uhDuDj5eUcAUoahrdY/56ebRWeraTjMt/00Sh3UDtjgHtQNHwcRGOC98BJEAEymycmYcWwOprTgcB6VZ5JK5TAJ+fXGLBm3FDAmn6oPPjR4rKCAoJCal2eAiQp2x0vxTPB3ALO2CRkwmDy5WohzBDwSEFKRwPbknEggCPB/imwrycgxX2NzoMCHhPkDwqYMr9tRcP5qNrMZHkVnOjRMWwLCcr8ohBVb1OMjxLwGCvjTikrsBOiA6fNyCrm8V1rP93iVPpwaE+gO0SsWmPiXB+jikdf6SizrT5qKasx5j8ABbHpFTx+vFXp9EnYQmLx02h1QTTrl6eDqxLnGjporxl3NL3agEvXdT0WmEost648sQOYAeJS9Q7bfUVoMGnjo4AZdUMQku50McDcMWcBPvr0SzbTAFDfvJqwLzgxwATnCgnp4wDl6Aa+Ax283gghmj+vj7feE2KBBRMW3FzOpLOADl0Isb5587h/U4gGvkt5v60Z1VLG8BhYjbzRwyQZemwAd6cCR5/XFWLYZRIMpX39AR0tjaGGiGzLVyhse5C9RKC6ai42ppWPKiBagOvaYk8lO7DajerabOZP46Lby5wKjw1HCRx7p9sVMOWGzb/vA1hwiWc6jm3MvQDTogQkiqIhJV0nBQBTU+3okKCFDy9WwferkHjtxib7t3xIUQtHxnIwtx4mpg26/HfwVNVDb4oI9RHmx5WGelRVlrtiw43zboCLaxv46AZeB3IlTkwouebTr1y2NjSpHz68WNFjHvupy3q8TFn3Hos2IAk4Ju5dCo8B3wP7VPr/FGaKiG+T+v+TQqIrOqMTL1VdWV1DdmcbO8KXBz6esmYWYKPwDL5b5FA1a0hwapHiom0r/cKaoqr+27/XcrS5UwSMbQAAAABJRU5ErkJggg==)](https://deepwiki.com/QubitPi/Kugelblitz)

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
