package stepDefinations;

import com.pages.AlertHandlingage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AlertHandlingStepDef {

	AlertHandlingage alp = new AlertHandlingage(DriverFactory.getDriver());

	@When("^Alert is  dispayed$")
	public void alert_is_dispayed() throws Throwable {

		alp.clickonAlert();
	}

	@Then("^Handle the popup$")
	public void handle_the_popup() throws Throwable {
		alp.handlePopUp();
		System.out.println("Voila it Handled popup");
	}

	@Then("^Verify the font size and color of the text$")
	public void verify_the_font_size_and_color_of_the_text() throws Throwable {
		alp.getFontcolor();
	}

}
