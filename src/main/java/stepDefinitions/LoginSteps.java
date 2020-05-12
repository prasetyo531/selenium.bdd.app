package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class LoginSteps extends DriverFactory {

    @Then("^user enters the \"([^\"]*)\" phonenumber to login$")
    public void user_enters_the_something_phonenumber_to_login(String phonenumber) throws Throwable {

        loginScreen.inputUsrEmailPhoneName(phonenumber);
    }

    @And("^user clicks next button on login screen$")
    public void user_clicks__next_button_on_login_screen() throws Throwable {

        loginScreen.clickNext();
    }

    @When("^user input correct otp from phone on otp screen to login$")
    public void user_input_correct_otp_from_phone_on_otp_screen_to_login() throws Throwable {

        otpScreen.clickAllowReadMsg();
        otpScreen.comparePhoneReceiver();
        otpScreen.clickConfirmOtp();
    }

}
