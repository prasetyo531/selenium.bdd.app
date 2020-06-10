package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class AddPostSteps extends DriverFactory {

    @Given("^User clicks add post from homescreen menu$")
    public void user_clicks_add_post_from_homescreen_menu() throws Throwable {

        homeScreen.clickAddPostHomeMenu();
    }

    @When("^User take picture to add post$")
    public void user_take_picture_to_add_post() throws Throwable {

        addPostScreen.capturePhoto();
    }

    @Then("^User enters caption of post$")
    public void user_enters_caption_of_post() throws Throwable {

        addPostScreen.fillCaption();
    }

    @And("^User clicks submit post and choose yes to skip tagging product$")
    public void user_clicks_submit_post_and_choose_yes_to_skip_tagging_product() throws Throwable {

        addPostScreen.submitPostNoTag();
    }

    @Then("^User will direct to feed where last post is at most top$")
    public void user_will_direct_to_feed_where_last_post_is_at_most_top() throws Throwable {

        feedScreen.checkIsOnFeedAfterPost();
    }

    @And("^User tag product and select from popular product$")
    public void user_tag_product_and_select_from_popular_product() throws Throwable {

        addPostScreen.clickTagProduct();
        addPostScreen.chooseFirstPopularProduct();

    }

    @And("^User add review product in tag$")
    public void user_add_review_product_in_tag() throws Throwable {

        addPostScreen.clickReviewTaggedProduct();
        addPostScreen.chooseFirstTaggedProduct();

        //add review screen 1
        addReviewScreen.fillRatingAddReview();
        //add review screen 2
        addReviewScreen.setStepperDurationofUser();
        //add review screen 3
        addReviewScreen.clickEcommerce();
        addReviewScreen.setTokopedia();
        //add review screen 4
        addReviewScreen.choosePositiveRecommendation();
        addReviewScreen.writeReview();
        addReviewScreen.clickSubmitReview();

        addPostScreen.backToAddPostScreen();
    }

    @And("^User clicks submit post with tag product$")
    public void user_clicks_submit_post_with_tag_product() throws Throwable {

        addPostScreen.submitPostTag();
    }
}
