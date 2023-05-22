package br.conam.steps.fase3;

import static br.conam.core.DriverFactory.getDriver;
import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import br.conam.core.Base;
import br.conam.core.DriverFactory;
import cucumber.api.Scenario;
import cucumber.api.java.AfterStep;
import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Então;


public class LotacaoStep extends Base {
	
	/**************** LOCATORS INCLUSÃO LOTAÇÃO ****************/
	
	private static By acessoaopainel = By.xpath("//li[2]/a/i");
	private static By acessoaosubmenu = By.linkText("Lotação");
	private static By botaonovaLotacao = By.linkText("Nova Lotação");
	private static By itemagentePublico = By.id("lotacaoDados:lotacaoForm:agentePublico:agentePublico:j_idt64");
	private static By campoagentePublico = By.id("lotacaoDados:lotacaoForm:agentePublico:agentePublico:agentePublico_input");
	private static By itemcargo = By.id("lotacaoDados:lotacaoForm:cargoLotacao:cargoLotacao:j_idt75");
	private static By campocargo = By.id("lotacaoDados:lotacaoForm:cargoLotacao:cargoLotacao:cargoLotacao_input");
	private static By selecaocargoFuncaoRemunerado = By.xpath("//label[2]/div/div[3]");
	private static By itemcargoFuncaoRemunerado = By.id("lotacaoDados:lotacaoForm:cargoRemunerado_1");
	private static By campounidadeLotacao = By.id("lotacaoDados:lotacaoForm:unidadeLotacao");
	private static By selecaofuncaoGorverno = By.xpath("//section[4]/label[2]/div/div[3]/span");
	private static By itemfuncaoGoverno = By.id("lotacaoDados:lotacaoForm:funcaoGoverno_1");
	private static By itemdataGeral = By.linkText("3");
	private static By selecaodataLotacao = By.id("lotacaoDados:lotacaoForm:dataLotacao_input");
	private static By selecaodataExercicio = By.id("lotacaoDados:lotacaoForm:dataExercicio_input");
	private static By selecaoexercicioAtividade = By.xpath("//section[3]/label[2]/div/div[3]/span");
	private static By itemexercicioAtividade = By.id("lotacaoDados:lotacaoForm:exercicioAtividade_1");
	private static By selecaoformaProvimento = By.xpath("//div[2]/section[4]/label[2]/div/div[3]/span");
	private static By itemformaProvimento = By.id("lotacaoDados:lotacaoForm:formaProvimento_1");
	
	/*popUp*/
	private static By botaoadicionarHistorico = By.id("lotacaoDados:lotacaoForm:j_idt108");
	private static By selecaosituacao = By.xpath("//div/div/div[3]/span");
	private static By itemsituacao = By.id("editLotacaoHistorico:formPopupEditLotacaoHistorico:situacao_1");
	private static By selecaodatahistorico = By.id("editLotacaoHistorico:formPopupEditLotacaoHistorico:dataHistoricoLotacao_input");
	private static By selecaodataExercicio1 = By.id("editLotacaoHistorico:formPopupEditLotacaoHistorico:dataExercicio_input");
	private static By itemdataExercicio1 = By.linkText("25");
	private static By botaosalvarPopUp = By.id("editLotacaoHistorico:formPopupEditLotacaoHistorico:j_idt159");
	private static By botaosalvarTela = By.linkText("Salvar");
	private static By mensagemdeSucesso = By.xpath("//div[10]/div/div");
	
	/**************** LOCATORS EXCLUSÃO LOTAÇÃO ****************/
	
	private static By filtroagentepublico = By.id("filterForm:agentePublico:agentePublico:agentePublico_input");
	private static By itemagentePublico1 = By.id("filterForm:agentePublico:agentePublico:j_idt64");
	private static By selecaosituacao1 = By.xpath("//label[2]/div/div[3]/span");
	private static By itemsituacao1 = By.id("filterForm:situacao_1");
	private static By selecaodatalotacao1 = By.id("filterForm:dataLotacao_input");
	private static By botaoBuscar = By.id("filterForm:j_idt76");
	private static By botaoExcluir = By.id("form:consultaTable:0:j_idt106");
	private static By botaoConfirma = By.id("form:j_idt110");
	private static By mensagemSucessoExclusao = By.xpath("//div[10]/div/div/div[2]/span");
	
