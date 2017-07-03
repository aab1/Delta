package cucumber.pages;

import org.openqa.selenium.WebElement;

import cucumber.helper.Helper;

public class PriceOptionPage extends Helper{
	WebElement price;
	
	
	public PriceSummaryPage clickAPrice()throws Exception{
		price = getElementById("0_0_0");
		scrollToAnElement(price);
		clickAnElement(price);
		return new PriceSummaryPage();
	}

}
