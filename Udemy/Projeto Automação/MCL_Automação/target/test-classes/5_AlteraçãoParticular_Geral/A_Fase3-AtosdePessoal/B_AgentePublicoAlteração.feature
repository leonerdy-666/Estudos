#language: pt
Funcionalidade: Alteração Agente Público
@Alteraçãoagentepublico
Esquema do Cenário: Inclusão de Agente Público
	Dado que acesso ao menu fasetres e ao submenu Agente Público para alteracao
	Quando preencho o filtro nome "<nome>" clico no botão buscar e alterar da tela de alteração
	E preencho o campo nome "<nome2>" e seleciono o combobox tipo documento para alteração
	E preencho o campo CPF "<CNPJ>", pispasep "<pisPasep>" e data nascimento para alteração
	E seleciono os comboboxes sexo, nacionalidade e escolaridade e preencho o campo especialidade "<especialidade>" para alteração
	Quando por fim clico no botão salvar da tela alteração
	Então recebo uma mensagem de alteração de agente público "<mensagem>"	
Exemplos: 
	|nome          				  |nome2                   |CNPJ			 	  |pisPasep	  |especialidade|mensagem                            |
	|Inclusão Agente Público|Alteração Agente Público|65267688000116|12345678978|TESTE2 	  	|Agente Público alterado com sucesso.|
	
	
#/************************************** ALTERAÇÃO GERAL **************************************/
@AlteraçãoGeral
@AlteraçãoFase3
Esquema do Cenário: 
  Dado que acesso ao submenu Agente Público para alteracao
  Quando preencho o filtro nome "<nome>" clico no botão buscar e alterar da tela de alteração
  E preencho o campo nome "<nome2>" e seleciono o combobox tipo documento para alteração
  E preencho o campo CPF "<CNPJ>", pispasep "<pisPasep>" e data nascimento para alteração
  E seleciono os comboboxes sexo, nacionalidade e escolaridade e preencho o campo especialidade "<especialidade>" para alteração
  Quando por fim clico no botão salvar da tela alteração
  Então recebo uma mensagem de alteração de agente público "<mensagem>" 
Exemplos: 
  |nome                   |nome2                   |CNPJ          |pisPasep   |especialidade|mensagem                            |
  |Inclusão Agente Público|Alteração Agente Público|65267688000116|12345678978|TESTE2       |Agente Público alterado com sucesso.|