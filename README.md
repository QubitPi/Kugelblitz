Kugelblitz
==========

![Java Version Badge][Java Version Badge]
[![GitHub Workflow Status]][GitHub Workflow URL]
[![Docker Hub][Docker Pulls Badge]][Docker Hub URL]
[![Apache License Badge]][Apache License, Version 2.0]

> [!TIP]
>
> Read this in other languages:
>
> - [Deutsch](./README.de.md)

__Kugelblitz__ is a Spring Boot application template that lets us set up REST JSON API webservice with minimal
effort. Its goal is to swiftly productionize a persistence webservice with all the elements of modern microservices such
as CI/CD support.

Kugelblitz is designed for:

- non-business persistence capabilities that maximizes functions while minimizes the conceptual complexities (everything
  is built on top of exiting best practices; no new concept invented)
- performance-wise caching

It __is not for__:

- security aspect, such as Authentication or Authorization
- any business layer logics

For this reason, Kugelblitz is suitable for a microservice architecture. More details about the design of Kugelblitz
can be found at [![DeepWiki badge]][DeepWiki URL]

✨ Features
-----------

- __Explicit interface__: Kugelblitz specifically serves impersonation-free CRUD operations
- __Tech agnostic API__: In a world of constant and rapid changes, Kugelblitz does not require integration technology
  that dictates what technology stack to use for interactions
- __Simple__: Kugelblitz allows clients full freedom in technology choice by [![API Doc Badge]][API Doc URL]

🚀 Quick Start
--------------

Start a production quality service at [kugelblitz.qubitpi.org](https://kugelblitz.qubitpi.org/docs/intro).

License
-------

The use and distribution terms for [Kugelblitz]() are covered by the [Apache License, Version 2.0].

[Apache License Badge]: https://img.shields.io/github/license/QubitPi/Antiqua?style=for-the-badge&logo=Apache&logoColor=white&labelColor=FF7777&color=00B8A9
[Apache License, Version 2.0]: https://www.apache.org/licenses/LICENSE-2.0
[API Doc Badge]: https://img.shields.io/badge/Open%20API-Swagger-75ce9f.svg?style=for-the-badge&logo=openapiinitiative&logoColor=white&labelColor=01a66f
[API Doc URL]: https://springdoc.org/

[DeepWiki badge]: https://img.shields.io/badge/DeepWiki-QubitPi%2FKugelblitz-2F2F2F.svg?style=for-the-badge&labelColor=FE6F26&logo=data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACwAAAAyCAYAAAAnWDnqAAAAAXNSR0IArs4c6QAAA05JREFUaEPtmUtyEzEQhtWTQyQLHNak2AB7ZnyXZMEjXMGeK/AIi+QuHrMnbChYY7MIh8g01fJoopFb0uhhEqqcbWTp06/uv1saEDv4O3n3dV60RfP947Mm9/SQc0ICFQgzfc4CYZoTPAswgSJCCUJUnAAoRHOAUOcATwbmVLWdGoH//PB8mnKqScAhsD0kYP3j/Yt5LPQe2KvcXmGvRHcDnpxfL2zOYJ1mFwrryWTz0advv1Ut4CJgf5uhDuDj5eUcAUoahrdY/56ebRWeraTjMt/00Sh3UDtjgHtQNHwcRGOC98BJEAEymycmYcWwOprTgcB6VZ5JK5TAJ+fXGLBm3FDAmn6oPPjR4rKCAoJCal2eAiQp2x0vxTPB3ALO2CRkwmDy5WohzBDwSEFKRwPbknEggCPB/imwrycgxX2NzoMCHhPkDwqYMr9tRcP5qNrMZHkVnOjRMWwLCcr8ohBVb1OMjxLwGCvjTikrsBOiA6fNyCrm8V1rP93iVPpwaE+gO0SsWmPiXB+jikdf6SizrT5qKasx5j8ABbHpFTx+vFXp9EnYQmLx02h1QTTrl6eDqxLnGjporxl3NL3agEvXdT0WmEost648sQOYAeJS9Q7bfUVoMGnjo4AZdUMQku50McDcMWcBPvr0SzbTAFDfvJqwLzgxwATnCgnp4wDl6Aa+Ax283gghmj+vj7feE2KBBRMW3FzOpLOADl0Isb5587h/U4gGvkt5v60Z1VLG8BhYjbzRwyQZemwAd6cCR5/XFWLYZRIMpX39AR0tjaGGiGzLVyhse5C9RKC6ai42ppWPKiBagOvaYk8lO7DajerabOZP46Lby5wKjw1HCRx7p9sVMOWGzb/vA1hwiWc6jm3MvQDTogQkiqIhJV0nBQBTU+3okKCFDy9WwferkHjtxib7t3xIUQtHxnIwtx4mpg26/HfwVNVDb4oI9RHmx5WGelRVlrtiw43zboCLaxv46AZeB3IlTkwouebTr1y2NjSpHz68WNFjHvupy3q8TFn3Hos2IAk4Ju5dCo8B3wP7VPr/FGaKiG+T+v+TQqIrOqMTL1VdWV1DdmcbO8KXBz6esmYWYKPwDL5b5FA1a0hwapHiom0r/cKaoqr+27/XcrS5UwSMbQAAAABJRU5ErkJggg==
[DeepWiki URL]: https://deepwiki.com/QubitPi/Kugelblitz
[Docker Pulls Badge]: https://img.shields.io/docker/pulls/jack20191124/kugelblitz?style=for-the-badge&logo=docker&logoColor=white&labelColor=5BBCFF&color=7EA1FF
[Docker Hub URL]: https://hub.docker.com/r/jack20191124/kugelblitz

[GitHub Workflow Status]: https://img.shields.io/github/actions/workflow/status/QubitPi/Kugelblitz/ci-cd.yaml?branch=master&logo=github&style=for-the-badge&label=CI/CD&labelColor=2088FF&color=00BD56
[GitHub Workflow URL]: https://github.com/QubitPi/Kugelblitz/actions/workflows/ci-cd.yaml

[Java Version Badge]: https://img.shields.io/badge/Java-17-957FEF?style=for-the-badge&logo=OpenJDK&logoColor=white&labelColor=7161ef
