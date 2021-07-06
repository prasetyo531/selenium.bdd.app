package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.ActionBase;
import utils.DriverFactory;

public class UpdateProfileSteps extends DriverFactory {

    @When("^User clicks complete my beautyId button$")
    public void user_clicks_complete_my_beautyid_button() throws Throwable {

        homeScreen.completeMyBeautyIdProductMatches();
    }

    @Then("^User will direct to beauty profile screen$")
    public void user_will_direct_to_beauty_profile_screen() throws Throwable {

        verifyAccountScreen.checkTitleScreenBeautyProfile();
        verifyAccountScreen.clickSkipBeautyProfile();

        verifyAccountScreen.checkTitleScreenBeautyConcern();
        verifyAccountScreen.clickSkipBeautyCon();
    }

    @Then("^User will direct to beauty concern screen$")
    public void user_will_direct_to_beauty_concern_screen() throws Throwable {

        verifyAccountScreen.checkTitleScreenBeautyConcern();
    }

    @And("^User clicks profile from homescreen menu$")
    public void user_clicks_profile_from_homescreen_menu() {

        homeScreen.clickProfileHomeMenu();
    }

    @When("^User clicks beautyId button on beauty box on profile$")
    public void user_clicks_beautyid_button_on_beauty_box_on_profile() {

        profileScreen.clickBeautyIdOnBeautyBox();
    }

    @And("^User clicks setting icon$")
    public void user_clicks_setting_icon() {

        profileScreen.clickSettingProfile();
    }

    @And("^User clicks edit profile$")
    public void user_clicks_edit_profile() {

        profileScreen.clickEditProfile();
    }

    @And("^User fill fullname \"([^\"]*)\"$")
    public void user_fill_fullname_something(String fullname) {

        profileScreen.inputFullname(fullname);
    }

    @And("^User will see toast msg after update fullname$")
    public void user_will_see_toast_msg_after_update_fullname() {

        profileScreen.isToastAppear();
    }

    @Then("^User will see fullname \"([^\"]*)\" on profile updated$")
    public void user_will_see_fullname_something_on_profile_updated(String fullname) {

        profileScreen.clickBackSetting();
        profileScreen.clickBackSetting();
        profileScreen.getTextFullname(fullname);
    }

    @When("^User clicks save to save all updated field$")
    public void user_clicks_save_to_save_all_updated_field() {

        profileScreen.clickSaveProfile();
    }

    @Then("^User will see all inputed data are stored$")
    public void user_will_see_all_inputed_data_are_stored() throws Throwable {

        profileScreen.clickEditProfile();

        profileScreen.getTextDob();
    }

    @Then("^User will see all inputed data \"([^\"]*)\", gender, location, \"([^\"]*)\" are stored$")
    public void user_will_see_all_inputed_data_something_gender_location_something_are_stored(String fullname, String bio) throws Throwable {

        profileScreen.clickEditProfile();

        profileScreen.getTextDob();
        profileScreen.getFullnameEditProfile(fullname);
        profileScreen.getLocationEditProfile();
        profileScreen.getTextBio(bio);
    }

    @Then("^User will see all inputed data fullname, gender, location, bio are empty$")
    public void user_will_see_all_inputed_data_fullname_gender_location_bio_are_empty() throws Throwable {

        profileScreen.clickEditProfile();

        profileScreen.getTextEmptyDob();
        profileScreen.getFullnameEmptyEditProfile();
        profileScreen.getLocationEmptyEditProfile();
        profileScreen.getTextEmptyBio();
    }

    @When("^User click update beauty profile and user fill all option$")
    public void user_click_update_beauty_profile_and_user_fill_all_option() throws Throwable {

        profileScreen.clickUpdateBeautyProfile();

//        verifyAccountScreen.checkTitleScreenBeautyProfile();

        profileScreen.chooseSkinType();

        profileScreen.chooseSkinTone();

        profileScreen.chooseSkinUndertone();

        profileScreen.chooseHairType();

        profileScreen.chooseColoredHair();

        profileScreen.chooseHijaber();

        profileScreen.clickSaveBeautyProf();
    }

    @When("^User click update beauty concern and user fill all option$")
    public void user_click_update_beauty_concern_and_user_fill_all_option() throws Throwable {

        profileScreen.clickUpdateBeautyConcern();

//        verifyAccountScreen.checkTitleScreenBeautyConcern();

        profileScreen.chooseSkinCon();

        profileScreen.chooseBodyCon();

        profileScreen.chooseHairCon();

        profileScreen.clickSaveBeautyCon();
    }

    @Then("^User will see toast msg to inform beauty profile updated$")
    public void user_will_see_toast_msg_to_inform_beauty_profile_updated() throws Throwable {

        profileScreen.findToastAfterUpdateBeautyProfile();
    }

    @Then("^User will see toast msg to inform beauty concern updated$")
    public void user_will_see_toast_msg_to_inform_beauty_concern_updated() throws Throwable {

        profileScreen.findToastAfterUpdateBeautyConcern();
    }

    @And("^User clicks save on edit profile screen$")
    public void user_clicks_save_on_edit_profile_screen() throws Throwable {

        profileScreen.clickSaveProfile();
        Thread.sleep(1000);
        profileScreen.clickBackSetting();
    }

    @Then("^User will direct automatically to beauty concern screen$")
    public void user_will_direct_automatically_to_beauty_concern_screen() throws Throwable {

        profileScreen.checkTitleScreenBeautyConcern();
    }

    @Then("^User will direct automatically to beauty profile screen$")
    public void user_will_direct_automatically_to_beauty_profile_screen() throws Throwable {

        profileScreen.checkTitleScreenBeautyProfile();
    }

    @And("^User clicks change password$")
    public void user_clicks_change_password() {

        profileScreen.clickChangePassword();
    }

    @And("^User input \"([^\"]*)\" on old password field$")
    public void user_input_something_on_old_password_field(String oldpassword) throws Throwable {

        profileScreen.inputOldPassword(oldpassword);
    }

    @And("^User input new \"([^\"]*)\" on new password field$")
    public void user_input_new_something_on_new_password_field(String newpassword) {

        profileScreen.inputNewPassword(newpassword);
    }

    @And("^User input new \"([^\"]*)\" on confirm new password field$")
    public void user_input_new_something_on_confirm_new_password_field(String confirmnewpassword) {

        profileScreen.inputConfirmNewPassword(confirmnewpassword);
    }

    @When("^User clicks submit button to change password$")
    public void user_clicks_submit_button_to_change_password() throws Throwable {

        profileScreen.clickSubmitChangePassword();
    }

    @When("^User input new \"([^\"]*)\" invalid format on new password field and then submit$")
    public void user_input_new_something_invalid_format_on_new_password_field_and_then_submit(String newpassword) throws Throwable {

        profileScreen.inputNewPassword(newpassword);

        profileScreen.clickSubmitChangePassword();
    }

    @Then("^Display sneak msg \"([^\"]*)\"$")
    public void Display_sneak_msg_something(String msg) throws Throwable {

        profileScreen.getSneakMsgOldPassword(msg);
    }
}
