package br.conam.steps.fase4;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import br.conam.core.Base;
import cucumber.api.Scenario;
import cucumber.api.java.AfterStep;
import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Então;

public class ExecucaoStep extends Base {
	
		
	/**************** LOCATORS INCLUSÃO ****************/
	
	private static By acessoaomenu = By.xpath("//li[4]/a/span");
	private static By acessoaosubmenu = By.linkText("Execução");
	private static By botaonovaexecucao = By.linkText("Nova Execução");
	
	/*Ajuste da Licitação*/
	private static By selecaoajusteLicitacao = By.xpath("//button/span");
	private static By itemajusteLicitacao = By.cssSelector("li.ui-autocomplete-item.ui-autocomplete-list-item.ui-corner-all.ui-state-highlight");
	
	/*Dados da Execução*/
	private static By selecaosituacaoAjuste = By.xpath("//label[2]/div/div[3]");
	private static By itemsituacaoAjuste = By.id("execucaoDados:execucaoForm:tabExecucao:dadosFisicosDados:situacaoAjuste_1");
	private static By selecaodataEntregaMaterial = By.id("execucaoDados:execucaoForm:tabExecucao:dadosFisicosDados:dataInicio_input");
	private static By selecaoregimeExecucao = By.xpath("//div[2]/section/label[2]/div/div[3]/span");
	private static By itemregimeExecucao = By.id("execucaoDados:execucaoForm:tabExecucao:dadosFisicosDados:regimeExecucao_1");
	private static By selecaoobjetoDecorrente = By.xpath("//section[2]/label[2]/div/div[3]/span");
	private static By itemobjetoDecorrente = By.id("execucaoDados:execucaoForm:tabExecucao:dadosFisicosDados:decorrenteImportacao_2");
	
	/*Cronograma*/
	private static By selecaoexecucaoContrato = By.xpath("//fieldset[3]/div/section/label[2]/div/div[3]/span");
	private static By itemexecucaoContrato = By.id("execucaoDados:execucaoForm:tabExecucao:dadosFisicosDados:execucaoConformeCronograma_2");
	private static By selecaocasoObraPublica = By.xpath("//fieldset[3]/div/div/section/label[2]/div/div[3]/span");
	private static By itemcasoObraPublica = By.id("execucaoDados:execucaoForm:tabExecucao:dadosFisicosDados:obraParalisada_1");
	private static By campomotivoParalisacao = By.id("execucaoDados:execucaoForm:tabExecucao:dadosFisicosDados:motivoParalisacao");
	
	/*Forma Recebimento*/
	private static By selecaoformaRecebimento = By.xpath("//fieldset[4]/div/div/section/label[2]/div/div[3]/span");
	private static By itemformaRecebimento = By.id("execucaoDados:execucaoForm:tabExecucao:dadosFisicosDados:formaRecebimento_1");
	private static By selecaodataRecebimento = By.id("execucaoDados:execucaoForm:tabExecucao:dadosFisicosDados:dataRecebimento_input");
	private static By selecaoexisteTermo = By.xpath("//fieldset[4]/div/div[2]/section/label[2]/div/div[3]/span");
	private static By itemexisteTermo = By.id("execucaoDados:execucaoForm:tabExecucao:dadosFisicosDados:existeTermoCircunstanciado_2");
	private static By selecaoexisteVistoria = By.xpath("//fieldset[4]/div/div[2]/section[2]/label[2]/div/div[3]/span");
	private static By itemexisteVistoria = By.id("execucaoDados:execucaoForm:tabExecucao:dadosFisicosDados:existeVistoria_2");
	
	/*Inexecução do Contrato*/
	private static By selecaohouveInexecucao = By.xpath("//fieldset[5]/div/div/section/label[2]/div/div[3]/span");
	private static By itemhouveInexecucao = By.id("execucaoDados:execucaoForm:tabExecucao:dadosFisicosDados:houveInexecucaoContrato_1");
	private static By selecaodataAberturaProcedimento = By.id("execucaoDados:execucaoForm:tabExecucao:dadosFisicosDados:dataAberturaProcAdm_input");
	private static By selecaohouveAplicacao = By.xpath("//section[3]/label[2]/div/div[3]/span");
	private static By itemhouveAplicacao = By.id("execucaoDados:execucaoForm:tabExecucao:dadosFisicosDados:houveAplicacaoSansao_2");
	private static By campomotivoInexecucaoContrato = By.id("execucaoDados:execucaoForm:tabExecucao:dadosFisicosDados:motivoInexecucao");
	private static By botaoproximoAbaDadosFisicos = By.linkText("Próximo");
	
	
	/**************** Aba Corpo Técnico ****************/
	
	private static By abacorpoTecnico = By.linkText("Corpo Técnico");
	
