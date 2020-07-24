package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class ProductDetailScreen extends ActionBase {

    @AndroidFindBy(xpath="//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
    public MobileElement backBtn;

    @AndroidFindBy(id="com.fdbr.android.product:id/share")
    public MobileElement shareBtn;

    @AndroidFindBy(id="com.fdbr.android.product:id/imageProduct")
    public MobileElement imgProduct;

    @AndroidFindBy(id="com.fdbr.android.product:id/layoutContentRating")
    public MobileElement contentRating;

    @AndroidFindBy(id="com.fdbr.android.product:id/labelBrandName")
    public MobileElement labelBrandName;

    @AndroidFindBy(id="com.fdbr.android.product:id/labelProductName")
    public MobileElement labelProductName;

    @AndroidFindBy(id="com.fdbr.android.product:id/buttonReview")
    public MobileElement addReviewBtn;

    @AndroidFindBy(id="com.fdbr.android.product:id/buttonWishlist")
    public MobileElement wishlistBtn;

    @AndroidFindBy(id="com.fdbr.android.product:id/buttonSeeMoreReview")
    public MobileElement seeMoreReviewBtn;

    public ProductDetailScreen(AppiumDriver driver) throws IOException {

        this.driver = driver;
        //Initialize Elements of a Page class without having to use ‘FindElement‘ or ‘FindElements‘
        PageFactory.initElements(new AppiumFieldDecorator(this.driver),this);
    }

    public boolean verifyProductDetail() {

        boolean boolElem1= isElementPresent(imgProduct);
        boolean boolElem2= isElementPresent(contentRating);
        boolean boolElem3= isElementPresent(labelBrandName);
        boolean boolElem4= isElementPresent(labelProductName);

        return (boolElem1 && boolElem2 && boolElem3 && boolElem4);
    }

    public ProductDetailScreen clickAddReviewBtn() throws IOException {

        isElementPresent(addReviewBtn);
        tapByElement(addReviewBtn);
        return new ProductDetailScreen(driver);
    }

    public ProductDetailScreen clickWishlistBtn() throws IOException {

        isElementPresent(wishlistBtn);
        tapByElement(wishlistBtn);
        return new ProductDetailScreen(driver);
    }
}
