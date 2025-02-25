package waltDisney.org.parksAndTravel.stepDef;

import cucumber.api.java.en.Then;
import waltDisney.org.parksAndTravel.pageAction.WaltDisneyAulaniPageActions;

public class WaltDisneyAulaniSteps {
	WaltDisneyAulaniPageActions WaltDisneyAulaniPageActionsObj = new WaltDisneyAulaniPageActions();
	@Then("^I confirm the destination’s images, offers, and descriptions are accurate$")
	public void i_confirm_the_destination_s_images_offers_and_descriptions_are_accurate() throws Throwable {
		WaltDisneyAulaniPageActionsObj.verifyDisneyAulaniPage();
	}
}
