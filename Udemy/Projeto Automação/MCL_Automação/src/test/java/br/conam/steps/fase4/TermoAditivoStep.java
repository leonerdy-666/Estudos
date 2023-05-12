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


public class TermoAditivoStep extends Base {

	/*********************************** LOCATORS INCLUSÃO ***********************************/
	
	/***************** Aba Identificação do Termo Aditivo *****************/
	
	private static By acessoPainel = By.linkText("Fase 4");
	private static By acessoSubMenu = By.linkText("Termo Aditivo");
	private static By botaonovoTermoAditivo = By.linkText("Novo Termo Aditivo");
	
	/*Identificação do Termo Aditivo*/
	private static By selecaoajusteLicitacao = By.xpath("//button/span");
	private static By itemajusteLicitacao = By.cssSelector("li.ui-autocomplete-item.ui-autocomplete-list-item.ui-corner-all.ui-state-highlight");
	private static By campocodigoTermoAditivo = By.id("termoAditivoDados:termoAditivoForm:tabTermoAditivo:identificacaoDados:codigo");
	private static By camponumeroTermoAditivo = By.id("termoAditivoDados:termoAditivoForm:tabTermoAditivo:identificacaoDados:numero");
	private static By campoanoTermoAditivo = By.id("termoAditivoDados:termoAditivoForm:tabTermoAditivo:identificacaoDados:ano");
	private static By campovalorTermoAditivo = By.id("termoAditivoDados:termoAditivoForm:tabTermoAditivo:identificacaoDados:valor_input");
	private static By campoobjetoTermoAditivo = By.id("termoAditivoDados:termoAditivoForm:tabTermoAditivo:identificacaoDados:objeto");
	private static By setaSelecaoTermoAditivo = By.xpath("//button[2]/span");
	private static By campooutrosDescreva = By.id("termoAditivoDados:termoAditivoForm:tabTermoAditivo:identificacaoDados:outros");
	
	/*Justificativa*/
	private static By selecaohaProcedimentoJustificativa = By.xpath("//label[2]/div/div[3]/span");
	private static By itemhaProcedimentoJustificativa = By.id("termoAditivoDados:termoAditivoForm:tabTermoAditivo:identificacaoDados:existeProcedimentoJustificativa_2");
	private static By campojustificativaApresentada = By.id("termoAditivoDados:termoAditivoForm:tabTermoAditivo:identificacaoDados:justificativa");
	
	private static By botaoproximoabaIdentificacaoTermoAditivo = By.linkText("Próximo");
	
	
	/***************** Aba Vigência *****************/
	
	private static By abaVigencia = By.linkText("Vigência");
	
	/*Vigência*/
	private static By selecaodataInicioVigencia = By.id("termoAditivoDados:termoAditivoForm:tabTermoAditivo:vigenciaDados:dataInicio_input");
	private static By selecaodataTerminoVigenciaAditivo = By.id("termoAditivoDados:termoAditivoForm:tabTermoAditivo:vigenciaDados:dataFim_input");
	private static By selecaodataAssinaturaTermoAditivo = By.id("termoAditivoDados:termoAditivoForm:tabTermoAditivo:vigenciaDados:dataAssinatura_input");
	private static By itemDataGeral = By.linkText("10");
	
	private static By botaoproximoAbaVigencia = By.xpath("//div[2]/footer/a[2]/i");
	
	
	/***************** Aba Financeiro *****************/
	
	private static By abaFinanceiro = By.linkText("Financeiro");
	
	/*Nota de Empenho/Documento Similar*/
	private static By selecaohouveEmissaoNotaEmpenho = By.xpath("//div/div/section/label[2]/div/div[3]/span");
	private static By itemhouveEmissaoNotaEmpenho = By.id("termoAditivoDados:termoAditivoForm:tabTermoAditivo:financeiroDados:houveEmissaoNotaEmpenho_2");
	private static By camponotaEmpenhoDocumento = By.id("termoAditivoDados:termoAditivoForm:tabTermoAditivo:financeiroDados:numero");
	private static By selecaodataFinanceira = By.id("termoAditivoDados:termoAditivoForm:tabTermoAditivo:financeiroDados:data_input");
	private static By campovalor = By.id("termoAditivoDados:termoAditivoForm:tabTermoAditivo:financeiroDados:valor_input");
	private static By selecaofonteRecurso = By.xpath("//section[2]/label[2]/div/div[3]/span");
	private static By itemfonteRecurso = By.id("termoAditivoDados:termoAditivoForm:tabTermoAditivo:financeiroDados:fonteRecurso_1");
	
	private static By botaoadicionar = By.id("termoAditivoDados:termoAditivoForm:tabTermoAditivo:financeiroDados:btnAddNota");
	private static By botaoproximoabaFinanceiro = By.xpath("//div[3]/footer/a[2]");
	
	
	/***************** Exigências e Claúsulas *****************/
	
