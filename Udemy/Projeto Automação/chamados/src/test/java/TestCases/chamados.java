package TestCases;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import utils.GerenciamentoDriver;

public class chamados {

	private WebDriver driver;
	GerenciamentoDriver geraDriver;

	@Before
	public void setup() {
		geraDriver = new GerenciamentoDriver();
		driver = geraDriver.browser("chrome");

	}

	public void chamados() {
		driver.get("https://abinbevww.service-now.com/navpage.do");

	}

	@After
	public void fim() {
		//driver.quit();
	}

}
