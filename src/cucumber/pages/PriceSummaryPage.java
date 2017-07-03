package cucumber.pages;

import org.openqa.selenium.WebElement;

import cucumber.helper.Helper;

public class PriceSummaryPage extends Helper{
	WebElement continueBtn;
	
	public  void clickContinue()throws Exception{
		continueBtn = getElementById("tripSummarySubmitBtn");
		clickAnElement(continueBtn);
		 
	}
}
