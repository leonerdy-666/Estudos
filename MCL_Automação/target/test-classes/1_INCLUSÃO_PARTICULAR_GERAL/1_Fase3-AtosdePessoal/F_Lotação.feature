#language: pt
Funcionalidade: Inclusão Lotação
@InclusãoLotação
Esquema do Cenário:
	Dado que acesso ao menu fase três e ao submenu lotação 
	Quando clico no botão nova lotação
	E seleciono e preencho o combobox agente público "<agentePublico>", cargo "<cargo>", e seleciono os combobox cargo função remunerado, função governo, exercício atividade e forma provimento 
	E preencho os campos unidade lotação "<unidadeLotacao>", data lotação e data exercício
	Quando clico no botão adicionar historico e seleciono o combobox situação e preencho os campos data histórico e data exercício, clico no botão salvar popUp e no botão salvar
	Então recebo uma mensagem de sucesso da tela lotação "<mensagem>"
Exemplos: 
	|agentePublico          |cargo         |unidadeLotacao|mensagem                     |
	|Inclusão Agente Público|Inclusão Cargo|01            |Lotação incluída com sucesso.|
	
	
#/************************************** INCLUSÃO GERAL **************************************/
@InclusãoGeral
@InclusãoGeralFase3
Esquema do Cenário:
  Dado que acesso ao submenu lotação
  Quando clico no botão nova lotação
  E seleciono e preencho o combobox agente público "<agentePublico>", cargo "<cargo>", e seleciono os combobox cargo função remunerado, função governo, exercício atividade e forma provimento 
  E preencho os campos unidade lotação "<unidadeLotacao>", data lotação e data exercício
  Quando clico no botão adicionar historico e seleciono o combobox situação e preencho os campos data histórico e data exercício, clico no botão salvar popUp e no botão salvar
  Então recebo uma mensagem de sucesso da tela lotação "<mensagem>"
Exemplos: 
  |agentePublico          |cargo         |unidadeLotacao|mensagem                     |
  |Inclusão Agente Público|Inclusão Cargo|01            |Lotação incluída com sucesso.|