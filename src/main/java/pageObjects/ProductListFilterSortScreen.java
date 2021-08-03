package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;

import java.io.IOException;
import java.util.List;

public class ProductListFilterSortScreen extends ActionBase {

    public static String o1;
    public static String o2;
    public static Integer overallRatBeforeFilter;
    public static Integer overallRatAfterFilter;
    public static Integer overallRatAfterReset;
    public static String checkBeforeSelected;
    public static String checkAfterSelected;

    @AndroidFindBy(xpath="//android.view.ViewGroup[contains(@resource-id, 'com.fdbr.android:id/layoutParent') and @index='0']")
    public MobileElement firstProduct;

    @AndroidFindBy(xpath="//android.view.ViewGroup[contains(@resource-id, 'com.fdbr.android:id/layoutParent')]")
    public List<MobileElement> listProduct;

    /****
     filter and sort
     ****/
    @AndroidFindBy(id="com.fdbr.android.product:id/buttonFilter")
    public MobileElement filterOption;

    @AndroidFindBy(id="com.fdbr.android.product:id/buttonApply")
    public MobileElement applyFilterBtn;

    @AndroidFindBy(id="com.fdbr.android.product:id/buttonReset")
    public MobileElement resetFilterBtn;

    @AndroidFindBy(id="com.fdbr.android.product:id/actionBeautyId")
    public MobileElement beautyIdFilter;

    @AndroidFindBy(id="com.fdbr.android.product:id/actionBeautyStudio")
    public MobileElement bsFilter;

    @AndroidFindBy(id="com.fdbr.android.product:id/rating1")
    public MobileElement rating1Filter;

    @AndroidFindBy(id="com.fdbr.android.product:id/rating2")
    public MobileElement rating2Filter;

    @AndroidFindBy(id="com.fdbr.android.product:id/rating3")
    public MobileElement rating3Filter;

    @AndroidFindBy(id="com.fdbr.android.product:id/rating4")
    public MobileElement rating4Filter;

    @AndroidFindBy(id="com.fdbr.android.product:id/rating5")
    public MobileElement rating5Filter;

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

    @AndroidFindBy(id="com.fdbr.android.product:id/actionShade")
    public MobileElement filterShade;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android:id/toolbarTitle') and @text='Brand']")
    public MobileElement tittleBrand;

    @AndroidFindBy(xpath="//android.view.ViewGroup[contains(@resource-id, 'com.fdbr.android:id/layoutParent') and @index='0']")
    public MobileElement firstBrand;

    @AndroidFindBy(id="com.fdbr.android:id/toolbarBottomSearch")
    public MobileElement searchBrand;

    @AndroidFindBy(id="com.fdbr.android.filter:id/labelSelected")
    public MobileElement selectedBrand;

    @AndroidFindBy(id="com.fdbr.android.filter:id/buttonAdd")
    public MobileElement addBrandBtn;

    @AndroidFindBy(id="com.fdbr.android.product:id/buttonSorting")
    public MobileElement sortingOption;

    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[2]")
    public MobileElement firstProductTotalRating;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android:id/textErrorDescription') and @text='There’s no result found']")
    public MobileElement testResultNotFound;

    // This is a constructor, as every page need a base driver to find android elements
    public ProductListFilterSortScreen(AppiumDriver driver) {

        this.driver = driver;
        //Initialize Elements of a Page class without having to use ‘FindElement‘ or ‘FindElements‘
        PageFactory.initElements(new AppiumFieldDecorator(this.driver),this);
    }

    public ProductListFilterSortScreen clickFirstProduct() {

        tapByElement(firstProduct);
        return new ProductListFilterSortScreen(driver);
    }

    public ProductListFilterSortScreen getTotalRatingBeforeFilter() {

        WaitUntilElementIsVisible(firstProduct);
        //o1 = firstProductTotalRating.getText();
        overallRatBeforeFilter=listProduct.size();
        //overallRatBeforeFilter=Integer.parseInt(o1);
        System.out.println("total product before filter"+" "+overallRatBeforeFilter);
        return new ProductListFilterSortScreen(driver);
    }

    public ProductListFilterSortScreen getTotalRatingAfterFilter() {

        WaitUntilElementIsVisible(firstProduct);
        //o2 = firstProductTotalRating.getText();
        overallRatAfterFilter=listProduct.size();
        //overallRatAfterFilter=Integer.parseInt(o2);
        System.out.println("total product after filter"+" "+overallRatAfterFilter);
        if(overallRatAfterFilter.equals(overallRatBeforeFilter)) {
            Assert.fail("total list product should not same");
        }
        return new ProductListFilterSortScreen(driver);
    }

    public ProductListFilterSortScreen clickFilterChooseAllOption() {
        tapByElement(filterOption);
        WaitUntilElementIsVisible(beautyIdFilter);
        //choose not brand
        tapByElement(beautyIdFilter);
        //tapByElement(bsFilter);
        tapByElement(rating1Filter);
        tapByElement(filterOily);
        clickRandomMultipleMenus(filterSkinConcernList);
        //choose apply filter
        tapByElement(applyFilterBtn);
        return new ProductListFilterSortScreen(driver);
    }

    public ProductListFilterSortScreen clickFilterChooseBrandAndShade() {
        tapByElement(filterOption);
        WaitUntilElementIsVisible(filterBrand);
        tapByElement(filterBrand);
        //choose brand
        checkBeforeSelected = selectedBrand.getText();
        WaitUntilElementIsVisible(firstBrand);
        tapByElement(firstBrand);
        checkAfterSelected = selectedBrand.getText();
        if(checkAfterSelected.equals(checkBeforeSelected)) {
            Assert.fail("counter selected brand should changed");
        }
        tapByElement(addBrandBtn);
        //choose shade
        tapByElement(filterShade);
        WaitUntilElementIsVisible(firstBrand);
        tapByElement(firstBrand);
        tapByElement(addBrandBtn);
        //choose apply filter
        tapByElement(applyFilterBtn);
        return new ProductListFilterSortScreen(driver);
    }

    public ProductListFilterSortScreen clickResetFilterAndDone() {
        tapByElement(filterOption);
        WaitUntilElementIsVisible(resetFilterBtn);
        tapByElement(resetFilterBtn);
        tapByElement(applyFilterBtn);
        return new ProductListFilterSortScreen(driver);
    }

    public ProductListFilterSortScreen getTotalRatingAfterResetFilter() {
        WaitUntilElementIsVisible(firstProduct);
        //o2 = firstProductTotalRating.getText();
        overallRatAfterReset=listProduct.size();
        //overallRatAfterFilter=Integer.parseInt(o2);
        System.out.println("total product after reset"+" "+overallRatAfterReset);
        if((overallRatAfterFilter - overallRatBeforeFilter)==0) {
            Assert.fail("total list product reset should same");
        }
        return new ProductListFilterSortScreen(driver);
    }

    public ProductListFilterSortScreen isResultNotFoundAppear() {
        WaitUntilElementIsVisible(testResultNotFound);
        return new ProductListFilterSortScreen(driver);
    }
}
