package utils;

import androidPageObjects.AndroidIntroScreen;
import androidPageObjects.AndroidOnboardingScreen;
import io.appium.java_client.AppiumDriver;

import java.io.IOException;

public class DriverFactory {

    //grid
    public static AppiumDriver driver;

    /****************
     Android Screen
     ****************/
    public static AndroidIntroScreen androidIntroScreen;
    public static AndroidOnboardingScreen androidOnboardingScreen;


    /****************
     IOS Screen
     ****************/

    //set configuration
    public static String loadPropertyFile = "android.properties";

    public AppiumDriver getDriver() throws IOException {

        try {
            if (driver == null) {

                AppiumServer.stop();
                AppiumServer.start();

                if (loadPropertyFile.contains("ios")) {
                    CommonUtils.loadIosConfigProp("ios.properties");
                    CommonUtils.setIOSCapabilities();
                    driver = CommonUtils.getIOSDriver();
                } else if (loadPropertyFile.contains("android")) {
                    CommonUtils.loadAndroidConfigProp("android.properties");
                    CommonUtils.setAndroidCapabilities();
                    driver = CommonUtils.getAndroidDriver();
                }
            }
        } catch (Exception e) {
            System.out.println("Unable to load apps: " + e.getMessage());
        } finally {
            // This is to Instantiate class
            androidIntroScreen = new AndroidIntroScreen(driver);
            androidOnboardingScreen = new AndroidOnboardingScreen(driver);
        }
        return driver;
    }

}
