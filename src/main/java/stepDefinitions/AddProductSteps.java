package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class AddProductSteps extends DriverFactory {

    @Given("^User clicks add product from homescreen menu$")
    public void user_clicks_add_product_from_homescreen_menu() throws Throwable {

        homeScreen.clickAddProductHomeMenu();
    }

    @When("^User fill all field on add product screen \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_fill_all_field_on_add_product_screen_something_and_something(String productname, String productshade) throws Throwable {

        addProductScreen.clickImSureDrawer();

        addProductScreen.chooseBrandName();
        addProductScreen.chooseProdCat();
        addProductScreen.fillProductName(productname);
        addProductScreen.fillProductShade(productshade);
        addProductScreen.fillProductDesc();
        addProductScreen.fillProductPrice();
        //addProductScreen.fillProductTags();
    }

    @And("^User take picture to add product$")
    public void user_take_picture_to_add_product() throws Throwable {

        addProductScreen.capturePhoto();
    }

    @When("^User clicks submit add product$")
    public void user_clicks_submit_add_product() throws Throwable {

        addProductScreen.submitAddProduct();
    }

    @Then("^User will see drawer have same detail$")
    public void user_will_see_drawer_have_same_detail() throws Throwable {

        addProductScreen.checkDrawer();

        addProductScreen.isBrandSame();
        addProductScreen.isProdNameSame();
        addProductScreen.isProdShadeSame();
    }
}
