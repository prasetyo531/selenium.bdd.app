package utils;

import pageObjects.HomeScreen;
import pageObjects.LoginScreen;
import pageObjects.OnboardingScreen;
import io.appium.java_client.AppiumDriver;

import java.io.IOException;

public class DriverFactory {

    //grid
    public static AppiumDriver driver;

    /****************
     Android Screen
     ****************/
    public static OnboardingScreen androidOnboardingScreen;
    public static LoginScreen androidLoginScreen;
    public static HomeScreen androidHomeScreen;


    /****************
     IOS Screen
     ****************/

    //set configuration
    public static String loadPropertyFile = "ios.properties";

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
            androidOnboardingScreen = new OnboardingScreen(driver);
            androidLoginScreen = new LoginScreen(driver);
            androidHomeScreen = new HomeScreen(driver);
        }
        return driver;
    }

}
