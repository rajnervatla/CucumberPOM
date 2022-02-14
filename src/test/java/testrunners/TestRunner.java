package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		
features = { "src/test/resources/featurefiles/AlertHandling.feature" },
glue = { "stepDefinations","AppHooks" }, 
plugin = { "pretty"},
tags="  ~@smoke or ~@sanity or @table",
monochrome = true
//dryRun=true



)
public class TestRunner 
{
}
