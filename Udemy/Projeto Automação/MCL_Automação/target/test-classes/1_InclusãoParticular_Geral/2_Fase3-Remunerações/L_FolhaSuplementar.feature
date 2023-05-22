#language: pt
Funcionalidade: inclusão de Folha Suplementar
@InclusãoFolhaSuplementar
Esquema do Cenário:
	Dado que acesso ao menu fasetresremunerações e ao submenu folha suplementar
	Quando clico no botao novafolhasuplementar
	E seleciono os comboboxes folha ordinária, lotação agente público "<lotacaoAgentePublico>" e seleciono os coboboxes estagiario, possui autorização receber acima teto e situação
	Quando clico no botão adicionar e preencho os campos total geral remuneração bruta "<totalGeralRemuneracaoBruta>", total geral descontos "<totalGeralDescontos>", total geral remuneração líquida "<totalGeralRemuneracaoLiquida>", valor pago conta corrente "<valorPagoContaCorrente>" e valor pago outras formas "<valorPagoOutrasFormas>" e clico no botão salvar
	Então recebo uma mensagem de inclusão de folha suplementar "<mensagem>"
Exemplos: 
 |lotacaoAgentePublico   |totalGeralRemuneracaoBruta|totalGeralDescontos|totalGeralRemuneracaoLiquida|valorPagoContaCorrente|valorPagoOutrasFormas|mensagem                               |
 |Inclusão Agente Público|1500                      |1500               |1500                        |1500                  |1500                 |Folha suplementar incluída com sucesso.|
 
 
#/************************************** INCLUSÃO GERAL **************************************/
@InclusãoGeral
@InclusãoGeralFase3Remuneração
Esquema do Cenário:
  Dado qua acesso ao submenu folha suplementar
  Quando clico no botao novafolhasuplementar
  E seleciono os comboboxes folha ordinária, lotação agente público "<lotacaoAgentePublico>" e seleciono os coboboxes estagiario, possui autorização receber acima teto e situação
  Quando clico no botão adicionar e preencho os campos total geral remuneração bruta "<totalGeralRemuneracaoBruta>", total geral descontos "<totalGeralDescontos>", total geral remuneração líquida "<totalGeralRemuneracaoLiquida>", valor pago conta corrente "<valorPagoContaCorrente>" e valor pago outras formas "<valorPagoOutrasFormas>" e clico no botão salvar
  Então recebo uma mensagem de inclusão de folha suplementar "<mensagem>"
Exemplos: 
 |lotacaoAgentePublico   |totalGeralRemuneracaoBruta|totalGeralDescontos|totalGeralRemuneracaoLiquida|valorPagoContaCorrente|valorPagoOutrasFormas|mensagem                               |
 |Inclusão Agente Público|1500                      |1500               |1500                        |1500                  |1500                 |Folha suplementar incluída com sucesso.|