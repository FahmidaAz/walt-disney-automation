package waltDisney.org.parksAndTravel.pageAction;

import org.openqa.selenium.interactions.Actions;
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
	  //Tickets and parks link
	  public void loadThePageDisneyWorld(){
		  SetupDrivers.driver.get("https://disneyworld.disney.go.com/"); 
	  }
	  public void mousehoverTicketAndParks(){
		  Actions action = new Actions(SetupDrivers.driver);
		  action.moveToElement( WaltDisneyDisneyLandResortPageLocatorsObj.ticketTab).perform();
	  }
	  public void checkAllLinks(){
		  WaltDisneyDisneyLandResortPageLocatorsObj.ticketPass.isDisplayed();
		  WaltDisneyDisneyLandResortPageLocatorsObj.planVisit.isDisplayed();
		  WaltDisneyDisneyLandResortPageLocatorsObj.exploreParks.isDisplayed();
	  }
}
