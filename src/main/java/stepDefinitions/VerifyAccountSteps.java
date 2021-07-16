package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

import java.io.IOException;

public class VerifyAccountSteps extends DriverFactory {

    @Then("^User will be directed to homescreeen app$")
    public void user_will_be_directed_to_homescreeen_app() {
        homeScreen.acceptAlertPermission();
        homeScreen.acceptAlertPermission();
    }

    @Then("^User will see modal account status on homescreen$")
    public void User_will_see_modal_account_status_on_homescreen() {
        homeScreen.verifyAccountStatusModal();
    }

    @Then("^User will see modal account status on homescreen and close modal rating app$")
    public void user_will_see_modal_account_status_on_homescreen_and_close_modal_rating_app() {
        homeScreen.acceptAlertPermission();
        homeScreen.acceptAlertPermission();

        homeScreen.verifyAccountStatusModalAndAppRatingModal();
    }

    @Then("^User will see modal account status on homescreen and click tnr menu$")
    public void User_will_see_modal_account_status_on_homescreen_and_click_tnr_menu() {
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
    public void User_change_email_and_input_something_and_click_verify_on_verify_email_screen(String email) {
        verifyAccountScreen.clickChangeAuthEmail();
        verifyAccountScreen.inputFieldVerifyEmail(email);
        verifyAccountScreen.clickVerifyEmailNow();
    }

    @Then("^User will see verify process$")
    public void user_will_see_verify_process() {
        verifyAccountScreen.checkStepper();
    }

    @When("^User change email \"([^\"]*)\" to verify email bypass otp$")
    public void user_change_email_something_to_verify_email_bypass_otp(String newemail) {
        verifyAccountScreen.tapToChangeEmail(newemail);
        verifyAccountScreen.clickVerifyEmailNow();
        verifyAccountScreen.inputPasswordToChangeEmail();

        otpScreen.fillByPassOtp();
        otpScreen.clickConfirmOtp();
    }

    @When("^User change phone \"([^\"]*)\" to verify phone bypass otp$")
    public void user_change_phone_something_to_verify_phone_bypass_otp(String newphone) {
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
    public void user_will_see_success_msg_verified_by_email_contains_something(String email) throws InterruptedException {
        Thread.sleep(1000);
        verifyAccountScreen.checkVerifiedSuccessEmail(email);
    }

    @Then("^User will see success msg verified by phone contains \"([^\"]*)\"$")
    public void user_will_see_success_msg_verified_by_phone_contains_something(String phone) throws InterruptedException {
        Thread.sleep(1000);
        verifyAccountScreen.checkVerifiedSuccessPhone(phone);
    }

    @And("^User skip verify email$")
    public void User_skip_verify_email() {
        verifyAccountScreen.clickSkipEmail();
    }

    @And("^User input \"([^\"]*)\" and click verify on verify phone screen$")
    public void User_input_something_and_click_verify_on_verify_phone_screen(String phone) {
        verifyAccountScreen.inputFieldVerifyPhone(phone);
        verifyAccountScreen.clickVerifyPhoneNow();
    }

    @And("^User change \"([^\"]*)\" and click verify on verify phone screen$")
    public void User_change_something_and_click_verify_on_verify_phone_screen(String phone) {
        verifyAccountScreen.clickChangeAuthPhone();
        verifyAccountScreen.inputFieldVerifyPhone(phone);
        verifyAccountScreen.clickVerifyPhoneNow();
    }

    @And("^User change phone \"([^\"]*)\" and confirm password$")
    public void user_change_phone_something_and_confirm_password(String phone) {
        verifyAccountScreen.tapToChangePhone(phone);
        verifyAccountScreen.clickVerifyPhoneNow();
        verifyAccountScreen.inputPasswordToChangePhone();
    }

    @And("^User change email \"([^\"]*)\" and confirm password$")
    public void user_change_email_something_and_confirm_password(String email) {
        verifyAccountScreen.tapToChangeEmail(email);
        verifyAccountScreen.clickVerifyEmailNow();
        verifyAccountScreen.inputPasswordToChangeEmail();
    }

    @Then("^User click skip button on verify email screen$")
    public void user_click_skip_button_on_verify_email_screen() {
        verifyAccountScreen.clickSkipEmail();
    }

    @And("^User click skip button on verify phone screen$")
    public void user_click_skip_button_on_verify_phone_screen() {
        verifyAccountScreen.clickSkipPhone();
    }

    @When("^User take picture to complete personal info$")
    public void user_take_picture_to_complete_personal_info() throws IOException, InterruptedException {
        //capture not allowed to change
        verifyAccountScreen.captureSS("before-upload-photo-profile");
        verifyAccountScreen.clickCaptureImg();
    }

    @When("^User use picture from gallery to complete personal info$")
    public void user_use_picture_from_gallery_to_complete_personal_info() {
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
    public void user_choose_beauty_profile_on_beauty_profile_screen() {
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
    public void User_choose_beauty_concern_on_beauty_concern_screen() {
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
    public void user_will_see_congratulation_modal() {
        homeScreen.acceptAlertPermission();
        homeScreen.acceptAlertPermission();
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

    @Then("^User will see image that has taken appear in thumbnail$")
    public void user_will_see_image_that_has_taken_appear_in_thumbnail() throws Throwable {
        //capture not allowed to change
        verifyAccountScreen.captureSS("after-upload-photo-profile");

        verifyAccountScreen.checkPercentage("before-upload-photo-profile","after-upload-photo-profile");
        //verifyAccountScreen.deleteImageStored("before-upload-photo-profile","after-upload-photo-profile");
    }

    @And("^User clicks profile from homescreen menu and edit profile$")
    public void user_clicks_profile_from_homescreen_menu_and_edit_profile() {
        homeScreen.clickProfileHomeMenu();
        profileScreen.clickSettingProfile();
        profileScreen.clickDrawerSetting();
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
    public void user_clicks_label_to_verify_your_email() {
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
    public void user_will_see_success_msg_verified_by_email_contains_something_and_label_verified_will_appear(String email) throws InterruptedException {
        Thread.sleep(1200);
        verifyAccountScreen.checkVerifiedSuccessEmail(email);

        Thread.sleep(1000);
        profileScreen.checkLabelVerifiedEmail();
    }

    @Then("^User will see success msg verified by phone contains \"([^\"]*)\" and label Verified will appear$")
    public void user_will_see_success_msg_verified_by_phone_contains_something_and_label_verified_will_appear(String phone) throws InterruptedException {
        Thread.sleep(1200);
        verifyAccountScreen.checkVerifiedSuccessPhone(phone);

        Thread.sleep(1000);
        profileScreen.checkLabelVerifiedPhone();
    }

    @And("^User clicks back$")
    public void user_clicks_back() throws InterruptedException {
        Thread.sleep(5000);
        profileScreen.clickBackOnChangeEmailPhoneScreen();
    }

    @And("^User tap button get it now modal get point$")
    public void user_tap_button_get_it_now_modal_get_point() {
        verifyAccountScreen.tapBtnGetItNow();
    }

    @When("^User switch account by tap button change$")
    public void user_switch_account_by_tap_button_change() {
        verifyAccountScreen.tapBtnChangeAccount();
        verifyAccountScreen.confirmChangeAccount();
    }

    @Then("^User logout from FD apps$")
    public void user_logout_from_fd_apps() {
        loginScreen.validateLoginPageAfterlogout();
    }

    @And("^User tap button next on modal verify success$")
    public void user_tap_button_next_on_modal_verify_success() {
        verifyAccountScreen.tapBtnNextOnModalVerifySuccess();
        homeScreen.acceptAlertPermission();
    }

    @When("^User change phone \"([^\"]*)\" before switch account$")
    public void user_change_phone_something_before_switch_account(String newphonum) {
        verifyAccountScreen.tapToChangePhone(newphonum);
        verifyAccountScreen.tapBtnChangeAccount();
        verifyAccountScreen.confirmChangeAccount();
    }

    @Then("^User check close icon on each step verify and complete$")
    public void user_check_close_icon_on_each_step_verify_and_complete() {
        homeScreen.clickAccountCompleteVerBtn();

        verifyAccountScreen.isCloseStepperAppear();
        verifyAccountScreen.skipEmail();

        verifyAccountScreen.checkTitleScreenPersonalInfo();
        verifyAccountScreen.isCloseStepperAppear();
        verifyAccountScreen.skipPersonalInfo();

        verifyAccountScreen.checkTitleScreenBeautyProfile();
        verifyAccountScreen.isCloseStepperAppear();
        verifyAccountScreen.skipBeautyProfile();

        verifyAccountScreen.checkTitleScreenBeautyConcern();
        verifyAccountScreen.isCloseStepperAppear();
        verifyAccountScreen.skipBeautyConcern();

        homeScreen.checkProgressBarVerifyEmailPhone();
    }
}
