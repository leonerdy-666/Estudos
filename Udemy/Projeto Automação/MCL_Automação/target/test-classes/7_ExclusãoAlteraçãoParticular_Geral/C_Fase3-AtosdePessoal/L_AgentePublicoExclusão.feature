#language: pt
Funcionalidade: exclusão Agente Público Geral
@ExclusãoAlteraçãoAgentePublico
Esquema do Cenário:
  Dado que acesso ao menu fase três e ao submenu agente publico para alteração
  Quando preencho o filtro nome "<nome>" para alteração
  E clico no botão buscar, excluir e confirmar para exclusão do agente público para alteração
  Então recebo mensagem de sucesso "<mensagem>" da exclusão para alteração
Exemplos:
	|nome            				 |mensagem                                  |
	|Alteração Agente Público|O agente público foi excluído com sucesso.|
	
	
#/************************************** EXCLUSÃO GERAL **************************************/
@exclusãoAlteração
@exclusãoAlteraçãoFase3
Esquema do Cenário:
  Dado que acesso ao submenu agente publico para alteração
  Quando preencho o filtro nome "<nome>" para alteração
  E clico no botão buscar, excluir e confirmar para exclusão do agente público para alteração
  Então recebo mensagem de sucesso "<mensagem>" da exclusão para alteração
Exemplos:
  |nome                    |mensagem                                  |
  |Alteração Agente Público|O agente público foi excluído com sucesso.|