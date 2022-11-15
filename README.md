## API Simple Bank

API de criação de contas e gerenciamento operações financeiras.
Onde cada operação realizada deve ser vinculada a um determinado cliente.

O sistema valida o tipo de operação realizada e adequa o saldo conforme esperado, sendo valor positivo para pagamentos ou saldo negativo para compras e saque.

### Tecnologias utilizadas

- Linguagens [Java 11]
- Frameworks [SpringBoot, SpringMVC, Maven]
- Banco de dados [MySQL]
- Documentação [Swagger]
- Testes unitários [JUnit 5]
- Coverage [Jacoco]

### Execução da API

Realizar o clone do projeto:

```sh
$ git clone https://github.com/bruna-iriz/simple-bank.git
```
Executar o clean e instalação do Maven na pasta do projeto:

```sh
$ mvn clean install
```
```sh
$ mvn clean package
```
```sh
$ docker-compose up --build
```

### Documentação da API

Endpoints:

| HTTP | ENDPOINT   | DESCRIÇÃO - STATUS |
| ------     | ------ | ------ |
|POST   |http://localhost:8080/accounts | Cadastrar uma nova conta de cliente. (OK) |
|GET    |http://localhost:8080/accounts/{id} | Buscar um cliente através do id.  (OK) |
|POST   |http://localhost:8080/transactions| Efetiva transações para um cliente existente. (OK) |

### Swagger

| Descrição |  Link |
| ------     | ------ |
| Swagger - Account | http://localhost:8080/swagger-ui.html#/account-controller |
| Swagger - Transactions | http://localhost:8080/swagger-ui.html#/transaction-controller |

- A coleção com as chamadas através do Postman está no diretório: ./simplebank/postman

### Coverage

Execute a linha de comando maven:
```sh
mvn clean verify
```

| Descrição | Link | Status |
| ------     | ------ | ------ |
| Relatório de cobertura de testes | target/site/jacoco/index.html | (testes em andamento)


### TODO Próximos Passos/Melhorias

- **API/Código:**
  - Melhorias no Tratamento de erros
  - Melhoria de logs
  - Melhoria da estrutura de camadas e design do projeto

  
- **TESTES | QUALIDADE:**
  - Arquitetura de código [ArchUnit]
  - Qualidade de código [SonarQube]
  - Criar novos cenários de testes e aumentar o coverage

- **CONTEINERIZÇÃO:**
  - Empacotamento do código de software e suas bilbilotecas (em andamento) [Docker]
  

> :construction: Projeto em construção :construction: