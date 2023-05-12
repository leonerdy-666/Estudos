#language: pt
Funcionalidade: exclusão folha suplementar
@ExclusãoFolhaSuplementar
Esquema do Cenário:
	Dado que acesso ao menu fase três remunerações e ao submenu folha suplementar
	Quando seleciono o combobox situação da tela folha sumplementar
	E clico no botão buscar, excluir e confirmar da tela folha suplementar
	Então recebo uma mensagem de sucesso na tela folha suplementar "<mensagem>"
Exemplos: 
	|mensagem                                     |
	|A folha suplementar foi excluída com sucesso.|
	
	
#/************************************** EXCLUSÃO GERAL **************************************/
@ExclusãoGeral
@exclusãofase3Remunerações
Esquema do Cenário:
	Dado que acesso ao submenu folha suplementar
	Quando seleciono o combobox situação da tela folha sumplementar
  E clico no botão buscar, excluir e confirmar da tela folha suplementar
  Então recebo uma mensagem de sucesso na tela folha suplementar "<mensagem>"
Exemplos: 
  |mensagem                                     |
  |A folha suplementar foi excluída com sucesso.|