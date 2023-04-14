#banco  de dados
import sqlite3
conn = sqlite3.connect('aulaDB.db')
print(type(conn))

ddl_create = """
CREATE TABLE fornecedor(
id_fornecedor INTEGER NOT NULL PRIMARY AUTOINCREMENT,
nome_fornecedor TEXT NO NULL,
cnpj VARCHAR(18) NOT NULL,
cudade TEXT,
estado VARCHAR(9) NOT NULL,
cep VARCHAR (9) NOT NULL,
data_cadastro DATE NOT  NULL
);
"""

import sqlite3
conn = sqlite3.connect('aulaDB.db')
cursor = conn.cursor()
cursor.execute(ddl_create)
print(type (cursor))
print("Tabela criada!")
print("Descrição do cursor: ", cursor.description) 
print("Linhas afetadas: ", cursor.rowcount)
cursor.close()
conn.close()