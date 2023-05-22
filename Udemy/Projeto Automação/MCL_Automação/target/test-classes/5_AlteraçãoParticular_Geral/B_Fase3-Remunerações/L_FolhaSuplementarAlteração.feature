#language: pt
Funcionalidade: Alteração de Folha Suplementar
@AlteraçãoFolhaSuplementar
Esquema do Cenário:
	Dado qua acesso ao menu fasetresremunerações e ao submenu folha suplementar para alteração
	Quando seleciono o filtro situação clico no botão buscar e alterar para alteração
	E seleciono os comboboxes folha ordinária, lotação agente público "<lotacaoAgentePublico>" e seleciono os coboboxes estagiario, possui autorização receber acima teto e situação para alteração
	Quando clico no botão adicionar e preencho os campos total geral remuneração bruta "<totalGeralRemuneracaoBruta>", total geral descontos "<totalGeralDescontos>", total geral remuneração líquida "<totalGeralRemuneracaoLiquida>", valor pago conta corrente "<valorPagoContaCorrente>" e valor pago outras formas "<valorPagoOutrasFormas>" e clico no botão salvar para alteração 
	Então recebo uma mensagem de inclusão de folha suplementar "<mensagem>" para alteração
Exemplos: 
 |lotacaoAgentePublico   |totalGeralRemuneracaoBruta|totalGeralDescontos|totalGeralRemuneracaoLiquida|valorPagoContaCorrente|valorPagoOutrasFormas|mensagem                               |
 |Inclusão Agente Público|1500                      |1500               |1500                        |1500                  |1500                 |Folha suplementar alterado com sucesso.|
 
 
#/************************************** ALTERAÇÃO GERAL **************************************/
@AlteraçãoGeral
@AlteraçãoFase3Remunerações
Esquema do Cenário:
	Dado qua acesso ao submenu folha suplementar para alteração
	Quando seleciono o filtro situação clico no botão buscar e alterar para alteração
  E seleciono os comboboxes folha ordinária, lotação agente público "<lotacaoAgentePublico>" e seleciono os coboboxes estagiario, possui autorização receber acima teto e situação para alteração
  Quando clico no botão adicionar e preencho os campos total geral remuneração bruta "<totalGeralRemuneracaoBruta>", total geral descontos "<totalGeralDescontos>", total geral remuneração líquida "<totalGeralRemuneracaoLiquida>", valor pago conta corrente "<valorPagoContaCorrente>" e valor pago outras formas "<valorPagoOutrasFormas>" e clico no botão salvar para alteração 
  Então recebo uma mensagem de inclusão de folha suplementar "<mensagem>" para alteração
Exemplos: 
 |lotacaoAgentePublico    |totalGeralRemuneracaoBruta|totalGeralDescontos|totalGeralRemuneracaoLiquida|valorPagoContaCorrente|valorPagoOutrasFormas|mensagem                               |
 |Alteração Agente Público|1500                      |1500               |1500                        |1500                  |1500                 |Folha suplementar alterado com sucesso.|