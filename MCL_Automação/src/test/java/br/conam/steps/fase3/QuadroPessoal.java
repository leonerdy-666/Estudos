package br.conam.steps.fase3;


import static org.junit.Assert.assertArrayEquals;

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

public class QuadroPessoal extends Base {
	
	private static By acessoaopainel = By.xpath("//li[2]/a/span");
	private static By acessoaosubmenu = By.linkText("Quadro de Pessoal");
	private static By botaonovoquadropessoal = By.linkText("Novo Quadro Pessoal");
	
	
	/**************** LOCATORS INCLUSÃO ****************/
	
	private static By itemcargo = By.id("quadroPessoalDados:quadroPessoalForm:cargo:cargo:j_idt59");
	private static By campocargo = By.id("quadroPessoalDados:quadroPessoalForm:cargo:cargo:cargo_input");
	private static By campoquantidadeTotalVagas = By.id("quadroPessoalDados:quadroPessoalForm:quantidadeTotalVagas:quantidadeTotalVagas_input");
	private static By campoquantidadeVagas = By.id("quadroPessoalDados:quadroPessoalForm:quantidadeVagasProvidas:quantidadeVagasProvidas_input");
	private static By campoquantidadeVagasNaoProvidas = By.id("quadroPessoalDados:quadroPessoalForm:quantidadeVagasNaoProvidas:quantidadeVagasNaoProvidas_input");
	private static By botaosalvar = By.linkText("Salvar");
	private static By mensagemdesucesso = By.xpath("//div[10]/div/div/div[2]/span");
	
	
	/**************** LOCATORS EXCLUSÃO ****************/
	
	private static By itemcargo1 = By.id("filterForm:cargo:cargo:j_idt59");
	private static By filtrocargo1 = By.id("filterForm:cargo:cargo:cargo_input");
	private static By botaobuscar = By.id("filterForm:j_idt63");
	private static By botaoexcluir = By.id("form:consultaTable:0:j_idt107");
	private static By botaoconfirma = By.id("form:j_idt111");
	private static By mensagemsucessoExclusao = By.xpath("//div[10]/div/div/div[2]");
	
	
	/**************** LOCATORS ALTERAÇÃO ****************/
	
	private static By botaoAlteracao = By.xpath("//td[5]/a[2]/i");
	private static By mensagemAlteracao = By.xpath("//div[10]/div/div/div[2]/span");
	
	
	/**************** Metódo inclusão Quadro Pessoal ****************/
	
	/*Inclusão Geral*/
	@Dado("que acesso ao submenu quadro de pessoal")
	public void que_acesso_ao_submenu_quadro_de_pessoal() throws Exception {
	    this.acessoGeral(acessoaosubmenu);
	}
	
	@Dado("que acesso ao menu fasetres e ao submenu quadro de pessoal")
	public void que_acesso_ao_menu_fasetres_e_ao_submenu_quadro_de_pessoal() throws Exception {
		this.chamaCaminho5pDefinindoTipoLocator(acessoaopainel, acessoaosubmenu, null, null, null);
	}

	@Quando("clico no botao novo quadro pessoal e me é aberto a tela de inclusão")
	public void clicoNoBotaoNovoQuadroPessoalEMeÉAbertoATelaDeInclusão() throws Exception {
	    this.clicar(botaonovoquadropessoal);
	}

	@Quando("preencho e seleciono o combobox cargo {string} e preencho os campos quantidade total vagas {string}, quantidade vagas providas {string} e quantidade vagas não providas {string}")
	public void preencho_e_seleciono_o_combobox_cargo_e_preencho_os_campos_quantidade_total_vagas_quantidade_vagas_providas_e_quantidade_vagas_não_providas(String cargo, String quantidadeTotalVagas, String quantidadeVagasProvidas, String quantidadeVagasNaoProvidas) throws Exception {
		this.escreverId(campocargo, cargo, itemcargo);
		this.escrever(campoquantidadeTotalVagas, quantidadeTotalVagas);
		this.escrever(campoquantidadeVagas, quantidadeVagasProvidas);
		this.escrever(campoquantidadeVagasNaoProvidas, quantidadeVagasNaoProvidas);
	}
	
	@Quando("por fim clico no botão salvar para salvar")
	public void por_fim_clico_no_botão_salvar_para_salvar() throws Exception {
	    this.clicar(botaosalvar);
	}

	@Então("recebo uma mensagem aprovando a inclusão do quadro Pessoal {string}")
	public void recebo_uma_mensagem_aprovando_a_inclusão_do_quadro_Pessoal(String mensagem) throws Exception {
		this.VerificaMensagemSucesso(mensagemdesucesso, mensagem);
	}
	
	/**************** Metódo Exclusão Quadro Pessoal ****************/
	
	/*Exclusão Geral*/
	@Dado("que acesso ao submenu quadro pessoal")
	public void que_acesso_ao_submenu_quadro_pessoal() throws Exception {
		this.acessoGeral(acessoaosubmenu);
	}
	
