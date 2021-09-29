package deeplink;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class DeeplinkTestHomeDomainIOS {

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
    public void runDeepLinkCategoryHomeDomain() {

        By parentMoisturizer = MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeStaticText' && name == 'Moisturizer'");
        By childNightCream = MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeStaticText' && name == 'Night Cream'");

        driver.activateApp("com.apple.mobilesafari");
        driver.get("https://femaledaily.net/category/skincare");
        WebDriverWait wait = new WebDriverWait(driver, 15);
        //will see option open with

        wait.until(ExpectedConditions.visibilityOfElementLocated(parentMoisturizer)).click();
        wait.until(ExpectedConditions.elementToBeClickable(childNightCream));
        wait.until(ExpectedConditions.elementToBeClickable(childNightCream)).click();
    }

    //product detail wip due limitation get element browser using appium

    @AfterTest
    public void quit() {
        driver.quit();
    }
}
