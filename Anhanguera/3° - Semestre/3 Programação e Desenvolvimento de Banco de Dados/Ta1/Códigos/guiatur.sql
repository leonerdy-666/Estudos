CREATE database guiatur
DEFAULT CHARSET = utf8
DEFAULT COLLATE = utf8_general_ci;

USE guiatur;

create table pais(
	id INT(11) PRIMARY KEY NOT NULL auto_increment,
    nome varchar(50) not null default '',
	continente ENUM('Ásia', 'America', 'Africa', 'Oceania', 'Antartida') NOT NULL ,
    codigo char(3) NOT NULL
);

create table estado(
	id INT PRIMARY KEY NOT NULL auto_increment,
    nome varchar(50) not null default '',
	sigla char(2) NOT NULL
);

create table cidade(
	id INT PRIMARY KEY NOT NULL auto_increment,
    nome varchar(50) not null default '',
	populacao int not null
);

CREATE TABLE ponto_tur(
	id INT(11) PRIMARY KEY NOT NULL auto_increment,
    nome VARCHAR(50) NOT NULL DEFAULT '',
    tipo ENUM('Atrativo','Serviço','Equipamento','Infraestrutura','Intituição') NOT NULL,
    publicado ENUM('Sim', 'Não') NOT NULL DEFAULT  'Não'
);

CREATE TABLE IF NOT EXISTS coordenada(
	latitude FLOAT(10,6),
    longitude FLOAT(10,6)
);


