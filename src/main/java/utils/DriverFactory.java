package utils;

import org.testng.annotations.Parameters;
import pageObjects.*;
import io.appium.java_client.AppiumDriver;

import java.io.IOException;

public class DriverFactory {

    //grid
    public static AppiumDriver driver;

    /****************
     Android & IOS Screen
     ****************/
    public static OnboardingScreen onBoardingScreen;
    public static LoginScreen loginScreen;
    public static HomeScreen homeScreen;
    public static OtpScreen otpScreen;
    public static RegisterScreen registerScreen;

    public AppiumDriver getDriver() throws IOException {

        //set configuration
        String loadPropertyFile = "android.properties";

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
            // This is to Instantiate class by creating object
            onBoardingScreen = new OnboardingScreen(driver);
            loginScreen = new LoginScreen(driver);
            registerScreen = new RegisterScreen(driver);
            homeScreen = new HomeScreen(driver);
            otpScreen = new OtpScreen(driver);
        }
        return driver;
    }

}
