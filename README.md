   <p align="center">
   <image alt="header-duck-main" src="https://github.com/Byte-Boost/Duck/assets/105757405/e10ffb2c-e59e-4517-8421-532f9e303a42"/>   
   </p>
<hr>    




  <p align="center">
     <a href ="#objetivo">Objetivo</a>  •
     <a href ="#visão-do-produto">Visão do produto</a>  • 
     <a href ="#cronograma">Cronograma</a>  • 
     <a href ="#backlog--entregas">Backlog/Entregas</a>  •
     <a href ="#requisitos">Requisitos</a>  •
     <a href ="#tecnologias">Tecnologias</a>  •
     <a href ="#como-usar">Como usar</a>   •
     <a href ="#equipe">Equipe</a>
   </p>




<span id="objetivo">
   
## :dart: Objetivo 
O objetivo do nosso produto é simplificar a extração de insights de documentos escritos. Usando inteligência artificial, capacitamos os usuários a gerar perguntas relevantes e obter respostas instantâneas, aprimorando a produtividade em estudos e análises.

<span id="visão-do-produto">
   
## :eye_speech_bubble: Visão do Produto   
Nosso produto é uma aplicação Java desktop que, através de inteligência artificial, permite aos usuários extrair perguntas e respostas de documentos PDF ou TXT, tornando a análise de conteúdo mais eficiente.

<span id="cronograma">  
   
## :spiral_calendar: Cronograma   

