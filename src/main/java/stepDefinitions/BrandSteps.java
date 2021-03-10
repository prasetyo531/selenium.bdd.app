package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class BrandSteps extends DriverFactory {

    @Given("^User clicks menu all brand from homescreen menu$")
    public void user_clicks_menu_all_brand_from_homescreen_menu() throws Throwable {
        //homeScreen.findAndCloseFloatingImg();
        homeScreen.scrollClickMenuAppToAllBrands();
    }

    @When("^User clicks one of popular brand to find product$")
    public void user_clicks_one_of_popular_brand_to_find_product() throws Throwable {
        brandScreen.checkBrandScreen();
        brandScreen.clickOnePopularBrand();
    }

    @Then("^User will see product list of brand$")
    public void user_will_see_product_list_of_brand() throws Throwable {
        brandScreen.scrollProductBrandDetail();
    }
}
