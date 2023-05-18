#language:pt
Funcionalidade: exclusão Licitação	
@ExclusãoLicitação
Esquema do Cenário: 
	Dado que acesso ao painel fase quatro e ao submenu licitação para exclusão geral
	Quando preencho os filtros codigo Licitação "<codigoLicitacao>", numero da licitação "<numeroLicitacao>" e ano da licitação "<anoLicitacao>"
	E seleciono o combobox modalidade, preencho os filtros numero do processo administrativo "<numeroProcessoADM>" e ano do processo administrativo "<anoProcessoADM>"
	Quando clico no botão buscar, excluir e confirmar da tela licitação
	Então recebo uma mensagem de sucesso da tela licitação "<mensagem>"
Exemplos:
	|codigoLicitacao|numeroLicitacao|anoLicitacao|numeroProcessoADM|anoProcessoADM|mensagem                             | 
	|2020123456789  |01             |2020        |01               |2020          |A licitação foi excluída com sucesso.|


#/************************************** EXCLUSÃO GERAL **************************************/
@ExclusãoGeral
@ExclusãoFase4
Esquema do Cenário: 
	Dado que acesso ao painel fase quatro e ao submenu licitação para exclusão geral
	Quando preencho os filtros codigo Licitação "<codigoLicitacao>", numero da licitação "<numeroLicitacao>" e ano da licitação "<anoLicitacao>"
  E seleciono o combobox modalidade, preencho os filtros numero do processo administrativo "<numeroProcessoADM>" e ano do processo administrativo "<anoProcessoADM>"
  Quando clico no botão buscar, excluir e confirmar da tela licitação
  Então recebo uma mensagem de sucesso da tela licitação "<mensagem>"
Exemplos:
  |codigoLicitacao|numeroLicitacao|anoLicitacao|numeroProcessoADM|anoProcessoADM|mensagem                             | 
  |2020123456789  |01             |2020        |01               |2020          |A licitação foi excluída com sucesso.|