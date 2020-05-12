package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class RegisterSteps extends DriverFactory {

    @Then("^user enters the \"([^\"]*)\" phonenumber to register$")
    public void user_enters_the_something_phonenumber_to_register(String phonenumber) throws Throwable {

        registerScreen.inputUsrEmailPhoneName(phonenumber);
    }

    @And("^user clicks next button on register screen$")
    public void user_clicks_next_button_on_register_screen() throws Throwable {

        registerScreen.clickNext();
    }

    @When("^user input correct otp from phone on otp screen to register$")
    public void user_input_correct_otp_from_phone_on_otp_screen_to_register() throws Throwable {

        otpScreen.clickAllowReadMsg();
        otpScreen.comparePhoneReceiver();
        otpScreen.clickConfirmOtp();
    }
}
