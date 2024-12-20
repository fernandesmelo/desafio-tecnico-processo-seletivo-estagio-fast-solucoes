# Desafio Técnico Fast Soluções 
Desenvolvi este desafio na fase de Desafio Técnico para a oportunidade de estágio como Pessoa Desenvolvedora Fullstack na FlowUp, empresa Fast Soluções.

### 📝 Contextualização
Na FAST Soluções, trimestralmente, sempre às quintas-feiras das 16h às 17h, é
realizado um workshop sobre algum tema relacionado ao desenvolvimento de
software. Estes eventos são oportunidades para nossos colaboradores
aprenderem de forma descontraída e saírem um pouco da rotina. Apesar da
presença opcional, a maioria dos colaboradores comparece.
Recentemente, o comitê responsável pela organização desses workshops
expressou o desejo de aprofundar sua compreensão sobre os eventos, buscando
informações mais detalhadas. Com o objetivo de atender a essa demanda, a
proposta é utilizar métricas geradas para construir uma interface web. Essa
interface terá a capacidade de listar de maneira abrangente os detalhes de
cada workshop, atas de presença e a participação dos colaboradores. Essa
abordagem permitirá uma análise mais aprofundada e eficaz dos eventos,
proporcionando insights valiosos para o aprimoramento contínuo de nossas
iniciativas.

## ⚙️ Executando os Testes
Próximos passos...

## 🛠️ Construído com

<div style="display: inline-block"><br/>
  <img align="center" alt="html5" src="https://img.shields.io/badge/MySQL-00000F?style=for-the-badge&logo=mysql&logoColor=white" />
  <img align="center" alt="html5" src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" />
  <img align="center" alt="html5" src="https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white" />
  <img align="center" alt="html5" src="https://img.shields.io/badge/HTML5-E34F26?style=for-the-badge&logo=html5&logoColor=white" /> 
  <img align="center" alt="html5" src="https://img.shields.io/badge/CSS3-1572B6?style=for-the-badge&logo=css3&logoColor=white" />
  <img align="center" alt="html5" src="https://img.shields.io/badge/Bootstrap-563D7C?style=for-the-badge&logo=bootstrap&logoColor=white" />
  <img align="center" alt="html5" src="https://img.shields.io/badge/JavaScript-323330?style=for-the-badge&logo=javascript&logoColor=F7DF1E" />
</div><br/>

## 🔨 Tomada de Decisões

### Banco de Dados
* **Ferramentas Utilizadas:** Para modelagem, utilizei o brModelo para definir o modelo entidade-relacionamento (MER), enquanto o MySQL Workbench foi usado para gerar o modelo relacional (MR), gerar e visualizar o banco de dados.
* **Decisão:** Escolhi o MySQL como sistema de gerenciamento de banco de dados por sua facilidade de integração com o Spring Boot e sua ampla documentação.
### Backend
* **Linguagem e Framework:** Implementado em Java com o Spring Boot seguindo o padrão arquitetural MVC (Model-View-Controller), o que permite a separação de responsabilidades e facilita a manutenção e escalabilidade do código.
* **Dependências:**
  * Utilizei várias bibliotecas do Spring Boot para um desenvolvimento robusto e seguro, como:
    * **Spring Data JPA:** para operações simplificadas com o banco de dados.
    * **Spring Security:** para implementação de segurança.
    * **Springfox:** para documentação automática da API com Swagger.
  * **Lombok:** para reduzir a verbosidade do código com geração automática de getters, setters, e outros métodos utilitários.
  * **MySQL Connector:** para integração do projeto com o banco de dados MySQL.
  * **DevTools:** para agilizar o desenvolvimento com auto-reload.
### Frontend
* **Tecnologias Utilizadas:** Construí a interface utilizando HTML, CSS com Bootstrap para estilos responsivos, e JavaScript para adicionar funcionalidades interativas.
**Decisão:** O Bootstrap foi escolhido para acelerar o desenvolvimento do front-end com estilos pré-definidos e para garantir uma interface responsiva sem a necessidade de desenvolver uma estrutura de CSS personalizada do zero.
### Ferramentas e Estrutura do Projeto
* **Gerenciamento de Dependências:** Utilizamos o Maven para facilitar a configuração e gerenciamento de dependências do projeto Java.
* **Estrutura do Código:** O projeto segue o padrão de diretórios do Spring Boot no backend e a organização de pacotes foi estruturada de forma modular em controle, serviços e repositórios para garantir um fluxo claro e desacoplado dos componentes.

