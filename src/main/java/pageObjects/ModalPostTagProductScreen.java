package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class ModalPostTagProductScreen extends ActionBase {

    @AndroidFindBy(id="com.fdbr.android.main:id/labelProductNum")
    public MobileElement counterTaggedProduct;

    @AndroidFindBy(id="com.fdbr.android:id/userPhoto")
    public MobileElement userPhoto;

    @AndroidFindBy(id="com.fdbr.android:id/labelUsername")
    public MobileElement usernameLabel;

    @AndroidFindBy(id="com.fdbr.android:id/labelDateD")
    public MobileElement timestamp;

    @AndroidFindBy(id="com.fdbr.android.main:id/imageProduct")
    public MobileElement imgProd;

    @AndroidFindBy(id="com.fdbr.android.main:id/labelOverAllRatingBelow")
    public MobileElement overallRatinglLabel;

    @AndroidFindBy(id="com.fdbr.android.main:id/labelOverAllRating")
    public MobileElement counterTotalReview;

    @AndroidFindBy(id="com.fdbr.android.main:id/labelBrandName")
    public MobileElement brandNameLabel;

    @AndroidFindBy(id="com.fdbr.android.main:id/labelProductName")
    public MobileElement productNameLabel;

    @AndroidFindBy(id="com.fdbr.android.main:id/labelShadeName")
    public MobileElement shadeNameLabel;

    @AndroidFindBy(id="com.fdbr.android.main:id/labelCaption")
    public MobileElement captionReview;

    @AndroidFindBy(id="com.fdbr.android.main:id/buttonProductDetail")
    public MobileElement viewProductDetailBtn;

    @AndroidFindBy(id="com.fdbr.android.main:id/buttonClose")
    public MobileElement iconClose;

    // This is a constructor, as every page need a base driver to find android elements
    public ModalPostTagProductScreen(AppiumDriver driver) throws IOException {

        this.driver = driver;
        //Initialize Elements of a Page class without having to use ‘FindElement‘ or ‘FindElements‘
        PageFactory.initElements(new AppiumFieldDecorator(this.driver),this);
    }

    public ModalPostTagProductScreen clickViewProductDetailBtn() throws IOException {

        isElementPresent(viewProductDetailBtn);
        tapByElement(viewProductDetailBtn);
        return new ModalPostTagProductScreen(driver);
    }

    public Boolean isElementPresentTaggedProductPost(){

        boolean e1= isElementPresent(counterTaggedProduct);
        boolean e2= isElementPresent(overallRatinglLabel);
        boolean e3= isElementPresent(counterTotalReview);
        boolean e4= isElementPresent(brandNameLabel);
        boolean e5= isElementPresent(productNameLabel);
        boolean e6= isElementPresent(shadeNameLabel);
        boolean e7= isElementPresent(iconClose);
        boolean e8= isElementPresent(viewProductDetailBtn);

        //boolean boolElem5= isElementPresent(firstindextproductmatches);

        return (e1 && e2 && e3 && e4 && e5 && e6 && e7 && e8);
    }

    public Boolean isElementPresentTaggedProductReviewPost(){

        boolean pt= isElementPresent(userPhoto);
        boolean un= isElementPresent(usernameLabel);
        boolean ts= isElementPresent(timestamp);
        boolean img= isElementPresent(imgProd);

        boolean e1= isElementPresent(counterTaggedProduct);
        boolean e2= isElementPresent(overallRatinglLabel);
        boolean e4= isElementPresent(brandNameLabel);
        boolean e5= isElementPresent(productNameLabel);
        boolean e6= isElementPresent(shadeNameLabel);
        boolean e7= isElementPresent(iconClose);
        boolean e8= isElementPresent(viewProductDetailBtn);
        boolean e9 = isElementPresent(captionReview);

        //boolean boolElem5= isElementPresent(firstindextproductmatches);

        return (pt && un && ts && img && e1 && e2 && e4 && e5 && e6 && e7 && e8 && e9);
    }

    public ModalPostTagProductScreen checkElementPresentTaggedProductPost() throws IOException {

        isElementPresentTaggedProductPost();
        return new ModalPostTagProductScreen(driver);
    }

    public ModalPostTagProductScreen checkElementPresentTaggedProductReviewPost() throws IOException {

        isElementPresentTaggedProductReviewPost();
        return new ModalPostTagProductScreen(driver);
    }
}
