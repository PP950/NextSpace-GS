# 🚀 NextSpace API

API REST desenvolvida em Java com Spring Boot para gerenciamento de satélites e sensores espaciais.

O projeto simula um sistema espacial capaz de monitorar equipamentos espaciais e sensores responsáveis pela captura de dados como temperatura, pressão e radiação.

---

# 👨‍💻 Integrantes

- Paulo Poças - RM556080
- André Luiz Fernandes de Queiroz - RM554503
- Rafael Bocchi - RM557603
- Rafael Federici de Oliveira - RM554736
- Marcos Vinícius da Silva Costa - RM555490

---

# 🛠️ Tecnologias Utilizadas

- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- Swagger/OpenAPI
- Lombok

---

# 📌 Funcionalidades

## Satélites
- Cadastrar satélites
- Listar satélites
- Buscar satélite por ID
- Atualizar satélite
- Deletar satélite

## Sensores
- Cadastrar sensores
- Listar sensores
- Buscar sensor por ID
- Atualizar sensor
- Deletar sensor

---

# 🧠 Conceitos Aplicados

- Programação Orientada a Objetos (POO)
- Herança
- Polimorfismo
- Encapsulamento
- DTO
- Enum
- Tratamento de Exceções
- API REST
- Relacionamento entre entidades
- Validação de dados

---

# 🗂️ Estrutura do Projeto

```text
src/main/java/com/nextspace
│
├── controller
├── dto
├── entity
├── exception
├── repository
├── service
```

---

# ⚙️ Como Executar o Projeto

## 1️⃣ Clonar o repositório

```bash
git clone git@github.com:PP950/NextSpace-GS.git
```

---

## 2️⃣ Configurar o banco de dados

Criar um banco MySQL com o nome:

```sql
nextspace_db
```

---

## 3️⃣ Configurar o application.properties

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/nextspace_db?createDatabaseIfNotExist=true
spring.datasource.username=root
spring.datasource.password=fiap
```

---

## 4️⃣ Executar o projeto

Rodar a aplicação pela IDE ou com:

```bash
./mvnw spring-boot:run
```

---

# 📖 Swagger

Após iniciar a aplicação:

```text
http://localhost:8080/swagger-ui.html
```

---

# 🛰️ Exemplo de JSON — Satélite

```json
{
  "nome": "Hubble-X",
  "fabricante": "NASA",
  "dataLancamento": "2025-10-15",
  "orbita": "Órbita Baixa da Terra",
  "versaoSoftware": "v3.2.1",
  "ativo": true
}
```

---

# 📡 Exemplo de JSON — Sensor

```json
{
  "tipo": "TEMPERATURA",
  "valorCaptado": "33°C",
  "descricaoLeitura": "Ondas solares detectadas",
  "ativo": true,
  "sateliteId": 1
}
```
# UML E FLUXOGRAMA
UML
<img width="591" height="449" alt="Diagrama sem nome drawio" src="https://github.com/user-attachments/assets/a6f4ff84-a68f-49bc-ada5-68c3cef98e33" />

FLUXOGRAMA
<img width="582" height="396" alt="Diagrama sem nome drawio(1)" src="https://github.com/user-attachments/assets/8b65ab25-11de-4bd8-bea7-34a0ab6fccc1" />

# 📷 Evidências de Execução

## Swagger funcionando
POST-SATELITE
<img width="1726" height="752" alt="image" src="https://github.com/user-attachments/assets/5c59d8bd-b267-4768-abca-fa792c8fa77a" />

GET-SATELITE
<img width="1726" height="752" alt="image" src="https://github.com/user-attachments/assets/8b3121e1-b859-4aa4-85eb-b827483a8feb" />

GET/ID-SATELITE
<img width="1740" height="692" alt="image" src="https://github.com/user-attachments/assets/bd858f3a-4587-4df4-b9e6-dd5b6c692e68" />

PUT-SATELITE
<img width="1745" height="716" alt="image" src="https://github.com/user-attachments/assets/9ffe8763-2e01-42fd-9996-8213e0dcbf5c" />

DELETE-SATELITE
<img width="1747" height="707" alt="image" src="https://github.com/user-attachments/assets/d2378adc-04a9-4183-8e19-5f15c4db583f" />


POST-SENSOR
<img width="1753" height="796" alt="image" src="https://github.com/user-attachments/assets/c60b1bf9-dbf5-4935-98a7-aa0b0d0736de" />

GET-SENSOR
<img width="1746" height="820" alt="image" src="https://github.com/user-attachments/assets/0a5c0b2d-0aa8-4362-ab01-9dd4bbd088ed" />

GET/ID-SENSOR
<img width="1751" height="760" alt="image" src="https://github.com/user-attachments/assets/6db2f9cd-a5f3-4f40-a880-5c2b00bcfeba" />

PUT-SENSOR
<img width="1763" height="796" alt="image" src="https://github.com/user-attachments/assets/6524786c-e971-4f77-84d5-706c6058894c" />

DELETE-SENSOR
<img width="1763" height="638" alt="image" src="https://github.com/user-attachments/assets/1f41ef28-7b45-4ec6-862c-e197638e8ed4" />

## Tratamento de Exceções da API
<img width="1818" height="766" alt="image" src="https://github.com/user-attachments/assets/71e89450-4f34-404b-a107-d6ed20b6c737" />

<img width="1818" height="766" alt="image" src="https://github.com/user-attachments/assets/c07012c1-f9ad-4871-bc81-e6f0355b6971" />





## Banco de dados funcionando
TABELA DE EQUIPAMENTO ESPACIAL
<img width="1873" height="766" alt="image" src="https://github.com/user-attachments/assets/374764d1-50fe-42b1-b088-84bf40823c34" />


TABELA DE SATELITE
<img width="1873" height="766" alt="image" src="https://github.com/user-attachments/assets/b57e488d-8620-4162-b4b0-8579803ac962" />

TABELA DE SENSOR
<img width="1873" height="766" alt="image" src="https://github.com/user-attachments/assets/2370d9d1-3e2b-4ea9-8986-32febfba484c" />

---

# 📄 Licença

Projeto acadêmico desenvolvido para a FIAP.
