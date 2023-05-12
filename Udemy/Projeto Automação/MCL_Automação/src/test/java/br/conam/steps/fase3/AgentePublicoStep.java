package br.conam.steps.fase3;

import static org.junit.Assert.assertEquals;

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


public class AgentePublicoStep extends Base{
	
	/**************** LOCATORS INCLUSÃO AGENTE PÚBLICO ****************/
	
	private static By acessoaopainel = By.xpath("//li[2]/a/span");
	private static By acessoaosubmenu = By.linkText("Agente Público");
	private static By botaoNovoAgentePublico = By.linkText("Novo Agente Público");
	private static By camponome = By.id("agentePublicoDados:agentePublicoForm:nome");
	private static By selecaotipoDocumento = By.id("agentePublicoDados:agentePublicoForm:cpfTipo_label");
	private static By itemtipoDocumento = By.id("agentePublicoDados:agentePublicoForm:cpfTipo_1");
	private static By campoCPF = By.id("agentePublicoDados:agentePublicoForm:cpfNumero");
	private static By campocpfname = By.name("agentePublicoDados:agentePublicoForm:cpfNumero");
	private static By campopisPasep = By.id("agentePublicoDados:agentePublicoForm:pisPasep:pisPasep_input");
	private static By campodataNascimento = By.id("agentePublicoDados:agentePublicoForm:dataNascimento_input");
	private static By itemdata = By.linkText("12");
	private static By selecaosexo = By.id("agentePublicoDados:agentePublicoForm:sexo_label");
	private static By itemSexo = By.id("agentePublicoDados:agentePublicoForm:sexo_1");
	private static By selecaoNacionalidade = By.id("agentePublicoDados:agentePublicoForm:nacionalidade_label");
	private static By itemNacionalidade = By.id("agentePublicoDados:agentePublicoForm:nacionalidade_1");
	private static By selecaoescolaridade = By.id("agentePublicoDados:agentePublicoForm:escolaridade_label");
	private static By itemEscolaridade = By.id("agentePublicoDados:agentePublicoForm:escolaridade_5");
	private static By campoespecialidade = By.id("agentePublicoDados:agentePublicoForm:especialidade");
	private static By botaosalvar = By.linkText("Salvar");
	private static By mensagemSucesso = By.xpath("//div[10]/div/div");
	
	/**************** LOCATORS EXCLUSÃO AGENTE PÚBLICO ****************/
	
	private static By filtronome = By.id("filterForm:nome");
	private static By botaobuscar = By.id("filterForm:j_idt55");
	private static By botaoexcluir = By.id("form:consultaTable:0:j_idt85");
	private static By botaoconfirma = By.id("form:j_idt89");
	private static By mensagemSucessoExclusão = By.xpath("//div[10]/div/div/div[2]");
	
	/**************** LOCATORS ALTERAÇÃO AGENTE PÚBLICO ****************/ 
	
	private static By botaoAlteracao = By.xpath("//td[4]/a[2]");
	private static By itemtipoDocumentoAlteracao = By.id("agentePublicoDados:agentePublicoForm:cpfTipo_0");
	private static By itemsexoAlteracao = By.id("agentePublicoDados:agentePublicoForm:sexo_2");
	private static By itemnacionalidadeAlteracao = By.id("agentePublicoDados:agentePublicoForm:nacionalidade_2");
	private static By itemescolaridadeAlteracao = By.id("agentePublicoDados:agentePublicoForm:escolaridade_1");
	private static By itemdataGeralAlteracao = By.linkText("");
	private static By mensagemalteracao = By.xpath("//div[10]/div/div/div[2]/span");
	
	
	/**************** Metódos Inclusão Agente Público ****************/
	
	/*Inclusão Geral*/
	@Dado("que acesso e ao submenu Agente Público")
	public void que_acesso_e_ao_submenu_Agente_Público() throws Exception {
		this.acessoGeral(acessoaosubmenu);
	}
	
