package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;

public class FeedScreen extends ActionBase {

    @AndroidFindBy(id="com.fdbr.android:id/toolbarTitle")
    public MobileElement feedTitleToolbar;

    @AndroidFindBy(id="com.fdbr.android.main:id/labelText")
    public MobileElement descReviewDetail;

    @AndroidFindBy(xpath="//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
    public MobileElement back;

    // This is a constructor, as every page need a base driver to find android elements
    public FeedScreen(AppiumDriver driver) throws IOException {

        this.driver = driver;
        //Initialize Elements of a Page class without having to use ‘FindElement‘ or ‘FindElements‘
        PageFactory.initElements(new AppiumFieldDecorator(this.driver),this);
    }

    public FeedScreen checkIsOnFeedAfterReview() throws IOException {

        isElementPresent(descReviewDetail);
        tapByElement(back);

        isElementPresent(feedTitleToolbar);
        String title = feedTitleToolbar.getText();
        Assert.assertEquals(title, "Feed");
        return new FeedScreen(driver);
    }

    public FeedScreen checkIsOnFeedAfterPost() throws IOException {

        isElementPresent(feedTitleToolbar);
        String title = feedTitleToolbar.getText();
        Assert.assertEquals(title, "Feed");
        return new FeedScreen(driver);
    }
}
