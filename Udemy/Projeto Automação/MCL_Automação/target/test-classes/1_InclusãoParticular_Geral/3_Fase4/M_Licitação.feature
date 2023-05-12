#language:pt
Funcionalidade: Inclusão de Licitação
@InclusãoLicitação
Esquema do Cenário:
	Dado que acesso ao menu fasequatro e ao submenu licitação
	Quando clico no botao nova licitação
	E seleciono os comboboxes é adesão a ata de registro de preços de outro órgão e essa licitação possui órgãos participantes e os ajustes poderão ser realizados por esses órgãos 
	E seleciono o combobox modalidade de licitação
	E preencho o campo n processo administrativo "<nProcessoADM>", ano do processo administrativo "<anoProcessoADM>", n da licitação "<nLicitacao>", ano da licitação "<anoLicitacao>"
	E seleciono o combobox lei de regência e o combobox tipo de natureza
	E seleciono o combobox a licitação é, tipo de objeto preencho o campo valor total estimado da licitação "<valorTotalEstimado>", seleciono o combobox objeto da licitação e preencho os campos descreva o objeto da licitação "<descrevaObjetoLicitacao>"e justificativa para contratação "<justificativaContratacao>"
	Quando clico no botão próximo e clico na aba dados adicionais
	E seleciono os comboboxes tipo de licitação, há previsão de permissão de subcontratação e será aplicado benefício da lc 
	Quando clico no botão próximo e clico na aba pré qualificação
	E seleciono o combobox houve fase de pré qualificação
	Quando clico no botão proximo e clico na aba lote item
	Quando clico no botão ação 
	E preencho os campos descreva o objeto do lote "<descrevaLote>", quantidade "<quantidade>" e unidade "<unidade>"
	E seleciono os combobox o lote possui orçamento, o lote é composto por itens, tipo classificação econômico, código classificação e tipo de execução
	E clico no botão salvar do popup
	Quando clico no botão próximo e clico na aba declaração de existência de recursos
	E seleciono o combobox consta do procedimento declaração que atesta a existência de recursos orçamentários para a contratação 
	Quando clico no botao proximo e na aba lrf
	E seleciono o combobox espécie de despesa
	Quando clico no botão próximo e clico na aba parecer técnico jurídico audiência 
	E seleciono os comboboxes consta do procedimento parecer técnico jurídico atestando a viabilidade da contratação e houve audiência pública relativa ao processo licitatório
	Quando clico no botão próximo e clico na aba edital da segunda fase
	E preencho o campo número do edital "<numeroEdital>" e data do edital
	E seleciono o combobox houve publicação do edital em outros veículos de comunicação e há exigências de garantia para particiação da licitação
	Quando clico no botão próximo e clico na aba datas
	E seleciono os combobox houve entrega de propostas, houve abertura da licitação e houve julgamento
	Quando clico no botão próximo e clico na aba comissão licitação
	E seleciono o combobox existe comissão de licitação
	Quando clico no botão próximo e clico na aba licitantes
	E seleciono o combobox existem licitantes
	Quando clico no botão próximo e clico na aba atestados de desempenho
	E preencho o seleciono o combobox há exigências de atestados de desempenho anterior
	Quando clico no botão próximo e clico na aba índices econônomicos
	E seleciono o combobox há exigencias de índices econômicos mínimos 
	Quando clico no botão próximo e clico na aba amostras
	E seleciono o combobox há exigências de amostras
	Quando clico no botão próximo e clico na aba tributos 
	E seleciono o combobox há exigência de prévia quitação de tributos pelos licitantes 
	Quando clico no botão próximo e na aba julgamento de recursos
	E seleciono o combobox há no procedimento ata de abertura dos documentos de habilitação e há no procedimento ata de julgamento dos documentos de habilitação
	E seleciono os combobox há no procedimento ata de abertura das propostas e há no procedimento ata de julgamento das propostas 
	E seleciono o combobox existe quadro comparativo de preços das propostas
	E seleciono o combobox houve interposição de recurso
	E seleciono o combobox houve ata de sessão pública
	Quando clico no botão próximo e clico na aba homologação
	E seleciono o combobox há no procedimento comprovação da publicação da homologação
	Quando clico no botão próximo e clico na aba adjudicação
	E seleciono o combobox há no procedimento comprovação da publicação da adjudição
	Quando clico no botão próximo e clico na aba autorização
	E seleciono os combobox há nos autos autorização da secretaria estadual da fazenda e do planejamento nos termo do decreto estadual, declaração nos termos do art xviii da instrução, situação do procedimento licitatório e data da situação do procedimento licitatório
	Quando clico no botão salvar da tela autorização
	Então recebo uma mensagem de sucesso da inclusão da licitação "<mensagem>"
Exemplos:
	|nProcessoADM|anoProcessoADM|nLicitacao|anoLicitacao|valorTotalEstimado|descrevaObjetoLicitacao|justificativaContratacao|descrevaLote|quantidade|unidade|numeroEdital|numeroDocumento|nomeRazao|numeroDocumento|nomeRazaoSocial|mensagem                       |
	|01          |2020          |01        |2020        |1500              |TESTE									 |TESTE                   |TESTE       |1500      |UNIDADE|0000000007  |55282912082    |TESTE		 |46610141037    |TESTE	         |Licitação alterada com sucesso.|
	
	
