package androidPageObjects.nativeApp;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.DriverFactory;

import java.io.IOException;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;
import static utils.DriverFactory.driver;

public class AndroidOnboardingScreen extends DriverFactory {

	public AppiumDriver driver=null;

	@AndroidFindBy(id="com.fdbr.android.debug:id/imageAds")
	public AndroidElement SplashScreenImage;

	public AndroidOnboardingScreen(AppiumDriver driver) throws IOException {

		this.driver = driver;
	}

	//intro screen
	public void swipeAfterSplashScreen() throws IOException {

		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

//		this.horizontalSwipeByPercentage(SplashScreenImage,0.9,0.01,0.5,500);
//		this.horizontalSwipeByPercentage(SplashScreenImage, 0.9,0.01,0.5,500);

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
