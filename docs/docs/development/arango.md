---
sidebar_position: 4
title: ArangoDB
---

Spin up an ArangoDB in Docker in case a local dev or debug session mandates it:

```console
docker run -d -p 8529:8529 \
       -e ARANGO_ROOT_PASSWORD=root \
       -v arango-data:/var/lib/arangodb3 \
       -v arango-app:/var/lib/arangodb3-apps \
       --name arangodb --platform linux/arm64/v8 arangodb
```

The ArangoDB Web console should be accessible at http://localhost:8529 with the username and password being `root` and
`root`, respectively.

:::tip

For more documentation on navigating the Arango Web UI, please refer to
[ArangoDB documentation](https://arango.qubitpi.org/stable/components/web-interface/)

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

Note that the `KUGELBLITZ_ARANGO_USERNAME` and the `KUGELBLITZ_ARANGO_PASSWORD` is in accordance with the ArandoDB Docker
configuration above. In addition, `KUGELBLITZ_ARANGO_HOSTS` must start with either "__http://__" or "__https://__"

The default port is 8080.

- Healthcheck: http://localhost:8080/actuator/health
- Swagger UI: http://localhost:8080/swagger-ui/index.html
- Creating an entity:

  ```console
  curl --location 'localhost:8080/arango/createDocument/mydatabase/mycollection' --header 'Content-Type: application/json' --data '{
      "myfield": "myvalue"
  }' -v
  ```
