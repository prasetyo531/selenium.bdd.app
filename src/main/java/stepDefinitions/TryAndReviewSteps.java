package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class TryAndReviewSteps extends DriverFactory {

    @When("^User clicks join campaign from campaign detail of highlighted campaign$")
    public void user_clicks_join_campaign_from_campaign_detail_of_highlighted_campaign() throws Throwable {
        tryAndReviewScreen.clickMoreAndJoinHiglightedCamp();
    }

    @Then("^User will see participant summary form$")
    public void user_will_see_participant_summary_form() throws Throwable {
       tryAndReviewScreen.checkIsOnScreenParticapantSummary();
    }

    @And("^User complete data tnr on personal info screen \"([^\"]*)\"$")
    public void user_complete_data_tnr_on_personal_info_screen_something(String fullname) throws Throwable {
        tryAndReviewScreen.clickEditPersonalInfo();
        tryAndReviewScreen.inputPersonalInfoForm(fullname);
        tryAndReviewScreen.checkToastSuccess();
    }

    @And("^User complete data tnr on beauty profile screen$")
    public void user_complete_data_tnr_on_beauty_profile_screen() throws Throwable {

        tryAndReviewScreen.clickAddNewBeautyProfile();

        tryAndReviewScreen.clickSaveBeautyProfile();
        tryAndReviewScreen.getErrorSkinType();
        tryAndReviewScreen.chooseSkinType();

        tryAndReviewScreen.clickSaveBeautyProfile();
        tryAndReviewScreen.getErrorSkinTone();
        tryAndReviewScreen.chooseSkinTone();

        tryAndReviewScreen.clickSaveBeautyProfile();
        tryAndReviewScreen.getErrorSkinUndertone();
        tryAndReviewScreen.chooseSkinUndertone();

        tryAndReviewScreen.clickSaveBeautyProfile();
        tryAndReviewScreen.getErrorHairType();
        tryAndReviewScreen.chooseHairType();

        tryAndReviewScreen.clickSaveBeautyProfile();
        tryAndReviewScreen.getErrorColoredHair();
        tryAndReviewScreen.chooseColoredHair();

        tryAndReviewScreen.clickSaveBeautyProfile();
        tryAndReviewScreen.getErrorHijaber();
        tryAndReviewScreen.chooseHijaber();

        tryAndReviewScreen.clickSaveBeautyProfile();

        tryAndReviewScreen.checkToastSuccess();
    }

    @And("^User complete data tnr on beauty concern screen$")
    public void user_complete_data_tnr_on_beauty_concern_screen() throws Throwable {

        tryAndReviewScreen.clickAddNewBeautyConcern();

        tryAndReviewScreen.clickSaveBeautyConcern();
        tryAndReviewScreen.getErrorSkinCon();
        tryAndReviewScreen.chooseSkinCon();

        tryAndReviewScreen.clickSaveBeautyConcern();
        tryAndReviewScreen.getErrorBodyCon();
        tryAndReviewScreen.chooseBodyCon();

        tryAndReviewScreen.clickSaveBeautyConcern();
        tryAndReviewScreen.getErrorHairCon();
        tryAndReviewScreen.chooseHairCon();

        tryAndReviewScreen.clickSaveBeautyConcern();

        tryAndReviewScreen.checkToastSuccess();
    }

    @And("^User complete data tnr on shipping information screen \"([^\"]*)\", \"([^\"]*)\" and set main address$")
    public void user_complete_data_tnr_on_shipping_information_screen_something_something_and_set_main_address(String firstName, String lastName) throws Throwable {
        tryAndReviewScreen.clickToCollapse();
        tryAndReviewScreen.clickAddNewAddressParticipantSum();
        tryAndReviewScreen.completeAddressBali(firstName, lastName);
        tryAndReviewScreen.checkToastSuccess();
    }

    @And("^User complete data tnr on shipping information screen \"([^\"]*)\" and set main address$")
    public void user_complete_data_tnr_on_shipping_information_screen_something_and_set_main_address(String phonenumber) throws InterruptedException {
        tryAndReviewScreen.clickToCollapse();
        tryAndReviewScreen.clickAddNewAddressParticipantSum();
        tryAndReviewScreen.completeAddressInputInvalidPhone(phonenumber);
    }

    @And("^User complete data tnr on shipping information screen but input invalid format postal code \"([^\"]*)\"$")
    public void user_complete_data_tnr_on_shipping_information_screen_but_input_invalid_format_postal_code_something(String postalCode) throws InterruptedException {
        tryAndReviewScreen.clickToCollapse();
        tryAndReviewScreen.clickAddNewAddressParticipantSum();
        tryAndReviewScreen.completeAddressInputInvalidPostal(postalCode);
    }

    @And("^User complete data tnr on shipping information screen but input exceed allowed length address$")
    public void user_complete_data_tnr_on_shipping_information_screen_but_input_exceed_allowed_length_address() throws InterruptedException {
        tryAndReviewScreen.clickToCollapse();
        tryAndReviewScreen.clickAddNewAddressParticipantSum();
        tryAndReviewScreen.completeAddressExceedCompleteAddress();
    }

    @When("^User choose any address to be main address$")
    public void user_choose_any_address_to_be_main_address() throws Throwable {
        tryAndReviewScreen.clickToCollapse();
        tryAndReviewScreen.clickEditAddressParticipantSum();
        tryAndReviewScreen.editAddressAsMainAddress();
        tryAndReviewScreen.checkToastSuccess();
        tryAndReviewScreen.isTrueLabelMainAddress();
        tryAndReviewScreen.clickChooseAddressFromList();
    }

    @When("^User save address form but let empty all mandatory field$")
    public void user_save_address_form_but_let_empty_all_mandatory_field() throws Throwable {
        tryAndReviewScreen.clickToCollapse();
        tryAndReviewScreen.clickAddNewAddressParticipantSum();
        tryAndReviewScreen.saveWithoutFillAllField();
    }

    @When("^User save address form but let empty first name$")
    public void user_save_address_form_but_let_empty_first_name() throws Throwable {
        tryAndReviewScreen.clickToCollapse();
        tryAndReviewScreen.clickAddNewAddressParticipantSum();
        tryAndReviewScreen.saveEmptyFirstName();
    }

    @When("^User save address form but let empty last name$")
    public void user_save_address_form_but_let_empty_last_name() throws Throwable {
        tryAndReviewScreen.clickToCollapse();
        tryAndReviewScreen.clickAddNewAddressParticipantSum();
        tryAndReviewScreen.saveEmptyLastName();
    }

    @When("^User save address form but let empty phone number$")
    public void user_save_address_form_but_let_empty_phone_number() throws Throwable {
        tryAndReviewScreen.clickToCollapse();
        tryAndReviewScreen.clickAddNewAddressParticipantSum();
        tryAndReviewScreen.fillFirstName();
        tryAndReviewScreen.fillLastName();
        tryAndReviewScreen.fillProvinceCityDistrict();
        tryAndReviewScreen.fillZipCode();
        tryAndReviewScreen.fillCompleteAddress();
        tryAndReviewScreen.clickSaveAddress();
    }

    @When("^User save address form but let empty province$")
    public void user_save_address_form_but_let_empty_province() throws Throwable {
        tryAndReviewScreen.clickToCollapse();
        tryAndReviewScreen.clickAddNewAddressParticipantSum();
        tryAndReviewScreen.fillFirstName();
        tryAndReviewScreen.fillLastName();
        tryAndReviewScreen.fillPhoneNumber();
        tryAndReviewScreen.fillZipCode();
        tryAndReviewScreen.fillCompleteAddress();
        tryAndReviewScreen.clickSaveAddress();
    }

    @When("^User save address form but let empty postal code$")
    public void user_save_address_form_but_let_empty_postal_code() throws Throwable {
        tryAndReviewScreen.clickToCollapse();
        tryAndReviewScreen.clickAddNewAddressParticipantSum();
        tryAndReviewScreen.fillFirstName();
        tryAndReviewScreen.fillLastName();
        tryAndReviewScreen.fillPhoneNumber();
        tryAndReviewScreen.fillProvinceCityDistrict();
        tryAndReviewScreen.fillCompleteAddress();
        tryAndReviewScreen.clickSaveAddress();
    }

    @When("^User save address form but let empty complete address$")
    public void user_save_address_form_but_let_empty_complete_address() throws Throwable {
        tryAndReviewScreen.clickToCollapse();
        tryAndReviewScreen.clickAddNewAddressParticipantSum();
        tryAndReviewScreen.waitAddressForm();
        tryAndReviewScreen.fillFirstName();
        tryAndReviewScreen.fillLastName();
        tryAndReviewScreen.fillPhoneNumber();
        tryAndReviewScreen.fillProvinceCityDistrict();
        tryAndReviewScreen.fillZipCode();
        tryAndReviewScreen.clickSaveAddress();
    }

    @When("^User clicks submit to join campaign using main address$")
    public void user_clicks_submit_to_join_campaign_using_main_address() throws Throwable {
        tryAndReviewScreen.clickToCollapse();
        tryAndReviewScreen.checkFlagMainAddress();
        tryAndReviewScreen.clickSaveJoinCampaign();
    }

    @When("^User clicks submit to join campaign$")
    public void user_clicks_submit_to_join_campaign() throws Throwable {
        tryAndReviewScreen.clickToCollapse();
        tryAndReviewScreen.clickSaveJoinCampaign();
    }


    @Then("^User will see label main address on participant summary form$")
    public void user_will_see_label_main_address_on_participant_summary_form() throws Throwable {
        tryAndReviewScreen.clickToCollapse();
        tryAndReviewScreen.checkFlagMainAddress();
    }

    @Then("^User will see success toast message after joined campaign$")
    public void user_will_see_success_toast_message_after_joined_campaign() throws Throwable {
        tryAndReviewScreen.checkToastSuccess();
    }

    @When("^User save data personal info screen without fill any field$")
    public void user_save_data_personal_info_screen_without_fill_any_field() throws Throwable {
        tryAndReviewScreen.clickEditPersonalInfo();
        tryAndReviewScreen.savePersonalInfoEmpty();
    }

    @Then("^Display red toast \"([^\"]*)\"$")
    public void display_red_toast_something(String msg) throws Throwable {
        tryAndReviewScreen.checkToastEmptyField(msg);
    }

    @When("^User input \"([^\"]*)\" fullname field and choose dob and gender$")
    public void user_input_something_fullname_field_and_choose_dob_and_gender(String fullname) throws Throwable {
        tryAndReviewScreen.clickEditPersonalInfo();
        tryAndReviewScreen.inputFullname(fullname);
        tryAndReviewScreen.chooseDob();
        tryAndReviewScreen.chooseGender();
    }

    @When("^User input correct \"([^\"]*)\" fullname field and choose dob$")
    public void user_input_correct_something_fullname_field_and_choose_dob(String validfullname) throws Throwable {
        tryAndReviewScreen.clickEditPersonalInfo();
        tryAndReviewScreen.inputFullname(validfullname);
        tryAndReviewScreen.chooseDob();
    }

    @When("^User input \"([^\"]*)\" fullname field$")
    public void user_input_something_fullname_field(String fullname, String strArg1) throws Throwable {
        tryAndReviewScreen.clickEditPersonalInfo();
        tryAndReviewScreen.inputPersonalInfoForm(fullname);
    }

    @And("^User save data personal info screen$")
    public void user_save_data_personal_info_screen() throws Throwable {
        tryAndReviewScreen.savePersonalInfoEmpty();
    }

    @And("^User save data personal info screen without choose gender$")
    public void user_save_data_personal_info_screen_without_choose_gender() throws Throwable {
        tryAndReviewScreen.savePersonalInfoEmpty();
    }

    @When("^User save more address after user already had 4 address$")
    public void user_save_more_address_after_user_already_had_4_address() throws Throwable {
        tryAndReviewScreen.clickToCollapse();
        tryAndReviewScreen.clickEditAddressParticipantSum();
        tryAndReviewScreen.clickAddNewAddressFromAddressList();
        tryAndReviewScreen.completeAddressBali("#FDBRMA-471","#FDBRMA-471");
        tryAndReviewScreen.checkToastSuccess();
    }

    @Then("^User will not see button add new address on list address screen$")
    public void user_will_not_see_button_add_new_address_on_list_address_screen() {
        tryAndReviewScreen.isFalseAddNewAddressPresent();
    }

}
