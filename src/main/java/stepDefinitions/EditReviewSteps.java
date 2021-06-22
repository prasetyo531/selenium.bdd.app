package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class EditReviewSteps extends DriverFactory {

    @When("^User clicks reviewed product from feed menu$")
    public void user_clicks_reviewed_product_from_feed_menu() throws Throwable {

        homeScreen.clickFeedMenu();
        feedScreen.clickReadMoreReview();
    }

    @And("^User clicks edit review on review detail$")
    public void user_clicks_edit_review_on_review_detail() throws Throwable {

        addReviewScreen.compareFieldBeforeEdited();
        addReviewScreen.clickEditReview();
    }

    @And("^User edit submitted review box that should contain than 200 char$")
    public void user_edit_submitted_review_box_that_should_contain_than_200_char() throws Throwable {

        addReviewScreen.editSubmittedReview();
    }

    @Then("^User will see review updated$")
    public void user_will_see_review_updated() {

        addReviewScreen.waitReviewDetail();
        addReviewScreen.compareFieldAfterEdited();
    }

    @Then("^User would see review updated$")
    public void user_would_see_review_updated() {

        addReviewScreen.waitReviewDetail();
    }

    @When("^User clicks edit review from modal tagged product$")
    public void user_clicks_edit_review_from_modal_tagged_product() throws Throwable {

        homeScreen.clickFeedMenu();

        feedScreen.clickIconTagsPost();
        modalPostTagProductScreen.clickViewProductDetailBtn();
        //product detail
        productDetailScreen.clickAddReviewBtn();
    }

    @When("^User clicks reviewed product from profile menu$")
    public void user_clicks_reviewed_product_from_profile_menu() throws Throwable {

        homeScreen.clickProfileHomeMenu();
        profileScreen.clickReviewsTab();
        profileScreen.clickRandomReviewListProfile();
    }

}
