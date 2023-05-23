package br.ce.leonardo.runners;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;




@RunWith(Cucumber.class)
@CucumberOptions(
				features = "src/test/resources/features/AprenderCucumber.feature",
				glue = "br.ce.leonardo.steps",
				plugin = "pretty",
				tags = "@esse",
				monochrome = true,
				snippets = SnippetType.CAMELCASE,
				dryRun = false
				)		
public class Runner {

}
	