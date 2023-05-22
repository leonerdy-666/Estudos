#language: pt
Funcionalidade: Alteração Ajuste
@AlteraçãoAjuste
Esquema do Cenário:
	Dado que acesso ao menu fase quatro e ao submenu ajustes
	Quando preencho os filtros código do ajuste "<codigoAjuste>", código da licitação "<codigoLicitacao>", número da licitação "<numeroLicitacao>", ano da licitação "<anoLicitacao>" seleciono o combobox modalidade, preencho o campo numero do processo administrativo	"<numeroProcessoADM>" e ano do processo administrativo "<anoProcessoADM>" para alteração
	E clico no botão buscar e alteração
	Quando preencho o combobox licitação "<codigoLicitacao>", preencho o campo código do ajuste "<codigoAjuste1>", seleciono o combobox instrumento e seleciono os lotes itens 
	Quando clico no botão próximo da aba dados iniciais e clico na aba identificação do ajuste
	E seleciono o combobox CPF, preencho o campo número do documento "<numeroDocumento>" e nome razão social "<nomeRazao>" 
	Quando clico no botão próximo da aba identificação do ajuste e clico na aba financeiro
	E preencho os campos nota de empenho documento similar "<notaEmpenhoDocumentoSimilar>", seleciono a data, preencho o campo valor "<valor>" e seleciono o combobox fonte de recurso
	Quando clico no botão próximo da aba financeiro e clico na aba conclusão 
	E excluo os responsaveis adicionados anteriormente, preencho os campos CPF "<CPF>" nome "<nome>" email profissional "<emailProfissional>" email pessoal "<emailPessoal>" e seleciono o combobox assinou o contrato para alteração e clico em adicionar
	E excluo os responsaveis adicionados anteriormente, preencho os campos CPF "<CPF1>" nome "<nome1>" email profissional "<emailProfissional1>" email pessoal "<emailPessoal1>" e seleciono o combobox assinou o contrato da área do responsavel contratado para alteração e clico em adicionar
	Quando clico no botao salvar da aba conclusão para alteração
	Então recebo uma mensagem de sucesso na alteração do ajuste "<mensagem>"
Exemplos:
	|codigoAjuste |codigoLicitacao|numeroLicitacao|anoLicitacao|numeroProcessoADM|anoProcessoADM|codigoAjuste1|numeroDocumento|nomeRazao|notaEmpenhoDocumentoSimilar|valor|CPF        |nome  |emailProfissional|emailPessoal    |CPF1       |nome1 |emailProfissional1|emailPessoal1   |mensagem                                 |
	|2020987654321|2019000000001  |00001          |2019        |00001            |2019          |2020987654321|54241392000100 |TESTE2   |12                         |1500 |06756892010|TESTE1|teste@gmail.com  |teste2@gmail.com|00606263055|TESTE2|teste2@gmail.com  |teste2@gmail.com|Ajuste de licitação alterado com sucesso.|
	

#/************************************** ALTERAÇÃO GERAL **************************************/
@AlteraçãoGeral
@AlteraçãoGeralFase4
Esquema do Cenário:
	Dado que acesso ao menu fase quatro e ao submenu ajustes
	Quando preencho os filtros código do ajuste "<codigoAjuste>", código da licitação "<codigoLicitacao>", número da licitação "<numeroLicitacao>", ano da licitação "<anoLicitacao>" seleciono o combobox modalidade, preencho o campo numero do processo administrativo	"<numeroProcessoADM>" e ano do processo administrativo "<anoProcessoADM>" para alteração
	E clico no botão buscar e alteração
	Quando preencho o combobox licitação "<codigoLicitacao>", preencho o campo código do ajuste "<codigoAjuste1>", seleciono o combobox instrumento e seleciono os lotes itens 
	Quando clico no botão próximo da aba dados iniciais e clico na aba identificação do ajuste
	E seleciono o combobox CPF, preencho o campo número do documento "<numeroDocumento>" e nome razão social "<nomeRazao>" 
	Quando clico no botão próximo da aba identificação do ajuste e clico na aba financeiro
	E preencho os campos nota de empenho documento similar "<notaEmpenhoDocumentoSimilar>", seleciono a data, preencho o campo valor "<valor>" e seleciono o combobox fonte de recurso
	Quando clico no botão próximo da aba financeiro e clico na aba conclusão 
	E excluo os responsaveis adicionados anteriormente, preencho os campos CPF "<CPF>" nome "<nome>" email profissional "<emailProfissional>" email pessoal "<emailPessoal>" e seleciono o combobox assinou o contrato para alteração e clico em adicionar
	E excluo os responsaveis adicionados anteriormente, preencho os campos CPF "<CPF1>" nome "<nome1>" email profissional "<emailProfissional1>" email pessoal "<emailPessoal1>" e seleciono o combobox assinou o contrato da área do responsavel contratado para alteração e clico em adicionar
	Quando clico no botao salvar da aba conclusão para alteração
	Então recebo uma mensagem de sucesso na alteração do ajuste "<mensagem>"
Exemplos:
	|codigoAjuste |codigoLicitacao|numeroLicitacao|anoLicitacao|numeroProcessoADM|anoProcessoADM|codigoAjuste1|numeroDocumento|nomeRazao|notaEmpenhoDocumentoSimilar|valor|CPF        |nome  |emailProfissional|emailPessoal    |CPF1       |nome1 |emailProfissional1|emailPessoal1   |mensagem                                 |
	|2020987654321|2019000000001  |00001          |2019        |00001            |2019          |2020987654321|54241392000100 |TESTE2   |12                         |1500 |06756892010|TESTE1|teste@gmail.com  |teste2@gmail.com|00606263055|TESTE2|teste2@gmail.com  |teste2@gmail.com|Ajuste de licitação alterado com sucesso.|