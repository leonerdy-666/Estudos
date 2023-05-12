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

public class ResumoFolhaStep extends Base {

	/**************** LOCATORS INCLUSÃO ****************/
	
	private static By acessoaopainel = By.xpath("//li[3]/a/span");
	private static By acessoaosubmenu = By.linkText("Resumo Folha");
	private static By botaonovoresumofolha = By.linkText("Novo Resumo Folha");
	private static By campocompetencia = By.id("resumoFolhaDados:resumoFolhaForm:competencia");
	private static By campoFGTS = By.id("resumoFolhaDados:resumoFolhaForm:valorFgts:valorFgts_input");
	private static By campocontribuicaoPrevGeral = By.id("resumoFolhaDados:resumoFolhaForm:valorContribPrevGeralAgPolitico:valorContribPrevGeralAgPolitico_input");
	private static By campocontribuicaoPrevProp = By.id("resumoFolhaDados:resumoFolhaForm:valorContribPrevProprioAgPolitico:valorContribPrevProprioAgPolitico_input");
	private static By campocontribuicaoPrevGeralNaoPoli = By.id("resumoFolhaDados:resumoFolhaForm:valorContribPrevGeralAgNaoPolitico:valorContribPrevGeralAgNaoPolitico_input");
	private static By campocontribuicaoPrevProprioNaoPoli = By.id("resumoFolhaDados:resumoFolhaForm:valorContribPrevProprioAgNaoPolitico:valorContribPrevProprioAgNaoPolitico_input");
	private static By botaosalvar = By.xpath("//a[2]/i");
	private static By mensagemdesucesso = By.xpath("//div[10]/div/div/div[2]");
	
	/**************** LOCATORS EXCLUSÃO ****************/
	
	private static By filtroCompetencia = By.id("filterForm:competencia");
	private static By botaobuscar = By.id("filterForm:j_idt55");
	private static By botaoexcluir = By.xpath("//td[7]/a[3]/i");
	private static By botaoconfirmar = By.id("form:j_idt115");
	private static By mensagemSucessoExclusao = By.xpath("//div[10]/div/div/div[2]");
	
	/**************** LOCATORS ALTERAÇÃO ****************/ 
	
	private static By botaoalteração = By.xpath("//td[7]/a[2]/i");
	private static By mensagemAlteracao = By.xpath("//div[10]/div/div/div[2]");
	
	
	/**************** Metódo Inclusão Resumo Folha ****************/
	
	/*Inclusão Geral*/
	@Dado("que acesso ao submenu resumo folha")
	public void que_acesso_ao_submenu_resumo_folha() throws Exception {
		waitBase(2);
		this.clicar(acessoaosubmenu);
	}
	
	@Dado("que acesso ao menu fase três remunerações e ao submenu resumo folha")
	public void que_acesso_ao_menu_fase_três_remunerações_e_ao_submenu_resumo_folha() throws Exception {
	    this.chamaCaminho5pDefinindoTipoLocator(acessoaopainel, acessoaosubmenu, null, null, null);
	}
	
	@Quando("clico no botão novoresumofolha")
	public void clico_no_botão_novoresumofolha() throws Exception {
	    this.clicar(botaonovoresumofolha);
	}

	@Quando("preencho os campos competência {string}, FGTS {string}, Contribuição Prev Geral {string}")
	public void preencho_os_campos_competência_FGTS_Contribuição_Prev_Geral(String competencia, String FGTS, String contribuicaoPrevGeral) throws Exception {
	    this.escrever(campocompetencia, competencia);
	    this.escrever(campoFGTS, FGTS);
	    this.escrever(campocontribuicaoPrevGeral, contribuicaoPrevGeral);
	}

	@Quando("preencho os campos Contribuição Prev Próprio {string}, Contribuição Prev Geral Não Político {string} e Contribuição Prev Próprio Não Politico {string}")
	public void preencho_os_campos_Contribuição_Prev_Próprio_Contribuição_Prev_Geral_Não_Político_e_Contribuição_Prev_Próprio_Não_Politico(String contribuicaoPrevProp, String contribuicaoPrevGeralNaoPoli, String contribuicaoPrevProprioNaoPoli) throws Exception {
	    this.escrever(campocontribuicaoPrevProp, contribuicaoPrevProp);
	    this.escrever(campocontribuicaoPrevGeralNaoPoli, contribuicaoPrevGeralNaoPoli);
	    this.escrever(campocontribuicaoPrevProprioNaoPoli, contribuicaoPrevProprioNaoPoli);
	}
	
	@Quando("por fim clico no botao salvar da tela resumo folha")
	public void por_fim_clico_no_botao_salvar_da_tela_resumo_folha() throws Exception {
	    this.clicar(botaosalvar);
	}

	@Então("recebo uma mensagem de inclusão do resumo folha {string}")
	public void recebo_uma_mensagem_de_inclusão_do_resumo_folha(String mensagem) throws Exception {
		this.VerificaMensagemSucesso(mensagemdesucesso, mensagem);
	}

	
	/**************** Metódo Exclusão Resumo Folha ****************/
	
	/*Exclusão Geral*/
	@Dado("que acesso ao submenu resumo folha para exclusão")
	public void que_acesso_ao_submenu_resumo_folha_para_exclusão() throws Exception {
		waitBase(2);
		this.clicar(acessoaosubmenu);
	}
	
	@Dado("que acesso ao meno fase três remunerações e ao submenu resumo folha")
	public void que_acesso_ao_meno_fase_três_remunerações_e_ao_submenu_resumo_folha() throws Exception {
	    this.chamaCaminho5pDefinindoTipoLocator(acessoaopainel, acessoaosubmenu, null, null, null);
	}

