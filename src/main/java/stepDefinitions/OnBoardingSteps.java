package stepDefinitions;

import androidPageObjects.nativeApp.AndroidOnboardingScreen;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import utils.DriverFactory;

import java.io.IOException;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

public class OnBoardingSteps extends DriverFactory {

    @Given("^user swipe images onboarding screen$")
    public void user_swipe_images_onboarding_screen() throws Throwable {

        androidonboardingScreen.swipeAfterSplashScreen();
    }
}
