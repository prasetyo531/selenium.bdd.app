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

    @Then("^User will direct to empty data beauty id screen$")
    public void user_will_direct_to_empty_data_beauty_id_screen() {

        profileScreen.isOnBeautyIdScreen();
    }

    @Then("^User will direct to completed data beauty id screen$")
    public void user_will_direct_to_completed_data_beauty_id_screen() {

        profileScreen.isOnBeautyIdScreen();

        profileScreen.islabelCompleteBeautyProfileDissapear();
        profileScreen.islabelCompleteBeautyConcernDissapear();
    }

    @Then("^User will direct to edit beauty id screen$")
    public void user_will_direct_to_edit_beauty_id_screen() {

        profileScreen.isOnBeautyIdScreen();
    }

    @And("^User clicks edit and complete beauty profile$")
    public void user_clicks_edit_and_complete_beauty_profile() {

        profileScreen.clickEditBeautyProfile();

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
    }

    @And("^User clicks edit and not complete beauty concern$")
    public void user_clicks_edit_and_not_complete_beauty_concern() {

        profileScreen.clickEditBeautyConcern();

        verifyAccountScreen.clickSaveBeautyCon();
    }

    @And("^User clicks edit and complete beauty concern$")
    public void user_clicks_edit_and_complete_beauty_concern() {

        profileScreen.clickEditBeautyConcern();

        verifyAccountScreen.chooseSkinCon();
        verifyAccountScreen.chooseBodyCon();
        verifyAccountScreen.chooseHairCon();

        verifyAccountScreen.clickSaveBeautyCon();
    }

    @Then("^User will see completed data beauty profile screen$")
    public void user_will_see_completed_data_beauty_profile_screen() {

        profileScreen.islabelCompleteBeautyProfileDissapear();
        profileScreen.verifyCompletedDataBeautyId();
    }

    @Then("^User will see completed beauty profile screen$")
    public void user_will_see_completed_beauty_profile_screen() {

        profileScreen.islabelCompleteBeautyProfileDissapear();
    }

    @Then("^User will see completed data beauty concern screen$")
    public void user_will_see_completed_data_beauty_concern_screen() {

        profileScreen.islabelCompleteBeautyConcernDissapear();
    }

    @Then("^User will direct to beauty concern screen$")
    public void user_will_direct_to_beauty_concern_screen() throws Throwable {

        verifyAccountScreen.checkTitleScreenBeautyConcern();
    }

    @And("^User clicks profile from homescreen menu$")
    public void user_clicks_profile_from_homescreen_menu() {

        homeScreen.clickProfileHomeMenu();
    }

    @When("^User clicks beautyId button on beauty drawer on profile$")
    public void user_clicks_beautyid_button_on_beauty_drawer_on_profile() {

        profileScreen.clickBeautyIdOnBeautyBox();
    }

    @Then("^User will see all inputed data are stored$")
    public void user_will_see_all_inputed_data_are_stored() throws Throwable {

        profileScreen.clickEditProfile();

        profileScreen.getTextDob();
    }

    @Then("^User will see all inputed data location and bio are empty$")
    public void user_will_see_all_inputed_data_location_and_bio_are_empty() throws InterruptedException {
        Thread.sleep(3000);
        profileScreen.clickBackSetting();
        profileScreen.getLocationEmptyEditProfile();
        profileScreen.isBioNotAppear();
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

    @And("^User will see toast msg to inform beauty profile updated$")
    public void user_will_see_toast_msg_to_inform_beauty_profile_updated() throws Throwable {

        profileScreen.findToastAfterUpdateBeautyProfile();
    }

    @Then("^User will see toast msg to inform beauty concern updated$")
    public void user_will_see_toast_msg_to_inform_beauty_concern_updated() {

        profileScreen.findToastAfterUpdateBeautyConcern();
    }

    @Then("^User will direct automatically to beauty concern screen$")
    public void user_will_direct_automatically_to_beauty_concern_screen() throws Throwable {

        profileScreen.checkTitleScreenBeautyConcern();
    }

    @Then("^User will direct automatically to beauty profile screen$")
    public void user_will_direct_automatically_to_beauty_profile_screen() throws InterruptedException {

        profileScreen.checkTitleScreenBeautyProfile();
    }

    @When("^User input new \"([^\"]*)\" invalid format on new password field and then submit$")
    public void user_input_new_something_invalid_format_on_new_password_field_and_then_submit(String newpassword) {

        profileScreen.inputNewPassword(newpassword);

        profileScreen.clickSubmitChangePassword();
    }

    @And("^User fill dob, location, gender, bio \"([^\"]*)\"$")
    public void user_fill_dob_location_gender_bio_something(String bio) {
        profileScreen.editDobToPreviousMonth();
        profileScreen.chooseLocationEditProfile();
        profileScreen.chooseMaleGender();
        profileScreen.inputBio(bio);
    }

    @Then("^User will see all inputed data location and \"([^\"]*)\" are stored$")
    public void user_will_see_all_inputed_data_location_and_something_are_stored(String bio) throws InterruptedException {
        Thread.sleep(3000);
        profileScreen.clickBackSetting();
        profileScreen.getLocationEditProfile();
        profileScreen.getTextBio(bio);
    }

    @And("^User clicks profile from homescreen menu and edit beautyId$")
    public void user_clicks_profile_from_homescreen_menu_and_edit_beautyid() {
        homeScreen.clickProfileHomeMenu();
        profileScreen.clickSettingProfile();
        profileScreen.clickDrawerSetting();
        profileScreen.clickEditBeautyId();
    }
}
