package br.conam.steps.fase3;

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


public class FuncaoStep extends Base{
	
	/**************** LOCATORS INCLUSÃO FUNÇÃO ****************/
	
	private static By acessoaopainel = By.xpath("//li[2]/a/span");
	private static By acessoaosubmenu = By.linkText("Função");
	private static By botaonovafuncao = By.linkText("Nova Função");
	private static By campocodigo = By.id("funcaoDados:funcaoForm:codigo");
	private static By camponome = By.id("funcaoDados:funcaoForm:nome");
	private static By campototalHoras = By.id("funcaoDados:funcaoForm:totalHoras:totalHoras_input");
	private static By selecaotipo = By.id("funcaoDados:funcaoForm:tipo_label");
	private static By itemtipo = By.id("funcaoDados:funcaoForm:tipo_1");
	private static By selecaoregimeJuridico = By.id("funcaoDados:funcaoForm:regimeJuridico_label");
	private static By itemregimeJuridico = By.id("funcaoDados:funcaoForm:regimeJuridico_1");
	private static By selecaoescolaridade = By.id("funcaoDados:funcaoForm:escolaridade_label");
	private static By itemescolaridade = By.id("funcaoDados:funcaoForm:escolaridade_1");
	private static By selecaoexercicioAtividade = By.id("funcaoDados:funcaoForm:exercicioAtividade_label");
	private static By itemexercicioAtividade = By.id("funcaoDados:funcaoForm:exercicioAtividade_1");
	private static By selecaoformaProvimento = By.id("funcaoDados:funcaoForm:formaProvimento_label");
	private static By itemformaProvimento = By.id("funcaoDados:funcaoForm:formaProvimento_1");
	private static By mensagemSucesso = By.xpath("//div[10]/div/div/div[2]");
	
	/**************** LOCATORS EXCLUSÃO FUNÇÃO ****************/
	
	private static By filtronome = By.id("filterForm:nome");
	private static By botaobuscar = By.id("filterForm:j_idt55");
	private static By botaoexcluir = By.id("form:consultaTable:0:j_idt83");
	private static By botaoconfirma = By.id("form:j_idt87");
	private static By botaosalvar = By.linkText("Salvar");
	private static By mensagemdesucessoExclusao = By.xpath("//div[10]/div/div/div[2]");
	
	/**************** LOCATORS ALTERAÇÃO FUNÇÃO ****************/
	
	private static By botaoalteracao = By.xpath("//td[3]/a[2]/i");
	private static By itemtipoAlteracao = By.id("funcaoDados:funcaoForm:tipo_2");
	private static By itemregimejuridicoAlteracao = By.id("funcaoDados:funcaoForm:regimeJuridico_2");
	private static By itemescolaridadeAlteracao = By.id("funcaoDados:funcaoForm:escolaridade_2");
	private static By itemexercicioAtividadeAlteracao = By.id("funcaoDados:funcaoForm:exercicioAtividade_2");
	private static By itemformaProvimentoAlteracao = By.id("funcaoDados:funcaoForm:formaProvimento_2");
	private static By mensagemAlteracao = By.xpath("//div[10]/div/div/div[2]");
	
	
	/**************** Metódos Inclusão Função ****************/
	
	/*Inclusão Geral*/
	@Dado("que acesso ao submenu função")
	public void queAcessoAoSubmenuFunção() throws Exception {
		this.acessoGeral(acessoaosubmenu);
	}
	
	@Dado("que acesso ao menu fasetres e ao submenu função")
	public void que_acesso_ao_menu_fasetres_e_ao_submenu_função() throws Exception {
		this.chamaCaminho5pDefinindoTipoLocator(acessoaopainel, acessoaosubmenu, null, null, null);
	}
	
	@Dado("clico no botao nova funcao")
	public void clico_no_botao_nova_funcao() throws Exception {
	    this.clicar(botaonovafuncao);
	}

	@Dado("preencho os campos codigo {string}, nome {string} e total horas {string}")
	public void preencho_os_campos_codigo_nome_e_total_horas(String codigo, String nome, String totalHoras) throws Exception {
	    this.escrever(campocodigo, codigo);
	    this.escrever(camponome, nome);
	    waitBase(2);
	    this.escrever(campototalHoras, totalHoras);
	}

	@Dado("seleciono os itens dos comboboxes tipo, regimejuridico, escolaridade, exercicio atividade e forma provimento")
	public void seleciono_os_itens_dos_comboboxes_tipo_regimejuridico_escolaridade_exercicio_atividade_e_forma_provimento() throws Exception {
	    this.selecionaComboBox(selecaotipo, itemtipo);
	    this.selecionaComboBox(selecaoregimeJuridico, itemregimeJuridico);
	    this.selecionaComboBox(selecaoescolaridade, itemescolaridade);
	    this.selecionaComboBox(selecaoexercicioAtividade, itemexercicioAtividade);
	    this.selecionaComboBox(selecaoformaProvimento, itemformaProvimento);
	}

	@Quando("por fim clico no botao salvar")
	public void por_fim_clico_no_botao_salvar() throws Exception {
	    this.clicar(botaosalvar);
	}

	@Então("me é apresentado uma mensagem de inclusão de função {string}")
	public void me_é_apresentado_uma_mensagem_de_inclusão_de_função(String mensagem) throws Exception {
		this.VerificaMensagemSucesso(mensagemSucesso, mensagem);
	}
	
	/*************** Metódos Exclusão Função ***************/
	