	/*Execução Corpo Técnico*/
	private static By selecaoobjetoLicitacaoSericos = By.xpath("//div[2]/fieldset/div/section/label[2]/div/div[3]/span");
	private static By itemobjetoLicitacaoSericos = By.id("execucaoDados:execucaoForm:tabExecucao:corpoTecnicoDados:referePrestacaoServicos_1");
	
	private static By botaoproximoAbaCorpoTecnico = By.xpath("//div[2]/footer/a[2]");
	
	
	/**************** Aba Conferência Medição ****************/
	
	private static By abaconferenciaMedicao = By.linkText("Conferência / Medição");
	
	/*Conferência Medição*/
	private static By selecaohouveConferenciaMedicao = By.xpath("//div[3]/span/fieldset/div/div/section/label[2]/div/div[3]/span");
	private static By itemhouveConferenciaMedicao = By.id("execucaoDados:execucaoForm:tabExecucao:conferenciaMedicaoDados:houveMedicao_2");
	private static By camponumeroMedicao = By.id("execucaoDados:execucaoForm:tabExecucao:conferenciaMedicaoDados:numeroMedicao");
	private static By selecaodataConferenciaMedicao = By.id("execucaoDados:execucaoForm:tabExecucao:conferenciaMedicaoDados:dataMedicao_input");
	private static By itemdataGeral = By.linkText("28");
	private static By campopercentualExecutadoMedicao = By.id("execucaoDados:execucaoForm:tabExecucao:conferenciaMedicaoDados:percExecutado_input");
	private static By selecaohouveSupressaoObraBensServicos = By.xpath("//div[3]/span/fieldset/div/div[2]/section[2]/label[2]/div/div[3]/span");
	private static By itemhouvehouveSupressaoObraBensServicos = By.id("execucaoDados:execucaoForm:tabExecucao:conferenciaMedicaoDados:houveSupressaoObra_1");
	
	private static By botaoproximoAbaConferenciaMedicao = By.xpath("//div[3]/span/footer/a[2]/i");
	
	/**************** Aba Dados Financeiros ****************/
	
	private static By abaDadosFinanceiros = By.linkText("Dados Financeiros");
	
	/*Liquidação ou Documento Similar*/
	private static By selecaohouveLiquidacaoDocumentoSimilar = By.xpath("//div[4]/fieldset/div/div/section/label[2]/div/div[3]/span");
	private static By itemhouveLiquidacaoDocumentoSimilar = By.id("execucaoDados:execucaoForm:tabExecucao:financeiroDados:houveLiquidacao_2");
	private static By selecaonumeroEmpenhoDocumentoSimilar = By.xpath("//div[4]/fieldset/div/div/section[2]/label[2]/div/div[3]/span");
	private static By itemnumeroEmpenhoDocumentoSimilar = By.id("execucaoDados:execucaoForm:tabExecucao:financeiroDados:notaEmpenhoDTO_1");
	private static By selecaodataLiquidacaoDespesa = By.id("execucaoDados:execucaoForm:tabExecucao:financeiroDados:dataLiquidacao_input");
	private static By campovalorLiquidacao = By.id("execucaoDados:execucaoForm:tabExecucao:financeiroDados:valorLiquidacao_input");
	private static By botaoadicionarDadosFinanceiros = By.id("execucaoDados:execucaoForm:tabExecucao:financeiroDados:j_idt359");
	private static By botaosalvarDadosFinanceiros = By.linkText("Salvar");
	private static By mensagemSucesso = By.xpath("//div[10]/div/div/div[2]");
	
	/**************** LOCATORS EXCLUSÃO ****************/
	
	private static By filtrocodigoLicitacao = By.id("filterForm:codigoLicitacao");
	private static By filtrocodigoAjuste = By.id("filterForm:codigoAjuste");
	private static By filtronumeromedicao = By.id("filterForm:numeroMedicao:numeroMedicao_input");
	private static By botaobuscar = By.id("filterForm:j_idt63");
	private static By botaoexcluir = By.xpath("//td[4]/a[3]/i");
	private static By botaoconfirma = By.id("form:j_idt97");
	private static By mensagemdeSucessoExclusao = By.xpath("//div[10]/div/div");
	
	/**************** LOCATORS ALTERAÇÃO ****************/
	