	private static By abaExigeciasClausulas = By.linkText("Exigências e Cláusulas");
	
	/*Reforço da Garantia*/
	private static By selecaopossuiExigenciaGarantia = By.xpath("//div[4]/fieldset/div/div/section/label[2]/div/div[3]/span");
	private static By itempossuiExigenciaGarantia = By.id("termoAditivoDados:termoAditivoForm:tabTermoAditivo:exigenciaClasulaDados:possuiExigenciaGarantia_2");
	
	/*Autorização do Termo Aditivo*/
	private static By selecaoexisteAutorizacaoAssinatura = By.xpath("//fieldset[2]/div/div/section/label[2]/div/div[3]/span");
	private static By itemexisteAutorizacaoAssinatura = By.id("termoAditivoDados:termoAditivoForm:tabTermoAditivo:exigenciaClasulaDados:possuiAutorizacaoAssinatura_2");
	private static By selecaodataAutorizacao = By.id("termoAditivoDados:termoAditivoForm:tabTermoAditivo:exigenciaClasulaDados:dataAutorizacao_input");
	
	private static By botaoproximoabaExigenciasClausulas = By.xpath("//div[4]/footer/a[2]"); 
	
	
	/**************** Publicações ****************/
	
	private static By abaPublicacoes = By.linkText("Publicações");
	
	/*Data da Publicação do Ajuste*/
	private static By selecaohouvePublicacaoAjusteVeiculosComunicacao = By.xpath("//span/fieldset/div/div/section/label[2]/div/div[3]/span");
	private static By itemhouvePublicacaoAjusteVeiculosComunicacao = By.id("termoAditivoDados:termoAditivoForm:tabTermoAditivo:publicacoesDados:houvePublicacaoAjuste_1");
	
	private static By botaoproximoabapublicacoes = By.xpath("//div[5]/footer/a[2]");
	
	
	/**************** Conclusão ****************/
	
	private static By abaconclusao = By.linkText("Conclusão");
	
	/*Responsável pelo Termo Aditivo - Parte Contratante*/
	private static By campoCPF = By.id("termoAditivoDados:termoAditivoForm:tabTermoAditivo:conclusaoDados:cpf");
	private static By camponome = By.id("termoAditivoDados:termoAditivoForm:tabTermoAditivo:conclusaoDados:nome");
	private static By campoemailProfissional = By.id("termoAditivoDados:termoAditivoForm:tabTermoAditivo:conclusaoDados:emailProfissional");
	private static By campoemailPessoal = By.id("termoAditivoDados:termoAditivoForm:tabTermoAditivo:conclusaoDados:emailPessoal");
	private static By selecaoassinouContrato = By.xpath("//span/div[3]/section/label[2]/div/div[3]/span");
	private static By itemassinouContrato = By.id("termoAditivoDados:termoAditivoForm:tabTermoAditivo:conclusaoDados:assinouContrato_1");
	private static By botaoadicionarconclusao = By.id("termoAditivoDados:termoAditivoForm:tabTermoAditivo:conclusaoDados:btnAddContratante");
	
	/*Responsável pelo Termo Aditivo - Parte Contratado*/
	private static By campoCPF1 = By.id("termoAditivoDados:termoAditivoForm:tabTermoAditivo:conclusaoDados:cpf2");
	private static By camponome1 = By.id("termoAditivoDados:termoAditivoForm:tabTermoAditivo:conclusaoDados:nome2");
	private static By campoemailProfissional1 = By.id("termoAditivoDados:termoAditivoForm:tabTermoAditivo:conclusaoDados:emailProfissional2");
	private static By campoemailPessoal1 = By.id("termoAditivoDados:termoAditivoForm:tabTermoAditivo:conclusaoDados:emailPessoal2");
	private static By selecaoassinouContrato1 = By.xpath("//fieldset[2]/div/span/div[3]/section/label[2]/div/div[3]/span");
	private static By itemassinouContrato1 = By.id("termoAditivoDados:termoAditivoForm:tabTermoAditivo:conclusaoDados:assinouContrato2_1");
	private static By botaoadicionarconclusao1 = By.xpath("//fieldset[2]/div/span/div[3]/section[2]/a/i");
	
	private static By botaosalvar = By.linkText("Salvar");
	private static By mensagemSucesso = By.xpath("//div/div/div[2]/span");
	
	/***************** LOCATORS EXCLUSÃO DE TERMO ADITIVO *****************/  
	
	 private static By filtrocodigoAjuste = By.id("filterForm:codigoAjuste");
	 private static By filtrocodigoTermoAditivo = By.id("filterForm:codigoTermo");
	 private static By filtronumeroTermoAditivo = By.id("filterForm:numero");
	 private static By filtroanoTermoAditivo = By.id("filterForm:ano");
	 private static By botaobuscar = By.id("filterForm:j_idt67");
	 private static By botaoexcluir = By.xpath("//td[6]/a[3]/i");
	 private static By botaoconfirmar = By.id("form:j_idt105");
	 private static By mensagemdeSucessoExclusao = By.xpath("//div[10]/div/div/div[2]/span");
	
