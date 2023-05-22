package br.conam.steps.fase3_remuneracoes;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.support.ui.ExpectedConditions;

import br.conam.core.Base;
import cucumber.api.Scenario;
import cucumber.api.java.AfterStep;
import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Então;

public class FolhaSuplementarStep extends Base {
	
	/**************** LOCATORS INCLUSÃO ****************/
	
	private static By acessoaopainel = By.xpath("//li[3]/a/span");
	private static By acessoaosubmenu = By.linkText("Folha Suplementar");
	private static By botanovafolhasuplementar = By.linkText("Nova Folha Suplementar");
	private static By selecaofolhaOrdinaria = By.xpath("//button/span");
	private static By itemfolhaOrdinaria = By.id("folhaSuplementarDados:folhaSuplementarForm:folhaOrdinaria:folhaOrdinaria:j_idt59");
	private static By itemlotacaoAgentePublico = By.id("folhaSuplementarDados:folhaSuplementarForm:loteAgentePublico:loteAgentePublico:j_idt70");
	private static By campolotacaoAgentePublico = By.id("folhaSuplementarDados:folhaSuplementarForm:loteAgentePublico:loteAgentePublico:loteAgentePublico_input");
	private static By selecaoestagiario = By.xpath("//label[2]/div/div[3]/span");
	private static By itemestagiario = By.id("folhaSuplementarDados:folhaSuplementarForm:estagiario_1");
	
	/*Valores*/
	private static By botaoadicionar = By.id("folhaSuplementarDados:folhaSuplementarForm:j_idt89");
	private static By campototalGeralRemuneracaoBruta = By.id("editFolhaSuplementarValores:formPopupEditFolhaSuplementarValores:totalGeralRemuneracaoBruta:totalGeralRemuneracaoBruta_input");
	private static By campototalGeralDescontos = By.id("editFolhaSuplementarValores:formPopupEditFolhaSuplementarValores:totalGeralDescontos:totalGeralDescontos_input");
	private static By campototalGeralRemuneracaoLiquida = By.id("editFolhaSuplementarValores:formPopupEditFolhaSuplementarValores:totalGeralRemuneracaoLiquida:totalGeralRemuneracaoLiquida_input");
	private static By campovalorPagoContaCorrente = By.id("editFolhaSuplementarValores:formPopupEditFolhaSuplementarValores:valorPagoContaCorrente:valorPagoContaCorrente_input");
	private static By campovalorPagoOutrasFormas = By.id("editFolhaSuplementarValores:formPopupEditFolhaSuplementarValores:valorPagoOutrasFormas:valorPagoOutrasFormas_input");
	private static By botaosalvarpopUp = By.id("editFolhaSuplementarValores:formPopupEditFolhaSuplementarValores:j_idt172"); 
	private static By selecaopossuiAutorizacaoReceberAcimaTeto = By.xpath("//section[2]/label[2]/div/div[3]/span");
	private static By itempossuiAutorizacaoReceberAcimaTeto = By.id("folhaSuplementarDados:folhaSuplementarForm:possuiAutorizRecebAcimaTeto_1");
	private static By selecaosituacao = By.xpath("//section[3]/label[2]/div/div[3]/span");
	private static By itemsituacao = By.id("folhaSuplementarDados:folhaSuplementarForm:situacao_2");
	private static By botaosalvar = By.linkText("Salvar");
	private static By mensagemdesucesso = By.xpath("//div[10]/div/div/div[2]/span");
	
	/**************** LOCATORS EXCLUSÃO ****************/
	
	private static By selecaosituacao1 = By.xpath("//label[2]/div/div[3]");
	private static By itemsituacao1 = By.id("filterForm:situacao_2");
	private static By botaobuscar = By.id("filterForm:j_idt57");
	private static By botaoexcluir = By.xpath("//td[2]/a[3]/i");
	private static By botaoonfirmar = By.id("form:j_idt87");
	private static By mensagemSucessoExclusao = By.xpath("//div[10]/div/div/div[2]");
	
	/*************** LOCATORS ALTERAÇÃO ***************/ 
	
	private static By botaoAlteracao = By.xpath("//td[2]/a[2]/i");
	private static By itemestagiarioAlteracao = By.id("folhaSuplementarDados:folhaSuplementarForm:estagiario_2");
	private static By itempossuiautorizacaoalteracao = By.id("folhaSuplementarDados:folhaSuplementarForm:possuiAutorizRecebAcimaTeto_2");
	private static By itemsituacaoAlteracao = By.id("folhaSuplementarDados:folhaSuplementarForm:situacao_2");
	private static By mensagemAlteracao = By.xpath("//div[10]/div/div/div[2]");
	
	
	/**************** Metódo Inclusão Folha Suplementar ****************/
	
	/*Inclusão Geral*/
	@Dado("qua acesso ao submenu folha suplementar")
	public void qua_acesso_ao_submenu_folha_suplementar() throws Exception {
		this.acessoGeral(acessoaosubmenu);
	}
	@Dado("que acesso ao menu fasetresremunerações e ao submenu folha suplementar")
	public void queAcessoAoMenuFasetresremuneraçõesEAoSubmenuFolhaSuplementar() throws Exception {
	    this.chamaCaminho5pDefinindoTipoLocator(acessoaopainel, acessoaosubmenu, null, null, null);
	}

