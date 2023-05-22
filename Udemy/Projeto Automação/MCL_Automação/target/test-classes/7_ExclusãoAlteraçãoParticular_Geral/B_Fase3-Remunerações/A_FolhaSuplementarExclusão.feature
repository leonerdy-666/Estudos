#language: pt
Funcionalidade: exclusão Folha Suplementar
@ExclusãoAlteraçãoFolhaSuplementar
Esquema do Cenário:
  Dado que acesso ao menu fase três remunerações e ao submenu folha suplementar para alteração
  Quando seleciono o combobox situação da tela folha sumplementar para alteração
  E clico no botão buscar, excluir e confirmar da tela folha suplementar para alteração
  Então recebo uma mensagem de sucesso na tela folha suplementar "<mensagem>" para alteração
Exemplos: 
  |mensagem                                     |
  |A folha suplementar foi excluída com sucesso.|
	
	
#/************************************** EXCLUSÃO GERAL **************************************/
@exclusãoAlteração
@exclusãoAlteraçãoFase3Remunerações
Esquema do Cenário:
  Dado que acesso ao submenu folha suplementar para exclusão alteração
  Quando seleciono o combobox situação da tela folha sumplementar para alteração
  E clico no botão buscar, excluir e confirmar da tela folha suplementar para alteração
  Então recebo uma mensagem de sucesso na tela folha suplementar "<mensagem>" para alteração
Exemplos: 
  |mensagem                                     |
  |A folha suplementar foi excluída com sucesso.|