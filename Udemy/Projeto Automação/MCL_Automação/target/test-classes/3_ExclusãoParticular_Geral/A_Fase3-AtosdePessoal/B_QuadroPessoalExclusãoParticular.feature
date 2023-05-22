#language: pt
Funcionalidade: exclusão Quadro Pessoal Particular
@ExclusãoQuadroPessoal
Esquema do Cenário:
	Dado que acesso ao menu fase três e ao submenu quadro pessoal
	Quando preencho o combobox cargo "<cargo>"
	E clico no botao buscar, excluir e confirmar
	Então recebo uma mensagem de exclusão do quadro pessoal "<mensagem>"
Exemplos:
	|cargo         |mensagem                                  |
	|Inclusão Cargo|O quadro pessoal foi excluído com sucesso.|
	
	
#/************************************** EXCLUSÃO GERAL **************************************/
@ExclusãoGeral
@ExclusãoFase3
Esquema do Cenário:
  Dado que acesso ao submenu quadro pessoal
  Quando preencho o combobox cargo "<cargo>"
  E clico no botao buscar, excluir e confirmar
  Então recebo uma mensagem de exclusão do quadro pessoal "<mensagem>"
Exemplos:
  |cargo         |mensagem                                  |
  |Inclusão Cargo|O quadro pessoal foi excluído com sucesso.|