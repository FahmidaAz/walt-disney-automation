package waltDisney.org.parksAndTravel.pageAction;

import org.openqa.selenium.support.PageFactory;

import waltDisney.org.parksAndTravel.pageElements.WaltDisneyAulaniPageLocators;
import waltDisney.org.utilities.SetupDrivers;

public class WaltDisneyAulaniPageActions {

	WaltDisneyAulaniPageLocators WaltDisneyAulaniPageLocatorsObj;
	public WaltDisneyAulaniPageActions(){
		WaltDisneyAulaniPageLocatorsObj = new WaltDisneyAulaniPageLocators();
		PageFactory.initElements(SetupDrivers.driver,WaltDisneyAulaniPageLocatorsObj);
	}

	public void verifyDisneyAulaniPage(){
		WaltDisneyAulaniPageLocatorsObj.aulaniPage.isDisplayed();
	}
}
