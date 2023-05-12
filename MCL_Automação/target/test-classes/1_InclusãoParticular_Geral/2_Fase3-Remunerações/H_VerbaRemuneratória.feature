#language: pt
Funcionalidade: Inclusão de Verba Remuneratória
@InclusãoVerbaRemuneratoria
Esquema do Cenário:
	Dado que acesso ao menu fasetres remunerações e ao submenu verba remuneratoria
	Quando clico no botao nova verba remuneratoria 
	E preencho os campos codigo "<codigo>" e nome "<nome>" 
	Quando por fim clico no botao salvar da tela de inclusão de verba remuneratoria
	Então me é apresentado uma mensagem de confirmando minha inclusão "<mensagem>"
Exemplos:
	|codigo|nome                        |mensagem                                 |
	|0001  |Inclusão Verba Remuneratória|Verba remuneratória incluída com sucesso.|
	
	
#/************************************** INCLUSÃO GERAL **************************************/
@InclusãoGeral
@InclusãoGeralFase3Remuneração
Esquema do Cenário:
  Dado que acesso ao submenu verba remuneratoria 
  Quando clico no botao nova verba remuneratoria 
  E preencho os campos codigo "<codigo>" e nome "<nome>" 
  Quando por fim clico no botao salvar da tela de inclusão de verba remuneratoria
  Então me é apresentado uma mensagem de confirmando minha inclusão "<mensagem>"
Exemplos:
  |codigo|nome                        |mensagem                                 |
  |0001  |Inclusão Verba Remuneratória|Verba remuneratória incluída com sucesso.|