	/**************** LOCATORS ALTERAÇÃO ****************/ 
	
	private static By botaoAlteracao = By.xpath("//td[4]/a[2]/i");
	private static By itemcargoFuncaoRemuneradoAlteracao = By.id("lotacaoDados:lotacaoForm:cargoRemunerado_2");
	private static By itemfuncaoGovernoAlteracao = By.id("lotacaoDados:lotacaoForm:funcaoGoverno_2");
	private static By itemexercicioAtividadeAlteracao = By.id("lotacaoDados:lotacaoForm:exercicioAtividade_2");
	private static By itemformaProvimentoAlteracao = By.id("lotacaoDados:lotacaoForm:formaProvimento_2");
	private static By botaoexcluirHistorico = By.xpath("//a[2]/i");
	private static By itemsituacaoAlteracao = By.id("editLotacaoHistorico:formPopupEditLotacaoHistorico:situacao_2");
	private static By selecaoaposentadoAlteracao = By.xpath("//span/div/div/div/div[3]/span");
	private static By itemaposentadoAlteracao = By.id("editLotacaoHistorico:formPopupEditLotacaoHistorico:tipoAposentadoria_1");
	private static By selecaodataExercicioAlteracao = By.id("editLotacaoHistorico:formPopupEditLotacaoHistorico:dataExercicio_input");
	private static By mensagemAlteracao = By.xpath("//div[10]/div/div");
	
	/**************** Metódo Inclusão Lotação ****************/
	
	/*inclusão Geral*/
	@Dado("que acesso ao submenu lotação")
	public void que_acesso_ao_submenu_lotação() throws Exception {
		this.acessoGeral(acessoaosubmenu);
	}
	
	@Dado("que acesso ao menu fase três e ao submenu lotação")
	public void que_acesso_ao_menu_fase_três_e_ao_submenu_lotação() throws Exception {
	    this.chamaCaminho5pDefinindoTipoLocator(acessoaopainel, acessoaosubmenu, null, null, null);
	}

	@Quando("clico no botão nova lotação")
	public void clico_no_botão_nova_lotação() throws Exception {
		waitBase(2);
		this.clicar(botaonovaLotacao);
	}

	@Quando("seleciono e preencho o combobox agente público {string}, cargo {string}, e seleciono os combobox cargo função remunerado, função governo, exercício atividade e forma provimento")
	public void selecionoEPreenchoOComboboxAgentePúblicoCargoESelecionoOsComboboxCargoFunçãoRemuneradoFunçãoGovernoExercícioAtividadeEFormaProvimento(String agentePublico, String cargo) throws Exception {
	    this.escreverId(campoagentePublico, agentePublico, itemagentePublico);
	    this.escreverId(campocargo, cargo, itemcargo);
	    this.selecionaComboBox(selecaocargoFuncaoRemunerado, itemcargoFuncaoRemunerado);
	    this.selecionaComboBox(selecaofuncaoGorverno, itemfuncaoGoverno);
	    this.selecionaComboBox(selecaoexercicioAtividade, itemexercicioAtividade);
	    this.selecionaComboBox(selecaoformaProvimento, itemformaProvimento);
	}

	@Quando("preencho os campos unidade lotação {string}, data lotação e data exercício")
	public void preencho_os_campos_unidade_lotação_data_lotação_e_data_exercício(String unidadeLotacao) throws Exception {
	    this.escrever(campounidadeLotacao, unidadeLotacao);
	    waitBase(2);
	    this.CampoData(selecaodataLotacao, itemdataGeral);
	    waitBase(2);
		this.CampoData(selecaodataExercicio, itemdataGeral);
	}
		
	
	@Quando("clico no botão adicionar historico e seleciono o combobox situação e preencho os campos data histórico e data exercício, clico no botão salvar popUp e no botão salvar")
	public void clicoNoBotãoAdicionarHistoricoESelecionoOComboboxSituaçãoEPreenchoOsCamposDataHistóricoEDataExercícioClicoNoBotãoSalvarPopUpENoBotãoSalvar() throws Exception {
	this.clicar(botaoadicionarHistorico);
	waitBase(2);
	this.selecionaComboBox(selecaosituacao, itemsituacao);
	waitBase(2);
	this.clicar(selecaodatahistorico);
	waitBase(2);
	this.CampoData(selecaodatahistorico, itemdataGeral);
	waitBase(2);
	this.CampoData(selecaodataExercicio1, itemdataExercicio1);
	waitBase(2);
	this.clicar(botaosalvarPopUp);
	this.VerificaMensagemPopUp(botaosalvarTela);
	}
	
