package waltDisney.org.parksAndTravel.stepDef;

import cucumber.api.java.en.Then;
import waltDisney.org.parksAndTravel.pageAction.WaltDisneyWorldResortPageActions;

public class WaltDisneyWorldResortSteps {
	WaltDisneyWorldResortPageActions WaltDisneyWorldResortPageActionsObj = new WaltDisneyWorldResortPageActions();
	@Then("^I verify that the correct page loads with all relevant resort information$")
	public void i_verify_that_the_correct_page_loads_with_all_relevant_resort_information() throws Throwable {
		WaltDisneyWorldResortPageActionsObj.verifyWorldResortPage();
	}
}
