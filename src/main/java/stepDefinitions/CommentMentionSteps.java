package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class CommentMentionSteps extends DriverFactory {

    @When("^User clicks feed from homescreen menu and select comment post$")
    public void user_clicks_feed_from_homescreen_menu_and_select_comment_post() {
        homeScreen.clickFeedMenu();
        feedScreen.clickCommentFirstPost();
    }

    @When("^User clicks feed from homescreen menu and select comment review$")
    public void user_clicks_feed_from_homescreen_menu_and_select_comment_review() {
        homeScreen.clickFeedMenu();
        feedScreen.clickCommentFirstReview();
    }

    @When("^User clicks search \"([^\"]*)\" users on homescreen$")
    public void user_clicks_search_something_users_on_homescreen(String fulname) {
        homeScreen.clickSearch();
        homeScreen.clickUsersTab();
        homeScreen.inputSearch(fulname);
    }

    @And("^User select most top result$")
    public void user_select_most_top_result() {
        homeScreen.clickFirstElementSearch();
    }

    @When("^User clicks post list on profile$")
    public void user_clicks_post_list_on_profile() {
//        commentLikeScreen.clickFirstPostProfile();
        profileScreen.clickRandomPostListProfile();
    }

    @And("^user clicks comment icon post$")
    public void user_clicks_comment_icon_post() {
        feedScreen.getTotalCommentPostBefore();
        feedScreen.clickCommentIconPost();
    }

    @And("^user clicks comment icon review$")
    public void user_clicks_comment_icon_review() {
        feedScreen.getTotalCommentReviewBefore();
        feedScreen.clickCommentIconReview();
    }

    @And("^User post \"([^\"]*)\" comment$")
    public void user_post_something_comment(String commentmention) {
       commentLikeScreen.inputCommentField(commentmention);
       commentLikeScreen.postComment();
    }

    @Then("^User back to post detail$")
    public void user_back_to_post_detail() {
       commentLikeScreen.clickBack();
       feedScreen.getTotalCommentPostAfter();
       feedScreen.totalCommentPost();
    }

    @When("^User clicks reviews tab on profile$")
    public void user_clicks_reviews_tab_on_profile() {
        profileScreen.clickReviewsTab();
    }

    @And("^User clicks review list on profile$")
    public void user_clicks_review_list_on_profile() {
        profileScreen.clickRandomReviewListProfile();
    }

    @Then("^User back to review detail$")
    public void user_back_to_review_detail() {
        commentLikeScreen.clickBack();
        feedScreen.getTotalCommentReviewAfter();
        feedScreen.totalCommentReview();
    }

    @And("^User click reply from any comment and click post$")
    public void user_click_reply_from_any_comment_and_click_post() throws InterruptedException {
        feedScreen.submitReplyCommentPost();
    }

    @And("^User input comment and click post$")
    public void user_input_comment_and_click_post() throws InterruptedException {
        feedScreen.submitCommentPost();
    }

    @Then("^User will see submited comment$")
    public void user_will_see_submited_comment() {
        feedScreen.checkSubmitCommentPost();
    }

    @When("^User delete comment$")
    public void user_delete_comment() throws InterruptedException {
        feedScreen.deleteCommentPost();
    }

    @And("^User report comment$")
    public void user_report_comment() {
        feedScreen.reportCommentPost();
    }

    @Then("^User will see comment deleted$")
    public void user_will_see_comment_deleted() throws InterruptedException {
        feedScreen.checkDeleteCommentPost();
    }

    @Then("^User will see toast msg after report comment$")
    public void user_will_see_toast_msg_after_report_comment() {
        feedScreen.checkToastReportComment();
    }
}