#/************************************** INCLUSÃO GERAL **************************************/
@InclusãoGeral
@inclusãoGeralfase4
Esquema do Cenário:
  Dado que acesso ao menu fasequatro e ao submenu licitação para o caminho feliz
  Quando clico no botao nova licitação
  E seleciono os comboboxes é adesão a ata de registro de preços de outro órgão e essa licitação possui órgãos participantes e os ajustes poderão ser realizados por esses órgãos 
  E seleciono o combobox modalidade de licitação
  E preencho o campo n processo administrativo "<nProcessoADM>", ano do processo administrativo "<anoProcessoADM>", n da licitação "<nLicitacao>", ano da licitação "<anoLicitacao>"
  E seleciono o combobox lei de regência e o combobox tipo de natureza
  E seleciono o combobox a licitação é, tipo de objeto preencho o campo valor total estimado da licitação "<valorTotalEstimado>", seleciono o combobox objeto da licitação e preencho os campos descreva o objeto da licitação "<descrevaObjetoLicitacao>"e justificativa para contratação "<justificativaContratacao>"
  Quando clico no botão próximo e clico na aba dados adicionais
  E seleciono os comboboxes tipo de licitação, há previsão de permissão de subcontratação e será aplicado benefício da lc 
  Quando clico no botão próximo e clico na aba pré qualificação
  E seleciono o combobox houve fase de pré qualificação
  Quando clico no botão proximo e clico na aba lote item
  Quando clico no botão ação 
  E preencho os campos descreva o objeto do lote "<descrevaLote>", quantidade "<quantidade>" e unidade "<unidade>"
  E seleciono os combobox o lote possui orçamento, o lote é composto por itens, tipo classificação econômico, código classificação e tipo de execução
  E clico no botão salvar do popup
  Quando clico no botão próximo e clico na aba declaração de existência de recursos
  E seleciono o combobox consta do procedimento declaração que atesta a existência de recursos orçamentários para a contratação 
  Quando clico no botao proximo e na aba lrf
  E seleciono o combobox espécie de despesa
  Quando clico no botão próximo e clico na aba parecer técnico jurídico audiência 
  E seleciono os comboboxes consta do procedimento parecer técnico jurídico atestando a viabilidade da contratação e houve audiência pública relativa ao processo licitatório
  Quando clico no botão próximo e clico na aba edital da segunda fase
  E preencho o campo número do edital "<numeroEdital>" e data do edital
  E seleciono o combobox houve publicação do edital em outros veículos de comunicação e há exigências de garantia para particiação da licitação
  Quando clico no botão próximo e clico na aba datas
  E seleciono os combobox houve entrega de propostas, houve abertura da licitação e houve julgamento
  Quando clico no botão próximo e clico na aba comissão licitação
  E seleciono o combobox existe comissão de licitação
  Quando clico no botão próximo e clico na aba licitantes
  E seleciono o combobox existem licitantes
  Quando clico no botão próximo e clico na aba atestados de desempenho
  E preencho o seleciono o combobox há exigências de atestados de desempenho anterior
  Quando clico no botão próximo e clico na aba índices econônomicos
  E seleciono o combobox há exigencias de índices econômicos mínimos 
  Quando clico no botão próximo e clico na aba amostras
  E seleciono o combobox há exigências de amostras
  Quando clico no botão próximo e clico na aba tributos 
  E seleciono o combobox há exigência de prévia quitação de tributos pelos licitantes 
  Quando clico no botão próximo e na aba julgamento de recursos
  E seleciono o combobox há no procedimento ata de abertura dos documentos de habilitação e há no procedimento ata de julgamento dos documentos de habilitação
  E seleciono os combobox há no procedimento ata de abertura das propostas e há no procedimento ata de julgamento das propostas 
  E seleciono o combobox existe quadro comparativo de preços das propostas
  E seleciono o combobox houve interposição de recurso
  E seleciono o combobox houve ata de sessão pública
  Quando clico no botão próximo e clico na aba homologação
  E seleciono o combobox há no procedimento comprovação da publicação da homologação
  Quando clico no botão próximo e clico na aba adjudicação
  E seleciono o combobox há no procedimento comprovação da publicação da adjudição
  Quando clico no botão próximo e clico na aba autorização
  E seleciono os combobox há nos autos autorização da secretaria estadual da fazenda e do planejamento nos termo do decreto estadual, declaração nos termos do art xviii da instrução, situação do procedimento licitatório e data da situação do procedimento licitatório
  Quando clico no botão salvar da tela autorização
  Então recebo uma mensagem de sucesso da inclusão da licitação "<mensagem>"
Exemplos:
  |nProcessoADM|anoProcessoADM|nLicitacao|anoLicitacao|valorTotalEstimado|descrevaObjetoLicitacao|justificativaContratacao|descrevaLote|quantidade|unidade|numeroEdital|numeroDocumento|nomeRazao|numeroDocumento|nomeRazaoSocial|mensagem                       |
  |01          |2020          |01        |2020        |1500              |TESTE                  |TESTE                   |TESTE       |1500      |UNIDADE|0000000007  |55282912082    |TESTE    |46610141037    |TESTE          |Licitação alterada com sucesso.|
	
	