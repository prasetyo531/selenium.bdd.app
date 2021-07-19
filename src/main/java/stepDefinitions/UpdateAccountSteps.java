package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class UpdateAccountSteps extends DriverFactory {

    //from profile
    @And("^User clicks profile from homescreen menu and edit account$")
    public void user_clicks_profile_from_homescreen_menu_and_edit_account() {
        homeScreen.clickProfileHomeMenu();
        profileScreen.clickSettingProfile();
        profileScreen.clickDrawerSetting();
        profileScreen.clickEditAccount();
    }

    @When("^User clicks change phone number and input \"([^\"]*)\"$")
    public void user_clicks_change_phone_number_and_input_something(String newphone) {
        profileScreen.tapToChangePhoneProfile(newphone);
        profileScreen.confirmChangeVerifyPhone();
    }

    @When("^User clicks change email and input \"([^\"]*)\"$")
    public void user_clicks_change_email_and_input_something(String newemail) {
        profileScreen.tapToChangeEmailProfile(newemail);
        profileScreen.confirmChangeVerifyEmail();
    }

    @And("^User fill fullname \"([^\"]*)\"$")
    public void user_fill_fullname_something(String fullname) {

        profileScreen.inputFullname(fullname);
    }

    @When("^User clicks save to save all updated field$")
    public void user_clicks_save_to_save_all_updated_field() {

        profileScreen.clickSaveProfile();
    }

    @Then("^User will see modal fullname only alphabet$")
    public void user_will_see_modal_fullname_only_alphabet() {
        verifyAccountScreen.getErrorModalFullname();
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

    @And("^User clicks change password$")
    public void user_clicks_change_password() {

        profileScreen.clickChangePassword();
    }

    @And("^User input \"([^\"]*)\" on old password field$")
    public void user_input_something_on_old_password_field(String oldpassword) {

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

    @Then("^Display sneak msg \"([^\"]*)\"$")
    public void Display_sneak_msg_something(String msg) throws Throwable {

        profileScreen.getSneakMsgOldPassword(msg);
    }
}
