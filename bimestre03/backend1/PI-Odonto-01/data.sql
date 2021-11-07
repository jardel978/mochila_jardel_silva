CREATE TABLE IF NOT EXISTS enderecos(
id_endereco INT AUTO_INCREMENT primary key,
rua_endereco VARCHAR(255),
numero_endereco VARCHAR(255),
cidade_endereco VARCHAR(255),
bairro_endereco VARCHAR(255),
estado_endereco VARCHAR(255));

CREATE TABLE IF NOT EXISTS pacientes(
id_paciente INT AUTO_INCREMENT NOT NULL PRIMARY KEY ,
nome_paciente VARCHAR(255) NOT NULL,
sobrenome_paciente VARCHAR(255),
rg_paciente VARCHAR(255),
data_cadastro_paciente TIMESTAMP WITHOUT TIME ZONE,
id_endereco INT,
CONSTRAINT id_endereco
FOREIGN KEY (id_endereco)
REFERENCES enderecos(id_endereco));