	 /***************** LOCATORS ALTERAÇÃO TERMO ADITIVO *****************/  
	 
	 private static By botaoAlteracao = By.xpath("//td[6]/a[2]");
	 private static By filtrocodigoLicitacaoAlteracao = By.id("filterForm:codigoLicitacao");
	 private static By campoajusteLicitacaoAlteracao = By.id("termoAditivoDados:termoAditivoForm:tabTermoAditivo:identificacaoDados:ajusteLicitacao_input");
	 private static By itemajusteLicitacaoAlteracao = By.cssSelector("span.ui-autocomplete-query");
	 private static By botaoexcluirNotaEmpenhoAlteracao = By.xpath("//td[5]/a/i");
	 private static By botaoconfirmaExclusaoNotaEmpenhoAlteracao = By.id("termoAditivoDados:termoAditivoForm:tabTermoAditivo:financeiroDados:j_idt174");
	 private static By itemfonteRecursosAlteracao = By.id("termoAditivoDados:termoAditivoForm:tabTermoAditivo:financeiroDados:fonteRecurso_2");
	 private static By itempossuiExigenciaGarantiaAlteracao = By.id("termoAditivoDados:termoAditivoForm:tabTermoAditivo:exigenciaClasulaDados:possuiExigenciaGarantia_1");
	 private static By itemexisteAutorizacaoAssinaturaAlteracao = By.id("termoAditivoDados:termoAditivoForm:tabTermoAditivo:exigenciaClasulaDados:possuiAutorizacaoAssinatura_1");
	 private static By itemhouvePublicacaoAjusteAlteracao = By.id("termoAditivoDados:termoAditivoForm:tabTermoAditivo:publicacoesDados:houvePublicacaoAjuste_1");
	 private static By botaoexcluirResponsavelContratanteAlteracao = By.xpath("//td[6]/a/i");
	 private static By botaoconfirmaResponsavelContratanteAlteracao = By.id("termoAditivoDados:termoAditivoForm:tabTermoAditivo:conclusaoDados:j_idt358");
	 private static By itemassinouContratoAlteracao = By.id("termoAditivoDados:termoAditivoForm:tabTermoAditivo:conclusaoDados:assinouContrato_1");
	 private static By botaoexcluirResponsavelContratadoAlteracao1 = By.id("termoAditivoDados:termoAditivoForm:tabTermoAditivo:conclusaoDados:dtContratados:0:j_idt346");
	 private static By botaoconfirmaResponsavelContratadoAlteracao1 = By.id("termoAditivoDados:termoAditivoForm:tabTermoAditivo:conclusaoDados:j_idt362");
	 private static By itemassinouContratoAlteracao1 = By.id("termoAditivoDados:termoAditivoForm:tabTermoAditivo:conclusaoDados:assinouContrato2_1");
	 private static By mensagemAlteracao = By.xpath("//div/div/div[2]/span");
	 
	 
	/**************** Inclusão termoaditivo ****************/
	
	 /*Inclusão Geral*/
	 @Dado("que acesso ao submenu termo aditivo")
	 public void que_acesso_ao_submenu_termo_aditivo() throws Exception {
		 this.acessoGeral(acessoSubMenu);
	 }
	 
	@Dado("que acesso ao menu fase quatro e ao submenu termo aditivo")
	public void que_acesso_ao_menu_fase_quatro_e_ao_submenu_termo_aditivo() throws Exception {
	    this.chamaCaminho5pDefinindoTipoLocator(acessoPainel, acessoSubMenu, null, null, null);
	}

	@Quando("clico no botão novo termo aditivo")
	public void clico_no_botão_novo_termo_aditivo() throws Exception {
	    this.clicar(botaonovoTermoAditivo);
	}

	@Quando("seleciono o combobox ajuste da licitação, preencho os campos código termo aditivo {string} numero do termo aditivo {string}, ano do termo aditivo {string}, valor do termo aditivo {string} e objeto do termo aditivo {string}")
	public void seleciono_o_combobox_ajuste_da_licitação_preencho_os_campos_código_termo_aditivo_numero_do_termo_aditivo_ano_do_termo_aditivo_valor_do_termo_aditivo_e_objeto_do_termo_aditivo(String codigoTermoAditivo, String numeroTermo, String anoTermo, String valorTermo, String objetoTermo) throws Exception {
	    this.selecionaComboId(selecaoajusteLicitacao, itemajusteLicitacao);
	    waitBase(2);
	    this.escrever(campocodigoTermoAditivo, codigoTermoAditivo);
		waitBase(2);
	    this.escrever(camponumeroTermoAditivo, numeroTermo);
	    waitBase(2);
	    this.escrever(campoanoTermoAditivo, anoTermo);
	    waitBase(2);
	    this.escrever(campovalorTermoAditivo, valorTermo);
	    waitBase(2);
	    this.escrever(campoobjetoTermoAditivo, objetoTermo);
	}

