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


public class CargoStep extends Base {


	/**************** LOCATORS INCLUSÃO CARGO ****************/

	private static By acessoaoPainel = By.xpath("//li[2]/a/span");
	private static By acessoaoSubmenu = By.linkText("Cargo");
	private static By botaonovoCargo = By.linkText("Novo Cargo");
	private static By campocodigo = By.id("cargoDados:cargoForm:codigo");
	private static By camponome = By.id("cargoDados:cargoForm:nome");
	private static By selecaotipo = By.xpath("//label[2]/div/div[3]/span");
	private static By itemtipo = By.id("cargoDados:cargoForm:tipo_3");
	private static By selecaoregiJuri = By.xpath("//section[2]/label[2]/div/div[3]/span");
	private static By itemregiJuri = By.id("cargoDados:cargoForm:regimeJuridico_1");
	private static By selecaoescola = By.xpath("//section[3]/label[2]/div/div[3]/span");
	private static By itemescola = By.id("cargoDados:cargoForm:escolaridade_2");
	private static By selecaoexerAtivi = By.xpath("//section[4]/label[2]/div/div[3]/span");
	private static By itemexerAtivi = By.id("cargoDados:cargoForm:exercicioAtividade_1");
	private static By selecaoformaProv = By.xpath("//div[3]/section/label[2]/div/div[3]/span");
	private static By itemformaProv = By.id("cargoDados:cargoForm:formaProvimento_1");
	private static By campototalHoras = By.id("cargoDados:cargoForm:totalHoras:totalHoras_input");
	private static By selecaocargoPoli = By.xpath("//div[3]/section[3]/label[2]/div/div[3]/span");
	private static By itemcargoPoli = By.id("cargoDados:cargoForm:cargoPolitico_1");
	
	/*popUp*/
	private static By botaoadicionarhistorico = By.id("cargoDados:cargoForm:j_idt93");
	private static By selecaomovimentacao = By.xpath("//div/div/div[3]/span"); 
	private static By itemmovimentacao = By.id("editCargoHistoricoVaga:formPopupEditCargoHistoricoVaga:movimentacao_1");
	private static By campoatoNorma = By.id("editCargoHistoricoVaga:formPopupEditCargoHistoricoVaga:atoNormativo:atoNormativo:atoNormativo_input");
	private static By itematoNorma = By.cssSelector("td.ui-panelgrid-cell.direita");
	private static By selecaofundamentoLegal = By.xpath("//div[4]/div/div/div/div[3]/span");
	private static By itemfundamentoLegal = By.id("editCargoHistoricoVaga:formPopupEditCargoHistoricoVaga:fundamentoLegal_0");
	private static By selecaotipoNorma = By.xpath("//div[2]/div/div/div[3]/span");
	private static By itemtipoNorma = By.id("editCargoHistoricoVaga:formPopupEditCargoHistoricoVaga:tipoNorma_0");
	private static By selecaodataMovimentacao = By.id("editCargoHistoricoVaga:formPopupEditCargoHistoricoVaga:dataMovimentacao_input");
	private static By itemdataGeral = By.linkText("28");
	private static By campoquantidade = By.id("editCargoHistoricoVaga:formPopupEditCargoHistoricoVaga:quantidade:quantidade_input");
	private static By botaosalvarpopUp = By.id("editCargoHistoricoVaga:formPopupEditCargoHistoricoVaga:j_idt166");
	private static By botaosalvar = By.linkText("Salvar");
	private static By mensagemdeSucesso = By.xpath("//div[10]/div/div/div[2]");
	
	/**************** LOCATORS EXCLUSÃO CARGO ****************/

	private static By filtroNome = By.id("filterForm:nome");
	private static By botaoBuscar = By.id("filterForm:j_idt55");
	private static By botaoExcluir = By.id("form:consultaTable:0:j_idt83"); 
	private static By botaoConfirma = By.id("form:j_idt87");
	private static By mensagemSucessoExclusao = By.xpath("//div[10]/div/div/div[2]");

	/**************** LOCATORS ALTERAÇÃO ****************/ 

