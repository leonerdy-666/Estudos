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

public class AjusteStep extends Base {

	/**************** LOCATORS DADOS INICIAIS *****************/
	
	private static By acessoaopainel = By.xpath("//li[4]/a/span");
	private static By acessoaosubmenu = By.linkText("Ajuste");
	private static By botaonovoajuste = By.linkText("Novo Ajuste");
	private static By selecaolicitacao = By.xpath("//button/span");
	private static By itemlicitacao = By.cssSelector("li.ui-autocomplete-item.ui-autocomplete-list-item.ui-corner-all.ui-state-highlight");
	private static By campocodigoAjuste = By.id("ajusteLicitacaoDados:ajusteLicitacaoForm:tabLicitacao:dadosIniciaisDados:codigoAjuste");
	private static By selecaoinstrumento = By.xpath("//label[2]/div/div[3]/span");
	private static By iteminstrumento = By.id("ajusteLicitacaoDados:ajusteLicitacaoForm:tabLicitacao:dadosIniciaisDados:instrumento_1");
	private static By selecaoloteItem = By.xpath("//th/div/div[2]/span");
	private static By botaoproximo = By.linkText("Próximo");
	
	/*Identificação do Ajuste*/
	private static By abaidentificacaoAjuste = By.linkText("Identificação do Ajuste");
	private static By camponContrato = By.id("ajusteLicitacaoDados:ajusteLicitacaoForm:tabLicitacao:identificacaoAjusteDados:numeroContrato");
	private static By campoanoContrato = By.id("ajusteLicitacaoDados:ajusteLicitacaoForm:tabLicitacao:identificacaoAjusteDados:anoContrato");
	private static By campovalorContrato = By.id("ajusteLicitacaoDados:ajusteLicitacaoForm:tabLicitacao:identificacaoAjusteDados:valorContrato_input");
	private static By campoquantidade = By.id("ajusteLicitacaoDados:ajusteLicitacaoForm:tabLicitacao:identificacaoAjusteDados:quantidade_input");
	private static By campounidadeMedida = By.id("ajusteLicitacaoDados:ajusteLicitacaoForm:tabLicitacao:identificacaoAjusteDados:unidadeMedida");
	private static By campoobjetoContrato = By.id("ajusteLicitacaoDados:ajusteLicitacaoForm:tabLicitacao:identificacaoAjusteDados:objetoContrato");
	private static By selecaotipoDocumento = By.xpath("//fieldset[2]/div/div/section/label[2]/div/div[3]/span");
	private static By itemtipoDocumento = By.id("ajusteLicitacaoDados:ajusteLicitacaoForm:tabLicitacao:identificacaoAjusteDados:tipoDocumento_2");
	private static By camponDocumento = By.id("ajusteLicitacaoDados:ajusteLicitacaoForm:tabLicitacao:identificacaoAjusteDados:numeroDocumento");
	private static By camponomeRazao = By.id("ajusteLicitacaoDados:ajusteLicitacaoForm:tabLicitacao:identificacaoAjusteDados:razaoSocial");
	
	private static By botaoproximo1 = By.xpath("//div[2]/footer/a[2]");
	
	/*Financeiro*/
	private static By abaFinanceiro = By.linkText("Financeiro");
	private static By campoclausulaFinanceira = By.id("ajusteLicitacaoDados:ajusteLicitacaoForm:tabLicitacao:financeiroDados:clausulaFinanceira");
	private static By selecaotipoClassificacaoEconomica = By.xpath("//div[3]/fieldset[2]/div/div/section/label[2]/div/div[3]/span");
	private static By itemtipoClassificacaoEconomica = By.id("ajusteLicitacaoDados:ajusteLicitacaoForm:tabLicitacao:financeiroDados:tipoClassificacaoEconomica_1");
	private static By selecaocodigoClassificacaoEconomico = By.xpath("//label[4]/span/button/span");
	private static By itemcodigoClassificacaoEconomico = By.cssSelector("li.ui-autocomplete-item.ui-autocomplete-list-item.ui-corner-all.ui-state-highlight");
	private static By botaoproximo2 = By.xpath("//div[3]/footer/a[2]");
	
