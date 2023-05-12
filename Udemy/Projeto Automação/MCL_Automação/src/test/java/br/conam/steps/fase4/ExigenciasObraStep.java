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

public class ExigenciasObraStep extends Base {
	
	private static By acessoaopainel = By.xpath("//li[4]/a/span");
	private static By acessoaosubmenu = By.linkText("Exigência Obra");
	private static By botaoalterar = By.xpath("//td[3]/a[2]");
	
	private static By selecaoconstaAutosRelatorio = By.xpath("//label[2]/div/div[3]/span");
	private static By itemconstaAutosRelatorio = By.id("exigenciaObraDados:exigenciaObraForm:tabLicitacao:inicialDados:constaImpactoAmbiental_1");
	private static By selecaoprojetoObraContempla = By.xpath("//section[2]/label[2]/div/div[3]/span");
	private static By itemprojetoObraContempla = By.id("exigenciaObraDados:exigenciaObraForm:tabLicitacao:inicialDados:asseguraAcessoPortadorDeficiencia_1");
	private static By selecaoconstaAutosAlvara = By.xpath("//section[3]/label[2]/div/div[3]/span");
	private static By itemconstaAutosAlvara = By.id("exigenciaObraDados:exigenciaObraForm:tabLicitacao:inicialDados:constaAlvaraConstrucao_1");
	private static By selecaotrataseObraRodoviaria = By.xpath("//section[4]/label[2]/div/div[3]/span");
	private static By itemtrataseObraRodoviaria = By.id("exigenciaObraDados:exigenciaObraForm:tabLicitacao:inicialDados:trataseObraRodoviaria_2");
	private static By selecaohouveLevantamento = By.xpath("//section[5]/label[2]/div/div[3]/span");
	private static By itemhouveLevantamento = By.id("exigenciaObraDados:exigenciaObraForm:tabLicitacao:inicialDados:houveLevantamentoCondicoes_1");
	private static By selecaodefinicaoArea = By.xpath("//section[6]/label[2]/div/div[3]/span");
	private static By itemdefinicaoArea = By.id("exigenciaObraDados:exigenciaObraForm:tabLicitacao:inicialDados:adotadosCriteriosTecnicos_1");
	private static By selecaoconjuntoObras = By.xpath("//section[7]/label[2]/div/div[3]/span");
	private static By itemconjuntoObras = By.id("exigenciaObraDados:exigenciaObraForm:tabLicitacao:inicialDados:houvePadronizacaoPorTipo_1");
	private static By selecaohaAnotacoes = By.xpath("//section[8]/label[2]/div/div[3]/span");
	private static By itemhaAnotacoes = By.id("exigenciaObraDados:exigenciaObraForm:tabLicitacao:inicialDados:existeAnotacoesRespTecnica_1");
	private static By selecaodataEmissao = By.id("exigenciaObraDados:exigenciaObraForm:tabLicitacao:inicialDados:dataEmissao_input");
	private static By itemdataEmissao = By.linkText("27");
	
	private static By botaoproximo = By.linkText("Próximo");
	private static By abalicencaambiental = By.linkText("Licença ambiental");
	
	/*Aba Licença Ambiental*/
	private static By selecaoexisteLicenca = By.xpath("//div[2]/section/label[2]/div/div[3]/span");
	private static By itemexisteLicenca = By.id("exigenciaObraDados:exigenciaObraForm:tabLicitacao:licencaAmbientalDados:existeLicencaAmbiental_2");
	private static By selecaoidentifiquelicenca = By.xpath("//div[3]/section/label[2]/div/div[3]/span");
	private static By itemidentifiqueLicenca = By.id("exigenciaObraDados:exigenciaObraForm:tabLicitacao:licencaAmbientalDados:tipoLicencaAmbiental_1");
	private static By camponumeroLicenca = By.id("exigenciaObraDados:exigenciaObraForm:tabLicitacao:licencaAmbientalDados:numeroLicenca");
	private static By selecaodataLicenca = By.id("exigenciaObraDados:exigenciaObraForm:tabLicitacao:licencaAmbientalDados:dataLicenca_input");
	private static By itemdataLicenca = By.linkText("27");
	private static By botaoadicionar = By.xpath("//section[4]/a/i");
	private static By botaosalvar = By.xpath("//div[2]/footer/a[2]/i");
	private static By mensagemdesucesso = By.xpath("//div[10]/div/div/div[2]");
	
