package waltDisney.org.parksAndTravel.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import waltDisney.org.parksAndTravel.pageAction.WaltDisneyDisneyLandResortPageActions;

public class WaltDisneyDisneyLandResortSteps {

	WaltDisneyDisneyLandResortPageActions WaltDisneyDisneyLandResortPageActionsObj = new WaltDisneyDisneyLandResortPageActions();
	@Then("^I check that the Disneyland Resort page loads correctly with relevant travel details$")
	public void i_check_that_the_Disneyland_Resort_page_loads_correctly_with_relevant_travel_details() throws Throwable {
		WaltDisneyDisneyLandResortPageActionsObj.verifyDisneyLandResortPage();
	}
	
	//Ticket and parks links snippets
	@Given("^I open the Disney World homepage$")
	public void i_open_the_Disney_World_homepage() throws Throwable {
		WaltDisneyDisneyLandResortPageActionsObj.loadThePageDisneyWorld();
	}

	@When("^I mouse hover on the \"([^\"]*)\" link in the navigation menu$")
	public void i_mouse_hover_on_the_link_in_the_navigation_menu(String arg1) throws Throwable {
		WaltDisneyDisneyLandResortPageActionsObj.mousehoverTicketAndParks();
	}

	@Then("^I can see \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\" all links$")
	public void i_can_see_and_all_links(String arg1, String arg2, String arg3) throws Throwable {
		WaltDisneyDisneyLandResortPageActionsObj.checkAllLinks();
	}
    //places to stay snippets
	@Then("^I can see \"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"all links$")
	public void i_can_see_and_all_links(String arg1, String arg2, String arg3, String arg4) throws Throwable {
	    
	}


}
