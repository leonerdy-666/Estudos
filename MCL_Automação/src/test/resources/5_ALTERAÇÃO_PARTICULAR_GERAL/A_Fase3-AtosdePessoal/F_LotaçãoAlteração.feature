#language: pt
Funcionalidade: Alteração Lotação
@AlteraçãoLotação
Esquema do Cenário:
	Dado que acesso ao menu fase três e ao submenu lotação para alteração
	Quando preencho o filtro agente público "<agentePublico>", situação e data lotação, clico no botão buscar e alterar  
  E seleciono os comboboxes agente público "<agentePublico>", cargo "<cargo>", cargo função remunerado, função governo, exercício atividade e forma provimento para alteração 
  E preencho os campos unidade lotação "<unidadeLotacao>", data exercício para alteração
  Quando excluo o historico adicionado anteriormente da tela alteração
  Quando clico no botão adicionar historico e seleciono o combobox situação, aposentadoria e preencho os campos data histórico e data exercício, clico no botão salvar do popup e no botão salvar para alteração
  Então recebo uma mensagem de alteração da tela lotação "<mensagem>"
Exemplos: 
  |agentePublico           |cargo          |unidadeLotacao|mensagem                     |
  |alteração agente publico|Alteração Cargo|02            |Lotação alterada com sucesso.|
	
	
#/************************************** ALTERAÇÃO GERAL **************************************/
@AlteraçãoGeral
@AlteraçãoFase3
Esquema do Cenário:
  Dado que acesso ao submenu lotação para alteração
  Quando preencho o filtro agente público "<agentePublico>", situação e data lotação, clico no botão buscar e alterar  
  E seleciono os comboboxes agente público "<agentePublico>", cargo "<cargo>", cargo função remunerado, função governo, exercício atividade e forma provimento para alteração 
  E preencho os campos unidade lotação "<unidadeLotacao>", data exercício para alteração
  Quando excluo o historico adicionado anteriormente da tela alteração
  Quando clico no botão adicionar historico e seleciono o combobox situação, aposentadoria e preencho os campos data histórico e data exercício, clico no botão salvar do popup e no botão salvar para alteração
  Então recebo uma mensagem de alteração da tela lotação "<mensagem>"
Exemplos: 
  |agentePublico           |cargo          |unidadeLotacao|mensagem                     |
  |alteração agente publico|Alteração Cargo|02            |Lotação alterada com sucesso.|