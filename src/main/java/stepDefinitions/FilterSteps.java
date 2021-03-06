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

    @When("^User apply filter on category lipstick$")
    public void user_apply_filter_on_category_lipstick() {
        homeScreen.clickProductCategory();
        productCategoryScreen.clickMenuMakeUpLipstick();
    }

    @And("^User choose filter brand and shade$")
    public void user_choose_filter_brand_and_shade() {
        productListFilterSortScreen.getTotalProductBeforeFilter();
        productListFilterSortScreen.clickFilterChooseBrandAndShade();
    }

    @And("^User choose filter mybeautyId, rating, skin type, skin concern, brand$")
    public void user_choose_filter_mybeautyid_rating_skin_type_skin_concern_brand() {
        productListFilterSortScreen.getTotalProductBeforeFilter();
        productListFilterSortScreen.clickFilterChooseAllOption();
    }

    @Then("^User will see not found result$")
    public void user_will_see_not_found_result() {
        productListFilterSortScreen.isResultNotFoundAppear();
    }

    @Then("^User will see product list changed$")
    public void user_will_see_product_list_changed() {
        productListFilterSortScreen.getTotalProductAfterFilter();
    }

    @When("^User clicks reset filter$")
    public void user_clicks_reset_filter() {
        productListFilterSortScreen.clickResetFilterAndDone();
    }

    @Then("^User will see default product list$")
    public void user_will_see_default_product_list() {
        productListFilterSortScreen.getTotalProductAfterResetFilter();
    }

    @And("^User choose filter brand and shade then close filter$")
    public void user_choose_filter_brand_and_shade_then_close_filter() {
        productListFilterSortScreen.getTotalProductBeforeFilter();
        productListFilterSortScreen.clickCloseFilterChooseBrandAndShade();
    }

    @When("^User apply sort newest$")
    public void user_apply_sort_newest() {
        productListFilterSortScreen.getFirstProductBeforeSort();
        productListFilterSortScreen.clickSortNewest();
    }

    @And("^User scroll list product then apply sort$")
    public void user_scroll_list_product_then_apply_sort() {
        productListFilterSortScreen.scrollList();
        productListFilterSortScreen.clickSortNewest();
    }

    @Then("^User will see product list not changed$")
    public void user_will_see_product_list_not_changed() {
        productListFilterSortScreen.getTotalProductAfterClose();
    }

    @And("^User choose filter shade$")
    public void user_choose_filter_shade() {
        productListFilterSortScreen.getTotalProductBeforeFilter();
        productListFilterSortScreen.clickFilterChooseShade();
    }

    @Then("^User will see list product sort from newest$")
    public void user_will_see_list_product_sort_from_newest() {
        productListFilterSortScreen.getFirstProductAfterSort();
    }
}
