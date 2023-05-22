package br.conam.core;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
	private static WebDriver driver;
	
	public static WebDriver getDriver() {
		if(driver == null) {
			driver = new ChromeDriver();
			driver.manage().window().setSize(new Dimension(1920, 1080));
		}
		return driver;
	}
	public static void killDriver() {
		if(driver != null) {
			driver.quit();
			driver = null;
		}
	}
}
