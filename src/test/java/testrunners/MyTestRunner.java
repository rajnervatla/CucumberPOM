package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/parallel/AlertHandling.feature"},
		glue = {"stepDefinations","AppHooks"},
		plugin = {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/"},
		tags=" @smoke or @sanity",
				monochrome = true
				//dryRun=true		
		)

public class MyTestRunner {

}
