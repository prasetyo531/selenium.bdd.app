package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;
import java.util.List;

public class FeedScreen extends ActionBase {

    private Integer postcomment1;
    private Integer postcomment2;
    private Integer deletecomment1;
    private Integer deletecomment2;

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

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android:id/buttonComment') and @index='1']")
    public MobileElement iconCommentFirstPost;

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

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'com.fdbr.android:id/textValue') and @text='OK']")
    public MobileElement okDelete;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'com.fdbr.android:id/textValue') and @text='Cancel']")
    public MobileElement cancelDelete;

    /*comment screen*/
    @AndroidFindBy(id="com.fdbr.android.comment:id/inputComment")
    public MobileElement commentField;

    @AndroidFindBy(id="com.fdbr.android.comment:id/buttonPost")
    public MobileElement postComment;

    @AndroidFindBy(id="com.fdbr.android.comment:id/listComments")
    public MobileElement commentList;

    @AndroidFindBy(xpath="//android.view.ViewGroup[contains(@resource-id, 'com.fdbr.android.comment:id/parent')]")
    public List<MobileElement> commentSize;

    //because current total comment is 2
    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView[1]/android.view.ViewGroup[2]/android.widget.TextView[3]")
    public MobileElement moreComment;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android.comment:id/buttonMore')]")
    public List<MobileElement> listMoreComment;

    @AndroidFindBy(id="com.fdbr.android.comment:id/buttonReply")
    public MobileElement replyButton;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android.comment:id/buttonReply')]")
    public List<MobileElement> listReplyButton;

    // This is a constructor, as every page need a base driver to find android elements
    public FeedScreen(AppiumDriver driver) {

        this.driver = driver;
        //Initialize Elements of a Page class without having to use ‘FindElement‘ or ‘FindElements‘
        PageFactory.initElements(new AppiumFieldDecorator(this.driver),this);
    }

    public DiscoverScreen clickCommentFirstPost() {
        isElementEnabled(iconCommentFirstPost);
        tapByElement(iconCommentFirstPost);
        return new DiscoverScreen(driver);
    }

    public DiscoverScreen clickCommentFirstReview() {
        isElementEnabled(iconCommentFirstPost);
        tapByElement(iconCommentFirstPost);
        return new DiscoverScreen(driver);
    }

    public FeedScreen clickPostTagProduct() {
        isElementPresent(firstPostFeed);
        tapByElement(firstPostFeed);
        return new FeedScreen(driver);
    }

    public FeedScreen clickReadMoreReview() {
        isElementPresent(readMoreDetail);
        tapByElement(readMoreDetail);
        return new FeedScreen(driver);
    }

    public FeedScreen clickReadMorePost() {
        isElementPresent(readMorePost);
        tapByElement(readMorePost);
        return new FeedScreen(driver);
    }

    public FeedScreen clickIconTagsPost() {
        isElementPresent(iconTags);
        tapByElement(iconTags);
        return new FeedScreen(driver);
    }

    public FeedScreen checkIsOnFeedAfterReview() {
        isElementPresent(descReviewDetail);
        tapByElement(back);

        isElementPresent(feedTitleToolbar);
        String title = feedTitleToolbar.getText();
        Assert.assertEquals(title, "Feed");
        return new FeedScreen(driver);
    }

    public FeedScreen checkIsOnFeedAfterPost() {
        isElementPresent(labelFeed);
        isElementPresent(feedTitleToolbar);
        String title = feedTitleToolbar.getText();
        Assert.assertEquals(title, "Feed");
        return new FeedScreen(driver);
    }

    public FeedScreen checkIsonOwnFeeds() {
        isElementPresent(titleOwnUserFeeds);
        String title = titleOwnUserFeeds.getText();
        System.out.println(title);
        Assert.assertTrue(title.contains("Feeds"));
        return new FeedScreen(driver);
    }

    /*  edit submitted post */
    public FeedScreen clickEditPost() {
        isElementPresent(editOption);
        tapByElement(editOption);
        return new FeedScreen(driver);
    }

    public FeedScreen checkCaptionEditedWithHashtag(String hashtag) {
        this.verticalSwipeByPercentages(iconLove, 0.2,0.01,0.2,500);
        isElementPresent(firstCaptionOwnUserFeeds);
        String caption = firstCaptionOwnUserFeeds.getText();
        org.junit.Assert.assertTrue(caption.contains(hashtag));

        return new FeedScreen(driver);
    }

    public FeedScreen checkNoTaggedProductLeftFeed() {
        //https://sqa.stackexchange.com/questions/14190/how-to-continue-script-when-element-is-not-found-in-selenium
        Boolean icontag = driver.findElements(iconProdTag).size() > 0;
        if (icontag==true){
            org.junit.Assert.fail("icon tags should not appear");
        }
        return new FeedScreen(driver);
    }

    public FeedScreen checkNoTaggedProductLeftOwnFeed() {
        //https://sqa.stackexchange.com/questions/14190/how-to-continue-script-when-element-is-not-found-in-selenium
        Boolean icontag = driver.findElements(iconProdTag).size() > 0;
        if (icontag==true){
            org.junit.Assert.fail("icon tags should not appear");
        }
        return new FeedScreen(driver);
    }

    /*  report submitted post */
    public FeedScreen clickReportPost() {
        isElementPresent(reportOption);
        tapByElement(reportOption);

        return new FeedScreen(driver);
    }

    public FeedScreen chooseReasonNotRelevant() {
        isElementPresent(titleModal);
        String titleModalReport = titleModal.getText();
        Assert.assertTrue(titleModalReport.equals("What's your reason for reporting Post?"));
        isElementPresent(notRelevantOption);
        tapByElement(notRelevantOption);
        return new FeedScreen(driver);
    }

    public FeedScreen findToastAfterReport() {
        //WebDriverWait wait = new WebDriverWait(driver, 2);
        //its not check text equals expected text
        toastMatches("Thank you for reporting this post", false);
        return new FeedScreen(driver);
    }

    /*  share submitted post */
    public FeedScreen clickSharePost() {
        isElementPresent(shareOption);
        tapByElement(shareOption);
        return new FeedScreen(driver);
    }

    /*  delete submitted post */
    public FeedScreen clickDeletePost() {
        isElementPresent(deleteOption);
        tapByElement(deleteOption);
        return new FeedScreen(driver);
    }

    public FeedScreen chooseNoDeletePost() {
        isElementPresent(titleModal);
        String titleModalReport = titleModal.getText();
        Assert.assertTrue(titleModalReport.equals("Sure want to delete Post?"));
        isElementPresent(cancelDelete);
        tapByElement(cancelDelete);
        return new FeedScreen(driver);
    }

    /*  comment of post screen*/
    public FeedScreen submitReplyCommentPost() throws InterruptedException {
        isElementEnabled(commentList);
        postcomment1 = commentSize.size();
        System.out.println("total comment"+" "+postcomment1);

        Thread.sleep(1500);
        isElementEnabled(replyButton);
        clickRandomMenus(listReplyButton);
        isElementEnabled(commentField);
        String txt = commentField.getText();
        Assert.assertTrue(txt.startsWith("@"));
        tapByElement(postComment);
        Thread.sleep(3000);
        return new FeedScreen(driver);
    }

    public FeedScreen submitCommentPost() throws InterruptedException {
        isElementEnabled(commentList);
        postcomment1 = commentSize.size();
        System.out.println("total comment"+" "+postcomment1);

        isElementEnabled(commentField);
        inputValue(commentField,"submit comment post");
        tapByElement(postComment);
        Thread.sleep(3000);
        return new FeedScreen(driver);
    }

    public FeedScreen checkSubmitCommentPost() {
        isElementEnabled(commentList);
        postcomment2 = commentSize.size();
        System.out.println("total comment"+" "+postcomment2);
        Assert.assertNotEquals(postcomment2, postcomment1);
        return new FeedScreen(driver);
    }

    public FeedScreen deleteCommentPost() throws InterruptedException {
        isElementEnabled(commentList);
        deletecomment1 = commentSize.size();
        System.out.println("total comment"+" "+deletecomment1);

        clickLastMenus(listMoreComment);
        isElementPresent(deleteOption);
        tapByElement(deleteOption);
        Thread.sleep(3000);
        //confirmation before delete
        isElementPresent(titleModal);
        String titleModalReport = titleModal.getText();
        Assert.assertTrue(titleModalReport.equals("Sure want to delete Comment?"));
        isElementPresent(okDelete);
        tapByElement(okDelete);
        return new FeedScreen(driver);
    }

    public FeedScreen checkDeleteCommentPost() throws InterruptedException {
        isElementEnabled(commentList);
        Thread.sleep(1000);
        deletecomment2 = commentSize.size();
        System.out.println("total comment"+" "+deletecomment2);
        Assert.assertNotEquals(deletecomment2, deletecomment1);
        return new FeedScreen(driver);
    }

    public FeedScreen reportCommentPost() {
        isElementEnabled(commentList);
        //isElementPresent(moreComment);
        //tapByElement(moreComment);
        clickRandomMenus(listMoreComment);
        tapByElement(reportOption);
        //reason of report
        isElementPresent(titleModal);
        String titleModalReport = titleModal.getText();
        Assert.assertTrue(titleModalReport.equals("What's your reason for reporting Post?"));
        isElementPresent(notRelevantOption);
        tapByElement(notRelevantOption);
        return new FeedScreen(driver);
    }
}
