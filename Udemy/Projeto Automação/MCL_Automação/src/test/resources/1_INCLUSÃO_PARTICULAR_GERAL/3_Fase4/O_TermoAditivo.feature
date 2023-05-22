#language:pt
Funcionalidade: Inclusão Termo Aditivo
@InclusãotermoAditivo
Esquema do Cenário: 
	Dado que acesso ao menu fase quatro e ao submenu termo aditivo 
	Quando clico no botão novo termo aditivo 
	E seleciono o combobox ajuste da licitação, preencho os campos código termo aditivo "<codigoTermoAditivo>" numero do termo aditivo "<numeroTermo>", ano do termo aditivo "<anoTermo>", valor do termo aditivo "<valorTermo>" e objeto do termo aditivo "<objetoTermo>"
	E seleciono os itens do campo disponiveis e preencho os campos outros descreva "<outrosDescreva>", seleciono o combobox justificativa e preencho o campo justificativa apresentada "<justifiAprese>"
	Quando clico no botão próximo e clico na aba vigência
	E preencho os campos data do início da vigência do termo aditivo, data do término da vigência do termo aditivo e data da assinatura do termo aditivo
	Quando clico no botão próximo e clico na aba financeiro
	E seleciono o combobox houve emissão de nota de empenho documento similar por causa do termo aditivo, preencho o campo nota de empenho documento similar "<notaEmpenho>" e preencho o campo data, valor "<valor>", seleciono o combobox fonte de recursos e clico no botão adicionar
	Quando clico no botão próximo e clico na aba exigências e cláusulas 
	E seleciono os comboboxes possui exigência de garantia e existe autorização para assinatura do termo aditivo e preencho o campo data da autorização
	Quando clico no botão próximo e clico na aba publicações 
	E seleciono o combobox houve publicação do ajuste em veículos de comunicação, veículo, preencho o campo data da publicação, preencho o campo descrição "<descricao>", e seleciono o combobox veículo de divulgação dos atos oficiais e clico no botão adicionar 
	Quando clico próximo e clico na aba conclusão 
	E preencho os campos CPF "<CPF>", nome "<nome>", email profissional "<emailProfissional>", email pessoal "<emailPessoal>" e seleciono o combobox assinou o contrato e clico no botão adicionar
	E preencho os campos CPF "<CPF>", nome "<nome>", email profissional "<emailProfissional>", email pessoal "<emailPessoal>" e seleciono o combobox assinou o contrato e clico no botão adicionar da tela termo aditivo
	Quando clico no botão salvar da tela do termo aditivo 
	Então recebo uma mensagem de sucesso na tela do termo aditivo "<mensagem>"
Exemplos: 
	|codigoTermoAditivo|numeroTermo|anoTermo|valorTermo|objetoTermo|outrosDescreva|justifiAprese|notaEmpenho|valor|descricao|CPF        |nome |emailProfissional              |emailPessoal                   |CPF        |nome |emailProfissional                                    |emailPessoal                                         |mensagem                           |
	|2020123456789     |01         |2020    |1500      |TESTE      |TESTE         |TESTE        |1          |1500 |TESTE    |47899107091|TESTE|franciscodiogoramos@tita.com.br|franciscodiogoramos@tita.com.br|61125287896|TESTE|heitorryansilveira..heitorryansilveira@akadnyx.com.br|heitorryansilveira..heitorryansilveira@akadnyx.com.br|Termo aditivo alterado com sucesso.|
	
	
#/************************************** INCLUSÃO GERAL **************************************/
@InclusãoGeral
@inclusãoGeralfase4
Esquema do Cenário: 
  Dado que acesso ao submenu termo aditivo 
  Quando clico no botão novo termo aditivo 
  E seleciono o combobox ajuste da licitação, preencho os campos código termo aditivo "<codigoTermoAditivo>" numero do termo aditivo "<numeroTermo>", ano do termo aditivo "<anoTermo>", valor do termo aditivo "<valorTermo>" e objeto do termo aditivo "<objetoTermo>"
  E seleciono os itens do campo disponiveis e preencho os campos outros descreva "<outrosDescreva>", seleciono o combobox justificativa e preencho o campo justificativa apresentada "<justifiAprese>"
  Quando clico no botão próximo e clico na aba vigência
  E preencho os campos data do início da vigência do termo aditivo, data do término da vigência do termo aditivo e data da assinatura do termo aditivo
  Quando clico no botão próximo e clico na aba financeiro
  E seleciono o combobox houve emissão de nota de empenho documento similar por causa do termo aditivo, preencho o campo nota de empenho documento similar "<notaEmpenho>" e preencho o campo data, valor "<valor>", seleciono o combobox fonte de recursos e clico no botão adicionar
  Quando clico no botão próximo e clico na aba exigências e cláusulas 
  E seleciono os comboboxes possui exigência de garantia e existe autorização para assinatura do termo aditivo e preencho o campo data da autorização
  Quando clico no botão próximo e clico na aba publicações 
  E seleciono o combobox houve publicação do ajuste em veículos de comunicação, veículo, preencho o campo data da publicação, preencho o campo descrição "<descricao>", e seleciono o combobox veículo de divulgação dos atos oficiais e clico no botão adicionar 
  Quando clico próximo e clico na aba conclusão 
  E preencho os campos CPF "<CPF>", nome "<nome>", email profissional "<emailProfissional>", email pessoal "<emailPessoal>" e seleciono o combobox assinou o contrato e clico no botão adicionar
  E preencho os campos CPF "<CPF>", nome "<nome>", email profissional "<emailProfissional>", email pessoal "<emailPessoal>" e seleciono o combobox assinou o contrato e clico no botão adicionar da tela termo aditivo
  Quando clico no botão salvar da tela do termo aditivo 
  Então recebo uma mensagem de sucesso na tela do termo aditivo "<mensagem>"
Exemplos: 
|codigoTermoAditivo|numeroTermo|anoTermo|valorTermo|objetoTermo|outrosDescreva|justifiAprese|notaEmpenho|valor|descricao|CPF        |nome |emailProfissional              |emailPessoal                   |CPF        |nome |emailProfissional                                    |emailPessoal                                         |mensagem                           |
|2020123456789     |01         |2020    |1500      |TESTE      |TESTE         |TESTE        |1          |1500 |TESTE    |47899107091|TESTE|franciscodiogoramos@tita.com.br|franciscodiogoramos@tita.com.br|61125287896|TESTE|heitorryansilveira..heitorryansilveira@akadnyx.com.br|heitorryansilveira..heitorryansilveira@akadnyx.com.br|Termo aditivo alterado com sucesso.|
	