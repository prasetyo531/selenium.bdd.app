package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class AddPostScreen extends ActionBase {

    @AndroidFindBy(id="com.android.packageinstaller:id/permission_allow_button")
    public MobileElement permissionAllow;

    @AndroidFindBy(id="com.android.packageinstaller:id/permission_deny_button")
    public MobileElement permissionDeny;

    @AndroidFindBy(id="com.fdbr.android:id/buttonCapture")
    public MobileElement captureBtn;

    @AndroidFindBy(id="com.fdbr.android:id/buttonDoneToolbar")
    public MobileElement doneBtn;

    @AndroidFindBy(id="com.fdbr.android:id/buttonRetakeToolbar")
    public MobileElement retakeBtn;

    @AndroidFindBy(id="com.fdbr.android:id/buttonMenuToolbar")
    public MobileElement submitPostBtn;

    @AndroidFindBy(id="com.fdbr.android:id/inputCaption")
    public MobileElement inputCaptionField;

    @AndroidFindBy(id="com.fdbr.android:id/labelTagProducts")
    public MobileElement addProdPost;

    @AndroidFindBy(id="com.fdbr.android:id/labelAddReview")
    public MobileElement addReviewPost;

    /***
     search product
     */
    @AndroidFindBy(id="com.fdbr.android:id/buttonSearch")
    public MobileElement searchIcon;

    @AndroidFindBy(id=" com.fdbr.android:id/inputSearch")
    public MobileElement searchField;

    /*
    common element
     */
    @AndroidFindBy(xpath="//android.view.ViewGroup[contains(@resource-id, 'com.fdbr.android:id/layoutParent') and @index='0']")
    public MobileElement firstIndexProduct;

    @AndroidFindBy(id="com.fdbr.android:id/buttonBackToolbar")
    public MobileElement backBtn;

    @AndroidFindBy(id="com.fdbr.android:id/buttonMenuToolbar")
    public MobileElement submitBtn;


    // This is a constructor, as every page need a base driver to find android elements
    public AddPostScreen(AppiumDriver driver) throws IOException {

        this.driver = driver;
        //Initialize Elements of a Page class without having to use ‘FindElement‘ or ‘FindElements‘
        PageFactory.initElements(new AppiumFieldDecorator(this.driver),this);
    }

    public AddPostScreen


}
