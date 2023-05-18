#language: pt
Funcionalidade: Inclusão de Ajuste
@Inclusãoajuste
Esquema do Cenário:
	Dado que acesso ao menu fasequatro e ao submenu ajuste
	Quando clico no botao novoajuste
	E seleciono os comboboxes licitação e instrumento, preencho o campo código ajuste "<codigoAjuste>" seleciono o lote item
	Quando por fim clico no botão proximo e clico na aba identificação de ajuste
	E preencho os campos numero do contrato "<nContrato>", ano do contrato "<anoContrato>", valor do contrato "<valorContrato>", quantidade "<quantidade>", unidade de medida "<unidadeMedida>" e objeto do contrato "<objetoContrato>"
	E seleciono o combobox tipo de documento preencho o campos numero do documento "<nDocumento>" e nome Razão social "<nomeRazao>"
	Quando clico no botão proximo e clico na aba financeiro
	E preencho os campos claúsula financeira "<clausulaFinanceira>" e seleciono os comboboxes tipo classificação economica e codigo classificação economica
	Quando clico no botao proximo e clico na aba exigencias e clausulas
	E seleciono os comboboxes exigencia de garantia e preencho os campos valor da garantia "<valorGarantia>", valor garantia do contrato "<valorContrato>" e clausulas de garantia "<clausulasGarantia>"
	E seleciono o combobox exigencias de clausulas penais e preencho o campo clausulas penais "<clausulasPenais>"
	Quando clico no botao proximo e na aba gestor e vigencia do contrato
	E seleciono o combobox há servidor designado para a gestão do contrato e preencho os campos CPF "<CPF>" e cargo do gestor do contrato "<cargoGestorContrato>"
	E seleciono o combobox vigencia e seleciono a data do campo data de inicio da vigencia, data de termino da vigencia e data da assinatura
	Quando clico no botao proximo e clico na aba publicações
	E seleciono o combobox houve publicação do ajuste em veiculos de comunicações
	Quando clico no botao proximo e clico na aba conclusão 
	E preencho os campos CPF "<CPF>" nome "<nome>" email profissional "<emailProfissional>" email pessoal "<emailPessoal>" e seleciono o combobox assinou o contrato
	E preencho os campos CPF "<CPF>" nome "<nome>" email profissional "<emailProfissional1>" email pessoal "<emailPessoal1>" e seleciono o combobox assinou o contrato da área do responsavel contratado
	Quando clico no botao salvar da aba 
	Então recebo uma mensagem de inclusão de ajuste "<mensagem>"
Exemplos:
	|codigoAjuste |nContrato|anoContrato|valorContrato|quantidade|unidadeMedida|objetoContrato|nDocumento |nomeRazao|clausulaFinanceira|valorGarantia|valorGarantiaContrato|clausulaGarantia|clausulasPenais|CPFcargo   |cargoGestorContrato|descricao|CPF        |nome |emailProfissional|emailPessoal   |CPF1        |nome1 |emailProfissional1|emailPessoal1  |mensagem                                 |
	|2020123456789|0001     |2020       |1500         |1500      |unidade      |TESTE         |39398551705|teste    |TESTE             |1500         |150                  |TESTE           |TESTE          |56540501927|TESTE              |TESTE    |55215006938|TESTE|teste@gmail.com  |teste@gmail.com|73862201899 |TESTE |teste@gmail.com   |teste@gmail.com|Ajuste de licitação alterado com sucesso.|
	
	
#/************************************** INCLUSÃO GERAL **************************************/
@InclusãoGeral
@inclusãoGeralfase4
Esquema do Cenário:
  Dado que acesso ao submenu ajuste
  Quando clico no botao novoajuste
  E seleciono os comboboxes licitação e instrumento, preencho o campo código ajuste "<codigoAjuste>" seleciono o lote item
  Quando por fim clico no botão proximo e clico na aba identificação de ajuste
  E preencho os campos numero do contrato "<nContrato>", ano do contrato "<anoContrato>", valor do contrato "<valorContrato>", quantidade "<quantidade>", unidade de medida "<unidadeMedida>" e objeto do contrato "<objetoContrato>"
  E seleciono o combobox tipo de documento preencho o campos numero do documento "<nDocumento>" e nome Razão social "<nomeRazao>"
  Quando clico no botão proximo e clico na aba financeiro
  E preencho os campos claúsula financeira "<clausulaFinanceira>" e seleciono os comboboxes tipo classificação economica e codigo classificação economica
  Quando clico no botao proximo e clico na aba exigencias e clausulas
  E seleciono os comboboxes exigencia de garantia e preencho os campos valor da garantia "<valorGarantia>", valor garantia do contrato "<valorContrato>" e clausulas de garantia "<clausulasGarantia>"
  E seleciono o combobox exigencias de clausulas penais e preencho o campo clausulas penais "<clausulasPenais>"
  Quando clico no botao proximo e na aba gestor e vigencia do contrato
  E seleciono o combobox há servidor designado para a gestão do contrato e preencho os campos CPF "<CPF>" e cargo do gestor do contrato "<cargoGestorContrato>"
  E seleciono o combobox vigencia e seleciono a data do campo data de inicio da vigencia, data de termino da vigencia e data da assinatura
  Quando clico no botao proximo e clico na aba publicações
  E seleciono o combobox houve publicação do ajuste em veiculos de comunicações
  Quando clico no botao proximo e clico na aba conclusão 
  E preencho os campos CPF "<CPF>" nome "<nome>" email profissional "<emailProfissional>" email pessoal "<emailPessoal>" e seleciono o combobox assinou o contrato
  E preencho os campos CPF "<CPF>" nome "<nome>" email profissional "<emailProfissional1>" email pessoal "<emailPessoal1>" e seleciono o combobox assinou o contrato da área do responsavel contratado
  Quando clico no botao salvar da aba 
  Então recebo uma mensagem de inclusão de ajuste "<mensagem>"
Exemplos:
  |codigoAjuste |nContrato|anoContrato|valorContrato|quantidade|unidadeMedida|objetoContrato|nDocumento |nomeRazao|clausulaFinanceira|valorGarantia|valorGarantiaContrato|clausulaGarantia|clausulasPenais|CPFcargo   |cargoGestorContrato|descricao|CPF        |nome |emailProfissional|emailPessoal   |CPF1        |nome1 |emailProfissional1|emailPessoal1  |mensagem                                 |
  |2020123456789|0001     |2020       |1500         |1500      |unidade      |TESTE         |39398551705|teste    |TESTE             |1500         |150                  |TESTE           |TESTE          |56540501927|TESTE              |TESTE    |55215006938|TESTE|teste@gmail.com  |teste@gmail.com|73862201899 |TESTE |teste@gmail.com   |teste@gmail.com|Ajuste de licitação alterado com sucesso.|