	@Quando("seleciono os itens do campo disponiveis e preencho os campos outros descreva {string}, seleciono o combobox justificativa e preencho o campo justificativa apresentada {string}")
	public void seleciono_os_itens_do_campo_disponiveis_e_preencho_os_campos_outros_descreva_seleciono_o_combobox_justificativa_e_preencho_o_campo_justificativa_apresentada(String outrosDescreva, String justifiAprese) throws Exception {
		wait.until(ExpectedConditions.presenceOfElementLocated(setaSelecaoTermoAditivo));
		this.clicar(setaSelecaoTermoAditivo);
		waitBase(2);
	    this.escrever(campooutrosDescreva, outrosDescreva);
	    waitBase(2);
	    this.selecionaComboBox(selecaohaProcedimentoJustificativa, itemhaProcedimentoJustificativa);
	    waitBase(2);
	    this.escrever(campojustificativaApresentada, justifiAprese);
	    
	}

	@Quando("clico no botão próximo e clico na aba vigência")
	public void clico_no_botão_próximo_e_clico_na_aba_vigência() throws Exception {
	    this.VerificaProximaAba(botaoproximoabaIdentificacaoTermoAditivo, abaVigencia);
	}

	@Quando("preencho os campos data do início da vigência do termo aditivo, data do término da vigência do termo aditivo e data da assinatura do termo aditivo")
	public void preencho_os_campos_data_do_início_da_vigência_do_termo_aditivo_data_do_término_da_vigência_do_termo_aditivo_e_data_da_assinatura_do_termo_aditivo() throws Exception {
		waitBase(2);
		this.CampoData(selecaodataInicioVigencia, itemDataGeral);
		waitBase(2);
	    this.CampoData(selecaodataTerminoVigenciaAditivo, itemDataGeral);
	    waitBase(2);
	    this.CampoData(selecaodataAssinaturaTermoAditivo, itemDataGeral);
	}

	@Quando("clico no botão próximo e clico na aba financeiro")
	public void clico_no_botão_próximo_e_clico_na_aba_financeiro() throws Exception {
	    this.VerificaProximaAba(botaoproximoAbaVigencia, abaFinanceiro);
	}

	@Quando("seleciono o combobox houve emissão de nota de empenho documento similar por causa do termo aditivo, preencho o campo nota de empenho documento similar {string} e preencho o campo data, valor {string}, seleciono o combobox fonte de recursos e clico no botão adicionar")
	public void seleciono_o_combobox_houve_emissão_de_nota_de_empenho_documento_similar_por_causa_do_termo_aditivo_preencho_o_campo_nota_de_empenho_documento_similar_e_preencho_o_campo_data_valor_seleciono_o_combobox_fonte_de_recursos_e_clico_no_botão_adicionar(String notaEmpenho, String valor) throws Exception {
	    this.selecionaComboBox(selecaohouveEmissaoNotaEmpenho, itemhouveEmissaoNotaEmpenho);
	    waitBase(2);
	    this.escrever(camponotaEmpenhoDocumento, notaEmpenho);
	    waitBase(2);
	    this.CampoData(selecaodataFinanceira, itemDataGeral);
	    this.escrever(campovalor, valor);
	    waitBase(2);
	    this.selecionaComboBox(selecaofonteRecurso, itemfonteRecurso);
	    waitBase(2);
	    this.clicar(botaoadicionar);
	}

	@Quando("clico no botão próximo e clico na aba exigências e cláusulas")
	public void clico_no_botão_próximo_e_clico_na_aba_exigências_e_cláusulas() throws Exception {
	    this.VerificaProximaAba(botaoproximoabaFinanceiro, abaExigeciasClausulas);
	}

	@Quando("seleciono os comboboxes possui exigência de garantia e existe autorização para assinatura do termo aditivo e preencho o campo data da autorização")
	public void seleciono_os_comboboxes_possui_exigência_de_garantia_e_existe_autorização_para_assinatura_do_termo_aditivo_e_preencho_o_campo_data_da_autorização() throws Exception {
	    this.selecionaComboBox(selecaopossuiExigenciaGarantia, itempossuiExigenciaGarantia);
	    waitBase(2);
	    this.selecionaComboBox(selecaoexisteAutorizacaoAssinatura, itemexisteAutorizacaoAssinatura);
	    waitBase(2);
	    this.CampoData(selecaodataAutorizacao, itemDataGeral);
	}

