# Java Template

[![Java CI with Gradle](https://github.com/CodaMC/java-template/actions/workflows/build.yml/badge.svg)](https://github.com/CodaMC/java-template/actions/workflows/build.yml)
[![Latest GitHub release](https://img.shields.io/github/v/release/CodaMC/java-template)](../../releases)
[![codecov](https://codecov.io/gh/CodaMC/java-template/branch/master/graph/badge.svg)](https://codecov.io/gh/CodaMC/java-template)
[![license](https://img.shields.io//github/license/CodaMC/java-template)](LICENSE)
[![Discord Shield](https://discordapp.com/api/guilds/1080829063981183170/widget.png?style=shield)](https://discord.gg/ddBXUeEcCU)

You can use this template to develop your own Java projects
using [Gradle](https://gradle.org).

* [Features](#features)
* [Quickstart](#quickstart)
  * [Installation](#installation)
  * [Usage](#usage)
* [Contributing](#contributing)

## Features

The template comes with a lot of features:

* Ready to use [**Gradle**](https://gradle.org/) configuration
* [**JaCoCo**](https://github.com/jacoco/jacoco) code coverage report with [**CodeCov.io**](https://codecov.io/)
* Automatic **changelog generation** based on [**conventional commits**](https://conventionalcommits.org/)
* [**GitHub Actions**](https://github.com/features/actions) workflow for [**Gradle**](https://gradle.org/) builds and tests
* Publishing of **artifacts** to [**GitHub Packages**](https://github.com/feature/packages)
* **Issue** and **PRs** templates
* **Contributing** and **Code of Conduct** guidelines

## Quickstart

### Installation

* Create a [**new GitHub repo**](https://github.com/CodaMC/java-template/generate) using this template.
* **Clone** this repository and open it in IntelIJ Idea.

### Usage

* **Update** the **gradle.properties**
  * `group`: your group (e.g.: org.codamc)
* **Update** the `root.projectName` inside **settings.gradle**.
* **Update** the **README.md** to fit your needs.
* **Delete** the **CHANGELOG.md**. It'll be generated after 1st release.
* **Profit!**

## Contributing

Please, read the [**CONTRIBUTING.md**](CONTRIBUTING.md)
and [**CODE_OF_CONDUCT.md**](CODE_OF_CONDUCT.md) before opening any **PRs** or **issues**.
