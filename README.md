# Financial Targets (Account)

Modulo responsável pela gestão das minhas contas bancarias, com informações de saldos, rendas atuais previstas e operações de entrada que forem ocorrendo em minhas contas. 

## 🛠 Tecnologias
- **Java 21**
- **Spring Boot**
- **Gradle 8.12.1**

## 📋 Requisitos
Antes de rodar a aplicação, certifique-se de que seu ambiente contém:

### 🔹 Pré-requisitos
- **Java 21** instalado e configurado no `PATH`.
- **Gradle 8.12.1** (opcional, pois o projeto usa o Wrapper do Gradle).
- **Git** instalado para clonar o repositório (opcional).

### 🔹 Dependências Internas
A aplicação utiliza as seguintes tecnologias e dependências gerenciadas pelo Gradle:
- **Spring Boot** (para criação do backend REST).
- **Spring Data JPA** (para persistência de dados).
- **Spring Web** (para expor os endpoints REST).
- **Spring Doc OpenAPI** (para documentação Swagger).

## 🚀 Instalação e Execução
### 🔹 Executando com IntelliJ IDEA
Se estiver usando o **IntelliJ IDEA**, basta importar o projeto como um projeto **Gradle** e executar a classe principal da aplicação.

### 🔹 Executando pela Linha de Comando
Caso não utilize o IntelliJ, é possível rodar a aplicação diretamente pelo terminal:

1. **Clone o repositório:**
   ```sh
   git clone <URL_DO_REPOSITORIO>
   cd <NOME_DO_PROJETO>
   ```
2. **Compile e construa o projeto usando Gradle:**
   ```sh
   ./gradlew build
   ```
3. **Execute a aplicação:**
   ```sh
   ./gradlew bootRun
   ```

A aplicação estará disponível em `http://localhost:8081`

## 📌 Uso
- **Swagger Open UI:** [http://localhost:8081/swagger-ui/index.html](http://localhost:8081/swagger-ui/index.html)
- **Swagger API Docs:** [http://localhost:8081/api-docs](http://localhost:8081/api-docs)
- **H2 Database Console:** [http://localhost:8081/h2-console](http://localhost:8081/h2-console)

## 📂 Estrutura do Projeto
A estrutura do projeto segue uma abordagem bem definida, separando camadas de **aplicação, domínio, infraestrutura e apresentação**:

## 🤝 Contribuição
Se desejar contribuir, sinta-se à vontade para abrir um **Pull Request** com melhorias, correções de bugs ou novas funcionalidades.
