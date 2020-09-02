package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;

public class FeedScreen extends ActionBase {

    By iconProdTag = By.id("com.fdbr.android:id/labelProductTags");

    @AndroidFindBy(id="com.fdbr.android:id/toolbarTitle")
    public MobileElement feedTitleToolbar;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android:id/toolbarTitle') and @text='Feed']")
    public MobileElement labelFeed;

    @AndroidFindBy(id="com.fdbr.android.main:id/labelText")
    public MobileElement descReviewDetail;

    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView")
    public MobileElement firstPostFeed;

    @AndroidFindBy(id="com.fdbr.android:id/textReadMore")
    public MobileElement readMoreDetail;

    @AndroidFindBy(id="com.fdbr.android:id/buttonMore")
    public MobileElement readMorePost;

    @AndroidFindBy(xpath="//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
    public MobileElement back;

    @AndroidFindBy(id="com.fdbr.android:id/labelProductTags")
    public MobileElement iconTags;

    @AndroidFindBy(id="com.fdbr.android:id/buttonLove")
    public MobileElement iconLove;

    @AndroidFindBy(id="com.fdbr.android:id/toolbarTitle")
    public MobileElement titleOwnUserFeeds;

    @AndroidFindBy(id="com.fdbr.android:id/labelCaption")
    public MobileElement firstCaptionOwnUserFeeds;

    /* more btn */
    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'com.fdbr.android:id/textValue') and @text='Delete']")
    public MobileElement deleteOption;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'com.fdbr.android:id/textValue') and @text='Report']")
    public MobileElement reportOption;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'com.fdbr.android:id/textValue') and @text='Edit']")
    public MobileElement editOption;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'com.fdbr.android:id/textValue') and @text='Share']")
    public MobileElement shareOption;

    /* confirmation modal report and delete */
    @AndroidFindBy(id="com.fdbr.android:id/textTitle")
    public MobileElement titleModal;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'com.fdbr.android:id/textValue') and @text='Not Relevant']")
    public MobileElement notRelevantOption;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'com.fdbr.android:id/textValue') and @text='Cancel']")
    public MobileElement cancelDelete;

    // This is a constructor, as every page need a base driver to find android elements
    public FeedScreen(AppiumDriver driver) throws IOException {

        this.driver = driver;
        //Initialize Elements of a Page class without having to use ‘FindElement‘ or ‘FindElements‘
        PageFactory.initElements(new AppiumFieldDecorator(this.driver),this);
    }

    public FeedScreen clickPostTagProduct() throws IOException {

        isElementPresent(firstPostFeed);
        tapByElement(firstPostFeed);
        return new FeedScreen(driver);
    }

    public FeedScreen clickReadMoreReview() throws IOException {

        isElementPresent(readMoreDetail);
        tapByElement(readMoreDetail);
        return new FeedScreen(driver);
    }

    public FeedScreen clickReadMorePost() throws IOException {

        isElementPresent(readMorePost);
        tapByElement(readMorePost);
        return new FeedScreen(driver);
    }

    public FeedScreen clickIconTagsPost() throws IOException {

        isElementPresent(iconTags);
        tapByElement(iconTags);
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

        isElementPresent(labelFeed);
        isElementPresent(feedTitleToolbar);
        String title = feedTitleToolbar.getText();
        Assert.assertEquals(title, "Feed");
        return new FeedScreen(driver);
    }

    public FeedScreen checkIsonOwnFeeds() throws IOException {

        isElementPresent(titleOwnUserFeeds);
        String title = titleOwnUserFeeds.getText();
        System.out.println(title);
        Assert.assertTrue(title.contains("Feeds"));
        return new FeedScreen(driver);
    }

    /*  edit submitted post */
    public FeedScreen clickEditPost() throws IOException {

        isElementPresent(editOption);
        tapByElement(editOption);

        return new FeedScreen(driver);
    }

    public FeedScreen checkCaptionEditedWithHashtag(String hashtag) throws IOException {

        this.verticalSwipeByPercentages(iconLove, 0.2,0.01,0.2,500);

        isElementPresent(firstCaptionOwnUserFeeds);
        String caption = firstCaptionOwnUserFeeds.getText();
        org.junit.Assert.assertTrue(caption.contains(hashtag));

        return new FeedScreen(driver);
    }

    public FeedScreen checkNoTaggedProductLeftFeed() throws IOException {

        //https://sqa.stackexchange.com/questions/14190/how-to-continue-script-when-element-is-not-found-in-selenium
        Boolean icontag = driver.findElements(iconProdTag).size() > 0;
        if (icontag==true){
            org.junit.Assert.fail("icon tags should not appear");
        }
        return new FeedScreen(driver);
    }

    public FeedScreen checkNoTaggedProductLeftOwnFeed() throws IOException {

        //https://sqa.stackexchange.com/questions/14190/how-to-continue-script-when-element-is-not-found-in-selenium
        Boolean icontag = driver.findElements(iconProdTag).size() > 0;
        if (icontag==true){
            org.junit.Assert.fail("icon tags should not appear");
        }
        return new FeedScreen(driver);
    }

    /*  report submitted post */
    public FeedScreen clickReportPost() throws IOException {

        isElementPresent(reportOption);
        tapByElement(reportOption);

        return new FeedScreen(driver);
    }

    public FeedScreen chooseReasonNotRelevant() throws IOException {

        isElementPresent(titleModal);
        String titleModalReport = titleModal.getText();
        Assert.assertTrue(titleModalReport.equals("What's your reason for reporting Post?"));
        isElementPresent(notRelevantOption);
        tapByElement(notRelevantOption);

        return new FeedScreen(driver);
    }

    public FeedScreen findToastAfterReport() throws IOException {

        //WebDriverWait wait = new WebDriverWait(driver, 2);
        toastMatches("Thank you for reporting this postttttt", false);

        return new FeedScreen(driver);
    }

    /*  share submitted post */
    public FeedScreen clickSharePost() throws IOException {

        isElementPresent(shareOption);
        tapByElement(shareOption);

        return new FeedScreen(driver);
    }

    /*  delete submitted post */
    public FeedScreen clickDeletePost() throws IOException {

        isElementPresent(deleteOption);
        tapByElement(deleteOption);

        return new FeedScreen(driver);
    }

    public FeedScreen chooseNoDeletePost() throws IOException {

        isElementPresent(titleModal);
        String titleModalReport = titleModal.getText();
        Assert.assertTrue(titleModalReport.equals("Sure want to delete Post?"));
        isElementPresent(cancelDelete);
        tapByElement(cancelDelete);

        return new FeedScreen(driver);
    }

}
