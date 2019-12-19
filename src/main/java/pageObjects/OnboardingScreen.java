package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class OnboardingScreen extends ActionBase {

    /*
    intro
     */
    @AndroidFindBy(id="com.fdbr.android.debug:id/buttonNext")
    @iOSFindBy(id="NEXT")
    public MobileElement nextIntroScreenBtn;

    @AndroidFindBy(id="com.fdbr.android.debug:id/imageAds")
    public MobileElement splashScreenImage;

    @AndroidFindBy(id="com.fdbr.android.debug:id/buttonGetStarted")
    @iOSFindBy(id="Get Started")
    public MobileElement getStartedBtn;

    @AndroidFindBy(id="com.fdbr.android.debug:id/buttonNext")
    public MobileElement nextIntroBtn;

    /*
    onboarding
     */
    @AndroidFindBy(id="com.fdbr.android.debug:id/buttonLogin")
    @iOSFindBy(id="Log In")
    public MobileElement loginBtn;

    @AndroidFindBy(id="com.fdbr.android.debug:id/buttonSignUp")
    public MobileElement signupBtn;


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
        tapByElementMobileElement(nextIntroScreenBtn);
        tapByElementMobileElement(nextIntroScreenBtn);
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
