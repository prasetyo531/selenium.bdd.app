package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class BrandSteps extends DriverFactory {

    @Given("^User clicks menu all brand from homescreen menu$")
    public void user_clicks_menu_all_brand_from_homescreen_menu() {
        //homeScreen.findAndCloseFloatingImg();
        homeScreen.scrollClickMenuAppToAllBrands();
    }

    @When("^User clicks one of popular brand to find product$")
    public void user_clicks_one_of_popular_brand_to_find_product() {
        brandScreen.checkBrandScreen();
        brandScreen.clickOnePopularBrand();
    }

    @Then("^User will see product list of brand$")
    public void user_will_see_product_list_of_brand() {
        brandScreen.scrollProductBrandDetail();
    }

    @When("^User click brand name on product detail$")
    public void userClickBrandNameOnProductDetail() {
        productDetailScreen.clickBrandName();
    }

    @Then("^User will directed to brand screen \"([^\"]*)\"$")
    public void userWillDirectedToBrandScreen(String brandname)  {
        // Write code here that turns the phrase above into concrete actions
        brandScreen.getTitleBrandScreen(brandname);
    }
}
