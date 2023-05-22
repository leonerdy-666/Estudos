#language: pt
Funcionalidade: Alteração de Cargo
@Alteraçãocargo
Esquema do Cenário: Inclusão de Cargo
	Dado que acesso ao menu fasetres e ao submenu cargo para alteração
	Quando preencho o filtro nome "<nome>" clico no botão buscar e no botão alterar
	E preencho os campos Código "<codigo>", Nome "<nome2>", e seleciono os comboboxes tipo, regime juridico, escolaridade e exercicio atividade para alteração
	E seleciono o comboboxes forma provimente, preencho o campo total horas "<totalHoras>" e seleciono o comboboxe cargo politico para alteração
	E clico no botão excluir da vaga adicionada anteriormente para alteração
	E clico no botao adicionar historico seleciono os combobox movimentação preencho o combobox ato normativo "<atoNormativo>", fundamento legal, tipo norma, e preencho os campos data movimentação e quantidade "<quantidade>" para alteração
	E clico no botão salvar do popup historico e clico no botão salvar para alteração
	Então recebo uma mensagem de inclusão de cargo "<mensagem>" na tela de alteração
Exemplos:
	|codigo|nome  				|nome2          |totalHoras|atoNormativo           |quantidade|mensagem                   |
	|0001  |Inclusão Cargo|Alteração Cargo|42        |Alteração Ato Normativo|1500      |Cargo alterado com sucesso.|
	
	
#/************************************** ALTERAÇÃO GERAL **************************************/
@AlteraçãoGeral
@AlteraçãoFase3
Esquema do Cenário: Inclusão de Cargo
  Dado que acesso ao submenu cargo para alteração
  Quando preencho o filtro nome "<nome>" clico no botão buscar e no botão alterar
  E preencho os campos Código "<codigo>", Nome "<nome2>", e seleciono os comboboxes tipo, regime juridico, escolaridade e exercicio atividade para alteração
  E seleciono o comboboxes forma provimente, preencho o campo total horas "<totalHoras>" e seleciono o comboboxe cargo politico para alteração
  E clico no botão excluir da vaga adicionada anteriormente para alteração
  E clico no botao adicionar historico seleciono os combobox movimentação preencho o combobox ato normativo "<atoNormativo>", fundamento legal, tipo norma, e preencho os campos data movimentação e quantidade "<quantidade>" para alteração
  E clico no botão salvar do popup historico e clico no botão salvar para alteração
  Então recebo uma mensagem de inclusão de cargo "<mensagem>" na tela de alteração
Exemplos:
  |codigo|nome          |nome2          |totalHoras|atoNormativo           |quantidade|mensagem                   |
  |0001  |Inclusão Cargo|Alteração Cargo|42        |Alteração Ato Normativo|1500      |Cargo alterado com sucesso.|