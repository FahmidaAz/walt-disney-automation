package waltDisney.org.parksAndTravel.stepDef;

import cucumber.api.java.en.Then;
import waltDisney.org.parksAndTravel.pageAction.WaltDisneyDisneyVacationClubPageActions;

public class WaltDisneyDisneyVacationClubSteps {
	WaltDisneyDisneyVacationClubPageActions WaltDisneyDisneyVacationClubPageActionsObj = new WaltDisneyDisneyVacationClubPageActions();
	@Then("^I confirm the Explore membership, offer and benefits are accurate$")
	public void i_confirm_the_Explore_membership_offer_and_benefits_are_accurate() throws Throwable {
		WaltDisneyDisneyVacationClubPageActionsObj.verifyLogo();
	}
}