	@Quando("clico no botão próximo e clico na aba publicações")
	public void clico_no_botão_próximo_e_clico_na_aba_publicações() throws Exception {
	    this.VerificaProximaAba(botaoproximoabaExigenciasClausulas, abaPublicacoes);
	}

	@Quando("seleciono o combobox houve publicação do ajuste em veículos de comunicação, veículo, preencho o campo data da publicação, preencho o campo descrição {string}, e seleciono o combobox veículo de divulgação dos atos oficiais e clico no botão adicionar")
	public void seleciono_o_combobox_houve_publicação_do_ajuste_em_veículos_de_comunicação_veículo_preencho_o_campo_data_da_publicação_preencho_o_campo_descrição_e_seleciono_o_combobox_veículo_de_divulgação_dos_atos_oficiais_e_clico_no_botão_adicionar(String descricao) throws Exception {
		this.selecionaComboBox(selecaohouvePublicacaoAjusteVeiculosComunicacao, itemhouvePublicacaoAjusteVeiculosComunicacao);
	}

	@Quando("clico próximo e clico na aba conclusão")
	public void clico_próximo_e_clico_na_aba_conclusão() throws Exception {
	    this.VerificaProximaAba(botaoproximoabapublicacoes, abaconclusao);
	}

	@Quando("preencho os campos CPF {string}, nome {string}, email profissional {string}, email pessoal {string} e seleciono o combobox assinou o contrato e clico no botão adicionar")
	public void preencho_os_campos_CPF_nome_email_profissional_email_pessoal_e_seleciono_o_combobox_assinou_o_contrato_e_clico_no_botão_adicionar(String CPF, String nome, String emailProfissional, String emailPessoal) throws Exception {
	    this.escrever(campoCPF, CPF);
	    waitBase(2);
	    this.escrever(camponome, nome);
	    waitBase(2);
	    this.escrever(campoemailProfissional, emailProfissional);
	    waitBase(2);
	    this.escrever(campoemailPessoal, emailPessoal);
	    waitBase(2);
	    this.selecionaComboBox(selecaoassinouContrato, itemassinouContrato);
	    waitBase(2);
	    this.clicar(botaoadicionarconclusao);
	}
	
	@Quando("preencho os campos CPF {string}, nome {string}, email profissional {string}, email pessoal {string} e seleciono o combobox assinou o contrato e clico no botão adicionar da tela termo aditivo")
	public void preencho_os_campos_CPF_nome_email_profissional_email_pessoal_e_seleciono_o_combobox_assinou_o_contrato_e_clico_no_botão_adicionar_da_tela_termo_aditivo(String CPF1, String nome1, String emailProfissional1, String emailPessoal1) throws Exception {
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
	    this.clicar(botaoadicionarconclusao1);
	}

	@Quando("clico no botão salvar da tela do termo aditivo")
	public void clico_no_botão_salvar_da_tela_do_termo_aditivo() throws Exception {
	    this.clicar(botaosalvar);
	}

	@Então("recebo uma mensagem de sucesso na tela do termo aditivo {string}")
	public void recebo_uma_mensagem_de_sucesso_na_tela_do_termo_aditivo(String mensagem) throws Exception {
		this.VerificaMensagemSucesso(mensagemSucesso, mensagem);
	}
	
	
	 /**************** Exclusão Termo Aditivo ****************/
	
	/*Exclusão Geral*/
	@Dado("que acesso ao submenu termo aditivo para exclusão geral")
	public void que_acesso_ao_submenu_termo_aditivo_para_exclusão_geral() throws Exception {
		this.acessoGeral(acessoSubMenu);
	}
	
	 @Dado("que acesso ao menu fase quatro e ao submenu termo aditivo para exclusão particular")
	 public void que_acesso_ao_menu_fase_quatro_e_ao_submenu_termo_aditivo_para_exclusão_particular() throws Exception {
	     this.chamaCaminho5pDefinindoTipoLocator(acessoPainel, acessoSubMenu, null, null, null);
	 }

	 @Quando("preecho o filtro código do ajuste {string}, código do termo aditivo {string}, numero termo aditivo {string} e ano termo aditivo {string}")
	 public void preecho_o_filtro_código_do_ajuste_código_do_termo_aditivo_numero_termo_aditivo_e_ano_termo_aditivo(String codigoAjuste, String codigoTermoAditivo, String numeroTermoAditivo, String anoTermoAditivo) throws Exception {
		 waitBase(2);
		 this.escrever(filtrocodigoAjuste, codigoAjuste);
		 waitBase(2);
	     this.escrever(filtrocodigoTermoAditivo, codigoTermoAditivo);
	     waitBase(2);
	     this.escrever(filtronumeroTermoAditivo, numeroTermoAditivo);
	     waitBase(2);
	     this.escrever(filtroanoTermoAditivo, anoTermoAditivo);
	 }

