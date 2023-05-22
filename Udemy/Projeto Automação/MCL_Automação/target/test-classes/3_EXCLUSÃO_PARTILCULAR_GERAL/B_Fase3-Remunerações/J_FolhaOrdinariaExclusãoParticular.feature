#language: pt
Funcionalidade: exclusão Folha Ordinária
@ExclusãoFolhaOrdinaria
Esquema do Cenário:
	Dado que acesso ao menu fase três remunerações e ao submenu folha ordinária
	Quando seleciono o combobox situação
	E clico no botão buscar, excluir e clico no botão confirmar da tela folha ordinária
	Então recebo uma mensagem de sucesso na tela de folha ordinária "<mensagem>"
Exemplos:
	|mensagem                                   |
	|A folha ordinária foi excluída com sucesso.|
	
	
#/************************************** EXCLUSÃO GERAL **************************************/
@ExclusãoGeral
@exclusãofase3Remunerações
Esquema do Cenário:
	Dado que acesso ao submenu folha ordinária
	Quando seleciono o combobox situação
  E clico no botão buscar, excluir e clico no botão confirmar da tela folha ordinária
  Então recebo uma mensagem de sucesso na tela de folha ordinária "<mensagem>"
Exemplos:
  |mensagem                                   |
  |A folha ordinária foi excluída com sucesso.|