#language: pt
Funcionalidade: Inclusão Agente Público
@InclusãoAgentePublico
Esquema do Cenário: Inclusão de Agente Público
	Dado que acesso ao menu fasetres e ao submenu Agente Público
	Quando clico no botao novo agente público 
	E preencho o campo nome "<nome>" e seleciono o campo tipo documento "<tipDocumento>"
	E preencho o campo CPF "<CPF>", pispasep "<pisPasep>" e data nascimento
	E seleciono os comboboxes sexo, nacionalidade e escolaridade e preencho o campo especialidade "<especialidade>"
	Quando por fim clico no botão salvar
	Então recebo uma mensagem de inclusão de agente público "<mensagem>"	
Exemplos: 
	|nome          				  |CPF			 	|pisPasep	  |especialidade|mensagem                            |
	|Inclusão Agente Público|54480696067|14652234976|TESTE 	  	  |Agente Público incluído com sucesso.|
	
	
#/************************************** INCLUSÃO GERAL **************************************/
@InclusãoGeral
@InclusãoGeralFase3
Esquema do Cenário: Inclusão de Agente Público
  Dado que acesso e ao submenu Agente Público
  Quando clico no botao novo agente público 
  E preencho o campo nome "<nome>" e seleciono o campo tipo documento "<tipDocumento>"
  E preencho o campo CPF "<CPF>", pispasep "<pisPasep>" e data nascimento
  E seleciono os comboboxes sexo, nacionalidade e escolaridade e preencho o campo especialidade "<especialidade>"
  Quando por fim clico no botão salvar
  Então recebo uma mensagem de inclusão de agente público "<mensagem>"  
Exemplos: 
  |nome                   |CPF        |pisPasep   |especialidade|mensagem                            |
  |Inclusão Agente Público|54480696067|14652234976|TESTE        |Agente Público incluído com sucesso.|