	/*Exigências e Claúsulas*/
	private static By abaexigenciasClausulas = By.linkText("Exigências e Cláusulas");
	private static By selecaoexigenciaGarantia = By.xpath("//span/fieldset/div/div/section/label[2]/div/div[3]/span");
	private static By itemexigenciaGarantia = By.id("ajusteLicitacaoDados:ajusteLicitacaoForm:tabLicitacao:exigenciaClasulaDados:exigenciaGarantia_1");
	private static By selecaoexigenciasClausulasPenais = By.xpath("//span/fieldset[2]/div/div/section/label[2]/div/div[3]/span");
	private static By itemexigenciasClausulasPenais = By.id("ajusteLicitacaoDados:ajusteLicitacaoForm:tabLicitacao:exigenciaClasulaDados:exigenciaClasulaPenal_2");
	private static By campoclausulasPenais = By.id("ajusteLicitacaoDados:ajusteLicitacaoForm:tabLicitacao:exigenciaClasulaDados:clasulaPenal");
	private static By botaoproximo3 = By.xpath("//div[4]/footer/a[2]");
	
	/*Gestor e Vigência de Contrato*/
	private static By abavigenciaContrato = By.linkText("Gestor e Vigência do Contrato");
	private static By selecaoservidorDesignado = By.xpath("//div[5]/span/fieldset/div/div/section/label[2]/div/div[3]");
	private static By itemservidorDesignado = By.id("ajusteLicitacaoDados:ajusteLicitacaoForm:tabLicitacao:gestorVigenciaContratoDados:exigenciaServidorDesignado_1");
	private static By selecaovigencia = By.xpath("//div[5]/span/fieldset[2]/div/div/section/label[2]/div/div[3]/span");
	private static By itemvigencia = By.id("ajusteLicitacaoDados:ajusteLicitacaoForm:tabLicitacao:gestorVigenciaContratoDados:vigencia_1");
	private static By selecaodataInicioVigencia = By.id("ajusteLicitacaoDados:ajusteLicitacaoForm:tabLicitacao:gestorVigenciaContratoDados:dataInicio_input");
	private static By selecaodataTerminoVigencia = By.id("ajusteLicitacaoDados:ajusteLicitacaoForm:tabLicitacao:gestorVigenciaContratoDados:dataFim_input");
	private static By selecaodataAssinatura = By.id("ajusteLicitacaoDados:ajusteLicitacaoForm:tabLicitacao:gestorVigenciaContratoDados:dataAssinatura_input");
	private static By itemdataGeral = By.linkText("5");
	private static By botaoproximo4 = By.xpath("//div[5]/footer/a[2]/i");
	
	/*Publicações*/
	private static By abapublicacoes = By.linkText("Publicações");
	private static By selecaopublicacaoVeiculosComunicacao = By.xpath("//div[6]/span/fieldset/div/div/section/label[2]/div/div[3]");
	private static By itempublicacaoVeiculosComunicacao = By.id("ajusteLicitacaoDados:ajusteLicitacaoForm:tabLicitacao:publicacoesDados:houvePublicacaoAjuste_1");

	private static By botaoproximo5 = By.xpath("//div[6]/footer/a[2]");
	
	/*Conclusão*/
	//Responsável pelo ajuste - parte Contratante
	private static By abaconclusão = By.linkText("Conclusão");
	private static By campoCPF = By.id("ajusteLicitacaoDados:ajusteLicitacaoForm:tabLicitacao:conclusaoDados:cpf");
	private static By camponome = By.id("ajusteLicitacaoDados:ajusteLicitacaoForm:tabLicitacao:conclusaoDados:nome");
	private static By campoemailProfissional = By.id("ajusteLicitacaoDados:ajusteLicitacaoForm:tabLicitacao:conclusaoDados:emailProfissional");
	private static By campoemailPessoal = By.id("ajusteLicitacaoDados:ajusteLicitacaoForm:tabLicitacao:conclusaoDados:emailPessoal");
	private static By selecaoassinouContrato = By.xpath("//span/div[3]/section/label[2]/div/div[3]/span");
	private static By itemassinouContrato = By.id("ajusteLicitacaoDados:ajusteLicitacaoForm:tabLicitacao:conclusaoDados:assinouContrato_2");
	private static By botaoadicionar1 = By.id("ajusteLicitacaoDados:ajusteLicitacaoForm:tabLicitacao:conclusaoDados:btnAddContratante");
	
	//Responsável pelo Ajuste - parte Contratado
	private static By campoCPF1 = By.id("ajusteLicitacaoDados:ajusteLicitacaoForm:tabLicitacao:conclusaoDados:cpf2");
	private static By camponome1 = By.id("ajusteLicitacaoDados:ajusteLicitacaoForm:tabLicitacao:conclusaoDados:nome2");
	private static By campoemailProfissional1 = By.id("ajusteLicitacaoDados:ajusteLicitacaoForm:tabLicitacao:conclusaoDados:emailProfissional2");
	private static By campoemailPessoal1 = By.id("ajusteLicitacaoDados:ajusteLicitacaoForm:tabLicitacao:conclusaoDados:emailPessoal2");
	private static By selecaoassinouContrato1 = By.xpath("//fieldset[2]/div/span/div[3]/section/label[2]/div/div[3]/span");
	private static By itemassinouContrato1 = By.id("ajusteLicitacaoDados:ajusteLicitacaoForm:tabLicitacao:conclusaoDados:assinouContrato2_2");
	private static By botaoadicionar2 = By.xpath("//fieldset[2]/div/span/div[3]/section[2]/a/i");
	private static By botaosalvar = By.linkText("Salvar");
	
