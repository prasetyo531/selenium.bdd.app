package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class RegisterSteps extends DriverFactory {

    @Then("^User enters the \"([^\"]*)\" to register$")
    public void user_enters_the_something_to_register(String auth) throws Throwable {

        registerScreen.inputUsrEmailPhoneName(auth);
    }

    @Then("^User enters the \"([^\"]*)\" phonenumber to register$")
    public void User_enters_the_something_phonenumber_to_register(String phonenumber) throws Throwable {

        registerScreen.inputUsrEmailPhoneName(phonenumber);
    }

    @Then("^User enters the \"([^\"]*)\" email to register$")
    public void User_enters_the_something_email_to_register(String email) throws Throwable {

        registerScreen.inputUsrEmailPhoneName(email);
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

    //otp screen
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

    @When("^user input bypass otp from email on otp screen to register$")
    public void user_input_bypass_otp_from_email_on_otp_screen_to_register() throws Throwable {

        otpScreen.getCounter();
        otpScreen.compareEmailReceiver();
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

    @When("^User clicks tap to change auth and input email \"([^\"]*)\"$")
    public void user_clicks_tap_to_change_auth_and_input_email_something(String email) throws Throwable {

        otpScreen.comparePhoneReceiver();
        otpScreen.tapToChangeFromPhoneToEmail();

        registerScreen.inputUsrEmailPhoneName(email);
        registerScreen.clickNext();
    }

    @When("^User clicks tap to change auth and input phone \"([^\"]*)\"$")
    public void user_clicks_tap_to_change_auth_and_input_phone_something(String email) throws Throwable {

        otpScreen.compareEmailReceiver();
        otpScreen.tapToChangeFromPhoneToEmail();

        registerScreen.inputUsrEmailPhoneName(email);
        registerScreen.clickNext();
    }

    @Then("^User direct to verify email screen$")
    public void user_direct_to_verify_email_screen() throws Throwable {

        otpScreen.compareEmailReceiver();
    }

    @Then("^User direct to verify phone screen$")
    public void user_direct_to_verify_phone_screen() throws Throwable {

        otpScreen.comparePhoneReceiver();
    }

    @When("^user input correct otp from phone on otp screen from ios to register$")
    public void user_input_correct_otp_from_phone_on_otp_screen_from_ios_to_register() throws Throwable {

        //otpScreen.comparePhoneReceiver();
        otpScreen.clickAllowReadMsg();
        otpScreen.clickConfirmOtp();
    }

    @When("^User input wrong otp code$")
    public void user_input_wrong_otp_code() throws Throwable {

        otpScreen.getCounter();
        otpScreen.fillWrongOtp();
        otpScreen.clickConfirmOtp();
    }

    @When("^User input wrong otp code after suspended$")
    public void user_input_wrong_otp_code_after_suspended() throws Throwable {

        otpScreen.getLabelToResendCode();
        otpScreen.fillWrongOtp();
        otpScreen.clickConfirmOtp();
    }

    @Then("^Display error msg \"([^\"]*)\"$")
    public void display_error_msg_something(String msg) throws Throwable {

        otpScreen.assertTextErrorOtp(msg);
    }

    @Then("^Display error msg suspend \"([^\"]*)\"$")
    public void display_error_msg_suspend_something(String msg) throws Throwable {

        otpScreen.assertTextErrorSuspendOtp(msg);
    }

    @When("^User click resend code$")
    public void user_click_resend_code() throws Throwable {

        otpScreen.clickResendCode();
    }

    @When("^User click resend code 4 times$")
    public void user_click_resend_code_4_times() throws Throwable {

        Thread.sleep(31000);
        otpScreen.clickResendCode();
        Thread.sleep(31000);
        otpScreen.clickResendCode();
        Thread.sleep(31000);
        otpScreen.clickResendCode();
        Thread.sleep(31000);
        otpScreen.clickResendCode();
        System.out.println("so status will be suspend");
    }

    @Then("^Error msg will stay still$")
    public void error_msg_will_stay_still() throws Throwable {

        otpScreen.assertErrorOtpAfterResendCode();
    }

    @When("^user input bypass otp on otp screen to register$")
    public void user_input_bypass_otp_on_otp_screen_to_register() throws Throwable {

        otpScreen.fillByPassOtp();
        otpScreen.clickConfirmOtp();
    }

    //complete account
    @Then("^user enters the \"([^\"]*)\", \"([^\"]*)\", password and select dob to register by phone$")
    public void user_enters_the_something_something_password_and_select_dob_to_register_by_phone(String email, String username) throws Throwable {

        completeAccountScreen.inputEmail(email);
        completeAccountScreen.inputUsername(username);
        completeAccountScreen.inputPassword();
        completeAccountScreen.inputBirthday();
    }

    @Then("^user enters the \"([^\"]*)\", \"([^\"]*)\", password and select dob to register by email$")
    public void user_enters_the_something_something_password_and_select_dob_to_register_by_email(String phone, String username) throws Throwable {

        completeAccountScreen.inputPhone(phone);
        completeAccountScreen.inputUsername(username);
        completeAccountScreen.inputPassword();
        completeAccountScreen.inputBirthday();
    }

    @Then("^user enters the \"([^\"]*)\", \"([^\"]*)\", password and select dob but input incorrect format email$")
    public void user_enters_the_something_something_password_and_select_dob_but_input_incorrect_format_email(String email, String username) throws Throwable {

        completeAccountScreen.inputEmail(email);
        completeAccountScreen.inputUsername(username);
        completeAccountScreen.inputPassword();
        completeAccountScreen.inputBirthday();
    }

    @Then("^User will see error msg \"([^\"]*)\" underneath email field$")
    public void user_will_see_error_msg_something_underneath_email_field(String errormsg) throws Throwable {

        completeAccountScreen.getErrorMsg(errormsg);
    }

    @Then("^User will see error msg \"([^\"]*)\" underneath username field$")
    public void user_will_see_error_msg_something_underneath_username_field(String errormsg) throws Throwable {

        completeAccountScreen.getErrorMsg(errormsg);
    }

    @Then("^User will see error msg \"([^\"]*)\" underneath password field$")
    public void user_will_see_error_msg_something_underneath_password_field(String errormsg) throws Throwable {

        completeAccountScreen.getErrorMsg(errormsg);
    }

    @And("^user clicks submit button on complete account screen$")
    public void user_clicks_submit_button_on_complete_account_screen() throws Throwable {

        completeAccountScreen.clickSubmitCompleteAccount();
    }

    @Then("^user enters the \"([^\"]*)\", \"([^\"]*)\", but fill \"([^\"]*)\" same with username to register by phone$")
    public void user_enters_the_something_something_but_fill_something_same_with_username_to_register_by_phone(String email, String username, String password) throws Throwable {

        completeAccountScreen.inputEmail(email);
        completeAccountScreen.inputUsername(username);
        completeAccountScreen.inputPassword(password);
        completeAccountScreen.inputBirthday();
    }

    @Then("^user enters the \"([^\"]*)\", \"([^\"]*)\", but fill \"([^\"]*)\" same with username to register by email$")
    public void user_enters_the_something_something_but_fill_something_same_with_username_to_register_by_email(String phone, String username, String password) throws Throwable {

        completeAccountScreen.inputPhone(phone);
        completeAccountScreen.inputUsername(username);
        completeAccountScreen.inputPassword(password);
        completeAccountScreen.inputBirthday();
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
