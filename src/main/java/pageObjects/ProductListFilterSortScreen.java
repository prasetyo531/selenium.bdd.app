package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.List;

public class ProductListFilterSortScreen extends ActionBase {

    @AndroidFindBy(xpath="//android.view.ViewGroup[contains(@resource-id, 'com.fdbr.android:id/layoutParent') and @index='0']")
    public MobileElement firstProduct;

    /****
     filter and sort
     ****/
    @AndroidFindBy(id="com.fdbr.android.product:id/buttonFilter")
    public MobileElement filterOption;

    @AndroidFindBy(id="com.fdbr.android.product:id/labelMyBeautyId")
    public MobileElement beautyIdFilter;

    @AndroidFindBy(id="com.fdbr.android.product:id/labelAvailableIn")
    public MobileElement bsFilter;

    @AndroidFindBy(id="com.fdbr.android.product:id/rating1")
    public MobileElement rating1Filter;

    @AndroidFindBy(id="om.fdbr.android.product:id/rating2")
    public MobileElement rating2Filter;

    @AndroidFindBy(id="om.fdbr.android.product:id/rating3")
    public MobileElement rating3Filter;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android.product:id/label') and @text='Oily']")
    public MobileElement filterOily;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android.product:id/label') and @text='Combination']")
    public MobileElement filterCombination;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android.product:id/label') and @text='Normal']")
    public MobileElement filterNormal;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android.product:id/label') and @text='Dry']")
    public MobileElement filterDry;

    @AndroidFindBy(xpath="//android.widget.CheckBox[contains(@resource-id, 'com.fdbr.android.product:id/textView')]")
    public List<MobileElement> filterSkinConcernList;

    @AndroidFindBy(id="com.fdbr.android.product:id/actionBrand")
    public MobileElement filterBrand;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android:id/toolbarTitle') and @text='Brand']")
    public MobileElement tittleBrand;

    @AndroidFindBy(xpath="//android.view.ViewGroup[contains(@resource-id, 'com.fdbr.android:id/layoutParent')]")
    public List<MobileElement> listBrand;

    @AndroidFindBy(id="com.fdbr.android:id/toolbarBottomSearch")
    public MobileElement searchBrand;

    @AndroidFindBy(id="com.fdbr.android.filter:id/labelSelected")
    public MobileElement selectedBrand;

    @AndroidFindBy(id="com.fdbr.android.filter:id/buttonAdd")
    public MobileElement addBrandBtn;

    @AndroidFindBy(id="com.fdbr.android.product:id/buttonSorting")
    public MobileElement sortingOption;

    // This is a constructor, as every page need a base driver to find android elements
    public ProductListFilterSortScreen(AppiumDriver driver) throws IOException {

        this.driver = driver;
        //Initialize Elements of a Page class without having to use ‘FindElement‘ or ‘FindElements‘
        PageFactory.initElements(new AppiumFieldDecorator(this.driver),this);
    }

    public ProductListFilterSortScreen clickFirstProduct() throws IOException {

        tapByElement(firstProduct);
        return new ProductListFilterSortScreen(driver);
    }

}
