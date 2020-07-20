package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class AddPostScreen extends ActionBase {

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

    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.widget.TextView[4]")
    public MobileElement labelReviewed;

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

    public AddPostScreen clickPhotoBtn() throws IOException {

        tapByElement(captureBtn);
        return new AddPostScreen(driver);
    }

    public AddPostScreen clickDone() throws IOException {

        tapByElement(doneBtn);
        return new AddPostScreen(driver);
    }

    public AddPostScreen capturePhoto() throws IOException {

        clickPhotoBtn();
        clickDone();
        return new AddPostScreen(driver);
    }

    //insert caption
    public AddPostScreen fillCaption() throws IOException {

        tapByElement(inputCaptionField);
        inputValue(inputCaptionField, "caption test");
        return new AddPostScreen(driver);
    }

    public AddPostScreen fillHashtag() throws IOException {

        inputValue(inputCaptionField, "caption test @qatest");
        return new AddPostScreen(driver);
    }

    public AddPostScreen clickSubmitPost() throws IOException {

        tapByElement(submitBtn);
        return new AddPostScreen(driver);
    }

    public AddPostScreen submitPostNoTag() throws IOException {

        clickSubmitPost();
        //command skip taging

        return new AddPostScreen(driver);
    }

    public AddPostScreen submitPostTag() throws IOException {

        clickSubmitPost();
        return new AddPostScreen(driver);
    }

    public AddPostScreen clickTagProduct() throws IOException {

        isElementPresent(addProdPost);
        tapByElement(addProdPost);
        return new AddPostScreen(driver);
    }

    public AddPostScreen chooseFirstPopularProduct() throws IOException {

        tapByElement(firstIndexProduct);
        tapByElement(submitBtn);
        return new AddPostScreen(driver);
    }

    public AddPostScreen clickReviewTaggedProduct() throws IOException {

        tapByElement(addReviewPost);
        return new AddPostScreen(driver);
    }

    public AddPostScreen chooseFirstTaggedProduct() throws IOException {

        tapByElement(firstIndexProduct);
        tapByElement(submitBtn);
        return new AddPostScreen(driver);
    }

    public AddPostScreen backToAddPostScreen() throws IOException {

        isElementPresent(labelReviewed);
        String label = labelReviewed.getText();
        Assert.assertTrue(label.equals("REVIEWED"));

        tapByElement(backBtn);
        return new AddPostScreen(driver);
    }
}
