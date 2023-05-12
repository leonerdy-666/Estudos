#language:pt
Funcionalidade: exclusão Licitação
@ExclusãoAlteraçãoLicitação
Esquema do Cenário: 
	Dado que acesso ao menu fase quatro e ao submenu licitação para exclusão geral para alteração
  Quando preencho os filtros numero da licitação "<numeroLicitacao>" e ano da licitação "<anoLicitacao>" para alteração
  E seleciono o combobox modalidade, preencho os filtros numero do processo administrativo "<numeroProcessoADM>" e ano do processo administrativo "<anoProcessoADM>" para alteração
  Quando clico no botão buscar, excluir e confirmar da tela licitação para alteração
  Então recebo uma mensagem de sucesso da tela licitação "<mensagem>" para alteração
Exemplos:
	|numeroLicitacao|anoLicitacao|numeroProcessoADM|anoProcessoADM|mensagem                             | 
	|01             |2020        |01               |2020          |A licitação foi excluída com sucesso.|
	
	
#/************************************** EXCLUSÃO GERAL **************************************/
@ExclusãoAlteraçãoGeral
@ExclusãoAlteraçãoFase4
Esquema do Cenário: 
  Dado que acesso ao submenu licitação para exclusão geral para alteração
  Quando preencho os filtros numero da licitação "<numeroLicitacao>" e ano da licitação "<anoLicitacao>" para alteração
  E seleciono o combobox modalidade, preencho os filtros numero do processo administrativo "<numeroProcessoADM>" e ano do processo administrativo "<anoProcessoADM>" para alteração
  Quando clico no botão buscar, excluir e confirmar da tela licitação para alteração
  Então recebo uma mensagem de sucesso da tela licitação "<mensagem>" para alteração
Exemplos:
  |numeroLicitacao|anoLicitacao|numeroProcessoADM|anoProcessoADM|mensagem                             | 
  |01             |2020        |01               |2020          |A licitação foi excluída com sucesso.|