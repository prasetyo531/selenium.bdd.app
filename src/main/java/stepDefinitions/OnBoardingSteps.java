package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class OnBoardingSteps extends DriverFactory {

    @When("^user swipe images onboarding screen$")
    public void user_swipe_images_onboarding_screen() throws Throwable {

        androidonboardingScreen.swipeAfterSplashScreen();
    }
}
