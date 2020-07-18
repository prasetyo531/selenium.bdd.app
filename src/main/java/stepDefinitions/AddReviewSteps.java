package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class AddReviewSteps extends DriverFactory {

    @Given("^User clicks add review from homescreen menu$")
    public void user_clicks_add_review_from_homescreen_menu() throws Throwable {

        homeScreen.clickAddReviewHomeMenu();
    }

    @When("^User clicks one of popular product to review$")
    public void User_clicks_one_of_popular_product_to_review() throws Throwable {

        addReviewScreen.chooseFirstPopularProduct();
    }

    /*** add review screen ***/
    @Then("^User choose overall rating$")
    public void user_choose_overall_rating() throws Throwable {

        addReviewScreen.fillRatingAddReview();
    }

    @And("^User choose usage periode product$")
    public void User_choose_usage_periode_product() throws Throwable {

        addReviewScreen.setStepperDurationofUser();
    }

    @And("^User choose purchase point product$")
    public void User_choose_purchase_point_product() throws Throwable {

       addReviewScreen.clickEcommerce();
       addReviewScreen.setTokopedia();
    }

    @And("^User choose would recommend this product$")
    public void User_choose_would_recommend_this_product() throws Throwable {

        addReviewScreen.choosePositiveRecommendation();
    }

    @And("^User fill in add review box that should contain than 200 char$")
    public void User_fill_in_add_review_box_that_should_contain_than_200_char() throws Throwable {

        addReviewScreen.writeReview();
    }

    @And("^User clicks submit review button$")
    public void User_clicks_submit_review_button() throws Throwable {

        addReviewScreen.clickSubmitReview();
    }

    @Then("^User will see congrats screen and direct to review detail from feed$")
    public void User_will_see_congrats_screen_and_direct_to_review_detail_from_feed() throws Throwable {

        addReviewScreen.clickSeeMyReview();
        feedScreen.checkIsOnFeedAfterReview();
    }
}
