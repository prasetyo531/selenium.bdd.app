package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class VerifyAccountSteps extends DriverFactory {

    @Then("^User will see modal account status on homescreen$")
    public void User_will_see_modal_account_status_on_homescreen() throws Throwable {

        homeScreen.acceptAlertPermission();
        homeScreen.acceptAlertPermission();

        homeScreen.verifyAccountStatusModal();
    }

    @Then("^User will see modal account status on homescreen and click tnr menu$")
    public void User_will_see_modal_account_status_on_homescreen_and_click_tnr_menu() throws Throwable {

        homeScreen.acceptAlertPermission();
        homeScreen.acceptAlertPermission();

        homeScreen.verifyAccountStatusModal();
        homeScreen.clickTnrMenu();
    }

    @Then("^user will see modal account status on ios homescreen$")
    public void user_will_see_modal_account_status_on_ios_homescreen() throws Throwable {

        homeScreen.verifyAccountStatusModalIos();
    }

    @And("^User click complete verify button on modal$")
    public void User_click_complete_verify_button_on_modal() throws Throwable {

        homeScreen.clickAccountCompleteVerBtn();
    }

    @Then("^User will see progress bar verify on homescreen$")
    public void user_will_see_progress_bar_verify_on_homescreen() throws Throwable {

        homeScreen.checkProgressBarVerifyEmailPhone();
    }

    //***   modal account status    ***
    @And("^User change email and input \"([^\"]*)\" and click verify on verify email screen$")
    public void User_change_email_and_input_something_and_click_verify_on_verify_email_screen(String email) throws Throwable {

        verifyAccountScreen.clickChangeAuth();
        verifyAccountScreen.inputFieldVerifyEmail(email);
        verifyAccountScreen.clickVerifyEmailNow();
    }

    @Then("^User will see verify process$")
    public void user_will_see_verify_process() throws Throwable {

        verifyAccountScreen.checkStepper();
    }

    @When("^User change email \"([^\"]*)\" to verify email bypass otp$")
    public void user_change_email_something_to_verify_email_bypass_otp(String newemail) throws Throwable {

        verifyAccountScreen.tapToChangeEmail(newemail);
        verifyAccountScreen.clickVerifyEmailNow();
        verifyAccountScreen.inputPasswordToChangeEmail();

        otpScreen.fillByPassOtp();
        otpScreen.clickConfirmOtp();
    }

    @When("^User change phone \"([^\"]*)\" to verify phone bypass otp$")
    public void user_change_phone_something_to_verify_phone_bypass_otp(String newphone) throws Throwable {

        verifyAccountScreen.tapToChangePhone(newphone);
        verifyAccountScreen.clickVerifyPhoneNow();
        verifyAccountScreen.inputPasswordToChangePhone();

        otpScreen.fillByPassOtp();
        otpScreen.clickConfirmOtp();
    }

    @When("^User clicks verify now button on verify email screen bypass otp$")
    public void user_clicks_verify_now_button_on_verify_email_screen_bypass_otp() throws Throwable {

        verifyAccountScreen.clickVerifyEmailNow();

        otpScreen.fillByPassOtp();
        otpScreen.clickConfirmOtp();
    }

    @When("^User clicks verify now button on verify phone screen bypass otp$")
    public void user_clicks_verify_now_button_on_verify_phone_screen_bypass_otp() throws Throwable {

        verifyAccountScreen.clickVerifyPhoneNow();

        otpScreen.fillByPassOtp();
        otpScreen.clickConfirmOtp();
    }

    @Then("^User will see success msg verified by email contains \"([^\"]*)\"$")
    public void user_will_see_success_msg_verified_by_email_contains_something(String email) throws Throwable {

        Thread.sleep(1000);
        verifyAccountScreen.checkVerifiedSuccessEmail(email);
    }

    @Then("^User will see success msg verified by phone contains \"([^\"]*)\"$")
    public void user_will_see_success_msg_verified_by_phone_contains_something(String phone) throws Throwable {

        Thread.sleep(1000);
        verifyAccountScreen.checkVerifiedSuccessPhone(phone);
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

    @When("^User take picture to complete personal info$")
    public void user_take_picture_to_complete_personal_info() throws Throwable {

        //capture not allowed to change
        verifyAccountScreen.captureSS("before-upload-photo-profile");
        verifyAccountScreen.clickCaptureImg();
    }

    @When("^User use picture from gallery to complete personal info$")
    public void user_use_picture_from_gallery_to_complete_personal_info() throws Throwable {

        verifyAccountScreen.clickGalleryBtn();
    }

    @And("^User complete data on personal info screen \"([^\"]*)\"$")
    public void user_complete_data_on_personal_info_screen_something(String fullname) throws Throwable {

        verifyAccountScreen.inputFieldFullname(fullname);
        verifyAccountScreen.chooseGender();
        verifyAccountScreen.chooseLocation();

        verifyAccountScreen.clickSavePersonalInfo();
    }

    @And("^User fill all mandatory field on personal info screen \"([^\"]*)\"$")
    public void User_fill_all_mandatory_field_on_personal_info_screen_something(String fullname) throws Throwable {

        verifyAccountScreen.clickSavePersonalInfo();
        verifyAccountScreen.getErrorFullname();
        verifyAccountScreen.inputFieldFullname(fullname);

        verifyAccountScreen.clickSavePersonalInfo();
        verifyAccountScreen.getErrorGender();
        verifyAccountScreen.chooseGender();

        verifyAccountScreen.clickSavePersonalInfo();
        verifyAccountScreen.getErrorLocation();
        verifyAccountScreen.chooseLocation();

        verifyAccountScreen.clickSavePersonalInfo();

        //verifyAccountScreen.verifySneakMsg();
    }

    @And("^User fill all mandatory field on personal info screen \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_fill_all_mandatory_field_on_personal_info_screen_something_and_something(String fullname, String location) throws Throwable {

        verifyAccountScreen.clickSavePersonalInfo();
        verifyAccountScreen.inputFieldFullname(fullname);
        verifyAccountScreen.getErrorFullname();

        verifyAccountScreen.clickSavePersonalInfo();
        verifyAccountScreen.getErrorGender();
        verifyAccountScreen.chooseGender();

        verifyAccountScreen.clickSavePersonalInfo();
        verifyAccountScreen.getErrorLocation();
        verifyAccountScreen.chooseRandomLocation(location);

        verifyAccountScreen.clickSavePersonalInfo();

        //verifyAccountScreen.verifySneakMsg();
    }

    @And("^User choose beauty profile on beauty profile screen$")
    public void user_choose_beauty_profile_on_beauty_profile_screen() throws Throwable {

        verifyAccountScreen.checkTitleScreenBeautyProfile();

        verifyAccountScreen.clickSaveBeautyProf();
        verifyAccountScreen.getErrorSkinType();
        verifyAccountScreen.chooseSkinType();

        verifyAccountScreen.clickSaveBeautyProf();
        verifyAccountScreen.getErrorSkinTone();
        verifyAccountScreen.chooseSkinTone();

        verifyAccountScreen.clickSaveBeautyProf();
        verifyAccountScreen.getErrorSkinUndertone();
        verifyAccountScreen.chooseSkinUndertone();

        verifyAccountScreen.clickSaveBeautyProf();
        verifyAccountScreen.getErrorHairType();
        verifyAccountScreen.chooseHairType();

        verifyAccountScreen.clickSaveBeautyProf();
        verifyAccountScreen.getErrorColoredHair();
        verifyAccountScreen.chooseColoredHair();

        verifyAccountScreen.clickSaveBeautyProf();
        verifyAccountScreen.getErrorHijaber();
        verifyAccountScreen.chooseHijaber();

        verifyAccountScreen.clickSaveBeautyProf();

        //verifyAccountScreen.verifySneakMsg();
    }

    @And("^User choose beauty concern on beauty concern screen$")
    public void User_choose_beauty_concern_on_beauty_concern_screen() throws Throwable {

        verifyAccountScreen.checkTitleScreenBeautyConcern();

        verifyAccountScreen.clickSaveBeautyCon();
        verifyAccountScreen.getErrorSkinCon();
        verifyAccountScreen.chooseSkinCon();

        verifyAccountScreen.clickSaveBeautyCon();
        verifyAccountScreen.getErrorBodyCon();
        verifyAccountScreen.chooseBodyCon();

        verifyAccountScreen.clickSaveBeautyCon();
        verifyAccountScreen.getErrorHairCon();
        verifyAccountScreen.chooseHairCon();

        verifyAccountScreen.clickSaveBeautyCon();

        //verifyAccountScreen.verifySneakMsg();
    }

    @Then("^User will see congratulation modal$")
    public void user_will_see_congratulation_modal() throws Throwable {

        verifyAccountScreen.checkModalSuccessfullyCompleteProfile();
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

    @Then("^User will see modal fullname only alphabet$")
    public void user_will_see_modal_fullname_only_alphabet() throws Throwable {

        verifyAccountScreen.getErrorModalFullname();
    }

    @Then("^User will see image that has taken appear in thumbnail$")
    public void user_will_see_image_that_has_taken_appear_in_thumbnail() throws Throwable {

        //capture not allowed to change
        verifyAccountScreen.captureSS("after-upload-photo-profile");

        verifyAccountScreen.checkPercentage("before-upload-photo-profile","after-upload-photo-profile");
        //verifyAccountScreen.deleteImageStored("before-upload-photo-profile","after-upload-photo-profile");
    }

    //from profile
    @And("^User clicks profile from homescreen menu and edit profile$")
    public void user_clicks_profile_from_homescreen_menu_and_edit_profile() throws Throwable {

        homeScreen.clickProfileHomeMenu();
        profileScreen.clickSettingProfile();
        profileScreen.clickEditProfile();
    }

    @When("^User clicks change email \"([^\"]*)\" to verify email bypass otp$")
    public void user_clicks_change_email_something_to_verify_email_bypass_otp(String newemail) throws Throwable {

        profileScreen.tapToChangeEmailProfile(newemail);
        profileScreen.confirmChangeVerifyEmail();

        //password
        profileScreen.inputPasswordToChangeEmailProfile();
    }

    @When("^User clicks change phone \"([^\"]*)\" to verify phone bypass otp$")
    public void user_clicks_change_phone_something_to_verify_phone_bypass_otp(String newphone) throws Throwable {

        profileScreen.tapToChangePhoneProfile(newphone);
        profileScreen.confirmChangeVerifyPhone();

        //password
        profileScreen.inputPasswordToChangePhoneProfile();
    }

    @When("^User clicks label to verify your email$")
    public void user_clicks_label_to_verify_your_email() throws Throwable {

        profileScreen.clickVerifyEmail();
    }

    @When("^User clicks label to verify your phone$")
    public void user_clicks_label_to_verify_your_phone() throws Throwable {

        profileScreen.clickVerifyPhone();
    }

    @And("^User input bypass otp code then confirm$")
    public void user_input_bypass_otp_code_then_confirm() throws Throwable {

        otpScreen.fillByPassOtp();
        otpScreen.clickConfirmOtp();
    }

    @Then("^User will see success msg verified by email contains \"([^\"]*)\" and label Verified will appear$")
    public void user_will_see_success_msg_verified_by_email_contains_something_and_label_verified_will_appear(String email) throws Throwable {

        Thread.sleep(1200);
        verifyAccountScreen.checkVerifiedSuccessEmail(email);

        Thread.sleep(1000);
        profileScreen.checkLabelVerifiedEmail();
    }

    @Then("^User will see success msg verified by phone contains \"([^\"]*)\" and label Verified will appear$")
    public void user_will_see_success_msg_verified_by_phone_contains_something_and_label_verified_will_appear(String phone) throws Throwable {

        Thread.sleep(1200);
        verifyAccountScreen.checkVerifiedSuccessPhone(phone);

        Thread.sleep(1000);
        profileScreen.checkLabelVerifiedPhone();
    }

}
