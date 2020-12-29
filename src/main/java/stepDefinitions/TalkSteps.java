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

    @When("^User submit add topic at not joined group$")
    public void user_submit_add_topic_at_not_joined_group() {
        talkScreen.scrollGroupTalk();
        talkScreen.clickRandomGroupTalk();

        talkScreen.submitAddTopicAsGuest();
    }

    @And("^User will see confirmation that inform user will automatically joined group after add topic$")
    public void user_will_see_confirmation_that_inform_user_will_automatically_joined_group_after_add_topic() {
        talkScreen.getConfirmationJoinTopic();
    }

    @And("^User will see confirmation that inform user will automatically joined group after edit topic$")
    public void user_will_see_confirmation_that_inform_user_will_automatically_joined_group_after_edit_topic() {
        talkScreen.getConfirmationJoinTopic();
        talkScreen.checkToastTopicEdited();
    }

    @Then("^User will see new topic added$")
    public void user_will_see_new_topic_added() throws Throwable {
        talkScreen.checkNewSubmittedTopic();
        talkScreen.checkBtnAfterJoinGroupDetail();
    }

    @When("^User edit topic at not joined group \"([^\"]*)\" and search topic \"([^\"]*)\"$")
    public void user_edit_topic_at_not_joined_group_something_and_search_topic_something(String group, String topic) throws InterruptedException {
        talkScreen.searchGroupTalk(group);
        talkScreen.clickFirstGroup();

        talkScreen.submitEditTopicAsGuest(topic);
    }

    @When("^User submit reply topic at not joined group \"([^\"]*)\"$")
    public void user_submit_reply_topic_at_not_joined_group_something(String group) throws InterruptedException {
        talkScreen.searchGroupTalk(group);
        talkScreen.clickRandomGroupTalk();

        talkScreen.submitReplyTopicAsGuest();
    }

    @And("^User will see confirmation that inform user will automatically joined group after reply topic$")
    public void user_will_see_confirmation_that_inform_user_will_automatically_joined_group_after_reply_topic() throws Throwable {
        talkScreen.getConfirmationJoinTalk();
    }

    @Then("^User will see topic updated$")
    public void user_will_see_topic_updated() {
        talkScreen.checkTopicUpdated();
        talkScreen.clickBackToGroupDetail();
        talkScreen.clickCancelSearchTopic();
        talkScreen.scrollToTopGroupDetail();
        talkScreen.checkBtnAfterJoinGroupDetail();
    }

    @Then("^User will see new reply topic added and user will member of group$")
    public void user_will_see_new_reply_topic_added_and_user_will_member_of_group() {
        talkScreen.checkNewSubmittedTalk();

        talkScreen.clickBackToGroupDetail();
        talkScreen.scrollToTopGroupDetail();
        talkScreen.checkBtnAfterJoinGroupDetail();
    }

    //talk
    @When("^User submit reply talk at not joined group \"([^\"]*)\" and at topic \"([^\"]*)\"$")
    public void user_submit_reply_talk_at_not_joined_group_something_and_at_topic_something(String group, String topic) throws Throwable {
        talkScreen.searchGroupTalk(group);
        talkScreen.clickFirstGroup();

        talkScreen.submitReplyTalkAsGuest(topic);
    }

    @And("^User will see confirmation that inform user will automatically joined group after reply talk$")
    public void user_will_see_confirmation_that_inform_user_will_automatically_joined_group_after_reply_talk() throws Throwable {
        talkScreen.getConfirmationJoinTalk();
    }

    @Then("^User will see new reply talk added and user will member of group$")
    public void user_will_see_new_reply_talk_added_and_user_will_member_of_group() {
        talkScreen.checkNewSubmittedTalk();

        talkScreen.clickBackToGroupDetail();
        talkScreen.clickBackToGroupDetail();
        talkScreen.scrollToTopGroupDetail();
        talkScreen.checkBtnAfterJoinGroupDetail();
    }

}
