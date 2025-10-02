📆 platform-root

Bem-vindo ao projeto JStack Platform Root. Este repositório serve como base para todas as stacks tecnológicas utilizadas
na empresa, incluindo os ecossistemas Spring Boot, Quarkus e Micronaut. Ele fornece o gerenciamento centralizado de
dependências e plugins por meio de herança de POM no Maven.

📁 Estrutura do Projeto
platform-root/
├── platform-core/ # BOM centralizado e dependências compartilhadas
│ └── starter-atomic-spring-boot/ # Módulo inicial minimalista para Spring Boot
│
├── spring-stack/ # (Comentado) Módulos de orquestração/eventos para Spring
├── quarkus-stack/ # (Comentado) Módulos iniciais para Quarkus
├── micronaut-stack/ # (Comentado) Módulos iniciais para Micronaut

🚀 Objetivos Principais
• ✅ Centralizar o gerenciamento de dependências e versões via BOM (platform-core)
• ✅ Fornecer projetos iniciais reutilizáveis (ex: starter-atomic-spring-boot)
• ✅ Acelerar o desenvolvimento entre diferentes stacks (Spring, Quarkus, Micronaut)
• ✅ Simplificar a publicação utilizando o AWS CodeArtifact

🧰 Módulos

1. platform-root

Agregador pai que organiza todos os módulos de stack e gerencia o deploy para o CodeArtifact.

2. platform-core

Define os BOMs (Bill Of Materials) para Spring Boot, Quarkus, Micronaut e dependências compartilhadas:
• spring-boot-dependencies
• quarkus-bom
• micronaut-platform
• Kafka, Prometheus, Commons Lang, Jackson Nullable, JUnit 5, SpringDoc

3. starter-atomic-spring-boot

Projeto inicial minimalista para serviços Spring Boot, incluindo:
• Web, Validation, JPA, Actuator
• Liquibase, PostgreSQL
• OpenAPI via SpringDoc e geração de código via OpenAPI Generator
• Logs JSON com Logback (Logstash)

🛠 Como Usar

Pré-requisitos
• Java 21
• Maven 3.8+

Compilar os módulos

```bash
mvn clean install
```

Publicar no AWS CodeArtifact

```bash
mvn deploy
```

🔧 Geração de Código OpenAPI

O módulo starter-atomic-spring-boot inclui um perfil Maven para gerar código automaticamente a partir de um arquivo YAML
do OpenAPI:

```bash
mvn clean install -Popenapi-autogen
```

📦 Publicação no CodeArtifact

Todos os módulos estão configurados para publicar artefatos em:

https://jstack-148206343556.d.codeartifact.us-east-1.amazonaws.com/maven/br.com.jstack.platform/

🌐 Documentação
• 🌟 English (este arquivo)
• 🇧🇷 Português

---

📄 Licença

Proprietário - Uso Interno (JStack / Fundação Tech)