package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.DriverFactory;

import java.io.IOException;
import java.util.List;

public class ReviewListScreen extends ActionBase {

    public static String uname1;
    public static String uname2;

    @AndroidFindBy(id="com.fdbr.android:id/layoutTitle")
    public MobileElement title;

    @AndroidFindBy(xpath="//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
    public MobileElement backIcon;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'com.fdbr.android.product:id/labelUserName') and @index='0']")
    public MobileElement firstReviewList;

    @AndroidFindBy(id="com.fdbr.android.product:id/buttonFilter")
    public MobileElement filterBtn;

    @AndroidFindBy(id="com.fdbr.android.product:id/buttonSorting")
    public MobileElement sortBtn;

    /* filter option */
    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'com.fdbr.android.filter:id/labelTitle') and @text='Age Range']")
    public MobileElement ageRangeOption;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'com.fdbr.android.filter:id/labelTitle') and @text='Skin Type']")
    public MobileElement skinTypeOption;

    @AndroidFindBy(id="com.fdbr.android.filter:id/buttonReset")
    public MobileElement resetFilterBtn;

    @AndroidFindBy(id="com.fdbr.android.filter:id/buttonDone")
    public MobileElement doneBtn;

    @AndroidFindBy(id="com.fdbr.android.filter:id/labelSelected")
    public MobileElement labelFilterSelected2;

    /* age range option */
    @AndroidFindBy(xpath="//android.view.ViewGroup[contains(@resource-id, 'com.fdbr.android:id/layoutParent')]")
    public List<MobileElement> listAgeRangeSkinType;

    @AndroidFindBy(id="com.fdbr.android.filter:id/buttonAdd")
    public MobileElement addFilterBtn;

    @AndroidFindBy(id="com.fdbr.android.filter:id/labelSelected")
    public MobileElement labelFilterSelected1;

    /* sort option */
    @AndroidFindBy(id="com.fdbr.android:id/labelMenuTitle")
    public MobileElement sortTitle;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android:id/textItem') and @text='Most Like']")
    public MobileElement mostLike;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android:id/textItem') and @text='Newest Review']")
    public MobileElement newestReview;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android:id/textItem') and @text='Oldest Review']")
    public MobileElement oldestReview;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android:id/textItem') and @text='Highest Rating']")
    public MobileElement highestRating;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android:id/textItem') and @text='Lowest Rating']")
    public MobileElement lowestRating;

    @AndroidFindBy(id="com.fdbr.android:id/buttonCancel")
    public MobileElement cancelSort;

    public ReviewListScreen(AppiumDriver driver) throws IOException {

        this.driver = driver;
        //Initialize Elements of a Page class without having to use ‘FindElement‘ or ‘FindElements‘
        PageFactory.initElements(new AppiumFieldDecorator(this.driver),this);
    }

    public ReviewListScreen clickFilter() throws IOException {

        tapByElement(filterBtn);

        return new ReviewListScreen(driver);
    }

    public ReviewListScreen clickSort() throws IOException {

        tapByElement(sortBtn);

        return new ReviewListScreen(driver);
    }

    public ReviewListScreen clickResetFilter() throws IOException {

        tapByElement(resetFilterBtn);

        return new ReviewListScreen(driver);
    }

    public ReviewListScreen getUsernameBeforeFilterSort() throws IOException {

        isElementPresent(firstReviewList);
        uname1 = firstReviewList.getText();

        return new ReviewListScreen(driver);
    }

    public ReviewListScreen getUsernameAfterFilterSort() throws IOException {

        isElementPresent(firstReviewList);
        uname2 = firstReviewList.getText();
        System.out.println("username nya adalah"+" "+uname1+" "+uname2);
        Assert.assertNotSame(uname1, uname2);

        return new ReviewListScreen(driver);
    }

    public boolean acceptanceElementFilterCheck() {

        boolean boolElem1 = isElementPresent(ageRangeOption);
        boolean boolElem2 = isElementPresent(skinTypeOption);
        boolean boolElem3 = isElementPresent(resetFilterBtn);
        boolean boolElem4 = isElementPresent(doneBtn);
        //boolean boolElem5= isElementPresent(firstindextproductmatches);

        return (boolElem1 && boolElem2 && boolElem3 && boolElem4);
    }

    public boolean acceptanceElementOptionFilterCheck() {

        boolean boolElem1 = isElementPresent(addFilterBtn);
        boolean boolElem2 = isElementPresent(labelFilterSelected1);
        //boolean boolElem5= isElementPresent(firstindextproductmatches);

        return (boolElem1 && boolElem2);
    }

    public ReviewListScreen chooseFilterAgeRange() throws IOException {

        //choosing age range
        tapByElement(ageRangeOption);

        acceptanceElementOptionFilterCheck();

        String labelBeforeSelected = labelFilterSelected1.getText();
        clickRandomMenus(listAgeRangeSkinType);
        String labelAfterSelected = labelFilterSelected1.getText();
        Assert.assertNotSame(labelAfterSelected, labelBeforeSelected);

        tapByElement(addFilterBtn);

        //check label selected should present on filter
        isElementPresent(labelFilterSelected2);

        return new ReviewListScreen(driver);
    }

    public ReviewListScreen clickDoneFilter() throws IOException {

        tapByElement(doneBtn);

        return new ReviewListScreen(driver);
    }

    public ReviewListScreen chooseFilterSkinType() throws IOException {

        //choosing skin type
        tapByElement(skinTypeOption);

        String labelBeforeSelected = labelFilterSelected1.getText();
        clickRandomMenus(listAgeRangeSkinType);
        String labelAfterSelected = labelFilterSelected1.getText();
        Assert.assertNotSame(labelAfterSelected, labelBeforeSelected);

        tapByElement(addFilterBtn);

        //check label selected should present on filter
        isElementPresent(labelFilterSelected2);


        return new ReviewListScreen(driver);
    }

    public boolean acceptanceElementOptionSortCheck() {

        boolean boolElem1 = isElementPresent(sortTitle);
        boolean boolElem2 = isElementPresent(mostLike);
        boolean boolElem3 = isElementPresent(newestReview);
        boolean boolElem4 = isElementPresent(oldestReview);
        boolean boolElem5 = isElementPresent(highestRating);
        boolean boolElem6 = isElementPresent(lowestRating);
        boolean boolElem7 = isElementPresent(cancelSort);

        return (boolElem1 && boolElem2 && boolElem3 && boolElem4 && boolElem5 && boolElem6 && boolElem7);
    }

    public ReviewListScreen chooseMostLikeSort() throws IOException {

        acceptanceElementOptionSortCheck();

        tapByElement(mostLike);

        return new ReviewListScreen(driver);
    }
}
