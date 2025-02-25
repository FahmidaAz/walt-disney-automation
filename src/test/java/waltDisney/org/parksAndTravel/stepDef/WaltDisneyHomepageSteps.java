package waltDisney.org.parksAndTravel.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import waltDisney.org.parksAndTravel.pageAction.WaltDisneyHomepagePageActions;

public class WaltDisneyHomepageSteps {
	WaltDisneyHomepagePageActions WaltDisneyHomepagePageActionsObj = new WaltDisneyHomepagePageActions();
	
	//World resort
	@Given("^I open the Disney\\.com homepage$")
	public void i_open_the_Disney_com_homepage() throws Throwable {
	    
	}
	@When("^I locate and click on the \"([^\"]*)\" section in the main navigation menu$")
	public void i_locate_and_click_on_the_section_in_the_main_navigation_menu(String arg1) throws Throwable {
		WaltDisneyHomepagePageActionsObj.locateParkAndTravelLink();
	}
	@When("^I click on \"([^\"]*)\" link$")
	public void i_click_on_link(String arg1) throws Throwable {
		WaltDisneyHomepagePageActionsObj.locateWorldResortLink();
	}
	
	//disneyland resort
	@When("^I navigate to the \"([^\"]*)\" menu and click on \"([^\"]*)\"$")
	public void i_navigate_to_the_menu_and_click_on(String arg1, String arg2) throws Throwable {
		WaltDisneyHomepagePageActionsObj.locateParkAndTravelLink();
		WaltDisneyHomepagePageActionsObj.locateDisneyLandResortLink();
	}
	
	//disney Cruise line
	@When("^I click on \"([^\"]*)\" under \"([^\"]*)\"$")
	public void i_click_on_under(String arg1, String arg2) throws Throwable {
		WaltDisneyHomepagePageActionsObj.locateParkAndTravelLink();
		WaltDisneyHomepagePageActionsObj.locateDisneyCruiseLineLink();
	}
	//aulani
	@When("^I access the \"([^\"]*)\" page from the same menu$")
	public void i_access_the_page_from_the_same_menu(String arg1) throws Throwable {
		WaltDisneyHomepagePageActionsObj.locateParkAndTravelLink();
		WaltDisneyHomepagePageActionsObj.locateAulaniLink();
	}
	

}