## 👨🏽‍💻 Versão das Tecnologias

* MySQL Workbench 0.8
* Java 23.0.1
* Spring 3.3.5
* HTML5
* CSS3
* Bootstrap 4.5.2
* JavaScript ECMAScript 6 (ES6)

## ✒️ Autor

* **Laércio Fernandes** - [LinkedIn](https://www.linkedin.com/in/laercio-fernandes/)

## 🚀 Guia de Configuração do Projeto
Este guia fornece instruções passo a passo para baixar, instalar e configurar as ferramentas e tecnologias necessárias para o desenvolvimento deste projeto.

### 📋 Ferramentas

#### 1. Visual Studio Code (VSCode)
- **Download**: [Baixar VSCode](https://code.visualstudio.com/download)
- **Instalação**:
  1. Baixe o instalador para o seu sistema operacional (Windows, macOS, ou Linux).
  2. Siga as instruções de instalação fornecidas pelo instalador.
- **Configuração**:
  - Instale as extensões recomendadas:
    - **Prettier - Code Formatter**
    - **ESLint**
    - **Java Extension Pack** (para suporte ao Java)

#### 2. Google Chrome
- **Download**: [Baixar Google Chrome](https://www.google.com/chrome/)
- **Instalação**:
  1. Baixe o instalador para o seu sistema operacional.
  2. Execute o instalador e siga as instruções.

#### 3. BrModelo
- **Download**: [Baixar BrModelo](https://sourceforge.net/projects/brmodelo/)
- **Instalação**:
  1. Baixe o arquivo de instalação compatível com seu sistema operacional.
  2. Siga as instruções do instalador para configurar o BrModelo.

#### 4. MySQL Workbench
- **Download**: [Baixar MySQL Workbench](https://dev.mysql.com/downloads/workbench/)
- **Instalação**:
  1. Baixe a versão apropriada para o seu sistema operacional.
  2. Siga as instruções do instalador para concluir a instalação.
- **Configuração**:
  - Configure uma conexão local com o servidor MySQL. Se necessário, instale o [MySQL Server](https://dev.mysql.com/downloads/mysql/).

### 📋 Tecnologias

#### 1. SQL
- Para o uso de SQL, utilize o MySQL Workbench ou outro editor de banco de dados à sua escolha.

#### 2. Java JDK 23
- **Download**: [Baixar JDK 23](https://www.oracle.com/java/technologies/javase/jdk23-archive-downloads.html)
- **Instalação**:
  1. Baixe o instalador para o seu sistema operacional.
  2. Siga as instruções para instalar o JDK.
  3. Configure a variável de ambiente `JAVA_HOME` para o diretório de instalação do JDK.
  4. Adicione o diretório `bin` do JDK ao `PATH` do sistema.

#### 3. Spring Framework
- **Instalação**:
  1. Para criar um projeto Spring, você pode usar o [Spring Initializr](https://start.spring.io/).
  2. Configure o projeto com as dependências necessárias, como Spring Web e Spring Data JPA.
  3. Importe o projeto para o VSCode ou outra IDE de sua preferência.

#### 4. HTML, CSS e JavaScript
- Estes arquivos podem ser editados diretamente no VSCode.

#### 5. Bootstrap
- **Incorporação**:
  1. Adicione o link do Bootstrap ao seu arquivo HTML:
     ```html
     <link href="https://maxcdn.bootstrapcdn.com/bootstrap/5.3.0/css/bootstrap.min.css" rel="stylesheet">
     ```
  2. Para adicionar os scripts JavaScript do Bootstrap, inclua:
     ```html
     <script src="https://maxcdn.bootstrapcdn.com/bootstrap/5.3.0/js/bootstrap.bundle.min.js"></script>
     ```

### Rodando o Projeto

1. **Configuração do Banco de Dados**:
   - Use o MySQL Workbench para configurar o banco de dados e executar scripts SQL.

2. **Executando o Back-End (Java com Spring)**:
   - Abra o projeto Java no VSCode ou outra IDE.
   - Execute a aplicação usando a configuração de execução da IDE ou o comando:
     ```bash
     ./mvnw spring-boot:run
     ```

3. **Executando o Front-End**:
   - Abra o arquivo HTML principal no navegador Google Chrome.
   - Verifique se o layout e os scripts estão funcionando corretamente.

Agora você está pronto para começar!

