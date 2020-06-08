package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class VerifyAccountSteps extends DriverFactory {

    @Then("^user will see modal account status on homescreen$")
    public void user_will_see_modal_account_status_on_homescreen() throws Throwable {

        homeScreen.verifyAccountStatusModal();
    }

    @Then("^user will see modal account status on ios homescreen$")
    public void user_will_see_modal_account_status_on_ios_homescreen() throws Throwable {

        homeScreen.verifyAccountStatusModalIos();
    }

    @When("^user click complete verify button on modal$")
    public void user_click_complete_verify_button_on_modal() throws Throwable {

        homeScreen.clickAccountCompleteVerBtn();
    }

    //***   modal account status    ***
    @And("^user change email and input \"([^\"]*)\" and click verify on verify email screen$")
    public void user_change_email_and_input_something_and_click_verify_on_verify_email_screen(String email) throws Throwable {

        verifyAccountScreen.clickChangeAuth();
        Thread.sleep(2000);
        verifyAccountScreen.inputFieldVerifyEmail(email);
        verifyAccountScreen.clickVerifyEmailNow();
    }

    @And("^user skip verify email$")
    public void user_skip_verify_email() throws Throwable {

        verifyAccountScreen.clickSkipEmail();
    }

    @And("^user input \"([^\"]*)\" and click verify on verify phone screen$")
    public void user_input_something_and_click_verify_on_verify_phone_screen(String phone) throws Throwable {

        Thread.sleep(2000);
        verifyAccountScreen.inputFieldVerifyPhone(phone);
        verifyAccountScreen.clickVerifyPhoneNow();
    }

    //error msg
    @Then("^display msg \"([^\"]*)\" is displayed under verify email field$")
    public void display_msg_is_displayed_under_verify_email_field(String message) {

        verifyAccountScreen.assertTextWarningLogin(message);
    }

    @Then("^display msg \"([^\"]*)\" is displayed under verify phone field$")
    public void display_msg_something_is_displayed_under_verify_phone_field(String message) throws Throwable {

        verifyAccountScreen.assertTextWarningLogin(message);
    }
}