	private static By mensagemdesucesso = By.xpath("//div/div/div[2]/span");
	
	/**************** LOCATORS EXCLUSÃO AJUSTE ****************/
	
	private static By filtrocodigoAjuste = By.id("filterForm:codigoAjuste");
	private static By filtrocodigoLicitacao = By.id("filterForm:codigoLicitacao");
	private static By filtronumeroLicitacao = By.id("filterForm:numeroLicitacao");
	private static By filtroanoLicitacao = By.id("filterForm:anoLicitacao");
	private static By selecaomodalidade1 = By.xpath("//label[2]/div/div[3]");
	private static By itemmodalidade1 = By.id("filterForm:tipoDeLicitacao_2");
	private static By filtronumeroProcessoADM = By.id("filterForm:numeroProcAdministrativo");
	private static By filtroanoProcessoADM = By.id("filterForm:anoProcAdministrativo");
	private static By botaoBuscar = By.id("filterForm:j_idt75");
	private static By botaoExcluir = By.id("form:consultaTable:0:j_idt113");
	private static By botaoConfirmar = By.id("form:j_idt117");
	private static By mensagemSucessoExclusao = By.xpath("//div[10]/div/div/div[2]/span");
	
	/**************** LOCATORS ALTERAÇÃO ****************/
	
	private static By botaoAlteracao = By.xpath("//td[8]/a[2]");
	private static By campocodigoLicitacao = By.id("filterForm:codigoLicitacao");
	private static By campocodigoLicitacao1 = By.id("ajusteLicitacaoDados:ajusteLicitacaoForm:tabLicitacao:dadosIniciaisDados:licitacao_input");
	private static By itemcodigoLicitacao = By.cssSelector("li.ui-autocomplete-item.ui-autocomplete-list-item.ui-corner-all.ui-state-highlight");
	private static By iteminstrumentoAlteracao = By.id("ajusteLicitacaoDados:ajusteLicitacaoForm:tabLicitacao:dadosIniciaisDados:instrumento_2");
	private static By selecaoloteItemAlteracao = By.xpath("//th/div/div[2]/span");
	private static By selecaotipoDocumentoAlteracao = By.xpath("//div[2]/fieldset/div/div/section/label[2]/div/div[3]");
	private static By itemtipoDocumentoAlteracao = By.id("ajusteLicitacaoDados:ajusteLicitacaoForm:tabLicitacao:identificacaoAjusteDados:tipoDocumento_1");
	private static By camponumeroDocumentoAlteracao = By.id("ajusteLicitacaoDados:ajusteLicitacaoForm:tabLicitacao:identificacaoAjusteDados:numeroDocumento");
	private static By camponotaEmpenhoAlteracao = By.id("ajusteLicitacaoDados:ajusteLicitacaoForm:tabLicitacao:financeiroDados:notaEmpenho2");
	private static By selecaodataFinanceiroAlteracao = By.id("ajusteLicitacaoDados:ajusteLicitacaoForm:tabLicitacao:financeiroDados:dataNotaEmpenho2_input");
	private static By campovalorAlteracao = By.id("ajusteLicitacaoDados:ajusteLicitacaoForm:tabLicitacao:financeiroDados:valorNota2_input");
	private static By selecaofonteRecursoAlteracao = By.xpath("//span/div[2]/section[2]/label[2]/div/div[3]/span");
	private static By itemfonteRecursoAlteracao = By.id("ajusteLicitacaoDados:ajusteLicitacaoForm:tabLicitacao:financeiroDados:fonteRecurso2_1");
	private static By botaoexcluirResponsavel = By.xpath("//td[6]/a/i");
	private static By botaoconfirmaExclusaoResponsavel = By.id("ajusteLicitacaoDados:ajusteLicitacaoForm:tabLicitacao:conclusaoDados:j_idt470"); 
	private static By botaoexcluirResponsavel1 = By.id("ajusteLicitacaoDados:ajusteLicitacaoForm:tabLicitacao:conclusaoDados:dtContratados:0:j_idt458");
	private static By botaoconfirmaExclusaoResponsavel1 = By.id("ajusteLicitacaoDados:ajusteLicitacaoForm:tabLicitacao:conclusaoDados:j_idt474");
	private static By itemassinouContratoAlteracao = By .id("ajusteLicitacaoDados:ajusteLicitacaoForm:tabLicitacao:conclusaoDados:assinouContrato_2");
	private static By itemassinouContratoAlteracao1 = By.id("ajusteLicitacaoDados:ajusteLicitacaoForm:tabLicitacao:conclusaoDados:assinouContrato2_2");
	private static By mensagemAlteracao = By.xpath("//div[10]/div/div/div[2]");
	
	
	/**************** Metódos Inclusão Ajuste ****************/
	
