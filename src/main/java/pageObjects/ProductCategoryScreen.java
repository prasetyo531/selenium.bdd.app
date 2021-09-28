package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.List;

public class ProductCategoryScreen extends ActionBase {

    @AndroidFindBy(id="com.fdbr.android:id/toolbarBottomSearch")
    public MobileElement searchBar;

    @AndroidFindBy(xpath="//android.view.ViewGroup[contains(@resource-id,'com.fdbr.android.product:id/itemParent') and @index='6']")
    public MobileElement categoryToScroll;

    @AndroidFindBy(id="com.fdbr.android.product:id/buttonSkinCare")
    public MobileElement parentSkincare;

    @AndroidFindBy(id="com.fdbr.android.product:id/buttonMakeUp")
    public MobileElement parentMakeUp;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'com.fdbr.android.product:id/labelItem') and @text='Lipstick']")
    public MobileElement productCategoryMakeUp;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'com.fdbr.android.product:id/labelItem') and @text='Cream & Lotion']")
    public MobileElement productCategorySkincare;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android.product:id/labelSubItem')]")
    public List<MobileElement> listProductCat;

    @AndroidFindBy(xpath="//android.widget.ImageView[contains(@resource-id,'com.fdbr.android:id/imagePhoto')]")
    public MobileElement photoProduct;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'com.fdbr.android:id/labelProductName')]")
    public MobileElement productName;

    // This is a constructor, as every page need a base driver to find android elements
    public ProductCategoryScreen(AppiumDriver driver){

        this.driver = driver;
        //Initialize Elements of a Page class without having to use ‘FindElement‘ or ‘FindElements‘
        PageFactory.initElements(new AppiumFieldDecorator(this.driver),this);
    }

    public ProductCategoryScreen clickInputSearchBar(String productname) throws InterruptedException {

        WaitUntilElementIsVisible(searchBar);
        inputValueEnter(searchBar,productname);
        Thread.sleep(4000);
        return new ProductCategoryScreen(driver);
    }

    public ProductCategoryScreen clickMenuMakeUp() {

        WaitUntilElementIsVisible(parentMakeUp);
        tapByElement(parentMakeUp);
        return new ProductCategoryScreen(driver);
    }

    public ProductCategoryScreen clickMenuSkincare() {

        WaitUntilElementIsVisible(productCategorySkincare);
        tapByElement(productCategorySkincare);
        return new ProductCategoryScreen(driver);
    }

    public ProductCategoryScreen clickMenuMakeUpLipstick() {

        WaitUntilElementIsVisible(parentMakeUp);
        tapByElement(parentMakeUp);
        verticalSwipe(categoryToScroll, 2, 900);
        tapByElement(productCategoryMakeUp);
        return new ProductCategoryScreen(driver);
    }

    public ProductCategoryScreen clickRandomMenuProductCat() {

        clickRandomMenus(listProductCat);
        return new ProductCategoryScreen(driver);
    }

    public boolean isSearchBarActive() {

        WaitUntilElementIsVisible(searchBar);
        boolean boolElem1= isElementPresent(searchBar);
        String txt = searchBar.getText();
        return (boolElem1);
    }

    public boolean isSearchResultAppear() {

        WaitUntilElementIsVisible(photoProduct);
        boolean boolElem1= isElementPresent(photoProduct);
        boolean boolElem2= isElementPresent(productName);
        return (boolElem1 && boolElem2);
    }

    public ProductCategoryScreen clickFirstProductSearchResult() {

        clickFirstMenus(listProductCat);
        return new ProductCategoryScreen(driver);
    }
}
