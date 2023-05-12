package br.conam.core;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Sleeper;

public class Inicializacao extends Base {
	
	private static String senha =  "conam";
	private static String login = "conam";
	private static String endereco = "http://automacao.mitc.conam.com.br:86/mitc/pages/ajuste_licitacao/ajuste_licitacao_editar.xhtml?windowId=8ee";
	
	
	public Inicializacao() throws Exception {
		this.login();
	}

	protected void login() throws Exception {
		this.acessarEndereco(endereco);
		waitBase(2);
		this.escrever(By.id("loginForm:j_username"),login);
		this.escrever(By.id("loginForm:j_password"), senha);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Entrar")));
		this.clicar(By.linkText("Entrar"));
	}
}