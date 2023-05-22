#language: pt
Funcionalidade: exclusão Lotação Geral
@ExclusãoAlteraçãolotação
Esquema do Cenário: 
	Dado que acesso ao menu fase três ao submenu Lotação para alteração
  Quando preencho o combobox agente público "<agentePublico>", situação e preencho o campo data lotação para alteração
  E clico no botão buscar, excluir e confirmar da tela lotação para alteração
  Então recebo uma mensagem de sucesso na exclusão "<mensagem>" para alteração
Exemplos: 
	|agentePublico           |mensagem                           |
	|alteração agente publico|A lotação foi excluída com sucesso.|
	
	
#/************************************** EXCLUSÃO GERAL **************************************/
@exclusãoAlteração
@exclusãoAlteraçãoFase3
Esquema do Cenário: 
  Dado que acesso ao menu fase três ao submenu Lotação para alteração
  Quando preencho o combobox agente público "<agentePublico>", situação e preencho o campo data lotação para alteração
  E clico no botão buscar, excluir e confirmar da tela lotação para alteração
  Então recebo uma mensagem de sucesso na exclusão "<mensagem>" para alteração
Exemplos: 
  |agentePublico           |mensagem                           |
  |alteração agente publico|A lotação foi excluída com sucesso.|