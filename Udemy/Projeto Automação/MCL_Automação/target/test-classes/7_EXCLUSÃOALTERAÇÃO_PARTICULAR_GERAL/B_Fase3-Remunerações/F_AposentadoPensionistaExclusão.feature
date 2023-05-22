#language: pt
Funcionalidade: exclusão Aposentado Pensionista
@ExclusãoAlteracaoAposentadopensionista
Esquema do Cenário: 
	Dado que acesso ao menu fasetres remunerações e ao submenu aposentado pensionista para alteração
  Quando preencho o campo cargo origem "<cargoOrigem>" para alteração
  E clico no botao buscas, excluir e confirmo a exclusão do aposentado para alteração
  Então recebo uma mensagem de exclusão de aposentado pensionista "<mensagem>" para alteração
Exemplos:
	|cargoOrigem                    |mensagem                                          |
	|Inclusão Aposentado Pensionista|O aposentado/pensionista foi excluído com sucesso.|
	
	
#/************************************** EXCLUSÃO GERAL **************************************/
@ExclusãoAlteraçãoGeral
@exclusãoAlteraçãoFase3Remunerações
Esquema do Cenário: 
  Dado que acesso ao submenu aposentado pensionista para alteração
  Quando preencho o campo cargo origem "<cargoOrigem>" para alteração
  E clico no botao buscas, excluir e confirmo a exclusão do aposentado para alteração
  Então recebo uma mensagem de exclusão de aposentado pensionista "<mensagem>" para alteração
Exemplos:
  |cargoOrigem                    |mensagem                                          |
  |Inclusão Aposentado Pensionista|O aposentado/pensionista foi excluído com sucesso.|