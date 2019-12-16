package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class LoginSteps extends DriverFactory {

    @Then("^User directed to login screen$")
    public void User_directed_to_login_screen() throws Throwable {
        throw new PendingException();
    }

    @Then("^User input the \"([^\"]*)\" username$")
    public void User_input_the_something_username(String username) throws Throwable {

        androidLoginScreen.inputusername(username);
    }

    @And("^User input the \"([^\"]*)\" password$")
    public void User_input_the_something_password(String password) throws Throwable {

        androidLoginScreen.inputpassword(password);
    }

    @When("^User click login button on login screen$")
    public void user_click_login_button_on_login_screen() throws Throwable {

        androidLoginScreen.clickLogin();
    }


    @Then("^User should be directed to homepage$")
    public void User_should_be_directed_to_homepage() throws Throwable {
        throw new PendingException();
    }

}
