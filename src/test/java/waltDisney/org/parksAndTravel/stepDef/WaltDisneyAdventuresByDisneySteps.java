package waltDisney.org.parksAndTravel.stepDef;

import cucumber.api.java.en.Then;
import waltDisney.org.parksAndTravel.pageAction.WaltDisneyAdventuresByDisneyPageActions;

public class WaltDisneyAdventuresByDisneySteps {
	WaltDisneyAdventuresByDisneyPageActions WaltDisneyAdventuresByDisneyPageActionsObj = new WaltDisneyAdventuresByDisneyPageActions();
	
	@Then("^I confirm the destination’s images, trips, and plan a trip are accurate$")
	public void i_confirm_the_destination_s_images_trips_and_plan_a_trip_are_accurate() throws Throwable {
		WaltDisneyAdventuresByDisneyPageActionsObj.verifyAdventureLogo();
	}


}
