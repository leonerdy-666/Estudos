#language: pt
Funcionalidade: exclusão Resumo Folha
@exclusãoResumoFolha
Esquema do Cenário: 
	Dado que acesso ao meno fase três remunerações e ao submenu resumo folha
	Quando preencho o filtro competência "<competencia>"
	E clico no botao buscar, excluir da tela resumo folha, clico no botão confirmar
	Então recebo uma mensagem de exclusão na tela de resumo folha "<mensagem>"
Exemplos:
 |competencia|mensagem                                |
 |222000     |O resumo folha foi excluído com sucesso.|
 
 
#/************************************** EXCLUSÃO GERAL **************************************/
@ExclusãoGeral
@exclusãofase3Remunerações
Esquema do Cenário: 
	Dado que acesso ao submenu resumo folha para exclusão
	Quando preencho o filtro competência "<competencia>"
  E clico no botao buscar, excluir da tela resumo folha, clico no botão confirmar
  Então recebo uma mensagem de exclusão na tela de resumo folha "<mensagem>"
Exemplos:
 |competencia|mensagem                                |
 |222000     |O resumo folha foi excluído com sucesso.|