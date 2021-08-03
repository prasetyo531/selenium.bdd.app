package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.ActionBase;
import utils.DriverFactory;

public class FilterSteps extends DriverFactory {

    @When("^User apply filter on category skincare$")
    public void user_apply_filter_on_category_skincare() {
        homeScreen.clickProductCategory();
        productCategoryScreen.clickMenuSkincare();
    }

    @And("^User choose filter mybeautyId, rating, skin type, skin concern, brand$")
    public void user_choose_filter_mybeautyid_rating_skin_type_skin_concern_brand() {
        productListFilterSortScreen.getTotalRatingBeforeFilter();
        productListFilterSortScreen.clickFilterChooseAllOption();
    }

    @Then("^User will see product list changed$")
    public void user_will_see_product_list_changed() {
        productListFilterSortScreen.getTotalRatingAfterFilter();
    }

    @When("^User clicks reset filter$")
    public void user_clicks_reset_filter() {
        productListFilterSortScreen.clickResetFilterAndDone();
    }

    @Then("^User will see default product list$")
    public void user_will_see_default_product_list() {
        productListFilterSortScreen.getTotalRatingAfterResetFilter();
    }

}
