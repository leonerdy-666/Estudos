#language: pt
Funcionalidade: Inclusão de Aposentado
@InclusãoAposentadoPensionista
Esquema do Cenário:
	Dado que acesso ao menu fasetres remunerações e ao ambiente Aposentado Pensionista
	Quando clico no botao novoaposentadopensionista
	E seleciono o campo tipo e preencho os campos nome "<nome>", CPF "<CPF>" e seleciono a data do campo data nascimento
	E preecho os campos cargo origem "<cargoOrigem>" e seleciono a data do campo data aposentadoria
	Quando por fim clico no botasalvar
	Então me é apresentado uma mensagem de inclusão de aposentados pensionistas "<mensagem>"
Exemplos:
	|nome 													|CPF        |cargoOrigem							      |mensagem		                                 |
  |Inclusão Aposentado Pensionista|77784427522|Inclusão Aposentado Pensionista|Aposentado/Pensionista incluído com sucesso.|
  
  
#/************************************** INCLUSÃO GERAL **************************************/
@InclusãoGeral
@InclusãoGeralFase3Remuneração
Esquema do Cenário:
  Dado que acesso ao menu fase três remunerações e ao submenu Aposentado Pensionista do caminho feliz
  Quando clico no botao novoaposentadopensionista
  E seleciono o campo tipo e preencho os campos nome "<nome>", CPF "<CPF>" e seleciono a data do campo data nascimento
  E preecho os campos cargo origem "<cargoOrigem>" e seleciono a data do campo data aposentadoria
  Quando por fim clico no botasalvar
  Então me é apresentado uma mensagem de inclusão de aposentados pensionistas "<mensagem>"
Exemplos:
  |nome                           |CPF        |cargoOrigem                    |mensagem                                    |
  |Inclusão Aposentado Pensionista|77784427522|Inclusão Aposentado Pensionista|Aposentado/Pensionista incluído com sucesso.|