	@Dado("que acesso ao menu fasequatro e ao submenu exigência obra")
	public void que_acesso_ao_menu_fasequatro_e_ao_submenu_exigência_obra() throws Exception {
	    this.chamaCaminho5pDefinindoTipoLocator(acessoaopainel, acessoaosubmenu, null, null, null);
	}

	@Quando("clico no botao alterar da licitação selecionada")
	public void clico_no_botao_alterar_da_licitação_selecionada() throws Exception {
	    this.clicar(botaoalterar);
	}

	@Quando("seleciono os combobox consta nos autos o relatório de impacto ambiental, o projeto da obra contempla as exigências contidas nos artigos, consta nos autos o alvará de construção da obra e trata se de obra rodoviária ou de saneamento")
	public void seleciono_os_combobox_consta_nos_autos_o_relatório_de_impacto_ambiental_o_projeto_da_obra_contempla_as_exigências_contidas_nos_artigos_consta_nos_autos_o_alvará_de_construção_da_obra_e_trata_se_de_obra_rodoviária_ou_de_saneamento() throws Exception {
	    this.selecionaComboBox(selecaoconstaAutosRelatorio, itemconstaAutosRelatorio);
	    this.selecionaComboBox(selecaoprojetoObraContempla, itemprojetoObraContempla);
	    this.selecionaComboBox(selecaoconstaAutosAlvara, itemconstaAutosAlvara);
	    this.selecionaComboBox(selecaotrataseObraRodoviaria, itemtrataseObraRodoviaria);
	}

	@Quando("seleciono os combobox houve levantamento das condições físicas das áreas selecionadas, na definição dessas áreas foram adotados critérios técnicos contidos no artigo, num conjunto de obras para um mesmo fim houve padronização por tipo ou classe de acordo com o projeto e há anotações da responsabilidade técnica e seleciono o campo data da emissão")
	public void seleciono_os_combobox_houve_levantamento_das_condições_físicas_das_áreas_selecionadas_na_definição_dessas_áreas_foram_adotados_critérios_técnicos_contidos_no_artigo_num_conjunto_de_obras_para_um_mesmo_fim_houve_padronização_por_tipo_ou_classe_de_acordo_com_o_projeto_e_há_anotações_da_responsabilidade_técnica_e_seleciono_o_campo_data_da_emissão() throws Exception {
	    this.selecionaComboBox(selecaohouveLevantamento, itemhouveLevantamento);
	    this.selecionaComboBox(selecaodefinicaoArea, itemdefinicaoArea);
	    this.selecionaComboBox(selecaoconjuntoObras, itemconjuntoObras);
	    this.selecionaComboBox(selecaohaAnotacoes, itemhaAnotacoes);
	    this.CampoData(selecaodataEmissao, itemdataEmissao);
	}

	@Quando("clico no botão próximo e clico na aba licença ambiental")
	public void clico_no_botão_próximo_e_clico_na_aba_licença_ambiental() throws Exception {
	    this.clicar(botaoproximo);
	    this.clicar(abalicencaambiental);
	}

	@Quando("seleciono o combobox existe licença ambiental e identifique as licenças expedidas, preencho o campo número da licença {string} e seleciono a data do campo data da licença e clico no botao adicionar")
	public void seleciono_o_combobox_existe_licença_ambiental_e_identifique_as_licenças_expedidas_preencho_o_campo_número_da_licença_e_seleciono_a_data_do_campo_data_da_licença_e_clico_no_botao_adicionar(String numeroLicenca) throws Exception {
	    this.selecionaComboBox(selecaoexisteLicenca, itemexisteLicenca);
	    this.selecionaComboBox(selecaoidentifiquelicenca, itemidentifiqueLicenca);
	    this.escrever(camponumeroLicenca, numeroLicenca);
	    this.selecionaComboBox(selecaodataLicenca, itemdataLicenca);
	    this.clicar(botaoadicionar);
	}

	@Quando("clico no botão salvar")
	public void clico_no_botão_salvar() throws Exception {
	    this.clicar(botaosalvar);
	}

	@Então("recebo uma mensagem de alteração {string}")
	public void recebo_uma_mensagem_de_alteração(String mensagem) {
	    Assert.assertEquals(mensagem, this.obterTexto(mensagemdesucesso));
	}
}
