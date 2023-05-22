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

public class PagamentoFolhaStep extends Base{
	
	
	/**************** LOCATORS INCLUSÃO ****************/
	
	private static By acessoaopainel = By.xpath("//li[3]/a/span");
	private static By acessoaosubmenu = By.linkText("Pagamento Folha");
	private static By botaonovopagamento = By.linkText("Novo Pagamento");
	private static By itemlotacaoAgentePublico = By.id("pagamentoFolhaDados:pagamentoForm:pagamentoAgentePublico:pagamentoAgentePublico:j_idt59");
	private static By campolotacaoAgentePublico = By.id("pagamentoFolhaDados:pagamentoForm:pagamentoAgentePublico:pagamentoAgentePublico:pagamentoAgentePublico_input");
	private static By campocompetencia = By.id("pagamentoFolhaDados:pagamentoForm:competencia");
	private static By campobanco = By.id("pagamentoFolhaDados:pagamentoForm:numeroBanco:numeroBanco_input");
	private static By campoagencia = By.id("pagamentoFolhaDados:pagamentoForm:agencia:agencia_input");
	private static By campocontaCorrente = By.id("pagamentoFolhaDados:pagamentoForm:contaCorrente:contaCorrente_input");
	private static By campovalorPagoContaCorrente = By.id("pagamentoFolhaDados:pagamentoForm:valorPagoContaCorrente:valorPagoContaCorrente_input");
	private static By campovalorPagoOutrasFormas = By.id("pagamentoFolhaDados:pagamentoForm:valorPagoOutrasFormas:valorPagoOutrasFormas_input");
	private static By botaosalvar = By.linkText("Salvar");
	private static By mensagemdesucesso = By.xpath("//div[10]/div/div/div[2]/span");
	
	/**************** LOCATORS EXCLUSÃO ****************/
	
	private static By campocompetencia1 = By.id("filterForm:competencia");
	private static By itemagentePublico1 = By.id("filterForm:agentePublico:agentePublico:j_idt67");
	private static By campoagentePublico1 = By.id("filterForm:agentePublico:agentePublico:agentePublico_input");
	private static By botaobuscar = By.id("filterForm:j_idt71");
	private static By botaoexcluir = By.xpath("//td[5]/a[3]/i");
	private static By botaoconfirmar = By.id("form:j_idt107");
	private static By mensagemSucessoExclusao = By.xpath("//div[10]/div/div/div[2]");
	
	/**************** LOCATORS ALTERAÇÃO ****************/
	
	private static By botaoAlteracao = By.xpath("//td[5]/a[2]/i");
	private static By mensagemAlteracao = By.xpath("//div[10]/div/div/div[2]/span");
	
	
	/**************** Metódo Inclusão Pagamento Folha ****************/
	
	/*Inclusão Geral*/
	@Dado("que acesso ao submenu pagamentoFolha")
	public void que_acesso_ao_submenu_pagamentoFolha() throws Exception {
		waitBase(2);
		this.clicar(acessoaosubmenu);
	}
	
	@Dado("que acesso ao menu fase três remuneração e ao submenu pagamentoFolha")
	public void que_acesso_ao_menu_fase_três_remunaração_e_ao_submenu_pagamentoFolha1() throws Exception {
		this.chamaCaminho5pDefinindoTipoLocator(acessoaopainel, acessoaosubmenu, null, null, null);
	}

	@Quando("clico no botao novo pagamento")
	public void clicoNoBotaoNovoPagamento() throws Exception {
	    this.clicar(botaonovopagamento);
	}

	@Quando("seleciono e preencho comboBox lotação Agente Público {string} e preencho os campos competencia {string}, banco {string}, agencia {string}, conta corrente {string}")
	public void seleciono_e_preencho_comboBox_lotação_Agente_Público_e_preencho_os_campos_competencia_banco_agencia_conta_corrente(String lotacaoAgentePublico, String competencia, String banco, String agencia, String contaCorrente) throws Exception {
	    this.escreverId(campolotacaoAgentePublico, lotacaoAgentePublico, itemlotacaoAgentePublico);
		waitBase(2);
		this.escrever(campocompetencia, competencia);
		waitBase(2);
		this.escrever(campocompetencia, competencia);
		this.escrever(campobanco, banco);
		this.escrever(campoagencia, agencia);
		this.escrever(campocontaCorrente, contaCorrente);
	}