	/*Inclusão Geral*/
	@Dado("que acesso ao submenu ajuste")
	public void que_acesso_ao_submenu_ajuste() throws Exception {
	    waitBase(2);
	    this.clicar(acessoaosubmenu);
	}
	
	@Dado("que acesso ao menu fasequatro e ao submenu ajuste")
	public void que_acesso_ao_menu_fasequatro_e_ao_submenu_ajuste() throws Exception {
	    this.chamaCaminho5pDefinindoTipoLocator(acessoaopainel, acessoaosubmenu, null, null, null);
	}

	@Quando("clico no botao novoajuste")
	public void clico_no_botao_novoajuste() throws Exception {
	    this.clicar(botaonovoajuste);
	}

	@Quando("seleciono os comboboxes licitação e instrumento, preencho o campo código ajuste {string} seleciono o lote item")
	public void seleciono_os_comboboxes_licitação_e_instrumento_preencho_o_campo_código_ajuste_seleciono_o_lote_item(String codigoAjuste) throws Exception {
	    this.selecionaComboId(selecaolicitacao, itemlicitacao);
		waitBase(1);
		this.escrever(campocodigoAjuste, codigoAjuste);
		waitBase(2);
		this.escrever(campocodigoAjuste, codigoAjuste);
	    this.selecionaComboBox(selecaoinstrumento, iteminstrumento);
	    this.clicar(selecaoloteItem);
	}

	@Quando("por fim clico no botão proximo e clico na aba identificação de ajuste")
	public void por_fim_clico_no_botão_proximo_e_clico_na_aba_identificação_de_ajuste() throws Exception {
	    this.VerificaProximaAba(botaoproximo, abaidentificacaoAjuste);
	}

	@Quando("preencho os campos numero do contrato {string}, ano do contrato {string}, valor do contrato {string}, quantidade {string}, unidade de medida {string} e objeto do contrato {string}")
	public void preencho_os_campos_numero_do_contrato_ano_do_contrato_valor_do_contrato_quantidade_unidade_de_medida_e_objeto_do_contrato(String nContrato, String anoContrato, String valoContrato, String quantidade, String unidadeMedida, String objetoContrato) throws Exception {
	    waitBase(2);
		this.escrever(camponContrato, nContrato);
	    waitBase(2);
	    this.escrever(campoanoContrato, anoContrato);
	    waitBase(2);
	    this.escrever(campovalorContrato, valoContrato);
	    waitBase(2);
	    this.escrever(campoquantidade, quantidade);
	    waitBase(2);
	    this.escrever(campounidadeMedida, unidadeMedida);
	    waitBase(2);
	    this.escrever(campoobjetoContrato, objetoContrato);
	}

	@Quando("seleciono o combobox tipo de documento preencho o campos numero do documento {string} e nome Razão social {string}")
	public void seleciono_o_combobox_tipo_de_documento_preencho_o_campos_numero_do_documento_e_nome_Razão_social(String nDocumento, String nomeRazao) throws Exception {
		this.selecionaComboBox(selecaotipoDocumento, itemtipoDocumento);
		waitBase(2);
	    this.escrever(camponDocumento, nDocumento);
	    waitBase(3);
	    this.escrever(camponomeRazao, nomeRazao);
	    waitBase(2);
	    this.escrever(camponomeRazao, nomeRazao);
	}

	@Quando("clico no botão proximo e clico na aba financeiro")
	public void clico_no_botão_proximo_e_clico_na_aba_financeiro() throws Exception {
		VerificaProximaAba(botaoproximo1, abaFinanceiro);
	}

	@Quando("preencho os campos claúsula financeira {string} e seleciono os comboboxes tipo classificação economica e codigo classificação economica")
	public void preencho_os_campos_claúsula_financeira_e_seleciono_os_comboboxes_tipo_classificação_economica_e_codigo_classificação_economica(String clausulaFinanceira) throws Exception {
	    this.escrever(campoclausulaFinanceira, clausulaFinanceira);
	    waitBase(2);
	    this.selecionaComboBox(selecaotipoClassificacaoEconomica, itemtipoClassificacaoEconomica);
	    waitBase(2);
	    this.selecionaComboId(selecaocodigoClassificacaoEconomico, itemcodigoClassificacaoEconomico);
	}

