package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;
import java.util.List;

public class FeedScreen extends ActionBase {

    @AndroidFindBy(id="com.fdbr.android:id/toolbarTitle")
    public MobileElement feedTitleToolbar;

    @AndroidFindBy(id="com.fdbr.android.main:id/labelText")
    public MobileElement descReviewDetail;

    @AndroidFindBy(id="com.fdbr.android:id/textReadMore")
    public MobileElement readMoreDetail;

    @AndroidFindBy(xpath="//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
    public MobileElement back;

    @AndroidFindBy(id="com.fdbr.android:id/labelProductTags")
    public MobileElement iconTags;

    /* modal tagged product */
    @AndroidFindBy(id="com.fdbr.android.main:id/buttonClose")
    public MobileElement iconClose;

    @AndroidFindBy(id="com.fdbr.android.main:id/buttonProductDetail")
    public MobileElement productDetailBtn;

    // This is a constructor, as every page need a base driver to find android elements
    public FeedScreen(AppiumDriver driver) throws IOException {

        this.driver = driver;
        //Initialize Elements of a Page class without having to use ‘FindElement‘ or ‘FindElements‘
        PageFactory.initElements(new AppiumFieldDecorator(this.driver),this);
    }

    public FeedScreen clickReadMoreReview() throws IOException {

        isElementPresent(readMoreDetail);
        tapByElement(readMoreDetail);
        return new FeedScreen(driver);
    }

    public FeedScreen clickIconTagsPost() throws IOException {

        isElementPresent(iconTags);
        tapByElement(iconTags);
        return new FeedScreen(driver);
    }

    public FeedScreen clickProductDetailBtn() throws IOException {

        isElementPresent(productDetailBtn);
        tapByElement(productDetailBtn);
        return new FeedScreen(driver);
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