	@Dado("que acesso ao menu fasetres e ao submenu Agente Público")
	public void queAcessoAoMenuFasetresEAoSubmenuAgentePúblico() throws Exception {
		this.chamaCaminho5pDefinindoTipoLocator(acessoaopainel, acessoaosubmenu, null, null, null);
	}
	
	
	@Quando("clico no botao novo agente público")
	public void clico_no_botao_novo_agente_público() throws Exception {
		waitBase(2);
		this.clicar(botaoNovoAgentePublico);
	}

	@Quando("preencho o campo nome {string} e seleciono o campo tipo documento {string}")
	public void preencho_o_campo_nome_e_seleciono_o_campo_tipo_documento(String nome, String string2) throws Exception {
	    this.escrever(camponome, nome);
	    this.selecionaComboBox(selecaotipoDocumento, itemtipoDocumento);
	}

	@Quando("preencho o campo CPF {string}, pispasep {string} e data nascimento")
	public void preencho_o_campo_CPF_pispasep_e_data_nascimento(String CPF, String pisPasep) throws Exception {
	    waitBase(2);
		this.escrever(campoCPF, CPF);
	    this.escrever(campopisPasep, pisPasep);
	    this.CampoData(campodataNascimento, itemdata);
	    waitBase(2);
	}
	
	@Quando("seleciono os comboboxes sexo, nacionalidade e escolaridade e preencho o campo especialidade {string}")
	public void seleciono_os_comboboxes_sexo_nacionalidade_e_escolaridade_e_preencho_o_campo_especialidade(String especialidade) throws Exception {
	    this.selecionaComboBox(selecaosexo, itemSexo);
	    this.selecionaComboBox(selecaoNacionalidade, itemNacionalidade);
	    this.selecionaComboBox(selecaoescolaridade, itemEscolaridade);
	    this.escrever(campoespecialidade, especialidade);
	}
	
	@Quando("por fim clico no botão salvar")
	public void porFimClicoNoBotãoSalvar() throws Exception {
	    this.clicar(botaosalvar);
	}

	@Então("recebo uma mensagem de inclusão de agente público {string}")
	public void recebo_uma_mensagem_de_inclusão_de_agente_público(String mensagem) throws Exception {
		this.VerificaMensagemSucesso(mensagemSucesso, mensagem);
	}
	
	
	/**************** Metódos Exclusão Agente Público ****************/
	
	/*Exclusão Geral*/
	@Dado("que acesso ao submenu agente publico")
	public void que_acesso_ao_submenu_agente_publico() throws Exception {
	    this.acessoGeral(acessoaosubmenu);
	}

	@Dado("que acesso ao menu fase três e ao submenu agente publico")
	public void que_acesso_ao_menu_fase_três_e_ao_submenu_agente_publico() throws Exception {
	    this.chamaCaminho5pDefinindoTipoLocator(acessoaopainel, acessoaosubmenu, null, null, null);
	}
	
	
	@Quando("preencho o filtro nome {string}")
	public void preencho_o_filtro_nome(String nome) throws Exception {
	    this.escrever(filtronome, nome);
	}

	@Quando("clico no botão buscar, excluir e confirmar para exclusão do agente público")
	public void clico_no_botão_buscar_excluir_e_confirmar_para_exclusão_do_agente_público() throws Exception {
	    this.triadeExclusão(botaobuscar, botaoexcluir, botaoconfirma);
	}
	
	@Então("recebo mensagem de sucesso {string} da exclusão")
	public void recebo_mensagem_de_sucesso_da_exclusão(String mensagem) throws Exception {
		this.VerificaMensagemSucesso(mensagemSucessoExclusão, mensagem);
	}
	
	
	/**************** Metodo de Alteração ****************/
	
	/*Alteração Geral*/
	@Dado("que acesso ao submenu Agente Público para alteracao")
	public void que_acesso_ao_submenu_Agente_Público_para_alteracao()throws Exception {
	    this.acessoGeral(acessoaosubmenu);
	}
	
