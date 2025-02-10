# ScreenMatch

## Descrição

O **ScreenMatch** começou como um projeto para consolidar meus conhecimentos em **Java**, explorando recursos como **Lambda Expressions**, **Stream API** e o uso do **Spring Framework**. Inicialmente, o projeto consumia a **API do IMDB**, permitindo filtragens, ordenações e exibições de informações sobre filmes diretamente no terminal.

Recentemente, evoluí o projeto para uma **API REST** completa utilizando o **Spring Framework**, permitindo a comunicação eficiente entre o backend e aplicações frontend. Além disso, a aplicação agora integra **JPA** e **PostgreSQL**, aprimorando a persistência de dados e otimização das consultas.

O projeto contém tanto o **backend em Java** quanto o **frontend**, que deve ser iniciado separadamente após a execução do backend.

## Tecnologias Utilizadas
- **Java** (versão 17 ou superior)
- **Spring Boot** (Framework Spring)
- **JPA** (Java Persistence API)
- **PostgreSQL**
- **Stream API**
- **Lambda Expressions**
- **Consumo de API externa** (IMDB API)
- **DTO (Data Transfer Object)**
- **Tratamento de CORS**
- **HTML, CSS e JavaScript** para o frontend

## Funcionalidades
- **API REST** para gerenciamento de filmes
- **Consumo da API do IMDB** para obter dados de filmes
- **Armazenamento e consulta de dados com JPA e PostgreSQL**
- **Uso de DTOs para melhorar a estrutura da API**
- **Manipulação eficiente de coleções com Stream API**
- **Tratamento de erros e CORS para integração com o front-end**
- **Interface web para visualização dos filmes**

## Linha do Tempo do Projeto
1. **Fase Inicial**: Consumo da API do IMDB e manipulação de dados com **Lambda Expressions** e **Stream API** no terminal.
2. **Evolução**: Integração com **JPA e PostgreSQL**, otimizando o armazenamento e consulta de dados.
3. **Expansão para API REST**: Criação de endpoints para permitir a comunicação com o front-end, implementação de DTOs e tratamento de CORS.
4. **Adição do Frontend**: Desenvolvimento de uma interface web para consumir os dados da API.

## Como Executar o Projeto

### Pré-requisitos
- Java 17+
- Maven ou Gradle
- IDE (IntelliJ, VS Code, Eclipse, etc.)
- Banco de Dados PostgreSQL configurado localmente
- Servidor para rodar o frontend (exemplo: Live Server no VS Code)

### Passos
1. Clone o repositório:
   ```sh
   git clone https://github.com/arthurarraes/ScreenMatch.git
   ```
2. Acesse a pasta do projeto:
   ```sh
   cd ScreenMatch
   ```
3. Instale as dependências e compile o backend:
   ```sh
   mvn clean install
   ```
4. Execute o backend:
   ```sh
   mvn spring-boot:run
   ```

O backend estará disponível em `http://localhost:8080`.

5. Acesse a pasta do frontend:
   ```sh
   cd frontend
   ```
6. Inicie um servidor para rodar o frontend (por exemplo, usando Live Server no VS Code) na porta **5500**.
7. 
### Contato

Caso tenha dúvidas ou sugestões, sinta-se à vontade para entrar em contato através do meu [GitHub](https://github.com/arthurarraes) ou [LinkedIn](https://www.linkedin.com/in/arthurarraes). 
