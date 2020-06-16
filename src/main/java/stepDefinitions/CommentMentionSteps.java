package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class CommentMentionSteps extends DriverFactory {

    @When("^User clicks search \"([^\"]*)\" users on homescreen$")
    public void user_clicks_search_something_users_on_homescreen(String fulname) throws Throwable {

        homeScreen.clickSearch();
        homeScreen.clickUsersTab();
        homeScreen.inputSearch(fulname);
    }

    @And("^User select most top result$")
    public void user_select_most_top_result() throws Throwable {

        homeScreen.clickFirstElementSearch();
    }

    @When("^User clicks post list on profile$")
    public void user_clicks_post_list_on_profile() throws Throwable {

        commentLikeScreen.clickFirstPostProfile();
    }

    @And("^user clicks comment icon$")
    public void user_clicks_comment_icon() throws Throwable {

        commentLikeScreen.getTotalCommentBefore();
        commentLikeScreen.clickCommentIcon();
    }

    @And("^User post \"([^\"]*)\" comment$")
    public void user_post_something_comment(String commentmention) throws Throwable {

       commentLikeScreen.inputCommentField(commentmention);
       commentLikeScreen.postComment();
    }

    @Then("^User back to post detail$")
    public void user_back_to_post_detail() throws Throwable {

       commentLikeScreen.clickBack();
       commentLikeScreen.getTotalCommentAfter();
       commentLikeScreen.totalComm();
    }

    @When("^User clicks reviews tab on profile$")
    public void user_clicks_reviews_tab_on_profile() throws Throwable {

        profileScreen.clickReviewsTab();
    }

    @And("^User clicks review list on profile$")
    public void user_clicks_review_list_on_profile() throws Throwable {

        commentLikeScreen.clickFirstReviewProfile();
    }

    @Then("^User back to review detail$")
    public void user_back_to_review_detail() throws Throwable {

        commentLikeScreen.clickBack();
        commentLikeScreen.getTotalCommentAfter();
        commentLikeScreen.totalComm();
    }

}
