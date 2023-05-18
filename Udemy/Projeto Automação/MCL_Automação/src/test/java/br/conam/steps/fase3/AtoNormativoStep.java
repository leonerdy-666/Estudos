 package br.conam.steps.fase3;

import static org.junit.Assert.assertArrayEquals;

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


public class AtoNormativoStep extends Base {
	
	
	/**************** LOCATORS INCLUSÃO ATO NORMATIVO **************/
	
	private static By botaosalvar = By.linkText("Salvar");
	private static By acessoMenu = By.xpath("//li[2]/a/span");
	private static By acessoSubmenu = By.linkText("Ato Normativo");
	private static By botaonovoato = By.linkText("Novo Ato Normativo");
	private static By campodescricao = By.id("atoNormativoDados:atoNormativoForm:descricao");
	private static By campoNumeroAto = By.id("atoNormativoDados:atoNormativoForm:numeroDoAto");	
	private static By campoAno = By.id("atoNormativoDados:atoNormativoForm:anoAto:anoAto_input");
	private static By campodataPub = By.id("atoNormativoDados:atoNormativoForm:dataPublicacao_input");
	private static By itemdataGeral = By.linkText("24");
	private static By campodataVig = By.id("atoNormativoDados:atoNormativoForm:dataVigencia_input");
	private static By selecaonorma = By.id("atoNormativoDados:atoNormativoForm:tipoNorma_label");
	private static By itemnorma = By.id("atoNormativoDados:atoNormativoForm:tipoNorma_1");
	private static By idmensagemSucesso = By.xpath("//div[10]/div/div/div[2]/span");
	
	/**************** LOCATORS EXCLUSÃO ATO NORMATIVO ****************/
	
	private static By filtrodescricao = By.id("filterForm:descricao");
	private static By botaobuscar = By.id("filterForm:j_idt55");
	private static By botaoexcluir = By.id("form:consultaTable:0:j_idt89");
	private static By botaoconfirmar = By.id("form:j_idt93");
	private static By mensagemSucessoExclusão = By.xpath("//div[10]/div/div/div[2]/span");
	
	/**************** LOCATORS ALTERAÇÃO ATO NORMATIVO ****************/ 
	
	private static By botaoAlteracao = By.xpath("//td[4]/a[2]");
	private static By itemnormaAlteracao = By.id("atoNormativoDados:atoNormativoForm:tipoNorma_2");
	private static By itemdataAlteracao = By.linkText("18");
	private static By mensagemAlteracao = By.xpath("//div[10]/div/div/div[2]/span");
	
	
	/**************** Metódo Inclusão Ato Normativo ****************/ 
	
	@Dado("que acesso ao menu fase três ato pessoal e ao submenu ato normativo e clico no botão novo ato normativo sou direcionado para tela de cadastro")
	public void queAcessoAoMenuFaseTrêsAtoPessoalEAoSubmenuAtoNormativoEClicoNoBotãoNovoAtoNormativoSouDirecionadoParaTelaDeCadastro() throws Exception {
		this.chamaCaminho5pDefinindoTipoLocator(acessoMenu, acessoSubmenu, null, null, null);
		this.clicar(botaonovoato);
	}

	@Quando("preencho os campos descrição {string}, numero do ato {string} e ano {string}")
	public void preenchoOsCamposDescriçãoNumeroDoAtoEAno(String descricao, String numeroAto, String ano) throws Exception {
	    this.escrever(campodescricao, descricao);
	    this.escrever(campoNumeroAto, numeroAto);
	    this.escrever(campoAno, ano);
	}

	@Quando("preencho os campos data publicação, data vigência e norma")
	public void preenchoOsCamposDataPublicaçãoDataVigênciaENorma() throws Exception {
		this.CampoData(campodataPub, itemdataGeral);
		waitBase(2);
		this.CampoData(campodataVig, itemdataGeral);
		waitBase(2);
		this.selecionaComboBox(selecaonorma, itemnorma);
	}
	
	@Quando("por fim clico no botao salvar da tela incluir ato normativo")
	public void por_fim_clico_no_botao_salvar_da_tela_incluir_ato_normativo() throws Exception {
		this.clicar(botaosalvar);   
	}
	
	@Então("recebo uma mensagem na tela de inclusão de ato normativo {string}")
	public void receboUmaMensagemNaTelaDeInclusãoDeAtoNormativo(String mensagem) throws Exception {
		this.VerificaMensagemSucesso(idmensagemSucesso, mensagem);
	}
	
	
	/***************** Metódos Exclusão do Ato Normativo *****************/
	
	@Dado("que acesso ao menu fase três submenu ato normativo para exclusão")
	public void que_acesso_ao_menu_fase_três_submenu_ato_normativo_para_exclusão() throws Exception {
		this.acessoGeral(acessoSubmenu);
	}
	