	 @Quando("clico no botão buscar, excluir e confirmar")
	 public void clico_no_botão_buscar_excluir_e_confirmar() throws Exception {
	     this.triadeExclusão(botaobuscar, botaoexcluir, botaoconfirmar);
	 }

	 @Então("recebo uma mensagem de sucesso na tela de termo aditivo {string}")
	 public void recebo_uma_mensagem_de_sucesso_na_tela_de_termo_aditivo(String mensagem) throws Exception {
		 this.VerificaMensagemSucesso(mensagemdeSucessoExclusao, mensagem);
	 }
	 
	 
	 /**************** Metódo Alteração ****************/
	 
	 @Dado("que acesso ao menu fase quatro e ao submenu termo aditivo para alteração")
	 public void que_acesso_ao_menu_fase_quatro_e_ao_submenu_termo_aditivo_para_alteração() throws Exception {
	     this.chamaCaminho5pDefinindoTipoLocator(acessoPainel, acessoSubMenu, null, null, null);
	 }

	 @Quando("preencho os filtros código da licitação {string}, código do ajuste {string}, código do termo aditivo {string}, número do termo aditivo {string} e ano do termo aditivo {string} para alteração")
	 public void preencho_os_filtros_código_da_licitação_código_do_ajuste_código_do_termo_aditivo_número_do_termo_aditivo_e_ano_do_termo_aditivo_para_alteração(String codigoLicitacao, String codigoAjuste, String codigoTermoAditivo, String numeroTermoAditivo, String anoTermoAditivo) throws Exception {
	     this.escrever(filtrocodigoLicitacaoAlteracao, codigoLicitacao);
	     waitBase(2);
	     this.escrever(filtrocodigoAjuste, codigoAjuste);
	     waitBase(2);
	     this.escrever(filtrocodigoTermoAditivo, codigoTermoAditivo);
	     waitBase(2);
	     this.escrever(filtronumeroTermoAditivo, numeroTermoAditivo);
	     waitBase(2);
	     this.escrever(filtroanoTermoAditivo, anoTermoAditivo);
	 }

	 @Quando("clico no botão buscar e no botão alterar para alteração")
	 public void clico_no_botão_buscar_e_no_botão_alterar_para_alteração() throws Exception {
		 this.acessaAlteração(botaobuscar, botaoAlteracao);
	 }

	 @Quando("preencho o combobox ajuste da licitação {string}, preencho os campos código do termo aditivo {string}, número do termo aditivo {string}, ano do termo aditivo {string}, valor do termo aditivo {string} e objeto do termo aditivo {string} para alteração")
	 public void preencho_o_combobox_ajuste_da_licitação_preencho_os_campos_código_do_termo_aditivo_número_do_termo_aditivo_ano_do_termo_aditivo_valor_do_termo_aditivo_e_objeto_do_termo_aditivo_para_alteração(String ajusteLicitacao, String codigoTermoAditivo1, String numeroTermoAditivo1, String anoTermoAditivo1, String valorTermoAditivo, String objetoTermoAditivo) throws Exception {
	     this.escreverId(campoajusteLicitacaoAlteracao, ajusteLicitacao, itemajusteLicitacaoAlteracao);
	     waitBase(3);
	     this.escrever(campocodigoTermoAditivo, codigoTermoAditivo1);
	     waitBase(2);
	     this.escrever(camponumeroTermoAditivo, numeroTermoAditivo1);
	     waitBase(2);
	     this.escrever(campoanoTermoAditivo, anoTermoAditivo1);
	     waitBase(2);
	     this.escrever(campovalorTermoAditivo, valorTermoAditivo);
	     waitBase(2);
	     this.escrever(campoobjetoTermoAditivo, objetoTermoAditivo);
	 }

	 @Quando("seleciono os itens do campo disponiveis passando-os para os selecionados, preencho os campos outros descreva {string} e seleciono o combobox há no procedimento justificativa para assinatura do termo aditivo para alteração")
	 public void seleciono_os_itens_do_campo_disponiveis_passando_os_para_os_selecionados_preencho_os_campos_outros_descreva_e_seleciono_o_combobox_há_no_procedimento_justificativa_para_assinatura_do_termo_aditivo_para_alteração(String outrosDescreva) throws Exception {
	     this.clicar(setaSelecaoTermoAditivo);
	     waitBase(2);
	     this.escrever(campooutrosDescreva, outrosDescreva);
	 }

	 @Quando("clico no botão próximo da aba identificação do termo aditivo e clico na aba vigência para alteração")
	 public void clico_no_botão_próximo_da_aba_identificação_do_termo_aditivo_e_clico_na_aba_vigência_para_alteração() throws Exception {
	     this.VerificaProximaAba(botaoproximoabaIdentificacaoTermoAditivo, abaVigencia);
	 }