	@Quando("clico no botao proximo e clico na aba exigencias e clausulas")
	public void clico_no_botao_proximo_e_clico_na_aba_exigencias_e_clausulas() throws Exception {
		this.VerificaProximaAba(botaoproximo2, abaexigenciasClausulas);
	}

	@Quando("seleciono os comboboxes exigencia de garantia e preencho os campos valor da garantia {string}, valor garantia do contrato {string} e clausulas de garantia {string}")
	public void seleciono_os_comboboxes_exigencia_de_garantia_e_preencho_os_campos_valor_da_garantia_valor_garantia_do_contrato_e_clausulas_de_garantia(String valorGarantia, String valorGarantiaContrato, String clausulasGarantia) throws Exception {
	    this.selecionaComboBox(selecaoexigenciaGarantia, itemexigenciaGarantia);
	}

	@Quando("seleciono o combobox exigencias de clausulas penais e preencho o campo clausulas penais {string}")
	public void seleciono_o_combobox_exigencias_de_clausulas_penais_e_preencho_o_campo_clausulas_penais(String clausulasPenais) throws Exception {
		this.selecionaComboBox(selecaoexigenciasClausulasPenais, itemexigenciasClausulasPenais);
		waitBase(2);
		this.escrever(campoclausulasPenais, clausulasPenais);
	}

	@Quando("clico no botao proximo e na aba gestor e vigencia do contrato")
	public void clico_no_botao_proximo_e_na_aba_gestor_e_vigencia_do_contrato() throws Exception {
		this.VerificaProximaAba(botaoproximo3, abavigenciaContrato);
	}

	@Quando("seleciono o combobox há servidor designado para a gestão do contrato e preencho os campos CPF {string} e cargo do gestor do contrato {string}")
	public void seleciono_o_combobox_há_servidor_designado_para_a_gestão_do_contrato_e_preencho_os_campos_CPF_e_cargo_do_gestor_do_contrato(String CPFcargo, String cargoGestorContrato) throws Exception {
	    this.selecionaComboBox(selecaoservidorDesignado, itemservidorDesignado);
	}

	@Quando("seleciono o combobox vigencia e seleciono a data do campo data de inicio da vigencia, data de termino da vigencia e data da assinatura")
	public void seleciono_o_combobox_vigencia_e_seleciono_a_data_do_campo_data_de_inicio_da_vigencia_data_de_termino_da_vigencia_e_data_da_assinatura() throws Exception {
	    this.selecionaComboBox(selecaovigencia, itemvigencia);
	    waitBase(2);
	    this.CampoData(selecaodataInicioVigencia, itemdataGeral);
	    waitBase(2);
	    this.CampoData(selecaodataTerminoVigencia, itemdataGeral);
	    waitBase(2);
	    this.CampoData(selecaodataAssinatura, itemdataGeral);
	}

	@Quando("clico no botao proximo e clico na aba publicações")
	public void clico_no_botao_proximo_e_clico_na_aba_publicações() throws Exception {
		this.VerificaProximaAba(botaoproximo4, abapublicacoes);
	}

	@Quando("seleciono o combobox houve publicação do ajuste em veiculos de comunicações")
	public void seleciono_o_combobox_houve_publicação_do_ajuste_em_veiculos_de_comunicações() throws Exception {
	    this.selecionaComboBox(selecaopublicacaoVeiculosComunicacao, itempublicacaoVeiculosComunicacao);
	}

	@Quando("clico no botao proximo e clico na aba conclusão")
	public void clico_no_botao_proximo_e_clico_na_aba_conclusão() throws Exception {
		this.VerificaProximaAba(botaoproximo5, abaconclusão);
	}

	@Quando("preencho os campos CPF {string} nome {string} email profissional {string} email pessoal {string} e seleciono o combobox assinou o contrato")
	public void preencho_os_campos_CPF_nome_email_profissional_email_pessoal_e_seleciono_o_combobox_assinou_o_contrato(String CPF, String nome, String emailProfissional, String emaiPessoal) throws Exception {
	   this.escrever(campoCPF, CPF);
	   waitBase(2);
	   this.escrever(camponome, nome);
	   waitBase(2);
	   this.escrever(campoemailProfissional, emailProfissional);
	   waitBase(2);
	   this.escrever(campoemailPessoal, emaiPessoal);
	   waitBase(2);
	   this.selecionaComboBox(selecaoassinouContrato, itemassinouContrato);
	   waitBase(2);
	   this.clicar(botaoadicionar1);
	}

