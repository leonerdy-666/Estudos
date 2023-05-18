#language: pt
Funcionalidade: Alteração Termo Aditivo
@AlteraçãoTermoAditivo
Esquema do Cenário:
	Dado que acesso ao menu fase quatro e ao submenu termo aditivo para alteração
	Quando preencho os filtros código da licitação "<codigoLicitacao>", código do ajuste "<codigoAjuste>", código do termo aditivo "<codigoTermoAditivo>", número do termo aditivo "<numeroTermoAditivo>" e ano do termo aditivo "<anoTermoAditivo>" para alteração
	Quando clico no botão buscar e no botão alterar para alteração
	E preencho o combobox ajuste da licitação "<ajusteLicitacao>", preencho os campos código do termo aditivo "<codigoTermoAditivo1>", número do termo aditivo "<numeroTermoAditivo1>", ano do termo aditivo "<anoTermoAditivo1>", valor do termo aditivo "<valorTermoAditivo>" e objeto do termo aditivo "<objetoTermoAditivo>" para alteração
	E seleciono os itens do campo disponiveis passando-os para os selecionados, preencho os campos outros descreva "<outrosDescreva>" e seleciono o combobox há no procedimento justificativa para assinatura do termo aditivo para alteração
	Quando clico no botão próximo da aba identificação do termo aditivo e clico na aba vigência para alteração
	E seleciono as datas dos campos data do início da vigência do termo aditivo, data do término da vigência do termo aditivo e data da assinatura do termo aditivo para alteração 
	Quando clico no botão próximo da aba vigência e clico na aba financeiro para alteração
	E excluo a nota de empenho adicionada anteriormente e preencho os campos nota de empenho documento similar "<notaEmpenhoDocumentoSimilar>", seleciono o campo data, preencho o campo valor "<valor>" e seleciono o combobox fonte de recursos e clico no botão para adicionar para alteração 
	Quando clico no botão próximo da aba financeiro e clico na aba exigências e cláusulas para alteração
	E seleciono o combobox possui exigência de garantia, existe autorização para assinatura do termo aditivo para alteração 
	Quando clico no botão próximo da aba exigências clásulas e clico na aba publicações para alteração
		E seleciono o combobox houve publicação do ajuste em veículos de comunicação para alteração
	Quando clico no botão próximo da aba publicações e clico na aba conclusão para alteração
	E excluo o responsável contratante adicionado anteriormente preencho os campos CPF "<CPF>", nome "<nome>", email profissional "<emailProfissional>", email pessoal "<emailPessoal>" e seleciono o combobox assinou o contrato e clico no botão adicionar para alteração termo aditivo
	E excluo o responsavél contratado adicionado anteriormente preencho os campos CPF "<CPF1>", nome "<nome1>", email profissional "<emailProfissional1>", email pessoal "<emailPessoal1>" e seleciono o combobox assinou o contrato e clico no botão adicionar para alteração do termo aditivo
	Então clico no botão salvar e recebo uma mensagem de conclusão na alteração "<mensagem>" 
Exemplos:
	|codigoLicitacao|codigoAjuste|codigoTermoAditivo|numeroTermoAditivo|anoTermoAditivo|ajusteLicitacao|codigoTermoAditivo1|numeroTermoAditivo1|anoTermoAditivo1|valorTermoAditivo|objetoTermoAditivo|outrosDescreva|notaEmpenhoDocumentoSimilar|valor|CPF  	    |nome |emailProfissional|emailPessoal    |CPF1       |nome1 |emailProfissional1|emailPessoal1   |mensagem                           |
	|2020000000221  |221         |2020123456789     |01                |2020           |221            |2020123456789      |01                 |2020            |1.500,00         |TESTE             |TESTE2        |2                          |1500 |00844475084|TESTE|teste@gmail.com  |teste1@gmail.com|26394807079|TESTE1|teste@gmail.com   |teste2@gmail.com|Termo aditivo alterado com sucesso.|
	
	
