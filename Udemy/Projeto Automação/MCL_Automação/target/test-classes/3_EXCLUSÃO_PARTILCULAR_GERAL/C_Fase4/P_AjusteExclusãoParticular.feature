#language: pt
Funcionalidade: exclusão Ajuste
@ExclusãoAjuste
Esquema do Cenário: 
	Dado que acesso ao menu fase quatro submenu ajustes para exclusão geral
	Quando preencho os filtro codigo do ajuste "<codigoAjuste>", codigo da licitação "<codigoLicitacao>",  numero da licitação "<numeroLicitacao>", ano da licitação "<anoLicitacao>", seleciono o combobox modalidade, preencho o campo numero do processo administrativo "<numeroProcessoADM>" e ano do processo administrativo "<anoProcessoADM>"
	Quando clico no botão buscar, excluir e confirmar da tela ajustes
	Então recebo uma mensagem de sucesso na tela ajuste "<mensagem>"
Exemplos: 
	|codigoAjuste |codigoLicitacao|numeroLicitacao|anoLicitacao|numeroProcessoADM|anoProcessoADM|mensagem                                       |
	|2020123456789|2019000000001  |00001          |2019        |00001            |2019          |O ajuste de licitação foi excluído com sucesso.|
	
	
#/************************************** EXCLUSÃO GERAL **************************************/
@ExclusãoGeral
@ExclusãoFase4
Esquema do Cenário: 
	Dado que acesso ao submenu ajustes para exclusão geral
	Quando preencho os filtro codigo do ajuste "<codigoAjuste>", codigo da licitação "<codigoLicitacao>",  numero da licitação "<numeroLicitacao>", ano da licitação "<anoLicitacao>", seleciono o combobox modalidade, preencho o campo numero do processo administrativo "<numeroProcessoADM>" e ano do processo administrativo "<anoProcessoADM>"
  Quando clico no botão buscar, excluir e confirmar da tela ajustes
  Então recebo uma mensagem de sucesso na tela ajuste "<mensagem>"
Exemplos: 
  |codigoAjuste |codigoLicitacao|numeroLicitacao|anoLicitacao|numeroProcessoADM|anoProcessoADM|mensagem                                       |
  |2020123456789|2019000000001  |00001          |2019        |00001            |2019          |O ajuste de licitação foi excluído com sucesso.|