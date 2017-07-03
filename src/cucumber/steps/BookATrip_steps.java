package cucumber.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.pages.BookATripPage;

public class BookATrip_steps {
	
	BookATripPage bookTrip = new BookATripPage();
	
	@Given("^I navigate to Delta website$")
	public void i_navigate_to_Delta_website() throws Throwable {
		bookTrip.navigateToDeltaHomepage();
	}

	@Given("^Delta homepage is displayed$")
	public void delta_homepage_is_displayed() throws Throwable {
	    bookTrip.logoIsDisplayed();
	}

//	@When("^I click book a trip$")
//	public void i_click_book_a_trip() throws Throwable {
//	   bookTrip.clickBookATrip();
//	}

	@When("^I click one way trip$")
	public void i_click_one_way_trip() throws Throwable {
		bookTrip.clickOneWayTrip();
	}

	@When("^I input travelling From \"([^\"]*)\" and To \"([^\"]*)\"$")
	public void i_input_travelling_From_and_To(String from, String to) throws Throwable {
		bookTrip.inputTravellingFromAandTo(from, to);
	}

	@When("^I input departure date\"([^\"]*)\"$")
	public void i_input_departure_date(String depDate) throws Throwable {
		bookTrip.inputDepartureDate(depDate);
	}

	@When("^I click find flight$")
	public void i_click_find_flight() throws Throwable {
		bookTrip.findFlight();
	}


}
