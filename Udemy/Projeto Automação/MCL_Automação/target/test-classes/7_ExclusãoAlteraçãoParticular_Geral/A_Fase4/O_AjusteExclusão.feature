#language: pt
Funcionalidade: exclusão Ajuste Geral
@ExclusãoAlteraçãoAjuste
Esquema do Cenário: 
	Dado que acesso ao menu e ao submenu ajustes para exclusão geral para alteração
	Quando preencho os filtro codigo do ajuste "<codigoAjuste>", codigo da licitação "<codigoLicitacao>",  numero da licitação "<numeroLicitacao>", ano da licitação "<anoLicitacao>", seleciono o combobox modalidade, preencho o campo numero do processo administrativo "<numeroProcessoADM>" e ano do processo administrativo "<anoProcessoADM>" para alteração
  Quando clico no botão buscar, excluir e confirmar da tela ajustes para alteração
  Então recebo uma mensagem de sucesso na tela ajuste "<mensagem>" para alteração
Exemplos: 
  |codigoAjuste |codigoLicitacao|numeroLicitacao|anoLicitacao|numeroProcessoADM|anoProcessoADM|mensagem                                       |
  |2020123456789|2019000000001  |00001          |2019        |00001            |2019          |O ajuste de licitação foi excluído com sucesso.|
	
	
#/************************************** EXCLUSÃO GERAL **************************************/
@ExclusãoAlteraçãoGeral
@ExclusãoAlteraçãoFase4
Esquema do Cenário: 
  Dado que acesso ao submenu ajustes para exclusão geral para alteração
  Quando preencho os filtro codigo do ajuste "<codigoAjuste>", codigo da licitação "<codigoLicitacao>",  numero da licitação "<numeroLicitacao>", ano da licitação "<anoLicitacao>", seleciono o combobox modalidade, preencho o campo numero do processo administrativo "<numeroProcessoADM>" e ano do processo administrativo "<anoProcessoADM>" para alteração
  Quando clico no botão buscar, excluir e confirmar da tela ajustes para alteração
  Então recebo uma mensagem de sucesso na tela ajuste "<mensagem>" para alteração
Exemplos: 
  |codigoAjuste |codigoLicitacao|numeroLicitacao|anoLicitacao|numeroProcessoADM|anoProcessoADM|mensagem                                       |
  |2020123456789|2019000000001  |00001          |2019        |00001            |2019          |O ajuste de licitação foi excluído com sucesso.|
