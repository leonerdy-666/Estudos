#language:pt
Funcionalidade: Alteração execução
@AlteraçãoExecução
Esquema do Cenário:
	Dado que acesso ao menu fase quatro e ao submenu execução para alteração 
	Quando preencho os filtros código da licitação "<codigoLicitacao>", código do ajuste "<codigoAjuste>" e número da medição "<numeroMedicao>" para alteração
	E clico no botão buscar e alterar para alteração 
	Quando preencho o combobox ajuste da licitação "<ajusteLicitacao>", seleciono os combobox situação do ajuste, seleciono a data de entrega do material ou início da execução de serviço obra para alteração
	E seleciono o combobox qual o regime de execução ou a forma de fornecimento do objeto contratual e seleciono o combobox trata-se de objeto decorrente de importação para alteração
	E seleciono o combobox a execução do contrato está de acordo com o cronograma físico-financeiro ou prazo de entrega pactuado para alteração
	E seleciono os comboboxes em caso de obra pública, ela está paralisada e motivo da paralisação "<motivoParalisacao>" para alteração
	E seleciono o comboboxe forma de recebimento, seleciono a data do recebimento, seleciono o combobox existe termo circunstanciado assinado pelas partes e existe vistoria que comprove a adequação do objeto aos termos contratuais para alteração 
	E seleciono o combobox houve inexecução do contrato, seleciono a data de abertura do procedimento administrativo, seleciono o comboboxe houve aplicação de sanções e preencho o campo motivo da inexecução do contrato "<motivoInexecucao>" para alteração
	E preencho os campos CPF do servidor responsável "<CPFServidorResponsaveis>", nome "<nome>" cargo "<cargo>" e clico no botão adicionar para alteração
	Quando clico no botão próximo da aba dados físicos e clico na aba corpo técnico para alteração
	E seleciono o combobox o objeto da licitação refere-se á prestação de serviços para alteração
	Quando clico no botão próximo da aba corpo técnico e aba conferência medição para alteração
	E seleciono o combobox houve conferência medição, preencho o campo número da medição "<numeroMedicao>" seleciono a data da conferência medição, preencho o campo percentual executado nessa medição "<percentualExecutadoMedicao>" e seleciono o combobox houve supressão de obra bens ou serviços? para alteração
	Quando clico no botão próximo da aba conferência medição e clico na aba dados financeiros para alteração
	E seleciono o combobox houve liquidação ou documento similar, numero empenho documento similar, seleciono a data da liquidação da despesa e preencho o campo valor da liquidação "<valorLiquidacao>" e clico no botão adicionar para alteração 
	E clico no botão salvar para alteração da execução
	Então recebo uma mensagem de alteração execução "<mensagem>"
Exemplos:
	|codigoLicitacao|codigoAjuste|numeroMedicao|ajusteLicitacao|motivoParalisacao|motivoInexecucao|CPFServidorResponsaveis|nome |cargo|numeroMedicao|percentualExecutadoMedicao|valorLiquidacao|mensagem                      |
	|2020000000221  |221         |1234         |221            |TESTE            |TESTE           |97915502042            |TESTE|TESTE|1234         |10                        |1500           |Execução alterada com sucesso.|
	
	
#/************************************** ALTERAÇÃO GERAL **************************************/
@AlteraçãoGeral
@AlteraçãoGeralFase4
Esquema do Cenário:
	Dado que acesso ao menu fase quatro e ao submenu execução para alteração 
	Quando preencho os filtros código da licitação "<codigoLicitacao>", código do ajuste "<codigoAjuste>" e número da medição "<numeroMedicao>" para alteração
	E clico no botão buscar e alterar para alteração 
	Quando preencho o combobox ajuste da licitação "<ajusteLicitacao>", seleciono os combobox situação do ajuste, seleciono a data de entrega do material ou início da execução de serviço obra para alteração
	E seleciono o combobox qual o regime de execução ou a forma de fornecimento do objeto contratual e seleciono o combobox trata-se de objeto decorrente de importação para alteração
	E seleciono o combobox a execução do contrato está de acordo com o cronograma físico-financeiro ou prazo de entrega pactuado para alteração
	E seleciono os comboboxes em caso de obra pública, ela está paralisada e motivo da paralisação "<motivoParalisacao>" para alteração
	E seleciono o comboboxe forma de recebimento, seleciono a data do recebimento, seleciono o combobox existe termo circunstanciado assinado pelas partes e existe vistoria que comprove a adequação do objeto aos termos contratuais para alteração 
	E seleciono o combobox houve inexecução do contrato, seleciono a data de abertura do procedimento administrativo, seleciono o comboboxe houve aplicação de sanções e preencho o campo motivo da inexecução do contrato "<motivoInexecucao>" para alteração
	E preencho os campos CPF do servidor responsável "<CPFServidorResponsaveis>", nome "<nome>" cargo "<cargo>" e clico no botão adicionar para alteração
	Quando clico no botão próximo da aba dados físicos e clico na aba corpo técnico para alteração
	E seleciono o combobox o objeto da licitação refere-se á prestação de serviços para alteração
	Quando clico no botão próximo da aba corpo técnico e aba conferência medição para alteração
	E seleciono o combobox houve conferência medição, preencho o campo número da medição "<numeroMedicao>" seleciono a data da conferência medição, preencho o campo percentual executado nessa medição "<percentualExecutadoMedicao>" e seleciono o combobox houve supressão de obra bens ou serviços? para alteração
	Quando clico no botão próximo da aba conferência medição e clico na aba dados financeiros para alteração
	E seleciono o combobox houve liquidação ou documento similar, numero empenho documento similar, seleciono a data da liquidação da despesa e preencho o campo valor da liquidação "<valorLiquidacao>" e clico no botão adicionar para alteração 
	E clico no botão salvar para alteração da execução
	Então recebo uma mensagem de alteração execução "<mensagem>"
Exemplos:
	|codigoLicitacao|codigoAjuste|numeroMedicao|ajusteLicitacao|motivoParalisacao|motivoInexecucao|CPFServidorResponsaveis|nome |cargo|numeroMedicao|percentualExecutadoMedicao|valorLiquidacao|mensagem                      |
	|2020000000221  |221         |1234         |221            |TESTE            |TESTE           |97915502042            |TESTE|TESTE|1234         |10                        |1500           |Execução alterada com sucesso.|