	@Dado("que acesso ao menu fasetres e ao submenu ato normativo")
	public void que_acesso_ao_menu_fasetres_e_ao_submenu_ato_normativo() throws Exception {
	    this.chamaCaminho5pDefinindoTipoLocator(acessoMenu, acessoSubmenu, null, null, null);
	}

	@Quando("preencho o filtro descrição {string}")
	public void preencho_o_filtro_descrição(String descricao) throws Exception {
	    this.escrever(filtrodescricao, descricao);
	}

	@Quando("clico no botão buscar, excluir e confirmar para excluisão do ato normativo")
	public void clico_no_botão_buscar_excluir_e_confirmar_para_excluisão_do_ato_normativo() throws Exception {
	    this.triadeExclusão(botaobuscar, botaoexcluir, botaoconfirmar);
	}

	@Então("recebo uma mensagem de exclusão {string}")
	public void recebo_uma_mensagem_de_exclusão(String mensagem) throws Exception {
		this.VerificaMensagemSucesso(mensagemSucessoExclusão, mensagem);
	}
	
	
	/**************** Metódos Alteração ****************/ 
	
	/*Alteração Geral*/
	@Dado("que acesso ao menu fase três e ao submenu ato normativo para alteração geral")
	public void que_acesso_ao_menu_fase_três_e_ao_submenu_ato_normativo_para_alteração_geral() throws Exception  {
	    this.chamaCaminho5pDefinindoTipoLocator(acessoMenu, acessoSubmenu, null, null, null);
	}
	
	/*Alteração Particular*/
	@Dado("que acesso ao menu fase três e ao submenuato normativo")
	public void que_acesso_ao_menu_fase_três_e_ao_submenuato_normativo() throws Exception {
	    this.chamaCaminho5pDefinindoTipoLocator(acessoMenu, acessoSubmenu, null, null, null);
	}
	
	@Quando("preencho o filtro descrição {string} clico no botão buscar e clico no botão alterar para alteracao")
	public void preencho_o_filtro_descrição_clico_no_botão_buscar_e_clico_no_botão_alterar_para_alteracao(String descricao) throws Exception {
		this.escrever(filtrodescricao, descricao);
		this.acessaAlteração(botaobuscar, botaoAlteracao);
	}
	@Quando("preenhco os campos descricao {string} numero do ato {string} e ano {string} para alteração")
	public void preenhco_os_campos_descricao_numero_do_ato_e_ano_para_alteração(String descricao2, String numeroAto, String ano) throws Exception {
	    this.escrever(campodescricao, descricao2);
	    this.escrever(campoNumeroAto, numeroAto);
	    this.escrever(campoAno, ano);
	}

	@Quando("os campos data publicação, data vigência e norma para alteração")
	public void os_campos_data_publicação_data_vigência_e_norma_para_alteração() throws Exception {
	    this.CampoData(campodataPub, itemdataAlteracao);
	    this.CampoData(campodataVig, itemdataAlteracao);
	    this.selecionaComboBox(selecaonorma, itemnormaAlteracao);
	}

	@Quando("por fim clico no botao salvar da tela alterar ato normativo")
	public void por_fim_clico_no_botao_salvar_da_tela_alterar_ato_normativo() throws Exception {
	    this.clicar(botaosalvar);
	}
	
	@Então("recebo uma mensagem na tela de Alteração de ato normativo {string}")
	public void recebo_uma_mensagem_na_tela_de_Alteração_de_ato_normativo(String mensagem) throws Exception {
		this.VerificaMensagemSucesso(mensagemAlteracao, mensagem);
	}
	
	
	/**************** Metódos Exclusão Alteração  ****************/
	
	/*Exclusão Alteração Geral*/
	@Dado("que acesso ao submenu ato normativo para exclusão para alteração")
	public void que_acesso_ao_submenu_ato_normativo_para_exclusão_para_alteração() throws Exception  {
	    this.acessoGeral(acessoSubmenu);
	}
	
	@Dado("que acesso ao menu fase três submenu ato normativo para alteração")
	public void queAcessoAoMenuFaseTrêsSubmenuAtoNormativoParaAlteração() throws Exception {
		this.chamaCaminho5pDefinindoTipoLocator(acessoMenu, acessoSubmenu, null, null, null);
	}

	@Quando("preencho o filtro descrição {string} para alteração")
	public void preenchoOFiltroDescriçãoParaAlteração(String descricao) throws Exception {
	    this.escrever(filtrodescricao, descricao);
	}

	@Quando("clico no botão buscar, excluir e confirmar para excluisão do ato normativo para alteração")
	public void clicoNoBotãoBuscarExcluirEConfirmarParaExcluisãoDoAtoNormativoParaAlteração() throws Exception {
	    this.triadeExclusão(botaobuscar, botaoexcluir, botaoconfirmar);
	}

	@Então("recebo uma mensagem de exclusão {string} para alteração")
	public void receboUmaMensagemDeExclusãoParaAlteração(String mensagem) throws Exception {
	    this.VerificaMensagemSucesso(mensagemSucessoExclusão, mensagem);
	}
}