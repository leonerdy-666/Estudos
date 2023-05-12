#language: pt
Funcionalidade: exclusão agente público Particular
@ExclusãoAgentePúblico
Esquema do Cenário:
  Dado que acesso ao menu fase três e ao submenu agente publico
  Quando preencho o filtro nome "<nome>"
  E clico no botão buscar, excluir e confirmar para exclusão do agente público
  Então recebo mensagem de sucesso "<mensagem>" da exclusão
Exemplos:
	|nome 			   	        |mensagem                                  |
	|Inclusão Agente Público|O agente público foi excluído com sucesso.|

	
#/************************************** EXCLUSÃO GERAL **************************************/
@ExclusãoGeral
@ExclusãoFase3
Esquema do Cenário:
  Dado que acesso ao submenu agente publico
  Quando preencho o filtro nome "<nome>"
  E clico no botão buscar, excluir e confirmar para exclusão do agente público
  Então recebo mensagem de sucesso "<mensagem>" da exclusão
Exemplos:
  |nome                   |mensagem                                  |
  |Inclusão Agente Público|O agente público foi excluído com sucesso.|