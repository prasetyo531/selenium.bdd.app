package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class ReviewListSteps extends DriverFactory {

    @And("^User clicks see more reviews on product detail$")
    public void user_clicks_see_more_reviews_on_product_detail() throws Throwable {
        //homeScreen.findAndCloseFloatingImg();
        homeScreen.clickProductCategory();
        productCategoryScreen.clickMenuSkincare();

        productListFilterSortScreen.clickFirstProduct();
        productDetailScreen.scrollFindSeeMoreReviews();
        productDetailScreen.clickSeeMoreReviews();
    }

    @When("^User clicks filter reviews$")
    public void user_clicks_filter_reviews() throws Throwable {

        reviewListScreen.getUsernameBeforeFilterSort();

        reviewListScreen.clickFilter();
        reviewListScreen.acceptanceElementFilterCheck();
        reviewListScreen.chooseFilterAgeRange();
        reviewListScreen.clickDoneFilter();

        reviewListScreen.clickFilter();
        reviewListScreen.clickResetFilter();

        reviewListScreen.chooseFilterSkinType();
        reviewListScreen.clickDoneFilter();
    }

    @And("^User clicks sort option by most likes$")
    public void user_clicks_sort_option_by_most_likes() throws Throwable {

        reviewListScreen.clickSort();
        reviewListScreen.chooseMostLikeSort();
    }

    @Then("^Reviews list will changed following sort and filter option$")
    public void reviews_list_will_changed_following_sort_and_filter_option() throws Throwable {

        reviewListScreen.getUsernameAfterFilterSort();
    }

}
