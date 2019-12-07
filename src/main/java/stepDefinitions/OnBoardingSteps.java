package stepDefinitions;

import cucumber.api.java.en.Given;
import utils.DriverFactory;

import static io.appium.java_client.touch.offset.ElementOption.element;

public class OnBoardingSteps extends DriverFactory {

    @Given("^user swipe images onboarding screen$")
    public void user_swipe_images_onboarding_screen() throws Throwable {

        androidIntroScreen.swipeAfterSplashScreen();
        androidIntroScreen.clickGetStartedBtn();
    }
}
