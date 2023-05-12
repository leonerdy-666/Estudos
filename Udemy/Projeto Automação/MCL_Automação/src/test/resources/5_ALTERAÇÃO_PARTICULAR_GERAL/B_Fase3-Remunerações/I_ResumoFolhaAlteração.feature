#language: pt
Funcionalidade: Alteração de Resumo Folha
@AlteraçãoResumoFolha
Esquema do Cenário:
 Dado que acesso ao menu fase três remunerações e ao submenu resumo folha para alteração
 Quando preencho o filtro competência "<competencia1>" e clico no botão buscar e alterar 
 E preencho os campos competência "<competencia>", FGTS "<FGTS>", Contribuição Prev Geral "<contribuicaoPrevGeral>" para alteração
 E preencho os campos Contribuição Prev Próprio "<contribuicaoPrevProp>", Contribuição Prev Geral Não Político "<contribuicaoPrevGeralNaoPoli>" e Contribuição Prev Próprio Não Politico "<contribuicaoPrevProprioNaoPoli>" para alteração
 Quando por fim clico no botao salvar da tela resumo folha para alteração
 Então recebo uma mensagem de inclusão do resumo folha "<mensagem>" para alteração
Exemplos:
 |competencia|competencia1|FGTS |contribuicaoPrevGeral|contribuicaoPrevProp|contribuicaoPrevGeralNaoPoli|contribuicaoPrevProprioNaoPoli|mensagem                          |
 |22/2000    |22/2000     |1000 |100	                |200                 |200                         |100                           |Resumo folha alterado com sucesso.|
 
 
#/************************************** ALTERAÇÃO GERAL **************************************/
@AlteraçãoGeral
@AlteraçãoFase3Remunerações
Esquema do Cenário:
 Dado que acesso ao submenu resumo folha para alteração
 Quando preencho o filtro competência "<competencia1>" e clico no botão buscar e alterar 
 E preencho os campos competência "<competencia>", FGTS "<FGTS>", Contribuição Prev Geral "<contribuicaoPrevGeral>" para alteração
 E preencho os campos Contribuição Prev Próprio "<contribuicaoPrevProp>", Contribuição Prev Geral Não Político "<contribuicaoPrevGeralNaoPoli>" e Contribuição Prev Próprio Não Politico "<contribuicaoPrevProprioNaoPoli>" para alteração
 Quando por fim clico no botao salvar da tela resumo folha para alteração
 Então recebo uma mensagem de inclusão do resumo folha "<mensagem>" para alteração
Exemplos:
 |competencia|competencia1|FGTS |contribuicaoPrevGeral|contribuicaoPrevProp|contribuicaoPrevGeralNaoPoli|contribuicaoPrevProprioNaoPoli|mensagem                          |
 |222000     |222000      |1000 |100                  |200                 |200                         |100                           |Resumo folha alterado com sucesso.|
 