	@Quando("preencho o filtro competência {string}")
	public void preencho_o_filtro_competência(String competencia) throws Exception {
	    waitBase(2);
		this.escrever(filtroCompetencia, competencia);
	}

	@Quando("clico no botao buscar, excluir da tela resumo folha, clico no botão confirmar")
	public void clico_no_botao_buscar_excluir_da_tela_resumo_folha_clico_no_botão_confirmar() throws Exception {
	    this.triadeExclusão(botaobuscar, botaoexcluir, botaoconfirmar);
	}

	@Então("recebo uma mensagem de exclusão na tela de resumo folha {string}")
	public void recebo_uma_mensagem_de_exclusão_na_tela_de_resumo_folha(String mensagem) throws Exception {
		this.VerificaMensagemSucesso(mensagemSucessoExclusao, mensagem);
	}
	
	
	/**************** Metodo Alteração ****************/
	
	/*Alteração Geral*/
	@Dado("que acesso ao submenu resumo folha para alteração")
	public void queAcessoAoSubmenuResumoFolhaParaAlteração() throws Exception {
	    this.acessoGeral(acessoaosubmenu);
	}
	
	@Dado("que acesso ao menu fase três remunerações e ao submenu resumo folha para alteração")
	public void que_acesso_ao_menu_fase_três_remunerações_e_ao_submenu_resumo_folha_para_alteração() throws Exception {
		this.chamaCaminho5pDefinindoTipoLocator(acessoaopainel, acessoaosubmenu, null, null, null);
	}

	@Quando("preencho o filtro competência {string} e clico no botão buscar e alterar")
	public void preencho_o_filtro_competência_e_clico_no_botão_buscar_e_alterar(String competencia1) throws Exception {
	    this.escrever(filtroCompetencia, competencia1);
		this.acessaAlteração(botaobuscar, botaoalteração);
	}

	@Quando("preencho os campos competência {string}, FGTS {string}, Contribuição Prev Geral {string} para alteração")
	public void preencho_os_campos_competência_FGTS_Contribuição_Prev_Geral_para_alteração(String competencia, String FGTS, String contribuicaoPrevGeral) throws Exception {
	    this.escrever(campocompetencia, competencia);
		waitBase(2);
	    this.escrever(campocompetencia, competencia);
	    waitBase(2);
	    this.escrever(campoFGTS, FGTS);
	    this.escrever(campocontribuicaoPrevGeral, contribuicaoPrevGeral);
	}

	@Quando("preencho os campos Contribuição Prev Próprio {string}, Contribuição Prev Geral Não Político {string} e Contribuição Prev Próprio Não Politico {string} para alteração")
	public void preencho_os_campos_Contribuição_Prev_Próprio_Contribuição_Prev_Geral_Não_Político_e_Contribuição_Prev_Próprio_Não_Politico_para_alteração(String contribuicaoPrevProp, String contribuicaoPrevGeralNaoPoli, String contribuicaoPrevProprioNaoPoli) throws Exception {
		this.escrever(campocontribuicaoPrevProp, contribuicaoPrevProp);
		this.escrever(campocontribuicaoPrevGeralNaoPoli, contribuicaoPrevGeralNaoPoli);
		this.escrever(campocontribuicaoPrevProprioNaoPoli, contribuicaoPrevProprioNaoPoli);
	}

	@Quando("por fim clico no botao salvar da tela resumo folha para alteração")
	public void por_fim_clico_no_botao_salvar_da_tela_resumo_folha_para_alteração() throws Exception {
	    this.clicar(botaosalvar);
	}

	@Então("recebo uma mensagem de inclusão do resumo folha {string} para alteração")
	public void recebo_uma_mensagem_de_inclusão_do_resumo_folha_para_alteração(String mensagem) throws Exception {
		this.VerificaMensagemSucesso(mensagemAlteracao, mensagem);
	}
	
	
	/**************** Metodo Exclusão Alteração Resumo Folha ****************/
	
	/*Exclusão Alteração Geral*/
	@Dado("que acesso ao submenu resumo folha para exclusão para alteração")
	public void que_acesso_ao_submenu_resumo_folha_para_exclusão_para_alteração() throws Exception {
	    this.acessoGeral(acessoaosubmenu);
	}
	
	@Dado("que acesso ao menu e ao submenu resumo folha para exclusão para alteração")
	public void que_acesso_ao_menu_e_ao_submenu_resumo_folha_para_exclusão_para_alteração() throws Exception {
	    this.chamaCaminho5pDefinindoTipoLocator(acessoaopainel, acessoaosubmenu, null, null, null);
	}

	@Quando("preencho o filtro competência {string} para alteração")
	public void preencho_o_filtro_competência_para_alteração(String competencia) throws Exception {
	    this.escrever(filtroCompetencia, competencia);
	}

	@Quando("clico no botao buscar, excluir da tela resumo folha, clico no botão confirmar para alteração")
	public void clico_no_botao_buscar_excluir_da_tela_resumo_folha_clico_no_botão_confirmar_para_alteração() throws Exception {
	    this.triadeExclusão(botaobuscar, botaoexcluir, botaoconfirmar);
	}

	@Então("recebo uma mensagem de exclusão na tela de resumo folha {string} para alteração")
	public void recebo_uma_mensagem_de_exclusão_na_tela_de_resumo_folha_para_alteração(String mensagem) throws Exception {
	   this.VerificaMensagemSucesso(mensagemSucessoExclusao, mensagem);
	}
}