# 📆 platform-root

Welcome to the **JStack Platform Root** project. This repository serves as the foundation for all technology stacks used at the company, including **Spring Boot**, **Quarkus**, and **Micronaut** ecosystems. It provides centralized dependency and plugin management through Maven POM inheritance.

---

## 📁 Project Structure

```text
platform-root/
├── platform-core/                         # Centralized BOM and shared dependencies
│   └── starter-atomic-spring-boot/       # Minimal starter module for Spring Boot
│
├── spring-stack/                         # (Commented) Orchestration/event modules for Spring
├── quarkus-stack/                        # (Commented) Initial modules for Quarkus
├── micronaut-stack/                      # (Commented) Initial modules for Micronaut
```

> You can uncomment desired modules in the `platform-root/pom.xml` file to activate them.

---

## 🚀 Main Goals

* ✅ Centralize dependency and version management via BOM (`platform-core`)
* ✅ Provide reusable starter projects (e.g., `starter-atomic-spring-boot`)
* ✅ Accelerate development across stacks (Spring, Quarkus, Micronaut)
* ✅ Simplify publishing using AWS CodeArtifact

---

## 🧰 Modules

### 1. `platform-root`

Parent aggregator that organizes all stack modules and handles deployment to CodeArtifact.

### 2. `platform-core`

Defines BOMs (Bill Of Materials) for Spring Boot, Quarkus, Micronaut, and shared dependencies:

* `spring-boot-dependencies`
* `quarkus-bom`
* `micronaut-platform`
* Kafka, Prometheus, Commons Lang, Jackson Nullable, JUnit 5, SpringDoc

### 3. `starter-atomic-spring-boot`

Minimalist starter project for Spring Boot services including:

* Web, Validation, JPA, Actuator
* Liquibase, PostgreSQL
* OpenAPI via SpringDoc and code generation via OpenAPI Generator
* JSON Logging with Logback (Logstash)

---

## 🛠 How to Use

### Prerequisites

* Java 21
* Maven 3.8+

### Build modules

```bash
mvn clean install
```

### Deploy to AWS CodeArtifact

```bash
mvn deploy
```

> Ensure your `~/.m2/settings.xml` contains the correct credentials and matches the `id` defined in `<distributionManagement>`.

---

## 🔧 OpenAPI Code Generation

The `starter-atomic-spring-boot` module includes a Maven profile to auto-generate code from an OpenAPI YAML file:

```bash
mvn clean install -Popenapi-autogen
```

> This generates models, controller interfaces, and configuration classes under `target/generated-sources/openapi`

---

## 📦 Publishing to CodeArtifact

All modules are configured to publish artifacts to:

```
https://jstack-148206343556.d.codeartifact.us-east-1.amazonaws.com/maven/br.com.jstack.platform/
```

---

## 🌐 Documentation

* [🌟 English (this file)](./README.md)
* [🇧🇷 Portuguese](./README.pt-br.md)

---

## 📄 License

Proprietary - Internal Use Only (JStack / Fundação Tech)
