package stepDefinitions;

import androidPageObjects.nativeApp.AndroidOnboardingScreen;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import utils.DriverFactory;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

public class OnBoardingSteps extends DriverFactory {


    @Given("^user swipe images onboarding screen$")
    public void user_swipe_images_onboarding_screen() throws Throwable {

        Dimension size = driver.manage().window().getSize();
        int anchor = (int) (size.height * 0.5);
        int startPoint = (int) (size.width * 0.9);
        int endPoint = (int) (size.width * 0.1);

        new TouchAction(driver)
                .tap(tapOptions().withElement(element(driver.findElement(By.id("com.fdbr.android.debug:id/imageAds")))))
                .press(point(startPoint, anchor))
                .waitAction(waitOptions(ofMillis(1000)))
                .moveTo(point(endPoint, anchor))
                .release().perform();

        new TouchAction(driver)
                .tap(tapOptions().withElement(element(driver.findElement(By.id("com.fdbr.android.debug:id/imageAds")))))
                .press(point(startPoint, anchor))
                .waitAction(waitOptions(ofMillis(1000)))
                .moveTo(point(endPoint, anchor))
                .release().perform();
    }
}
