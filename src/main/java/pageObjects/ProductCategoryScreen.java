package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class ProductCategoryScreen extends ActionBase {

    @AndroidFindBy(id="com.fdbr.android:id/toolbarBottomSearch")
    public MobileElement searchBar;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'com.fdbr.android:id/labelMenuName') and @text='Body']")
    public MobileElement productCategoryBody;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'com.fdbr.android:id/labelMenuName') and @text='SkinCare']")
    public MobileElement productCategorySkincare;

    @AndroidFindBy(xpath="//android.view.ViewGroup[contains(@resource-id, 'com.fdbr.android:id/parent') and @index='0']")
    public MobileElement firstPopularProduct;

    // This is a constructor, as every page need a base driver to find android elements
    public ProductCategoryScreen(AppiumDriver driver) throws IOException {

        this.driver = driver;
        //Initialize Elements of a Page class without having to use ‘FindElement‘ or ‘FindElements‘
        PageFactory.initElements(new AppiumFieldDecorator(this.driver),this);
    }

    public ProductCategoryScreen clickMenuBody(){

        tapByElement(productCategoryBody);

        return new ProductCategoryScreen(driver);
    }

    public ProductCategoryScreen clickMenuSkincare(){

        tapByElement(productCategorySkincare);

        return new ProductCategoryScreen(driver);
    }

}
