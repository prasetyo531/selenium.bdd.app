package deeplink;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.ActionBase;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

public class DeeplinkTest {

    public WebDriver driver;
    public WebDriverWait wait;

    @AndroidFindBy(id = "com.android.chrome:id/search_box_text")
    private MobileElement urlField;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Toggle\"]/preceding-sibling::android.widget.TextView")
    private MobileElement productTitleTxt;

    ActionBase ac = new ActionBase();

    @BeforeTest
    public void setup () throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "RR8M90CMW9N");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
        //appium --allow-insecure chromedriver_autodownload
        capabilities.setCapability("chromedriverExecutableDir","/Users/fdn-prasetyo/Documents/chromedriver");
        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),capabilities);
        wait = new WebDriverWait(driver, 10);
    }

    //RPA-1
    @Test(priority = 1)
    public void openProductCategory() throws InterruptedException {

        driver.get("https://femaledaily.com/category/skincare");
        wait.until(ExpectedConditions.elementToBeClickable((WebElement) driver.findElement(By.cssSelector("#__next > div > div.jsx-1857941784.category-content > div.jsx-1857941784.category-landing-content > div.jsx-1857941784.panelutama > div > div > div:nth-child(1) > div"))));
        driver.findElement(By.cssSelector("#__next > div > div.jsx-1857941784.category-content > div.jsx-1857941784.category-landing-content > div.jsx-1857941784.panelutama > div > div > div:nth-child(1) > div")).click();
        driver.findElement(By.cssSelector("#id_group_138")).submit();
        Thread.sleep(9000);
        //will see option open with
    }

    @Test(priority = 2)
    public void openProductDetail() {

        driver.get("https://femaledaily.com/category/skincare");
        wait.until(ExpectedConditions.elementToBeClickable((WebElement) driver.findElement(By.cssSelector("#__next > div > div.jsx-1857941784.category-content > div.jsx-1857941784.category-landing-content > div.jsx-1857941784.panelutama > div > div > div:nth-child(1) > div"))));
        driver.findElement(By.cssSelector("#__next > div > div.jsx-1857941784.category-content > div.jsx-1857941784.category-landing-content > div.jsx-1857941784.panelutama > div > div > div:nth-child(1) > div")).click();
        //will see option open with
    }

    @AfterTest
    public void quit() {
        driver.quit();
    }

}
