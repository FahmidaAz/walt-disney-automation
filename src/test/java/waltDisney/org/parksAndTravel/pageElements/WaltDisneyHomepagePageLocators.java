package waltDisney.org.parksAndTravel.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WaltDisneyHomepagePageLocators {
      @FindBy(xpath="//a[@id='Parks & Travel-dropdown']")
     public WebElement pNtNavbar; 
      
      @FindBy(xpath="//a[@data-analytic='2/none/item0']")
      public WebElement worldResortLink;
      
      @FindBy(xpath="//a[@data-analytic='2/none/item1']")
      public WebElement disneyLandResortLink;
      
      @FindBy(xpath="//a[@data-analytic='2/none/item2']")
      public WebElement disneyCruiseLineLink;
      
      @FindBy(xpath="//a[@data-analytic='2/none/item3']")
      public WebElement aulaniLink;
      
      @FindBy(xpath="//a[@data-analytic='2/none/item4']")
      public WebElement adventuresLink;
      
      @FindBy(xpath="//a[@data-analytic='2/none/item5']")
      public WebElement vacationClubLink;
}
