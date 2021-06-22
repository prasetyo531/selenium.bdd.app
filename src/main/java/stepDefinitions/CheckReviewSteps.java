package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class CheckReviewSteps extends DriverFactory {

    @And("^User clicks other user profile menu \"([^\"]*)\" and select review$")
    public void user_clicks_other_user_profile_menu_something_and_select_review(String fullname) {

        homeScreen.clickSearch();
        homeScreen.clickUsersTab();
        homeScreen.inputSearch(fullname);
        homeScreen.clickFirstElementSearch();

        profileScreen.clickReviewsTab();
        profileScreen.clickRandomReviewListProfile();
    }

    @When("^User clicks share review from review detail$")
    public void user_clicks_share_review_from_review_detail() {

        addReviewScreen.waitReviewDetail();
        addReviewScreen.clickMoreReview();
        addReviewScreen.clickShareReview();
    }

    @When("^User clicks report review from review detail$")
    public void user_clicks_report_review_from_review_detail() {

        addReviewScreen.waitReviewDetail();
        addReviewScreen.clickMoreReview();
        addReviewScreen.clickReportReview();
    }

    @And("^User will see option which reason to reporting review$")
    public void user_will_see_option_which_reason_to_reporting_review() {

        addReviewScreen.chooseReasonNotRelevant();
    }

    @Then("^User will see toast msg after report review$")
    public void user_will_see_toast_msg_after_report_review() {

        addReviewScreen.findToastAfterReport();
    }
}
