#language: pt
Funcionalidade: exclusão execução Geral
@ExclusãoExecução
Esquema do Cenário: 
	Dado que acesso ao menu fase quatro e ao submenu execução para exclusão
	Quando preencho os filtros código da licitação "<codigoLicitacao>", código do ajuste "<codigoAjuste>" e número da medição "<numeroMedicao>"
	Quando clico no botão buscar, no botão excluir e no botão confirmar 
	Então me é apresentado uma mensagem "<mensagem>" de sucesso na tela de execução 
Exemplos:
	|codigoLicitacao|codigoAjuste|numeroMedicao|mensagem                            |
	|2020000000221  |221         |1234         |A execução foi excluída com sucesso.|
	
	
#/************************************** EXCLUSÃO GERAL **************************************/
@ExclusãoGeral
@ExclusãoFase4
Esquema do Cenário: 
	Dado que acesso ao submenu execução para exclusão geral 
	Quando preencho os filtros código da licitação "<codigoLicitacao>", código do ajuste "<codigoAjuste>" e número da medição "<numeroMedicao>"
	Quando clico no botão buscar, no botão excluir e no botão confirmar 
	Então me é apresentado uma mensagem "<mensagem>" de sucesso na tela de execução 
Exemplos:
	|codigoLicitacao|codigoAjuste|numeroMedicao|mensagem                            |
	|2020000000221  |221         |1234         |A execução foi excluída com sucesso.|