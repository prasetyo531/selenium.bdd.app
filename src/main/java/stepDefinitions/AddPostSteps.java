package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class AddPostSteps extends DriverFactory {

    @When("^User clicks add post from homescreen menu$")
    public void user_clicks_add_post_from_homescreen_menu() throws Throwable {

        homeScreen.clickAddPostHomeMenu();
    }

    @And("^User take picture to add post$")
    public void user_take_picture_to_add_post() throws Throwable {

        addPostScreen.capturePhoto();
    }

    @And("^User pick picture from gallery add post$")
    public void user_pick_picture_from_gallery_add_post() throws Throwable {

       addPostScreen.selectPhotoFromGallery();
    }

    @Then("^User enters caption of post$")
    public void user_enters_caption_of_post() throws Throwable {

        addPostScreen.fillCaption();
    }

    @Then("^User enters caption of post contains special char \"([^\"]*)\"$")
    public void user_enters_caption_of_post_contains_special_char_something(String caption) throws Throwable {

        addPostScreen.fillCustomCaption(caption);
    }

    @And("^User tag product and select by search product \"([^\"]*)\"$")
    public void user_tag_product_and_select_by_search_product_something(String search) throws Throwable {

        addPostScreen.clickTagProduct();
        addPostScreen.inputKeywordToSearch(search);
        addPostScreen.selectFirstResult();
        addPostScreen.checkNumProd();
    }

    @And("^User will see tagged product has reviewed already$")
    public void user_will_see_tagged_product_has_reviewed_already() throws Throwable {

       addPostScreen.checkNumRev();
    }

    @And("^User clicks submit post and choose not to skip tagging product$")
    public void user_clicks_submit_post_and_choose_not_to_skip_tagging_product() throws Throwable {

        addPostScreen.submitPostNoTag();
        addPostScreen.clickNoSkipTag();
    }

    @And("^User cancel to tag product$")
    public void user_cancel_to_tag_product() throws Throwable {

        addPostScreen.clickTagProduct();
        addPostScreen.cancelTag();
    }

    @When("^User click back to cancel add post$")
    public void user_click_back_to_cancel_add_post() throws Throwable {

        addPostScreen.cancelPost();
    }

    @Then("^User will direct to product list screen to tag product$")
    public void user_will_direct_to_product_list_screen_to_tag_product() throws Throwable {

        addPostScreen.waitProductList();
    }

    @And("^User clicks submit post and choose yes to skip tagging product$")
    public void user_clicks_submit_post_and_choose_yes_to_skip_tagging_product() throws Throwable {

        addPostScreen.submitPostNoTag();
        addPostScreen.clickSkipTag();
    }

    @Then("^User will direct to feed where last post is at most top$")
    public void user_will_direct_to_feed_where_last_post_is_at_most_top() throws Throwable {

        feedScreen.checkIsOnFeedAfterPost();
    }

    @And("^User tag product and select from popular product$")
    public void user_tag_product_and_select_from_popular_product() throws Throwable {

        addPostScreen.clickTagProduct();
        addPostScreen.chooseFirstPopularProduct();
        addPostScreen.checkNumProd();
    }

    @And("^User tag multiple product and select by search product \"([^\"]*)\"$")
    public void user_tag_multiple_product_and_select_by_search_product_something(String search) throws Throwable {

        addPostScreen.clickTagProduct();
        addPostScreen.inputKeywordToSearch(search);
        addPostScreen.chooseTwoPopularProduct();
        addPostScreen.checkLabelMultipleTag();
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
        addPostScreen.checkNumRev();
    }

    @And("^User add review all product in tag$")
    public void user_add_review_all_product_in_tag() throws Throwable {

        addPostScreen.checkNumRev();
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

        addPostScreen.chooseSecondTaggedProduct();

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
        addPostScreen.checkLabelMultipleReview();
    }

    @And("^User clicks submit post with tag product$")
    public void user_clicks_submit_post_with_tag_product() throws Throwable {

        addPostScreen.submitPostTag();
    }

    @Then("^User will see confirm modal to cancel add post$")
    public void user_will_see_confirm_modal_to_cancel_add_post() throws Throwable {

        addPostScreen.getTextModalAddPost();
        addPostScreen.yesCancelPost();
        addPostScreen.isCameraScreen();
    }

    @And("^User clicks discover from homescreen menu and select post$")
    public void user_clicks_discover_from_homescreen_menu_and_select_post() throws Throwable {

        homeScreen.clickDiscoverHomeMenu();
        discoverScreen.clickFirstPost();
    }
}
