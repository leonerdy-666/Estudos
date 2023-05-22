#language: pt
Funcionalidade: exclusão ato normativo Geral
@ExclusãoAlteraçãoAtoNormativo
Esquema do Cenário: 
 	Dado que ao entrar no site do google
  Quando preencho o filtro descrição "<descricao>" para alteração
  Quando clico no botão buscar, excluir e confirmar para excluisão do ato normativo para alteração
  Então recebo uma mensagem de exclusão "<mensagem>" para alteração
Exemplos: 
 	|descricao              |mensagem                                 |
 	|Alteração Ato Normativo|O ato normativo foi excluído com sucesso.|

 	
#/************************************** EXCLUSÃO GERAL **************************************/
@ExclusãoAlteraçãoGeral
@exclusãoAlteraçãoFase3
Esquema do Cenário: 
  Dado que acesso ao submenu ato normativo para exclusão para alteração
  Quando preencho o filtro descrição "<descricao>" para alteração
  Quando clico no botão buscar, excluir e confirmar para excluisão do ato normativo para alteração
  Então recebo uma mensagem de exclusão "<mensagem>" para alteração
Exemplos: 
  |descricao              |mensagem                                 |
  |Alteração Ato Normativo|O ato normativo foi excluído com sucesso.|