package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class LoginSteps extends DriverFactory {

    @Then("^user enters the \"([^\"]*)\" phonenumber$")
    public void user_enters_the_something_phonenumber(String phonenumber) throws Throwable {

        loginScreen.usrEmailPhoneName(phonenumber);

    }

    @And("^user clicks on the next button$")
    public void user_clicks_on_the_next_button() throws Throwable {

        loginScreen.clickNext();
    }

    @When("^user input correct otp on otp screen to login$")
    public void user_input_correct_otp_on_otp_screen_to_login() throws Throwable {

        otpScreen.clickAllowReadMsg();
        otpScreen.compareTextReceiver();
        otpScreen.clickConfirmOtp();
    }

}
