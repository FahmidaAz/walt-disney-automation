package waltDisney.org.parksAndTravel.pageAction;

import org.openqa.selenium.support.PageFactory;

import waltDisney.org.parksAndTravel.pageElements.WaltDisneyDisneyCruiseLinePageLocators;
import waltDisney.org.utilities.SetupDrivers;

public class WaltDisneyDisneyCruiseLinePageActions {
	WaltDisneyDisneyCruiseLinePageLocators  WaltDisneyDisneyCruiseLinePageLocatorsObj;
	
	public WaltDisneyDisneyCruiseLinePageActions(){
		WaltDisneyDisneyCruiseLinePageLocatorsObj = new WaltDisneyDisneyCruiseLinePageLocators();
		PageFactory.initElements(SetupDrivers.driver, WaltDisneyDisneyCruiseLinePageLocatorsObj);
	}
	
	  public void verifyCruiseLinePage(){
		  WaltDisneyDisneyCruiseLinePageLocatorsObj.verifyCruiseLine.isDisplayed();
	  }
	
	
}
