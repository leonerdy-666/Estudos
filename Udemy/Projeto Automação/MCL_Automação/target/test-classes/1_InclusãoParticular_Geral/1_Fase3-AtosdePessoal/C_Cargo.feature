#language: pt
Funcionalidade: Inclusão de Cargo
@InclusãoCargo
Esquema do Cenário: Inclusão de Cargo
	Dado que acesso ao menu fasetres e ao submenu cargo
	E clico no botao novocargo
  E preencho os campos Código "<codigo>", Nome "<nome>", e seleciono os comboboxes tipo, regime juridico, escolaridade e exercicio atividade
  E seleciono o comboboxes forma provimente, preencho o campo total horas "<totalHoras>" e seleciono o comboboxe cargo politico
  E clico no botao adicionar historico seleciono os combobox movimentação, preencho e seleciono combobox ato normativo "<atoNormativo>", fundamento legal, tipo norma, e preencho os campos data movimentação e quantidade "<quantidade>"
  E clico no botão salvar do popup historico e clico no botão salvar
  Então recebo uma mensagem de inclusão de cargo "<mensagem>"
Exemplos:
  |codigo|nome          |totalHoras|atoNormativo          |quantidade|mensagem                   |
  |0001  |Inclusão Cargo|36        |Inclusão Ato Normativo|1500      |Cargo incluído com sucesso.|
  
  
#/************************************** INCLUSÃO GERAL **************************************/
@InclusãoGeral
@InclusãoGeralFase3
Esquema do Cenário: Inclusão de Cargo
  Dado que acesso ao submenu cargo
  E clico no botao novocargo
  E preencho os campos Código "<codigo>", Nome "<nome>", e seleciono os comboboxes tipo, regime juridico, escolaridade e exercicio atividade
  E seleciono o comboboxes forma provimente, preencho o campo total horas "<totalHoras>" e seleciono o comboboxe cargo politico
  E clico no botao adicionar historico seleciono os combobox movimentação, preencho e seleciono combobox ato normativo "<atoNormativo>", fundamento legal, tipo norma, e preencho os campos data movimentação e quantidade "<quantidade>"
  E clico no botão salvar do popup historico e clico no botão salvar
  Então recebo uma mensagem de inclusão de cargo "<mensagem>"
Exemplos:
  |codigo|nome          |totalHoras|atoNormativo          |quantidade|mensagem                   |
  |0001  |Inclusão Cargo|36        |Inclusão Ato Normativo|1500      |Cargo incluído com sucesso.|