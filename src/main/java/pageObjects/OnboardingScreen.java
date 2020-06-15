package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class OnboardingScreen extends ActionBase {

    /*  intro   */
    @AndroidFindBy(id="com.fdbr.android:id/buttonNext")
    @iOSFindBy(id="NEXT")
    public MobileElement nextIntroScreenBtn;

    @AndroidFindBy(id="com.fdbr.android:id/imageAds")
    public MobileElement splashScreenImage;

    @AndroidFindBy(id="com.fdbr.android:id/buttonGetStarted")
    @iOSFindBy(id="Get Started")
    public MobileElement getStartedBtn;

    @AndroidFindBy(id="com.fdbr.android:id/buttonNext")
    public MobileElement nextIntroBtn;

    /*  onboarding screen */
    @AndroidFindBy(id="com.fdbr.android.auth:id/buttonLogin")
    @iOSFindBy(id="LOGIN")
    public MobileElement loginBtn;

    @AndroidFindBy(id="com.fdbr.android.auth:id/buttonSignUp")
    @iOSFindBy(id="SIGN UP")
    public MobileElement signupBtn;

    @AndroidFindBy(id="com.fdbr.android.auth:id/buttonTerms")
    @iOSFindBy(id="SIGN UP")
    public MobileElement labelTerms;

    @AndroidFindBy(id="com.fdbr.android.auth:id/buttonPrivacy")
    @iOSFindBy(id="SIGN UP")
    public MobileElement labelPrivacy;

    // This is a constructor, as every page need a base driver to find android elements
    public OnboardingScreen(AppiumDriver driver) throws IOException {

        this.driver = driver;
        //Initialize Elements of a Page class without having to use ‘FindElement‘ or ‘FindElements‘
        PageFactory.initElements(new AppiumFieldDecorator(this.driver),this);
    }

    //intro screen
    public void swipeAfterSplashScreen() throws IOException {

        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        this.horizontalSwipeByPercentage(splashScreenImage,0.9,0.01,0.5,500);
        this.horizontalSwipeByPercentage(splashScreenImage, 0.9,0.01,0.5,500);

    }

    public void clickNextIntroBtn() {

        //tapByElement(nextIntroBtn);
        tapByElement(nextIntroScreenBtn);
        tapByElement(nextIntroScreenBtn);
    }

    public void clickGetStartedBtn() throws InterruptedException {

        tapByElement(getStartedBtn);
    }


    public void clickLoginBtn() {

        tapByElement(loginBtn);
    }

    public void clickSignupBtn() {

        tapByElement(signupBtn);
    }

}
