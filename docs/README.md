Kugelblitz Documentation
========================

> [!TIP]
>
> Read this in other languages:
>
> - [Deutsch](./README.de.md)

This website is built using [Docusaurus](https://docusaurus.io/), a modern static website generator.

Installation
------------

```console
yarn
```

Local Development
-----------------

```console
yarn start
```

This command starts a local development server and opens up a browser window. Most changes are reflected live without
having to restart the server.

Build
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
