# 🩺 CRUD de Médicos - Spring Boot

[![Java](https://img.shields.io/badge/Java-17-blue?logo=java)](https://www.oracle.com/java/)  
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5.5-brightgreen?logo=spring)](https://spring.io/projects/spring-boot)  
[![MySQL](https://img.shields.io/badge/MySQL-8.0-blue?logo=mysql)](https://www.mysql.com/)  
[![Lombok](https://img.shields.io/badge/Lombok-1.18.34-orange?logo=lombok)](https://projectlombok.org/)  

---

## Acesse a API online:  
👉 **https://medflow-api.onrender.com**

## ✨ Sobre o Projeto
Um **CRUD de Médicos** desenvolvido com **Spring Boot**, utilizando:

- JPA/Hibernate para persistência
- Validação de dados com Jakarta Validation
- DTOs para separar dados da entidade
- Soft delete de registros
- Paginação de resultados
- Render para hospedagem do banco de dados e da API.

---

## 🚀 Funcionalidades

- 📝 Cadastro de médicos  
- 🔄 Atualização de médicos  
- 📋 Listagem paginada  
- ❌ Exclusão com soft delete  
- 🏥 Gestão de endereço via Embedded  
- 🛠️ Validação automática de campos  

---

## 🗂️ Estrutura do Projeto

<details>
<summary>Clique para expandir</summary>

## 🗂️ Estrutura do Projeto

| Caminho                           | Descrição                              |
|-----------------------------------|------------------------------------------|
| `src/main/java`                   | Código-fonte Java                        |
| ├─ `com.pedrosantiago.api`        | Pacote base                              |
| │  ├─ `controllers`               | Classes REST Controllers                 |
| │  ├─ `models`                    | Entidades e DTOs                         |
| │  ├─ `repository`                | Interfaces de acesso ao banco (JPA)      |
| │  └─ `service`                   | Regras de negócio e lógica da aplicação  |
|                                   |                                          |
| `src/main/resources`              | Recursos do projeto                      |
| ├─ `application.properties`       | Configurações do Spring Boot             |

</details>

---

⚙️ **Endpoints**

| Método | Endpoint        | Descrição                      |
|--------|----------------|--------------------------------|
| POST   | /medicos       | Cadastra um novo médico        |
| GET    | /medicos       | Lista médicos (paginado)       |
| PUT    | /medicos       | Atualiza informações de um médico |
| DELETE | /medicos/{id}  | Remove um médico (soft delete) |

---


📝 Configuração do Banco


-No application.properties:

properties

spring.datasource.url=${DATABASE_URL}
spring.datasource.username=${DATABASE_USERNAME}
spring.datasource.password=${DATABASE_PASSWORD}

spring.datasource.driver-class-name=org.postgresql.Driver
spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect

spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=update

---

-Teste os endpoints com Postman ou Insomnia.

---
## 📬 Contato 
- **Email:** pedro.santigosiqueira@gmail.com
- **LinkedIn:** [Pedro Santiago](www.linkedin.com/in/pedro-santiago-838300277)
- **GitHub:** [pedrosantiago](https://github.com/Pedro1santiago)
