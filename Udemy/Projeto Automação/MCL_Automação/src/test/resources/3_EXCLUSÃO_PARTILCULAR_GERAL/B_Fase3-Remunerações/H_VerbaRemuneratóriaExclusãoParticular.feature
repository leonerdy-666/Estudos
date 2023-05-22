#language: pt
Funcionalidade: exclusão Verba Remuneratória 
@exclusãoVerbaRemuneratoria
Esquema do Cenário:
	Dado que acesso ao menu fasetres remunerações e ao submenu verba remuneratória 
	Quando preencho o campo nome "<nome>" para exclusão da verba
	E clico no botão buscar, excluir e confirmar da tela verba remuneratória
	Então recebo uma mensagem de exclusão de verba remuneratória "<mensagem>"
Exemplos:
	|nome                        |mensagem                                       |
	|Inclusão Verba Remuneratória|A verba remuneratória foi excluída com sucesso.|
	
	
#/************************************** EXCLUSÃO GERAL **************************************/
@ExclusãoGeral
@exclusãofase3Remunerações
Esquema do Cenário:
	Dado que acesso ao submenu verba remuneratória
	Quando preencho o campo nome "<nome>" para exclusão da verba
  E clico no botão buscar, excluir e confirmar da tela verba remuneratória
  Então recebo uma mensagem de exclusão de verba remuneratória "<mensagem>"
Exemplos:
  |nome                        |mensagem                                       |
  |Inclusão Verba Remuneratória|A verba remuneratória foi excluída com sucesso.|