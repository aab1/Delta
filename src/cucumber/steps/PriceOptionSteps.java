package cucumber.steps;

import cucumber.api.java.en.When;
import cucumber.pages.PriceOptionPage;

public class PriceOptionSteps {
	PriceOptionPage pricePage = new PriceOptionPage();
	
	@When("^I click on a price$")
	public void i_click_on_a_price() throws Throwable {
		pricePage.clickAPrice();
	}
	
}
