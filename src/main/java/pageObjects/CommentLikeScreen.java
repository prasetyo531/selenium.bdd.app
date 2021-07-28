package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.List;

public class CommentLikeScreen extends ActionBase {

    public static Integer t1;
    public static Integer t2;

    /*********** post list ***********/
    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]")
    @iOSXCUITFindBy(id="COMPLETE VERIFY")
    public MobileElement firstPostProfile;

    /*********** review list ***********/
    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]")
    @iOSXCUITFindBy(id="COMPLETE VERIFY")
    public MobileElement firstReviewProfile;

    @AndroidFindBy(id="com.fdbr.android:id/buttonLove")
    public MobileElement clickLikeIcon;

    @AndroidFindBy(xpath="//android.widget.ImageButton[@content-desc='Navigate up']")
    public MobileElement backToolbar;

    /*comment screen*/
    @AndroidFindBy(id="com.fdbr.android.comment:id/inputComment")
    public MobileElement commentField;

    @AndroidFindBy(id="com.fdbr.android.comment:id/buttonPost")
    public MobileElement postComment;

    @AndroidFindBy(id="com.fdbr.android.comment:id/listComments")
    public MobileElement commentList;

    @AndroidFindBy(xpath="//android.view.ViewGroup[contains(@resource-id, 'com.fdbr.android.comment:id/parent')]")
    public List<MobileElement> commentSize;

    //list user to mention
    @AndroidFindBy(id="com.fdbr.android.comment:id/listUsers")
    public MobileElement elementListUserToMention;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android.comment:id/labelUsername')]")
    public List<MobileElement> listUserToMention;

    // This is a constructor, as every page need a base driver to find android elements
    public CommentLikeScreen(AppiumDriver driver) {

        this.driver = driver;
        //Initialize Elements of a Page class without having to use ‘FindElement‘ or ‘FindElements‘
        PageFactory.initElements(new AppiumFieldDecorator(this.driver),this);
    }

    public CommentLikeScreen clickFirstPostProfile() {
        isElementPresent(firstPostProfile);
        tapByElement(firstPostProfile);
        return new CommentLikeScreen(driver);
    }

    public CommentLikeScreen clickFirstReviewProfile() {
        isElementPresent(firstReviewProfile);
        tapByElement(firstReviewProfile);
        return new CommentLikeScreen(driver);
    }

    public CommentLikeScreen inputCommentField(String commentmention) {
        WaitUntilElementIsVisible(commentField);
        inputValue(commentField, commentmention);
        return new CommentLikeScreen(driver);
    }

    public CommentLikeScreen inputMentionedCommentField(String commentmention) {
        WaitUntilElementIsVisible(commentField);
        inputValue(commentField, commentmention);
        WaitUntilElementIsVisible(elementListUserToMention);
        clickFirstMenus(listUserToMention);
        return new CommentLikeScreen(driver);
    }

    public CommentLikeScreen postComment() {
        tapByElement(postComment);
        return new CommentLikeScreen(driver);
    }

    public CommentLikeScreen clickBack() {
        tapByElement(backToolbar);
        return new CommentLikeScreen(driver);
    }

}
