#language: pt
Funcionalidade: Inclusão de Função
@InclusãoFunção
Esquema do Cenário:
	Dado que acesso ao menu fasetres e ao submenu função
	E clico no botao nova funcao 
	E preencho os campos codigo "<codigo>", nome "<nome>" e total horas "<totalHoras>"
	E seleciono os itens dos comboboxes tipo, regimejuridico, escolaridade, exercicio atividade e forma provimento
	Quando por fim clico no botao salvar 
	Então me é apresentado uma mensagem de inclusão de função "<mensagem>"
Exemplos:
	|codigo|nome 					 |totalHoras|mensagem 	                 |
	|0001  |Inclusão Função|36        |Função incluída com sucesso.|
	
	
#/************************************** INCLUSÃO GERAL **************************************/
@InclusãoGeral
@InclusãoGeralFase3
Esquema do Cenário:
  Dado que acesso ao submenu função
  E clico no botao nova funcao 
  E preencho os campos codigo "<codigo>", nome "<nome>" e total horas "<totalHoras>"
  E seleciono os itens dos comboboxes tipo, regimejuridico, escolaridade, exercicio atividade e forma provimento
  Quando por fim clico no botao salvar 
  Então me é apresentado uma mensagem de inclusão de função "<mensagem>"
Exemplos:
  |codigo|nome           |totalHoras|mensagem                    |
  |0001  |Inclusão Função|36        |Função incluída com sucesso.|