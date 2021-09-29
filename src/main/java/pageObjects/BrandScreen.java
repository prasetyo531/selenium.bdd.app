package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

public class BrandScreen extends ActionBase{

    @AndroidFindBy(xpath="//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
    public MobileElement backIcon;

    @AndroidFindBy(id="com.fdbr.android:id/toolbarTitle")
    public MobileElement labelTitle;

    @AndroidFindBy(id="com.fdbr.android:id/toolbarBottomSearch")
    public MobileElement searchBarBrand;

    @AndroidFindBy(id="com.fdbr.android.brand:id/layoutTopBrands")
    public MobileElement layoutTopBrand;

    @AndroidFindBy(id="com.fdbr.android:id/imageBrand1")
    public MobileElement popularList1;

    /******************
     list product brand
     *****************/
    @AndroidFindBy(id="com.fdbr.android.product:id/listProduct")
    public MobileElement listProductBrand;

    public BrandScreen(AppiumDriver driver) {

        this.driver = driver;
        //Initialize Elements of a Page class without having to use ‘FindElement‘ or ‘FindElements‘
        PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
    }

    public BrandScreen checkBrandScreen() {
        isElementPresent(searchBarBrand);
        isElementPresent(layoutTopBrand);
        return new BrandScreen(driver);
    }

    public BrandScreen clickOnePopularBrand() {
        tapByElement(popularList1);
        return new BrandScreen(driver);
    }

    public BrandScreen scrollProductBrandDetail() {
        isElementPresent(listProductBrand);
        verticalSwipeByPercentagesDirectly(609,1843,604, 996);
        verticalSwipeByPercentagesDirectly(609,1843,604, 996);
        verticalSwipeByPercentagesDirectly(609,1843,604, 996);
        verticalSwipeByPercentagesDirectly(609,1843,604, 996);
        return new BrandScreen(driver);
    }

    public BrandScreen getTitleBrandScreen(String brandname) {
        WaitUntilElementIsVisible(labelTitle);
        String titleBrand= labelTitle.getText();
        Assert.assertEquals(brandname,titleBrand);
        return new BrandScreen(driver);
    }
}
