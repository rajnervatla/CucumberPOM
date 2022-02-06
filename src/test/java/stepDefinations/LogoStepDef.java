package stepDefinations;

import com.pages.Homepage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoStepDef {

	Homepage hp = new Homepage(DriverFactory.getDriver());

	@Given("^user is on Home page$")
	public void user_is_on_Home_page() throws Throwable {
		//DriverFactory.getDriver().get("https://www.google.co.in");
	}

	@When("^user verifies the logo$")
	public void user_verifies_the_logo() throws Throwable {
		hp.logotest();

	}

	@Then("^Pass the test case$")
	public void pass_the_test_case() throws Throwable {
		hp.passt();
	}

}
