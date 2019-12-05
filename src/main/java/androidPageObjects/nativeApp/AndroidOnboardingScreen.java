package androidPageObjects.nativeApp;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;
import static utils.DriverFactory.driver;

public class AndroidOnboardingScreen extends ActionBaseAndroid {

	@AndroidFindBy(id="com.fdbr.android.debug:id/imageAds")
	public AndroidElement SplashScreenImage;


	public AndroidOnboardingScreen() throws IOException {
		super();
	}

	//intro screen
	public AndroidOnboardingScreen swipeAfterSplashScreen() throws IOException {

		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		this.horizontalSwipeByPercentage(SplashScreenImage,0.9,0.01,0.5,500);
		this.horizontalSwipeByPercentage(SplashScreenImage, 0.9,0.01,0.5,500);
		return new AndroidOnboardingScreen();
	}


}
