package br.conam.steps.fase3_remuneracoes;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;

import br.conam.core.Base;
import cucumber.api.Scenario;
import cucumber.api.java.AfterStep;
import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Então;

public class AposentadosPensionistasStep extends Base {
	
	/**************** LOCATORS INCLUSÃO ****************/
	
	private static By acessoaopainel = By.xpath("//li[3]/a/span");
	private static By acessoaosubmenu = By.linkText("Aposentado/Pensionista");
	private static By botaonovaaposentadopensionista = By.linkText("Novo Aposentado/Pensionista");
	private static By selecaotipo = By.xpath("//label[2]/div/div[3]/span");
	private static By itemtipo = By.id("aposentadoPensionistaDados:aposentadoForm:tipo_1");
	private static By camponome = By.id("aposentadoPensionistaDados:aposentadoForm:nome");
	private static By campoCPF = By.id("aposentadoPensionistaDados:aposentadoForm:cpf");
	private static By campodataNascimento = By.id("aposentadoPensionistaDados:aposentadoForm:dataNascimento_input");
	private static By dataNascimento = By.linkText("4");
	private static By campocargoOrigem = By.id("aposentadoPensionistaDados:aposentadoForm:cargoOrigem");
	private static By campodataAposentadoria = By.id("aposentadoPensionistaDados:aposentadoForm:dataAposentadoriaPensao_input");
	private static By dataAposentadoria = By.linkText("4");
	private static By botaosalvar = By.linkText("Salvar");
	private static By mensagemdesucesso = By.xpath("//div[10]/div/div/div[2]/span");
	
	/**************** LOCATORS EXCLUSÃO ****************/
	
	private static By campocargoOrigem1 = By.id("filterForm:cargoOrigem");
	private static By botaobuscar = By.xpath("//footer/a/i");
	private static By botaoexcluir = By.id("form:consultaTable:0:j_idt87");
	private static By botaoconfirma = By.id("form:j_idt91");
	private static By mensagemsucessoExclusao = By.xpath("//div[10]/div/div/div[2]/span");
	
	/**************** LOCATORS ALTERAÇÃO ****************/
	
	private static By botaoalteracao = By.xpath("//td[5]/a[2]");
	private static By itemtipoAlteracao = By.id("aposentadoPensionistaDados:aposentadoForm:tipo_2");
	private static By selecaoqualificacaoPensionista = By.xpath("//section[2]/label[2]/div/div[3]");
	private static By itemqualificacaoPensionista = By.id("aposentadoPensionistaDados:aposentadoForm:qualificacaoPensionista_1");
	private static By mensagemaAlteracao = By.xpath("//div[10]/div/div");
	
	
	/**************** Metódo Inclusão Aposentado Pensionista ****************/
	
	/*Inclusão Geral*/
	@Dado("que acesso ao menu fase três remunerações e ao submenu Aposentado Pensionista")
	public void que_acesso_ao_menu_fase_três_remunerações_e_ao_submenu_Aposentado_Pensionista() throws Exception {
		waitBase(2);
		this.clicar(acessoaopainel);
		waitBase(2);
		this.clicar(acessoaosubmenu);
	}
	
	@Dado("que acesso ao menu fasetres remunerações e ao ambiente Aposentado Pensionista")
	public void que_acesso_ao_menu_fasetres_remunerações_e_ao_ambiente_Aposentado_Pensionista() throws Exception {
		this.chamaCaminho5pDefinindoTipoLocator(acessoaopainel, acessoaosubmenu, null, null, null);
	}

	@Quando("clico no botao novoaposentadopensionista")
	public void clico_no_botao_novoaposentadopensionista() throws Exception {
	    waitBase(3);
		this.clicar(botaonovaaposentadopensionista);
	}

	@Quando("seleciono o campo tipo e preencho os campos nome {string}, CPF {string} e seleciono a data do campo data nascimento")
	public void seleciono_o_campo_tipo_e_preencho_os_campos_nome_CPF_e_seleciono_a_data_do_campo_data_nascimento(String nome, String CPF) throws Exception {
	   this.selecionaComboBox(selecaotipo, itemtipo);
	   this.escrever(camponome, nome);
	   waitBase(1);
	   this.escrever(campoCPF, CPF);
	   waitBase(2);
	   this.escrever(campoCPF, CPF);
	   this.CampoData(campodataNascimento, dataNascimento);
	}

	@Quando("preecho os campos cargo origem {string} e seleciono a data do campo data aposentadoria")
	public void preecho_os_campos_cargo_origem_e_seleciono_a_data_do_campo_data_aposentadoria(String cargoOrigem) throws Exception {
	    this.escrever(campocargoOrigem, cargoOrigem);
	    this.CampoData(campodataAposentadoria, dataAposentadoria);
	}

	@Quando("por fim clico no botasalvar")
	public void por_fim_clico_no_botasalvar() throws Exception {
	    this.clicar(botaosalvar);
	}

	@Então("me é apresentado uma mensagem de inclusão de aposentados pensionistas {string}")
	public void me_é_apresentado_uma_mensagem_de_inclusão_de_aposentados_pensionistas(String mensagem) throws Exception {
		this.VerificaMensagemSucesso(mensagemdesucesso, mensagem);
	}
	
	
	/**************** Metódo Exclusão Aposentado Pensionista ****************/
	
