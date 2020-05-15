package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class VerifyAccountSteps extends DriverFactory {

    @Then("^user will see modal account status on homescreen$")
    public void user_will_see_modal_account_status_on_homescreen() throws Throwable {

        homeScreen.verifyAccountStatusModal();
    }

    @When("^user click complete verify button on modal$")
    public void user_click_complete_verify_button_on_modal() throws Throwable {

        homeScreen.clickAccountCompleteVerBtn();
    }

    //***   modal account status    ***
}
