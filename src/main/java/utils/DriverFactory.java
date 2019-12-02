package utils;

import androidScreen.nativeApp.AndroidIntroScreen;
import androidScreen.nativeApp.AndroidOnboardingScreen;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.AppiumDriver;

import java.io.IOException;

public class DriverFactory {

    //grid
    public static AppiumDriver driver;


    /****************
     Android Screen
     ****************/
    public AndroidIntroScreen androidIntroScreen;
    public AndroidOnboardingScreen androidonboardingScreen;


    /****************
     IOS Screen
     ****************/


    //set configuration
    public static String loadPropertyFile = "ios.properties";

    @Before
    public void setUp() throws IOException, InterruptedException{

        if(driver==null){

            AppiumServer.stop();
            AppiumServer.start();

            if(loadPropertyFile.contains("ios")){
                CommonUtils.loadIosConfigProp("ios.properties");
                CommonUtils.setIOSCapabilities();
                driver = CommonUtils.getIOSDriver();
            } else if(loadPropertyFile.contains("android")){
                CommonUtils.loadAndroidConfigProp("android.properties");
                CommonUtils.setAndroidCapabilities();
                driver = CommonUtils.getAndroidDriver();
            }
        }

    }

    @After
    public void tearDown(Scenario scenario) throws InterruptedException{

        //driver.quit();
        AppiumServer.stop();

    }

}
