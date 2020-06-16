package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class ProfileScreen extends ActionBase{

    @AndroidFindBy(xpath="//android.widget.LinearLayout[@content-desc=\"Posts\"]")
    public MobileElement postsTab;

    @AndroidFindBy(xpath="//android.widget.LinearLayout[@content-desc=\"Reviews\"]")
    public MobileElement reviewsTab;

    // This is a constructor, as every page need a base driver to find android elements
    public ProfileScreen(AppiumDriver driver) throws IOException {

        this.driver = driver;
        //Initialize Elements of a Page class without having to use ‘FindElement‘ or ‘FindElements‘
        PageFactory.initElements(new AppiumFieldDecorator(this.driver),this);
    }

    public ProfileScreen clickReviewsTab() throws IOException {

        tapByElement(reviewsTab);
        return new ProfileScreen(driver);
    }

    public ProfileScreen clickPostsTab() throws IOException {

        tapByElement(postsTab);
        return new ProfileScreen(driver);
    }
}
