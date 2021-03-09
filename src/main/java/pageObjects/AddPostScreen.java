package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class AddPostScreen extends ActionBase {

    By numrev = By.id("com.fdbr.android.add:id/labelNumberOfAddReview");

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

    @AndroidFindBy(id="com.fdbr.android.add:id/labelNumberOfProducts")
    public MobileElement labelNumberProducts;

    @AndroidFindBy(id="com.fdbr.android.add:id/labelNumberOfAddReview")
    public MobileElement labelNumberReviewed;

    /* search product */
    @AndroidFindBy(id="com.fdbr.android:id/inputSearch")
    public MobileElement searchField;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android.product:id/labelName') and @index='0']")
    public MobileElement firstTaggedProd;

    /* common element */
    @AndroidFindBy(xpath="//android.view.ViewGroup[contains(@resource-id, 'com.fdbr.android:id/parent') and @index='0']")
    public MobileElement firstIndexProduct;

    @AndroidFindBy(xpath="//android.view.ViewGroup[contains(@resource-id, 'com.fdbr.android:id/parent') and @index='1']")
    public MobileElement secondIndexProduct;

    @AndroidFindBy(xpath="//android.view.ViewGroup[contains(@resource-id, 'com.fdbr.android:id/parent') and @index='2']")
    public MobileElement threeIndexProduct;

    @AndroidFindBy(xpath="//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
    public MobileElement backBtn;

    @AndroidFindBy(id="com.fdbr.android.add:id/done")
    public MobileElement submitBtn;

    /* first img in gallery */
    @AndroidFindBy(xpath="//android.widget.ImageView[contains(@resource-id, 'com.android.documentsui:id/icon_thumb') and @index='0']")
    public MobileElement firstIndexImg;

    @AndroidFindBy(id="com.fdbr.android:id/menu_crop")
    public MobileElement doneCropBtn;

    /* modal warning info tag or cancel post */
    @AndroidFindBy(id="com.fdbr.android:id/textDescription")
    public MobileElement descText;

    @AndroidFindBy(id="com.fdbr.android:id/buttonPositive")
    public MobileElement yesBtn;

    @AndroidFindBy(id="com.fdbr.android:id/buttonNegative")
    public MobileElement noBtn;


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

    public AddPostScreen isCameraScreen() throws IOException {

        WaitUntilElementIsVisible(captureBtn);
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

    public AddPostScreen fillCustomCaption(String caption) throws IOException {

        tapByElement(inputCaptionField);
        inputValue(inputCaptionField, caption);
        return new AddPostScreen(driver);
    }

    public AddPostScreen fillCaptionWithHashtag(String hashtag) throws IOException {

        tapByElement(inputCaptionField);
        inputValue(inputCaptionField, "caption test with hashtag"+" "+hashtag);
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

    public AddPostScreen chooseTwoPopularProduct() throws IOException {

        tapByElement(firstIndexProduct);
        tapByElement(secondIndexProduct);
        tapByElement(submitBtn);
        return new AddPostScreen(driver);
    }

    public AddPostScreen clickReviewTaggedProduct() throws IOException {

        tapByElement(addReviewPost);
        return new AddPostScreen(driver);
    }

    public AddPostScreen inputKeywordToSearch(String keyword) throws IOException {

        tapByElement(searchField);
        inputValue(searchField, keyword);
        return new AddPostScreen(driver);
    }

    public AddPostScreen selectFirstResult() throws IOException {

        isElementPresent(firstIndexProduct);
        tapByElement(firstIndexProduct);
        tapByElement(submitBtn);
        return new AddPostScreen(driver);
    }

    public AddPostScreen cancelTag() throws IOException {

        tapByElement(backBtn);
        return new AddPostScreen(driver);
    }

    public AddPostScreen removeTaggedProduct() throws IOException {

        tapByElement(firstTaggedProd);
        tapByElement(submitBtn);
        return new AddPostScreen(driver);
    }

    public AddPostScreen cancelPost() throws IOException {

        tapByElement(backBtn);
        return new AddPostScreen(driver);
    }

    public AddPostScreen getTextModalAddPost() throws IOException {

        String txt = descText.getText();
        Assert.assertTrue(txt.equals("Are you sure want to stop adding new post?"));
        return new AddPostScreen(driver);
    }

    public AddPostScreen getTextModalEditPost() throws IOException {

        String txt = descText.getText();
        Assert.assertTrue(txt.equals("Are you sure want to stop Editing post?"));
        return new AddPostScreen(driver);
    }

    public AddPostScreen yesCancelPost() throws IOException {

        tapByElement(yesBtn);

        return new AddPostScreen(driver);
    }

    public AddPostScreen chooseFirstTaggedProduct() throws IOException {

        tapByElement(firstIndexProduct);
        tapByElement(submitBtn);
        return new AddPostScreen(driver);
    }

    public AddPostScreen chooseSecondTaggedProduct() throws IOException {

        tapByElement(secondIndexProduct);
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

    /* check label after tag product */
    public AddPostScreen checkNumProd() throws IOException {

        isElementPresent(labelNumberProducts);
        String numProdLabel = labelNumberProducts.getText();
        Assert.assertNotNull(numProdLabel);
        Assert.assertTrue(numProdLabel.contains("Product"));
        return new AddPostScreen(driver);
    }

    public AddPostScreen checkNumRev() throws IOException {

        isElementPresent(labelNumberReviewed);
        String numReviewedLabel = labelNumberReviewed.getText();
        Assert.assertNotNull(numReviewedLabel);
        Assert.assertTrue(numReviewedLabel.contains("Review"));
        return new AddPostScreen(driver);
    }

    public AddPostScreen checkLabelMultipleTag() throws IOException {

        isElementPresent(labelNumberProducts);
        String numProdLabel = labelNumberProducts.getText();
        Assert.assertNotNull(numProdLabel);
        Assert.assertTrue(numProdLabel.contains("Products"));
        return new AddPostScreen(driver);
    }

    public AddPostScreen checkLabelMultipleReview() throws IOException {

        isElementPresent(labelNumberReviewed);
        String numReviewedLabel = labelNumberReviewed.getText();
        Assert.assertNotNull(numReviewedLabel);
        Assert.assertTrue(numReviewedLabel.contains("Reviews"));
        return new AddPostScreen(driver);
    }

    public AddPostScreen checkNumRevShouldNull() throws IOException {

        //https://sqa.stackexchange.com/questions/14190/how-to-continue-script-when-element-is-not-found-in-selenium
        Boolean numreview = driver.findElements(numrev).size() > 0;
        if(numreview == true){
            Assert.fail("element add review should not present");
        }
        return new AddPostScreen(driver);
    }

    /* modal warning info */
    public AddPostScreen clickNoSkipTag() throws IOException {

        isElementPresent(yesBtn);
        tapByElement(yesBtn);
        return new AddPostScreen(driver);
    }

    public AddPostScreen clickSkipTag() throws IOException {

        isElementPresent(noBtn);
        tapByElement(noBtn);
        return new AddPostScreen(driver);
    }

    public AddPostScreen checkOnPostScreen () throws IOException {

        isElementPresent(inputCaptionField);
        return new AddPostScreen(driver);
    }

}
