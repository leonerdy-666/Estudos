#language: pt
Funcionalidade: exclusão Lotação Particular
@ExclusãoLotação
Esquema do Cenário: 
	Dado que acesso ao menu fase três ao submenu Lotação
	Quando preencho o combobox agente público "<agentePublico>", situação e preencho o campo data lotação
	E clico no botão buscar, excluir e confirmar da tela lotação
	Então recebo uma mensagem de sucesso na exclusão "<mensagem>"	
Exemplos: 
	|agentePublico          |dataLotacao|mensagem                           |
	|Inclusão Agente Público|04082020   |A lotação foi excluída com sucesso.|
	

#/************************************** EXCLUSÃO GERAL **************************************/
@ExclusãoGeral
@ExclusãoFase3
Esquema do Cenário: 
  Dado que acesso ao menu fase três ao submenu Lotação
  Quando preencho o combobox agente público "<agentePublico>", situação e preencho o campo data lotação
  E clico no botão buscar, excluir e confirmar da tela lotação
  Então recebo uma mensagem de sucesso na exclusão "<mensagem>" 
Exemplos: 
  |agentePublico          |dataLotacao|mensagem                           |
  |Inclusão Agente Público|04082020   |A lotação foi excluída com sucesso.|