	/*Dados Físicos*/
	private static By botaoAlteracao = By.xpath("//td[4]/a[2]/i");
	private static By campoajusteLicitacaoAlteracao = By.id("execucaoDados:execucaoForm:tabExecucao:dadosFisicosDados:ajusteLicitacao_input");
	private static By itemajustelicitacaoAlteracao = By.cssSelector("li.ui-autocomplete-item.ui-autocomplete-list-item.ui-corner-all.ui-state-highlight");
	private static By itemsituacaoAjusteAlteracao = By.id("execucaoDados:execucaoForm:tabExecucao:dadosFisicosDados:situacaoAjuste_2");
	private static By itemregimeExecucaoAlteracao = By.id("execucaoDados:execucaoForm:tabExecucao:dadosFisicosDados:regimeExecucao_2");
	private static By itemobjetoDecorrenteAlteracao = By.id("execucaoDados:execucaoForm:tabExecucao:dadosFisicosDados:decorrenteImportacao_2");
	private static By itemexecucaoContratoAlteracao = By.id("execucaoDados:execucaoForm:tabExecucao:dadosFisicosDados:execucaoConformeCronograma_2");
	private static By itemcasoObraPublicaAlteracao = By.id("execucaoDados:execucaoForm:tabExecucao:dadosFisicosDados:obraParalisada_1");
	private static By itemformaRecebimentoAlteracao = By.id("execucaoDados:execucaoForm:tabExecucao:dadosFisicosDados:formaRecebimento_1");
	private static By itemexisteTermoAlteracao = By.id("execucaoDados:execucaoForm:tabExecucao:dadosFisicosDados:existeTermoCircunstanciado_2");
	private static By itemexisteVistoriaAlteracao = By.id("execucaoDados:execucaoForm:tabExecucao:dadosFisicosDados:existeVistoria_2");
	private static By itemhouveInexecucaoAlteracao = By.id("execucaoDados:execucaoForm:tabExecucao:dadosFisicosDados:houveInexecucaoContrato_1");
	private static By itemhouveAplicacaoAlteracao = By.id("execucaoDados:execucaoForm:tabExecucao:dadosFisicosDados:houveAplicacaoSansao_2");
	private static By campoCPFServidorResponsavelAlteracao = By.id("execucaoDados:execucaoForm:tabExecucao:dadosFisicosDados:cpf");
	private static By camponomeAlteracao = By.id("execucaoDados:execucaoForm:tabExecucao:dadosFisicosDados:nome");
	private static By campocargoAlteracao = By.id("execucaoDados:execucaoForm:tabExecucao:dadosFisicosDados:cargo");
	private static By botaoAdicionarAlteracao = By.xpath("//section[2]/a/i");
	
	/*Corpo Técnico*/
	private static By itemobjetoLicitacaoAlteracao = By.id("execucaoDados:execucaoForm:tabExecucao:corpoTecnicoDados:referePrestacaoServicos_3");
	
	/*Conferência Medição*/
	private static By itemhouveConferenciaMedicaoAlteracao = By.id("execucaoDados:execucaoForm:tabExecucao:conferenciaMedicaoDados:houveMedicao_2");
	private static By itemhouveSupressaoObraAlteracao = By.id("execucaoDados:execucaoForm:tabExecucao:conferenciaMedicaoDados:houveSupressaoObra_2");
	
	/*Dados Financeiros*/
	private static By itemhouveLiquidacaoAlteracao = By.id("execucaoDados:execucaoForm:tabExecucao:financeiroDados:houveLiquidacao_2");
	private static By itemnumeroEmpenhoDocumentoSimilarAlteracao = By.id("execucaoDados:execucaoForm:tabExecucao:financeiroDados:notaEmpenhoDTO_1");
	private static By mensagemAlteracao = By.xpath("//div[10]/div/div");
	
	
	/**************** Metódos Inclusão Execução ****************/
	
	/*Inclusão Geral*/
	@Dado("que acesso ao submenu execução")
	public void que_acesso_ao_submenu_execução() throws Exception {
		this.acessoGeral(acessoaosubmenu);
	}
	
	@Dado("que acesso ao menu fasequatro e ao submenu execução")
	public void que_acesso_ao_menu_fasequatro_e_ao_submenu_execução() throws Exception {
	    this.chamaCaminho5pDefinindoTipoLocator(acessoaomenu, acessoaosubmenu, null, null, null);
	}

	@Quando("clico no botao nova execução")
	public void clico_no_botao_nova_execução() throws Exception {
	    this.clicar(botaonovaexecucao);
	}

	@Quando("seleciono o combobox ajuste da licitação")
	public void seleciono_o_combobox_ajuste_da_licitação() throws Exception {
	    this.selecionaComboId(selecaoajusteLicitacao, itemajusteLicitacao);
	}

