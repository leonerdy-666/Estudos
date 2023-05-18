#language: pt
Funcionalidade: exclusão ato normativo Particular
@ExclusãoAtoNormativo
Esquema do Cenário: 
 	Dado que acesso ao menu fase três submenu ato normativo para exclusão
 	Quando preencho o filtro descrição "<descricao>"
 	Quando clico no botão buscar, excluir e confirmar para excluisão do ato normativo
 	Então recebo uma mensagem de exclusão "<mensagem>"
Exemplos: 
 	|descricao             |mensagem                                 |
 	|Inclusão Ato Normativo|O ato normativo foi excluído com sucesso.|
 	
 	
#/************************************** EXCLUSÃO GERAL **************************************/
@ExclusãoGeral
@ExclusãoFase3
Esquema do Cenário: 
  Dado que acesso ao menu fase três submenu ato normativo para exclusão
  Quando preencho o filtro descrição "<descricao>"
  Quando clico no botão buscar, excluir e confirmar para excluisão do ato normativo
  Então recebo uma mensagem de exclusão "<mensagem>"
Exemplos: 
  |descricao             |mensagem                                 |
  |Inclusão Ato Normativo|O ato normativo foi excluído com sucesso.|