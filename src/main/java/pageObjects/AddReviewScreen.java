package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Assert;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class AddReviewScreen extends ActionBase {

    String reviewTxt = "review review review review review review review review review review review review review review review review review reviewreview review review review review reviewreview review review review review reviewreview review review review review review";
    String editReviewTxt = "edit review edit review edit review edit review edit review edit review edit review edit review edit review edit review edit review edit review edit review edit review edit review edit review edit review edit review edit review edit review edit review ";

    public String getReviewBeforeEditDesc;

    @AndroidFindBy(id="com.fdbr.android:id/inputSearch")
    public MobileElement searchBar;

    @AndroidFindBy(xpath="//android.view.ViewGroup[contains(@resource-id, 'com.fdbr.android:id/parent') and @index='0']")
    public MobileElement firstPopularProduct;

    @AndroidFindBy(id="Navigate up")
    public MobileElement back;

    /* SCREEN 1 */
    @AndroidFindBy(id="com.fdbr.android.add:id/ratingOverall")
    public MobileElement ratingbarAddReview;

    @AndroidFindBy(id="com.fdbr.android.add:id/textRatingLabel")
    public MobileElement labelRating;

    /* SCREEN 2 */
    @AndroidFindBy(id="com.fdbr.android.add:id/imageDuration")
    public MobileElement imgDurationScreen;

    @AndroidFindBy(id="com.fdbr.android.add:id/seekBarDuration")
    public MobileElement usingDurationBar;

    @AndroidFindBy(id="com.fdbr.android.add:id/textDurationLabel")
    public MobileElement textDurationLabel;

    @AndroidFindBy(id="com.fdbr.android.add:id/checkIamUsing")
    public MobileElement firstTimeUse;

    /* SCREEN 3 */
    @AndroidFindBy(xpath="//android.widget.LinearLayout[@content-desc=\"Online\"]")
    public MobileElement onlineTab;

    @AndroidFindBy(xpath="//android.widget.LinearLayout[@content-desc=\"Offline\"]")
    public MobileElement offlineTab;

    @AndroidFindBy(xpath="//android.widget.LinearLayout[@content-desc=\"Others\"]")
    public MobileElement othersTab;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android.add:id/textSource') and @text='FD Flash Sale']")
    public MobileElement fdFlashSale;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android.add:id/textSource') and @text='E-Commerce']")
    public MobileElement ecommerce;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android.add:id/textSource') and @text='Multibrand Store']")
    public MobileElement multibrandStore;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android.add:id/textSource') and @text='None of the above']")
    public MobileElement noneAbove;

    @AndroidFindBy(id="com.fdbr.android.add:id/inputSearch")
    public MobileElement findotheoption;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android.add:id/textSource') and @text='Tokopedia']")
    public MobileElement listTokopedia;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android.add:id/textSource') and @text='Metro']")
    public MobileElement listMetro;

    @AndroidFindBy(id="com.fdbr.android.add:id/textSourceActive")
    public MobileElement inputedNewSource;

    @AndroidFindBy(id="com.fdbr.android.add:id/textSourceLabel")
    public MobileElement submitInput;

    /* SCREEN 4 - would you recommend this product */
    @AndroidFindBy(id="com.fdbr.android.add:id/radioYes")
    public MobileElement yes;

    @AndroidFindBy(id="com.fdbr.android.add:id/radioNo")
    public MobileElement no;

    @AndroidFindBy(id="com.fdbr.android.add:id/reviewEditText")
    public MobileElement reviewdesc;

    @AndroidFindBy(id="com.fdbr.android.add:id/buttonNext")
    public MobileElement submitreview;

    /* common btn */
    @AndroidFindBy(id="com.fdbr.android.add:id/buttonBackToolbar")
    public MobileElement backBtn;

    @AndroidFindBy(id="com.fdbr.android.add:id/buttonPrev")
    public MobileElement prevBtn;

    @AndroidFindBy(id="com.fdbr.android.add:id/buttonNext")
    public MobileElement nextBtn;

    /* Congrats Screen */
    @AndroidFindBy(id="com.fdbr.android.add:id/buttonSeeReview")
    public MobileElement seeMyReview;

    /*  review detail    */
    @AndroidFindBy(id="com.fdbr.android.main:id/labelText")
    public MobileElement descReviewDetail;

    @AndroidFindBy(id="com.fdbr.android.main:id/textUsage")
    public MobileElement usagePeriod;

    @AndroidFindBy(id="com.fdbr.android.main:id/textFrom")
    public MobileElement fromProduct;

    @AndroidFindBy(id="com.fdbr.android.main:id/textRecommended")
    public MobileElement recommended;


    // This is a constructor, as every page need a base driver to find android elements
    public AddReviewScreen(AppiumDriver driver) throws IOException {

        this.driver = driver;
        //Initialize Elements of a Page class without having to use ‘FindElement‘ or ‘FindElements‘
        PageFactory.initElements(new AppiumFieldDecorator(this.driver),this);
    }

    public AddReviewScreen chooseFirstPopularProduct() throws IOException {

        isElementPresent(firstPopularProduct);
        tapByElement(firstPopularProduct);

        return new AddReviewScreen(driver);
    }

    /* add review screen */
    public AddReviewScreen clickNextScreen() throws IOException {

        tapByElement(nextBtn);
        return new AddReviewScreen(driver);
    }

    public AddReviewScreen clickPrevScreen() throws IOException {

        tapByElement(prevBtn);
        return new AddReviewScreen(driver);
    }

    public AddReviewScreen fillRatingAddReview() throws IOException {

        isElementPresent(ratingbarAddReview);
        //http://www.pavantestingtools.com/2019/02/handling-ratingstar-using-appium.html
        try {
            WebElement fiveStarRatingbar = ratingbarAddReview;
            int startX = fiveStarRatingbar.getLocation().getX();
            int endX = fiveStarRatingbar.getSize().getWidth();
            int yAxis = fiveStarRatingbar.getLocation().getY();

            int tapAt = (int) (endX * 1);
            new TouchAction(driver)
                    .press(PointOption.point(tapAt, yAxis)).release().perform();

        } catch (ElementNotVisibleException e){
            e.printStackTrace();
        }

        clickNextScreen();
        return new AddReviewScreen(driver);
    }

    public AddReviewScreen editRatingAddReview() throws IOException {

        isElementPresent(ratingbarAddReview);
        //http://www.pavantestingtools.com/2019/02/handling-ratingstar-using-appium.html
        try {
            WebElement StarRatingbar = ratingbarAddReview;
            int startX = StarRatingbar.getLocation().getX();
            int endX = StarRatingbar.getSize().getWidth();
            int yAxis = StarRatingbar.getLocation().getY();

            int tapAt = (int) (endX * 0.8);
            new TouchAction(driver)
                    .press(PointOption.point(tapAt, yAxis)).release().perform();

        } catch (ElementNotVisibleException e){
            e.printStackTrace();
        }

        clickNextScreen();
        return new AddReviewScreen(driver);
    }

    public AddReviewScreen setStepperDurationofUser() throws IOException {

        isElementPresent(imgDurationScreen);
        //http://www.pavantestingtools.com/2019/02/handling-ratingstar-using-appium.html
        try {
            WebElement durationUse = usingDurationBar;
            int startX = durationUse.getLocation().getX();
            int endX = durationUse.getSize().getWidth();
            int yAxis = durationUse.getLocation().getY();

            int tapAt = (int) (endX * 1);
            new TouchAction(driver)
                    .press(PointOption.point(tapAt, yAxis)).release().perform();

        } catch (ElementNotVisibleException e){
            e.printStackTrace();
        }
        isElementPresent(textDurationLabel);
        String ld = textDurationLabel.getText();
        System.out.println(ld);
        clickNextScreen();
        return new AddReviewScreen(driver);
    }

    public AddReviewScreen editStepperDurationofUser() throws IOException {

        isElementPresent(imgDurationScreen);
        //http://www.pavantestingtools.com/2019/02/handling-ratingstar-using-appium.html
        try {
            WebElement durationUse = usingDurationBar;
            int startX = durationUse.getLocation().getX();
            int endX = durationUse.getSize().getWidth();
            int yAxis = durationUse.getLocation().getY();

            int tapAt = (int) (endX * 0.5);
            new TouchAction(driver)
                    .press(PointOption.point(tapAt, yAxis)).release().perform();

        } catch (ElementNotVisibleException e){
            e.printStackTrace();
        }
        isElementPresent(textDurationLabel);
        String ld = textDurationLabel.getText();
        System.out.println(ld);
        clickNextScreen();
        return new AddReviewScreen(driver);
    }

    public AddReviewScreen checkFirstTimeUse() throws IOException {

        isElementPresent(firstTimeUse);
        tapByElement(firstTimeUse);

        return new AddReviewScreen(driver);
    }

    public AddReviewScreen clickEcommerce() throws IOException {

        try{
            isElementPresent(ecommerce);
            tapByElement(ecommerce);
        }catch (NoSuchElementException e){
            e.printStackTrace();
            sleep(500);
            isElementPresent(ecommerce);
            tapByElement(ecommerce);
        } finally {
            System.out.println("screen 3 display emtpy option");
        }
        return new AddReviewScreen(driver);
    }

    public AddReviewScreen clickMultibrandStore() throws IOException {

        try{
            isElementPresent(offlineTab);
            tapByElement(offlineTab);
            isElementPresent(multibrandStore);
            tapByElement(multibrandStore);
        }catch (NoSuchElementException e){
            e.printStackTrace();
            sleep(500);
            isElementPresent(offlineTab);
            tapByElement(offlineTab);
            isElementPresent(multibrandStore);
            tapByElement(multibrandStore);
        } finally {
            System.out.println("screen 3 display emtpy option");
        }
        return new AddReviewScreen(driver);
    }

    public AddReviewScreen inputNoneAbove(String source) throws IOException {

        isElementPresent(othersTab);
        tapByElement(othersTab);

        isElementPresent(noneAbove);
        tapByElement(noneAbove);

        isElementPresent(findotheoption);
        inputValue(findotheoption, source);

        tapByElement(inputedNewSource);

        clickNextScreen();

        return new AddReviewScreen(driver);
    }

    public AddReviewScreen setTokopedia() throws IOException {

        isElementPresent(findotheoption);
        tapByElement(listTokopedia);

        clickNextScreen();
        return new AddReviewScreen(driver);
    }

    public AddReviewScreen setMetro() throws IOException {

        isElementPresent(findotheoption);
        tapByElement(listMetro);

        clickNextScreen();
        return new AddReviewScreen(driver);
    }

    public AddReviewScreen choosePositiveRecommendation() throws IOException {

        isElementPresent(reviewdesc);
        driver.hideKeyboard();
        tapByElement(yes);
        return new AddReviewScreen(driver);
    }

    public AddReviewScreen chooseNegativeRecommendation() throws IOException {

        isElementPresent(reviewdesc);
        tapByElement(no);
        return new AddReviewScreen(driver);
    }

    public AddReviewScreen writeReview() throws IOException {

        reviewdesc.setValue(reviewTxt);

        String getReviewDesc = reviewdesc.getText();
        System.out.println(getReviewDesc);
        return new AddReviewScreen(driver);
    }

    public AddReviewScreen editReview() throws IOException {

        getReviewBeforeEditDesc = reviewdesc.getText();

        reviewdesc.setValue(editReviewTxt);

        return new AddReviewScreen(driver);
    }

    public AddReviewScreen clickSubmitReview() throws IOException {
        isElementEnabled(submitreview);
        tapByElement(submitreview);
        return new AddReviewScreen(driver);
    }

    public AddReviewScreen clickSeeMyReview() throws IOException {

        //get text congrats

        isElementPresent(seeMyReview);
        tapByElement(seeMyReview);

        //getReviewFromDB

        return new AddReviewScreen(driver);
    }

    public AddReviewScreen compareFieldReview() throws IOException {

        String u = usagePeriod.getText().toLowerCase();
        String f = fromProduct.getText().toLowerCase();
        String r = recommended.getText().toLowerCase();
        System.out.println(u+""+""+f+""+r);
        Assert.assertNotNull(u);
        Assert.assertNotNull(f);
        Assert.assertNotNull(r);

        return new AddReviewScreen(driver);
    }


}
