package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class TalkSteps extends DriverFactory {

    @And("^User click menu fdtalk on homescreen menu$")
    public void user_click_menu_fdtalk_on_homescreen_menu() {
        homeScreen.clickTalkMenu();
    }

    @When("^User join any group from group card on talk home$")
    public void user_join_any_group_from_group_card_on_talk_home() throws InterruptedException {
        talkScreen.joinRandomGrupTalk();
        talkScreen.checkBtnAfterJoin();
    }

    @Then("^User will see member button and see joined group appear on joined tab$")
    public void user_will_see_member_button_and_see_joined_group_appear_on_joined_tab() throws Throwable {
        talkScreen.checkJoinedGroupJoinedTab();
    }

}
