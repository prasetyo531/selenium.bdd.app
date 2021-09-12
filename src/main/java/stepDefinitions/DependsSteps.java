package stepDefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import utils.DriverFactory;

public class DependsSteps extends DriverFactory {

    @Before("@AddPost1")
    public void user_open_app_and_login() {
        onBoardingScreen.swipeAfterSplashScreen();
        onBoardingScreen.clickGetStartedBtn();

        onBoardingScreen.clickLoginBtn();
    }
}
