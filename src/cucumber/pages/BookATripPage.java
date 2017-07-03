package cucumber.pages;

import org.openqa.selenium.WebElement;

import cucumber.helper.Helper;

public class BookATripPage extends Helper {
	WebElement logo;
	WebElement book_a_trip;
	WebElement oneWayTrip;
	WebElement originCity;
	WebElement destinationCity;
	WebElement departureDate;
	WebElement find_flight;
	
	public void navigateToDeltaHomepage() throws Exception{
		launchUrl("https://www.delta.com/");	
	}
	
	public void logoIsDisplayed() throws Exception{
		logo = getElementByCssSelector("#brand > a.delta");
		VerifyAnElementIsDisplayed(logo);
	}
	public void clickBookATrip()throws Exception{
		book_a_trip = getElementById("navBookTrip");
		clickAnElement(book_a_trip);
	}
	public void clickOneWayTrip()throws Exception{
		oneWayTrip = getElementById("oneWayBtn");
		clickAnElement(oneWayTrip);
	}
	public void inputTravellingFromAandTo(String from, String to)throws Exception{
		originCity = getElementById("originCity");
		destinationCity = getElementById("destinationCity");
		typeGivenValueInto(originCity, from);
		typeGivenValueInto(destinationCity, to);
	}
	public void inputDepartureDate(String depDate)throws Exception{
		departureDate = getElementById("departureDate");
		typeGivenValueInto(departureDate, depDate);
	}
	public PriceOptionPage findFlight()throws Exception{
		find_flight = getElementById("findFlightsSubmit");
		clickAnElement(find_flight);
		return new PriceOptionPage();
	}
}
