---
sidebar_position: 1
title: Preparing for Local Development
---

This section discusses the one-time setup in order to develop Kugelblitz.

Installing Java & Maven (on Mac)
--------------------------------

```bash
brew update
brew install openjdk@17
```

At the end of the last command prompt, something like the below will show up:

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

Make sure to execute the `sudo ln -sfn`, `echo 'export PATH=...`, and the `export CPPFLAGS=` commands above

:::tip

Kugelblitz is built using maven, which uses a separate JDK version. This can be seen via `mvn -v`. If it's not JDK 17, we
should have Maven point to our JDK 17 using [JAVA_HOME](https://stackoverflow.com/a/2503679):

```bash
$ /usr/libexec/java_home
/Library/Java/JavaVirtualMachines/jdk-17.jdk/Contents/Home

$ export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk-17.jdk/Contents/Home
```

:::

If we see something similar after typing the command with the version flag below we're good to go

```bash
$ java --version
openjdk 17.0.10 2021-01-19
OpenJDK Runtime Environment (build 17.0.10+9)
OpenJDK 64-Bit Server VM (build 17.0.10+9, mixed mode)
```

Installing Docker Engine
------------------------

Kugelblitz has
[Docker-based integration tests](https://github.com/QubitPi/Kugelblitz/blob/master/src/test/java/org/qubitpi/kugelblitz/arango/ArangoControllerIT.java);
it also supports
[running template webserivce in Docker](https://github.com/QubitPi/Kugelblitz/blob/master/src/test/java/org/qubitpi/kugelblitz/DockerComposeIT.java).
Docker can be installed by following [this instruction](https://docker.qubitpi.org/desktop/setup/install/mac-install/)

Installing Code Style Checker
-----------------------------

Kugelblitz utilizes [pre-commit](https://pre-commit.com/) which sometimes doesn't give very informative
messages when its check fails in Kugelblitz's CI/CD. One approach to make sure pre-commit passes is to run it locally
by installing it first:

```console
pip3 install pre-commit
```

then run pre-commit check which would fix everything in one go:

```console
pre-commit run -a
```

Getting Source Code
-------------------

```bash
git clone git@github.com:QubitPi/Kugelblitz.git
cd Kugelblitz
```

### Syncing up with Kugelblitz's Code Styles with IntelliJ

For the moment, we have distilled the most important code style conventions with respect to Kugelblitz's code as IntelliJ
settings. If IntelliJ is used for IDE, we may import these code style settings by importing the
[Kugelblitz-Project-intellij-code-style.xml](https://github.com/QubitPi/Kugelblitz/blob/master/Kugelblitz-Project-intellij-code-style.xml)
file in the root of the repo. The setting for the project will appear as a new Scheme named "Kugelblitz-Project" under
IDE's __Editor__ -> __Code Style__ section.

Please also enable "remove unused imports" by __Editor__ -> __General__ -> __Auto Import__ -> __Optimize Imports on the
Fly__, which will automatically remove unused imports.

#### Troubleshooting

##### IntelliJ Cannot READ Resource File

We sometimes see errors when we run unit tests in IntelliJ, saying "some resource file" cannot be found. We know the
path is absolutely right. If this is the case, it's simply a IntelliJ issue which is solved by simply loading those
resources explicitly by telling IntelliJ where those resources are:

![Error loading intelliJ-find-resource.png](img/intelliJ-find-resource.png)

##### Tab Width

We use 4-space as tab. This can be configured at __Code Style__ -> __Java__ -> __Tabs and Indents__ with the following
settings:

- Tab size: 4
- Indent: 4
- Continuation indent: 8

If tabs still come out at 2 spaces when hitting TAB or Enter, not 4 spaces, try:

1. "Settings | Editor | Code Style" -- try disabling "Detect and use existing file indents for editing" in case if you
   have it enabled (it is by default). NOTE: re-opening file in editor may be required.
2. Do you have any .editorconfig files anywhere in the path of that file? Settings from .editorconfig
   ("Settings | Editor | Code Style") have priority (will overwrite) over your IDE settings.
