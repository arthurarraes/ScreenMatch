
# ScreenMatch

## Descrição

O **ScreenMatch** começou como um projeto para consolidar meus conhecimentos em **Java**, explorando recursos como **Lambda Expressions**, **Stream API** e o uso do **Spring Framework**. Inicialmente, o projeto consumia a **API do IMDB**, permitindo filtragens, ordenações e exibições de informações sobre filmes diretamente no terminal.

Recentemente, evoluí o projeto para integrar **JPA** e **PostgreSQL**, aprimorando a persistência de dados e otimização das consultas. Com essa nova abordagem, o ScreenMatch agora armazena e consulta os dados de maneira mais eficiente, além de oferecer maior flexibilidade para novos desenvolvimentos.

## Tecnologias Utilizadas
- **Java** (versão 17 ou superior)
- **Spring Framework** (Spring Boot)
- **JPA** (Java Persistence API)
- **PostgreSQL**
- **Stream API**
- **Lambda Expressions**
- **Consumo de API externa** (IMDB API)

## Funcionalidades
- Consumo da API do IMDB para obter dados de filmes
- Armazenamento e consulta de dados com **JPA** e **PostgreSQL**
- Uso de **Stream API** para manipulação eficiente de coleções
- Implementação de **Lambda Expressions** para simplificar código
- Exibição das informações no terminal

## Linha do Tempo do Projeto
1. **Início**: O projeto começou com o consumo da API do IMDB e foco em melhorar o uso de **Lambda Expressions** e **Stream API** para manipulação de dados diretamente no terminal.
2. **Evolução**: A partir de agora, o projeto passou a integrar **JPA** para persistir os dados em **PostgreSQL**, o que possibilita otimizar as consultas e oferecer maior escalabilidade ao sistema.

## Como Executar o Projeto
### Pré-requisitos
- Java 17+
- Maven ou Gradle
- IDE (IntelliJ, VS Code, Eclipse, etc.)
- Banco de Dados PostgreSQL configurado localmente

### Passos
1. Clone o repositório:
   ```sh
   git clone https://github.com/arthurarraes/ScreenMatch.git
   ```
2. Acesse a pasta do projeto:
   ```sh
   cd ScreenMatch
   ```
3. Instale as dependências e compile o projeto:
   ```sh
   mvn clean install
   ```
4. Execute a aplicação no terminal:
   ```sh
   mvn exec:java
   ```

