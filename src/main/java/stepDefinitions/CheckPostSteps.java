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

    @Then("^User will see option which reason to reporting post$")
    public void user_will_see_option_which_reason_to_reporting_post() throws Throwable {

        feedScreen.chooseReasonNotRelevant();

        //toast success report
        feedScreen.findToastAfterReport();
    }

    @When("^User clicks share post from feed menu$")
    public void user_clicks_share_post_from_feed_menu() throws Throwable {

        feedScreen.clickReadMorePost();
        feedScreen.clickSharePost();
    }

    @Then("^User will see option which app to taking share$")
    public void user_will_see_option_which_app_to_taking_share() throws Throwable {

        othersScreen.findDrawerOptionShare();
    }

    @And("^User clicks profile menu and select post$")
    public void user_clicks_profile_menu_and_select_post() throws Throwable {

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
    }

    @Then("^User will see confirmation dialog to delete post$")
    public void user_will_see_confirmation_dialog_to_delete_post() throws Throwable {

        feedScreen.chooseNoDeletePost();
    }

}
