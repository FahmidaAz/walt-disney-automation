package waltDisney.org.parksAndTravel.pageAction;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import waltDisney.org.parksAndTravel.pageElements.WaltDisneyHomepagePageLocators;
import waltDisney.org.utilities.SetupDrivers;

public class WaltDisneyHomepagePageActions {
	WaltDisneyHomepagePageLocators WaltDisneyHomepagePageLocatorsObj;
	
	public WaltDisneyHomepagePageActions(){
		WaltDisneyHomepagePageLocatorsObj = new WaltDisneyHomepagePageLocators();
		PageFactory.initElements(SetupDrivers.driver, WaltDisneyHomepagePageLocatorsObj);
	}
	
	public void locateParkAndTravelLink(){
		Actions action = new Actions(SetupDrivers.driver);
		action.moveToElement(WaltDisneyHomepagePageLocatorsObj.pNtNavbar).perform();	
	}
	public void locateWorldResortLink(){
		WaltDisneyHomepagePageLocatorsObj.worldResortLink.click();
	}
	public void locateDisneyLandResortLink(){
		
		WaltDisneyHomepagePageLocatorsObj.disneyLandResortLink.click();
	}
	//disneyland cruise
	public void locateDisneyCruiseLineLink(){
		WaltDisneyHomepagePageLocatorsObj.disneyCruiseLineLink.click();
	}
	
	//aulani
	public void locateAulaniLink(){
		WaltDisneyHomepagePageLocatorsObj.aulaniLink.click();
	}
	
}
