CREATE DATABASE  SuperGames;
use SuperGames;

CREATE TABLE Localizacao (
	Id INT PRIMARY KEY AUTO_INCREMENT,
    secao VARCHAR(50) NOT NULL,
    Prateleira INT(3) ZEROFILL NOT  NULL
    );
    
 CREATE TABLE jogo (
	Cod INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL,
    Valor DECIMAL(6, 2) NOT  NULL,
    Localizacao_Id INT(3) NOT NULL,
    FOREIGN KEY (Localizacao_Id)
		REFERENCES Localizacao (Id)
    );   
    
    INSERT Localizacao VALUES
    (0, "Guerra", "001"),
    (0, "Guerra", "002"),
    (0, "Aventura", "100"),
    (0, "Aventura", "101"),
    (0, "RPG", "150"),
    (0, "RPG", "151"),
    (0, "Plataforma 2D", "200"),
    (0, "Plataforma 2D", "201");
    
    INSERT jogo VALUES
    (0, "COD", "125.00", 1),
    (0, "BF 1", "150.00", 2),
    (0, "Zelda 1", "200.00", 3),
    (0, "Zelda2", "99.00", 4),
    (0, "Chrono", "205.00", 5),
    (0, "teste", "205.00", 7);
    
    INSERT jogo VALUES
    (0, "Super metroid", "205.00", 7),
    (0, "DKC2", "100.00", 8),
    (0, "ff 1", "120.00", 5),
    (0, "xenoblade", "199.00", 6);
    
   
    
    SELECT * FROM Localizacao;
    SELECT * FROM jogo;
    
    
    
    -- identificar o nome do jogo e a prateleira
    
    SELECT jogo.nome, Localizacao.prateleira
    FROM jogo INNER JOIN Localizacao
    ON Localizacao.id = jogo.Localizacao_id;
    
    -- identificar o nome dos jogos da seção de jogos de aventura
    
    SELECT jogo.nome, Localizacao.prateleira, Localizacao.secao
    FROM jogo INNER JOIN Localizacao
    ON Localizacao.id = jogo.Localizacao_id
    WHERE  secao = 'Aventura';
    
    -- identificar todas as seções e os respetivos nomes dos jogos,ordenando as seleções em ordem crescente pelo nome dos jogos
    
    SELECT jogo.nome, Localizacao.prateleira, Localizacao.secao
    FROM Localizacao LEFT JOIN jogo
    ON Localizacao.id = jogo.Localizacao_id
    ORDER BY jogo.nome ASC;
    
    -- agregação que retorne o menor preço
    
    SELECT jogo.nome, MIN(valor)
    FROM jogo
    WHERE jogo.valor = (SELECT MIN(valor) FROM jogo);
    
    -- agregação que retorne a media  de preço do jogos de guerra
    
    SELECT AVG(valor) AS "Media guerra"
    FROM jogo INNER JOIN Localizacao
    ON Localizacao.id = jogo.Localizacao_id
    WHERE Localizacao.secao = "Guerra";
    
    -- agregação que retorne a soma  de preço do jogos
    
    SELECT SUM(valor) AS "Total" FROM jogo;
    
	-- alterar jogos em promoção
    UPDATE jogo SET valor = valor * 0.5
    WHERE cod = 2;
    
    -- criar tabela promoção
    CREATE TABLE promocao(
    Promo INT(3) PRIMARY KEY AUTO_INCREMENT,
    Cod_jogo int(3) NOT NULL,
    FOREIGN KEY (Cod_jogo)
		REFERENCES Jogo (Cod)
        );
        
	-- inserir codigo em promoção
    INSERT promocao VALUES (0,1), (0,2);
    
    SELECT * FROM promocao;
    
    -- selecionar os jogos em promoção
    SELECT jogo.nome, jogo.valor
    FROM jogo
    WHERE jogo.cod IN(SELECT cod_jogo FROM promocao);
    
    -- selecionar os jogos que não estão em promoção
    SELECT jogo.nome, jogo.valor
    FROM jogo
    WHERE jogo.cod NOT IN (SELECT cod_jogo FROM promocao);
    
    -- SELECIONAR JOGO MAIS BARATO
    SELECT nome  AS 'mais barato'
    FROM jogo WHERE valor = SOME (SELECT MIN(valor) FROM jogo);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
