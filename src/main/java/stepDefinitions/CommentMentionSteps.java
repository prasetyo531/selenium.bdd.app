package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
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
        commentLikeScreen.clickFirstPostProfile();
    }

    @And("^user clicks comment icon$")
    public void user_clicks_comment_icon() {
        commentLikeScreen.getTotalCommentBefore();
        commentLikeScreen.clickCommentIcon();
    }

    @And("^User post \"([^\"]*)\" comment$")
    public void user_post_something_comment(String commentmention) {
       commentLikeScreen.inputCommentField(commentmention);
       commentLikeScreen.postComment();
    }

    @Then("^User back to post detail$")
    public void user_back_to_post_detail() {
       commentLikeScreen.clickBack();
       commentLikeScreen.getTotalCommentAfter();
       commentLikeScreen.totalComm();
    }

    @When("^User clicks reviews tab on profile$")
    public void user_clicks_reviews_tab_on_profile() {
        profileScreen.clickReviewsTab();
    }

    @And("^User clicks review list on profile$")
    public void user_clicks_review_list_on_profile() {
        commentLikeScreen.clickFirstReviewProfile();
    }

    @Then("^User back to review detail$")
    public void user_back_to_review_detail() {
        commentLikeScreen.clickBack();
        commentLikeScreen.getTotalCommentAfter();
        commentLikeScreen.totalComm();
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

    @Then("^User will see comment deleted$")
    public void user_will_see_comment_deleted() throws InterruptedException {
        feedScreen.checkDeleteCommentPost();
    }
}
