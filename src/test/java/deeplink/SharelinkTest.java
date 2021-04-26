package deeplink;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

public class SharelinkTest {

    protected AppiumDriver driver;
    public WebDriverWait wait;

    @BeforeTest
    public void setup () throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "RR8M90CMW9N");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
        capabilities.setCapability(MobileCapabilityType.APPLICATION_NAME, "com.fdbr.android");
        capabilities.setCapability("appActivity", "com.fdbr.android.application.base.AmSplash");
        capabilities.setCapability("appPackage", "com.fdbr.android");
        capabilities.setCapability("noReset", true);
        driver = new AndroidDriver(new URL("http://0.0.0.0:4725/wd/hub"),capabilities);
        wait = new WebDriverWait(driver, 10);
    }

    @Test(priority = 1)
    public void runShareLinkProductDetail() {
        try {
            HashMap<String, String> deepUrl = new HashMap<>();
            deepUrl.put("url", "https://femaledaily.link/1kunbq");
            deepUrl.put("package", "com.fdbr.android");
            driver.executeScript("mobile: deepLink", deepUrl);
            Thread.sleep(30000);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @Test(priority = 2)
    public void runShareLinkArticleDetail() {
        try {
            HashMap<String, String> deepUrl = new HashMap<>();
            deepUrl.put("url", "https://femaledaily.link/1lavyw");
            deepUrl.put("package", "com.fdbr.android");
            driver.executeScript("mobile: deepLink", deepUrl);
            Thread.sleep(30000);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @Test(priority = 3)
    public void runShareLinkReviewDetail() {
        try {
            HashMap<String, String> deepUrl = new HashMap<>();
            deepUrl.put("url", "https://femaledaily.link/1law4J");
            deepUrl.put("package", "com.fdbr.android");
            driver.executeScript("mobile: deepLink", deepUrl);
            Thread.sleep(30000);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @Test(priority = 4)
    public void runShareLinkPostDetail() {
        try {
            HashMap<String, String> deepUrl = new HashMap<>();
            deepUrl.put("url", "https://femaledaily.link/1law6w");
            deepUrl.put("package", "com.fdbr.android");
            driver.executeScript("mobile: deepLink", deepUrl);
            Thread.sleep(30000);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @AfterTest
    public void quit() {
        driver.quit();
    }
}
