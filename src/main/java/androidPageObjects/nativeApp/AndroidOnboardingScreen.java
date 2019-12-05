package androidPageObjects.nativeApp;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.io.IOException;

public class AndroidOnboardingScreen extends ActionBaseAndroid {

	@AndroidFindBy(id="com.fdbr.android.debug:id/imageAds")
	public AndroidElement SplashScreenImage;

	
	public AndroidOnboardingScreen() throws IOException {

		super();
		System.out.println("Settings Main page class has been initialized");
	}

	//intro screen
	public AndroidOnboardingScreen swipeAfterSplashScreen() throws IOException {

		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		this.horizontalSwipeByPercentage(SplashScreenImage,0.9,0.01,0.5,500);
		this.horizontalSwipeByPercentage(SplashScreenImage, 0.9,0.01,0.5,500);
		return new AndroidOnboardingScreen();
	}


}
