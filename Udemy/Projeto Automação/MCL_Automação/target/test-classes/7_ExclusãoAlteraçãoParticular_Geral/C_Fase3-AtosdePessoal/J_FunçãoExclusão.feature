#language: pt
Funcionalidade: exclusão Alteração Função
@exclusãoAlteraçãoFunção
Esquema do Cenário:
	Dado que acesso ao menu fasetres e ao submenu função para exclusão para alteração
  Quando preencho o campo nome "<nome>" para alteração
  E clico no botão buscar, excluir e confirmo a exclusão para alteração
  Então recebo uma mensagem de exclusão de função "<mensagem>" para alteração
Exemplos:
	|nome 					 |mensagem                          |
	|Alteração Função|A função foi excluída com sucesso.|
	
	
#/************************************** EXCLUSÃO GERAL **************************************/
@exclusãoAlteração
@exclusãoAlteraçãoFase3
Esquema do Cenário:
  Dado que acesso ao submenu função para exclusão para alteração
  Quando preencho o campo nome "<nome>" para alteração
  E clico no botão buscar, excluir e confirmo a exclusão para alteração
  Então recebo uma mensagem de exclusão de função "<mensagem>" para alteração
Exemplos:
  |nome            |mensagem                          |
  |Alteração Função|A função foi excluída com sucesso.|