	@Quando("seleciono o combobox situação do ajuste, o campo data de entrega do material ou inicio da execução de serviço obra, qual o regime de execução ou a forma de fornecimento do objeto contratual e trata-se de objeto decorrente de importação")
	public void seleciono_o_combobox_situação_do_ajuste_o_campo_data_de_entrega_do_material_ou_inicio_da_execução_de_serviço_obra_qual_o_regime_de_execução_ou_a_forma_de_fornecimento_do_objeto_contratual_e_trata_se_de_objeto_decorrente_de_importação() throws Exception {
		this.selecionaComboBox(selecaosituacaoAjuste, itemsituacaoAjuste);
		waitBase(2);
		this.CampoData(selecaodataEntregaMaterial, itemdataGeral);
		waitBase(2);
		this.selecionaComboBox(selecaoregimeExecucao, itemregimeExecucao);
		waitBase(2);
		this.selecionaComboBox(selecaoobjetoDecorrente, itemobjetoDecorrente);
	}

	@Quando("seleciono o combobox a execução do contrato está de acordo com o cronograma físico-financeiro ou prazo de entrega pactuado e em caso de obra publica ela está paralisada e preencho o campo motivo da paralisação {string}")
	public void seleciono_o_combobox_a_execução_do_contrato_está_de_acordo_com_o_cronograma_físico_financeiro_ou_prazo_de_entrega_pactuado_e_em_caso_de_obra_publica_ela_está_paralisada_e_preencho_o_campo_motivo_da_paralisação(String motivoParalisacao) throws Exception {
	    this.selecionaComboBox(selecaoexecucaoContrato, itemexecucaoContrato);
	    waitBase(2);
	    this.selecionaComboBox(selecaocasoObraPublica, itemcasoObraPublica);
	    waitBase(2);
	    this.escrever(campomotivoParalisacao, motivoParalisacao);
	}

	@Quando("seleciono o combobox forma de recebimento seleciono a data do campo data do recebimento seleciono o combobox existe termo circunstanciado assinado pelas partes e existe vistoria que comprove a adequação do objeto aos termos contratuais")
	public void seleciono_o_combobox_forma_de_recebimento_seleciono_a_data_do_campo_data_do_recebimento_seleciono_o_combobox_existe_termo_circunstanciado_assinado_pelas_partes_e_existe_vistoria_que_comprove_a_adequação_do_objeto_aos_termos_contratuais() throws Exception {
		wait.until(ExpectedConditions.presenceOfElementLocated(selecaoformaRecebimento));
		this.clicar(selecaoformaRecebimento);
		waitBase(2);
		this.selecionaComboBox(selecaoformaRecebimento, itemformaRecebimento);
		waitBase(2);
	    this.CampoData(selecaodataRecebimento, itemdataGeral);
	    waitBase(2);
	    this.selecionaComboBox(selecaoexisteTermo, itemexisteTermo);
	    waitBase(2);
	    this.selecionaComboBox(selecaoexisteVistoria, itemexisteVistoria);
	}

	@Quando("seleciono o combobox houve inexecução do contrato seleciono o campo data de abertura do procedimento administrativo seleciono o combobox houve aplicação de sanções e preencho o campo motivo da inexecução do contrato {string}")
	public void seleciono_o_combobox_houve_inexecução_do_contrato_seleciono_o_campo_data_de_abertura_do_procedimento_administrativo_seleciono_o_combobox_houve_aplicação_de_sanções_e_preencho_o_campo_motivo_da_inexecução_do_contrato(String motivoInexecucaoContrato) throws Exception {
	    wait.until(ExpectedConditions.presenceOfElementLocated(selecaohouveInexecucao));
		this.selecionaComboBox(selecaohouveInexecucao, itemhouveInexecucao);
		waitBase(2);
	    this.CampoData(selecaodataAberturaProcedimento, itemdataGeral);
	    waitBase(2);
	    this.selecionaComboBox(selecaohouveAplicacao, itemhouveAplicacao);
	    waitBase(2);
	    this.escrever(campomotivoInexecucaoContrato, motivoInexecucaoContrato);
	}

	@Quando("clico no botao próximo e clico na aba corpo técnico")
	public void clico_no_botao_próximo_e_clico_na_aba_corpo_técnico() throws Exception {
	    this.VerificaProximaAba(botaoproximoAbaDadosFisicos, abacorpoTecnico);
	}

	@Quando("seleciono o combobox o corpo técnico e os responsáveis pela obra apresentados pela contratada correspondem com a relação constante no contrato, a contratada mantém preposto junto à obra para representá-la, A administração designou fiscal credenciado junto ao CREA para acompanhar a execução da obra lei")
	public void seleciono_o_combobox_o_corpo_técnico_e_os_responsáveis_pela_obra_apresentados_pela_contratada_correspondem_com_a_relação_constante_no_contrato_a_contratada_mantém_preposto_junto_à_obra_para_representá_la_A_administração_designou_fiscal_credenciado_junto_ao_CREA_para_acompanhar_a_execução_da_obra_lei() throws Exception {
	    waitBase(2);
		this.selecionaComboBox(selecaoobjetoLicitacaoSericos, itemobjetoLicitacaoSericos);
	}

