---
sidebar_position: 4
title: ArangoDB
---

Starten Sie eine ArangoDB in Docker, falls eine lokale Entwicklungs- oder Debugsitzung dies erfordert:

```console
docker run -d -p 8529:8529 \
       -e ARANGO_ROOT_PASSWORD=root \
       -v arango-data:/var/lib/arangodb3 \
       -v arango-app:/var/lib/arangodb3-apps \
       --name arangodb --platform linux/arm64/v8 arangodb
```

Die ArangoDB-Webkonsole sollte unter http://localhost:8529 mit den Benutzernamen `root` und dem Passwort `root`
erreichbar sein.

:::tip

Weitere Informationen zur Navigation in der Arango-Weboberfläche finden Sie in der
[ArangoDB-Dokumentation](https://arango.qubitpi.org/stable/components/web-interface/)

:::

```console
git clone git@github.com:QubitPi/Kugelblitz.git
cd Kugelblitz
mvn clean package

export KUGELBLITZ_ARANGO_HOSTS=http://localhost:8529
export KUGELBLITZ_ARANGO_USERNAME=root
export KUGELBLITZ_ARANGO_PASSWORD=root

java -jar target/kugelblitz-0.0.1-SNAPSHOT.jar
```

Beachten Sie, dass `KUGELBLITZ_ARANGO_USERNAME` und `KUGELBLITZ_ARANGO_PASSWORD` der obigen
ArandoDB-Docker-Konfiguration entsprechen. Außerdem muss `KUGELBLITZ_ARANGO_HOSTS` entweder mit
"__http://__" oder "__https://__" beginnen.

Der Standardport ist 8080.

- Healthcheck: http://localhost:8080/actuator/health
- Swagger-UI: http://localhost:8080/swagger-ui/index.html
- Entität erstellen:

  ```console
  curl --location 'localhost:8080/arango/createDocument/mydatabase/mycollection' --header 'Content-Type: application/json' --data '{
  "myfield": "myvalue"
  }' -v
  ```