	@Quando("preencho os campos CPF {string} nome {string} email profissional {string} email pessoal {string} e seleciono o combobox assinou o contrato da área do responsavel contratado")
	public void preencho_os_campos_CPF_nime_email_profissional_email_pessoal_e_seleciono_o_combobox_assinou_o_contrato_da_área_do_responsavel_contratado(String CPF1, String nome1, String emailProfissional1, String emailPessoal1) throws Exception {
	    this.escrever(campoCPF1, CPF1);
	    waitBase(2);
	    this.escrever(camponome1, nome1);
	    waitBase(2);
	    this.escrever(campoemailProfissional1, emailProfissional1);
	    waitBase(2);
	    this.escrever(campoemailPessoal1, emailPessoal1);
	    waitBase(2);
	    this.selecionaComboBox(selecaoassinouContrato1, itemassinouContrato1);
	    waitBase(2);
	    this.clicar(botaoadicionar2);
	}

	@Quando("clico no botao salvar da aba")
	public void clico_no_botao_salvar_da_aba() throws Exception {
	    this.clicar(botaosalvar);
	}

	@Então("recebo uma mensagem de inclusão de ajuste {string}")
	public void recebo_uma_mensagem_de_inclusão_de_ajuste(String mensagem) throws Exception {
		this.VerificaMensagemSucesso(mensagemdesucesso, mensagem);
	}
	
	
	/*************** Exclusão Ajuste ***************/
	
	@Dado("que acesso ao submenu ajustes para exclusão geral")
	public void que_acesso_ao_submenu_ajustes_para_exclusão_geral() throws Exception {
	    this.acessoGeral(acessoaosubmenu);
	}
	
	@Dado("que acesso ao menu fase quatro submenu ajustes para exclusão geral")
	public void que_acesso_ao_menu_fase_quatro_submenu_ajustes_para_exclusão_geral() throws Exception {
	    this.chamaCaminho5pDefinindoTipoLocator(acessoaopainel, acessoaosubmenu, null, null, null);
	}

	@Quando("preencho os filtro codigo do ajuste {string}, codigo da licitação {string},  numero da licitação {string}, ano da licitação {string}, seleciono o combobox modalidade, preencho o campo numero do processo administrativo {string} e ano do processo administrativo {string}")
	public void preencho_os_filtro_codigo_do_ajuste_codigo_da_licitação_numero_da_licitação_ano_da_licitação_seleciono_o_combobox_modalidade_preencho_o_campo_numero_do_processo_administrativo_e_ano_do_processo_administrativo(String codigoAjuste, String codigoLicitacao, String numeroLicitacao, String anoLicitacao, String numeroProcessoADM, String anoProcessoADM) throws Exception {
	    this.escrever(filtrocodigoAjuste, codigoAjuste);
		this.escrever(filtrocodigoLicitacao, codigoLicitacao);
	    this.escrever(filtronumeroLicitacao, numeroLicitacao);
	    this.escrever(filtroanoLicitacao, anoLicitacao);
	    this.selecionaComboBox(selecaomodalidade1, itemmodalidade1);
	    this.escrever(filtronumeroProcessoADM, numeroProcessoADM);
	    this.escrever(filtroanoProcessoADM, anoProcessoADM);
	}
	
	@Quando("clico no botão buscar, excluir e confirmar da tela ajustes")
	public void clico_no_botão_buscar_excluir_e_confirmar_da_tela_ajustes() throws Exception {
	    this.triadeExclusão(botaoBuscar, botaoExcluir, botaoConfirmar);
	}

	@Então("recebo uma mensagem de sucesso na tela ajuste {string}")
	public void recebo_uma_mensagem_de_sucesso_na_tela_ajuste(String mensagem) throws Exception {
		this.VerificaMensagemSucesso(mensagemSucessoExclusao, mensagem);
	}
	
	
	/**************** Alteração Ajuste ****************/
	
	@Dado("que acesso ao menu fase quatro e ao submenu ajustes")
	public void que_acesso_ao_menu_fase_quatro_e_ao_submenu_ajustes() throws Exception {
	    this.chamaCaminho5pDefinindoTipoLocator(acessoaopainel, acessoaosubmenu, null, null, null);
	}