	@Quando("clico no botao novafolhasuplementar")
	public void clico_no_botao_novafolhasuplementar() throws Exception {
		this.clicar(botanovafolhasuplementar);
	}

	@Quando("seleciono os comboboxes folha ordinária, lotação agente público {string} e seleciono os coboboxes estagiario, possui autorização receber acima teto e situação")
	public void selecionoOsComboboxesFolhaOrdináriaLotaçãoAgentePúblicoESelecionoOsCoboboxesEstagiarioPossuiAutorizaçãoReceberAcimaTetoESituação(String lotacaoAgentePublico) throws Exception {
	    this.selecionaComboId(selecaofolhaOrdinaria, itemfolhaOrdinaria);
		this.escreverId(campolotacaoAgentePublico, lotacaoAgentePublico, itemlotacaoAgentePublico);
		this.selecionaComboBox(selecaopossuiAutorizacaoReceberAcimaTeto, itempossuiAutorizacaoReceberAcimaTeto);
	    this.selecionaComboBox(selecaosituacao, itemsituacao);
	    this.selecionaComboBox(selecaoestagiario, itemestagiario);
	}
 
	
	@Quando("clico no botão adicionar e preencho os campos total geral remuneração bruta {string}, total geral descontos {string}, total geral remuneração líquida {string}, valor pago conta corrente {string} e valor pago outras formas {string} e clico no botão salvar")
	public void clicoNoBotãoAdicionarEPreenchoOsCamposTotalGeralRemuneraçãoBrutaTotalGeralDescontosTotalGeralRemuneraçãoLíquidaValorPagoContaCorrenteEValorPagoOutrasFormasEClicoNoBotãoSalvar(String totalGeralRemuneracaoBruta, String totalGeralDescontos, String totalGeralRemuneracaoLiquida, String valorPagoContaCorrente, String valorPagoOutrasFormas) throws Exception {
		this.clicar(botaoadicionar);
		waitBase(2);
		this.escrever(campototalGeralRemuneracaoBruta, totalGeralRemuneracaoBruta);
		this.escrever(campototalGeralDescontos, totalGeralDescontos);
		this.escrever(campototalGeralRemuneracaoLiquida, totalGeralRemuneracaoLiquida);
		this.escrever(campovalorPagoContaCorrente, valorPagoContaCorrente);
		this.escrever(campovalorPagoOutrasFormas, valorPagoOutrasFormas);
		this.clicar(botaosalvarpopUp);
		waitBase(2);
		this.VerificaMensagemPopUp(botaosalvar);
	}

	@Então("recebo uma mensagem de inclusão de folha suplementar {string}")
	public void recebo_uma_mensagem_de_inclusão_de_folha_suplementar(String mensagem) throws Exception {
		this.VerificaMensagemSucesso(mensagemdesucesso, mensagem);
	}
	
	
	/**************** Metódo Exclusão Folha Suplementar ****************/
	
	/*Exclusão Geral*/
	@Dado("que acesso ao submenu folha suplementar")
	public void que_acesso_ao_submenu_folha_suplementar() throws Exception {
	    this.acessoGeral(acessoaosubmenu);
	}
	
	@Dado("que acesso ao menu fase três remunerações e ao submenu folha suplementar")
	public void que_acesso_ao_menu_fase_três_remunerações_e_ao_submenu_folha_suplementar() throws Exception {
	    this.chamaCaminho5pDefinindoTipoLocator(acessoaopainel, acessoaosubmenu, null, null, null);
	}
	
	@Quando("seleciono o combobox situação da tela folha sumplementar")
	public void seleciono_o_combobox_situação_da_tela_folha_sumplementar() throws Exception {
	    this.selecionaComboBox(selecaosituacao1, itemsituacao1);
	}

	@Quando("clico no botão buscar, excluir e confirmar da tela folha suplementar")
	public void clico_no_botão_buscar_excluir_e_confirmar_da_tela_folha_suplementar() throws Exception {
	    this.triadeExclusão(botaobuscar, botaoexcluir, botaoonfirmar);
	}

	@Então("recebo uma mensagem de sucesso na tela folha suplementar {string}")
	public void recebo_uma_mensagem_de_sucesso_na_tela_folha_suplementar(String mensagem) throws Exception {
		this.VerificaMensagemSucesso(mensagemSucessoExclusao, mensagem);
	}	
	
	
	/**************** Metódo Alteração ****************/

	@Dado("qua acesso ao submenu folha suplementar para alteração")
	public void quaAcessoAoSubmenuFolhaSuplementarParaAlteração() throws Exception {
	    this.acessoGeral(acessoaosubmenu);
	}
	
