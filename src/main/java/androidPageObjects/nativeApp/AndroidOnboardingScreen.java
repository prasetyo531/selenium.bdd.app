package androidPageObjects.nativeApp;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class AndroidOnboardingScreen extends ActionBaseAndroid {

	@AndroidFindBy(id="com.fdbr.android.debug:id/imageAds")
	public AndroidElement SplashScreenImage;

	@AndroidFindBy(id="com.fdbr.android.debug:id/buttonGetStarted")
	public AndroidElement GetStartedBtn;

	@AndroidFindBy(id="com.fdbr.android.debug:id/buttonLogin")
	public AndroidElement LoginBtn;

	@AndroidFindBy(id="com.fdbr.android.debug:id/buttonSignUp")
	public AndroidElement SignupBtn;

	@AndroidFindBy(id="com.fdbr.android.debug:id/buttonFacebook")
	public AndroidElement FacebookBtn;

	@AndroidFindBy(id="io.selendroid.testapp:id/visibleButtonTest")
	public AndroidElement textField;

	@AndroidFindBy(id="io.selendroid.testapp:id/visibleTextView")
	public AndroidElement displayBtn;
	
	public AndroidOnboardingScreen(AppiumDriver<MobileElement> driver) throws IOException {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//intro screen
	public void swipeAfterSplashScreen() throws IOException {

		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		this.horizontalSwipeByPercentage(SplashScreenImage,0.9,0.01,0.5,500);
		this.horizontalSwipeByPercentage(SplashScreenImage, 0.9,0.01,0.5,500);
	}

	public void clickGetStartedBtn() throws IOException, InterruptedException {

		Thread.sleep(900);
		tapByElement(GetStartedBtn);
		//GetStartedBtn.click();
	}


	//onboarding screen
	public void clickLoginBtn() throws IOException {
		tapByElement(LoginBtn);
		//LoginBtn.click();
	}

	public void clickSignupBtn() throws IOException {
		tapByElement(SignupBtn);
		//SignupBtn.click();
	}

	public void clickFacebookBtn() throws IOException {
		tapByElement(FacebookBtn);
		//FacebookBtn.click();
	}

}
