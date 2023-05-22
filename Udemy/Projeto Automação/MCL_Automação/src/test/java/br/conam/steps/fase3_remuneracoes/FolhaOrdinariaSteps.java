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

public class FolhaOrdinariaSteps extends Base {
	
	/**************** LOCATORS INCLUSÃO FOLHA ORDINARIA ****************/
	
	private static By acessoaopainel = By.xpath("//li[3]/a/span");
	private static By acessoaosubmenu = By.linkText("Folha Ordinária");
	private static By botaonovafolhaordinaria = By.linkText("Nova Folha Ordinária");
	private static By itemlotacaoAgentePublico = By.id("folhaOrdinariaDados:folhaOrdinariaForm:folhaOrdinariaAgentePublico:folhaOrdinariaAgentePublico:j_idt59");
	private static By campolotacaoAgentePublico = By.id("folhaOrdinariaDados:folhaOrdinariaForm:folhaOrdinariaAgentePublico:folhaOrdinariaAgentePublico:folhaOrdinariaAgentePublico_input");
	private static By selecaoestagiario = By.xpath("//label[2]/div/div[3]/span");
	private static By itemestagiario = By.id("folhaOrdinariaDados:folhaOrdinariaForm:estagiario_1");
	private static By selecaopossuiAutorizacaoReceberAcimaTeto = By.xpath("//section[2]/label[2]/div/div[3]/span");
	private static By itempossuiAutorizacaoReceberAcimaTeto = By.id("folhaOrdinariaDados:folhaOrdinariaForm:possuiAutorizRecebAcimaTeto_1");
	private static By selecaosituacao = By.xpath("//section[3]/label[2]/div/div[3]/span");
	private static By itemsituacao = By.id("folhaOrdinariaDados:folhaOrdinariaForm:situacao_2");
	private static By campocompetencia = By.id("folhaOrdinariaDados:folhaOrdinariaForm:competencia");
	private static By botaosalvar = By.linkText("Salvar");
	private static By mensagemdesucesso = By.xpath("//div[10]/div/div/div[2]");
	
	/**************** LOCATORS EXCLUSÃO ****************/
	
	private static By selecaosituacao1 = By.xpath("//label[2]/div/div[3]/span");
	private static By itemsituacao1 = By.id("filterForm:situacao_3");
	private static By botaobuscar = By.id("filterForm:j_idt57");
	private static By botaoexcluir = By.id("form:consultaTable:0:j_idt83");
	private static By botaoconfirmar = By.id("form:j_idt87");
	private static By mensagemSucessoExclusao = By.xpath("//div[10]/div/div/div[2]/span");
	
	/**************** LOCATORS ALTERAÇÃO ****************/
	
	private static By botaoAlteracao = By.xpath("//td[2]/a[2]/i");
	private static By itemfiltrosituacaoAlteracao = By.id("filterForm:situacao_2");
	private static By itemestagiarioAlteracao = By.id("folhaOrdinariaDados:folhaOrdinariaForm:estagiario_2");
	private static By itempossuiAutorizacaoAlteracao = By.id("folhaOrdinariaDados:folhaOrdinariaForm:possuiAutorizRecebAcimaTeto_2");
	private static By itemsituacaoAlteracao = By.id("folhaOrdinariaDados:folhaOrdinariaForm:situacao_3");
	private static By mensagemAlteracao = By.xpath("//div[10]/div/div/div[2]/span");
	
	
	/**************** Metódo Inclusão Folha Ordinaria ****************/
	
	/*Inclusão Geral*/
	@Dado("que acesso ao submenu folha ordinaria")
	public void que_acesso_ao_submenu_folha_ordinaria() throws Exception {
		waitBase(2);
		this.clicar(acessoaosubmenu);
	}
	@Dado("que acesso ao menu fasetresremuneracoes e ao submenu folha ordinaria")
	public void que_acesso_ao_menu_fasetresremuneracoes_e_ao_submenu_folha_ordinaria() throws Exception {
	    this.chamaCaminho5pDefinindoTipoLocator(acessoaopainel, acessoaosubmenu, null, null, null);
	}
	
