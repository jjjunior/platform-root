<p align="center">
  <img src="./.docs/banner.jpg" alt="JStack Platform Root Banner" width="600"/>
</p>

<h1 align="center">LuminiStack Platform Root</h1>
<p align="center">
  Foundation for <b>Spring Boot</b>, <b>Quarkus</b>, and <b>Micronaut</b> stacks.<br/>
  Centralized dependency & plugin management with Maven BOM.
</p>

<p align="center">
  <a href="https://adoptium.net/"><img src="https://img.shields.io/badge/Java-25-blue.svg?logo=java&style=flat-square"></a>
  <a href="https://maven.apache.org/"><img src="https://img.shields.io/badge/Maven-3.8+-orange.svg?logo=apachemaven&style=flat-square"></a>
  <a href="./LICENSE"><img src="https://img.shields.io/badge/License-MIT-green.svg?style=flat-square"></a>
</p>

---

## 📁 Project Structure

```text
.
├── core
├── micronaut-stack
│   └── starter-atomic-micronaut
├── security-core
├── quarkus-stack
│   └── starter-atomic-quarkus
└── spring-stack
    ├── starter-atomic-jpa-spring-boot
    ├── starter-atomic-neo4j-spring-boot
    └── starter-security-spring-boot
```

🚀 Main Goals

* Centralize dependency and version management via BOM (platform-core)
* Provide reusable starter projects (starter-atomic-spring-boot)
* Accelerate development across stacks (Spring, Quarkus, Micronaut)
* Simplify artifact publishing to AWS CodeArtifact

🧰 Modules

🔹 platform-root

Parent aggregator that organizes all modules and handles deployment to CodeArtifact.

🔹 platform-core

Defines BOMs for Spring Boot, Quarkus, Micronaut, plus shared dependencies:
	• spring-boot-dependencies
	• quarkus-bom
	• micronaut-platform
	• Kafka, Prometheus, Commons Lang, Jackson Nullable, JUnit 5, SpringDoc

🔹 starter-atomic-spring-boot

Minimalist starter project for Spring Boot including:
    Web, Validation, JPA, Actuator
    Liquibase + PostgreSQL
    OpenAPI (SpringDoc + OpenAPI Generator)
    JSON Logging with Logback (Logstash)

🛠 Usage

Prerequisites
* Java 25
* Maven 3.8+

Build all modules

```bash
mvn clean install
```
Publish to AWS CodeArtifact
```bash
mvn deploy
```
Generate OpenAPI Code
The starter-atomic-spring-boot module includes a Maven profile to auto-generate code from a YAML OpenAPI file:
```bash
mvn clean install -Popenapi-autogen
```
This generates models, controller interfaces, and configuration classes under
target/generated-sources/openapi.

📦 Artifact Repository
This will deploy all modules to your specified CodeArtifact repository.
https://jstack-148206343556.d.codeartifact.us-east-1.amazonaws.com/maven/br.com.jstack.platform/

📄 License

This project is licensed under the MIT License - see the LICENSE file for details.I 