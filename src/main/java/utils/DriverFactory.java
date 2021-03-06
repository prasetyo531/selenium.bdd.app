package utils;

import pageObjects.*;
import io.appium.java_client.AppiumDriver;

import java.io.IOException;

public class DriverFactory {

    //grid
    public static AppiumDriver driver;
    //public static Process process;

    //set configuration
    public String loadPropertyFile = "android.properties";

    protected static ThreadLocal <String> dateTime = new ThreadLocal<String>();

    /****************
     Android & IOS Screen
     ****************/
    public static OnboardingScreen onBoardingScreen;
    public static LoginScreen loginScreen;
    public static RegisterScreen registerScreen;
    public static CompleteAccountScreen completeAccountScreen;
    public static OtpScreen otpScreen;
    public static HomeScreen homeScreen;
    public static ProductCategoryScreen productCategoryScreen;
    public static ProductListFilterSortScreen productListFilterSortScreen;
    public static VerifyAccountScreen verifyAccountScreen;
    public static ProductDetailScreen productDetailScreen;
    public static AddReviewScreen addReviewScreen;
    public static AddPostScreen addPostScreen;
    public static AddProductScreen addProductScreen;
    public static FeedScreen feedScreen;
    public static DiscoverScreen discoverScreen;
    public static CommentLikeScreen commentLikeScreen;
    public static ProfileScreen profileScreen;
    public static ReviewListScreen reviewListScreen;
    public static TalkScreen talkScreen;
    public static OthersScreen othersScreen;
    public static ModalPostTagProductScreen modalPostTagProductScreen;
    public static TryAndReviewScreen tryAndReviewScreen;
    public static BrandScreen brandScreen;
    public static FollowerFollowingScreen followerFollowingScreen;
    public static FeedbackScreen feedbackScreen;
    public static InviteFriendsScreen inviteFriendsScreen;

    public AppiumDriver getDriver() throws IOException {
        try {
            //Thread.sleep(3000);
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
            productCategoryScreen = new ProductCategoryScreen(driver);
            productListFilterSortScreen = new ProductListFilterSortScreen(driver);
            verifyAccountScreen = new VerifyAccountScreen(driver);
            productDetailScreen = new ProductDetailScreen(driver);
            addReviewScreen = new AddReviewScreen(driver);
            addPostScreen = new AddPostScreen(driver);
            addProductScreen = new AddProductScreen(driver);
            feedScreen = new FeedScreen(driver);
            discoverScreen = new DiscoverScreen(driver);
            commentLikeScreen = new CommentLikeScreen(driver);
            profileScreen = new ProfileScreen(driver);
            reviewListScreen = new ReviewListScreen(driver);
            talkScreen = new TalkScreen(driver);
            othersScreen = new OthersScreen(driver);
            modalPostTagProductScreen = new ModalPostTagProductScreen(driver);
            tryAndReviewScreen = new TryAndReviewScreen(driver);
            brandScreen = new BrandScreen(driver);
            followerFollowingScreen = new FollowerFollowingScreen(driver);
            feedbackScreen = new FeedbackScreen(driver);
            inviteFriendsScreen = new InviteFriendsScreen(driver);
        }
        return driver;
    }

    public String getDateTime() {
        return dateTime.get();
    }
}
