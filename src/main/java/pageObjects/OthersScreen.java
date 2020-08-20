package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class OthersScreen extends ActionBase {

    @AndroidFindBy(id="com.lge:id/resolver_list_lg")
    public MobileElement drawerShare;

    // This is a constructor, as every page need a base driver to find android elements
    public OthersScreen(AppiumDriver driver) throws IOException {

        this.driver = driver;
        //Initialize Elements of a Page class without having to use ‘FindElement‘ or ‘FindElements‘
        PageFactory.initElements(new AppiumFieldDecorator(this.driver),this);
    }

    public OthersScreen findDrawerOptionShare() throws IOException {

        isElementPresent(drawerShare);
        driver.navigate().back();
        return new OthersScreen(driver);
    }
}
