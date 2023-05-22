package br.conam.core;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Sleeper;

public class Inicializacao extends Base {
	
	private static String senha =  "conam";
	private static String login = "conam";
	private static String endereco = "https://www.google.com/search?q=google&oq=google&aqs=chrome.0.0i131i355i433i512j46i131i199i433i465i512j69i65j69i60l2j69i65l2j69i60.1231j0j7&sourceid=chrome&ie=UTF-8";
	
	
	public Inicializacao() throws Exception {
		this.login();
	}

	protected void login() throws Exception {
		this.acessarEndereco(endereco);
		waitBase(2);
//		this.escrever(By.id("loginForm:j_username"),login);
//		this.escrever(By.id("loginForm:j_password"), senha);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Entrar")));
		this.clicar(By.linkText("Entrar"));
	}
}