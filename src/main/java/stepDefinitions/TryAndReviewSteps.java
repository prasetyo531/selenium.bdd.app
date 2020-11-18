package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class TryAndReviewSteps extends DriverFactory {

    @When("^User clicks join campaign from campaign detail of highlighted campaign$")
    public void user_clicks_join_campaign_from_campaign_detail_of_highlighted_campaign() throws Throwable {
        tryAndReviewScreen.clickMoreAndJoinHiglightedCamp();
    }
}
