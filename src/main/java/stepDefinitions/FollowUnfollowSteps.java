package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.FollowerFollowingScreen;
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

    @When("^User clicks followers tab profile$")
    public void user_clicks_followers_tab_profile() {
        homeScreen.clickProfileHomeMenu();
        profileScreen.clickFollowerCounter();
    }

    @When("^User clicks following tab profile$")
    public void user_clicks_following_tab_profile() {
        homeScreen.clickProfileHomeMenu();
        profileScreen.clickFollowingCounter();
    }

    @Then("^User will see list user which following account$")
    public void user_will_see_list_user_which_following_account() {
        followerFollowingScreen.waitUntilListVisible();
    }

    @Then("^User will see list user which followed by account$")
    public void user_will_see_list_user_which_followed_by_account() {
        followerFollowingScreen.waitUntilListVisible();
    }

    @When("^User clicks follow on list follower$")
    public void user_clicks_follow_on_list_follower() {
        followerFollowingScreen.beforeFollow();
        followerFollowingScreen.clickFollow();
    }

    @When("^User clicks unfollow on list following$")
    public void user_clicks_unfollow_on_list_following() {
        followerFollowingScreen.beforeUnfollow();
        followerFollowingScreen.clickUnfollow();
    }

    @Then("^User will see button change to follow on list$")
    public void user_will_see_button_change_to_follow_on_list() {
        followerFollowingScreen.checkAfterUnfollow();
    }

    @Then("^User will see button change to following on list$")
    public void user_will_see_button_change_to_following_on_list() {
        followerFollowingScreen.checkAfterFollow();
    }

    @When("^User click user from list$")
    public void user_click_user_from_list() {
        followerFollowingScreen.clickRandomUserToVisit();
    }

    @Then("^User will directed to user profile$")
    public void user_will_directed_to_user_profile() {
        profileScreen.waitProfile();
    }
}
