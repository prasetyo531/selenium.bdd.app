package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import utils.DriverFactory;

public class VerifyAccountSteps extends DriverFactory {

    @Then("^user will see modal account status on homescreen$")
    public void user_will_see_modal_account_status_on_homescreen() throws Throwable {

        homeScreen.verifyAccountStatusModal();
    }
}
