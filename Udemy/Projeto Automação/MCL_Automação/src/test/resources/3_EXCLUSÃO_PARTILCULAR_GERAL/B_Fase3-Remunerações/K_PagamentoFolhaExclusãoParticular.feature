#language: pt
Funcionalidade: exclusão Pagamento Folha
@ExclusãoPagamentoFolha
Esquema do Cenário:
	Dado que acesso ao menu fase três remuneração e ao submenu pagamento folha
	Quando preencho o campo competência "<competencia>", preencho o combobox agente público "<agentePublico>"
	E clico no botão buscar, excluir e no botão confirmar da tela pagamento folha
	Então recebo uma mensagem de sucesso na tela de pagamento folha "<mensagem>"
Exemplos:
	|competencia|agentePublico          |mensagem                             |
	|222000     |Inclusão Agente Público|O pagamento foi excluído com sucesso.|
	
	
#/************************************** EXCLUSÃO GERAL **************************************/
@ExclusãoGeral
@exclusãofase3Remunerações
Esquema do Cenário:
	Dado que acesso ao submenu pagamento folha
	Quando preencho o campo competência "<competencia>", preencho o combobox agente público "<agentePublico>"
  E clico no botão buscar, excluir e no botão confirmar da tela pagamento folha
  Então recebo uma mensagem de sucesso na tela de pagamento folha "<mensagem>"
Exemplos:
  |competencia|agentePublico          |mensagem                             |
  |222000     |Inclusão Agente Público|O pagamento foi excluído com sucesso.|