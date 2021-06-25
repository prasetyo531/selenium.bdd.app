package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class AddReviewSteps extends DriverFactory {

    @Given("^User open profile then see add review button on review tab$")
    public void user_open_profile_then_see_add_review_button_on_review_tab() {

        homeScreen.clickProfileHomeMenu();
        profileScreen.clickReviewsTab();
        profileScreen.isButtonAddPostReviewAppear();
        profileScreen.clickButtonAddPostReviewAppear();
    }

    @Given("^User clicks menu category from homescreen menu$")
    public void user_clicks_menu_category_from_homescreen_menu() throws Throwable {

        //homeScreen.findAndCloseFloatingImg();
        homeScreen.clickProductCategory();
    }

    @When("^User clicks one of category to find product$")
    public void user_clicks_one_of_category_to_find_product() throws Throwable {

        productCategoryScreen.clickRandomMenuProductCat();
    }

    @Given("^User clicks add review from homescreen menu$")
    public void user_clicks_add_review_from_homescreen_menu() throws Throwable {

        homeScreen.clickAddReviewHomeMenu();
    }

    @When("^User search \"([^\"]*)\" and select product from popular product to review$")
    public void user_search_something_and_select_product_from_popular_product_to_review(String product) {

        addReviewScreen.inputKeywordSearch(product);
        addReviewScreen.chooseFirstPopularProduct();
    }

    @When("^User clicks one of popular product to review$")
    public void User_clicks_one_of_popular_product_to_review() throws Throwable {

        addReviewScreen.chooseFirstPopularProduct();
    }

    @When("^User clicks second of popular product to review$")
    public void User_clicks_second_of_popular_product_to_review() throws Throwable {

        addReviewScreen.chooseSecondPopularProduct();
    }

    @When("^User clicks third popular product to review$")
    public void User_clicks_third_popular_product_to_review() throws Throwable {

        addReviewScreen.chooseThirdPopularProduct();
    }

    @When("^User clicks fourth of popular product to review$")
    public void User_clicks_fourth_of_popular_product_to_review() throws Throwable {

        addReviewScreen.chooseFourthPopularProduct();
    }

    @When("^User clicks fifth of popular product to review$")
    public void User_clicks_fifth_of_popular_product_to_review() throws Throwable {

        addReviewScreen.chooseFifthPopularProduct();
    }

    @And("^User will clicks one of product on product category screen$")
    public void user_will_clicks_one_of_product_on_product_category_screen() throws Throwable {

        productListScreen.clickFirstProduct();
    }

    @When("^User clicks add review button on product detail screen$")
    public void user_clicks_add_review_button_on_product_detail_screen() {

        productDetailScreen.clickAddReviewBtn();
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

    @And("^User choose new purchase point product \"([^\"]*)\"$")
    public void user_choose_new_purchase_point_product_something(String sourceproduct) throws Throwable {

        addReviewScreen.inputNoneAbove(sourceproduct);
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

    @Then("^User will see congrats screen and direct to review detail$")
    public void User_will_see_congrats_screen_and_direct_to_review_detail() throws Throwable {

        addReviewScreen.clickSeeMyReview();
    }

    @Then("^User will see congrats screen and direct to review detail from product detail$")
    public void User_will_see_congrats_screen_and_direct_to_review_detail_from_product_detail() throws Throwable {

        addReviewScreen.clickSeeMyReview();
        productDetailScreen.checkIsOnProductDetailAfterReview();
    }

    //edit step
    @When("^User clicks previous screen until rating screen$")
    public void user_clicks_previous_screen_until_rating_screen() throws Throwable {

        addReviewScreen.clickPrevScreen();
        addReviewScreen.clickPrevScreen();
        addReviewScreen.clickPrevScreen();
    }

    @Then("^User edit choose overall rating$")
    public void user_edit_choose_overall_rating() throws Throwable {

        addReviewScreen.editRatingAddReview();
    }

    @And("^User edit choose usage periode product$")
    public void user_edit_choose_usage_periode_product() throws Throwable {

        addReviewScreen.editStepperDurationofUser();
    }

    @And("^User edit choose purchase point product$")
    public void user_edit_choose_purchase_point_product() throws Throwable {

        addReviewScreen.clickMultibrandStore();
        addReviewScreen.setMetro();
    }

    @And("^User edit choose would recommend this product$")
    public void user_edit_choose_would_recommend_this_product() throws Throwable {

        addReviewScreen.chooseNegativeRecommendation();
    }

    @And("^User edit review box that should contain than 200 char$")
    public void user_edit_review_box_that_should_contain_than_200_char() throws Throwable {

        addReviewScreen.editReview();
    }

    @Then("^User will see congrats screen and review detail inputed last condition$")
    public void user_will_see_congrats_screen_and_review_detail_inputed_last_condition() throws Throwable {

        //checking last edited
        addReviewScreen.clickSeeMyReview();
        addReviewScreen.compareFieldReview();
    }

    @And("^Fill all field then submit add review$")
    public void fill_all_field_then_submit_add_review() throws Throwable {

        addReviewScreen.fillRatingAddReview();
        addReviewScreen.setStepperDurationofUser();

        addReviewScreen.clickEcommerce();
        addReviewScreen.setTokopedia();

        addReviewScreen.choosePositiveRecommendation();
        addReviewScreen.writeReview();

        addReviewScreen.clickSubmitReview();
    }

    @Then("^User would directed to product detail screen$")
    public void user_would_directed_to_product_detail_screen() throws Throwable {

        productDetailScreen.verifyProductDetail();
    }

}
