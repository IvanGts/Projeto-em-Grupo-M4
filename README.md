# Valdisnei Media Catalog Service
Este é um serviço de catálogo de mídia chamado Valdisnei, que disponibiliza filmes, séries, músicas e outras mídias para os usuários. O projeto foi implementado usando React, Bootstrap, e Java com as frameworks Spring Boot e Spring Data JPA para persistência dos dados em um banco de dados MySQL.

## Configuração do ambiente
Certifique-se de que você tenha as seguintes ferramentas instaladas em seu sistema antes de prosseguir:

- Node.js
- NPM
- JDK 8 ou superior
- MySQL

## Configuração do banco de dados
Crie um banco de dados MySQL com o nome valdisnei e configure o arquivo application.properties com as seguintes informações de acesso:

```java

spring.datasource.url=jdbc:mysql://localhost:3306/<seu_database>
spring.datasource.username=<seu_username>
spring.datasource.password=<sua_senha>
Configuração do servidor
Abra a IDE IntelliJ IDEA e importe o projeto valdisnei-server.
Configure o JDK apropriado para o projeto.
Execute a classe ValdisneiApplication para iniciar o servidor Spring Boot.
O servidor será executado em http://localhost:8080.
```


## Configuração do cliente
Abra o terminal e navegue até a pasta client.

Execute o comando npm install para instalar as dependências.

Execute o comando npm run dev para iniciar o aplicativo React.

O aplicativo será executado em http://localhost:5173.


## Uso 
O aplicativo apresenta um formulário para adicionar novas mídias ao catálogo. As mídias são exibidas em uma tabela na página principal. É possível filtrar as mídias por tipo (filme, série, música) usando o menu suspenso na parte superior da página.


## Feito por alunos RESILIA/RD
<a href="https://github.com/IvanGtsl" title="Git Ivan">Ivan</a> 

<a href="https://github.com/izabelmafisa/" title="Git Izabel">Izabel</a>

<a href="https://github.com/Jhonny515" title="Git Jonatas">Jhonny</a> 

<a href="https://github.com/victorfaccioli" title ="Git Victor">Victor Faccioli</a>





## Ferramentas utilizadas:
<a href='https://postimg.cc/Z9sb2Ydq' target='_blank'><img src='https://i.postimg.cc/Z9sb2Ydq/kisspng-intellij-idea-jetbrains-integrated-development-env-5b9a70df9dd6c3-3468850615368480956465-rem.png' border='0' alt='kisspng-intellij-idea-jetbrains-integrated-development-env-5b9a70df9dd6c3-3468850615368480956465-rem'/></a>  <a href='https://postimg.cc/Tp0cZBCs' target='_blank'><img src='https://i.postimg.cc/Tp0cZBCs/java-original-wordmark-logo-icon-146459.png' border='0' alt='java-original-wordmark-logo-icon-146459'/> <a href='https://postimg.cc/grpDc3bn' target='_blank'><img src='https://i.postimg.cc/grpDc3bn/2300px-React-icon-svg.png' border='0' alt='2300px-React-icon-svg'/></a> <a href='https://postimg.cc/LnCBV7Y1' target='_blank'><img src='https://i.postimg.cc/LnCBV7Y1/file-type-vscode-icon-130084.png' border='0' alt='file-type-vscode-icon-130084'/></a>   <a href='https://postimg.cc/HjW7ZRS3' target='_blank'><img src='https://i.postimg.cc/HjW7ZRS3/imagem1.png' border='0' alt='imagem1'/></a>
