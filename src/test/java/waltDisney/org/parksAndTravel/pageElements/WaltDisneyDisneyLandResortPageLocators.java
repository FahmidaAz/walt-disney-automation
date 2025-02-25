package waltDisney.org.parksAndTravel.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WaltDisneyDisneyLandResortPageLocators {
	
      @FindBy(xpath="//h1[text()='Fun for the Whole Family']")
      public WebElement verifyDisneyLandResortPage;
      
      //Ticket and park tab
      @FindBy(xpath="//a[@name='&lid=WDW_Header_ParksTickets_CategoryLink']")
      public WebElement ticketTab;
      
      @FindBy(xpath="//h2[text()='Tickets & Passes']")
      public WebElement ticketPass;
      @FindBy(xpath="//h2[text()='Plan Your Visit']")
      public WebElement planVisit;
      @FindBy(xpath="//div[text()='Explore Our Parks']")
      public WebElement exploreParks;
      
      //Places to stay
      
      @FindBy(xpath="//h2[text()='Disney Resorts Collection']")
      public WebElement resortCollection;
      
}