	@Então("recebo uma mensagem de sucesso da tela lotação {string}")
	public void recebo_uma_mensagem_de_sucesso_da_tela_lotação(String mensagem) throws Exception {
		this.VerificaMensagemSucesso(mensagemdeSucesso, mensagem);
	}
	
	
	/**************** Metódo Exclusão Lotação ****************/
	
	/*Exclusão Geral*/
	@Dado("que acesso ao submenu Lotação")
	public void que_acesso_ao_submenu_Lotação() throws Exception {
		waitBase(2);
		this.clicar(acessoaopainel);
		waitBase(2);
		this.clicar(acessoaosubmenu);
	} 
	
	@Dado("que acesso ao menu fase três ao submenu Lotação")
	public void queAcessoAoMenuFaseTrêsAoSubmenuLotação() throws Exception {
	    this.chamaCaminho5pDefinindoTipoLocator(acessoaopainel, acessoaosubmenu, null, null, null);
	}

	@Quando("preencho o combobox agente público {string}, situação e preencho o campo data lotação")
	public void preencho_o_combobox_agente_público_situação_e_preencho_o_campo_data_lotação(String agentePublico) throws Exception {
		this.escreverId(filtroagentepublico, agentePublico, itemagentePublico1);
		this.selecionaComboBox(selecaosituacao1, itemsituacao1);
	    waitBase(2);
	    this.CampoData(selecaodatalotacao1, itemdataGeral);
	    }
	
	@Quando("clico no botão buscar, excluir e confirmar da tela lotação")
	public void clicoNoBotãoBuscarExcluirEConfirmarDaTelaLotação() throws Exception {
	    this.triadeExclusão(botaoBuscar, botaoExcluir, botaoConfirma);
	}

	@Então("recebo uma mensagem de sucesso na exclusão {string}")
	public void receboUmaMensagemDeSucessoNaExclusão(String mensagem) throws Exception {
		this.VerificaMensagemSucesso(mensagemSucessoExclusao, mensagem);
	}
	
 	
 	/**************** Metódos Alteração Lotação ****************/ 
 	
	/*Alteração Geral*/
 	@Dado("que acesso ao submenu lotação para alteração")
 	public void que_acesso_ao_submenu_lotação_para_alteração() throws Exception {
 	    this.acessoGeral(acessoaosubmenu);
 	}
	
 	@Dado("que acesso ao menu fase três e ao submenu lotação para alteração")
 	public void queAcessoAoMenuFaseTrêsEAoSubmenuLotaçãoParaAlteração() throws Exception {
 	    this.chamaCaminho5pDefinindoTipoLocator(acessoaopainel, acessoaosubmenu, null, null, null);
 	}

 	@Quando("preencho o filtro agente público {string}, situação e data lotação, clico no botão buscar e alterar")
 	public void preenchoOFiltroAgentePúblicoSituaçãoEDataLotaçãoClicoNoBotãoBuscarEAlterar(String agentePublico) throws Exception {
 	    waitBase(2);
		this.escreverId(filtroagentepublico, agentePublico, itemagentePublico1);
		waitBase(2);
		this.CampoData(selecaodatalotacao1, itemdataGeral);
		waitBase(2);
		this.acessaAlteração(botaoBuscar, botaoAlteracao);
 	}

