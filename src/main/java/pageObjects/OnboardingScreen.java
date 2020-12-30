package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class OnboardingScreen extends ActionBase {

    /*  intro   */
    @AndroidFindBy(id="com.fdbr.android:id/buttonNext")
    @iOSXCUITFindBy(id="NEXT")
    public MobileElement nextIntroScreenBtn;

    @AndroidFindBy(id="com.fdbr.android:id/imageAds")
    public MobileElement splashScreenImage;

    @AndroidFindBy(id="com.fdbr.android:id/buttonGetStarted")
    @iOSXCUITFindBy(id="Get Started")
    public MobileElement getStartedBtn;

    @AndroidFindBy(id="com.fdbr.android:id/buttonNext")
    public MobileElement nextIntroBtn;

    /*  onboarding screen */
    @AndroidFindBy(id="com.fdbr.android.auth:id/buttonLogin")
    @iOSXCUITFindBy(id="LOGIN")
    public MobileElement loginBtn;

    @AndroidFindBy(id="com.fdbr.android.auth:id/buttonSignUp")
    @iOSXCUITFindBy(id="SIGN UP")
    public MobileElement signupBtn;

    @AndroidFindBy(id="com.fdbr.android.auth:id/buttonTerms")
    @iOSXCUITFindBy(id="SIGN UP")
    public MobileElement labelTerms;

    @AndroidFindBy(id="com.fdbr.android.auth:id/buttonPrivacy")
    @iOSXCUITFindBy(id="SIGN UP")
    public MobileElement labelPrivacy;

    // This is a constructor, as every page need a base driver to find android elements
    public OnboardingScreen(AppiumDriver driver) {

        this.driver = driver;
        //Initialize Elements of a Page class without having to use ‘FindElement‘ or ‘FindElements‘
        PageFactory.initElements(new AppiumFieldDecorator(this.driver),this);
    }

    //intro screen
    public OnboardingScreen swipeAfterSplashScreen() {
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        isElementPresent(splashScreenImage);
        this.horizontalSwipeByPercentage(splashScreenImage,0.9,0.01,0.5,500);
        this.horizontalSwipeByPercentage(splashScreenImage, 0.9,0.01,0.5,500);
        return new OnboardingScreen(driver);

    }

    public OnboardingScreen clickNextIntroBtn() {
        //tapByElement(nextIntroBtn);
        tapByElement(nextIntroScreenBtn);
        tapByElement(nextIntroScreenBtn);
        return new OnboardingScreen(driver);
    }

    public OnboardingScreen clickGetStartedBtn() {
        tapByElement(getStartedBtn);
        return new OnboardingScreen(driver);
    }


    public OnboardingScreen clickLoginBtn() {
        isElementEnabled(loginBtn);
        tapByElement(loginBtn);
        return new OnboardingScreen(driver);
    }

    public OnboardingScreen clickSignupBtn() {
        isElementEnabled(signupBtn);
        tapByElement(signupBtn);
        return new OnboardingScreen(driver);
    }
}
