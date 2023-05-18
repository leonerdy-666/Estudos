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

public class VerbaRemuneratóriaStep extends Base {
	
	/**************** LOCATORS INCLUSÃO ****************/ 
	
	private static By acessoaopainel = By.xpath("//li[3]/a/span");
	private static By acessoaosubmenu = By.linkText("Verba Remuneratória");
	private static By botaonovaverbaremuneratoria = By.linkText("Nova Verba Remuneratória");
	private static By campocodigo = By.id("verbaRemuneratoriaDados:verbaRemuneratoriaForm:codigo");
	private static By camponome = By.id("verbaRemuneratoriaDados:verbaRemuneratoriaForm:nome");
	private static By botaosalvar = By.linkText("Salvar");
	private static By mensagemdesucesso = By.xpath("//div[10]/div/div/div[2]");
	
	/*************** LOCATORS EXCLUSÃO ***************/
	
	private static By filtroNome = By.id("filterForm:nome");
	private static By botaoBuscar = By.id("filterForm:j_idt55");
	private static By botaoExcluir = By.id("form:consultaTable:0:j_idt83");
	private static By botaoConfirmar = By.id("form:j_idt87");
	private static By mensagemSucessoExclusao = By.xpath("//div[10]/div/div/div[2]");
	
	/**************** LOCATORS ALTERAÇÃO ****************/ 
	
	private static By botaoAlteracao = By.xpath("//td[3]/a[2]");
	private static By mensagemAlteracao = By.xpath("//div[10]/div/div/div[2]");
	
	
	/**************** Metódo Inclusão Verba Remuneratória ****************/
	
	/*inclusão Geral*/
	@Dado("que acesso ao submenu verba remuneratoria")
	public void que_acesso_ao_submenu_verba_remuneratoria() throws Exception {
		waitBase(2);
		this.clicar(acessoaosubmenu);
	}
	
	@Dado("que acesso ao menu fasetres remunerações e ao submenu verba remuneratoria")
	public void que_acesso_ao_menu_fasetres_remunerações_e_ao_submenu_verba_remuneratoria() throws Exception {
		this.chamaCaminho5pDefinindoTipoLocator(acessoaopainel, acessoaosubmenu, null, null, null);
	}

	@Quando("clico no botao nova verba remuneratoria")
	public void clico_no_botao_nova_verba_remuneratoria() throws Exception {
	    this.clicar(botaonovaverbaremuneratoria);
	}

	@Quando("preencho os campos codigo {string} e nome {string}")
	public void preencho_os_campos_codigo_e_nome(String codigo, String nome) throws Exception {
	    this.escrever(campocodigo, codigo);
	    this.escrever(camponome, nome);
	}

	@Quando("por fim clico no botao salvar da tela de inclusão de verba remuneratoria")
	public void por_fim_clico_no_botao_salvar_da_tela_de_inclusão_de_verba_remuneratoria() throws Exception {
	    this.clicar(botaosalvar);
	}

	@Então("me é apresentado uma mensagem de confirmando minha inclusão {string}")
	public void me_é_apresentado_uma_mensagem_de_confirmando_minha_inclusão(String mensagem) throws Exception {
		this.VerificaMensagemSucesso(mensagemdesucesso, mensagem);
	}
	
	
	/**************** Metódo Exclusão Verba Remuneratória ****************/
	
	/*Exclusão Geral*/
	@Dado("que acesso ao submenu verba remuneratória")
	public void queAcessoAoSubmenuVerbaRemuneratória() throws Exception {
	    waitBase(2);
		this.clicar(acessoaosubmenu);
	}
	
	@Dado("que acesso ao menu verba fasetres remunerações e ao submenu verba remuneratória")
	public void que_acesso_ao_menu_verba_fasetres_remunerações_e_ao_submenu_verba_remuneratória() throws Exception {
	    this.chamaCaminho5pDefinindoTipoLocator(acessoaopainel, acessoaosubmenu, null, null, null);
	}

	@Quando("preencho o campo nome {string} para exclusão da verba")
	public void preenchoOCampoNomeParaExclusãoDaVerba(String nome) throws Exception {
		this.escrever(filtroNome, nome);
	}
	
