#language: pt
Funcionalidade: exclusão Função Particular
@ExclusãoFunção
Esquema do Cenário:
	Dado que acesso ao menu fasetres e ao submenu função para exclusão
	Quando preencho o campo nome "<nome>" 
	E clico no botão buscar, excluir e confirmo a exclusão 
	Então recebo uma mensagem de exclusão de função "<mensagem>"
Exemplos:
	|nome           |mensagem                          |
	|Inclusão Função|A função foi excluída com sucesso.|
	

#/************************************** EXCLUSÃO GERAL **************************************/
@ExclusãoGeral
@ExclusãoFase3
Esquema do Cenário:
  Dado que acesso ao submenu função para exclusão
  Quando preencho o campo nome "<nome>" 
  E clico no botão buscar, excluir e confirmo a exclusão 
  Então recebo uma mensagem de exclusão de função "<mensagem>"
Exemplos:
  |nome           |mensagem                          |
  |Inclusão Função|A função foi excluída com sucesso.|