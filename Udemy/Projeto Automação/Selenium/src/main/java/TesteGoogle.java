import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteGoogle {

	@Test
	public void teste() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\lmendefl\\Downloads\\Programas\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("htt://www.google.com.br");
		// acerto
		Assert.assertEquals("google", driver.getTitle());
		//Erro
		Assert.assertEquals("yahoo", driver.getTitle());
	}

}