	@Dado("que acesso ao menu fasetres remunerações e ao submenu aposentado pensionista")
	public void que_acesso_ao_menu_fasetres_remunerações_e_ao_submenu_aposentado_pensionista() throws Exception {
		this.chamaCaminho5pDefinindoTipoLocator(acessoaopainel, acessoaosubmenu, null, null, null);
	}

	@Quando("preencho o campo cargo origem {string}")
	public void preencho_o_campo_cargo_origem(String cargoOrigem) throws Exception {
	    this.escrever(campocargoOrigem1, cargoOrigem);
	}

	@Quando("clico no botao buscas, excluir e confirmo a exclusão do aposentado")
	public void clico_no_botao_buscas_excluir_e_confirmo_a_exclusão_do_aposentado() throws Exception {
	    this.triadeExclusão(botaobuscar, botaoexcluir, botaoconfirma);
	}

	@Então("recebo uma mensagem de exclusão de aposentado pensionista {string}")
	public void recebo_uma_mensagem_de_exclusão_de_aposentado_pensionista(String mensagem) throws Exception {
		this.VerificaMensagemSucesso(mensagemsucessoExclusao, mensagem);
	}
	
	/**************** Metódo Alteração Aposentado Pensionista ****************/
	
	@Dado("que acesso ao menu fasetres remunerações e ao submenu Aposentado Pensionista para alteração geral")
	public void queAcessoAoMenuFasetresRemuneraçõesEAoSubmenuAposentadoPensionistaParaAlteraçãoGeral() throws Exception {
		waitBase(2);
		this.clicar(acessoaopainel);
		waitBase(2);
		this.clicar(acessoaosubmenu);
	}
	
	@Dado("que acesso ao menu fasetres remunerações e ao ambiente Aposentado Pensionista para alteração")
	public void que_acesso_ao_menu_fasetres_remunerações_e_ao_ambiente_Aposentado_Pensionista_para_alteração() throws Exception {
	    this.chamaCaminho5pDefinindoTipoLocator(acessoaopainel, acessoaosubmenu, null, null, null);
	}

	@Quando("preencho o filtro cargo origem {string}, clico no botão buscar e no botão alteração para alteração")
	public void preencho_o_filtro_cargo_origem_clico_no_botão_buscar_e_no_botão_alteração_para_alteração(String cargoOrigem1) throws Exception {
	    this.escrever(campocargoOrigem1, cargoOrigem1);
	    this.acessaAlteração(botaobuscar, botaoalteracao);
	}

	@Quando("seleciono o campo tipo e preencho os campos nome {string}, CPF {string} e seleciono a data do campo data nascimento para alteração")
	public void seleciono_o_campo_tipo_e_preencho_os_campos_nome_CPF_e_seleciono_a_data_do_campo_data_nascimento_para_alteração(String nome, String CPF) throws Exception {
	    this.selecionaComboBox(selecaotipo, itemtipoAlteracao);
	    waitBase(2);
	    this.escrever(camponome, nome);
	    this.CampoData(campodataNascimento, dataNascimento);
	}

	@Quando("seleciono o combobox qualificação pensionista para alteração")
	public void seleciono_o_combobox_qualificação_pensionista_para_alteração() throws Exception {
	    this.selecionaComboBox(selecaoqualificacaoPensionista, itemqualificacaoPensionista);
	}

	@Quando("por fim clico no botasalvar para alteração")
	public void por_fim_clico_no_botasalvar_para_alteração() throws Exception {
	    this.clicar(botaosalvar);
	}

	@Então("me é apresentado uma mensagem de inclusão de aposentados pensionistas {string} para alteração")
	public void me_é_apresentado_uma_mensagem_de_inclusão_de_aposentados_pensionistas_para_alteração(String mensagem) throws Exception {
		this.VerificaMensagemSucesso(mensagemaAlteracao, mensagem);
	}
	
	
	/**************** Metódo Exclusão Alteração Aposentado Pensionista ****************/
	
	/*Exclusão Alteração Geral*/
	@Dado("que acesso ao submenu aposentado pensionista para alteração")
	public void que_acesso_ao_submenu_aposentado_pensionista_para_alteração() throws Exception {
	    this.acessoGeral(acessoaosubmenu);
	}
	
	@Dado("que acesso ao menu fasetres remunerações e ao submenu aposentado pensionista para alteração")
	public void que_acesso_ao_menu_fasetres_remunerações_e_ao_submenu_aposentado_pensionista_para_alteração() throws Exception {
	    this.chamaCaminho5pDefinindoTipoLocator(acessoaopainel, acessoaosubmenu, null, null, null);
	}

	@Quando("preencho o campo cargo origem {string} para alteração")
	public void preencho_o_campo_cargo_origem_para_alteração(String cargoOrigem) throws Exception {
	    this.escrever(campocargoOrigem1, cargoOrigem);
	}

	@Quando("clico no botao buscas, excluir e confirmo a exclusão do aposentado para alteração")
	public void clico_no_botao_buscas_excluir_e_confirmo_a_exclusão_do_aposentado_para_alteração() throws Exception {
	   this.triadeExclusão(botaobuscar, botaoexcluir, botaoconfirma);
	}

	@Então("recebo uma mensagem de exclusão de aposentado pensionista {string} para alteração")
	public void recebo_uma_mensagem_de_exclusão_de_aposentado_pensionista_para_alteração(String mensagem) throws Exception {
	    this.VerificaMensagemSucesso(mensagemsucessoExclusao, mensagem);
	}
	
}