#/************************************** ALTERAÇÃO GERAL **************************************/
@AlteraçãoGeral
@AlteraçãoGeralFase4
Esquema do Cenário:
	Dado que acesso ao menu fase quatro e ao submenu termo aditivo para alteração
	Quando preencho os filtros código da licitação "<codigoLicitacao>", código do ajuste "<codigoAjuste>", código do termo aditivo "<codigoTermoAditivo>", número do termo aditivo "<numeroTermoAditivo>" e ano do termo aditivo "<anoTermoAditivo>" para alteração
	Quando clico no botão buscar e no botão alterar para alteração
	E preencho o combobox ajuste da licitação "<ajusteLicitacao>", preencho os campos código do termo aditivo "<codigoTermoAditivo1>", número do termo aditivo "<numeroTermoAditivo1>", ano do termo aditivo "<anoTermoAditivo1>", valor do termo aditivo "<valorTermoAditivo>" e objeto do termo aditivo "<objetoTermoAditivo>" para alteração
	E seleciono os itens do campo disponiveis passando-os para os selecionados, preencho os campos outros descreva "<outrosDescreva>" e seleciono o combobox há no procedimento justificativa para assinatura do termo aditivo para alteração
	Quando clico no botão próximo da aba identificação do termo aditivo e clico na aba vigência para alteração
	E seleciono as datas dos campos data do início da vigência do termo aditivo, data do término da vigência do termo aditivo e data da assinatura do termo aditivo para alteração 
	Quando clico no botão próximo da aba vigência e clico na aba financeiro para alteração
	E excluo a nota de empenho adicionada anteriormente e preencho os campos nota de empenho documento similar "<notaEmpenhoDocumentoSimilar>", seleciono o campo data, preencho o campo valor "<valor>" e seleciono o combobox fonte de recursos e clico no botão para adicionar para alteração 
	Quando clico no botão próximo da aba financeiro e clico na aba exigências e cláusulas para alteração
	E seleciono o combobox possui exigência de garantia, existe autorização para assinatura do termo aditivo para alteração 
	Quando clico no botão próximo da aba exigências clásulas e clico na aba publicações para alteração
		E seleciono o combobox houve publicação do ajuste em veículos de comunicação para alteração
	Quando clico no botão próximo da aba publicações e clico na aba conclusão para alteração
	E excluo o responsável contratante adicionado anteriormente preencho os campos CPF "<CPF>", nome "<nome>", email profissional "<emailProfissional>", email pessoal "<emailPessoal>" e seleciono o combobox assinou o contrato e clico no botão adicionar para alteração termo aditivo
	E excluo o responsavél contratado adicionado anteriormente preencho os campos CPF "<CPF1>", nome "<nome1>", email profissional "<emailProfissional1>", email pessoal "<emailPessoal1>" e seleciono o combobox assinou o contrato e clico no botão adicionar para alteração do termo aditivo
	Então clico no botão salvar e recebo uma mensagem de conclusão na alteração "<mensagem>" 
Exemplos:
	|codigoLicitacao|codigoAjuste|codigoTermoAditivo|numeroTermoAditivo|anoTermoAditivo|ajusteLicitacao|codigoTermoAditivo1|numeroTermoAditivo1|anoTermoAditivo1|valorTermoAditivo|objetoTermoAditivo|outrosDescreva|notaEmpenhoDocumentoSimilar|valor|CPF  	    |nome |emailProfissional|emailPessoal    |CPF1       |nome1 |emailProfissional1|emailPessoal1   |mensagem                           |
	|2020000000221  |221         |2020123456789     |01                |2020           |221            |2020123456789      |01                 |2020            |1.500,00         |TESTE             |TESTE2        |2                          |1500 |00844475084|TESTE|teste@gmail.com  |teste1@gmail.com|26394807079|TESTE1|teste@gmail.com   |teste2@gmail.com|Termo aditivo alterado com sucesso.|