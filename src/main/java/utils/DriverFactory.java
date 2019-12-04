package utils;

import androidPageObjects.nativeApp.AndroidIntroScreen;
import androidPageObjects.nativeApp.AndroidOnboardingScreen;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class DriverFactory {

    //grid
    public static AppiumDriver driver;

    /****************
     Android Screen
     ****************/
    public static AndroidIntroScreen androidIntroScreen;
    public static AndroidOnboardingScreen androidonboardingScreen;


    /****************
     IOS Screen
     ****************/


    public AppiumDriver getDriver() throws IOException, InterruptedException{

        androidIntroScreen = PageFactory.initElements(driver, AndroidIntroScreen.class);
        androidonboardingScreen = PageFactory.initElements(driver, AndroidOnboardingScreen.class);
        return driver;
    }

    public void endDriver() throws InterruptedException, IOException {

        //driver.quit();
        AppiumServer.stop();

    }

}
