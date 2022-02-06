package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		
features = { "src/test/resources/featurefiles/LoginPage.feature" },
glue = { "stepDefinations","AppHooks" }, 
plugin = { "pretty"},
tags="",
monochrome = true



)
public class TestRunner extends AbstractTestNGCucumberTests
{
}
