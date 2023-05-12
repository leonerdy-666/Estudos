#language:pt
Funcionalidade: Alteração Licitação
@AlteraçãoLicitação
Esquema do Cenário:
	Dado que acesso ao menu fasequatro e ao submenu licitação para alteração
	Quando preencho os filtro codigo licitação "<codigoLicitacao>" numero da licitação "<numeroLicitacao>", ano da licitação "<anoLicitacao>", seleciono o combo modalidade, numero do processo adminsitrativo "<numeroProcessoADM>" e ano do processo administrativo "<anoProcessoADM>" e clico em buscar e alterar
	E seleciono os combobox é adesão a ata de registro de preços de outro órgão e essa licitação possui órgãos participantes e os ajustes poderão ser realizados por esses órgãos para alteração
	E preencho os campos codigo Licitação "<codigoLicitacao>" n do precesso administrativo "<numeroProcessoADM>" e ano do processo administrativo "<anoProcessoADM>" para alteração
	E seleciono o combobox tipo de natureza para alteração
	E preencho os campos numero da ata de registro de preço utilizada "<numeroAtaRegistro>", data de registro de preço, nome do órgão detentor da ata de registro de preços "<nomeOrgãoRegistro>", numero da licitação "<numeroLicitacao>", data da autorização para alteração
	E preencho o campo validade da ata de registro de preços em meses "<validadeMeses>" para alteração
	E seleciono o combobox a licitação é, tipo de objeto, preencho o campo valor total estimado da licitação "<valorEstimadoLicitacao>", seleciono o combobox objeto da licitação, preencho o campo descreva o objeto da licitação "<objetoLicitacao>" e justificativa para contratação "<justificativaContratacao>" para alteração
	Quando clico no botão próximo da aba dados iniciais e clico na aba dados adicionais para alteração
	E seleciono o combobox tipo de licitação, há previsão de permissão de subcontratação e beneficio da lei complementar micro e epp para alteração
	Quando clico no botão próximo da aba dados adicionais e clico na aba pré qualificação para alteração
	E seleciono o combobox houve fase pré qualificação para alteração
	Quando clico na aba próximo da aba pré qualificação e clico na aba lote item para alteração
	E clico no botão ação, preencho os campos descreva o objeto do lote "<descrevaLote>", quantidade "<quantidade>", unidade "<unidade>", seleciono os combobox lote possui orçamento, o lote é composto por itens. tipo classificação economica, codigo classificação economica e tipo execução e clico em salvar para alteração 
	Quando clico no botão próximo da aba lote itens e clico na aba declaração de existencia de recursos para alteração
	E seleciono o combobox consta do procedimento declaração que atesta a existência de recursos orçamentários para a contratação para alteração
	Quando clico no botão próximo da aba declaração de existência de recursos e clico na aba lrf para alteração
	E seleciono o combobox espécie de despesa para alteração
	Quando clico no botão próximo da aba lrf e clico na aba parecer técnico jurídico audiência para alteração 
	E seleciono o combobox consta do procedimento parecer técnico jurpidico atestando a viabilidade da contratação e houve audiência pública relativa ao processo licitatório para alteração 
	Quando clico no botão próximo da aba parecer técnico jurídico audiência e clico na aba edital para alteração
	E preencho os campso número do edital "<numeroEdital>", data do edital, seleciono o combobox houve publicação do edital em outros veículos de comunicação e há exigência de garantia para participação da licitação para alteração 
	Quando clico no botão próximo da aba edital e clico na aba datas para alteração
	E seleciono os combobox houve entrega de propostas, houve abertura da licitação e houve julgamento para alteração
	Quando clico no botão próximo da aba datas e clico na aba comissão de licitação para alteração
	E seleciono o combobox  existe comissão de licitação para alteração
	Quando clico no botão próximo da aba comissão de licitação e clico na aba licitantes para alteração
	E seleciono o combobox existem licitantes para alteração
	Quando clico no botão próximo da aba licitantes e clico na aba atestado desempenho para alteração 
	E seleciono o combobox há exigência de atestados de desempenho anterior para alteração
	Quando clico no botão próximo e clico na aba indices economicos para alteração
	E seleciono o combobox indices economicos  minimos para alteração
	Quando clico no botão próximo e clico na aba amostras para alteração
	E seleciono o combobox há exigências de amostras para alteração
	Quando clico no botão próximo da aba amostras e clico na aba tributos para alteração
	E seleciono o combobox há exigências de prévia quitação de tributos pelos licitantes para alteração 
	Quando clico no botão próximo da aba tributos e clico na aba julgamento recursos para alteração
	E seleciono os combobox há no procedimento ata de abertura dos documentos de habilitação, ha no procedimento ata de julgamento dos documentos de habilitação para alteração
	E seleciono o combobox há no procedimento ata de abertura das propostas, há no procedimento ata de julgamento das propostas para alteração
	E seleciono o combobox existe quadro comparativo de preços das propostas para alteração
	E seleciono o combobox houve interposição de recurso para alteração
	E seleciono o combobox houve ata de sessão pública para alteração
	Quando clico no botão próximo e clico na aba homologação para alteração
	E seleciono o combobox há no procedimento comprovação da publicação da homologação para alteração 
	Quando clico no botão próximo da aba homologação e clico na aba adjudicação para alteração
	E seleciono o combobox há no procedimento comprovação da publicação da adjudicação para alteração
	Quando clico no botão próximo da aba adjudicação e clico na aba autorização para alteração
	E seleciono o combobox há nos autos autorização da secretaria estadual da fazenda e do planejamento, nos termos do decreto estadual n para alteração
	E seleciono o combobox declaração nos termos do art IIX III XVIII, da instrução para alteração
	Quando clico no botão salvar para alteração
	Então recebo uma mensagem de sucesso de alteração "<mensagem>" para alteracao 
