package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class LoginSteps extends DriverFactory {

    @Then("^User input \"([^\"]*)\" username and \"([^\"]*)\" password$")
    public void user_input_something_username_and_something_password(String username, String password) throws Throwable {

        loginScreen.inputusername(username);
        loginScreen.inputpassword(password);
    }

    @When("^User click login button on login screen$")
    public void user_click_login_button_on_login_screen() throws Throwable {

        loginScreen.clickLogin();
    }


    @Then("^User should be directed to homescreen$")
    public void User_should_be_directed_to_homescreen() throws Throwable {

        homeScreen.verifyHomescreen();
    }

    @And("^User can see product matches$")
    public void user_can_see_product_matches() throws Throwable {

        homeScreen.verifyProductMatches();
    }

}
