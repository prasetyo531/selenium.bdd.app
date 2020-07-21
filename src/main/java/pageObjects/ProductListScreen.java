package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class ProductListScreen extends ActionBase {

    @AndroidFindBy(xpath="//android.view.ViewGroup[contains(@resource-id, 'com.fdbr.android:id/parent') and @index='0']")
    public MobileElement firstProduct;

    /****
     filter and sort
     ****/
    @AndroidFindBy(id="com.fdbr.android.product:id/buttonFilter")
    public MobileElement filterOption;

    @AndroidFindBy(id="com.fdbr.android.product:id/buttonSorting")
    public MobileElement sortingOption;

    // This is a constructor, as every page need a base driver to find android elements
    public ProductListScreen(AppiumDriver driver) throws IOException {

        this.driver = driver;
        //Initialize Elements of a Page class without having to use ‘FindElement‘ or ‘FindElements‘
        PageFactory.initElements(new AppiumFieldDecorator(this.driver),this);
    }

}
