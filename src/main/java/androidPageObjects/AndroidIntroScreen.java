package androidPageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverFactory;

import java.io.IOException;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

public class AndroidIntroScreen extends ActionBaseAndroid {

	@AndroidFindBy(id="com.fdbr.android.debug:id/imageAds")
	public AndroidElement SplashScreenImage;

	@AndroidFindBy(id="com.fdbr.android.debug:id/buttonGetStarted")
	public AndroidElement GetStartedBtn;


	public AndroidIntroScreen(AppiumDriver driver) throws IOException {

		this.driver = driver;
		//Initialize Elements of a Page class without having to use ‘FindElement‘ or ‘FindElements‘
		PageFactory.initElements(new AppiumFieldDecorator(this.driver),this);
	}

	//intro screen
	public void swipeAfterSplashScreen() throws IOException {

		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		this.horizontalSwipeByPercentage(SplashScreenImage,0.9,0.01,0.5,500);
		this.horizontalSwipeByPercentage(SplashScreenImage, 0.9,0.01,0.5,500);

	}

	public void clickGetStartedBtn() throws InterruptedException {

		tapByElement(GetStartedBtn);
	}


}
