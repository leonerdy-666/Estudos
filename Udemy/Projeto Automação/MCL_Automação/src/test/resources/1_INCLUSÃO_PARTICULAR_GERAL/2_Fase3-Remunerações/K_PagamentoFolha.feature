#language: pt
Funcionalidade: Inclusão de Pagamento Folha
@InclusãoPagamentoFolha
Esquema do Cenário:
	Dado que acesso ao menu fase três remuneração e ao submenu pagamentoFolha
	Quando clico no botao novo pagamento
	E seleciono e preencho comboBox lotação Agente Público "<lotacaoAgentePublico>" e preencho os campos competencia "<competencia>", banco "<banco>", agencia "<agencia>", conta corrente "<contaCorrente>"
	E valor pago conta corrente "<valorPagoContaCorrente>" e valor pago outras formas "<valorPagoOutrasFormas>"
	Quando por fim clico no botao salvar para salvar os dados da inclusão de pagamento folha
	Então recebo uma mensagem de inclusão "<mensagem>"
	
 Exemplos:
	|lotacaoAgentePublico   |competencia|banco|agencia|contaCorrente|valorPagoContaCorrente|valorPagoOutrasFormas|mensagem                       |
	|Inclusão Agente Público|222000     |01   |01     |01           |1500                  |1500                 |Pagamento incluído com sucesso.|
	
	
#/************************************** INCLUSÃO GERAL **************************************/	
@InclusãoGeral
@InclusãoGeralFase3Remuneração
Esquema do Cenário:
  Dado que acesso ao submenu pagamentoFolha
  Quando clico no botao novo pagamento
  E seleciono e preencho comboBox lotação Agente Público "<lotacaoAgentePublico>" e preencho os campos competencia "<competencia>", banco "<banco>", agencia "<agencia>", conta corrente "<contaCorrente>"
  E valor pago conta corrente "<valorPagoContaCorrente>" e valor pago outras formas "<valorPagoOutrasFormas>"
  Quando por fim clico no botao salvar para salvar os dados da inclusão de pagamento folha
  Então recebo uma mensagem de inclusão "<mensagem>"
  
 Exemplos:
  |lotacaoAgentePublico   |competencia|banco|agencia|contaCorrente|valorPagoContaCorrente|valorPagoOutrasFormas|mensagem                       |
  |Inclusão Agente Público|222000     |01   |01     |01           |1500                  |1500                 |Pagamento incluído com sucesso.|