#language: pt
Funcionalidade: Inclusão de Quadro Pessoal
@InclusãoQuadroPessoal
Esquema do Cenário:
	Dado que acesso ao menu fasetres e ao submenu quadro de pessoal
	Quando clico no botao novo quadro pessoal e me é aberto a tela de inclusão
	E preencho e seleciono o combobox cargo "<cargo>" e preencho os campos quantidade total vagas "<quantidadeTotalVagas>", quantidade vagas providas "<quantidadeVagasProvidas>" e quantidade vagas não providas "<quantidadeVagasNaoProvidas>"
	Quando por fim clico no botão salvar para salvar
	Então recebo uma mensagem aprovando a inclusão do quadro Pessoal "<mensagem>"
Exemplos: 
 	|cargo         |quantidadeTotalVagas|quantidadeVagasProvidas|quantidadeVagasNaoProvidas|mensagem                            |
 	|Inclusão Cargo|50                  |50                     |50                        |Quadro pessoal incluído com sucesso.|
 	
 	
#/************************************** INCLUSÃO GERAL **************************************/
@InclusãoGeral
@InclusãoGeralFase3
Esquema do Cenário: 
  Dado que acesso ao submenu quadro de pessoal
  Quando clico no botao novo quadro pessoal e me é aberto a tela de inclusão
  E preencho e seleciono o combobox cargo "<cargo>" e preencho os campos quantidade total vagas "<quantidadeTotalVagas>", quantidade vagas providas "<quantidadeVagasProvidas>" e quantidade vagas não providas "<quantidadeVagasNaoProvidas>"
  Quando por fim clico no botão salvar para salvar
  Então recebo uma mensagem aprovando a inclusão do quadro Pessoal "<mensagem>"
Exemplos: 
  |cargo         |quantidadeTotalVagas|quantidadeVagasProvidas|quantidadeVagasNaoProvidas|mensagem                            |
  |Inclusão Cargo|50                  |50                     |50                        |Quadro pessoal incluído com sucesso.|