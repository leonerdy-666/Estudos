#language: pt
Funcionalidade: Inclusão de Folha Ordinária
@InclusãoFolhaOrdinaria
Esquema do Cenário:
	Dado que acesso ao menu fasetresremuneracoes e ao submenu folha ordinaria
	Quando clico no botao novafolhaordinaria
	E seleciono e preencho o comboboxes lotação agente público "<lotacaoAgentePublico>" e seleciono os combobox estagiario, possui autorização receber acima teto, situacao e preencho o campo competência "<competencia>"
	Quando por fim clico no botao salvar para salvar os dados preenchidos acima
	Então me é apresentado uma mensagem de inclusão de folha ordinaria "<mensagem>"
Exemplos:
	|lotacaoAgentePublico    |competencia|mensagem                             |
	|Inclusão Agente Público |222000 		 |Folha ordinária incluída com sucesso.|
	
	
#/************************************** INCLUSÃO GERAL **************************************/
@InclusãoGeral
@InclusãoGeralFase3Remuneração
Esquema do Cenário:
  Dado que acesso ao submenu folha ordinaria
  Quando clico no botao novafolhaordinaria
  E seleciono e preencho o comboboxes lotação agente público "<lotacaoAgentePublico>" e seleciono os combobox estagiario, possui autorização receber acima teto, situacao e preencho o campo competência "<competencia>"
  Quando por fim clico no botao salvar para salvar os dados preenchidos acima
  Então me é apresentado uma mensagem de inclusão de folha ordinaria "<mensagem>"
Exemplos:
  |lotacaoAgentePublico   |competencia|mensagem                             |
  |Inclusão Agente Público|222000     |Folha ordinária incluída com sucesso.|