Exemplos: 
	|codigoLicitacao|numeroLicitacao|anoLicitacao|numeroProcessoADM|anoProcessoADM|numeroProcessoADM|anoProcessoADM|numeroAtaRegistro|nomeOrgãoRegistro|numeroLicitação|validadeMeses|valorEstimadoLicitacao|objetoLicitacao|justificativaContratacao|descrevaLote|quantidade|unidade|numeroEdital|mensagem                       |
  |2020123456789  |01             |2020        |01               |2020          |01               |2020          |01               |teste            |01             |12           |1500                  |TESTE          |TESTE                   |TESTE       |1500      |unidade|0000008     |Licitação alterada com sucesso.|
  
  
#/************************************** ALTERAÇÃO GERAL **************************************/
@AlteraçãoGeral
@AlteraçãoGeralFase4
Esquema do Cenário:
	Dado que acesso ao menu fasequatro e ao submenu licitação para alteração
	Quando preencho os filtro codigo licitação "<codigoLicitacao>" numero da licitação "<numeroLicitacao>", ano da licitação "<anoLicitacao>", seleciono o combo modalidade, numero do processo adminsitrativo "<numeroProcessoADM>" e ano do processo administrativo "<anoProcessoADM>" e clico em buscar e alterar
  E seleciono os combobox é adesão a ata de registro de preços de outro órgão e essa licitação possui órgãos participantes e os ajustes poderão ser realizados por esses órgãos para alteração
  E preencho os campos codigo Licitação "<codigoLicitacao>" n do precesso administrativo "<numeroProcessoADM>" e ano do processo administrativo "<anoProcessoADM>" para alteração
  E seleciono o combobox tipo de natureza para alteração
  E preencho os campos numero da ata de registro de preço utilizada "<numeroAtaRegistro>", data de registro de preço, nome do órgão detentor da ata de registro de preços "<nomeOrgãoRegistro>", numero da licitação "<numeroLicitacao>", data da autorização para alteração
  E preencho o campo validade da ata de registro de preços em meses "<validadeMeses>" para alteração
  E seleciono o combobox a licitação é, tipo de objeto, preencho o campo valor total estimado da licitação "<valorEstimadoLicitacao>", seleciono o combobox objeto da licitação, preencho o campo descreva o objeto da licitação "<objetoLicitacao>" e justificativa para contratação "<justificativaContratacao>" para alteração
  Quando clico no botão próximo da aba dados iniciais e clico na aba dados adicionais para alteração
  E seleciono o combobox tipo de licitação, há previsão de permissão de subcontratação e beneficio da lei complementar micro e epp para alteração
  Quando clico no botão próximo da aba dados adicionais e clico na aba pré qualificação para alteração
  E seleciono o combobox houve fase pré qualificação para alteração
  Quando clico na aba próximo da aba pré qualificação e clico na aba lote item para alteração
  E clico no botão ação, preencho os campos descreva o objeto do lote "<descrevaLote>", quantidade "<quantidade>", unidade "<unidade>", seleciono os combobox lote possui orçamento, o lote é composto por itens. tipo classificação economica, codigo classificação economica e tipo execução e clico em salvar para alteração 
  Quando clico no botão próximo da aba lote itens e clico na aba declaração de existencia de recursos para alteração
  E seleciono o combobox consta do procedimento declaração que atesta a existência de recursos orçamentários para a contratação para alteração
  Quando clico no botão próximo da aba declaração de existência de recursos e clico na aba lrf para alteração
  E seleciono o combobox espécie de despesa para alteração
  Quando clico no botão próximo da aba lrf e clico na aba parecer técnico jurídico audiência para alteração 
  E seleciono o combobox consta do procedimento parecer técnico jurpidico atestando a viabilidade da contratação e houve audiência pública relativa ao processo licitatório para alteração 
  Quando clico no botão próximo da aba parecer técnico jurídico audiência e clico na aba edital para alteração
  E preencho os campso número do edital "<numeroEdital>", data do edital, seleciono o combobox houve publicação do edital em outros veículos de comunicação e há exigência de garantia para participação da licitação para alteração 
  Quando clico no botão próximo da aba edital e clico na aba datas para alteração
  E seleciono os combobox houve entrega de propostas, houve abertura da licitação e houve julgamento para alteração
  Quando clico no botão próximo da aba datas e clico na aba comissão de licitação para alteração
  E seleciono o combobox  existe comissão de licitação para alteração
  Quando clico no botão próximo da aba comissão de licitação e clico na aba licitantes para alteração
  E seleciono o combobox existem licitantes para alteração
  Quando clico no botão próximo da aba licitantes e clico na aba atestado desempenho para alteração 
  E seleciono o combobox há exigência de atestados de desempenho anterior para alteração
  Quando clico no botão próximo e clico na aba indices economicos para alteração
  E seleciono o combobox indices economicos  minimos para alteração
  Quando clico no botão próximo e clico na aba amostras para alteração
  E seleciono o combobox há exigências de amostras para alteração
  Quando clico no botão próximo da aba amostras e clico na aba tributos para alteração
  E seleciono o combobox há exigências de prévia quitação de tributos pelos licitantes para alteração 
  Quando clico no botão próximo da aba tributos e clico na aba julgamento recursos para alteração
  E seleciono os combobox há no procedimento ata de abertura dos documentos de habilitação, ha no procedimento ata de julgamento dos documentos de habilitação para alteração
  E seleciono o combobox há no procedimento ata de abertura das propostas, há no procedimento ata de julgamento das propostas para alteração
  E seleciono o combobox existe quadro comparativo de preços das propostas para alteração
  E seleciono o combobox houve interposição de recurso para alteração
  E seleciono o combobox houve ata de sessão pública para alteração
  Quando clico no botão próximo e clico na aba homologação para alteração
  E seleciono o combobox há no procedimento comprovação da publicação da homologação para alteração 
  Quando clico no botão próximo da aba homologação e clico na aba adjudicação para alteração
  E seleciono o combobox há no procedimento comprovação da publicação da adjudicação para alteração
  Quando clico no botão próximo da aba adjudicação e clico na aba autorização para alteração
  E seleciono o combobox há nos autos autorização da secretaria estadual da fazenda e do planejamento, nos termos do decreto estadual n para alteração
  E seleciono o combobox declaração nos termos do art IIX III XVIII, da instrução para alteração
  Quando clico no botão salvar para alteração
  Então recebo uma mensagem de sucesso de alteração "<mensagem>" para alteracao 
Exemplos: 
  |codigoLicitacao|numeroLicitacao|anoLicitacao|numeroProcessoADM|anoProcessoADM|numeroProcessoADM|anoProcessoADM|numeroAtaRegistro|nomeOrgãoRegistro|numeroLicitação|validadeMeses|valorEstimadoLicitacao|objetoLicitacao|justificativaContratacao|descrevaLote|quantidade|unidade|numeroEdital|mensagem                       |
  |2020123456789  |01             |2020        |01               |2020          |01               |2020          |01               |teste            |01             |12           |1500                  |TESTE          |TESTE                   |TESTE       |1500      |unidade|0000008     |Licitação alterada com sucesso.|