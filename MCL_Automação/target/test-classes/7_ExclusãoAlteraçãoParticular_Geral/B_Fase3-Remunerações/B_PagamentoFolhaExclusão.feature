#language: pt
Funcionalidade: exclusão Pagamento Folha
@exclusãoAlteraçãoPagamentoFolha
Esquema do Cenário:
	Dado que acesso ao menu fase três remuneração e ao submenu pagamento folha para alteração
  Quando preencho o campo competência "<competencia>", seleciono o combobox agente público "<agentePublico>" para alteração
  E clico no botão buscar, excluir e no botão confirmar da tela pagamento folha para alteração
  Então recebo uma mensagem de sucesso na tela de pagamento folha "<mensagem>" para alteração
Exemplos:
  |agentePublico           |competencia|mensagem                             |
  |Alteração Agente Publico|22/2000    |O pagamento foi excluído com sucesso.|
	
	
#/************************************** EXCLUSÃO GERAL **************************************/
@exclusãoAlteração
@exclusãoAlteraçãoFase3Remunerações
Esquema do Cenário:
  Dado que acesso ao menu submenu pagamento folha para exclusão alteração
  Quando preencho o campo competência "<competencia>", seleciono o combobox agente público "<agentePublico>" para alteração
  E clico no botão buscar, excluir e no botão confirmar da tela pagamento folha para alteração
  Então recebo uma mensagem de sucesso na tela de pagamento folha "<mensagem>" para alteração
Exemplos:
  |agentePublico           |competencia|mensagem                             |
  |Alteração Agente Publico|222000     |O pagamento foi excluído com sucesso.|