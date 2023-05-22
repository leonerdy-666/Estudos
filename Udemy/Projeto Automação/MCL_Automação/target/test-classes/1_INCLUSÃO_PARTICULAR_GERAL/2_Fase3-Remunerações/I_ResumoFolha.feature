#language: pt
Funcionalidade: Inclusão de Resumo Folha
@InclusãoResumoFolha
Esquema do Cenário:
 Dado que acesso ao menu fase três remunerações e ao submenu resumo folha
 Quando clico no botão novoresumofolha 
 E preencho os campos competência "<competencia>", FGTS "<FGTS>", Contribuição Prev Geral "<contribuicaoPrevGeral>"
 E preencho os campos Contribuição Prev Próprio "<contribuicaoPrevProp>", Contribuição Prev Geral Não Político "<contribuicaoPrevGeralNaoPoli>" e Contribuição Prev Próprio Não Politico "<contribuicaoPrevProprioNaoPoli>"
 Quando por fim clico no botao salvar da tela resumo folha
 Então recebo uma mensagem de inclusão do resumo folha "<mensagem>"
Exemplos:
 |competencia|FGTS  |contribuicaoPrevGeral|contribuicaoPrevProp|contribuicaoPrevGeralNaoPoli|contribuicaoPrevProprioNaoPoli|mensagem                          |
 |222000     |1000  |100	                |200                 |200                         |100                           |Resumo folha incluído com sucesso.|
 
 
#/************************************** INCLUSÃO GERAL **************************************/
@InclusãoGeral
@InclusãoGeralFase3Remuneração
Esquema do Cenário:
 Dado que acesso ao submenu resumo folha
 Quando clico no botão novoresumofolha 
 E preencho os campos competência "<competencia>", FGTS "<FGTS>", Contribuição Prev Geral "<contribuicaoPrevGeral>"
 E preencho os campos Contribuição Prev Próprio "<contribuicaoPrevProp>", Contribuição Prev Geral Não Político "<contribuicaoPrevGeralNaoPoli>" e Contribuição Prev Próprio Não Politico "<contribuicaoPrevProprioNaoPoli>"
 Quando por fim clico no botao salvar da tela resumo folha
 Então recebo uma mensagem de inclusão do resumo folha "<mensagem>"
Exemplos:
 |competencia|FGTS  |contribuicaoPrevGeral|contribuicaoPrevProp|contribuicaoPrevGeralNaoPoli|contribuicaoPrevProprioNaoPoli|mensagem                          |
 |222000     |1000  |100                  |200                 |200                         |100                           |Resumo folha incluído com sucesso.| 