package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:feature", // C:\\New Eclipse Projects\\com.myproject\\src\\test\\resources\\feature",
		glue = "step.definition", //"src\\test\\java\\step.definition",
		tags = "@MacBookPrice",  // we can put here stepDefinition file path here or its name. 
		dryRun = false, // when we test we must type false here. 
		strict = true,
		monochrome = true,
				// this plugin is used to create report for us.
		plugin = {"pretty","html:target/site/cucumber-pretty",
				"json:target/cucumber.json"
		},
		publish = true
			
		)



public class TestRunner {

}
