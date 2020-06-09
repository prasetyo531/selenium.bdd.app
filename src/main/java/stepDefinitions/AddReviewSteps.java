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

    @When("^User click one of popular product to review$")
    public void user_click_one_of_popular_product_to_review() throws Throwable {

        addReviewScreen.chooseFirstPopularProduct();
    }

    /*** add review screen ***/
    @Then("^User choose overall rating$")
    public void user_choose_overall_rating() throws Throwable {

        addReviewScreen.fillRatingAddReview();
    }

    @And("^user choose usage periode product$")
    public void user_choose_usage_periode_product() throws Throwable {

        addReviewScreen.setStepperDurationofUser();
    }

    @And("^user choose purchase point product$")
    public void user_choose_purchase_point_product() throws Throwable {

       addReviewScreen.clickEcommerce();
       addReviewScreen.setTokopedia();
    }

    @And("^user choose would recommend this product$")
    public void user_choose_would_recommend_this_product() throws Throwable {

        addReviewScreen.choosePositiveRecommendation();
    }

    @And("^user fill in add review box that should contain than 200 char$")
    public void user_fill_in_add_review_box_that_should_contain_than_200_char() throws Throwable {

        addReviewScreen.writeReview();
    }

    @And("^user click submit review button$")
    public void user_click_submit_review_button() throws Throwable {

        addReviewScreen.clickSubmitReview();
    }

    @Then("^user will see congrats screen and direct to review detail from feed$")
    public void user_will_see_congrats_screen_and_direct_to_review_detail_from_feed() throws Throwable {

        addReviewScreen.clickSeeMyReview();
        feedScreen.checkIsOnFeed();
    }
}
