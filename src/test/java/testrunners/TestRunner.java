package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/featurefiles/LoginPage.feature" }, glue = { "stepDefinations",
		"AppHooks" }, plugin = { "pretty"},monochrome = true



)
public class TestRunner {

}
