package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

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

    @AndroidFindBy(id="com.fdbr.android:id/textCommentCounter")
    public MobileElement clickCommentIcon;

    @AndroidFindBy(id="com.fdbr.android:id/textLikeCounter")
    public MobileElement clickLikeIcon;

    @AndroidFindBy(id="com.fdbr.android:id/inputComment")
    public MobileElement commentField;

    @AndroidFindBy(id="com.fdbr.android:id/buttonSend")
    public MobileElement postBtn;

    @AndroidFindBy(id="com.fdbr.android:id/buttonBackToolbar")
    public MobileElement backToolbar;


    // This is a constructor, as every page need a base driver to find android elements
    public CommentLikeScreen(AppiumDriver driver) {

        this.driver = driver;
        //Initialize Elements of a Page class without having to use ‘FindElement‘ or ‘FindElements‘
        PageFactory.initElements(new AppiumFieldDecorator(this.driver),this);
    }

    //count total comment
    public Integer getTotalCommentBefore(){
        String total1 = clickCommentIcon.getText();
        //parse to integer
        t1=Integer.parseInt(total1);
        System.out.println("get Total Comment Before"+" "+t1);
        return t1;
    }

    public Integer getTotalCommentAfter(){
        String total2 = clickCommentIcon.getText();
        //parse to integer
        t2=Integer.parseInt(total2);
        System.out.println("get Total Comment After"+" "+t2);
        return t2;
    }

    public void totalComm(){
        System.out.println(t1+" "+t2);
        if(t2.equals(t1)){
            Assert.fail("total should not same"+" "+t1);
            System.out.println("fail get Total Comment After"+" "+getTotalCommentAfter());
        }
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

    public CommentLikeScreen clickCommentIcon() {
        isElementPresent(clickCommentIcon);
        tapByElement(clickCommentIcon);
        return new CommentLikeScreen(driver);
    }

    public CommentLikeScreen inputCommentField(String commentmention) {
        isElementPresent(commentField);
        inputValue(commentField, commentmention);
        return new CommentLikeScreen(driver);
    }

    public CommentLikeScreen postComment() {
        tapByElement(postBtn);
        return new CommentLikeScreen(driver);
    }

    public CommentLikeScreen clickBack() {
        tapByElement(backToolbar);
        return new CommentLikeScreen(driver);
    }

}