	@Dado("que acesso ao menu fasetres e ao submenu Agente Público para alteracao")
	public void que_acesso_ao_menu_fasetres_e_ao_submenu_Agente_Público_para_alteracao() throws Exception {
	    this.chamaCaminho5pDefinindoTipoLocator(acessoaopainel, acessoaosubmenu, null, null, null);
	}

	@Quando("preencho o filtro nome {string} clico no botão buscar e alterar da tela de alteração")
	public void preencho_o_filtro_nome_clico_no_botão_buscar_e_alterar_da_tela_de_alteração(String nome) throws Exception {
	    this.escrever(filtronome, nome);
	    waitBase(2);
	    this.acessaAlteração(botaobuscar, botaoAlteracao);
	}
	
	@Quando("preencho o campo nome {string} e seleciono o combobox tipo documento para alteração")
	public void preencho_o_campo_nome_e_seleciono_o_combobox_tipo_documento_para_alteração(String nome2) throws Exception {
	    this.escrever(camponome, nome2);
	    this.selecionaComboBox(selecaotipoDocumento, itemtipoDocumentoAlteracao);
	}

	@Quando("preencho o campo CPF {string}, pispasep {string} e data nascimento para alteração")
	public void preencho_o_campo_CPF_pispasep_e_data_nascimento_para_alteração(String CNPJ, String pisPasep) throws Exception {
		waitBase(2);
		this.clicar(campoCPF);
		waitBase(1);
		this.escrever(campocpfname, CNPJ);
	    this.escrever(campopisPasep, pisPasep);
	    this.CampoData(campodataNascimento, itemdataGeralAlteracao);
	}

	@Quando("seleciono os comboboxes sexo, nacionalidade e escolaridade e preencho o campo especialidade {string} para alteração")
	public void seleciono_os_comboboxes_sexo_nacionalidade_e_escolaridade_e_preencho_o_campo_especialidade_para_alteração(String especialidade) throws Exception {
		this.selecionaComboBox(selecaosexo, itemsexoAlteracao);
		this.selecionaComboBox(selecaoNacionalidade, itemnacionalidadeAlteracao);
		this.selecionaComboBox(selecaoescolaridade, itemescolaridadeAlteracao);
		this.escrever(campoespecialidade, especialidade);
	}

	@Quando("por fim clico no botão salvar da tela alteração")
	public void por_fim_clico_no_botão_salvar_da_tela_alteração() throws Exception {
	    this.clicar(botaosalvar);
	}

	@Então("recebo uma mensagem de alteração de agente público {string}")
	public void recebo_uma_mensagem_de_alteração_de_agente_público(String mensagem) throws Exception {
		this.VerificaMensagemSucesso(mensagemalteracao, mensagem);
	}
	
	
	/**************** Metodo de Alteração ****************/
	
	/*Exclusão Alteração*/
	@Dado("que acesso ao submenu agente publico para alteração")
	public void que_acesso_ao_submenu_agente_publico_para_alteração() throws Exception {
	    this.acessoGeral(acessoaosubmenu);
	}
	
	@Dado("que acesso ao menu fase três e ao submenu agente publico para alteração")
	public void que_acesso_ao_menu_fase_três_e_ao_submenu_agente_publico_para_alteração() throws Exception {
	    this.chamaCaminho5pDefinindoTipoLocator(acessoaopainel, acessoaosubmenu, null, null, null);
	}

	@Quando("preencho o filtro nome {string} para alteração")
	public void preencho_o_filtro_nome_para_alteração(String nome) throws Exception {
	    this.escrever(filtronome, nome);
	}

	@Quando("clico no botão buscar, excluir e confirmar para exclusão do agente público para alteração")
	public void clico_no_botão_buscar_excluir_e_confirmar_para_exclusão_do_agente_público_para_alteração() throws Exception {
	    this.triadeExclusão(botaobuscar, botaoexcluir, botaoconfirma);
	}

	@Então("recebo mensagem de sucesso {string} da exclusão para alteração")
	public void recebo_mensagem_de_sucesso_da_exclusão_para_alteração(String mensagem) throws Exception {
	    this.VerificaMensagemSucesso(mensagemSucessoExclusão, mensagem);
	}
}