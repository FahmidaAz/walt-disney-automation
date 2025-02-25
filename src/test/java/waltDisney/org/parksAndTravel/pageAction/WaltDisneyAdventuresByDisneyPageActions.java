package waltDisney.org.parksAndTravel.pageAction;

import org.openqa.selenium.support.PageFactory;

import waltDisney.org.parksAndTravel.pageElements.WaltDisneyAdventuresByDisneyPageLocators;
import waltDisney.org.utilities.SetupDrivers;

public class WaltDisneyAdventuresByDisneyPageActions {
	WaltDisneyAdventuresByDisneyPageLocators WaltDisneyAdventuresByDisneyPageLocatorsObj;
	
	public WaltDisneyAdventuresByDisneyPageActions (){
		WaltDisneyAdventuresByDisneyPageLocatorsObj = new WaltDisneyAdventuresByDisneyPageLocators();
		PageFactory.initElements(SetupDrivers.driver, WaltDisneyAdventuresByDisneyPageLocatorsObj);
	}
	
	public void verifyAdventureLogo(){
		WaltDisneyAdventuresByDisneyPageLocatorsObj.adventureLogo.isDisplayed();
	}
}
