package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class InviteFriendsSteps extends DriverFactory {

    @Given("^User open profile then open invite menu$")
    public void user_open_profile_then_open_invite_menu() {
        homeScreen.clickProfileHomeMenu();
        profileScreen.clickSettingProfile();
        profileScreen.clickDrawerInviteFriends();
    }

    @When("^User click share$")
    public void user_click_share() {
        inviteFriendsScreen.clickShareInvite();
    }
}