![Entregas-duck](https://github.com/Byte-Boost/Duck/assets/105757405/20adc7a6-2cf4-4ad3-99af-e8f9447cacb9)

<span id="backlog--entregas">
   
## :pushpin: Product Backlog
| Sprint | Requisitos | Prioridade | Descrição |
| --- | --- | --- | --- |
| 1 | Tela de carregamento de doc. funcional. | Alta | Uma interface gráfica para o carregamento do arquivo de texto a inserir no assistente virtual. |
| 1 | Tela em formato de chat. | Alta | Uma interface gráfica para inserir perguntas e obter respostas a respeito do arquivo carregado. |
| 1 | Integração da IA. | Alta | Aplicação da mecânica da IA com as telas de carregamento e chat para obter as respostas desejadas. |
| 1 | Registro e documentação via Github. | Alta | Documentar e registrar o processo de criação e desenvolvimento através do Github. |
| 1 | Product Backlog | Média | Desenvolver o backlog total do produto |
| 1 | Criação de protótipo Figma | Média | Criação de um protótipo via Figma para esquema visual do produto. |
| 1 | Tela de cadastro. | Baixa | Uma tela para cadastro de usuários. |
| 1 | Tela de login. | Baixa | Interface gráfica de login para o usuário acessar o assistente virtual. |
| 2 | Tela de registro de atividades. | Alta | Interface gráfica para visualizar o registro contendo usuário, data e nome do arquivo. |
| 2 | Banco de dados | Alta | Criação do banco de dados[(sem conexão) pensar na implementação e conexão |
| 2 | Conexão com Banco de dados | Alta | Será feita a conexão do banco de dados com todas as telas e funções que necessitam de tal aplicação. |
| 2 | Aperfeiçoamento da GUI(estilização) | Média | Aperfeiçoamento estético da interface gráfica. |
| 3 | Formatação dos textos de entrada | Alta | Identificar uma melhor maneira de formatar os textos de entrada para obter respostas mais acuradas. |
| 3 | Sistema de confirmação de e-mail | Média | Criar um sistema de confirmação de e-mail do usuário para que possibilite a recuperação de senha e ou o envio de informações. |
| 3 | Sistema de recuperação de senha | Média | Criar um sistema de recuperação de senha através do login e-mail. |
| 4 | Integração com aplicativo de mensagens | Alta | Realizar a integração do assistente com o aplicativo de mensagens Telegram. |
| 4 | Incrementos | Média | Sugestões da equipe para incremento da aplicação |

## 🎥 Video Apresentação
<strong>Para assistir a nossa apresentação clique no <a href="https://www.youtube.com/watch?v=88JKqxKlnaI">Link</a></strong>

  
   
## Sprint 2
| Tarefa | Prioridade | Status |
| --- | --- | --- |
| Desenvolvimento da tela de registro de atividades     | Alta | Entregue |
| Integração com o banco de dados | Alta | Entregue |
| Frontend tela de login | Média | Entregue |
| Frontend tela de cadastro | Média | Entregue |
| Frontend tela de carregamento de arquivos | Média | Entregue |
| Frontend tela de chat | Média | Entregue |
| Tela de cadastro. | Baixa | Entregue |
| Tela de login. | Baixa | Entregue |

<image alt="sprint2gif" src="https://github.com/Byte-Boost/Duck/assets/76211125/a2120cdf-8df0-4202-b9b3-61fcb2e6fd25"/>

</div>



## 📌 User Stories
| ID | SPRINT | US | ESTIMATIVA DE ESFORÇO EM HORAS | TASK | CRITÉRIO DE ACEITAÇÃO |
| --- | --- | --- | --- | --- | --- |
| US01 | 2 | EU, enquanto usuário administrador, desejo obter informações sobre o usuário atual, hora, data e nome do arquivo carregado através de uma interface gráfica | 3:00 | Desenvolver uma tela de registro de atividades. | A interface deve mostrar os dados de usuário, data, hora e nome do arquivo carregado. |
| US02 | 2 | EU, enquanto usuário administrador, desejo que a aplicação tenha um banco de dados conectado para armazenamento e registros uteis à aplicação. | 4:00 | Conectar o banco de dados às interfaces. | O banco de dados deve estar conectado às interfaces e respondendo às requisições do sistema. |
| US03 | 2 | EU, enquanto membro da equipe de desenvolvimento, desejo que o frontend das telas de login, cadastro, carregamento de arquivo, registro de atividades e de chat tenham uma identidade visual padronizada. | 10:00 | Padronizar a estética das interfaces gráficas. | As telas devem seguir uma identidade visual em padrão de cores, fontes e tamanho de botões. |
| US04 | 2 | EU, enquanto usuário, desejo poder retornar da página de chat à pagina de carregamento de arquivo. | 00:30 | Adicionar um botão de retorno de página. | O botão de retorno deve levar o usuário da página de chat a página de carregamento de arquivos. |
| US05 | 2 | EU, enquanto usuário administrador, desejo poder cadastrar usuários do sistema para registro e segurança. | 2:00 | Deixar a tela de cadastros funcional e ligada ao banco de dados. | A tela de cadastros deve estar devidamente operacional e funcional. |
| US06 | 2 | EU, enquanto usuário administrador, desejo que o acesso ao sistema seja feito apenas após um login de usuário cadastrado. | 2:00 | Deixar a tela de login funcional e ligada ao banco de dados. | A tela de login deve estar devidamente operacional e funcional. |

<span id="requisitos">

## :mag_right: Requisitos
<details>
   <summary>Funcionais:</summary>
   <ul>
      <li> Linguagem Java (Requisito Fatec);</li>
      <li> Aplicação Desktop Java (Requisito Fatec);</li>
      <li> Apresentação via Github;</li>
   <ul>
</details>
<details>
   <summary>Não funcionais:</summary>
   <ul>
      <li>Documentação via Github;</li>
      <li>Linguagem de programação Java;</li>
   </ul>
</details>




<span id="tecnologias">
   
## :desktop_computer:Tecnologias:
* <p>
   <img align="left" title="intellij-logo" height="30px" src="https://skillicons.dev/icons?i=java"/>
   Java
 </p>
 
* <p>
   <img align="left" title="mysql-logo" height="30px" src="https://skillicons.dev/icons?i=mysql"/>
   MySQL
 </p>
 
* <p>
   <img align="left" title="gradle-logo" height="30px" src="https://skillicons.dev/icons?i=gradle"/>
   Gradle
 </p>
 
* <p>
   <img align="left" title="langchain4j-logo" height="30px" src="https://avatars.githubusercontent.com/u/132277850?v=4"/>
   LangChain for Java
 </p>
 
 * <p>
   <img align="left" title="javafx-logo" height="30px" src="https://github.com/nininhosam/nininhosam/assets/76211125/5b22e9b0-5474-4366-8742-2b6545952951"/>
   JavaFX
 </p>


## :hammer_and_wrench:Ferramentas:
* <p>
   <img align="left" title="github-dark" height="30px" src="https://user-images.githubusercontent.com/76211125/227561942-1503fb74-eb8e-41d1-936e-bf22bc2d70eb.png#gh-dark-mode-only"/>
   <img align="left" title="github-light" height="30px" src="https://user-images.githubusercontent.com/76211125/227561896-a90cea71-7431-4908-ac8d-71fc02603eeb.png#gh-light-mode-only"/>
   GitHub
 </p>
 
* <p>
   <img align="left" title="intellij-logo" height="30px" src="https://skillicons.dev/icons?i=idea"/>
   IntelliJ
 </p>
 
* <p>
   <img align="left" title="figma-logo" height="30px" src="https://skillicons.dev/icons?i=figma"/>
   Figma
 </p>


<span id="equipe">
   
## :busts_in_silhouette:Equipe:
   ### ![Static Badge](https://img.shields.io/badge/Product_Owner-219ebc) - Diego Vitvicki :
   [<img src="https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white">](https://www.linkedin.com/in/diegovitvicki/)
   [<img src="https://img.shields.io/badge/GitHub-171515?style=for-the-badge&logo=github&logoColor=white">](https://github.com/dievit)

  
   ### ![Static Badge](https://img.shields.io/badge/Scrum_Master-red) - Gabriel Alves :
   [<img src="https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white">](https://www.linkedin.com/in/gabriel-alves-de-souza-5b7747267)
   [<img src="https://img.shields.io/badge/GitHub-171515?style=for-the-badge&logo=github&logoColor=white">](https://github.com/gabriel15asouza)
   

   ### ![Static Badge](https://img.shields.io/badge/Dev_Team-brightgreen) - Bianca Capelo : 
   [<img src="https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white">](
   https://www.linkedin.com/in/bianca-capelo-279b3b20a/)
   [<img src="https://img.shields.io/badge/GitHub-171515?style=for-the-badge&logo=github&logoColor=white">](https://github.com/BiaCapelo)



   ### ![Static Badge](https://img.shields.io/badge/Dev_Team-brightgreen) - Jaqueline Maria França Veloso da Silva : 
   [<img src="https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white">](
   https://www.linkedin.com/in/jaqueline-maria-fran%C3%A7a-veloso-silva/)
   [<img src="https://img.shields.io/badge/GitHub-171515?style=for-the-badge&logo=github&logoColor=white">](https://github.com/jaquemfvs)


   ### ![Static Badge](https://img.shields.io/badge/Dev_Team-brightgreen) - Jhuan Araújo : 
   [<img src="https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white">](
   https://www.linkedin.com/in/jhuan-araújo-de-souza-372233230)
   [<img src="https://img.shields.io/badge/GitHub-171515?style=for-the-badge&logo=github&logoColor=white">](https://github.com/TheRabbitDev)
   [<img src="https://img.shields.io/badge/Instagram-E4405F?style=for-the-badge&logo=instagram&logoColor=white">](https://www.instagram.com/_hollow.rabbit_)


   ###  ![Static Badge](https://img.shields.io/badge/Dev_Team-brightgreen) - Marcos Antonio : 
   [<img src="https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white">](
   https://www.linkedin.com/in/marcos-antonio-329449268)
   [<img src="https://img.shields.io/badge/GitHub-171515?style=for-the-badge&logo=github&logoColor=white">](https://github.com/Marcos-Antonio-Rodrigues-dos-Santos)


   ###  ![Static Badge](https://img.shields.io/badge/Dev_Team-brightgreen) - Markos Nunes : 
   [<img src="https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white">](https://linkedin.com/in/markos-vinícius-nunes-230448268)
   [<img src="https://img.shields.io/badge/GitHub-171515?style=for-the-badge&logo=github&logoColor=white">](https://github.com/MarkVN2)
   [<img src="https://img.shields.io/badge/Instagram-E4405F?style=for-the-badge&logo=instagram&logoColor=white">](https://www.instagram.com/markos_vn2)


   ### ![Static Badge](https://img.shields.io/badge/Dev_Team-brightgreen) - Vinícius Forcato : 
   [<img src="https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white">](https://www.linkedin.com/in/vinícius-felipe-forcato-789462268)
   [<img src="https://img.shields.io/badge/GitHub-171515?style=for-the-badge&logo=github&logoColor=white">](https://github.com/nininhosam)
   [<img src="https://img.shields.io/badge/Instagram-E4405F?style=for-the-badge&logo=instagram&logoColor=white">](https://www.instagram.com/nao_sou_felps)
