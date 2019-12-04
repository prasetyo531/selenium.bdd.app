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


    //set configuration
    public static String loadPropertyFile = "android.properties";

    @Before
    public AppiumDriver getDriver() throws IOException, InterruptedException{

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
        } catch (Exception e){
            System.out.println();
        } finally {
            driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
            androidIntroScreen = PageFactory.initElements(driver, AndroidIntroScreen.class);
            androidonboardingScreen = PageFactory.initElements(driver, AndroidOnboardingScreen.class);
        } return driver;

    }

    @After
    public void endDriver() throws InterruptedException, IOException {

        //driver.quit();
        AppiumServer.stop();

    }

}
