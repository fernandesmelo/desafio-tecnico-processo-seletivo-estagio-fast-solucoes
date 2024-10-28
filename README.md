# Guia de Configuração do Projeto

Este guia fornece instruções passo a passo para baixar, instalar e configurar as ferramentas e tecnologias necessárias para o desenvolvimento deste projeto.

## Ferramentas

### 1. Visual Studio Code (VSCode)
- **Download**: [Baixar VSCode](https://code.visualstudio.com/download)
- **Instalação**:
  1. Baixe o instalador para o seu sistema operacional (Windows, macOS, ou Linux).
  2. Siga as instruções de instalação fornecidas pelo instalador.
- **Configuração**:
  - Instale as extensões recomendadas:
    - **Prettier - Code Formatter**
    - **ESLint**
    - **Java Extension Pack** (para suporte ao Java)

### 2. Google Chrome
- **Download**: [Baixar Google Chrome](https://www.google.com/chrome/)
- **Instalação**:
  1. Baixe o instalador para o seu sistema operacional.
  2. Execute o instalador e siga as instruções.

### 3. BrModelo
- **Download**: [Baixar BrModelo](https://sourceforge.net/projects/brmodelo/)
- **Instalação**:
  1. Baixe o arquivo de instalação compatível com seu sistema operacional.
  2. Siga as instruções do instalador para configurar o BrModelo.

### 4. MySQL Workbench
- **Download**: [Baixar MySQL Workbench](https://dev.mysql.com/downloads/workbench/)
- **Instalação**:
  1. Baixe a versão apropriada para o seu sistema operacional.
  2. Siga as instruções do instalador para concluir a instalação.
- **Configuração**:
  - Configure uma conexão local com o servidor MySQL. Se necessário, instale o [MySQL Server](https://dev.mysql.com/downloads/mysql/).

## Tecnologias

### 1. SQL
- Para o uso de SQL, utilize o MySQL Workbench ou outro editor de banco de dados à sua escolha.

### 2. Java JDK 23
- **Download**: [Baixar JDK 23](https://www.oracle.com/java/technologies/javase/jdk23-archive-downloads.html)
- **Instalação**:
  1. Baixe o instalador para o seu sistema operacional.
  2. Siga as instruções para instalar o JDK.
  3. Configure a variável de ambiente `JAVA_HOME` para o diretório de instalação do JDK.
  4. Adicione o diretório `bin` do JDK ao `PATH` do sistema.

### 3. Spring Framework
- **Instalação**:
  1. Para criar um projeto Spring, você pode usar o [Spring Initializr](https://start.spring.io/).
  2. Configure o projeto com as dependências necessárias, como Spring Web e Spring Data JPA.
  3. Importe o projeto para o VSCode ou outra IDE de sua preferência.

### 4. HTML, CSS e JavaScript
- Estes arquivos podem ser editados diretamente no VSCode.

### 5. Bootstrap
- **Incorporação**:
  1. Adicione o link do Bootstrap ao seu arquivo HTML:
     ```html
     <link href="https://maxcdn.bootstrapcdn.com/bootstrap/5.3.0/css/bootstrap.min.css" rel="stylesheet">
     ```
  2. Para adicionar os scripts JavaScript do Bootstrap, inclua:
     ```html
     <script src="https://maxcdn.bootstrapcdn.com/bootstrap/5.3.0/js/bootstrap.bundle.min.js"></script>
     ```

## Rodando o Projeto

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

Agora você está pronto para começar o desenvolvimento!

