package waltDisney.org.parksAndTravel.pageAction;

import org.openqa.selenium.support.PageFactory;

import waltDisney.org.parksAndTravel.pageElements.WaltDisneyDisneyVacationClubPageLocators;
import waltDisney.org.utilities.SetupDrivers;

public class WaltDisneyDisneyVacationClubPageActions {
	WaltDisneyDisneyVacationClubPageLocators WaltDisneyDisneyVacationClubPageLocatorsObj;
	public WaltDisneyDisneyVacationClubPageActions (){
		WaltDisneyDisneyVacationClubPageLocatorsObj = new WaltDisneyDisneyVacationClubPageLocators();
		PageFactory.initElements(SetupDrivers.driver, WaltDisneyDisneyVacationClubPageLocatorsObj);
	}
	
	public void verifyLogo(){
		WaltDisneyDisneyVacationClubPageLocatorsObj.vacationClubLogo.isDisplayed();
	}
}
  