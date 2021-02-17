package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.HomeScreen;
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

    @And("^User scroll until see talk section on homescreen$")
    public void user_scroll_until_see_talk_section_on_homescreen() throws Throwable {
        homeScreen.scrollToTalkSection();
    }

    @When("^User clicks join any group from group card on homescreen$")
    public void user_clicks_join_any_group_from_group_card_on_homescreen() throws Throwable {
        homeScreen.joinGroupTalk();
    }

    @Then("^User will see member button on group card homescreen$")
    public void user_will_see_member_button_on_group_card_homescreen() throws Throwable {
        homeScreen.checkBtnAfterJoinGroup();
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

    //topic talk profile
    @And("^user close modal rate app$")
    public void user_close_modal_rate_app() throws Throwable {
        homeScreen.remindMeLaterRatingModal();
    }

    @When("^User clicks topic from topic list on profile$")
    public void user_clicks_topic_from_topic_list_on_profile() {
        homeScreen.clickProfileHomeMenu();
        profileScreen.clickTopicTab();
        profileScreen.clickFirstTopicListProfile();
    }

    @When("^User clicks talk from talk list on profile$")
    public void user_clicks_talk_from_talk_list_on_profile() {
        homeScreen.clickProfileHomeMenu();
        profileScreen.clickTalkTab();
        profileScreen.clickFirstTalkListProfile();
    }

    @Then("^User will direct to topic detail screen$")
    public void user_will_direct_to_topic_detail_screen() {
        talkScreen.checkTopicDetail();
    }

    //edit topic from profile
    @And("^User edit topic from topic on list profile$")
    public void user_edit_topic_from_topic_on_list_profile() throws Throwable {
        profileScreen.clickBtnSeeMore();
        profileScreen.clickBtnEditTopic();
    }
    
    @And("^User submit topic with empty title$")
    public void user_submit_topic_with_empty_title() throws Throwable {
        profileScreen.deleteTopicTitle();
        profileScreen.submitTopic();
    }

    @And("^User submit topic with empty description$")
    public void user_submit_topic_with_empty_description() throws Throwable {
        profileScreen.deleteTopicDesc();
        profileScreen.submitTopic();
    }

    @And("^User submit topic after remove all tags$")
    public void user_submit_topic_after_remove_all_tags() throws Throwable {
        profileScreen.deleteTopicTags();
        profileScreen.submitTopic();
    }

    @Then("^User will see toast msg that title at least have 15 character$")
    public void user_will_see_toast_msg_that_title_at_least_have_15_character() throws Throwable {
        profileScreen.getErrorEditTitleTopic();
    }

    @Then("^User will see toast msg that desc at least have 100 character$")
    public void user_will_see_toast_msg_that_desc_at_least_have_100_character() throws Throwable {
        profileScreen.getErrorErrorEditDescTopic();
    }

    @Then("^User will see toast msg that need at least one tag$")
    public void user_will_see_toast_msg_that_need_at_least_one_tag() throws Throwable {
        profileScreen.getErrorRemoveTagsTopic();
    }

    //follow user from recent activity
    @And("^User scroll until see recent activity$")
    public void user_scroll_until_see_recent_activity() throws Throwable {
        talkScreen.scrollToRecentTalk();
    }

    @And("^User click on tab Topic$")
    public void user_click_on_tab_topic() throws Throwable {
        talkScreen.clickTabTopic();
    }
    
    @When("^User click on profile user from recent card$")
    public void user_click_on_profile_user_from_recent_card() throws Throwable {
        talkScreen.clickOnProfileUser();
    }

    @Then("^User follow member from recent talk card$")
    public void user_follow_member_from_recent_talk_card() throws Throwable {
        profileScreen.followUserFromProfile();
    }
    
    @Then("^User follow member from recent topic card$")
    public void user_follow_member_from_recent_topic_card() throws Throwable {
        profileScreen.followUserFromProfile();
    }

    @Then("^User like recent talk from tab Talk$")
    public void user_like_recent_talk_from_tab_talk() throws Throwable {
        talkScreen.likeRecentTalk();
    }
    
    @When("^User tap on reply button at talk card$")
    public void user_tap_on_reply_button_at_talk_card() throws Throwable {
        talkScreen.replyRecentTalk();
    }

    @And("^User will see topic detail screen$")
    public void user_will_see_topic_detail_screen() throws Throwable {
        talkScreen.getTopicDetail();
    }
    
    @Then("^User reply talk on topic detail$")
    public void user_reply_talk_on_topic_detail() throws Throwable {
        talkScreen.replyTalkOnTopicDetail();
    }

    @Then("^User reply topic on topic detail$")
    public void userReplyTopicOnTopicDetail() {
        talkScreen.replyTopicOnTopicDetail();
    }
    
    @And("^User scroll until last screen$")
    public void user_scroll_until_last_screen() throws Throwable {
        talkScreen.scrollUntilLasScreen();
    }

    @When("^User scroll and click tab Topic$")
    public void user_scroll_and_click_tab_topic() throws Throwable {
        talkScreen.scrollAndClickTabTopic();
    }
    
    @When("^User click on recent topic$")
    public void user_click_on_recent_topic() throws Throwable {
        talkScreen.tapRecentTopic();
    }

    @When("^User click on see more talk$")
    public void user_click_on_see_more_talk() throws Throwable {
        talkScreen.tapSeeMoreTalkTopic();
    }

    @Then("^User will see list of recent talk$")
    public void user_will_see_list_of_recent_talk() throws Throwable {
        talkScreen.getListRecentTalkTopic();
    }

    @When("^User click on see more topic$")
    public void user_click_on_see_more_topic() throws Throwable {
        talkScreen.tapSeeMoreTalkTopic();
    }

    @Then("^User will see list of recent topic$")
    public void user_will_see_list_of_recent_topic() throws Throwable {
        talkScreen.getListRecentTalkTopic();
    }
    
}
