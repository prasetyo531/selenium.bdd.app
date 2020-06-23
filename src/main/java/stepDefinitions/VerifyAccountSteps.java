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

    @When("^User click complete verify button on modal$")
    public void User_click_complete_verify_button_on_modal() throws Throwable {

        homeScreen.clickAccountCompleteVerBtn();
    }

    //***   modal account status    ***
    @And("^User change email and input \"([^\"]*)\" and click verify on verify email screen$")
    public void User_change_email_and_input_something_and_click_verify_on_verify_email_screen(String email) throws Throwable {

        verifyAccountScreen.clickChangeAuth();
        verifyAccountScreen.inputFieldVerifyEmail(email);
        verifyAccountScreen.clickVerifyEmailNow();
    }

    @And("^User skip verify email$")
    public void User_skip_verify_email() throws Throwable {

        verifyAccountScreen.clickSkipEmail();
    }

    @And("^User input \"([^\"]*)\" and click verify on verify phone screen$")
    public void User_input_something_and_click_verify_on_verify_phone_screen(String phone) throws Throwable {

        verifyAccountScreen.inputFieldVerifyPhone(phone);
        verifyAccountScreen.clickVerifyPhoneNow();
    }

    @Then("^User click skip button on verify email screen$")
    public void user_click_skip_button_on_verify_email_screen() throws Throwable {

        verifyAccountScreen.clickSkipEmail();
    }

    @And("^User click skip button on verify phone screen$")
    public void user_click_skip_button_on_verify_phone_screen() throws Throwable {

        verifyAccountScreen.clickSkipPhone();
    }

    @And("^User fill all mandatory field on personal info screen \"([^\"]*)\"$")
    public void User_fill_all_mandatory_field_on_personal_info_screen_something(String fullname) throws Throwable {

        verifyAccountScreen.clickSavePersonalInfo();
        verifyAccountScreen.inputFieldFullname(fullname)
        verifyAccountScreen.getErrorFullname();

        verifyAccountScreen.clickSavePersonalInfo();
        verifyAccountScreen.getErrorGender();
        verifyAccountScreen.chooseGender();

        verifyAccountScreen.clickSavePersonalInfo();
        verifyAccountScreen.getErrorLocation();
        verifyAccountScreen.chooseLocation();

        verifyAccountScreen.clickSavePersonalInfo();
    }

    @And("^User choose beauty profile on beauty profile screen$")
    public void user_choose_beauty_profile_on_beauty_profile_screen() throws Throwable {

        verifyAccountScreen.clickSaveBeautyProf();
        verifyAccountScreen.chooseSkinType();

        verifyAccountScreen.clickSaveBeautyProf();
        verifyAccountScreen.chooseSkinTone();

        verifyAccountScreen.clickSaveBeautyProf();
        verifyAccountScreen.skinUnderToneWarm():

        verifyAccountScreen.clickSaveBeautyProf();
        verifyAccountScreen.hairTypeCurly():

        verifyAccountScreen.clickSaveBeautyProf();
        verifyAccountScreen.chooseColoredHair();

        verifyAccountScreen.clickSaveBeautyProf();
        verifyAccountScreen.chooseHijaber();

        verifyAccountScreen.clickSaveBeautyProf();

        verifyAccountScreen.verifySneakMsg();
    }

    @And("^User choose beauty profile on beauty concern screen$")
    public void user_choose_beauty_profile_on_beauty_concern_screen() throws Throwable {

        verifyAccountScreen.clickSaveBeautyCon();
        verifyAccountScreen.chooseSkinCon();

        verifyAccountScreen.clickSaveBeautyCon();
        verifyAccountScreen.chooseBodyCon();

        verifyAccountScreen.clickSaveBeautyCon();
        verifyAccountScreen.chooseHairCon();

        verifyAccountScreen.clickSaveBeautyCon();

        verifyAccountScreen.verifySneakMsg();
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
