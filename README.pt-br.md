<p align="center">
  <img src="./.docs/banner.jpg" alt="LuminiStack Platform Root Banner" width="600"/>
</p>

<h1 align="center">LuminiStack Platform Root</h1>
<p align="center">
  Fundação para as stacks <b>Spring Boot</b>, <b>Quarkus</b> e <b>Micronaut</b>.<br/>
  Gerenciamento centralizado de dependências e plugins com Maven BOM.
</p>


<p align="center">
  <a href="https://adoptium.net/"><img src="https://img.shields.io/badge/Java-25-blue.svg?logo=java&style=flat-square"></a>
  <a href="https://maven.apache.org/"><img src="https://img.shields.io/badge/Maven-3.8+-orange.svg?logo=apachemaven&style=flat-square"></a>
  <a href="./LICENSE"><img src="https://img.shields.io/badge/License-MIT-green.svg?style=flat-square"></a>
</p>

---
## 📁 Estrutura do Projeto

``` text
.
├── core
├── micronaut-stack
│   └── starter-atomic-micronaut
├── security-core
├── quarkus-stack
│   └── starter-atomic-quarkus
└── spring-stack
    ├── starter-atomic-jpa-spring-boot
    ├── starter-atomic-neo4j-spring-boot
    └── starter-security-spring-boot
```

🚀 **Objetivos Principais**

-   Centralizar o gerenciamento de dependências e versões via BOM
    (**platform-core**)
-   Fornecer projetos inicializadores reutilizáveis
    (**starter-atomic-spring-boot**)
-   Acelerar o desenvolvimento em diferentes stacks (Spring, Quarkus,
    Micronaut)
-   Simplificar a publicação de artefatos no AWS CodeArtifact

🧰 **Módulos**

🔹 **platform-root**\
Agregador pai que organiza todos os módulos e gerencia o deploy para o
CodeArtifact.

🔹 **platform-core**\
Define os BOMs para Spring Boot, Quarkus e Micronaut, além de
dependências compartilhadas:\
• spring-boot-dependencies\
• quarkus-bom\
• micronaut-platform\
• Kafka, Prometheus, Commons Lang, Jackson Nullable, JUnit 5, SpringDoc

🔹 **starter-atomic-spring-boot**\
Projeto inicial minimalista para Spring Boot incluindo:\
• Web, Validation, JPA, Actuator\
• Liquibase + PostgreSQL\
• OpenAPI (SpringDoc + OpenAPI Generator)\
• Logging em JSON com Logback (Logstash)

🛠 **Uso**

**Pré-requisitos**\
\* Java 25\
\* Maven 3.8+

**Construir todos os módulos**

``` bash
mvn clean install
```

**Publicar no AWS CodeArtifact**

``` bash
mvn deploy
```

**Gerar Código a partir do OpenAPI**\
O módulo `starter-atomic-spring-boot` inclui um perfil Maven para gerar
automaticamente código a partir de um arquivo YAML OpenAPI:

``` bash
mvn clean install -Popenapi-autogen
```

Isso gera modelos, interfaces de controladores e classes de configuração
em\
`target/generated-sources/openapi`.

📦 **Repositório de Artefatos**\
Os módulos serão publicados no repositório CodeArtifact configurado:\
https://jstack-148206343556.d.codeartifact.us-east-1.amazonaws.com/maven/br.com.jstack.platform/

📄 **Licença**\
Este projeto está licenciado sob a Licença MIT -- veja o arquivo LICENSE
para mais detalhes.
