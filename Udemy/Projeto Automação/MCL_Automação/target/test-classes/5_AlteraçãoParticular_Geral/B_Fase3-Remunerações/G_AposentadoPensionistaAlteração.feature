#language: pt
Funcionalidade: Alteração de Aposentado Pensionista
@AlteraçãoAposentadoPensionista
Esquema do Cenário:
	Dado que acesso ao menu fasetres remunerações e ao ambiente Aposentado Pensionista para alteração
	E preencho o filtro cargo origem "<cargoOrigem1>", clico no botão buscar e no botão alteração para alteração
	E seleciono o campo tipo e preencho os campos nome "<nome>", CPF "<CPF>" e seleciono a data do campo data nascimento para alteração
	E seleciono o combobox qualificação pensionista para alteração
	Quando por fim clico no botasalvar para alteração
	Então me é apresentado uma mensagem de inclusão de aposentados pensionistas "<mensagem>" para alteração
Exemplos:
	|cargoOrigem1                   |nome 													 |CPF        |mensagem		                                |
  |inclusão Aposentado pensionista|Alteração Aposentado Pensionista|77041811069|Aposentado/Pensionista alterado com sucesso.|
  
  
#/************************************** ALTERAÇÃO GERAL **************************************/
@AlteraçãoGeral
@AlteraçãoFase3Remunerações
Esquema do Cenário:
	Dado que acesso ao menu fasetres remunerações e ao submenu Aposentado Pensionista para alteração geral
	E preencho o filtro cargo origem "<cargoOrigem1>", clico no botão buscar e no botão alteração para alteração
  E seleciono o campo tipo e preencho os campos nome "<nome>", CPF "<CPF>" e seleciono a data do campo data nascimento para alteração
  E seleciono o combobox qualificação pensionista para alteração
  Quando por fim clico no botasalvar para alteração
  Então me é apresentado uma mensagem de inclusão de aposentados pensionistas "<mensagem>" para alteração
Exemplos:
  |cargoOrigem1                   |nome                            |CPF        |mensagem                                    |
  |inclusão Aposentado pensionista|Alteração Aposentado Pensionista|77041811069|Aposentado/Pensionista alterado com sucesso.|