	/*Exclusão Geral*/
	@Dado("que acesso ao submenu função para exclusão")
	public void que_acesso_ao_submenu_função_para_exclusão() throws Exception {
		this.acessoGeral(acessoaosubmenu);
	}
	
	@Dado("que acesso ao menu fasetres e ao submenu função para exclusão")
	public void que_acesso_ao_menu_fasetres_e_ao_submenu_função_para_exclusão() throws Exception {
	    this.chamaCaminho5pDefinindoTipoLocator(acessoaopainel, acessoaosubmenu, null, null, null);
	}
	
	@Quando("preencho o campo nome {string}")
	public void preenchoOCampoNome(String nome) throws Exception {
	    this.escrever(filtronome, nome);
	}

	@Quando("clico no botão buscar, excluir e confirmo a exclusão")
	public void clico_no_botão_buscar_excluir_e_confirmo_a_exclusão() throws Exception {
	    this.triadeExclusão(botaobuscar, botaoexcluir, botaoconfirma);
	}

	@Então("recebo uma mensagem de exclusão de função {string}")
	public void recebo_uma_mensagem_de_exclusão_de_função(String mensagem) throws Exception {
		this.VerificaMensagemSucesso(mensagemdesucessoExclusao, mensagem);
	}
	
	
	/**************** Metódo Alteração Função ****************/ 
	
	/*Alteração Geral*/
	@Dado("que acesso ao submenu função para alteração")
	public void que_acesso_ao_submenu_função_para_alteração() throws Exception {
	    this.acessoGeral(acessoaosubmenu);
	}
	
	@Dado("que acesso ao menu fasetres e ao submenu função para alteração")
	public void que_acesso_ao_menu_fasetres_e_ao_submenu_função_para_alteração() throws Exception {
	    this.chamaCaminho5pDefinindoTipoLocator(acessoaopainel, acessoaosubmenu, null, null, null);
	}
	
	@Quando("preencho o filtro nome {string} e clico em buscar e clico no botão alteração")
	public void preencho_o_filtro_nome_e_clico_em_buscar_e_clico_no_botão_alteração(String nome) throws Exception {
	    this.escrever(filtronome, nome);
	    this.acessaAlteração(botaobuscar, botaoalteracao); 
	}

	@Quando("preencho os campos codigo {string}, nome {string} e total horas {string} para alteração")
	public void preencho_os_campos_codigo_nome_e_total_horas_para_alteração(String codigo, String nome2, String totalHoras) throws Exception {
	    this.escrever(campocodigo, codigo);
	    this.escrever(camponome, nome2);
	    this.escrever(campototalHoras, totalHoras);
	}

	@Quando("seleciono os itens dos comboboxes tipo, regimejuridico, escolaridade, exercicio atividade e forma provimento para alteração")
	public void seleciono_os_itens_dos_comboboxes_tipo_regimejuridico_escolaridade_exercicio_atividade_e_forma_provimento_para_alteração() throws Exception {
	    this.selecionaComboBox(selecaotipo, itemtipoAlteracao);
	    this.selecionaComboBox(selecaoregimeJuridico, itemregimejuridicoAlteracao);
	    this.selecionaComboBox(selecaoescolaridade, itemescolaridadeAlteracao);
	    this.selecionaComboBox(selecaoexercicioAtividade, itemexercicioAtividadeAlteracao);
	    this.selecionaComboBox(selecaoformaProvimento, itemformaProvimentoAlteracao);
	}
	
	@Quando("por fim clico no botao salvar da tela alteração")
	public void por_fim_clico_no_botao_salvar_da_tela_alteração() throws Exception {
	    this.clicar(botaosalvar);
	}
	
	@Então("me é apresentado uma mensagem de inclusão de função {string} da tela alteração")
	public void me_é_apresentado_uma_mensagem_de_inclusão_de_função_da_tela_alteração(String mensagem) throws Exception {
		this.VerificaMensagemSucesso(mensagemAlteracao, mensagem);
	}
	
	
	/**************** Metódo Alteração Função ****************/ 
	
	/*Exclusão Alteração*/
	@Dado("que acesso ao submenu função para exclusão para alteração")
	public void que_acesso_ao_submenu_função_para_exclusão_para_alteração() throws Exception {
	    this.acessoGeral(acessoaosubmenu);
	}
	
	@Dado("que acesso ao menu fasetres e ao submenu função para exclusão para alteração")
	public void que_acesso_ao_menu_fasetres_e_ao_submenu_função_para_exclusão_para_alteração() throws Exception {
	    this.chamaCaminho5pDefinindoTipoLocator(acessoaopainel, acessoaosubmenu, null, null, null);
	}

	@Quando("preencho o campo nome {string} para alteração")
	public void preencho_o_campo_nome_para_alteração(String nome) throws Exception {
	    this.escrever(filtronome, nome);
	}

	@Quando("clico no botão buscar, excluir e confirmo a exclusão para alteração")
	public void clico_no_botão_buscar_excluir_e_confirmo_a_exclusão_para_alteração() throws Exception {
	    this.triadeExclusão(botaobuscar, botaoexcluir, botaoconfirma);
	}

	@Então("recebo uma mensagem de exclusão de função {string} para alteração")
	public void recebo_uma_mensagem_de_exclusão_de_função_para_alteração(String mensagem) throws Exception {
	    this.VerificaMensagemSucesso(mensagemdesucessoExclusao, mensagem);
	}
}