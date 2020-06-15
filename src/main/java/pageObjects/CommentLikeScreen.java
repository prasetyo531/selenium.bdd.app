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

    /***********
     post list
     ***********/
    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]")
    @iOSXCUITFindBy(id="COMPLETE VERIFY")
    public MobileElement firstPostProfile;

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
    public CommentLikeScreen(AppiumDriver driver) throws IOException {

        this.driver = driver;
        //Initialize Elements of a Page class without having to use ‘FindElement‘ or ‘FindElements‘
        PageFactory.initElements(new AppiumFieldDecorator(this.driver),this);
    }

    //count total comment
    public Integer getTotalCommentBefore(){

        String total1 = clickCommentIcon.getText();
        //parse to integer
        int t1=Integer.parseInt(total1);
        System.out.println("get Total Comment Before"+" "+t1);
        return t1;
    }

    public Integer getTotalCommentAfter(){

        String total2 = clickCommentIcon.getText();
        //parse to integer
        int t2=Integer.parseInt(total2);
        System.out.println("get Total Comment After"+" "+t2);
        if(getTotalCommentBefore().equals(t2)){
            Assert.fail("total should not same");
            System.out.println("fail get Total Comment After"+" "+t2);
        }
        return t2;
    }

    public CommentLikeScreen clickFirstPostProfile() throws IOException {

        isElementPresent(firstPostProfile);
        tapByElement(firstPostProfile);
        return new CommentLikeScreen(driver);
    }

    public CommentLikeScreen clickCommentIcon() throws IOException {

        isElementPresent(clickCommentIcon);
        tapByElement(clickCommentIcon);
        return new CommentLikeScreen(driver);
    }

    public CommentLikeScreen inputCommentField(String commentmention) throws IOException {

        isElementPresent(commentField);
        inputValue(commentField, commentmention);
        return new CommentLikeScreen(driver);
    }

    public CommentLikeScreen postComment() throws IOException {

        tapByElement(postBtn);
        return new CommentLikeScreen(driver);
    }

    public CommentLikeScreen clickBack() throws IOException {

        tapByElement(backToolbar);
        return new CommentLikeScreen(driver);
    }


}
