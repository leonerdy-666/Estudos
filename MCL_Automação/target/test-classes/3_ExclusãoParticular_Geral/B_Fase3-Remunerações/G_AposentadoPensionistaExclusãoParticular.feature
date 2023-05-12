#language: pt
Funcionalidade: exclusão Aposentado Pensionista Particular
@ExclusãoAposentadoPensionista
Esquema do Cenário: 
	Dado que acesso ao menu fasetres remunerações e ao submenu aposentado pensionista 
	Quando preencho o campo cargo origem "<cargoOrigem>" 
	E clico no botao buscas, excluir e confirmo a exclusão do aposentado
	Então recebo uma mensagem de exclusão de aposentado pensionista "<mensagem>"
Exemplos:
	|cargoOrigem                    |mensagem                                          |
	|Inclusão Aposentado Pensionista|O aposentado/pensionista foi excluído com sucesso.|
	
	
#/************************************** EXCLUSÃO GERAL **************************************/
@ExclusãoGeral
@exclusãofase3Remunerações
Esquema do Cenário: 
	Dado que acesso ao menu fasetres remunerações e ao submenu aposentado pensionista 
	Quando preencho o campo cargo origem "<cargoOrigem>" 
  E clico no botao buscas, excluir e confirmo a exclusão do aposentado
  Então recebo uma mensagem de exclusão de aposentado pensionista "<mensagem>"
Exemplos:
  |cargoOrigem                    |mensagem                                          |
  |Inclusão Aposentado Pensionista|O aposentado/pensionista foi excluído com sucesso.|