	@Quando("clico no botao novafolhaordinaria")
	public void clico_no_botao_novafolhaordinaria() throws Exception {
		this.clicar(botaonovafolhaordinaria);
	}

	@Quando("seleciono e preencho o comboboxes lotação agente público {string} e seleciono os combobox estagiario, possui autorização receber acima teto, situacao e preencho o campo competência {string}")
	public void seleciono_e_preencho_o_comboboxes_lotação_agente_público_e_seleciono_os_combobox_estagiario_possui_autorização_receber_acima_teto_situacao_e_preencho_o_campo_competência(String lotacaoAgentePublico, String competencia) throws Exception {
		this.escreverId(campolotacaoAgentePublico, lotacaoAgentePublico, itemlotacaoAgentePublico);
		this.selecionaComboBox(selecaoestagiario, itemestagiario);
	    this.selecionaComboBox(selecaopossuiAutorizacaoReceberAcimaTeto, itempossuiAutorizacaoReceberAcimaTeto);
	    this.selecionaComboBox(selecaosituacao, itemsituacao);
	    this.escrever(campocompetencia, competencia);
	}  

	@Quando("por fim clico no botao salvar para salvar os dados preenchidos acima")
	public void por_fim_clico_no_botao_salvar_para_salvar_os_dados_preenchidos_acima() throws Exception {
	    this.clicar(botaosalvar);
	}

	@Então("me é apresentado uma mensagem de inclusão de folha ordinaria {string}")
	public void me_é_apresentado_uma_mensagem_de_inclusão_de_folha_ordinaria(String mensagem) throws Exception {
		this.VerificaMensagemSucesso(mensagemdesucesso, mensagem);
	}
	
	
	/**************** Metódo Exclusão Folha Ordinaria ****************/
	
	/*Exclusão Geral*/
	@Dado("que acesso ao submenu folha ordinária")
	public void que_acesso_ao_submenu_folha_ordinária() throws Exception {
		waitBase(2);
		this.clicar(acessoaosubmenu);
	}
	
	@Dado("que acesso ao menu fase três remunerações e ao submenu folha ordinária")
	public void que_acesso_ao_menu_fase_três_remunerações_e_ao_submenu_folha_ordinária() throws Exception {
	    this.chamaCaminho5pDefinindoTipoLocator(acessoaopainel, acessoaosubmenu, null, null, null);
	}

	@Quando("seleciono o combobox situação")
	public void seleciono_o_combobox_situação() throws Exception {
	    this.selecionaComboBox(selecaosituacao1, itemsituacao1);
	}

	@Quando("clico no botão buscar, excluir e clico no botão confirmar da tela folha ordinária")
	public void clico_no_botão_buscar_excluir_e_clico_no_botão_confirmar_da_tela_folha_ordinária() throws Exception {
	    this.triadeExclusão(botaobuscar, botaoexcluir, botaoconfirmar);
	}

	@Então("recebo uma mensagem de sucesso na tela de folha ordinária {string}")
	public void recebo_uma_mensagem_de_sucesso_na_tela_de_folha_ordinária(String mensagem) throws Exception {
		this.VerificaMensagemSucesso(mensagemSucessoExclusao, mensagem);
	}
	
	
	/**************** Metódo Alteração Folha Ordinária ****************/ 
	
	/*Alteração Geral*/
	@Dado("que acesso ao submenu folha ordinaria para alteração")
	public void queAcessoAoSubmenuFolhaOrdinariaParaAlteração() throws Exception {
	    this.acessoGeral(acessoaosubmenu);
	}
	
