package androidScreen.nativeApp;

import base.ScreenbaseAndroid;
import com.fdn.appium.base.screenBaseAndroid;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.concurrent.TimeUnit;

import static utils.DriverFactory.driver;

public class AndroidIntroScreen extends ScreenbaseAndroid {

    @AndroidFindBy(id="com.fdbr.android.debug:id/imageAds")
    public AndroidElement SplashScreenImage;

    @AndroidFindBy(id="com.fdbr.android.debug:id/buttonGetStarted")
    public AndroidElement GetStartedBtn;


    public AndroidIntroScreen(AndroidDriver driver){

        super(driver);
    }

    public void findnextBtn(){


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
}
