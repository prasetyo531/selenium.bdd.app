package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.remote.DesiredCapabilities;
import utils.DriverFactory;

public class LoginSteps extends DriverFactory {

    //***   Login without input password   ****//
    @Then("^User enters the \"([^\"]*)\" phonenumber to login$")
    public void User_enters_the_something_phonenumber_to_login(String phonenumber) throws Throwable {

        loginScreen.inputUsrEmailPhoneName(phonenumber);
    }

    //***   Login input password   ****//
    @Then("^user enters the \"([^\"]*)\" email to login$")
    public void user_enters_the_something_email_to_login(String email) throws Throwable {

        loginScreen.inputUsrEmailPhoneName(email);
    }

    @Then("^User enters the \"([^\"]*)\" username on login screen$")
    public void User_enters_the_something_username_on_login_screen(String username) throws Throwable {

        loginScreen.inputUsrEmailPhoneName(username);
    }

    @And("^User enters the \"([^\"]*)\" password on login screen$")
    public void User_enters_the_something_password_on_login_screen(String password) throws Throwable {

        loginScreen.clickLogin();
        loginScreen.inputPassword(password);
    }

    @And("^User enters the \"([^\"]*)\" username and \"([^\"]*)\" password then click login button on login screen$")
    public void user_enters_the_something_username_and_something_password_then_click_login_button_on_login_screen(String username, String password) throws Throwable {
        loginScreen.inputUsrEmailPhoneName(username);
        loginScreen.clickLogin();
        loginScreen.inputPassword(password);

        loginScreen.clickLogin();
        homeScreen.acceptAlertPermission();
        homeScreen.acceptAlertPermission();
    }

    // *** hardcode login username
    @Then("^User enters the username on login screen$")
    public void user_enters_the_username_on_login_screen() {
        loginScreen.inputHardcodeAuth();
    }

    @Then("^User enters the username that have post on login screen$")
    public void user_enters_the_username_that_have_post_on_login_screen() {
        loginScreen.inputHardcodeAuthHavePost();
    }

    @Then("^User enters the username that have review on login screen$")
    public void user_enters_the_username_that_have_review_on_login_screen() {
        loginScreen.inputHardcodeAuthHaveReview();
    }

    @And("^User enters the password on login screen$")
    public void user_enters_the_password_on_login_screen() throws Throwable {

        loginScreen.inputHardcodePassword();
    }
    // hardcode password to login **

    @And("^User clicks next button on login screen$")
    public void User_clicks__next_button_on_login_screen() throws Throwable {

        loginScreen.clickLogin();
    }

    @When("^User clicks login button on login screen$")
    public void User_clicks__login_button_on_login_screen() throws Throwable {

        loginScreen.clickLogin();
        homeScreen.acceptAlertPermission();
        homeScreen.acceptAlertPermission();
    }

    @When("^user input correct otp from phone on otp screen from android to login$")
    public void user_input_correct_otp_from_phone_on_otp_screen_from_android_to_login() throws Throwable {

        otpScreen.clickAllowReadMsg();
        otpScreen.comparePhoneReceiver();
        otpScreen.fillByPassOtp();
        otpScreen.clickConfirmOtp();
    }

    @When("^User resend otp 3 times from phone on otp screen android$")
    public void user_resend_otp_3_times_from_phone_on_otp_screen_android() throws Throwable {
        otpScreen.comparePhoneReceiver();
        otpScreen.clickResendCodeUntilSuspend();
    }

    @And("^User click change phone but input same \"([^\"]*)\"$")
    public void user_click_change_phone_but_input_same_something(String phonenumber) throws Throwable {

        otpScreen.tapToChangeFromPhoneToEmail();
        loginScreen.inputUsrEmailPhoneName(phonenumber);

        loginScreen.clickLogin();
    }

    @Then("^Display toast error msg suspend \"([^\"]*)\"$")
    public void Display_toast_error_msg_suspend_something(String msg) throws Throwable {

        loginScreen.assertToastSuspend(msg);
    }