	@Dado("que acesso ao menu fase três e ao submenu quadro pessoal")
	public void que_acesso_ao_menu_fase_três_e_ao_submenu_quadro_pessoal() throws Exception {
		this.chamaCaminho5pDefinindoTipoLocator(acessoaopainel, acessoaosubmenu, null, null, null);
	}

	@Quando("preencho o combobox cargo {string}")
	public void preencho_o_combobox_cargo(String cargo) throws Exception {
	    this.escreverId(filtrocargo1, cargo, itemcargo1);
	}

	@Quando("clico no botao buscar, excluir e confirmar")
	public void clico_no_botao_buscar_excluir_e_confirmar() throws Exception {
	    this.triadeExclusão(botaobuscar, botaoexcluir, botaoconfirma);
	}

	@Então("recebo uma mensagem de exclusão do quadro pessoal {string}")
	public void recebo_uma_mensagem_de_exclusão_do_quadro_pessoal(String mensagem) throws Exception {
		this.VerificaMensagemSucesso(mensagemsucessoExclusao, mensagem);
	}
	
	/**************** Metódo Alteração Quadro Pessoal****************/ 
	
	/*Alteração Geral*/
	@Dado("que acesso ao submenu quadro de pessoal para alteração")
	public void que_acesso_ao_submenu_quadro_de_pessoal_para_alteração() throws Exception {
	    this.acessoGeral(acessoaosubmenu);
	}
	
	@Dado("que acesso ao menu fasetres e ao submenu quadro de pessoal para alteração")
	public void que_acesso_ao_menu_fasetres_e_ao_submenu_quadro_de_pessoal_para_alteração() throws Exception {
	    this.chamaCaminho5pDefinindoTipoLocator(acessoaopainel, acessoaosubmenu, null, null, null);
	}

	@Quando("preencho o filtro cargo {string}, clico no botão buscar e alterar")
	public void preenchoOFiltroCargoClicoNoBotãoBuscarEAlterar(String cargo1) throws Exception {
	    this.escreverId(filtrocargo1, cargo1, itemcargo1);
		this.acessaAlteração(botaobuscar, botaoAlteracao);
	}
	
	@Quando("preencho o combobox cargo {string} e preencho os campos quantidade total vagas {string}, quantidade vagas providas {string} e quantidade vagas não providas {string} para alteração")
	public void preenchoOComboboxCargoEPreenchoOsCamposQuantidadeTotalVagasQuantidadeVagasProvidasEQuantidadeVagasNãoProvidasParaAlteração(String cargo, String quantidadeTotalVagas, String quantidadeVagasProvidas, String quantidadeVagasNaoProvidas) throws Exception {
		this.escreverId(campocargo, cargo, itemcargo);
		this.escrever(campoquantidadeTotalVagas, quantidadeTotalVagas);
	    this.escrever(campoquantidadeVagas, quantidadeVagasProvidas);
	    this.escrever(campoquantidadeVagasNaoProvidas, quantidadeVagasNaoProvidas);
	}

	@Quando("por fim clico no botão salvar para salvar a alteração")
	public void por_fim_clico_no_botão_salvar_para_salvar_a_alteração() throws Exception {
	    this.clicar(botaosalvar);
	}

	@Então("recebo uma mensagem aprovando a alteração do quadro Pessoal {string}")
	public void recebo_uma_mensagem_aprovando_a_alteração_do_quadro_Pessoal(String mensagem) throws Exception {
		this.VerificaMensagemSucesso(mensagemAlteracao, mensagem);
	}
	
	
	/**************** Metódo Exclusão Alteração Quadro Pessoal ****************/
	
	/*Exclusão Alteração*/
	@Dado("que acesso ao submenu quadro pessoal para alteração")
	public void que_acesso_ao_submenu_quadro_pessoal_para_alteração() throws Exception {
	    this.acessoGeral(acessoaosubmenu);
	}
	
	@Dado("que acesso ao menu fase três e ao submenu quadro pessoal para alteração")
	public void que_acesso_ao_menu_fase_três_e_ao_submenu_quadro_pessoal_para_alteração() throws Exception {
	    this.chamaCaminho5pDefinindoTipoLocator(acessoaopainel, acessoaosubmenu, null, null, null);
	}

	@Quando("preencho o combobox cargo {string} para alteração")
	public void preencho_o_combobox_cargo_para_alteração(String cargo) throws Exception {
		this.escreverId(filtrocargo1, cargo, itemcargo1);
	}

	@Quando("clico no botao buscar, excluir e confirmar para alteração")
	public void clico_no_botao_buscar_excluir_e_confirmar_para_alteração() throws Exception {
	    this.triadeExclusão(botaobuscar, botaoexcluir, botaoconfirma);
	}

	@Então("recebo uma mensagem de exclusão do quadro pessoal {string} para alteração")
	public void recebo_uma_mensagem_de_exclusão_do_quadro_pessoal_para_alteração(String mensagem) throws Exception {
		this.VerificaMensagemSucesso(mensagemsucessoExclusao, mensagem);
	}
}