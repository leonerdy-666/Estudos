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



public class EmpenhoStep extends Base {
	
	private static By acessoaopainel = By.xpath("//li[4]/a/span");
	private static By acessoaosubmenu = By.linkText("Empenho");
	
	private static By botaoalterar = By.xpath("//td[3]/a[2]");
	private static By camponotaEmpenho = By.id("empenhoDados:empenhoForm:numero");
	private static By selecaodata = By.id("empenhoDados:empenhoForm:data_input");
	private static By itemdata = By.linkText("1");
	private static By campovalor = By.id("empenhoDados:empenhoForm:valor_input");
	private static By selecaofonteRecurso = By.xpath("//label[2]/div/div[3]/span");
	private static By itemfonteRecurso = By.id("empenhoDados:empenhoForm:fonteRecurso_1");
	
	private static By botaoadicionar = By.xpath("//section[3]/a/i");
	private static By botaosalvar = By.linkText("Salvar");
	private static By mensagemdesucesso = By.xpath("//div[10]/div/div/div[2]/span");
	
	@Dado("que acesso ao menu fasequatro e ao submenu")
	public void que_acesso_ao_menu_fasequatro_e_ao_submenu() throws Exception {
	    this.chamaCaminho5pDefinindoTipoLocator(acessoaopainel, acessoaosubmenu, null, null, null);
	}

	@Quando("clico no botao alteração")
	public void clico_no_botao_alteração() throws Exception {
	    this.clicar(botaoalterar);
	}

	@Quando("preencho o campo nota de empenho documento similar {string}, seleciono o campo data, preencho o campo valor {string} e seleciono o combobox fonte recursos e clico no botão adicionar")
	public void preencho_o_campo_nota_de_empenho_documento_similar_seleciono_o_campo_data_preencho_o_campo_valor_e_seleciono_o_combobox_fonte_recursos_e_clico_no_botão_adicionar(String notaEmpenho, String valor) throws Exception {
	    this.escrever(camponotaEmpenho, notaEmpenho);
	    this.CampoData(selecaodata, itemdata);
	    this.escrever(campovalor, valor);
	    this.selecionaComboBox(selecaofonteRecurso, itemfonteRecurso);
	    this.clicar(botaoadicionar);
	}
	
	@Quando("clico no botao salvar para salvar os dados alterados")
	public void clico_no_botao_salvar_para_salvar_os_dados_alterados() throws Exception {
	    this.clicar(botaosalvar);
	}

	@Então("recebo uma mensagem de sucesso de alteração {string}")
	public void recebo_uma_mensagem_de_sucesso_de_alteração(String mensagem) {
	    Assert.assertEquals(mensagem, this.obterTexto(mensagemdesucesso));
	}
}
