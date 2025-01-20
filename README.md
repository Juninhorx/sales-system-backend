# Sales System
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/Juninhorx/workshop-springboot3-jpa/blob/main/LICENSE) 

# Sobre o projeto

Sales System é uma aplicação back end construída seguindo o curso **Java COMPLETO Programação Orientada a Objetos + Projetos**, ministrado pelo [Nélio Alves (DevSuperior)](https://devsuperior.com.br "Site da DevSuperior").

A aplicação serve uma API REST para operações CRUD em um sistema de vendas. Ele gerencia usuários, que são os clientes do sistema, e pedidos, que contêm informações dos pedidos e estão vinculados aos usuários. Cada pedido inclui itens de pedido, que detalham os produtos contidos no pedido. Os produtos possuem informações específicas e são classificados em categorias. Além disso, a aplicação trata dados de pagamento relacionados aos pedidos e define os possíveis estados de um pedido através de uma enumeração de status.

## Modelo conceitual
![Modelo Conceitual](https://github.com/Juninhorx/repo-assets/blob/main/sales-system-backend/modelo-dominio-sales-system.png)

# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- JPA / Hibernate
- Maven
- H2 Database

# Como executar o projeto

Pré-requisitos: Java 17

```bash
# clonar repositório
git clone https://github.com/Juninhorx/sales-system-backend.git

# executar o projeto
./mvnw spring-boot:run
```
# Autor

Ricardo Xavier de Castro Junior

https://www.linkedin.com/in/ricardoxavierr
