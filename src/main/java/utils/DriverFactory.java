package utils;

import pageObjects.*;
import io.appium.java_client.AppiumDriver;

import java.io.IOException;

public class DriverFactory {

    //grid
    public static AppiumDriver driver;

    //set configuration
    public static String loadPropertyFile = "android.properties";

    /****************
     Android & IOS Screen
     ****************/
    public static OnboardingScreen onBoardingScreen;
    public static LoginScreen loginScreen;
    public static RegisterScreen registerScreen;
    public static CompleteAccountScreen completeAccountScreen;
    public static OtpScreen otpScreen;
    public static HomeScreen homeScreen;
    public static VerifyAccountScreen verifyAccountScreen;
    public static AddReviewScreen addReviewScreen;
    public static AddPostScreen addPostScreen;
    public static FeedScreen feedScreen;
    public static DiscoverScreen discoverScreen;
    public static CommentLikeScreen commentLikeScreen;
    public static TalkScreen talkScreen;

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
            // This is to Instantiate class by creating object
            onBoardingScreen = new OnboardingScreen(driver);
            loginScreen = new LoginScreen(driver);
            registerScreen = new RegisterScreen(driver);
            completeAccountScreen = new CompleteAccountScreen(driver);
            otpScreen = new OtpScreen(driver);
            homeScreen = new HomeScreen(driver);
            verifyAccountScreen = new VerifyAccountScreen(driver);
            addReviewScreen = new AddReviewScreen(driver);
            addPostScreen = new AddPostScreen(driver);
            feedScreen = new FeedScreen(driver);
            discoverScreen = new DiscoverScreen(driver);
            commentLikeScreen = new CommentLikeScreen(driver);
            talkScreen = new TalkScreen(driver);
        }
        return driver;
    }

}
