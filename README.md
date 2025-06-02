<h1 align="center"> Sistema de Controle de Estacionamento </h1>


<div align="center">
  <p align="center">
    O Sistema de Controle de Estacionamento é uma aplicação de gerenciamento de estacionamentos que utiliza tecnologias de ponta para proporcionar uma experiência eficiente e moderna. Desenvolvido com Vite, TypeScript, ReactJS, TailwindCSS e Material UI no Frontend, e Java com Spring Boot e Flyway no Backend, o sistema combina robustez e usabilidade.
  </p>
</div>


## Tecnologias

Este projeto foi desenvolvido com as seguintes tecnologias:

- <a href="https://vitejs.dev/"><img alt="Vite" title="Vite" src="https://img.shields.io/badge/ViteJS-646CFF?logo=vite&logoColor=white&style=for-the-badge"></a>
- <a href="https://reactjs.org/"><img alt="ReactJS" title="ReactJS" src="https://img.shields.io/badge/ReactJS-61DAFB?logo=react&logoColor=white&style=for-the-badge"></a>
- <a href="https://www.typescriptlang.org/"><img alt="TypeScript" title="TypeScript" src="https://img.shields.io/badge/TypeScript-3178C6?logo=typescript&logoColor=white&style=for-the-badge"></a>
- <a href="https://tailwindcss.com/"><img alt="TailwindCSS" title="TailwindCSS" src="https://img.shields.io/badge/TailwindCSS-38B2AC?logo=tailwind-css&logoColor=white&style=for-the-badge"></a>
- <a href="https://www.java.com/"><img alt="Java" title="Java" src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white"></a>
- <a href="https://www.red-gate.com/products/flyway/"><img alt="Flyway" title="Flyway" src="https://img.shields.io/badge/Flyway-ED2300?style=for-the-badge&logo=flyway&logoColor=white"></a>
- <a href="https://spring.io/projects/spring-boot"><img alt="Spring Boot" title="Spring Boot" src="https://img.shields.io/badge/Spring Boot-6DB33F?logo=spring-boot&logoColor=white&style=for-the-badge"></a>
- <a href="https://www.postgresql.org/"><img alt="PostgreSQL" title="PostgreSQL" src="https://img.shields.io/badge/PostgreSQL-336791?logo=postgresql&logoColor=white&style=for-the-badge"></a>

## Instalação

Clone o repositório

```bash
git clone https://github.com/victoriholc/EstacionamentoControle.git
```

Acesse a pasta do projeto no terminal/cmd

```bash
cd EstacionamentoControle
```

### Frontend

Vá para a pasta estacionamento-frontend

```bash
cd estacionamento-frontend
```

Instale as dependências

```bash
npm install
```

Execute a aplicação

```bash
npm run dev
```

A aplicação será aberta na porta:`3000` - acesse <a href="http://localhost:3000">http://localhost:3000</a>

### Backend

Vá para a pasta estacionamento-api

```bash
cd estacionamento-api
```

Execute a aplicação

```bash
./mvnw spring-boot:run
```

A aplicação será aberta na porta:`8080` - acesse <a href="http://localhost:8080">http://localhost:8080</a>

## Diagrama UML

A seguir, apresentamos o diagrama UML que ilustra a estrutura e as relações entre as principais entidades do Sistema de Controle de Estacionamento. Este diagrama oferece uma visão abrangente da organização do sistema, facilitando a compreensão das interações entre os diferentes componentes.

<p align="center">
    <img alt="Diagrama UML" title="Diagrama UML" src="assets/diagrama.png" width="100%">
</p>

## Licença

Este projeto está sob a licença MIT. Veja o arquivo <a href="LICENSE">`LICENSE`</a> para mais detalhes.