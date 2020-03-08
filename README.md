MODELO API REST FULL, COM SWAGGER UI
REQUISITOS
•	MYSQL
Vamos abrir o MYSQL e criar o banco DBCLIENT usando o comando:
CREATE DATABASE DBCLIENT;
Fazendo isso vamos ao projeto no arquivo (application.properties) encontrado dentro da pasta (src>main>resources) e configuraremos os usuários e senha do seu banco de dados nos campos :
spring.datasource.username=root
spring.datasource.password=

Após isso devemos executar o projeto, para que o Hibernate crie as tabelas que serão utilizadas.
