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

- Java 25
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
spring.datasource.password=sua_senha
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

---

# 📷 Evidências de Execução

## Swagger funcionando
(Adicionar print)

## Banco de dados funcionando
(Adicionar print)

## Endpoints funcionando
(Adicionar print)

---

# 📄 Licença

Projeto acadêmico desenvolvido para a FIAP.
