#language: pt
Funcionalidade: Alteração Verba Remuneratória
@AlteraçãoVerbaRemuneratoria
Esquema do Cenário:
	Dado que acesso ao menu fase três remunerações e ao submenu verba remuneratoria para alteração
	Quando preencho o campo nome "<nome>" clico no botão buscar e alterar
	E preencho os campos codigo "<codigo>" e nome "<nome1>" para alteração
	Quando por fim clico no botao salvar da tela de inclusão de verba remuneratoria para alteração
	Então me é apresentado uma mensagem de confirmando minha inclusão "<mensagem>" para alteração
Exemplos:
	|codigo|nome1												 |nome                        |mensagem                                 |
	|0001  |Alteração Verba Remuneratória|Inclusão Verba Remuneratória|Verba remuneratória alterada com sucesso.|
	
	
#/************************************** ALTERAÇÃO GERAL **************************************/
@AlteraçãoGeral
@AlteraçãoFase3Remunerações
Esquema do Cenário:
	Dado que acesso ao submenu verba remuneratoria para alteração
	Quando preencho o campo nome "<nome>" clico no botão buscar e alterar
  E preencho os campos codigo "<codigo>" e nome "<nome1>" para alteração
  Quando por fim clico no botao salvar da tela de inclusão de verba remuneratoria para alteração
  Então me é apresentado uma mensagem de confirmando minha inclusão "<mensagem>" para alteração
Exemplos:
  |codigo|nome1                        |nome                        |mensagem                                 |
  |0001  |Alteração Verba Remuneratória|Inclusão Verba Remuneratória|Verba remuneratória alterada com sucesso.|