package androidPageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class AndroidOnboardingScreen extends ActionBaseAndroid {

    /*
    intro
     */
    @AndroidFindBy(id="com.fdbr.android.debug:id/imageAds")
    public AndroidElement splashScreenImage;

    @AndroidFindBy(id="com.fdbr.android.debug:id/buttonGetStarted")
    public AndroidElement getStartedBtn;

    @AndroidFindBy(id="com.fdbr.android.debug:id/buttonNext")
    public AndroidElement nextIntroBtn;

    /*
    onboarding
     */
    @AndroidFindBy(id="com.fdbr.android.debug:id/buttonLogin")
    public AndroidElement loginBtn;

    @AndroidFindBy(id="com.fdbr.android.debug:id/buttonSignUp")
    public AndroidElement signupBtn;


    // This is a constructor, as every page need a base driver to find android elements
    public AndroidOnboardingScreen(AppiumDriver driver) throws IOException {

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

        tapByElement(nextIntroBtn);
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
