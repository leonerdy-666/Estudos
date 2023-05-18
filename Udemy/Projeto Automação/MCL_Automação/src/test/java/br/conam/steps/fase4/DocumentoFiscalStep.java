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

public class DocumentoFiscalStep extends Base {
	
	private static By acessoaopainel = By.linkText("Fase 4");
	private static By acessoaosubenu = By.linkText("Documento Fiscal");
	private static By botaoalterar = By.xpath("//td[3]/a[2]");
	
	private static By selecaonumeroMedicao = By.xpath("//label[2]/div/div[3]/span");
	private static By itemnumeroMedicao = By.id("documentoFiscalDados:documentoFiscalForm:numeroMedicao_1");
	private static By selecaonumeroEmpenho = By.xpath("//section[2]/label[2]/div/div[3]/span");
	private static By itemnumeroEmpenho = By.id("documentoFiscalDados:documentoFiscalForm:notaEmpenhoDTO_1");
	private static By selecaoorigemDocumento = By.xpath("//div[2]/section/label[2]/div/div[3]/span");
	private static By itemorigemDocumento = By.id("documentoFiscalDados:documentoFiscalForm:estado_1");
	private static By camponumeroDocumento = By.id("documentoFiscalDados:documentoFiscalForm:numero");
	private static By selecaodataDocumento = By.id("documentoFiscalDados:documentoFiscalForm:data_input");
	private static By itemdataDocumento = By.linkText("20");
	private static By campovalorDocumento = By.id("documentoFiscalDados:documentoFiscalForm:valor_input");
	
	private static By botaoadicionar = By.xpath("//section[3]/a/i");
	private static By botaosalvar = By.linkText("Salvar");
	private static By mensagemdesucesso = By.xpath("//div[10]/div/div/div[2]");
	
	@Dado("que acesso ao menu fasequatro e ao submenu documento fiscal")
	public void que_acesso_ao_menu_fasequatro_e_ao_submenu_documento_fiscal() throws Exception {
	    this.chamaCaminho5pDefinindoTipoLocator(acessoaopainel, acessoaosubenu, null, null, null);
	}

	@Quando("clico no botao alterar")
	public void clico_no_botao_alterar() throws Exception {
	    this.clicar(botaoalterar);
	}

	@Quando("seleciono os combobox numero da medição, numero empenho documentos similar e origem do documento fiscal estado")
	public void seleciono_os_combobox_numero_da_medição_numero_empenho_documentos_similar_e_origem_do_documento_fiscal_estado() throws Exception {
	    this.selecionaComboBox(selecaonumeroMedicao, itemnumeroMedicao);
	    waitBase(2);
	    this.selecionaComboBox(selecaonumeroEmpenho, itemnumeroEmpenho);
	    waitBase(2);
	    this.selecionaComboBox(selecaoorigemDocumento, itemorigemDocumento);
	}

	@Quando("preencho os campos numero do documento fiscal emitido pelo contratado{string}, seleciono o campo data do documento fiscal e preencho o campo  valor do documento fiscal {string} e clico no botao adicionar")
	public void preencho_os_campos_numero_do_documento_fiscal_emitido_pelo_contratado_seleciono_o_campo_data_do_documento_fiscal_e_preencho_o_campo_valor_do_documento_fiscal_e_clico_no_botao_adicionar(String numeroDocumento, String valorDocumento) throws Exception {
	    this.escrever(camponumeroDocumento, numeroDocumento);
	    waitBase(2);
	    this.CampoData(selecaodataDocumento, itemdataDocumento);
	    waitBase(2);
	    this.escrever(campovalorDocumento, valorDocumento);
	    this.clicar(botaoadicionar);
	}

	@Quando("clico no botao salvar para salvar as alterações do documento fiscal")
	public void clico_no_botao_salvar_para_salvar_as_alterações_do_documento_fiscal() throws Exception {
	    this.clicar(botaosalvar);
	}

	@Então("recebo uma mensagem de alteração do documento fiscal {string}")
	public void recebo_uma_mensagem_de_alteração_do_documento_fiscal(String mensagem) {
	    Assert.assertEquals(mensagem, this.obterTexto(mensagemdesucesso));
	}
}