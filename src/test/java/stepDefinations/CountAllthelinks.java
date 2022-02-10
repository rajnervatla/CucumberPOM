package stepDefinations;

import com.pages.AvailableLinksPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CountAllthelinks {
	
	AvailableLinksPage alp=new AvailableLinksPage(DriverFactory.getDriver());
	
	@Given("^User is on Home page$")
	public void user_is_on_Home_page() throws Throwable {
	  System.out.println("Number of links ...");
	}

	@Then("^Count all the links on the application$")
	public void count_all_the_links_on_the_application() throws Throwable {
		
		alp.numberoflinks();
	  
	}

}
