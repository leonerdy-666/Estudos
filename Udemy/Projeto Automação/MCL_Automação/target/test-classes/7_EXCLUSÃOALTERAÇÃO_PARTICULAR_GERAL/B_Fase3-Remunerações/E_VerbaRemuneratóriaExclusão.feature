#language: pt
Funcionalidade: exclusão Verba Remuneratória
@exclusãoAlteraçãoVerbaRemuneratória
Esquema do Cenário:
	Dado que acesso ao menu fasetres remunerações e ao submenu verba remuneratória para alteração
  Quando preencho o campo nome "<nome>" para exclusão da verba para alteração
  E clico no botão buscar, excluir e confirmar da tela verba remuneratória para alteração
  Então recebo uma mensagem de exclusão de verba remuneratória "<mensagem>" para alteração
Exemplos:
	|nome                         |mensagem                                       |
	|Alteração Verba Remuneratória|A verba remuneratória foi excluída com sucesso.|
	
	
#/************************************** EXCLUSÃO GERAL **************************************/
@ExclusãoAlteraçãoGeral
@exclusãoAlteraçãoFase3Remunerações
Esquema do Cenário:
  Dado que acesso ao submenu verba remuneratória para alteração
  Quando preencho o campo nome "<nome>" para exclusão da verba para alteração
  E clico no botão buscar, excluir e confirmar da tela verba remuneratória para alteração
  Então recebo uma mensagem de exclusão de verba remuneratória "<mensagem>" para alteração
Exemplos:
  |nome                         |mensagem                                       |
	|Alteração Verba Remuneratória|A verba remuneratória foi excluída com sucesso.|