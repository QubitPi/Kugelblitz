Kugelblitz Documentation
========================

> [!TIP]
>
> Read this in other languages:
>
> - [Deutsch](./README.de.md)

Another great way to contribute to Jetty is to help us write and maintain our documentation.

Kugelblitz follows a ["docs as code"](https://writethedocs.qubitpi.org/en/latest/guide/docs-as-code/) philosophy,
meaning we use the same tools to maintain and CI/CD our code and docs. As such, the docs are maintained directly within
the Kugelblitz codebase at `docs/`. This [documentation](http://kugelblitz.qubitpi.org/) is built using
[Docusaurus](https://docusaurus.qubitpi.org/), a modern static website generator.

Markdown
--------

Our docs are written in [Markdown](https://en.wikipedia.org/wiki/Markdown), a markup language for writing technical
content. Markdown supports many advanced features, such as robust linking across different documentation sets, while
remaining human-readable.

Although Kugelblitz takes advantage of many of these features, one doesn't need to be a Markdown expert to contribute to
our documentation. In fact, a couple of quick rules from out
[contributing guide](https://kugelblitz.qubitpi.org/docs/contributing/markdown-documentation-style-guide) is more than
enough to give you a head start.

Local Development
-----------------

In order to build the documentation locally, we first need to make sure Node is [installed](https://deb.nodesource.com/)
and then run the following command from the `doc` folder of Kugelblitz project:

```console
yarn
```

The docs are maintained as a separate unit within Kugelblitz, which means we can build the docs separately from the rest
of the project. Then we can use the following command to start a local development server which, when ready, opens up a
browser window automatically:

```console
yarn start
```

Note that most changes are reflected live without having to restart the server.

CI/CD
-----

```console
yarn build
```

This command generates static content into the `build` directory and can be served using any static contents hosting
service.

Internationalization
--------------------

When Docusaurus meta config has been updated, its corresponding i18n can be
[auto detected and configured](https://docusaurus.qubitpi.org/docs/i18n/tutorial#translate-plugin-data) with

```console
yarn write-translations --locale de
```

> [!IMPORTANT]
>
> One would still need to translate the content manually, such as translating the
> [auto generated `message` fields](i18n/de/docusaurus-plugin-content-docs/current.json)
