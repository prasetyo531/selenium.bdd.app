package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class LoginSteps extends DriverFactory {

    //***   Login without input password   ****//
    @Then("^user enters the \"([^\"]*)\" phonenumber to login$")
    public void user_enters_the_something_phonenumber_to_login(String phonenumber) throws Throwable {

        loginScreen.inputUsrEmailPhoneName(phonenumber);
    }

    //***   Login input password   ****//
    @Then("^user enters the \"([^\"]*)\" username on login screen$")
    public void user_enters_the_something_username_on_login_screen(String username) throws Throwable {

        loginScreen.inputUsrEmailPhoneName(username);
    }

    @And("^user enters the \"([^\"]*)\" password on login screen$")
    public void user_enters_the_something_password_on_login_screen(String password) throws Throwable {

        loginScreen.inputPassword(password);
    }

    @And("^user clicks next button on login screen$")
    public void user_clicks__next_button_on_login_screen() throws Throwable {

        loginScreen.clickNext();
    }

    @And("^user clicks login button on login screen$")
    public void user_clicks_login_button_on_login_screen() throws Throwable {

        loginScreen.clickNext();
    }

    @When("^user input correct otp from phone on otp screen from android to login$")
    public void user_input_correct_otp_from_phone_on_otp_screen_from_android_to_login() throws Throwable {

        otpScreen.clickAllowReadMsg();
        otpScreen.comparePhoneReceiver();
        otpScreen.clickConfirmOtp();
    }

    @When("^user input correct otp from phone on otp screen from ios to login$")
    public void user_input_correct_otp_from_phone_on_otp_screen_from_ios_to_login() throws Throwable {

        otpScreen.clickAllowReadMsgIos();
        //otpScreen.comparePhoneReceiverIos();
        otpScreen.clickConfirmOtpIos();
    }


}
