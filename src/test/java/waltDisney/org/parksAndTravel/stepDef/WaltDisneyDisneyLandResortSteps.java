package waltDisney.org.parksAndTravel.stepDef;

import cucumber.api.java.en.Then;
import waltDisney.org.parksAndTravel.pageAction.WaltDisneyDisneyLandResortPageActions;

public class WaltDisneyDisneyLandResortSteps {

	WaltDisneyDisneyLandResortPageActions WaltDisneyDisneyLandResortPageActionsObj = new WaltDisneyDisneyLandResortPageActions();
	@Then("^I check that the Disneyland Resort page loads correctly with relevant travel details$")
	public void i_check_that_the_Disneyland_Resort_page_loads_correctly_with_relevant_travel_details() throws Throwable {
		WaltDisneyDisneyLandResortPageActionsObj.verifyDisneyLandResortPage();
	}
}