	@Quando("clico no botão próximo e clico na aba conferência medição")
	public void clico_no_botão_próximo_e_clico_na_aba_conferência_medição() throws Exception {
		this.VerificaProximaAba(botaoproximoAbaDadosFisicos, abaconferenciaMedicao);
	}

	@Quando("seleciono o combobox houve conferência medição, preencho o campo número da medição {string}, seleciono a data da conferência medição, preencho o campo percentual executado nessa medição {string}, houve supressão de obra bens ou serviços")
	public void seleciono_o_combobox_houve_conferência_medição_preencho_o_campo_número_da_medição_seleciono_a_data_da_conferência_medição_preencho_o_campo_percentual_executado_nessa_medição_houve_supressão_de_obra_bens_ou_serviços(String numeroMedicao, String percentualExecutado) throws Exception {
	    this.selecionaComboBox(selecaohouveConferenciaMedicao, itemhouveConferenciaMedicao);
	    waitBase(2);
	    this.escrever(camponumeroMedicao, numeroMedicao);
	    waitBase(2);
	    this.clicar(selecaodataConferenciaMedicao);
	    waitBase(2);
	    this.CampoData(selecaodataConferenciaMedicao, itemdataGeral);
	    waitBase(2);
	    this.escrever(campopercentualExecutadoMedicao, percentualExecutado);
	    this.clicar(selecaohouveSupressaoObraBensServicos);
	    waitBase(2);
	    this.selecionaComboBox(selecaohouveSupressaoObraBensServicos, itemhouvehouveSupressaoObraBensServicos);
	}

	@Quando("clico no botão próximo e clico na aba dados financeiros")
	public void clico_no_botão_próximo_e_clico_na_aba_dados_financeiros() throws Exception {
	    this.VerificaProximaAba(botaoproximoAbaConferenciaMedicao, abaDadosFinanceiros);
	}

	@Quando("seleciono o combobox houve liquidação ou documento similar, numero empenho documento similar preencho o campo data da liquidação da despesa e preencho o campo valor da liquidação {string} e clico no botão adicionar")
	public void seleciono_o_combobox_houve_liquidação_ou_documento_similar_numero_empenho_documento_similar_preencho_o_campo_data_da_liquidação_da_despesa_e_preencho_o_campo_valor_da_liquidação_e_clico_no_botão_adicionar(String valorLiquidacao) throws Exception {
	    this.selecionaComboBox(selecaohouveLiquidacaoDocumentoSimilar, itemhouveLiquidacaoDocumentoSimilar);
	    waitBase(2);
	    this.selecionaComboBox(selecaonumeroEmpenhoDocumentoSimilar, itemnumeroEmpenhoDocumentoSimilar);
	    waitBase(2);
	    this.CampoData(selecaodataLiquidacaoDespesa, itemdataGeral);
	    waitBase(2);
	    this.escrever(campovalorLiquidacao, valorLiquidacao);
	    waitBase(2);
	    this.clicar(botaoadicionarDadosFinanceiros);
	    waitBase(2);
	    this.clicar(botaosalvarDadosFinanceiros);
	}

	@Então("recebo uma mensagem de sucesso na tela de execução {string}")
	public void recebo_uma_mensagem_de_sucesso_na_tela_de_execução(String mensagem) throws Exception {
		this.VerificaMensagemSucesso(mensagemSucesso, mensagem);
	}
	
	
	/**************** Metódos Exclusão Execução ****************/
	
	/*Exclusão Geral*/
	@Dado("que acesso ao submenu execução para exclusão geral")
	public void queAcessoAoSubmenuExecuçãoParaExclusãoGeral() throws Exception {
		this.acessoGeral(acessoaosubmenu);
	}

	@Dado("que acesso ao menu fase quatro e ao submenu execução para exclusão")
	public void queAcessoAoMenuFaseQuatroEAoSubmenuExecuçãoParaExclusão() throws Exception {
	    this.chamaCaminho5pDefinindoTipoLocator(acessoaomenu, acessoaosubmenu, null, null, null);;
	}
	@Quando("preencho os filtros código da licitação {string}, código do ajuste {string} e número da medição {string}")
	public void preencho_os_filtros_código_da_licitação_código_do_ajuste_e_número_da_medição(String codigoLicitacao, String codigoAjuste, String numeroMedicao) throws Exception {
	    this.escrever(filtrocodigoLicitacao, codigoLicitacao);
	    this.escrever(filtrocodigoAjuste, codigoAjuste);
	    this.escrever(filtronumeromedicao, numeroMedicao);
	}

