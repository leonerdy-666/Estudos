#language: pt
Funcionalidade: exclusão Folha Ordinaria
@ExclusãoAlteraçãoFolhaOrdinaria
Esquema do Cenário:
	Dado que acesso ao menu fase três remunerações e ao submenu folha ordinária para alteração
  Quando seleciono o combobox situação para alteração
  E clico no botão buscar, excluir e clico no botão confirmar da tela folha ordinária para alteração
  Então recebo uma mensagem de sucesso na tela de folha ordinária "<mensagem>" para alteração
Exemplos:
	|mensagem                                   |
	|A folha ordinária foi excluída com sucesso.|
	
	
#/************************************** EXCLUSÃO GERAL **************************************/
@exclusãoAlteração
@exclusãoAlteraçãoFase3Remunerações
Esquema do Cenário:
  Dado que acesso ao submenu folha ordinária para exclusão alteração
  Quando seleciono o combobox situação para alteração
  E clico no botão buscar, excluir e clico no botão confirmar da tela folha ordinária para alteração
  Então recebo uma mensagem de sucesso na tela de folha ordinária "<mensagem>" para alteração
Exemplos:
  |mensagem                                   |
  |A folha ordinária foi excluída com sucesso.|