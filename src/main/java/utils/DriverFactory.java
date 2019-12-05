package utils;

import androidPageObjects.nativeApp.AndroidOnboardingScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;

public class DriverFactory {

    //grid
    public static AppiumDriver<MobileElement> driver;

    /****************
     Android Screen
     ****************/
    public static AndroidOnboardingScreen androidonboardingScreen;


    /****************
     IOS Screen
     ****************/

    //set configuration
    public static String loadPropertyFile = "android.properties";

    public AppiumDriver<MobileElement> getDriver() {

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
        }
        return driver;
    }

}
