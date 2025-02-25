package waltDisney.org.parksAndTravel.pageAction;

import org.openqa.selenium.support.PageFactory;

import waltDisney.org.parksAndTravel.pageElements.WaltDisneyWorldResortPageLocators;
import waltDisney.org.utilities.SetupDrivers;

public class WaltDisneyWorldResortPageActions {
	WaltDisneyWorldResortPageLocators WaltDisneyWorldResortPageLocatorsObj;
	public WaltDisneyWorldResortPageActions(){
		WaltDisneyWorldResortPageLocatorsObj = new WaltDisneyWorldResortPageLocators();
		PageFactory.initElements(SetupDrivers.driver,WaltDisneyWorldResortPageLocatorsObj );
	}
	
	public void verifyWorldResortPage(){
		WaltDisneyWorldResortPageLocatorsObj.appearWorldResort.isDisplayed();
	}
}
