package androidPageObjects.nativeApp;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

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

	public AndroidOnboardingScreen clickGetStartedBtn() throws IOException, InterruptedException {

		Thread.sleep(900);
		tapByElement(GetStartedBtn);
		//GetStartedBtn.click();
		return new AndroidOnboardingScreen();
	}


	//onboarding screen
	public AndroidOnboardingScreen clickLoginBtn() throws IOException {
		tapByElement(LoginBtn);
		//LoginBtn.click();
		return new AndroidOnboardingScreen();
	}

	public AndroidOnboardingScreen clickSignupBtn() throws IOException {
		tapByElement(SignupBtn);
		//SignupBtn.click();
		return new AndroidOnboardingScreen();
	}

	public AndroidOnboardingScreen clickFacebookBtn() throws IOException {
		tapByElement(FacebookBtn);
		//FacebookBtn.click();
		return new AndroidOnboardingScreen();
	}

}
