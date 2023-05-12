#language:pt
Funcionalidade: Inclusão de execução 
@InclusãoExecução
Esquema do Cenário: 
	Dado que acesso ao menu fasequatro e ao submenu execução
	Quando clico no botao nova execução
	E seleciono o combobox ajuste da licitação 
	E seleciono o combobox situação do ajuste, o campo data de entrega do material ou inicio da execução de serviço obra, qual o regime de execução ou a forma de fornecimento do objeto contratual e trata-se de objeto decorrente de importação
	E seleciono o combobox a execução do contrato está de acordo com o cronograma físico-financeiro ou prazo de entrega pactuado e em caso de obra publica ela está paralisada e preencho o campo motivo da paralisação "<motivoParalisacao>"
	E seleciono o combobox forma de recebimento seleciono a data do campo data do recebimento seleciono o combobox existe termo circunstanciado assinado pelas partes e existe vistoria que comprove a adequação do objeto aos termos contratuais
	E seleciono o combobox houve inexecução do contrato seleciono o campo data de abertura do procedimento administrativo seleciono o combobox houve aplicação de sanções e preencho o campo motivo da inexecução do contrato "<motivoInexecucaoContrato>"
	Quando clico no botao próximo e clico na aba corpo técnico 
	E seleciono o combobox o corpo técnico e os responsáveis pela obra apresentados pela contratada correspondem com a relação constante no contrato, a contratada mantém preposto junto à obra para representá-la, A administração designou fiscal credenciado junto ao CREA para acompanhar a execução da obra lei
	Quando clico no botão próximo e clico na aba conferência medição
	E seleciono o combobox houve conferência medição, preencho o campo número da medição "<numeroMedicao>", seleciono a data da conferência medição, preencho o campo percentual executado nessa medição "<percentualExecutado>", houve supressão de obra bens ou serviços
	Quando clico no botão próximo e clico na aba dados financeiros 
	E seleciono o combobox houve liquidação ou documento similar, numero empenho documento similar preencho o campo data da liquidação da despesa e preencho o campo valor da liquidação "<valorLiquidacao>" e clico no botão adicionar
	Então recebo uma mensagem de sucesso na tela de execução "<mensagem>"
Exemplos:
 	|motivoParalisacao|motivoInexecucaoContrato|CPFServidorResponsavel|nome |cargo|numeroMedicao|percentualExecutado|CPFServidorResponsavel|nome |cargo|valorLiquidacao|mensagem                      |
 	|TESTE       			|TESTE                   |23129434097           |TESTE|TESTE|1234         |010                |11480243019           |TESTE|TESTE|1500           |Execução alterada com sucesso.|
 	
 	
#/************************************** INCLUSÃO GERAL **************************************/
@InclusãoGeral
@inclusãoGeralfase4
Esquema do Cenário: 
  Dado que acesso ao submenu execução
  Quando clico no botao nova execução
  E seleciono o combobox ajuste da licitação 
  E seleciono o combobox situação do ajuste, o campo data de entrega do material ou inicio da execução de serviço obra, qual o regime de execução ou a forma de fornecimento do objeto contratual e trata-se de objeto decorrente de importação
  E seleciono o combobox a execução do contrato está de acordo com o cronograma físico-financeiro ou prazo de entrega pactuado e em caso de obra publica ela está paralisada e preencho o campo motivo da paralisação "<motivoParalisacao>"
  E seleciono o combobox forma de recebimento seleciono a data do campo data do recebimento seleciono o combobox existe termo circunstanciado assinado pelas partes e existe vistoria que comprove a adequação do objeto aos termos contratuais
  E seleciono o combobox houve inexecução do contrato seleciono o campo data de abertura do procedimento administrativo seleciono o combobox houve aplicação de sanções e preencho o campo motivo da inexecução do contrato "<motivoInexecucaoContrato>"
  Quando clico no botao próximo e clico na aba corpo técnico 
  E seleciono o combobox o corpo técnico e os responsáveis pela obra apresentados pela contratada correspondem com a relação constante no contrato, a contratada mantém preposto junto à obra para representá-la, A administração designou fiscal credenciado junto ao CREA para acompanhar a execução da obra lei
  Quando clico no botão próximo e clico na aba conferência medição
  E seleciono o combobox houve conferência medição, preencho o campo número da medição "<numeroMedicao>", seleciono a data da conferência medição, preencho o campo percentual executado nessa medição "<percentualExecutado>", houve supressão de obra bens ou serviços
  Quando clico no botão próximo e clico na aba dados financeiros 
  E seleciono o combobox houve liquidação ou documento similar, numero empenho documento similar preencho o campo data da liquidação da despesa e preencho o campo valor da liquidação "<valorLiquidacao>" e clico no botão adicionar
  Então recebo uma mensagem de sucesso na tela de execução "<mensagem>"
Exemplos:
  |motivoParalisacao|motivoInexecucaoContrato|CPFServidorResponsavel|nome |cargo|numeroMedicao|percentualExecutado|CPFServidorResponsavel|nome |cargo|valorLiquidacao|mensagem                      |
  |TESTE            |TESTE                   |23129434097           |TESTE|TESTE|1234         |010                |11480243019           |TESTE|TESTE|1500           |Execução alterada com sucesso.|