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
	public void swipeAfterSplashScreen(){

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		this.horizontalSwipeByPercentage(SplashScreenImage,0.9,0.01,0.5,500);
		this.horizontalSwipeByPercentage(SplashScreenImage, 0.9,0.01,0.5,500);
	}

	public void clickGetStartedBtn() throws InterruptedException {

		Thread.sleep(900);
		tapByElement(GetStartedBtn);
		//GetStartedBtn.click();
	}


	//onboarding screen
	public void clickLoginBtn(){
		tapByElement(LoginBtn);
		//LoginBtn.click();
	}

	public void clickSignupBtn(){
		tapByElement(SignupBtn);
		//SignupBtn.click();
	}

	public void clickFacebookBtn(){
		tapByElement(FacebookBtn);
		//FacebookBtn.click();
	}

	public AndroidOnboardingScreen typeData(String data){
		
		textField.sendKeys(data);
		
		return this;
		
	}

}
