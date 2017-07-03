package cucumber.steps;

import cucumber.api.java.en.When;
import cucumber.pages.PriceSummaryPage;

public class PriceSummaryPageSteps {
	PriceSummaryPage priceSummaryPage = new PriceSummaryPage();
	
	@When("^I click continue button to proceed to passengers details page$")
	public void i_click_continue_button_to_proceed_to_passengers_details_page() throws Throwable {
		priceSummaryPage.clickContinue();
	}
}