	@Quando("clico no botão buscar, no botão excluir e no botão confirmar")
	public void clico_no_botão_buscar_no_botão_excluir_e_no_botão_confirmar() throws Exception {
		this.triadeExclusão(botaobuscar, botaoexcluir, botaoconfirma);
	}

	@Então("me é apresentado uma mensagem {string} de sucesso na tela de execução")
	public void me_é_apresentado_uma_mensagem_de_sucesso_na_tela_de_execução(String mensagem) throws Exception {
		this.VerificaMensagemSucesso(mensagemdeSucessoExclusao, mensagem);
	}
	
	
	 /**************** Metódos alteração ****************/
	
	/*Alteração Geral*/
	@Dado("que acesso ao submenu execução para alteração da execução")
	public void queAcessoAoSubmenuExecuçãoParaAlteraçãoDaExecução() throws Exception {
	    this.acessoGeral(acessoaosubmenu);
	}
	
	@Dado("que acesso ao menu fase quatro e ao submenu execução para alteração")
	public void queAcessoAoMenuFaseQuatroEAoSubmenuExecuçãoParaAlteração() throws Exception {
		waitBase(2);
		this.clicar(acessoaomenu);
		waitBase(2);
		this.clicar(acessoaosubmenu);
	}

	@Quando("preencho os filtros código da licitação {string}, código do ajuste {string} e número da medição {string} para alteração")
	public void preencho_os_filtros_código_da_licitação_código_do_ajuste_e_número_da_medição_para_alteração(String codigoLicitacao, String codigoAjuste, String numeroMedicao) throws Exception {
		waitBase(2);
		this.clicar(filtrocodigoLicitacao);
	    waitBase(2);
		this.escrever(filtrocodigoLicitacao, codigoLicitacao);
	    this.escrever(filtrocodigoAjuste, codigoAjuste);
	    this.escrever(filtronumeromedicao, numeroMedicao);
	}

	@Quando("clico no botão buscar e alterar para alteração")
	public void clico_no_botão_buscar_e_alterar_para_alteração() throws Exception {
	    this.acessaAlteração(botaobuscar, botaoAlteracao);
	}

	@Quando("preencho o combobox ajuste da licitação {string}, seleciono os combobox situação do ajuste, seleciono a data de entrega do material ou início da execução de serviço obra para alteração")
	public void preencho_o_combobox_ajuste_da_licitação_seleciono_os_combobox_situação_do_ajuste_seleciono_a_data_de_entrega_do_material_ou_início_da_execução_de_serviço_obra_para_alteração(String ajusteLicitacao) throws Exception {
	    this.escreverId(campoajusteLicitacaoAlteracao, ajusteLicitacao, itemajustelicitacaoAlteracao);
	    waitBase(2);
	    this.selecionaComboBox(selecaosituacaoAjuste, itemsituacaoAjusteAlteracao);
	    waitBase(2);
	    this.CampoData(selecaodataEntregaMaterial, itemdataGeral);
	}

	@Quando("seleciono o combobox qual o regime de execução ou a forma de fornecimento do objeto contratual e seleciono o combobox trata-se de objeto decorrente de importação para alteração")
	public void seleciono_o_combobox_qual_o_regime_de_execução_ou_a_forma_de_fornecimento_do_objeto_contratual_e_seleciono_o_combobox_trata_se_de_objeto_decorrente_de_importação_para_alteração() throws Exception {
		waitBase(2);
		this.selecionaComboBox(selecaoregimeExecucao, itemregimeExecucaoAlteracao);
		waitBase(2);
		this.selecionaComboBox(selecaoobjetoDecorrente, itemobjetoDecorrenteAlteracao);
	}

	@Quando("seleciono o combobox a execução do contrato está de acordo com o cronograma físico-financeiro ou prazo de entrega pactuado para alteração")
	public void seleciono_o_combobox_a_execução_do_contrato_está_de_acordo_com_o_cronograma_físico_financeiro_ou_prazo_de_entrega_pactuado_para_alteração() throws Exception {
		this.selecionaComboBox(selecaoexecucaoContrato, itemexecucaoContratoAlteracao);
	}

	@Quando("seleciono os comboboxes em caso de obra pública, ela está paralisada e motivo da paralisação {string} para alteração")
	public void seleciono_os_comboboxes_em_caso_de_obra_pública_ela_está_paralisada_e_motivo_da_paralisação_para_alteração(String motivoParalisacao) throws Exception {
	    this.selecionaComboBox(selecaocasoObraPublica, itemcasoObraPublicaAlteracao);
	    waitBase(2);
	    this.escrever(campomotivoParalisacao, motivoParalisacao);
	}

