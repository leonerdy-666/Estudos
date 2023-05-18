#language: pt
Funcionalidade: exclusão Alteração Cargo 
@exclusãoAlteraçãoCargo
Esquema do Cenário:
	Dado que acesso ao menu fasetres e ao submenu cargo para exclusão para alteração
  Quando preencho o campo nome "<nome>" para exclusão do cargo para alteração
  Quando clico no botao buscar, excluir e confirmo a exclusão do cargo para alteração
  Então recebo uma mensagem de exclusão com sucesso "<mensagem>" para alteração
Exemplos:
	|nome           |mensagem                         |
	|Alteração Cargo|O cargo foi excluído com sucesso.|
	
	
#/************************************** EXCLUSÃO GERAL **************************************/
@ExclusãoAlteraçãoGeral
@exclusãoAlteraçãoFase3
Esquema do Cenário:
  Dado que acesso ao submenu cargo para exclusão para alteração
  Quando preencho o campo nome "<nome>" para exclusão do cargo para alteração
  Quando clico no botao buscar, excluir e confirmo a exclusão do cargo para alteração
  Então recebo uma mensagem de exclusão com sucesso "<mensagem>" para alteração
Exemplos:
  |nome           |mensagem                         |
  |Alteração Cargo|O cargo foi excluído com sucesso.|