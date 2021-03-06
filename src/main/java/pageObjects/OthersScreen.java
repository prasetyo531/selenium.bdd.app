package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class OthersScreen extends ActionBase {

    @AndroidFindBy(id="android:id/profile_tabhost")
    public MobileElement drawerShare;

    // This is a constructor, as every page need a base driver to find android elements
    public OthersScreen(AppiumDriver driver) {

        this.driver = driver;
        //Initialize Elements of a Page class without having to use ‘FindElement‘ or ‘FindElements‘
        PageFactory.initElements(new AppiumFieldDecorator(this.driver),this);
    }

    public OthersScreen findDrawerOptionShare() {
        isElementPresent(drawerShare);
        driver.navigate().back();
        return new OthersScreen(driver);
    }
}
