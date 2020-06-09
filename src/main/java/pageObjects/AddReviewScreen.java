package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class AddReviewScreen extends ActionBase {

    @AndroidFindBy(id="com.fdbr.android:id/inputSearch")
    public MobileElement searchBar;

    @AndroidFindBy(xpath="//android.view.ViewGroup[contains(@resource-id, 'com.fdbr.android:id/layoutParent') and @index='0']")
    public MobileElement firstPopularProduct;

    @AndroidFindBy(id="com.fdbr.android:id/buttonBackToolbar")
    public MobileElement back;

    /* SCREEN 1 */
    @AndroidFindBy(id="com.fdbr.android:id/ratingOverall")
    public MobileElement ratingbarAddReview;

    /* SCREEN 2 */
    @AndroidFindBy(id="com.fdbr.android:id/imageDuration")
    public MobileElement imgDurationScreen;

    @AndroidFindBy(id="com.fdbr.android:id/radio1")
    public MobileElement stepper1;

    @AndroidFindBy(id="com.fdbr.android:id/radio2")
    public MobileElement stepper2;

    @AndroidFindBy(id="com.fdbr.android:id/radio3")
    public MobileElement stepper3;

    @AndroidFindBy(id="com.fdbr.android:id/radio4")
    public MobileElement stepper4;

    @AndroidFindBy(id="com.fdbr.android:id/radio5")
    public MobileElement stepper5;

    @AndroidFindBy(id="com.fdbr.android:id/checkIamUsing")
    public MobileElement firstTimeUse;

    /* SCREEN 3 */
    @AndroidFindBy(id="Online")
    public MobileElement onlineTab;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android:id/textSource') and @text='FD Flash Sale']")
    public MobileElement fdFlashSale;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android:id/textSource') and @text='E-Commerce']")
    public MobileElement ecommerce;

    @AndroidFindBy(id="Others")
    public MobileElement othersTab;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android:id/textSource') and @text='None of the above']")
    public MobileElement noneAbove;

    @AndroidFindBy(id="com.fdbr.android:id/inputSearch")
    public MobileElement findotheroption;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android:id/textSource') and @text='Tokopedia']")
    public MobileElement listTokopedia;

    @AndroidFindBy(id="com.fdbr.android:id/textSourceLabel")
    public MobileElement submitInput;

    /* SCREEN 4 - would you recommend this product */
    @AndroidFindBy(id="com.fdbr.android:id/id_yes")
    public MobileElement yes;

    @AndroidFindBy(id="com.fdbr.android:id/id_no")
    public MobileElement no;

    @AndroidFindBy(id="com.fdbr.android:id/Review_Desc")
    public MobileElement reviewdesc;

    @AndroidFindBy(id="com.fdbr.android:id/id_submit")
    public MobileElement submitreview;

    /* common btn */
    @AndroidFindBy(id="com.fdbr.android:id/buttonBackToolbar")
    public MobileElement backBtn;

    @AndroidFindBy(id="com.fdbr.android:id/buttonPrev")
    public MobileElement prevBtn;

    @AndroidFindBy(id="com.fdbr.android:id/buttonNext")
    public MobileElement nextBtn;

    /* Congrats Screen */
    @AndroidFindBy(id="com.fdbr.android:id/id_seeReview")
    public MobileElement seeMyReview;

    // This is a constructor, as every page need a base driver to find android elements
    public AddReviewScreen(AppiumDriver driver) throws IOException {

        this.driver = driver;
        //Initialize Elements of a Page class without having to use ‘FindElement‘ or ‘FindElements‘
        PageFactory.initElements(new AppiumFieldDecorator(this.driver),this);
    }

    public void chooseFirstPopularProduct(){

        isElementPresent(firstPopularProduct);
        tapByElement(firstPopularProduct);
    }

    /* add review screen */
    public void clickNextScreen(){

        tapByElement(nextBtn);
    }

    public void fillRatingAddReview(){

        isElementPresent(ratingbarAddReview);
        //http://www.pavantestingtools.com/2019/02/handling-ratingstar-using-appium.html
        try {
            WebElement threeStarRatingbar = ratingbarAddReview;
            int startX = threeStarRatingbar.getLocation().getX();
            int endX = threeStarRatingbar.getSize().getWidth();
            int yAxis = threeStarRatingbar.getLocation().getY();

            int tapAt = (int) (endX * 1);
            new TouchAction(driver)
                    .press(PointOption.point(tapAt, yAxis)).release().perform();

        } catch (ElementNotVisibleException e){
            e.printStackTrace();
        }

        clickNextScreen();
    }

    public void setStepperDurationofUser(){

        isElementPresent(imgDurationScreen);
        tapByElement(stepper1);

        clickNextScreen();
    }

    public void checkFirstTimeUse(){

        isElementPresent(firstTimeUse);
        tapByElement(firstTimeUse);
    }

    public void clickEcommerce(){

        try{
            isElementPresent(ecommerce);
            tapByElement(ecommerce);
        }catch (NoSuchElementException e){
            e.printStackTrace();
            sleep(5000);
            isElementPresent(ecommerce);
            tapByElement(ecommerce);
        } finally {
            System.out.println("screen 3 display emtpy option");
        }
    }

    public void setTokopedia(){

        isElementPresent(findotheroption);
        tapByElement(listTokopedia);

        clickNextScreen();
    }

    public void choosePositiveRecommendation(){

        isElementPresent(reviewdesc);
        driver.hideKeyboard();
        tapByElement(yes);
    }

    public void chooseNegativeRecommendation(){

        isElementPresent(reviewdesc);
        tapByElement(no);
    }

    public void writeReview(){

        reviewdesc.setValue("test desc"+""+faker.lorem().fixedString(200));

        String getReviewDesc = reviewdesc.getText();
        System.out.println(getReviewDesc);
    }

    public void clickSubmitReview(){
        isElementEnabled(submitreview);
        tapByElement(submitreview);
    }

    public void clickSeeMyReview(){

        //get text congrats

        isElementPresent(seeMyReview);
        tapByElement(seeMyReview);

        //getReviewFromDB
    }
}
