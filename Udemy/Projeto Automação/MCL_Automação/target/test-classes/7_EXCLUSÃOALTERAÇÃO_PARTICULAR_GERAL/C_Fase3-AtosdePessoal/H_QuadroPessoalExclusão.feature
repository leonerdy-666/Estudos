#language: pt
Funcionalidade: exclusão Alteração Quadro Pessoal 
@ExclusãoAlteraçãoQuadroPessoal
Esquema do Cenário:
	Dado que acesso ao menu fase três e ao submenu quadro pessoal para alteração
  Quando preencho o combobox cargo "<cargo>" para alteração
  E clico no botao buscar, excluir e confirmar para alteração
  Então recebo uma mensagem de exclusão do quadro pessoal "<mensagem>" para alteração
Exemplos:
	|cargo          |mensagem                                  |
	|Alteração Cargo|O quadro pessoal foi excluído com sucesso.|
	
	
#/************************************** EXCLUSÃO GERAL **************************************/
@ExclusãoAlteraçãoGeral
@exclusãoAlteraçãoFase3
Esquema do Cenário:
  Dado que acesso ao submenu quadro pessoal para alteração
  Quando preencho o combobox cargo "<cargo>" para alteração
  E clico no botao buscar, excluir e confirmar para alteração
  Então recebo uma mensagem de exclusão do quadro pessoal "<mensagem>" para alteração
Exemplos:
  |cargo          |mensagem                                  |
  |Alteração Cargo|O quadro pessoal foi excluído com sucesso.|