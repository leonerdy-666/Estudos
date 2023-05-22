 #language: pt
Funcionalidade: exclusão Cargo Particular
@ExclusãoCargo
Esquema do Cenário:
	Dado que acesso ao menu fasetres e ao submenu cargo para exclusão
	Quando preencho o campo nome "<nome>" para exclusão do cargo
	Quando clico no botao buscar, excluir e confirmo a exclusão do cargo
	Então recebo uma mensagem de exclusão com sucesso "<mensagem>"
Exemplos:
	|nome          |mensagem                         |
	|Inclusão Cargo|O cargo foi excluído com sucesso.|
	
	
#/************************************** EXCLUSÃO GERAL **************************************/
@ExclusãoGeral
@ExclusãoFase3
Esquema do Cenário:
  Dado que acesso ao submenu cargo para exclusão
  Quando preencho o campo nome "<nome>" para exclusão do cargo
  Quando clico no botao buscar, excluir e confirmo a exclusão do cargo
  Então recebo uma mensagem de exclusão com sucesso "<mensagem>"
Exemplos:
  |nome          |mensagem                         |
  |Inclusão Cargo|O cargo foi excluído com sucesso.|