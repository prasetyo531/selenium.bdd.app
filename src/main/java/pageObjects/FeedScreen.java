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

    public static Integer t1;
    public static Integer t2;
    public static Integer t3;
    public static Integer t4;

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

    /*post detail screen*/
    @AndroidFindBy(id="com.fdbr.android:id/buttonComment")
    public MobileElement commentIconPost;

    @AndroidFindBy(id="com.fdbr.android:id/buttonLove")
    public MobileElement likeIcon;

    /*review detail screen*/
    @AndroidFindBy(id="com.fdbr.android.main:id/buttonComment")
    public MobileElement commentIconReview;

    @AndroidFindBy(id="com.fdbr.android.main:id/buttonLove")
    public MobileElement likeIconReview;

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
        WaitUntilElementIsVisible(iconCommentFirstPost);
        tapByElement(iconCommentFirstPost);
        return new DiscoverScreen(driver);
    }

    public DiscoverScreen clickCommentFirstReview() {
        WaitUntilElementIsVisible(iconCommentFirstPost);
        tapByElement(iconCommentFirstPost);
        return new DiscoverScreen(driver);
    }

    public FeedScreen clickPostTagProduct() {
        WaitUntilElementIsVisible(firstPostFeed);
        tapByElement(firstPostFeed);
        return new FeedScreen(driver);
    }

    public FeedScreen clickReadMoreReview() {
        WaitUntilElementIsVisible(readMoreDetail);
        tapByElement(readMoreDetail);
        return new FeedScreen(driver);
    }

    public FeedScreen clickReadMorePost() {
        WaitUntilElementIsVisible(readMorePost);
        tapByElement(readMorePost);
        return new FeedScreen(driver);
    }

    public FeedScreen clickIconTagsPost() {
        WaitUntilElementIsVisible(iconTags);
        tapByElement(iconTags);
        return new FeedScreen(driver);
    }

    public FeedScreen checkIsOnFeedAfterReview() {
        WaitUntilElementIsVisible(descReviewDetail);
        tapByElement(back);

        isElementPresent(feedTitleToolbar);
        String title = feedTitleToolbar.getText();
        Assert.assertEquals(title, "Feed");
        return new FeedScreen(driver);
    }

    public FeedScreen checkIsOnFeedAfterPost() {
        WaitUntilElementIsVisible(labelFeed);
        WaitUntilElementIsVisible(feedTitleToolbar);
        String title = feedTitleToolbar.getText();
        Assert.assertEquals(title, "Feed");
        return new FeedScreen(driver);
    }

    public FeedScreen checkIsonOwnFeeds() {
        WaitUntilElementIsVisible(titleOwnUserFeeds);
        String title = titleOwnUserFeeds.getText();
        System.out.println(title);
        Assert.assertTrue(title.contains("Feeds"));
        return new FeedScreen(driver);
    }

    /*  edit submitted post */
    public FeedScreen clickEditPost() {
        WaitUntilElementIsVisible(editOption);
        tapByElement(editOption);
        return new FeedScreen(driver);
    }

    public FeedScreen checkCaptionEditedWithHashtag(String hashtag) {
        //this.verticalSwipeByPercentages(iconLove, 0.2,0.01,0.2,500);
        WaitUntilElementIsVisible(firstCaptionOwnUserFeeds);
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

    public FeedScreen chooseYesDeletePost() {
        isElementPresent(titleModal);
        String titleModalReport = titleModal.getText();
        Assert.assertTrue(titleModalReport.equals("Sure want to delete Post?"));
        isElementPresent(okDelete);
        tapByElement(okDelete);
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
        Thread.sleep(2000);
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
        Assert.assertTrue(titleModalReport.equals("What's your reason for reporting Comment?"));
        isElementPresent(notRelevantOption);
        tapByElement(notRelevantOption);
        return new FeedScreen(driver);
    }

    public FeedScreen checkToastReportComment() {
        toastMatches("Thank you for reporting this comment", false);
        return new FeedScreen(driver);
    }

    //count total comment
    public Integer getTotalCommentPostBefore(){
        String total1 = commentIconPost.getText();
        //parse to integer
        t1=Integer.parseInt(total1);
        System.out.println("get Total Comment Post Before"+" "+t1);
        return t1;
    }

    public Integer getTotalCommentPostAfter(){
        String total2 = commentIconPost.getText();
        //parse to integer
        t2=Integer.parseInt(total2);
        System.out.println("get Total Comment Post After"+" "+t2);
        return t2;
    }

    public Integer getTotalCommentReviewBefore(){
        String total3 = commentIconReview.getText();
        //parse to integer
        t3=Integer.parseInt(total3);
        System.out.println("get Total Comment Review Before"+" "+t3);
        return t3;
    }

    public Integer getTotalCommentReviewAfter(){
        String total4 = commentIconReview.getText();
        //parse to integer
        t4=Integer.parseInt(total4);
        System.out.println("get Total Comment Review After"+" "+t4);
        return t4;
    }

    public CommentLikeScreen clickCommentIconPost() {
        isElementPresent(commentIconPost);
        tapByElement(commentIconPost);
        return new CommentLikeScreen(driver);
    }

    public CommentLikeScreen clickCommentIconReview() {
        isElementPresent(commentIconReview);
        tapByElement(commentIconReview);
        return new CommentLikeScreen(driver);
    }

    public void totalCommentPost(){
        WaitUntilElementIsVisible(commentIconPost);
        System.out.println("total before"+"="+t1+" "+"total after"+"="+t2);
        if(t2.equals(t1)){
            org.junit.Assert.fail("total should not same"+" "+t1);
            System.out.println("fail get Total Comment After"+" "+getTotalCommentPostAfter());
        }
    }

    public void totalCommentReview(){
        WaitUntilElementIsVisible(commentIconReview);
        System.out.println("total before"+"="+t3+" "+"total after"+"="+t4);
        if(t4.equals(t3)){
            org.junit.Assert.fail("total should not same"+" "+t1);
            System.out.println("fail get Total Comment After"+" "+getTotalCommentReviewAfter());
        }
    }
}
