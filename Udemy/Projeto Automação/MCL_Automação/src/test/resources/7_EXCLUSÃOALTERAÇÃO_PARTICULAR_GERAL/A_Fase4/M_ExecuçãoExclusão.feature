#language: pt
Funcionalidade: exclusão execução Geral
@ExclusãoAlteraçãoExecução
Esquema do Cenário: 
	Dado que acesso ao menu fase quatro e ao submenu execução para exclusão geral para alteração
  Quando preencho os filtros código da licitação "<codigoLicitacao>", código do ajuste "<codigoAjuste>" e número da medição "<numeroMedicao>" para alteração
  Quando clico no botão buscar, no botão excluir e no botão confirmar para alteração
  Então me é apresentado uma mensagem "<mensagem>" de sucesso na tela de execução para alteração
Exemplos:
  |codigoLicitacao|codigoAjuste|numeroMedicao|mensagem                            |
  |2020000000221  |221         |1234         |A execução foi excluída com sucesso.|
	
	
#/************************************** EXCLUSÃO GERAL **************************************/
@ExclusãoAlteraçãoGeral
@ExclusãoAlteraçãoFase4
Esquema do Cenário: 
  Dado que acesso ao menu fase quatro e ao submenu execução para exclusão geral para alteração
  Quando preencho os filtros código da licitação "<codigoLicitacao>", código do ajuste "<codigoAjuste>" e número da medição "<numeroMedicao>" para exclusão alteração
  Quando clico no botão buscar, no botão excluir e no botão confirmar para alteração
  Então me é apresentado uma mensagem "<mensagem>" de sucesso na tela de execução para alteração
Exemplos:
  |codigoLicitacao|codigoAjuste|numeroMedicao|mensagem                            |
  |2020000000221  |221         |1234         |A execução foi excluída com sucesso.|
