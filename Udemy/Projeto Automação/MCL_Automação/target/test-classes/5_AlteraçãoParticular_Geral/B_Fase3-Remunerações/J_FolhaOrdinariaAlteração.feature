#language: pt
Funcionalidade: Alteração de Folha Ordinária
@AlteraçãoFolhaOrdinaria
Esquema do Cenário:
	Dado que acesso ao menu fasetresremuneracoes e ao submenu folha ordinaria para alteração
	Quando seleciono o filtro situação clico no botão buscar e alterar
	E seleciono e preencho o comboboxes lotação agente público "<lotacaoAgentePublico>" e seleciono os combobox estagiario, possui autorização receber acima teto, situacao e preencho o campo competência "<competencia>" para alteração
	Quando por fim clico no botao salvar para salvar os dados preenchidos acima para alteração
	Então me é apresentado uma mensagem de inclusão de folha ordinaria "<mensagem>" para alteração
Exemplos:
	|lotacaoAgentePublico   |competencia|mensagem                             |
	|Inclusão Agente Público|22/2000		|Folha ordinária alterada com sucesso.|
	
	
#/************************************** ALTERAÇÃO GERAL **************************************/
@AlteraçãoGeral
@AlteraçãoFase3Remunerações
Esquema do Cenário:
	Dado que acesso ao submenu folha ordinaria para alteração
	Quando seleciono o filtro situação clico no botão buscar e alterar
  E seleciono e preencho o comboboxes lotação agente público "<lotacaoAgentePublico>" e seleciono os combobox estagiario, possui autorização receber acima teto, situacao e preencho o campo competência "<competencia>" para alteração
  Quando por fim clico no botao salvar para salvar os dados preenchidos acima para alteração
  Então me é apresentado uma mensagem de inclusão de folha ordinaria "<mensagem>" para alteração
Exemplos:
  |lotacaoAgentePublico    |competencia|mensagem                             |
  |Alteração Agente Publico|222000     |Folha ordinária alterada com sucesso.|
	