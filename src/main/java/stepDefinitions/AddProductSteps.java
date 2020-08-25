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

    @When("^User fill all field on add product screen \"([^\"]*)\"$")
    public void user_fill_all_field_on_add_product_screen_something(String productname) throws Throwable {

        addProductScreen.clickImSureDrawer();

        addProductScreen.chooseBrandName();
        addProductScreen.chooseProdCat();
        addProductScreen.fillProductName(productname);
        addProductScreen.fillProductDesc();
        addProductScreen.fillProductPrice();
    }

    @When("^User fill all field on add product screen and select brand by search \"([^\"]*)\"$")
    public void user_fill_all_field_on_add_product_screen_and_select_brand_by_search_something(String brand) throws Throwable {

        addProductScreen.clickImSureDrawer();

        addProductScreen.chooseBrandName(brand);
        addProductScreen.chooseProdCat();
        addProductScreen.fillProductName();
        addProductScreen.fillProductShade();
        addProductScreen.fillProductDesc();
        addProductScreen.fillProductPrice();
    }

    @And("^User take picture to add product$")
    public void user_take_picture_to_add_product() throws Throwable {

        addProductScreen.capturePhoto();
    }

    @And("^User select image to add product$")
    public void user_select_image_to_add_product() throws Throwable {

        addProductScreen.choosePhotoFromGallery();
    }

    @When("^User change brand name$")
    public void user_change_brand_name() throws Throwable {

        addProductScreen.scrollToTop();

        addProductScreen.editSelectedBrandName();
    }

    @And("^User change product category$")
    public void user_change_product_category() throws Throwable {

        addProductScreen.editSelectedProductCat();
    }

    @And("^User input to change product name \"([^\"]*)\"$")
    public void user_input_to_change_product_name_something(String changeproductname) throws Throwable {

        addProductScreen.editInputedProductName(changeproductname);
    }

    @When("^User clicks submit add product$")
    public void user_clicks_submit_add_product() throws Throwable {

        addProductScreen.submitAddProduct();
    }

    @When("^User clicks submit edit add product$")
    public void user_clicks_submit_edit_add_product() throws Throwable {

        addProductScreen.scrollToBottom();
        addProductScreen.submitAddProduct();
    }

    @Then("^User will see drawer have same detail$")
    public void user_will_see_drawer_have_same_detail() throws Throwable {

        addProductScreen.checkDrawer();

        addProductScreen.isBrandSame();
        addProductScreen.isProdNameSame();
        addProductScreen.isProdShadeSame();
    }

    @When("^User clicks add review button after add product submitted$")
    public void user_clicks_add_review_button_after_add_product_submitted() throws Throwable {

        addProductScreen.clickReview();
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

    @Then("^User will see toast msg to fill product name in format$")
    public void user_will_see_toast_msg_to_fill_product_name_in_format() throws Throwable {

        addProductScreen.okErrorShouFillProductNameLessThan3MoreThan100();
    }

    @Then("^User will see drawer have updated detail$")
    public void user_will_see_drawer_have_updated_detail() throws Throwable {

        addProductScreen.checkDrawer();

        addProductScreen.isBrandSame();
        addProductScreen.isProdNameSame();
    }
}
