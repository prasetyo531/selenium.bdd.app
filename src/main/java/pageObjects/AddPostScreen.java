package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class AddPostScreen extends ActionBase {

    @AndroidFindBy(id="com.fdbr.android.photo:id/buttonCapture")
    public MobileElement captureBtn;

    @AndroidFindBy(id="com.fdbr.android.photo:id/buttonPicker")
    public MobileElement galleryBtn;

    @AndroidFindBy(id="com.fdbr.android:id/buttonRightCustom")
    public MobileElement doneBtn;

    @AndroidFindBy(id="com.fdbr.android:id/buttonLeftCustom")
    public MobileElement retakeBtn;

    @AndroidFindBy(id="com.fdbr.android.add:id/done")
    public MobileElement submitPostBtn;

    @AndroidFindBy(id="com.fdbr.android.add:id/inputCaption")
    public MobileElement inputCaptionField;

    @AndroidFindBy(id="com.fdbr.android.add:id/labelTagProducts")
    public MobileElement addProdPost;

    @AndroidFindBy(id="com.fdbr.android.add:id/labelAddReview")
    public MobileElement addReviewPost;

    @AndroidFindBy(id="com.fdbr.android:id/textIsReviewed")
    public MobileElement labelReviewed;

    /* search product */
    @AndroidFindBy(id="com.fdbr.android:id/inputSearch")
    public MobileElement searchField;

    /* common element */
    @AndroidFindBy(xpath="//android.view.ViewGroup[contains(@resource-id, 'com.fdbr.android:id/parent') and @index='0']")
    public MobileElement firstIndexProduct;

    @AndroidFindBy(xpath="//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
    public MobileElement backBtn;

    @AndroidFindBy(id="com.fdbr.android.add:id/done")
    public MobileElement submitBtn;

    /* first img in gallery */
    @AndroidFindBy(xpath="//android.widget.ImageView[contains(@resource-id, 'com.android.documentsui:id/icon_thumb') and @index='0']")
    public MobileElement firstIndexImg;

    @AndroidFindBy(id="com.fdbr.android:id/menu_crop")
    public MobileElement doneCropBtn;

    /* modal warning info */
    @AndroidFindBy(id="com.fdbr.android:id/buttonPositive")
    public MobileElement useTagBtn;

    @AndroidFindBy(id="com.fdbr.android:id/buttonNegative")
    public MobileElement skipTagBtn;


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

    public AddPostScreen clickGalleryBtn() throws IOException {

        tapByElement(galleryBtn);
        isElementPresent(firstIndexImg);
        tapByElement(firstIndexImg);

        isElementPresent(doneCropBtn);
        tapByElement(doneCropBtn);
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

    public AddPostScreen selectPhotoFromGallery() throws IOException {

        clickGalleryBtn();
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

        tapByElement(submitPostBtn);
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

    public AddPostScreen waitProductList() throws IOException {

        isElementPresent(searchField);
        isElementPresent(firstIndexProduct);
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

    /* modal warning info */
    public AddPostScreen clickNoSkipTag() throws IOException {

        isElementPresent(useTagBtn);
        tapByElement(useTagBtn);
        return new AddPostScreen(driver);
    }

    public AddPostScreen clickSkipTag() throws IOException {

        isElementPresent(skipTagBtn);
        tapByElement(skipTagBtn);
        return new AddPostScreen(driver);
    }

    public AddPostScreen checkOnPostScreen () throws IOException {

        isElementPresent(inputCaptionField);
        return new AddPostScreen(driver);
    }
}
