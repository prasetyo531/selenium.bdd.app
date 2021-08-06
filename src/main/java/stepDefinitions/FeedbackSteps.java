package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class FeedbackSteps extends DriverFactory {

    @Given("^User open profile then open feedback menu$")
    public void user_open_profile_then_open_feedback_menu() {
        homeScreen.clickProfileHomeMenu();
        profileScreen.clickSettingProfile();
        profileScreen.clickDrawerSupport();
        profileScreen.clickMenuFeedback();
    }

    @When("^User click submit$")
    public void user_click_submit() {
        feedbackScreen.clickSubmit();
    }

    @Then("^display modal popup to fill out field$")
    public void display_modal_popup_to_fill_out_field() {
        feedbackScreen.isErrorModalAppear();
    }

    @When("^User fill out all field and click submit$")
    public void user_fill_out_all_field_and_click_submit() {
        feedbackScreen.inputFeedback();
        feedbackScreen.clickSubmit();
    }

    @Then("^display success modal popup$")
    public void display_success_modal_popup() {
        feedbackScreen.issuccessModalAppear();
    }

    @When("^User fill out all field and attach screenshot$")
    public void user_fill_out_all_field_and_attach_screenshot() {
        feedbackScreen.inputFeedbackWithScreenshot();
        feedbackScreen.clickSubmit();
    }
}
