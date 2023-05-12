package br.conam.steps.fase4;

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

public class PagamentoStep extends Base {
	private static By acessoaopainel = By.linkText("Fase 4");
	private static By acessoaosubmenu = By.linkText("Pagamento");
	
	private static By selecaonumeroMedicao = By.xpath("//label[2]/div/div[3]");
	private static By itemnumeroMedicao = By.id("pagamentoDados:pagamentoForm:numeroMedicao_1");
	private static By selecaonumeroNotaFiscal = By.xpath("//section[2]/label[2]/div/div[3]");
	private static By itemnumeroNotaFiscal = By.id("pagamentoDados:pagamentoForm:documentoFiscal_1");
	private static By selecaodataPagamento = By.id("pagamentoDados:pagamentoForm:data_input");
	private static By itemdataPagamento = By.linkText("3");
	private static By campopagamentoEfetuado = By.id("pagamentoDados:pagamentoForm:valor_input");
	private static By selecaoforamEfetuados = By.xpath("//div[2]/section[2]/label[2]/div/div[3]/span");
	private static By itemforamEfetuados = By.id("pagamentoDados:pagamentoForm:recolhidoEncargoPrevidenciario_2");
	private static By botaoadicionar = By.xpath("//section[3]/a/i");
	
	private static By botaosalvar = By.linkText("Salvar");
	private static By mensagemdesucesso = By.xpath("//div[10]/div/div/div[2]/span");
	
	@Dado("que acesso ao menu fasequatro e ao submenu pagamento")
	public void que_acesso_ao_menu_fasequatro_e_ao_submenu_pagamento() throws Exception {
	    this.chamaCaminho5pDefinindoTipoLocator(acessoaopainel, acessoaosubmenu, null, null, null);
	}

	@Quando("seleciono os comboboxes numero da medição, numero da nota fiscal e preencho o campo data de pagamento")
	public void seleciono_os_comboboxes_numero_da_medição_numero_da_nota_fiscal_e_preencho_o_campo_data_de_pagamento() throws Exception {
	    this.selecionaComboBox(selecaonumeroMedicao, itemnumeroMedicao);
	    waitBase(2);
	    this.selecionaComboBox(selecaonumeroNotaFiscal, itemnumeroNotaFiscal);
	    waitBase(2);
	    this.CampoData(selecaodataPagamento, itemdataPagamento);
	}

	@Quando("preencho o campo valor do pagamento efetuado {string} e seleciono o combobox foram efetuados os recolhimentos dos encargos previdenciários")
	public void preencho_o_campo_valor_do_pagamento_efetuado_e_seleciono_o_combobox_foram_efetuados_os_recolhimentos_dos_encargos_previdenciários(String valorPagamento) throws Exception {
	    this.escrever(campopagamentoEfetuado, valorPagamento);
	    waitBase(2);
	    this.clicar(selecaoforamEfetuados);
	    waitBase(2);
	    this.selecionaComboBox(selecaoforamEfetuados, itemforamEfetuados);
	}

	@Quando("clico no botao adicionar e salvar")
	public void clico_no_botao_adicionar_e_salvar() throws Exception {
	    this.clicar(botaoadicionar);
	    waitBase(2);
	    this.clicar(botaosalvar);
	}

	@Então("recebo uma mensagem de sucesso {string}")
	public void recebo_uma_mensagem_de_sucesso(String mensagem) {
	    Assert.assertEquals(mensagem, this.obterTexto(mensagemdesucesso));
	}
}