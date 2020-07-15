package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.ActionBase;

public class UpdateProfileSteps extends ActionBase {

    @When("^User clicks complete my beautyId button$")
    public void user_clicks_complete_my_beautyid_button() throws Throwable {

        homeScreen.completeMyBeautyIdProductMatches();
    }

    @Then("^User will direct to Beauty Profile screen$")
    public void user_will_direct_to_beauty_profile_screen() throws Throwable {

        verifyAccountScreen.checkTitleScreenBeautyProfile();
        verifyAccountScreen.clickSkipBeautyProfile();

        verifyAccountScreen.checkTitleScreenBeautyConcern();
        verifyAccountScreen.clickSkipBeautyCon();
    }


    @And("^User clicks profile from homescreen menu$")
    public void user_clicks_profile_from_homescreen_menu() throws Throwable {

        homeScreen.clickProfileHomeMenu();
    }

    @When("^User clicks beautyId button on beauty box on profile$")
    public void user_clicks_beautyid_button_on_beauty_box_on_profile() throws Throwable {

        profileScreen.clickBeautyIdOnBeautyBox();
    }

    @And("^User clicks setting icon$")
    public void user_clicks_setting_icon() throws Throwable {

        profileScreen.clickSettingProfile();
    }

    @And("^User clicks edit profile$")
    public void user_clicks_edit_profile() throws Throwable {

        profileScreen.clickEditProfile();
    }

    @And("^User fill dob, fullname \"([^\"]*)\", gender, location, bio \"([^\"]*)\"$")
    public void user_fill_dob_fullname_something_gender_location_bio_something(String fullname, String bio) throws Throwable {

        profileScreen.editDobToPreviousMonth();

        profileScreen.inputFullname(fullname);

        profileScreen.chooseMaleGender();

        profileScreen.chooseLocationEditProfile();

        profileScreen.inputBio(bio);
    }

    @When("^User clicks save to save all updated field$")
    public void user_clicks_save_to_save_all_updated_field() throws Throwable {

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

    @And("^User clicks update password$")
    public void user_clicks_update_password() throws Throwable {

        profileScreen.clickChangePassword();
    }

    @And("^User input \"([^\"]*)\" on old password field$")
    public void user_input_something_on_old_password_field(String oldpassword) throws Throwable {

        profileScreen.inputOldPassword(oldpassword);
    }

    @When("^User input new \"([^\"]*)\" invalid format on new password field$")
    public void user_input_new_something_invalid_format_on_new_password_field(String newpassword) throws Throwable {

        profileScreen.inputNewPassword(newpassword);
    }

    @When("^User clicks submit button to change password$")
    public void user_clicks_submit_button_to_change_password() throws Throwable {

        profileScreen.clickSubmitChangePassword();
    }


    @Then("^Display sneak msg \"([^\"]*)\"$")
    public void Display_sneak_msg_something(String msg) throws Throwable {

        profileScreen.getSneakMsgOldPassword(msg);
    }
}
