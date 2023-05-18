#language: pt
Funcionalidade: Alteração de Ato Normativo
@AlteraçãoAtoNormativo
Esquema do Cenário:
	Dado que acesso ao menu fase três e ao submenuato normativo 
	Quando preencho o filtro descrição "<descricao>" clico no botão buscar e clico no botão alterar para alteracao
	Quando preenhco os campos descricao "<descricao2>" numero do ato "<numeroAto>" e ano "<ano>" para alteração
	E os campos data publicação, data vigência e norma para alteração
	Quando por fim clico no botao salvar da tela alterar ato normativo
	Então recebo uma mensagem na tela de Alteração de ato normativo "<mensagem>"
Exemplos:
	|descricao             |descricao2             |numeroAto|ano |mensagem									 		      |
	|inclusão Ato Normativo|Alteração Ato Normativo|02       |2021|Ato normativo alterado com sucesso.|
	
	
#/************************************** ALTERAÇÃO GERAL **************************************/
@AlteraçãoGeral
@AlteraçãoFase3
Esquema do Cenário:
  Dado que acesso ao menu fase três e ao submenu ato normativo para alteração geral
  Quando preencho o filtro descrição "<descricao>" clico no botão buscar e clico no botão alterar para alteracao
  Quando preenhco os campos descricao "<descricao2>" numero do ato "<numeroAto>" e ano "<ano>" para alteração
  E os campos data publicação, data vigência e norma para alteração
  Quando por fim clico no botao salvar da tela alterar ato normativo
  Então recebo uma mensagem na tela de Alteração de ato normativo "<mensagem>"
Exemplos:
  |descricao             |descricao2             |numeroAto|ano |mensagem                           |
  |inclusão Ato Normativo|Alteração Ato Normativo|02       |2021|Ato normativo alterado com sucesso.|	