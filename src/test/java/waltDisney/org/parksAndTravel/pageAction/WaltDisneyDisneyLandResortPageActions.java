package waltDisney.org.parksAndTravel.pageAction;

import org.openqa.selenium.support.PageFactory;

import waltDisney.org.parksAndTravel.pageElements.WaltDisneyDisneyLandResortPageLocators;
import waltDisney.org.utilities.SetupDrivers;

public class WaltDisneyDisneyLandResortPageActions {
	WaltDisneyDisneyLandResortPageLocators WaltDisneyDisneyLandResortPageLocatorsObj;
	
	public WaltDisneyDisneyLandResortPageActions(){
		WaltDisneyDisneyLandResortPageLocatorsObj = new WaltDisneyDisneyLandResortPageLocators();
		PageFactory.initElements(SetupDrivers.driver, WaltDisneyDisneyLandResortPageLocatorsObj);
	}
	  public void verifyDisneyLandResortPage(){
		  WaltDisneyDisneyLandResortPageLocatorsObj.verifyDisneyLandResortPage.isDisplayed();
	  }
}