	private static By botaoAlteracao = By.xpath("//td[3]/a[2]");
	private static By itemtipoAlteração = By.id("cargoDados:cargoForm:tipo_1");
	private static By itemregimeJuridicoAlteracao = By.id("cargoDados:cargoForm:regimeJuridico_2");
	private static By itemescolaridadeAlteracao = By.id("cargoDados:cargoForm:escolaridade_1");
	private static By itemexercicioAtividadeAlteracao = By.id("cargoDados:cargoForm:exercicioAtividade_2");
	private static By itemformaProvimentoAlteracao = By.id("cargoDados:cargoForm:formaProvimento_2");
	private static By itemcargoPoliticoAlteracao = By.id("cargoDados:cargoForm:cargoPolitico_2");

	/*popUp*/
	private static By itemfundamentoLegalAlteracao = By.id("editCargoHistoricoVaga:formPopupEditCargoHistoricoVaga:fundamentoLegal_1");
	private static By itemtipoNormaAlteracao = By.id("editCargoHistoricoVaga:formPopupEditCargoHistoricoVaga:tipoNorma_1");
	private static By itemdataGeralAlteracao = By.linkText("18");
	private static By botaoexclusaoVagasAlteracao = By.id("cargoDados:cargoForm:dtHistorico:0:j_idt113");
	private static By mensagemAlteracao = By.xpath("//div[10]/div/div/div[2]");


	/**************** Metódo Inclusão Cargo ****************/

	/*Inclusão Geral*/
	@Dado("que acesso ao submenu cargo")
	public void que_acesso_ao_submenu_cargo() throws Exception {
		this.acessoGeral(acessoaoSubmenu);
	}

	@Dado("que acesso ao menu fasetres e ao submenu cargo")
	public void que_acesso_ao_menu_fasetres_e_ao_submenu_cargo() throws Exception {
		this.chamaCaminho5pDefinindoTipoLocator(acessoaoPainel, acessoaoSubmenu, null, null, null);
	}

	@Dado("clico no botao novocargo")
	public void clico_no_botao_novocargo() throws Exception {
		this.clicar(botaonovoCargo);
	}

	@Dado("preencho os campos Código {string}, Nome {string}, e seleciono os comboboxes tipo, regime juridico, escolaridade e exercicio atividade")
	public void preencho_os_campos_Código_Nome_e_seleciono_os_comboboxes_tipo_regime_juridico_escolaridade_e_exercicio_atividade(String codigo, String nome) throws Exception {
		this.escrever(campocodigo, codigo);
		this.escrever(camponome, nome);
		this.selecionaComboBox(selecaotipo, itemtipo);
		this.selecionaComboBox(selecaoregiJuri, itemregiJuri);
		this.selecionaComboBox(selecaoescola, itemescola);
		this.selecionaComboBox(selecaoexerAtivi, itemexerAtivi);
	}

	@Dado("seleciono o comboboxes forma provimente, preencho o campo total horas {string} e seleciono o comboboxe cargo politico")
	public void seleciono_o_comboboxes_forma_provimente_preencho_o_campo_total_horas_e_seleciono_o_comboboxe_cargo_politico(String totalHoras) throws Exception {
		this.selecionaComboBox(selecaoformaProv, itemformaProv);
		waitBase(2);
		this.escrever(campototalHoras, totalHoras);
		this.selecionaComboBox(selecaocargoPoli, itemcargoPoli);
	}

	@Dado("clico no botao adicionar historico seleciono os combobox movimentação, preencho e seleciono combobox ato normativo {string}, fundamento legal, tipo norma, e preencho os campos data movimentação e quantidade {string}")
	public void clicoNoBotaoAdicionarHistoricoSelecionoOsComboboxMovimentaçãoPreenchoESelecionoComboboxAtoNormativoFundamentoLegalTipoNormaEPreenchoOsCamposDataMovimentaçãoEQuantidade(String atoNormativo, String quantidade) throws Exception {
	    this.clicar(botaoadicionarhistorico);
		waitBase(2);
		this.selecionaComboBox(selecaomovimentacao, itemmovimentacao);
		waitBase(2);
		this.escreverId(campoatoNorma, atoNormativo, itematoNorma);
		waitBase(2);
		this.selecionaComboBox(selecaofundamentoLegal, itemfundamentoLegal);
		this.selecionaComboBox(selecaotipoNorma, itemtipoNorma);
		this.CampoData(selecaodataMovimentacao, itemdataGeral);
		waitBase(2);
		this.escrever(campoquantidade, quantidade);
	}

