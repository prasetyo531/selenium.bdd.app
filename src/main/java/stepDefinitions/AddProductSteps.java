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

    @When("^User fill all field on add product screen \"([^\"]*)\" and \"([^\"]*)\" except brand name$")
    public void user_fill_all_field_on_add_product_screen_something_and_something_except_brand_name(String productname, String productshade) throws Throwable {

        addProductScreen.clickImSureDrawer();

        addProductScreen.chooseProdCat();
        addProductScreen.fillProductName(productname);
        addProductScreen.fillProductShade(productshade);
        addProductScreen.fillProductDesc();
        addProductScreen.fillProductPrice();
    }

    @When("^User fill all field on add product screen \"([^\"]*)\" and \"([^\"]*)\" except category$")
    public void user_fill_all_field_on_add_product_screen_something_and_something_except_category(String productname, String productshade) throws Throwable {

        addProductScreen.clickImSureDrawer();

        addProductScreen.chooseBrandName();
        addProductScreen.fillProductName(productname);
        addProductScreen.fillProductShade(productshade);
        addProductScreen.fillProductDesc();
        addProductScreen.fillProductPrice();
    }

    @When("^User fill all field on add product screen \"([^\"]*)\" except product name$")
    public void user_fill_all_field_on_add_product_screen_something_except_product_name(String productshade) throws Throwable {

        addProductScreen.clickImSureDrawer();

        addProductScreen.chooseBrandName();
        addProductScreen.chooseProdCat();
        addProductScreen.fillProductShade(productshade);
        addProductScreen.fillProductDesc();
        addProductScreen.fillProductPrice();
        //addProductScreen.fillProductTags();
    }

    @And("^User take picture to add product$")
    public void user_take_picture_to_add_product() throws Throwable {

        addProductScreen.capturePhoto();
    }

    @And("^User select image to add product$")
    public void user_select_image_to_add_product() throws Throwable {

        addProductScreen.choosePhotoFromGallery();
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

    /* error step */
    @Then("^User will see error popup for not using image to add product$")
    public void user_will_see_error_popup_for_not_using_image_to_add_product() throws Throwable {

        addProductScreen.okErrorShouldUsingImg();
    }

    @Then("^User will see toast msg to select brand name$")
    public void user_will_see_toast_msg_to_select_brand_name() throws Throwable {

        addProductScreen.okErrorShouldChooseBrandName();
    }

    @Then("^User will see toast msg to select category$")
    public void user_will_see_toast_msg_to_select_category() throws Throwable {

        addProductScreen.okErrorShouldChooseProductCategory();
    }

    @Then("^User will see toast msg to fill product name$")
    public void user_will_see_toast_msg_to_fill_product_name() throws Throwable {

        addProductScreen.okErrorShouldChooseProductName();
    }
}
