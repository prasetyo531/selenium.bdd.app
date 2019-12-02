package androidScreen.nativeApp;

import com.fdn.appium.base.screenBaseAndroid;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AndroidOnboardingScreen extends screenBaseAndroid {

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
	
	public AndroidOnboardingScreen(AndroidDriver driver){
		
		super(driver);
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