	@Quando("preencho os filtros código do ajuste {string}, código da licitação {string}, número da licitação {string}, ano da licitação {string} seleciono o combobox modalidade, preencho o campo numero do processo administrativo	{string} e ano do processo administrativo {string} para alteração")
	public void preencho_os_filtros_código_do_ajuste_código_da_licitação_número_da_licitação_ano_da_licitação_seleciono_o_combobox_modalidade_preencho_o_campo_numero_do_processo_administrativo_e_ano_do_processo_administrativo_para_alteração(String codigoAjuste, String codigoLicitacao, String numeroLicitacao, String anoLicitacao, String numeroProcessoADM, String anoProcessoADM) throws Exception {
	    this.escrever(filtrocodigoAjuste, codigoAjuste);
	    this.escrever(campocodigoLicitacao, codigoLicitacao);
	    this.escrever(filtronumeroLicitacao, numeroLicitacao);
	    this.escrever(filtroanoLicitacao, anoLicitacao);
	    this.selecionaComboBox(selecaomodalidade1, itemmodalidade1);
	    this.escrever(filtronumeroProcessoADM, numeroProcessoADM);
	    this.escrever(filtroanoProcessoADM, anoProcessoADM);
	} 

	@Quando("clico no botão buscar e alteração")
	public void clico_no_botão_buscar_e_alteração() throws Exception {
	    this.acessaAlteração(botaoBuscar, botaoAlteracao);
	}

	@Quando("preencho o combobox licitação {string}, preencho o campo código do ajuste {string}, seleciono o combobox instrumento e seleciono os lotes itens")
	public void preencho_o_combobox_licitação_preencho_o_campo_código_do_ajuste_seleciono_o_combobox_instrumento_e_seleciono_os_lotes_itens(String codigoLicitacao, String codigoAjuste1) throws Exception {
		this.escreverId(campocodigoLicitacao1, codigoLicitacao, itemcodigoLicitacao);
		waitBase(2);
		this.escrever(campocodigoAjuste, codigoAjuste1);
		this.selecionaComboBox(selecaoinstrumento, iteminstrumentoAlteracao);
		waitBase(2);
		this.clicar(selecaoloteItemAlteracao);
		this.clicar(selecaoloteItemAlteracao);
	}    

	@Quando("clico no botão próximo da aba dados iniciais e clico na aba identificação do ajuste")
	public void clico_no_botão_próximo_da_aba_dados_iniciais_e_clico_na_aba_identificação_do_ajuste() throws Exception {
		this.VerificaProximaAba(botaoproximo, abaidentificacaoAjuste);
	}

	@Quando("seleciono o combobox CPF, preencho o campo número do documento {string} e nome razão social {string}")
	public void seleciono_o_combobox_CPF_preencho_o_campo_número_do_documento_e_nome_razão_social(String numeroDocumento, String nomeRazao) throws Exception {
	    this.selecionaComboBox(selecaotipoDocumentoAlteracao, itemtipoDocumentoAlteracao);
	    this.escrever(camponumeroDocumentoAlteracao, numeroDocumento);
	    this.escrever(camponomeRazao, nomeRazao);
	    waitBase(2);
	    this.escrever(camponomeRazao, nomeRazao);
	}

	@Quando("clico no botão próximo da aba identificação do ajuste e clico na aba financeiro")
	public void clico_no_botão_próximo_da_aba_identificação_do_ajuste_e_clico_na_aba_financeiro() throws Exception {
		this.VerificaProximaAba(botaoproximo1, abaFinanceiro);
	}

	@Quando("preencho os campos nota de empenho documento similar {string}, seleciono a data, preencho o campo valor {string} e seleciono o combobox fonte de recurso")
	public void preencho_os_campos_nota_de_empenho_documento_similar_seleciono_a_data_preencho_o_campo_valor_e_seleciono_o_combobox_fonte_de_recurso(String notaEmpenhoDocumentoSimilar, String valor) throws Exception {
		this.escrever(camponotaEmpenhoAlteracao, notaEmpenhoDocumentoSimilar);
		this.CampoData(selecaodataFinanceiroAlteracao, itemdataGeral);
		this.escrever(campovalorAlteracao, valor);
		this.selecionaComboBox(selecaofonteRecursoAlteracao, itemfonteRecursoAlteracao);
	}

	@Quando("clico no botão próximo da aba financeiro e clico na aba conclusão")
	public void clico_no_botão_próximo_da_aba_financeiro_e_clico_na_aba_conclusão() throws Exception {
		this.VerificaProximaAba(botaoproximo2, abaconclusão);
	}

	@Quando("excluo os responsaveis adicionados anteriormente, preencho os campos CPF {string} nome {string} email profissional {string} email pessoal {string} e seleciono o combobox assinou o contrato para alteração e clico em adicionar")
	public void excluo_os_responsaveis_adicionados_anteriormente_preencho_os_campos_CPF_nome_email_profissional_email_pessoal_e_seleciono_o_combobox_assinou_o_contrato_para_alteração_e_clico_em_adicionar(String CPF, String nome, String emailProfissional, String emailPessoal) throws Exception {
	    this.diadeExclusão(botaoexcluirResponsavel, botaoconfirmaExclusaoResponsavel);
		this.escrever(campoCPF, CPF);
	    this.escrever(camponome, nome);
	    this.escrever(campoemailProfissional, emailProfissional);
	    this.escrever(campoemailPessoal, emailPessoal);
	    this.selecionaComboBox(selecaoassinouContrato, itemassinouContratoAlteracao);
	    this.clicar(botaoadicionar1);
	} 