	@Quando("seleciono o comboboxe forma de recebimento, seleciono a data do recebimento, seleciono o combobox existe termo circunstanciado assinado pelas partes e existe vistoria que comprove a adequação do objeto aos termos contratuais para alteração")
	public void seleciono_o_comboboxe_forma_de_recebimento_seleciono_a_data_do_recebimento_seleciono_o_combobox_existe_termo_circunstanciado_assinado_pelas_partes_e_existe_vistoria_que_comprove_a_adequação_do_objeto_aos_termos_contratuais_para_alteração() throws Exception {
		wait.until(ExpectedConditions.presenceOfElementLocated(selecaoformaRecebimento));
		this.clicar(selecaoformaRecebimento);
	    waitBase(2);
		this.selecionaComboBox(selecaoformaRecebimento, itemformaRecebimentoAlteracao);
	    waitBase(2);
		this.selecionaComboBox(selecaodataRecebimento, itemdataGeral);
	    waitBase(2);
		this.selecionaComboBox(selecaoexisteTermo, itemexisteTermoAlteracao);
	    waitBase(2);
		this.selecionaComboBox(selecaoexisteVistoria, itemexisteVistoriaAlteracao);
	}

	@Quando("seleciono o combobox houve inexecução do contrato, seleciono a data de abertura do procedimento administrativo, seleciono o comboboxe houve aplicação de sanções e preencho o campo motivo da inexecução do contrato {string} para alteração")
	public void seleciono_o_combobox_houve_inexecução_do_contrato_seleciono_a_data_de_abertura_do_procedimento_administrativo_seleciono_o_comboboxe_houve_aplicação_de_sanções_e_preencho_o_campo_motivo_da_inexecução_do_contrato_para_alteração(String motivoInexecucao) throws Exception {
	    wait.until(ExpectedConditions.presenceOfElementLocated(selecaohouveInexecucao));
		this.selecionaComboBox(selecaohouveInexecucao, itemhouveInexecucaoAlteracao);
		waitBase(2);
		this.CampoData(selecaodataAberturaProcedimento, itemdataGeral);
		waitBase(2);
		this.selecionaComboBox(selecaohouveAplicacao, itemhouveAplicacaoAlteracao);
		waitBase(2);
		this.escrever(campomotivoInexecucaoContrato, motivoInexecucao);
	}

	@Quando("preencho os campos CPF do servidor responsável {string}, nome {string} cargo {string} e clico no botão adicionar para alteração")
	public void preencho_os_campos_CPF_do_servidor_responsável_nome_cargo_e_clico_no_botão_adicionar_para_alteração(String CPFServidorResponsaveis, String nome, String cargo) throws Exception {
	    waitBase(2);
		this.escrever(campoCPFServidorResponsavelAlteracao, CPFServidorResponsaveis);
	    waitBase(2);
		this.escrever(campoCPFServidorResponsavelAlteracao, CPFServidorResponsaveis);
		waitBase(2);
		this.escrever(camponomeAlteracao, nome);
	    waitBase(2);
		this.escrever(camponomeAlteracao, nome);
		waitBase(2);
		this.escrever(campocargoAlteracao, cargo);
		waitBase(2);
		this.escrever(campocargoAlteracao, cargo);
	    waitBase(2);
		this.clicar(botaoAdicionarAlteracao);
	}

	@Quando("clico no botão próximo da aba dados físicos e clico na aba corpo técnico para alteração")
	public void clico_no_botão_próximo_da_aba_dados_físicos_e_clico_na_aba_corpo_técnico_para_alteração() throws Exception {
	    this.VerificaProximaAba(botaoproximoAbaDadosFisicos, abacorpoTecnico);
	}

	@Quando("seleciono o combobox o objeto da licitação refere-se á prestação de serviços para alteração")
	public void seleciono_o_combobox_o_objeto_da_licitação_refere_se_á_prestação_de_serviços_para_alteração() throws Exception {
	    this.selecionaComboBox(selecaoobjetoLicitacaoSericos, itemobjetoLicitacaoAlteracao);
	}

	@Quando("clico no botão próximo da aba corpo técnico e aba conferência medição para alteração")
	public void clico_no_botão_próximo_da_aba_corpo_técnico_e_aba_conferência_medição_para_alteração() throws Exception {
	    this.VerificaProximaAba(botaoproximoAbaCorpoTecnico, abaconferenciaMedicao);
	}