	 @Quando("seleciono as datas dos campos data do início da vigência do termo aditivo, data do término da vigência do termo aditivo e data da assinatura do termo aditivo para alteração")
	 public void seleciono_as_datas_dos_campos_data_do_início_da_vigência_do_termo_aditivo_data_do_término_da_vigência_do_termo_aditivo_e_data_da_assinatura_do_termo_aditivo_para_alteração() throws Exception {
	     this.CampoData(selecaodataInicioVigencia, itemDataGeral);
	     waitBase(2);
	     this.CampoData(selecaodataTerminoVigenciaAditivo, itemDataGeral);
	     waitBase(2);
	     this.CampoData(selecaodataAssinaturaTermoAditivo, itemDataGeral);
	 }

	 @Quando("clico no botão próximo da aba vigência e clico na aba financeiro para alteração")
	 public void clico_no_botão_próximo_da_aba_vigência_e_clico_na_aba_financeiro_para_alteração() throws Exception {
	     this.VerificaProximaAba(botaoproximoAbaVigencia, abaFinanceiro);
	 }

	 @Quando("excluo a nota de empenho adicionada anteriormente e preencho os campos nota de empenho documento similar {string}, seleciono o campo data, preencho o campo valor {string} e seleciono o combobox fonte de recursos e clico no botão para adicionar para alteração")
	 public void excluo_a_nota_de_empenho_adicionada_anteriormente_e_preencho_os_campos_nota_de_empenho_documento_similar_seleciono_o_campo_data_preencho_o_campo_valor_e_seleciono_o_combobox_fonte_de_recursos_e_clico_no_botão_para_adicionar_para_alteração(String notaEmpenhoDocumentoSimilar, String valor) throws Exception {
	     this.diadeExclusão(botaoexcluirNotaEmpenhoAlteracao, botaoconfirmaExclusaoNotaEmpenhoAlteracao);
	     waitBase(2);
	     this.escrever(camponotaEmpenhoDocumento, notaEmpenhoDocumentoSimilar);
	     waitBase(2);
	     this.CampoData(selecaodataFinanceira, itemDataGeral);
	     waitBase(2);
	     this.escrever(campovalor, valor);
	     waitBase(2);
	     this.selecionaComboBox(selecaofonteRecurso, itemfonteRecursosAlteracao);
	     waitBase(2);
	     this.clicar(botaoadicionar);
	 }

	 @Quando("clico no botão próximo da aba financeiro e clico na aba exigências e cláusulas para alteração")
	 public void clico_no_botão_próximo_da_aba_financeiro_e_clico_na_aba_exigências_e_cláusulas_para_alteração() throws Exception {
	     this.VerificaProximaAba(botaoproximoabaFinanceiro, abaExigeciasClausulas);
	 }

	 @Quando("seleciono o combobox possui exigência de garantia, existe autorização para assinatura do termo aditivo para alteração")
	 public void seleciono_o_combobox_possui_exigência_de_garantia_existe_autorização_para_assinatura_do_termo_aditivo_para_alteração() throws Exception {
	     this.selecionaComboBox(selecaopossuiExigenciaGarantia, itempossuiExigenciaGarantiaAlteracao);
	     waitBase(2);
	     this.selecionaComboBox(selecaoexisteAutorizacaoAssinatura, itemexisteAutorizacaoAssinaturaAlteracao);
	 }

	 @Quando("clico no botão próximo da aba exigências clásulas e clico na aba publicações para alteração")
	 public void clico_no_botão_próximo_da_aba_exigências_clásulas_e_clico_na_aba_publicações_para_alteração() throws Exception {
	     this.VerificaProximaAba(botaoproximoabaExigenciasClausulas, abaPublicacoes);
	 }

	 @Quando("seleciono o combobox houve publicação do ajuste em veículos de comunicação para alteração")
	 public void seleciono_o_combobox_houve_publicação_do_ajuste_em_veículos_de_comunicação_para_alteração() throws Exception {
	     this.selecionaComboBox(selecaohouvePublicacaoAjusteVeiculosComunicacao, itemhouvePublicacaoAjusteAlteracao);
	 }

	 @Quando("clico no botão próximo da aba publicações e clico na aba conclusão para alteração")
	 public void clico_no_botão_próximo_da_aba_publicações_e_clico_na_aba_conclusão_para_alteração() throws Exception {
	     this.VerificaProximaAba(botaoproximoabapublicacoes, abaconclusao);
	 }