    @When("^user input correct otp from phone on otp screen from ios to login$")
    public void user_input_correct_otp_from_phone_on_otp_screen_from_ios_to_login() throws Throwable {

        otpScreen.clickAllowReadMsgIos();
        //otpScreen.comparePhoneReceiverIos();
        otpScreen.clickConfirmOtpIos();
    }

    /* phone number not verified */
    @Then("^user see and click login on modal phone number is not verified$")
    public void user_see_and_click_login_on_modal_phone_number_is_not_verified() throws Throwable {

        loginScreen.clickLoginBtnModal();
    }

    @Then("^user see and click register on modal phone number is not verified$")
    public void user_see_and_click_register_on_modal_phone_number_is_not_verified() throws Throwable {

        loginScreen.clickRegisterBtnModal();
    }

    @Then("^user changes inputed login field to \"([^\"]*)\" to login$")
    public void user_changes_inputed_login_field_to_something_to_login(String channel) throws Throwable {

       loginScreen.inputNewChannelToLogin(channel);
    }

    /*  negative test    */
    @Then("^display msg \"([^\"]*)\" is displayed under email username phone field$")
    public void display_msg_is_displayed_under_email_username_phone_field(String message) {

        loginScreen.assertTextWarningLogin(message);
    }

    @Then("^user see and close modal phone number is not registered$")
    public void user_see_and_close_modal_phone_number_is_not_registered() throws Throwable {

        loginScreen.errorTitlePhoneNumberNotRegisteredModal();
        loginScreen.errorDescPhoneNumberNotRegisteredModal();
    }

    @Then("^User see and close modal phone number is not registered ios$")
    public void User_see_and_close_modal_phone_number_is_not_registered_ios() throws Throwable {

        loginScreen.errorTitlePhoneNumberNotRegisteredModalIos();
    }

    @Then("^user see and click yes on modal phone number is not registered$")
    public void user_see_and_click_yes_on_modal_phone_number_is_not_registered() throws Throwable {

        loginScreen.errorTitlePhoneNumberNotRegisteredModal();
        loginScreen.errorDescPhoneNumberNotRegisteredModal();
        loginScreen.clickYesBtnPhoneUnregisteredModal();
    }

    @Then("^user see and close modal phone number is not verified$")
    public void user_see_and_close_modal_phone_number_is_not_verified() throws Throwable {

        loginScreen.errorTitlePhoneNumberNotVerifiedModal();
    }

    @Then("^User see and close modal phone number is not verified ios$")
    public void User_see_and_close_modal_phone_number_is_not_verified_ios() throws Throwable {

        loginScreen.errorTitlePhoneNumberNotVerifiedModal();
    }

    @Then("^User see and close modal email is not registered$")
    public void User_see_and_close_modal_email_is_not_registered() throws Throwable {

        loginScreen.errorTitleEmailUsernameNotRegisteredModal();
        loginScreen.errorDescEmailNotRegisteredModal();
    }

    @Then("^User see and close modal username is not registered$")
    public void User_see_and_close_modal_username_is_not_registered() throws Throwable {

        loginScreen.errorTitleEmailUsernameNotRegisteredModal();
        loginScreen.errorDescPasswordNotValidModal();
    }

    @Then("^User see and close modal username is not registered ios$")
    public void User_see_and_close_modal_username_is_not_registered_ios() throws Throwable {

        loginScreen.errorTitleEmailUsernameNotRegisteredModalIos();
        //loginScreen.errorDescUsernamePasswordNotValidModalIos();
    }

    @Then("^user see and close modal email is used to multiple account$")
    public void user_see_and_close_modal_email_is_used_to_multiple_account() throws Throwable {

        loginScreen.errorTitleEmailDuplicateModal();
        loginScreen.errorDescEmailDuplicateModal();
    }

//    @Then("^pop up message shoul Then pop up message should displayed displayed$")
//    public void pop_up_message_should_displayed() {
//        loginScreen.errorDescPasswordNotValidModal();
//        loginScreen.clickRegisterBtnModal();
//    }

}
