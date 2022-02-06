package testrunners;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;



@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/featurefiles/LoginPage.feature" }, glue = { "stepDefinations",
		"AppHooks" }, plugin = { "pretty"},monochrome = true



)

public class ParallelExecutionWithTestNG extends AbstractTestNGCucumberTests {
	
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios()
	{
	return super.scenarios();
	}
	

}