	 @Quando("excluo o responsável contratante adicionado anteriormente preencho os campos CPF {string}, nome {string}, email profissional {string}, email pessoal {string} e seleciono o combobox assinou o contrato e clico no botão adicionar para alteração termo aditivo")
	 public void excluo_o_responsável_contratante_adicionado_anteriormente_preencho_os_campos_CPF_nome_email_profissional_email_pessoal_e_seleciono_o_combobox_assinou_o_contrato_e_clico_no_botão_adicionar_para_alteração_termo_aditivo(String CPF, String nome, String emailProfissional, String emailPessoal) throws Exception {
	     this.diadeExclusão(botaoexcluirResponsavelContratanteAlteracao, botaoconfirmaResponsavelContratanteAlteracao);
	     this.escrever(campoCPF, CPF);
	     waitBase(2);
		 this.escrever(camponome, nome);
		 waitBase(2);
		 this.escrever(campoemailProfissional, emailProfissional);
		 waitBase(2);
		 this.escrever(campoemailPessoal, emailPessoal);
		 waitBase(2);
		 this.selecionaComboBox(selecaoassinouContrato, itemassinouContratoAlteracao);
		 waitBase(2);
		 this.clicar(botaoadicionarconclusao);
	 }

	 @Quando("excluo o responsavél contratado adicionado anteriormente preencho os campos CPF {string}, nome {string}, email profissional {string}, email pessoal {string} e seleciono o combobox assinou o contrato e clico no botão adicionar para alteração do termo aditivo")
	 public void excluo_o_responsavél_contratado_adicionado_anteriormente_preencho_os_campos_CPF_nome_email_profissional_email_pessoal_e_seleciono_o_combobox_assinou_o_contrato_e_clico_no_botão_adicionar_para_alteração_do_termo_aditivo(String CPF1, String nome1, String emailProfissional1, String emailPessoal1) throws Exception {
		 this.diadeExclusão(botaoexcluirResponsavelContratadoAlteracao1, botaoconfirmaResponsavelContratadoAlteracao1);
		 this.escrever(campoCPF1, CPF1);
		 waitBase(2);
		 this.escrever(campoCPF1, CPF1);
		 waitBase(2);
		 this.escrever(camponome1, nome1);
		 waitBase(2);
		 this.escrever(campoemailProfissional1, emailProfissional1);
		 waitBase(2);
		 this.escrever(campoemailPessoal1, emailPessoal1);
		 waitBase(2);
		 this.selecionaComboBox(selecaoassinouContrato1, itemassinouContratoAlteracao1);
		 waitBase(2);
		 this.clicar(botaoadicionarconclusao1);
	 }

	 @Então("clico no botão salvar e recebo uma mensagem de conclusão na alteração {string}")
	 public void clico_no_botão_salvar_e_recebo_uma_mensagem_de_conclusão_na_alteração(String mensagem) throws Exception {
	     this.clicar(botaosalvar);
	     this.VerificaMensagemSucesso(mensagemAlteracao, mensagem);
	 }
	 
	 
	 /**************** Metódo Alteração ****************/ 
	 
	 /*Exclusão Alteração Geral*/
	 @Dado("que acesso ao submenu termo aditivo para exclusão geral para alteração")
	 public void que_acesso_ao_submenu_termo_aditivo_para_exclusão_geral_para_alteração() throws Exception {
	     this.acessoGeral(acessoSubMenu);
	 }
	 
	 @Dado("que acesso ao menu fase quatro e ao submenu termo aditivo para exclusão particular para alteração")
	 public void que_acesso_ao_menu_fase_quatro_e_ao_submenu_termo_aditivo_para_exclusão_particular_para_alteração() throws Exception {
	     this.chamaCaminho5pDefinindoTipoLocator(acessoPainel, acessoSubMenu, null, null, null);
	 }

	 @Quando("preecho o filtro código do ajuste {string}, código do termo aditivo {string}, numero termo aditivo {string} e ano termo aditivo {string} para alteração")
	 public void preecho_o_filtro_código_do_ajuste_código_do_termo_aditivo_numero_termo_aditivo_e_ano_termo_aditivo_para_alteração(String codigoAjuste, String codigoTermoAditivo, String numeroTermoAditivo, String anoTermoAditivo) throws Exception {
		 this.escrever(filtrocodigoAjuste, codigoAjuste);
		 waitBase(2);
	     this.escrever(filtrocodigoTermoAditivo, codigoTermoAditivo);
	     waitBase(2);
	     this.escrever(filtronumeroTermoAditivo, numeroTermoAditivo);
	     waitBase(2);
	     this.escrever(filtroanoTermoAditivo, anoTermoAditivo);
	 }

	 @Quando("clico no botão buscar, excluir e confirmar para alteração")
	 public void clico_no_botão_buscar_excluir_e_confirmar_para_alteração() throws Exception {
	     this.triadeExclusão(botaobuscar, botaoexcluir, botaoconfirmar);
	 }

	 @Então("recebo uma mensagem de sucesso na tela de termo aditivo {string} para alteração")
	 public void recebo_uma_mensagem_de_sucesso_na_tela_de_termo_aditivo_para_alteração(String mensagem) throws Exception {
	     this.VerificaMensagemSucesso(mensagemdeSucessoExclusao, mensagem);
	 }
}