	@Quando("valor pago conta corrente {string} e valor pago outras formas {string}")
	public void valor_pago_conta_corrente_e_valor_pago_outras_formas(String valorPagoContaCorrente, String valorPagoOutrasFormas) throws Exception {
	    this.escrever(campovalorPagoContaCorrente, valorPagoContaCorrente);
	    this.escrever(campovalorPagoOutrasFormas, valorPagoOutrasFormas);
	}

	@Quando("por fim clico no botao salvar para salvar os dados da inclusão de pagamento folha")
	public void por_fim_clico_no_botao_salvar_para_salvar_os_dados_da_inclusão_de_pagamento_folha() throws Exception {
	    this.clicar(botaosalvar);
	}

	@Então("recebo uma mensagem de inclusão {string}")
	public void recebo_uma_mensagem_de_inclusão(String mensagem) throws Exception {
		this.VerificaMensagemSucesso(mensagemdesucesso, mensagem);
	}
	
	
	/**************** Metódo Exclusão Pagamento Folha ****************/

	@Dado("que acesso ao submenu pagamento folha")
	public void que_acesso_ao_submenu_pagamento_folha() throws Exception {
		waitBase(2);
		this.clicar(acessoaosubmenu);
	}
	
	@Dado("que acesso ao menu fase três remuneração e ao submenu pagamento folha")
	public void que_acesso_ao_menu_fase_três_remuneração_e_ao_submenu_pagamento_folha() throws Exception {
	    this.chamaCaminho5pDefinindoTipoLocator(acessoaopainel, acessoaosubmenu, null, null, null);
	}

	@Quando("preencho o campo competência {string}, preencho o combobox agente público {string}")
	public void preenchoOCampoCompetênciaPreenchoOComboboxAgentePúblico(String competencia, String agentePublico) throws Exception {
	    waitBase(2);
		this.escrever(campocompetencia1, competencia);
	    waitBase(2);
	    this.escreverId(campoagentePublico1, agentePublico, itemagentePublico1);
	}

	@Quando("clico no botão buscar, excluir e no botão confirmar da tela pagamento folha")
	public void clico_no_botão_buscar_excluir_e_no_botão_confirmar_da_tela_pagamento_folha() throws Exception {
	    this.triadeExclusão(botaobuscar, botaoexcluir, botaoconfirmar);
	}

	@Então("recebo uma mensagem de sucesso na tela de pagamento folha {string}")
	public void recebo_uma_mensagem_de_sucesso_na_tela_de_pagamento_folha(String mensagem) throws Exception {
		this.VerificaMensagemSucesso(mensagemSucessoExclusao, mensagem);
	}
	
	
	/**************** Metódos Alteração ****************/
	
	@Dado("que acesso ao submenu pagamentoFolha para alteração")
	public void queAcessoAoSubmenuPagamentoFolhaParaAlteração() throws Exception {
	    this.acessoGeral(acessoaosubmenu);
	}
	
	@Dado("que acesso ao menu fase três remuneração e ao submenu pagamentoFolha para alteração")
	public void que_acesso_ao_menu_fase_três_remuneração_e_ao_submenu_pagamentoFolha_para_alteração() throws Exception {
	    this.chamaCaminho5pDefinindoTipoLocator(acessoaopainel, acessoaosubmenu, null, null, null);
	}

	@Quando("preencho o filtro competência {string}, seleciono e preencho o campo agente público {string}, clico em buscar e alterar")
	public void preencho_o_filtro_competência_seleciono_e_preencho_o_campo_agente_público_clico_em_buscar_e_alterar(String competencia, String lotacaoAgentePublico) throws Exception {
	    this.escrever(campocompetencia1, competencia);
	    this.escreverId(campoagentePublico1, lotacaoAgentePublico, itemagentePublico1);
	    this.acessaAlteração(botaobuscar, botaoAlteracao);
	}

