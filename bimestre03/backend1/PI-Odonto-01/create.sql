
CREATE TABLE IF NOT EXISTS ENDERECO (ID int auto_increment primary key,RUA varchar(255),NUMERO varchar(255),CIDADE varchar(255),BAIRRO varchar(255));
CREATE TABLE IF NOT EXISTS PACIENTE (ID int auto_increment primary key,NOME varchar(255),SOBRENOME varchar(255),RG varchar(255),DATA_CADASTRO TIMESTAMP WITHOUT TIME ZONE,ENDERECO_ID int);
