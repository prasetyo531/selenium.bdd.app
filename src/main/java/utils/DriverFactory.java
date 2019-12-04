package utils;

import androidPageObjects.nativeApp.AndroidOnboardingScreen;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;

public class DriverFactory {

    //grid
    public static AppiumDriver driver;

    /****************
     Android Screen
     ****************/
    public static AndroidOnboardingScreen androidonboardingScreen;


    /****************
     IOS Screen
     ****************/


    public AppiumDriver getDriver() throws IOException, InterruptedException{

        androidonboardingScreen = PageFactory.initElements(driver, AndroidOnboardingScreen.class);
        return driver;
    }

}
