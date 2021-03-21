package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class ProductSteps extends DriverFactory {

    @Given("^User clicks menu product category from homescreen menu$")
    public void user_clicks_menu_product_category_from_homescreen_menu() {
        //homeScreen.findAndCloseFloatingImg();
        homeScreen.clickProductCategory();
    }

    @When("^User input \"([^\"]*)\" on search bar$")
    public void user_input_something_on_search_bar(String productname) throws InterruptedException {
        productCategoryScreen.clickInputSearchBar(productname);
    }

    @Then("^User will see search result of product$")
    public void user_will_see_search_result_of_product() {
        productCategoryScreen.isSearchResultAppear();
    }

    @When("^User tap any product from search result$")
    public void user_tap_any_product_from_search_result() {
        productCategoryScreen.clickFirstProductSearchResult();
    }

    @Then("^User will direct to product detail screen$")
    public void user_will_direct_to_product_detail_screen() {
        productDetailScreen.verifyProductDetail();
    }

    @When("^User click back from product detail$")
    public void user_click_back_from_product_detail() {
        productDetailScreen.clickBack();
    }

    @Then("^User will see search result and condition state$")
    public void user_will_see_search_result_and_condition_state() {
        productCategoryScreen.isSearchBarActive();
        productCategoryScreen.isSearchResultAppear();
    }

    @When("^User tap product without review from search result$")
    public void user_tap_product_without_review_from_search_result() {
        productCategoryScreen.clickFirstProductSearchResult();
    }

    @Then("^User will see wording be the first to review this product$")
    public void user_will_see_wording_be_the_first_to_review_this_product() {
        productDetailScreen.verifyFirstReview();
    }

}