	@Dado("qua acesso ao menu fasetresremunerações e ao submenu folha suplementar para alteração")
	public void qua_acesso_ao_menu_fasetresremunerações_e_ao_submenu_folha_suplementar_para_alteração() throws Exception {
	    this.chamaCaminho5pDefinindoTipoLocator(acessoaopainel, acessoaosubmenu, null, null, null);
	}

	@Quando("seleciono o filtro situação clico no botão buscar e alterar para alteração")
	public void seleciono_o_filtro_situação_clico_no_botão_buscar_e_alterar_para_alteração() throws Exception {
		this.selecionaComboBox(selecaosituacao1, itemsituacao1);
		this.acessaAlteração(botaobuscar, botaoAlteracao);
	}

	@Quando("seleciono os comboboxes folha ordinária, lotação agente público {string} e seleciono os coboboxes estagiario, possui autorização receber acima teto e situação para alteração")
	public void selecionoOsComboboxesFolhaOrdináriaLotaçãoAgentePúblicoESelecionoOsCoboboxesEstagiarioPossuiAutorizaçãoReceberAcimaTetoESituaçãoParaAlteração(String lotacaoAgentePublico) throws Exception {
		this.selecionaComboId(selecaofolhaOrdinaria, itemfolhaOrdinaria);
		this.escreverId(campolotacaoAgentePublico, lotacaoAgentePublico, itemlotacaoAgentePublico);
		this.selecionaComboBox(selecaopossuiAutorizacaoReceberAcimaTeto, itempossuiautorizacaoalteracao);
	    this.selecionaComboBox(selecaosituacao, itemsituacaoAlteracao);
	    this.selecionaComboBox(selecaoestagiario, itemestagiarioAlteracao);
	}

	@Quando("clico no botão adicionar e preencho os campos total geral remuneração bruta {string}, total geral descontos {string}, total geral remuneração líquida {string}, valor pago conta corrente {string} e valor pago outras formas {string} e clico no botão salvar para alteração")
	public void clicoNoBotãoAdicionarEPreenchoOsCamposTotalGeralRemuneraçãoBrutaTotalGeralDescontosTotalGeralRemuneraçãoLíquidaValorPagoContaCorrenteEValorPagoOutrasFormasEClicoNoBotãoSalvarParaAlteração(String totalGeralRemuneracaoBruta, String totalGeralDescontos, String totalGeralRemuneracaoLiquida, String valorPagoContaCorrente, String valorPagoOutrasFormas) throws Exception {
		this.clicar(botaoadicionar);
		waitBase(2);
		this.escrever(campototalGeralRemuneracaoBruta, totalGeralRemuneracaoBruta);
		this.escrever(campototalGeralDescontos, totalGeralDescontos);
		this.escrever(campototalGeralRemuneracaoLiquida, totalGeralRemuneracaoLiquida);
		this.escrever(campovalorPagoContaCorrente, valorPagoContaCorrente);
		this.escrever(campovalorPagoOutrasFormas, valorPagoOutrasFormas);
		this.clicar(botaosalvarpopUp);
		this.VerificaMensagemPopUp(botaosalvar);
	}
	@Então("recebo uma mensagem de inclusão de folha suplementar {string} para alteração")
	public void recebo_uma_mensagem_de_inclusão_de_folha_suplementar_para_alteração(String mensagem) throws Exception {
		this.VerificaMensagemSucesso(mensagemAlteracao, mensagem);
	}
	
	
	/**************** Metódo Exclusão Alteração Folha Suplementar ****************/
	
	/*Exclusão Alteração Geral*/
	@Dado("que acesso ao submenu folha suplementar para exclusão alteração")
	public void que_acesso_ao_submenu_folha_suplementar_para_exclusão_alteração() throws Exception  {
		waitBase(2);
		this.clicar(acessoaopainel);
		waitBase(2);
		this.clicar(acessoaosubmenu);
	}
	
	@Dado("que acesso ao menu fase três remunerações e ao submenu folha suplementar para alteração")
	public void que_acesso_ao_menu_fase_três_remunerações_e_ao_submenu_folha_suplementar_para_alteração() throws Exception {
	    this.chamaCaminho5pDefinindoTipoLocator(acessoaopainel, acessoaosubmenu, null, null, null);
	}

	@Quando("seleciono o combobox situação da tela folha sumplementar para alteração")
	public void seleciono_o_combobox_situação_da_tela_folha_sumplementar_para_alteração() throws Exception {
	    this.selecionaComboBox(selecaosituacao1, itemsituacao1);
	}

	@Quando("clico no botão buscar, excluir e confirmar da tela folha suplementar para alteração")
	public void clico_no_botão_buscar_excluir_e_confirmar_da_tela_folha_suplementar_para_alteração() throws Exception {
	    this.triadeExclusão(botaobuscar, botaoexcluir, botaoonfirmar);
	}

	@Então("recebo uma mensagem de sucesso na tela folha suplementar {string} para alteração")
	public void recebo_uma_mensagem_de_sucesso_na_tela_folha_suplementar_para_alteração(String mensagem) throws Exception {
		this.VerificaMensagemSucesso(mensagemSucessoExclusao, mensagem);
	}
}