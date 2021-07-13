package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class CheckPostSteps extends DriverFactory {

    @When("^User clicks report post from feed menu$")
    public void user_clicks_report_post_from_feed_menu() throws Throwable {

        feedScreen.clickReadMorePost();
        feedScreen.clickReportPost();
    }

    @And("^User will see option which reason to reporting post$")
    public void user_will_see_option_which_reason_to_reporting_post() throws Throwable {

        feedScreen.chooseReasonNotRelevant();
    }

    @Then("^User will see toast msg after report post$")
    public void user_will_see_toast_msg_after_report_post() throws Throwable {

        //toast success report
        feedScreen.findToastAfterReport();
    }

    @When("^User clicks share post from feed menu$")
    public void user_clicks_share_post_from_feed_menu() throws Throwable {

        feedScreen.clickReadMorePost();
        feedScreen.clickSharePost();
    }

    @Then("^User will see option which app to taking share$")
    public void user_will_see_option_which_app_to_taking_share() {

        othersScreen.findDrawerOptionShare();
    }

    @And("^User clicks profile menu and select post$")
    public void user_clicks_profile_menu_and_select_post() {

        homeScreen.clickProfileHomeMenu();
        profileScreen.clickFirstPostProfile();
    }

    @When("^User clicks share post from profile menu$")
    public void user_clicks_share_post_from_profile_menu() throws Throwable {

        feedScreen.checkIsonOwnFeeds();
        feedScreen.clickReadMorePost();
        feedScreen.clickSharePost();
    }

    @When("^User clicks delete post from profile menu$")
    public void user_clicks_delete_post_from_profile_menu() throws Throwable {

        feedScreen.clickReadMorePost();
        feedScreen.clickDeletePost();
        feedScreen.chooseYesDeletePost();
    }

    @When("^User clicks tag icon in post from feed menu$")
    public void user_clicks_tag_icon_in_post_from_feed_menu() throws Throwable {

        homeScreen.clickFeedMenu();

        feedScreen.clickPostTagProduct();
    }

    @Then("^User will see personal rating and review for product$")
    public void user_will_see_personal_rating_and_review_for_product() throws Throwable {

        modalPostTagProductScreen.checkElementPresentTaggedProductReviewPost();
    }

    @Then("^User will see overall rating for product$")
    public void user_will_see_overall_rating_for_product() throws Throwable {

        modalPostTagProductScreen.checkElementPresentTaggedProductPost();
    }
}
