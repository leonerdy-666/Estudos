SHOW TABLES FROM guiatur;
DESCRIBE pais;

INSERT INTO pais (nome, continente, codigo)
VALUES
('brasil', 'America', 'BRA');

INSERT INTO pais
VALUES
('0','India','Ásia','IDN'),
('0','China','Ásia','CHI'),
('0','Japão','Ásia','JPN');

select * from pais;

DESCRIBE estado;

INSERT INTO estado (nome, sigla)
VALUES
('maranhão','MA'),
('São Paulo','SP'),
('Rio de Janeiro','RJ');

select * from estado;

INSERT INTO cidade (nome, populacao)
VALUES
('Sorocaba','700000'),
('Déli','26000000'),
('xangai','38000000');

select * from cidade;

INSERT INTO ponto_tur (nome, tipo)
VALUES
('quinzinho de barros','Intituição'),
('Parque Estadual do Jalapão','Atrativo'),
('Torre Eiffel','Atrativo');

Select * from ponto_tur;

-- alterar

update ponto_tur SET tipo = 'Atrativo'
WHERE id = 1;

Select * from ponto_tur;

-- deletar

delete from cidade where id = 1;

select * from cidade;

CREATE TABLE  IF NOT EXISTS linguagemPais (
id INT(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
codigoPais INT (11),
linguagem vARCHAR(30) NOT NULL DEFAULT '',
oficial ENUM('Sim', 'Não') NOT NULL DEFAULT 'Não'
);

DESCRIBE pais;

ALTER TABLE linguagempais ADD CONSTRAINT FK_linguagempais
FOREIGN KEY (codigopais) REFERENCES pais(id);

DESCRIBE linguagempais;

ALTER TABLE linguagempais MODIFY codigopais INT NOT NULL;






