package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class FollowUnfollowSteps extends DriverFactory {

    @When("^User clicks unfollow on user profile$")
    public void user_clicks_unfollow_on_user_profile() {
        profileScreen.followUserFromProfile();
    }

    @When("^User clicks follow on user profile$")
    public void user_clicks_follow_on_user_profile() {
        profileScreen.followUserFromProfile();
    }

    @Then("^User will see button change to following$")
    public void user_will_see_button_change_to_following() {
        profileScreen.checkButtonAfterFollow();
    }

    @Then("^User will see button change to follow$")
    public void user_will_see_button_change_to_follow() {
        profileScreen.checkButtonAfterUnfollow();
    }
}