 	@Quando("seleciono os comboboxes agente público {string}, cargo {string}, cargo função remunerado, função governo, exercício atividade e forma provimento para alteração")
 	public void selecionoOsComboboxesAgentePúblicoCargoCargoFunçãoRemuneradoFunçãoGovernoExercícioAtividadeEFormaProvimentoParaAlteração(String agentePublico, String cargo) throws Exception {
 		this.escreverId(campoagentePublico, agentePublico, itemagentePublico);
 		this.escreverId(campocargo, cargo, itemcargo);
 		this.selecionaComboBox(selecaocargoFuncaoRemunerado, itemcargoFuncaoRemuneradoAlteracao);
		this.selecionaComboBox(selecaofuncaoGorverno, itemfuncaoGovernoAlteracao);
		this.selecionaComboBox(selecaoexercicioAtividade, itemexercicioAtividadeAlteracao);
		this.selecionaComboBox(selecaoformaProvimento, itemformaProvimentoAlteracao);
 	}
 	
	@Quando("preencho os campos unidade lotação {string}, data exercício para alteração")
	public void preencho_os_campos_unidade_lotação_data_exercício_para_alteração(String unidadeLotacao) throws Exception {
	    this.escrever(campounidadeLotacao, unidadeLotacao);
	    this.CampoData(selecaodataLotacao, itemdataGeral);
	    this.CampoData(selecaodataExercicio, itemdataGeral);
	}
	
	@Quando("excluo o historico adicionado anteriormente da tela alteração")
	public void excluoOHistoricoAdicionadoAnteriormenteDaTelaAlteração() throws Exception {
	    waitBase(2);
		this.clicar(botaoexcluirHistorico);
	}

	@Quando("clico no botão adicionar historico e seleciono o combobox situação, aposentadoria e preencho os campos data histórico e data exercício, clico no botão salvar do popup e no botão salvar para alteração")
	public void clicoNoBotãoAdicionarHistoricoESelecionoOComboboxSituaçãoAposentadoriaEPreenchoOsCamposDataHistóricoEDataExercícioClicoNoBotãoSalvarDoPopupENoBotãoSalvarParaAlteração() throws Exception {
	    this.clicar(botaoadicionarHistorico);
	    waitBase(2);
	    this.selecionaComboBox(selecaosituacao, itemsituacaoAlteracao);
	    waitBase(2);
	    this.selecionaComboBox(selecaoaposentadoAlteracao, itemaposentadoAlteracao);
	    waitBase(2);
	    this.clicar(selecaodatahistorico);
	    this.CampoData(selecaodatahistorico, itemdataGeral);
	    waitBase(2);
	    this.CampoData(selecaodataExercicioAlteracao, itemdataGeral);
	    waitBase(3);
	    this.clicar(botaosalvarPopUp);
	    waitBase(2);
	    this.VerificaMensagemPopUp(botaosalvarTela);
	}


	@Então("recebo uma mensagem de alteração da tela lotação {string}")
	public void recebo_uma_mensagem_de_alteração_da_tela_lotação(String mensagem) throws Exception {
		this.VerificaMensagemSucesso(mensagemAlteracao, mensagem);
	}	
	
	
 	/**************** Metódos Alteração Lotação ****************/ 
	
	
	@Dado("que acesso ao menu fase três ao submenu Lotação para alteração")
	public void que_acesso_ao_menu_fase_três_ao_submenu_Lotação_para_alteração() throws Exception {
		waitBase(2);
		this.clicar(acessoaopainel);
		waitBase(2);
		this.clicar(acessoaosubmenu);
	}

	@Quando("preencho o combobox agente público {string}, situação e preencho o campo data lotação para alteração")
	public void preencho_o_combobox_agente_público_situação_e_preencho_o_campo_data_lotação_para_alteração(String filtro) throws Exception {
	    this.escreverId(filtroagentepublico, filtro, itemagentePublico1);
	}

	@Quando("clico no botão buscar, excluir e confirmar da tela lotação para alteração")
	public void clico_no_botão_buscar_excluir_e_confirmar_da_tela_lotação_para_alteração() throws Exception {
	    this.triadeExclusão(botaoBuscar, botaoExcluir, botaoConfirma);
	}

	@Então("recebo uma mensagem de sucesso na exclusão {string} para alteração")
	public void recebo_uma_mensagem_de_sucesso_na_exclusão_para_alteração(String mensagem) throws Exception {
	    this.VerificaMensagemSucesso(mensagemSucessoExclusao, mensagem);
	}
}