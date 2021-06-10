package deeplink;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class DeeplinkTestReviewsDomainIOS {

    protected AppiumDriver driver;
    public WebDriverWait wait;

    @BeforeTest
    public void setup () throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14.4");
        capabilities.setCapability(MobileCapabilityType.UDID, "4D255622-E0A5-49DE-9E02-9719D8208EF9");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 12 Pro Max");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
        capabilities.setCapability("noReset", true);
        driver = new IOSDriver(new URL("http://0.0.0.0:4725/wd/hub"), capabilities);
        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void runProductCategoryReviewsDomain() {

        driver.activateApp("com.apple.mobilesafari");
        driver.get("https://reviews.femaledaily.net/products/moisturizer/night-cream-16?brand=&order=popular&page=1");
    }

    @Test(dependsOnMethods = "runProductCategoryReviewsDomain")
    public void runProductDetailReviewDomain() {

        driver.activateApp("com.apple.mobilesafari");
        driver.get("https://reviews.femaledaily.net/products/makeup-remover/face-62/garnier/micellar-clenasing-water?tab=reviews");
    }

    @AfterMethod
    public void delay() throws InterruptedException {

        Thread.sleep(20000);
    }

    @AfterTest
    public void quit() {
        driver.quit();
    }
}
