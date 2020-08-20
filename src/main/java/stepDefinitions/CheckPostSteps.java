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
}