	@Quando("clico no botão buscar, excluir e confirmar da tela verba remuneratória")
	public void clico_no_botão_buscar_excluir_e_confirmar_da_tela_verba_remuneratória() throws Exception {
	    this.triadeExclusão(botaoBuscar, botaoExcluir, botaoConfirmar);
	}

	@Então("recebo uma mensagem de exclusão de verba remuneratória {string}")
	public void recebo_uma_mensagem_de_exclusão_de_verba_remuneratória(String mensagem) throws Exception {
		this.VerificaMensagemSucesso(mensagemSucessoExclusao, mensagem);
	}
	
	/**************** Metódo Alteração Verba Remuneratória ****************/
	
	/*Alteração Geral*/
	@Dado("que acesso ao submenu verba remuneratoria para alteração")
	public void que_acesso_ao_submenu_verba_remuneratoria_para_alteração() throws Exception {
		this.acessoGeral(acessoaosubmenu);
	}
	
	@Dado("que acesso ao menu fase três remunerações e ao submenu verba remuneratoria para alteração")
	public void que_acesso_ao_menu_fase_três_remunerações_e_ao_submenu_verba_remuneratoria_para_alteração() throws Exception {
	    this.chamaCaminho5pDefinindoTipoLocator(acessoaopainel, acessoaosubmenu, null, null, null);
	}

	@Quando("preencho o campo nome {string} clico no botão buscar e alterar")
	public void preencho_o_campo_nome_clico_no_botão_buscar_e_alterar(String nome) throws Exception {
		this.escrever(filtroNome, nome);
		this.acessaAlteração(botaoBuscar, botaoAlteracao);
	}

	@Quando("preencho os campos codigo {string} e nome {string} para alteração")
	public void preencho_os_campos_codigo_e_nome_para_alteração(String codigo, String nome1) throws Exception {
	    this.escrever(campocodigo, codigo);
	    this.escrever(camponome, nome1);
	}

	@Quando("por fim clico no botao salvar da tela de inclusão de verba remuneratoria para alteração")
	public void por_fim_clico_no_botao_salvar_da_tela_de_inclusão_de_verba_remuneratoria_para_alteração() throws Exception {
	    this.clicar(botaosalvar);
	}

	@Então("me é apresentado uma mensagem de confirmando minha inclusão {string} para alteração")
	public void me_é_apresentado_uma_mensagem_de_confirmando_minha_inclusão_para_alteração(String mensagem) throws Exception {
		this.VerificaMensagemSucesso(mensagemAlteracao, mensagem);
	}
	
	
	/**************** Metódo Exclusão Alteração Verba Remuneratória ****************/

	/*Exclusão Alteração Geral*/
	@Dado("que acesso ao submenu verba remuneratória para alteração")
	public void que_acesso_ao_submenu_verba_remuneratória_para_alteração() throws Exception {
	    this.acessoGeral(acessoaosubmenu);
	}
	
	@Dado("que acesso ao menu fasetres remunerações e ao submenu verba remuneratória para alteração")
	public void que_acesso_ao_menu_fasetres_remunerações_e_ao_submenu_verba_remuneratória_para_alteração() throws Exception {
	    this.chamaCaminho5pDefinindoTipoLocator(acessoaopainel, acessoaosubmenu, null, null, null);
	}

	@Quando("preencho o campo nome {string} para exclusão da verba para alteração")
	public void preencho_o_campo_nome_para_exclusão_da_verba_para_alteração(String nome) throws Exception {
	    this.escrever(filtroNome, nome);
	}

	@Quando("clico no botão buscar, excluir e confirmar da tela verba remuneratória para alteração")
	public void clico_no_botão_buscar_excluir_e_confirmar_da_tela_verba_remuneratória_para_alteração() throws Exception {
	    this.triadeExclusão(botaoBuscar, botaoExcluir, botaoConfirmar);
	}

	@Então("recebo uma mensagem de exclusão de verba remuneratória {string} para alteração")
	public void recebo_uma_mensagem_de_exclusão_de_verba_remuneratória_para_alteração(String mensagem) throws Exception {
	    this.VerificaMensagemSucesso(mensagemSucessoExclusao, mensagem);
	    
	}
}