#language: pt
Funcionalidade: Alteração de Função
@AlteraçãoFunção
Esquema do Cenário:
	Dado que acesso ao menu fasetres e ao submenu função para alteração
	Quando preencho o filtro nome "<nome>" e clico em buscar e clico no botão alteração
	E preencho os campos codigo "<codigo>", nome "<nome2>" e total horas "<totalHoras>" para alteração
	E seleciono os itens dos comboboxes tipo, regimejuridico, escolaridade, exercicio atividade e forma provimento para alteração
	Quando por fim clico no botao salvar da tela alteração
	Então me é apresentado uma mensagem de inclusão de função "<mensagem>" da tela alteração
Exemplos:
	|codigo|nome 					 |nome2           |totalHoras|mensagem 	                  |
	|0001  |Inclusão Função|Alteração Função|36        |Função alterada com sucesso.|   
	
	
#/************************************** ALTERAÇÃO GERAL **************************************/
@AlteraçãoGeral
@AlteraçãoFase3
Esquema do Cenário:
  Dado que acesso ao submenu função para alteração
  Quando preencho o filtro nome "<nome>" e clico em buscar e clico no botão alteração
  E preencho os campos codigo "<codigo>", nome "<nome2>" e total horas "<totalHoras>" para alteração
  E seleciono os itens dos comboboxes tipo, regimejuridico, escolaridade, exercicio atividade e forma provimento para alteração
  Quando por fim clico no botao salvar da tela alteração
  Então me é apresentado uma mensagem de inclusão de função "<mensagem>" da tela alteração
Exemplos:
  |codigo|nome           |nome2           |totalHoras|mensagem                    |
  |0001  |Inclusão Função|Alteração Função|36        |Função alterada com sucesso.|   