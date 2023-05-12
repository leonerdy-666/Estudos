#language: pt
Funcionalidade: exclusão Resumo Folha
@ExclusãoAlteraçãoResumoFolha
Esquema do Cenário: 
	Dado que acesso ao menu e ao submenu resumo folha para exclusão para alteração
	Quando preencho o filtro competência "<competencia>" para alteração
	E clico no botao buscar, excluir da tela resumo folha, clico no botão confirmar para alteração
	Então recebo uma mensagem de exclusão na tela de resumo folha "<mensagem>" para alteração
Exemplos:
 |competencia|mensagem                                |
 |22/2000    |O resumo folha foi excluído com sucesso.|
 
 
#/************************************** EXCLUSÃO GERAL **************************************/
@exclusãoAlteração
@exclusãoAlteraçãoFase3Remunerações
Esquema do Cenário: 
  Dado que acesso ao submenu resumo folha para exclusão para alteração
  Quando preencho o filtro competência "<competencia>" para alteração
  E clico no botao buscar, excluir da tela resumo folha, clico no botão confirmar para alteração
  Então recebo uma mensagem de exclusão na tela de resumo folha "<mensagem>" para alteração
Exemplos:
 |competencia|mensagem                                |
 |22/2000    |O resumo folha foi excluído com sucesso.|