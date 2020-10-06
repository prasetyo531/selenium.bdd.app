package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class RegisterSteps extends DriverFactory {

    @Then("^User enters the \"([^\"]*)\" phonenumber to register$")
    public void User_enters_the_something_phonenumber_to_register(String phonenumber) throws Throwable {

        registerScreen.inputUsrEmailPhoneName(phonenumber);
    }

    @Then("^user enters the \"([^\"]*)\" email to register$")
    public void user_enters_the_something_email_to_register(String phonenumber) throws Throwable {

        registerScreen.inputUsrEmailPhoneName(phonenumber);
    }

    @And("^User clicks next button on register screen$")
    public void User_clicks_next_button_on_register_screen() throws Throwable {

        registerScreen.clickNext();
    }

    //error msg underfield
    @Then("^display msg \"([^\"]*)\" is displayed under phone number field$")
    public void display_msg_something_is_displayed_under_phone_number_field(String msg) throws Throwable {

        registerScreen.assertTextWarningLogin(msg);
    }

    @When("^user input correct otp from phone on otp screen to register$")
    public void user_input_correct_otp_from_phone_on_otp_screen_to_register() throws Throwable {

        otpScreen.comparePhoneReceiver();
        otpScreen.clickAllowReadMsg();
        otpScreen.clickConfirmOtp();
    }

    @When("^user input bypass otp from phone on otp screen to register$")
    public void user_input_bypass_otp_from_phone_on_otp_screen_to_register() throws Throwable {

        otpScreen.getCounter();
        otpScreen.comparePhoneReceiver();
        otpScreen.fillByPassOtp();
        otpScreen.clickConfirmOtp();
    }

    @Then("^user will direct to otp screen from phone to register$")
    public void user_will_direct_to_otp_screen_from_phone_to_register() throws Throwable {

        otpScreen.comparePhoneReceiver();
    }

    @Then("^user will direct to otp screen from email to register$")
    public void user_will_direct_to_otp_screen_from_email_to_register() throws Throwable {

        otpScreen.compareEmailReceiver();
    }

    @When("^user input correct otp from phone on otp screen from ios to register$")
    public void user_input_correct_otp_from_phone_on_otp_screen_from_ios_to_register() throws Throwable {

        //otpScreen.comparePhoneReceiver();
        otpScreen.clickAllowReadMsg();
        otpScreen.clickConfirmOtp();
    }

    //complete account
    @Then("^user enters the \"([^\"]*)\", \"([^\"]*)\", password and select dob to register$")
    public void user_enters_the_something_something_password_and_select_dob_to_register(String email, String username) throws Throwable {

        completeAccountScreen.inputEmail(email);
        completeAccountScreen.inputUsername(username);
        completeAccountScreen.inputPassword();
        completeAccountScreen.inputBirthday();
    }

    @And("^user clicks submit button on complete account screen$")
    public void user_clicks_submit_button_on_complete_account_screen() throws Throwable {

        completeAccountScreen.clickSubmitCompleteAccount();
    }

    //modal register
    @Then("^show modal identify your phone number android$")
    public void show_modal_identify_your_phone_number_android() throws Throwable {

        registerScreen.errorTitlePhoneNumberNotVerifiedModal();
        registerScreen.errorDescPhoneNumberNotVerifiedModal();
    }

    @Then("^show modal identify your phone number ios$")
    public void show_modal_identify_your_phone_number_ios() throws Throwable {

        registerScreen.errorTitlePhoneNumberNotVerifiedModal();
    }

    @Then("^show modal verified phone number android$")
    public void show_modal_verified_phone_number_android() throws Throwable {

        registerScreen.errorTitlePhoneNumberIsVerifiedModal();
        registerScreen.errorDescPhoneNumberIsVerifiedModal();
    }

    @Then("^show modal email has been registered$")
    public void show_email_has_been_registered() throws Throwable {

        registerScreen.errorTitleEmailIsVerifiedModal();
        registerScreen.errorDescEmailIsVerifiedModal();
    }

    @Then("^show modal verified email android$")
    public void show_modal_verified_email_android() throws Throwable {

        registerScreen.errorTitleEmailIsVerifiedModal();
        registerScreen.errorDescEmailIsVerifiedModal();
    }

    @Then("^show modal verified phone number ios$")
    public void show_modal_verified_phone_number_ios() throws Throwable {

        registerScreen.errorTitlePhoneNumberIsVerifiedModalIos();
    }


}
