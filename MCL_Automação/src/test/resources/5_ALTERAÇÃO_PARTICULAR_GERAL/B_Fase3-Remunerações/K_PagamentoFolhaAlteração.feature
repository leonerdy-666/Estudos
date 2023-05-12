#language: pt
Funcionalidade: Alteração de Pagamento Folha
@AlteraçãoPagamentoFolha
Esquema do Cenário:
	Dado que acesso ao menu fase três remuneração e ao submenu pagamentoFolha para alteração
	Quando preencho o filtro competência "<competencia>", seleciono e preencho o campo agente público "<lotacaoAgentePublico>", clico em buscar e alterar 
	E seleciono e preencho comboBox lotação Agente Público "<lotacaoAgentePublico>" e preencho os campos competencia "<competencia>", banco "<banco>", agencia "<agencia>", conta corrente "<contaCorrente>" para alteração
	E valor pago conta corrente "<valorPagoContaCorrente>" e valor pago outras formas "<valorPagoOutrasFormas>" para alteração
	Quando por fim clico no botao salvar para salvar os dados da inclusão de pagamento folha para alteração
	Então recebo uma mensagem de inclusão "<mensagem>" para alteração 
	
 Exemplos:
	|lotacaoAgentePublico   |competencia|banco|agencia|contaCorrente|valorPagoContaCorrente|valorPagoOutrasFormas|mensagem                       |
	|Inclusão Agente Público|22/2000    |01   |01     |01           |1500                  |1500                 |Pagamento alterado com sucesso.|
	
	
#/************************************** ALTERAÇÃO GERAL **************************************/
@AlteraçãoGeral
@AlteraçãoFase3Remunerações
Esquema do Cenário:
	Dado que acesso ao submenu pagamentoFolha para alteração
	Quando preencho o filtro competência "<competencia>", seleciono e preencho o campo agente público "<lotacaoAgentePublico>", clico em buscar e alterar 
  E seleciono e preencho comboBox lotação Agente Público "<lotacaoAgentePublico>" e preencho os campos competencia "<competencia>", banco "<banco>", agencia "<agencia>", conta corrente "<contaCorrente>" para alteração
  E valor pago conta corrente "<valorPagoContaCorrente>" e valor pago outras formas "<valorPagoOutrasFormas>" para alteração
  Quando por fim clico no botao salvar para salvar os dados da inclusão de pagamento folha para alteração
  Então recebo uma mensagem de inclusão "<mensagem>" para alteração 
  
 Exemplos:
  |lotacaoAgentePublico    |competencia|banco|agencia|contaCorrente|valorPagoContaCorrente|valorPagoOutrasFormas|mensagem                       |
  |Alteração Agente Público|222000     |01   |01     |01           |1500                  |1500                 |Pagamento alterado com sucesso.|