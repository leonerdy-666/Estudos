#language: pt
Funcionalidade: Inclusão ato normativo
@InclusãoAtoNormativo
Esquema do Cenário: Inclusão de ato normativo
	Dado que acesso ao menu fase três ato pessoal e ao submenu ato normativo e clico no botão novo ato normativo sou direcionado para tela de cadastro
	Quando preencho os campos descrição "<descricao>", numero do ato "<numeroAto>" e ano "<ano>"
	E preencho os campos data publicação, data vigência e norma
	Quando por fim clico no botao salvar da tela incluir ato normativo
	Então recebo uma mensagem na tela de inclusão de ato normativo "<mensagem>"
Exemplos:
	|descricao             |numeroAto|ano |mensagem									 		      |
	|Inclusão Ato Normativo|01       |2020|Ato normativo incluído com sucesso.|
	

#/************************************** INCLUSÃO GERAL **************************************/
@InclusãoGeral
@InclusãoGeralFase3
Esquema do Cenário: 
  Dado que acesso ao menu fase três ato pessoal e ao submenu ato normativo e clico no botão novo ato normativo sou direcionado para tela de cadastro
  Quando preencho os campos descrição "<descricao>", numero do ato "<numeroAto>" e ano "<ano>"
  E preencho os campos data publicação, data vigência e norma
  Quando por fim clico no botao salvar da tela incluir ato normativo
  Então recebo uma mensagem na tela de inclusão de ato normativo "<mensagem>"
Exemplos:
  |descricao             |numeroAto|ano |mensagem                           |
  |Inclusão Ato Normativo|01       |2020|Ato normativo incluído com sucesso.|  