	@Quando("seleciono o combobox houve conferência medição, preencho o campo número da medição {string} seleciono a data da conferência medição, preencho o campo percentual executado nessa medição {string} e seleciono o combobox houve supressão de obra bens ou serviços? para alteração")
	public void seleciono_o_combobox_houve_conferência_medição_preencho_o_campo_número_da_medição_seleciono_a_data_da_conferência_medição_preencho_o_campo_percentual_executado_nessa_medição_e_seleciono_o_combobox_houve_supressão_de_obra_bens_ou_serviços_para_alteração(String numeroMedicao, String percentualExecutadoMedicao) throws Exception {
	    this.selecionaComboBox(selecaohouveConferenciaMedicao, itemhouveConferenciaMedicaoAlteracao);
	    waitBase(2);
	    this.escrever(camponumeroMedicao, numeroMedicao);
	    waitBase(2);
	    this.clicar(selecaodataConferenciaMedicao);
	    waitBase(2);
	    this.CampoData(selecaodataConferenciaMedicao, itemdataGeral);
	    waitBase(2);
	    this.escrever(campopercentualExecutadoMedicao, percentualExecutadoMedicao);
	    waitBase(2);
	    this.clicar(selecaohouveSupressaoObraBensServicos);
	    waitBase(2);
	    this.selecionaComboBox(selecaohouveSupressaoObraBensServicos, itemhouveSupressaoObraAlteracao);
	}

	@Quando("clico no botão próximo da aba conferência medição e clico na aba dados financeiros para alteração")
	public void clico_no_botão_próximo_da_aba_conferência_medição_e_clico_na_aba_dados_financeiros_para_alteração() throws Exception {
	    this.VerificaProximaAba(botaoproximoAbaConferenciaMedicao, abaDadosFinanceiros);
	}

	@Quando("seleciono o combobox houve liquidação ou documento similar, numero empenho documento similar, seleciono a data da liquidação da despesa e preencho o campo valor da liquidação {string} e clico no botão adicionar para alteração")
	public void seleciono_o_combobox_houve_liquidação_ou_documento_similar_numero_empenho_documento_similar_seleciono_a_data_da_liquidação_da_despesa_e_preencho_o_campo_valor_da_liquidação_e_clico_no_botão_adicionar_para_alteração(String valorLiquidacao) throws Exception {
	    this.selecionaComboBox(selecaohouveLiquidacaoDocumentoSimilar, itemhouveLiquidacaoAlteracao);
	    waitBase(2);
	    this.selecionaComboBox(selecaonumeroEmpenhoDocumentoSimilar, itemnumeroEmpenhoDocumentoSimilarAlteracao);
	    waitBase(2);
	    this.CampoData(selecaodataLiquidacaoDespesa, itemdataGeral);
	    waitBase(2);
	    this.escrever(campovalorLiquidacao, valorLiquidacao);
	    waitBase(2);
	    this.clicar(botaoadicionarDadosFinanceiros);
	}
	
	@Quando("clico no botão salvar para alteração da execução")
	public void clico_no_botão_salvar_para_alteração_da_execução() throws Exception {
	    this.clicar(botaosalvarDadosFinanceiros);
	}

	@Então("recebo uma mensagem de alteração execução {string}")
	public void recebo_uma_mensagem_de_alteração_execução(String mensagem) throws Exception {
		this.VerificaMensagemSucesso(mensagemAlteracao, mensagem);
	}
	
	 /**************** Metódos Exclusão Alteração /****************/

	/*Exclusão Alteração Geral*/
	@Dado("que acesso ao menu fase quatro e ao submenu execução para exclusão geral para alteração")
	public void que_acesso_ao_menu_fase_quatro_e_ao_submenu_execução_para_exclusão_geral_para_alteração() throws Exception {
		waitBase(2);
		this.clicar(acessoaomenu);
		waitBase(2);
		this.clicar(acessoaosubmenu);
		}
	
	@Quando("preencho os filtros código da licitação {string}, código do ajuste {string} e número da medição {string} para exclusão alteração")
	public void preencho_os_filtros_código_da_licitação_código_do_ajuste_e_número_da_medição_para_exclusão_alteração(String codigoLicitacao, String codigoAjuste, String numeroMedicao) throws Exception {
		this.escrever(filtrocodigoLicitacao, codigoLicitacao);
	    this.escrever(filtrocodigoAjuste, codigoAjuste);
	    this.escrever(filtronumeromedicao, numeroMedicao);
	}
	
	@Quando("clico no botão buscar, no botão excluir e no botão confirmar para alteração")
	public void clico_no_botão_buscar_no_botão_excluir_e_no_botão_confirmar_para_alteração() throws Exception {
	    this.triadeExclusão(botaobuscar, botaoexcluir, botaoconfirma);
	}

	@Então("me é apresentado uma mensagem {string} de sucesso na tela de execução para alteração")
	public void me_é_apresentado_uma_mensagem_de_sucesso_na_tela_de_execução_para_alteração(String mensagem) throws Exception {
	    this.VerificaMensagemSucesso(mensagemdeSucessoExclusao, mensagem);
	}

}