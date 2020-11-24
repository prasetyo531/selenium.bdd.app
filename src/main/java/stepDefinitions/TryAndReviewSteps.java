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
    }

    @And("^User complete data tnr on shipping information screen \"([^\"]*)\", \"([^\"]*)\" and set main address$")
    public void user_complete_data_tnr_on_shipping_information_screen_something_something_and_set_main_address(String firstname, String lastname) throws Throwable {
        tryAndReviewScreen.clickToCollapse();
        tryAndReviewScreen.clickAddNewAddressParticipantSum();
        tryAndReviewScreen.completeAddressBali(firstname, lastname);
    }

    @When("^User clicks submit to join campaign using main address$")
    public void user_clicks_submit_to_join_campaign_using_main_address() throws Throwable {
        tryAndReviewScreen.clickToCollapse();
        tryAndReviewScreen.checkFlagMainAddress();
        tryAndReviewScreen.clickSaveJoinCampaign();

    }

    @Then("^User will see success toast message after joined campaign$")
    public void user_will_see_success_toast_message_after_joined_campaign() throws Throwable {
        tryAndReviewScreen.checkToastSuccess();
    }

}
