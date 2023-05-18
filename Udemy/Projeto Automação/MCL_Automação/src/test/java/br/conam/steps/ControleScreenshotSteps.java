package br.conam.steps;

import java.io.IOException;

import br.conam.core.Base;
import br.conam.core.ConfigScreenshot;
import br.conam.core.DriverFactory;
import cucumber.api.Scenario;
import cucumber.api.java.AfterStep;

public class ControleScreenshotSteps {
	@AfterStep
	public static void configValidaStep(Scenario cenario) throws IOException {
		Base.waitBase(1);
		if(cenario.isFailed()){
			cenario.write("Evidência");
			cenario.embed(ConfigScreenshot.takeScreenShotAsByte(DriverFactory.getDriver()), "image/png");
		}
	}
}