	@Dado("clico no botão salvar do popup historico e clico no botão salvar")
	public void clicoNoBotãoSalvarDoPopupHistoricoEClicoNoBotãoSalvar() throws Exception {
		waitBase(2);
		this.clicar(botaosalvarpopUp);
		this.VerificaMensagemPopUp(botaosalvar);
	}

	@Então("recebo uma mensagem de inclusão de cargo {string}")
	public void receboUmaMensagemDeInclusãoDeCargo(String mensagem) throws Exception {
		this.VerificaMensagemSucesso(mensagemdeSucesso, mensagem);
	}


	/*************** Metódo Exclusão Cargo ***************/

	/*Exclusão Geral*/
	@Dado("que acesso ao submenu cargo para exclusão")
	public void que_acesso_ao_submenu_cargo_para_exclusão() throws Exception {
		this.acessoGeral(acessoaoSubmenu);
	}

	@Dado("que acesso ao menu fasetres e ao submenu cargo para exclusão")
	public void que_acesso_ao_menu_fasetres_e_ao_submenu_cargo_para_exclusão() throws Exception {
		this.chamaCaminho5pDefinindoTipoLocator(acessoaoPainel, acessoaoSubmenu, null, null, null);
	}

	@Quando("preencho o campo nome {string} para exclusão do cargo")
	public void preencho_o_campo_nome_para_exclusão_do_cargo(String nome) throws Exception {
		this.escrever(filtroNome, nome);
	}

	@Quando("clico no botao buscar, excluir e confirmo a exclusão do cargo")
	public void clico_no_botao_buscar_excluir_e_confirmo_a_exclusão_do_cargo() throws Exception {
		this.triadeExclusão(botaoBuscar, botaoExcluir, botaoConfirma);
	}

	@Então("recebo uma mensagem de exclusão com sucesso {string}")
	public void recebo_uma_mensagem_de_exclusão_com_sucesso(String mensagem) throws Exception {
		this.VerificaMensagemSucesso(mensagemSucessoExclusao, mensagem);
	}


	/**************** Metodo Alteração Cargo ****************/ 
	
	/*Alteração Geral*/
	@Dado("que acesso ao submenu cargo para alteração")
	public void que_acesso_ao_submenu_cargo_para_alteração() throws Exception {
		this.acessoGeral(acessoaoSubmenu);
	}
	
	@Dado("que acesso ao menu fasetres e ao submenu cargo para alteração")
	public void que_acesso_ao_menu_fasetres_e_ao_submenu_cargo_para_alteração() throws Exception {
		this.chamaCaminho5pDefinindoTipoLocator(acessoaoPainel, acessoaoSubmenu, null, null, null);
	}

	@Quando("preencho o filtro nome {string} clico no botão buscar e no botão alterar")
	public void preencho_o_filtro_nome_clico_no_botão_buscar_e_no_botão_alterar(String nome) throws Exception {
		this.escrever(filtroNome, nome);
		this.acessaAlteração(botaoBuscar, botaoAlteracao);
	}

	@Quando("preencho os campos Código {string}, Nome {string}, e seleciono os comboboxes tipo, regime juridico, escolaridade e exercicio atividade para alteração")
	public void preencho_os_campos_Código_Nome_e_seleciono_os_comboboxes_tipo_regime_juridico_escolaridade_e_exercicio_atividade_para_alteração(String codigo, String nome2) throws Exception {
		this.escrever(campocodigo, codigo);
		this.escrever(camponome, nome2);
		this.selecionaComboBox(selecaotipo, itemtipoAlteração);
		this.selecionaComboBox(selecaoregiJuri, itemregimeJuridicoAlteracao);
		this.selecionaComboBox(selecaoescola, itemescolaridadeAlteracao);
		this.selecionaComboBox(selecaoexerAtivi, itemexercicioAtividadeAlteracao);
	}

