-- alterar tabela 
ALTER TABLE ponto_tur ADD coordenada POINT;
DROP TABLE coordenada;

ALTER TABLE pais ADD interesse ENUM('0','1','2','3','4','5','6','7','8','9','10');
describe pais;

ALTER TABLE cidade ADD melhoresRest VARCHAR(300) DEFAULT'';
describe cidade;