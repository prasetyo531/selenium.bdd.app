package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class TalkSteps extends DriverFactory {

    @And("^User click menu fdtalk on homescreen menu$")
    public void user_click_menu_fdtalk_on_homescreen_menu() {
        // homeScreen.findAndCloseFloatingImg();
        homeScreen.clickTalkMenu();
    }

    @And("^User scroll until see recent activity$")
    public void user_scroll_until_see_recent_activity() {
        talkScreen.scrollToRecentTalk();
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
        talkScreen.clickFirstGroupTalk();

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
    public void user_will_see_new_topic_added() {
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
        talkScreen.clickFirstGroupTalk();

        talkScreen.submitReplyTopicAsGuest();
    }

    @And("^User will see confirmation that inform user will automatically joined group after reply topic$")
    public void user_will_see_confirmation_that_inform_user_will_automatically_joined_group_after_reply_topic() {
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

    @Then("^User will see new reply topic$")
    public void user_will_see_new_reply_topic() {
        talkScreen.checkNewSubmittedTalk();
    }

    @Then("^User will see new reply topic added and user will member of group$")
    public void user_will_see_new_reply_topic_added_and_user_will_member_of_group() {
        talkScreen.checkNewSubmittedTalk();

        talkScreen.clickBackToGroupDetail();
        talkScreen.scrollToTopGroupDetail();
        talkScreen.checkBtnAfterJoinGroupDetail();
    }

    @Then("^User will see new reply talk$")
    public void user_will_see_new_reply_talk() {
        talkScreen.checkNewSubmittedTalk();
    }

    @And("^User scroll until see talk section on homescreen$")
    public void user_scroll_until_see_talk_section_on_homescreen() {
        homeScreen.scrollToTalkSection();
    }

    @When("^User clicks join any group from group card on homescreen$")
    public void user_clicks_join_any_group_from_group_card_on_homescreen() {
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
    public void user_will_see_confirmation_that_inform_user_will_automatically_joined_group_after_reply_talk() {
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
    public void user_close_modal_rate_app() {
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
    public void user_edit_topic_from_topic_on_list_profile() {
        profileScreen.clickBtnSeeMore();
        profileScreen.clickBtnEditTopic();
    }
    
    @And("^User submit topic with empty title$")
    public void user_submit_topic_with_empty_title() {
        profileScreen.deleteTopicTitle();
        profileScreen.submitTopic();
    }

    @And("^User submit topic with empty description$")
    public void user_submit_topic_with_empty_description() {
        profileScreen.deleteTopicDesc();
        profileScreen.submitTopic();
    }

    @And("^User submit topic after remove all tags$")
    public void user_submit_topic_after_remove_all_tags() {
        profileScreen.deleteTopicTags();
        profileScreen.submitTopic();
    }

    @Then("^User will see toast msg that title at least have 15 character$")
    public void user_will_see_toast_msg_that_title_at_least_have_15_character() {
        profileScreen.getErrorEditTitleTopic();
    }

    @Then("^User will see toast msg that desc at least have 100 character$")
    public void user_will_see_toast_msg_that_desc_at_least_have_100_character() {
        profileScreen.getErrorErrorEditDescTopic();
    }

    @Then("^User will see toast msg that need at least one tag$")
    public void user_will_see_toast_msg_that_need_at_least_one_tag() {
        profileScreen.getErrorRemoveTagsTopic();
    }

    @Then("^User click on tab Topic$")
    public void user_click_on_tab_topic() {
        talkScreen.clickTabTopic();
    }

    //follow user from recent activity
    @When("^User follow member from recent talk card$")
    public void user_follow_member_from_recent_talk_card() {
        talkScreen.clickOnProfileUser();
        profileScreen.followUserFromProfile();
    }

    @When("^User follow member from recent topic card$")
    public void user_follow_member_from_recent_topic_card() {
        talkScreen.clickOnProfileUser();
        profileScreen.followUserFromProfile();
    }

    @Then("^User will see button change to following$")
    public void user_will_see_button_change_to_following() {
        profileScreen.checkButtonAfterFollow();
    }


    @When("^User like recent talk from tab Talk$")
    public void user_like_recent_talk_from_tab_talk() {
        talkScreen.checkCounterBeforeLike();
        talkScreen.likeRecentTalk();
    }

    @Then("^User will see counter liked is increased$")
    public void user_will_see_counter_liked_is_increased() {
        talkScreen.checkCounterAfterLike();
    }
    
    @When("^User tap on reply button at talk card$")
    public void user_tap_on_reply_button_at_talk_card() {
        talkScreen.replyRecentTalk();
    }

    @Then("^User will see topic detail screen$")
    public void user_will_see_topic_detail_screen() {
        talkScreen.getTopicDetail();
    }
    
    @When("^User reply talk on topic detail$")
    public void user_reply_talk_on_topic_detail() {
        talkScreen.replyTalkOnTopicDetail();
    }

    @When("^User reply topic on topic detail$")
    public void userReplyTopicOnTopicDetail() {
        talkScreen.replyTopicOnTopicDetail();
    }
    
    @And("^User scroll until last screen$")
    public void user_scroll_until_last_screen() {
        talkScreen.scrollUntilLastScreen();
    }

    @When("^User scroll and click tab Topic$")
    public void user_scroll_and_click_tab_topic() {
        talkScreen.scrollAndClickTabTopic();
    }
    
    @When("^User click on recent topic$")
    public void user_click_on_recent_topic() {
        talkScreen.tapRecentTopic();
    }

    @When("^User click on see more talk$")
    public void user_click_on_see_more_talk() {
        talkScreen.tapSeeMoreTalkTopic();
    }

    @Then("^User will see list of recent talk$")
    public void user_will_see_list_of_recent_talk() {
        talkScreen.getListRecentTalkTopic();
    }

    @When("^User click on see more topic$")
    public void user_click_on_see_more_topic() {
        talkScreen.tapSeeMoreTalkTopic();
    }

    @Then("^User will see list of recent topic$")
    public void user_will_see_list_of_recent_topic() {
        talkScreen.getListRecentTalkTopic();
    }

    //sort topic on group detail
    @When("^User click one of group talk$")
    public void user_click_one_of_group_talk() {
        talkScreen.clickFirstGroupTalk();
    }

    @And("^User sort topic by category Newest$")
    public void user_sort_topic_by_category_newest() {
        talkScreen.checkBeforeSort();
        talkScreen.sortTopicByNewest();
    }

    @Then("^User will see list topic by category Newest$")
    public void user_will_see_list_topic_by_category_newest() {
        talkScreen.checkAfterSortNewest();
    }

    @And("^User sort topic by category Popular$")
    public void user_sort_topic_by_category_popular() {
        talkScreen.checkBeforeSort();
        talkScreen.sortTopicByPopular();
    }

    @Then("^User will see list topic by category Popular$")
    public void user_will_see_list_topic_by_category_popular() {
        talkScreen.checkAfterSortPopularMostTalks();
    }

    @And("^User sort topic by category Most Talks$")
    public void user_sort_topic_by_category_most_talks() {
        talkScreen.checkBeforeSort();
        talkScreen.sortTopicByMostTalks();
    }
    
    @Then("^User will see list topic by category Most Talks$")
    public void user_will_see_list_topic_by_category_most_talks() {
        talkScreen.checkAfterSortPopularMostTalks();
    }


    @When("^User sort talk by category Newest$")
    public void user_sort_talk_by_category_newest() {
        talkScreen.checkBeforeSortTalk();
        talkScreen.sortTalkByNewest();
    }

    @Then("^User will see list talk by category Newest$")
    public void user_will_see_list_talk_by_category_newest() {
        talkScreen.checkAfterSortNewestTalks();
    }

    @When("^User sort talk by category Oldest$")
    public void user_sort_talk_by_category_oldest() {
        talkScreen.checkBeforeSortTalk();
        talkScreen.sortTalkByOldest();
    }

    @Then("^User will see list talk by category Oldest$")
    public void user_will_see_list_talk_by_category_oldest() {
        talkScreen.checkAfterSortOldestMostLikes();
    }

    @When("^User sort talk by category Most Likes$")
    public void user_sort_talk_by_category_most_likes() {
        talkScreen.checkBeforeSortTalk();
        talkScreen.sortTalkByMostLikes();
    }

    @Then("^User will see list talk by category Most Likes$")
    public void user_will_see_list_talk_by_category_most_likes() {
        talkScreen.checkAfterSortOldestMostLikes();
    }

    @And("^User click any topic on group detail$")
    public void user_click_any_topic_on_group_detail() {
        talkScreen.clickMostTopTopic();
    }

    //search talk home
    @When("^User search for topic \"([^\"]*)\" title$")
    public void user_search_for_topic_something_title(String topic) throws Throwable {
        talkScreen.searchTopicOnTalkHome(topic);
    }


    @Then("^User will see topic \"([^\"]*)\" search result$")
    public void user_will_see_topic_something_search_result(String topic) throws Throwable {
        talkScreen.tapSearchResult();
        talkScreen.checkTopicDetail();
        talkScreen.checkTopicSearchResult(topic);
    }


    @When("^User search for talk \"([^\"]*)\" title$")
    public void user_search_for_talk_something_title(String talk) throws Throwable {
        talkScreen.searchTalkOnTalkHome(talk);
    }

    @Then("^User will see talk \"([^\"]*)\" search result$")
    public void user_will_see_talk_something_search_result(String talk) throws Throwable {
        talkScreen.tapSearchResult();
        talkScreen.checkTopicDetail();
        talkScreen.checkTalkSearchResult(talk);
    }
    
    @When("^User search for group \"([^\"]*)\" at group list screen$")
    public void user_search_for_group_something_at_group_list_screen(String group) throws Throwable {
        talkScreen.searchGroupTalk(group);
    }

    @Then("^User will see group \"([^\"]*)\" search result$")
    public void user_will_see_group_something_search_result(String group) throws Throwable {
        talkScreen.checkGroupSearchResult(group);
    }

    @And("^User search for topic \"([^\"]*)\" at group detail screen$")
    public void user_search_for_topic_something_at_group_detail_screen(String topic) throws Throwable {
        talkScreen.searchTopicOnGroupDetail(topic);
    }

    @Then("^User will see list topic \"([^\"]*)\" search result at group detail screen$")
    public void user_will_see_list_topic_something_search_result_at_group_detail_screen(String topic) throws Throwable {
        Thread.sleep(5000);
        talkScreen.checkListTopicSearchResult(topic);
    }
    
}
