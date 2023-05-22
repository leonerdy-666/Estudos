#language: pt
Funcionalidade: Alteração de Quadro Pessoal
@AlteraçãoQuadroPessoal
Esquema do Cenário: 
	Dado que acesso ao menu fasetres e ao submenu quadro de pessoal para alteração
	Quando preencho o filtro cargo "<cargo1>", clico no botão buscar e alterar 
	E preencho o combobox cargo "<cargo>" e preencho os campos quantidade total vagas "<quantidadeTotalVagas>", quantidade vagas providas "<quantidadeVagasProvidas>" e quantidade vagas não providas "<quantidadeVagasNaoProvidas>" para alteração
	Quando por fim clico no botão salvar para salvar a alteração
	Então recebo uma mensagem aprovando a alteração do quadro Pessoal "<mensagem>" 
Exemplos: 
	|cargo1         |cargo          |quantidadeTotalVagas|quantidadeVagasProvidas|quantidadeVagasNaoProvidas|mensagem                            |
	|Alteração Cargo|Alteração Cargo|100                 |100                    |100                       |Quadro pessoal alterado com sucesso.|
	
	
#/************************************** ALTERAÇÃO GERAL **************************************/
@AlteraçãoGeral
@AlteraçãoFase3
Esquema do Cenário: 
  Dado que acesso ao submenu quadro de pessoal para alteração
  Quando preencho o filtro cargo "<cargo1>", clico no botão buscar e alterar 
  E preencho o combobox cargo "<cargo>" e preencho os campos quantidade total vagas "<quantidadeTotalVagas>", quantidade vagas providas "<quantidadeVagasProvidas>" e quantidade vagas não providas "<quantidadeVagasNaoProvidas>" para alteração
  Quando por fim clico no botão salvar para salvar a alteração
  Então recebo uma mensagem aprovando a alteração do quadro Pessoal "<mensagem>" 
Exemplos: 
  |cargo1         |cargo          |quantidadeTotalVagas|quantidadeVagasProvidas|quantidadeVagasNaoProvidas|mensagem                            |
  |Alteração Cargo|Alteração Cargo|100                 |100                    |100                       |Quadro pessoal alterado com sucesso.|