	@Quando("seleciono o comboboxes forma provimente, preencho o campo total horas {string} e seleciono o comboboxe cargo politico para alteração")
	public void seleciono_o_comboboxes_forma_provimente_preencho_o_campo_total_horas_e_seleciono_o_comboboxe_cargo_politico_para_alteração(String totalHoras) throws Exception {
		this.selecionaComboBox(selecaoformaProv, itemformaProvimentoAlteracao);
		this.escrever(campototalHoras, totalHoras);
		this.selecionaComboBox(selecaocargoPoli, itemcargoPoliticoAlteracao);
	}

	@Quando("clico no botão excluir da vaga adicionada anteriormente para alteração")
	public void clicoNoBotãoExcluirDaVagaAdicionadaAnteriormenteParaAlteração() throws Exception {
		this.clicar(botaoexclusaoVagasAlteracao);
	}
	
	@Quando("clico no botao adicionar historico seleciono os combobox movimentação preencho o combobox ato normativo {string}, fundamento legal, tipo norma, e preencho os campos data movimentação e quantidade {string} para alteração")
	public void clico_no_botao_adicionar_historico_seleciono_os_combobox_movimentação_preencho_o_combobox_ato_normativo_fundamento_legal_tipo_norma_e_preencho_os_campos_data_movimentação_e_quantidade_para_alteração(String atoNormativo, String quantidade) throws Exception {
	    this.clicar(botaoadicionarhistorico);
		waitBase(2);
		this.selecionaComboBox(selecaomovimentacao, itemmovimentacao);
		this.escreverId(campoatoNorma, atoNormativo, itematoNorma);
		this.selecionaComboBox(selecaofundamentoLegal, itemfundamentoLegalAlteracao);
		this.selecionaComboBox(selecaotipoNorma, itemtipoNormaAlteracao);
		this.CampoData(selecaodataMovimentacao, itemdataGeralAlteracao);
		this.escrever(campoquantidade, quantidade);
	}

	@Quando("clico no botão salvar do popup historico e clico no botão salvar para alteração")
	public void clicoNoBotãoSalvarDoPopupHistoricoEClicoNoBotãoSalvarParaAlteração() throws Exception {
		waitBase(2);
		this.clicar(botaosalvarpopUp);
		this.VerificaMensagemPopUp(botaosalvar);
	}


	@Então("recebo uma mensagem de inclusão de cargo {string} na tela de alteração")
	public void recebo_uma_mensagem_de_inclusão_de_cargo_na_tela_de_alteração(String mensagem) throws Exception {
		this.VerificaMensagemSucesso(mensagemAlteracao, mensagem);
	}
	
	
	/**************** Metodo Alteração Cargo *****************/ 
	
	/*Exclusão Alteração*/
	@Dado("que acesso ao submenu cargo para exclusão para alteração")
	public void que_acesso_ao_submenu_cargo_para_exclusão_para_alteração() throws Exception  {
		this.acessoGeral(acessoaoSubmenu);
	}
	
	@Dado("que acesso ao menu fasetres e ao submenu cargo para exclusão para alteração")
	public void que_acesso_ao_menu_fasetres_e_ao_submenu_cargo_para_exclusão_para_alteração() throws Exception {
		this.chamaCaminho5pDefinindoTipoLocator(acessoaoPainel, acessoaoSubmenu, null, null, null);
	}

	@Quando("preencho o campo nome {string} para exclusão do cargo para alteração")
	public void preencho_o_campo_nome_para_exclusão_do_cargo_para_alteração(String nome) throws Exception {
		this.escrever(filtroNome, nome);
	}

	@Quando("clico no botao buscar, excluir e confirmo a exclusão do cargo para alteração")
	public void clico_no_botao_buscar_excluir_e_confirmo_a_exclusão_do_cargo_para_alteração() throws Exception {
		this.triadeExclusão(botaoBuscar, botaoExcluir, botaoConfirma);
	}

	@Então("recebo uma mensagem de exclusão com sucesso {string} para alteração")
	public void recebo_uma_mensagem_de_exclusão_com_sucesso_para_alteração(String mensagem) throws Exception {
		this.VerificaMensagemSucesso(mensagemSucessoExclusao, mensagem);
	}
}