	@Quando("excluo os responsaveis adicionados anteriormente, preencho os campos CPF {string} nome {string} email profissional {string} email pessoal {string} e seleciono o combobox assinou o contrato da área do responsavel contratado para alteração e clico em adicionar")
	public void excluo_os_responsaveis_adicionados_anteriormente_preencho_os_campos_CPF_nome_email_profissional_email_pessoal_e_seleciono_o_combobox_assinou_o_contrato_da_área_do_responsavel_contratado_para_alteração_e_clico_em_adicionar(String CPF1, String nome1, String emailProfissional1, String emailPessoal1) throws Exception {
		this.diadeExclusão(botaoexcluirResponsavel1, botaoconfirmaExclusaoResponsavel1);
		this.escrever(campoCPF1, CPF1);
		this.escrever(camponome1, nome1);
		this.escrever(campoemailProfissional1, emailProfissional1);
		this.escrever(campoemailPessoal1, emailPessoal1);
		this.selecionaComboBox(selecaoassinouContrato1, itemassinouContratoAlteracao1);
		this.clicar(botaoadicionar2);
	} 

	@Quando("clico no botao salvar da aba conclusão para alteração")
	public void clico_no_botao_salvar_da_aba_conclusão_para_alteração() throws Exception {
	    this.clicar(botaosalvar);
	}

	@Então("recebo uma mensagem de sucesso na alteração do ajuste {string}")
	public void recebo_uma_mensagem_de_sucesso_na_alteração_do_ajuste(String mensagem) {
	    Assert.assertEquals(mensagem, this.obterTexto(mensagemAlteracao));
	}
	
	
	/**************** Exclusão Alteração Ajuste ****************/
	
	/*Exclusão Alteração Geral*/
	@Dado("que acesso ao submenu ajustes para exclusão geral para alteração")
	public void que_acesso_ao_submenu_ajustes_para_exclusão_geral_para_alteração() throws Exception {
	    this.acessoGeral(acessoaosubmenu);
	}
	
	@Dado("que acesso ao menu e ao submenu ajustes para exclusão geral para alteração")
	public void que_acesso_ao_menu_e_ao_submenu_ajustes_para_exclusão_geral_para_alteração() throws Exception {
	    this.chamaCaminho5pDefinindoTipoLocator(acessoaopainel, acessoaosubmenu, null, null, null);
	}

	@Quando("preencho os filtro codigo do ajuste {string}, codigo da licitação {string},  numero da licitação {string}, ano da licitação {string}, seleciono o combobox modalidade, preencho o campo numero do processo administrativo {string} e ano do processo administrativo {string} para alteração")
	public void preencho_os_filtro_codigo_do_ajuste_codigo_da_licitação_numero_da_licitação_ano_da_licitação_seleciono_o_combobox_modalidade_preencho_o_campo_numero_do_processo_administrativo_e_ano_do_processo_administrativo_para_alteração(String codigoAjuste, String codigoLicitacao, String numeroLicitacao, String anoLicitacao, String numeroProcessoADM, String anoProcessoADM) throws Exception {
		this.escrever(filtrocodigoAjuste, codigoAjuste);
		this.escrever(filtrocodigoLicitacao, codigoLicitacao);
	    this.escrever(filtronumeroLicitacao, numeroLicitacao);
	    this.escrever(filtroanoLicitacao, anoLicitacao);
	    this.selecionaComboBox(selecaomodalidade1, itemmodalidade1);
	    this.escrever(filtronumeroProcessoADM, numeroProcessoADM);
	    this.escrever(filtroanoProcessoADM, anoProcessoADM);
	}

	@Quando("clico no botão buscar, excluir e confirmar da tela ajustes para alteração")
	public void clico_no_botão_buscar_excluir_e_confirmar_da_tela_ajustes_para_alteração() throws Exception {
	    this.triadeExclusão(botaoBuscar, botaoExcluir, botaoConfirmar);
	}

	@Então("recebo uma mensagem de sucesso na tela ajuste {string} para alteração")
	public void recebo_uma_mensagem_de_sucesso_na_tela_ajuste_para_alteração(String mensagem) throws Exception {
	    this.VerificaMensagemSucesso(mensagemSucessoExclusao, mensagem);
	}
}