	@Dado("que acesso ao menu fasetresremuneracoes e ao submenu folha ordinaria para alteração")
	public void que_acesso_ao_menu_fasetresremuneracoes_e_ao_submenu_folha_ordinaria_para_alteração() throws Exception {
	    this.chamaCaminho5pDefinindoTipoLocator(acessoaopainel, acessoaosubmenu, null, null, null);
	}

	@Quando("seleciono o filtro situação clico no botão buscar e alterar")
	public void seleciono_o_filtro_situação_clico_no_botão_buscar_e_alterar() throws Exception {
	    this.selecionaComboBox(selecaosituacao1, itemfiltrosituacaoAlteracao);
	    this.acessaAlteração(botaobuscar, botaoAlteracao);
	}

	@Quando("seleciono e preencho o comboboxes lotação agente público {string} e seleciono os combobox estagiario, possui autorização receber acima teto, situacao e preencho o campo competência {string} para alteração")
	public void seleciono_e_preencho_o_comboboxes_lotação_agente_público_e_seleciono_os_combobox_estagiario_possui_autorização_receber_acima_teto_situacao_e_preencho_o_campo_competência_para_alteração(String lotacaoAgentePublico, String competencia) throws Exception {
		this.escreverId(campolotacaoAgentePublico, lotacaoAgentePublico, itemlotacaoAgentePublico);
		this.selecionaComboBox(selecaoestagiario, itemestagiarioAlteracao);
	    this.selecionaComboBox(selecaopossuiAutorizacaoReceberAcimaTeto, itempossuiAutorizacaoAlteracao);
	    this.selecionaComboBox(selecaosituacao, itemsituacaoAlteracao);
	    this.escrever(campocompetencia, competencia);
	    waitBase(2);
	    this.escrever(campocompetencia, competencia);
	}

	@Quando("por fim clico no botao salvar para salvar os dados preenchidos acima para alteração")
	public void por_fim_clico_no_botao_salvar_para_salvar_os_dados_preenchidos_acima_para_alteração() throws Exception {
	    this.clicar(botaosalvar);
	}

	@Então("me é apresentado uma mensagem de inclusão de folha ordinaria {string} para alteração")
	public void me_é_apresentado_uma_mensagem_de_inclusão_de_folha_ordinaria_para_alteração(String mensagem) throws Exception {
		this.VerificaMensagemSucesso(mensagemAlteracao, mensagem);
	} 
	
	
	/**************** Metódo Exclusão Alteração Folha Ordinária *****************/ 
	
	/*Exclusão Alteração Geral*/
	@Dado("que acesso ao submenu folha ordinária para exclusão alteração")
	public void que_acesso_ao_submenu_folha_ordinária_para_exclusão_alteração() throws Exception {
		this.acessoGeral(acessoaosubmenu);
	}
	
	@Dado("que acesso ao menu fase três remunerações e ao submenu folha ordinária para alteração")
	public void que_acesso_ao_menu_fase_três_remunerações_e_ao_submenu_folha_ordinária_para_alteração() throws Exception {
	    this.chamaCaminho5pDefinindoTipoLocator(acessoaopainel, acessoaosubmenu, null, null, null);
	}

	@Quando("seleciono o combobox situação para alteração")
	public void seleciono_o_combobox_situação_para_alteração() throws Exception {
	   this.selecionaComboBox(selecaosituacao1, itemsituacao1);
	}

	@Quando("clico no botão buscar, excluir e clico no botão confirmar da tela folha ordinária para alteração")
	public void clico_no_botão_buscar_excluir_e_clico_no_botão_confirmar_da_tela_folha_ordinária_para_alteração() throws Exception {
	    this.triadeExclusão(botaobuscar, botaoexcluir, botaoconfirmar);
	}

	@Então("recebo uma mensagem de sucesso na tela de folha ordinária {string} para alteração")
	public void recebo_uma_mensagem_de_sucesso_na_tela_de_folha_ordinária_para_alteração(String mensagem) throws Exception {
	    this.VerificaMensagemSucesso(mensagemSucessoExclusao, mensagem);
	}
}