	@Quando("seleciono e preencho comboBox lotação Agente Público {string} e preencho os campos competencia {string}, banco {string}, agencia {string}, conta corrente {string} para alteração")
	public void seleciono_e_preencho_comboBox_lotação_Agente_Público_e_preencho_os_campos_competencia_banco_agencia_conta_corrente_para_alteração(String lotacaoAgentePublico, String competencia, String banco, String agencia, String contaCorrente) throws Exception {
		 this.escreverId(campolotacaoAgentePublico, lotacaoAgentePublico, itemlotacaoAgentePublico);
		 waitBase(2);
		 this.escrever(campocompetencia, competencia);
		 waitBase(2);
		 this.escrever(campobanco, banco);
		 this.escrever(campoagencia, agencia);
		 this.escrever(campocontaCorrente, contaCorrente);
	}

	@Quando("valor pago conta corrente {string} e valor pago outras formas {string} para alteração")
	public void valor_pago_conta_corrente_e_valor_pago_outras_formas_para_alteração(String valorPagoContaCorrente, String valorPagoOutrasFormas) throws Exception {
		this.escrever(campovalorPagoContaCorrente, valorPagoContaCorrente);
	    this.escrever(campovalorPagoOutrasFormas, valorPagoOutrasFormas);
	}

	@Quando("por fim clico no botao salvar para salvar os dados da inclusão de pagamento folha para alteração")
	public void por_fim_clico_no_botao_salvar_para_salvar_os_dados_da_inclusão_de_pagamento_folha_para_alteração() throws Exception {
		this.clicar(botaosalvar);
	}
	
	@Então("recebo uma mensagem de inclusão {string} para alteração")
	public void recebo_uma_mensagem_de_inclusão_para_alteração(String mensagem) throws Exception {
		this.VerificaMensagemSucesso(mensagemAlteracao, mensagem);
	}
	
	
	/**************** Metódos Exclusão Alteração Pagamento Folha *****************/
	
	/*Exclusão Alteração Geral*/
	@Dado("que acesso ao menu submenu pagamento folha para exclusão alteração")
	public void que_acesso_ao_menu_submenu_pagamento_folha_para_exclusão_alteração() throws Exception {
		this.acessoGeral(acessoaosubmenu);
	}
	
	@Dado("que acesso ao menu fase três remuneração e ao submenu pagamento folha para alteração")
	public void que_acesso_ao_menu_fase_três_remuneração_e_ao_submenu_pagamento_folha_para_alteração() throws Exception {
		this.chamaCaminho5pDefinindoTipoLocator(acessoaopainel, acessoaosubmenu, null, null, null);
	}

	@Quando("preencho o campo competência {string}, seleciono o combobox agente público {string} para alteração")
	public void preencho_o_campo_competência_seleciono_o_combobox_agente_público_para_alteração(String competencia, String agentePublico) throws Exception {
		waitBase(2);
		this.escrever(campocompetencia1, competencia);
	    waitBase(2);
	    this.escreverId(campoagentePublico1, agentePublico, itemagentePublico1);
	}

	@Quando("clico no botão buscar, excluir e no botão confirmar da tela pagamento folha para alteração")
	public void clico_no_botão_buscar_excluir_e_no_botão_confirmar_da_tela_pagamento_folha_para_alteração() throws Exception {
	    this.triadeExclusão(botaobuscar, botaoexcluir, botaoconfirmar);
	}

	@Então("recebo uma mensagem de sucesso na tela de pagamento folha {string} para alteração")
	public void recebo_uma_mensagem_de_sucesso_na_tela_de_pagamento_folha_para_alteração(String mensagem) throws Exception {
	    this.VerificaMensagemSucesso(mensagemSucessoExclusao, mensagem);
	}
}