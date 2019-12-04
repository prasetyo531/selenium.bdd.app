package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import utils.DriverFactory;

public class IntroSteps extends DriverFactory {

    @Given("^user open the apps$")
    public void user_open_the_apps() throws Throwable {

        androidIntroScreen.openApps();
    }
}
