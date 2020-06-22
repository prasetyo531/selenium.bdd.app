package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class HomeScreen extends ActionBase {

    private static DesiredCapabilities capabilities = new DesiredCapabilities();

    //@AndroidFindBy(xpath="//class[contains(@resource-id, '') and @text='FD Flash Sale']")

    /***********
     account status
     ***********/
    @AndroidFindBy(id="com.fdbr.android:id/btnAction")
    @iOSXCUITFindBy(id="COMPLETE VERIFY")
    public MobileElement accountCompleteVerBtn;

    @AndroidFindBy(id="com.fdbr.android:id/btnClose")
    @iOSXCUITFindBy(id="icon close")
    public MobileElement closeAccountStatusModal;

    /************
     home screen
     ************/
    @AndroidFindBy(id="com.fdbr.android:id/labelHello")
    @iOSXCUITFindBy(id="Hello Beautiful")
    public MobileElement greetingText;

    @AndroidFindBy(id="com.fdbr.android:id/layoutAds")
    @iOSXCUITFindBy(id="COMPLETE VERIFY")
    public MobileElement adsBanner;

    @AndroidFindBy(id="com.fdbr.android:id/buttonMenuToolbar")
    @iOSXCUITFindBy(id="ic notification")
    public MobileElement notifBtn;

    @AndroidFindBy(id="com.fdbr.android:id/inputSearch")
    @iOSXCUITFindBy(id="Find product, article, brand or user here")
    public MobileElement searchBar;

    @AndroidFindBy(id="com.fdbr.android:id/id_addreview")
    public MobileElement addReview;

    @AndroidFindBy(id="com.fdbr.android:id/id_addpost")
    public MobileElement addPost;

    @AndroidFindBy(id="com.fdbr.android:id/id_addproduct")
    public MobileElement addProduct;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'com.fdbr.android.debug:id/buttonCancel') and @text='Cancel']")
    public MobileElement cancel;

    @AndroidFindBy(xpath ="//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[4]")
    public MobileElement firstindextproductmatches;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'com.fdbr.android.debug:id/textMatch') and @text='Match: Skin Type, Skin Undertone']")
    public MobileElement productMatchesSkinTypeAndSkinUndertone;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'com.fdbr.android.debug:id/textMatch') and @text='Match: Skin Type, Skin Tone']")
    public MobileElement productMatchesSkinTypeAndSkinTone;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'com.fdbr.android.debug:id/textMatch') and @text='Match: Skin Tone']")
    public MobileElement productMatchesSkinTone;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'com.fdbr.android.debug:id/textMatch') and @text='Match: Skin Type']")
    public MobileElement productMatchesSkinType;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'com.fdbr.android.debug:id/textMatch') and @text='Match: Hair Type']")
    public MobileElement productMatchesHairType;

    /*****
    search result screen
     *****/
    @AndroidFindBy(xpath="//android.widget.LinearLayout[@content-desc=\"Users\"]")
    public MobileElement usersTab;

    @AndroidFindBy(xpath="//android.widget.LinearLayout[@content-desc=\"Articles\"]")
    public MobileElement articlesTab;

    @AndroidFindBy(xpath="//android.widget.LinearLayout[@content-desc=\"Brands\"]")
    public MobileElement brandsTab;

    @AndroidFindBy(xpath="//android.widget.LinearLayout[@content-desc=\"Products\"]")
    public MobileElement productsTab;

    @AndroidFindBy(xpath="//android.widget.ImageView[contains(@resource-id, 'com.fdbr.android:id/imageUser') and @index='0']")
    public MobileElement firstResultUsersTab;

    /**********
     tab bar
     **********/
    @AndroidFindBy(id="com.fdbr.android:id/homeFragment")
    public MobileElement homeTab;

    @AndroidFindBy(id="com.fdbr.android:id/feedFragment")
    public MobileElement feedTab;

    @AndroidFindBy(id="com.fdbr.android:id/discoverFragment")
    public MobileElement discoverTab;

    @AndroidFindBy(id="com.fdbr.android:id/extra")
    public MobileElement plusTab;

    @AndroidFindBy(id="com.fdbr.android:id/profileFragment")
    public MobileElement profileTab;

    /**********
     plus box
     ***********/
    @AndroidFindBy(id="com.fdbr.android:id/id_addreview")
    public MobileElement addReviewMenu;

    @AndroidFindBy(id="com.fdbr.android:id/id_addpost")
    public MobileElement addPostMenu;

    @AndroidFindBy(id="com.fdbr.android:id/id_addproduct")
    public MobileElement addProductMenu;

    @AndroidFindBy(id="com.fdbr.android:id/buttonCancel")
    public MobileElement cancelMenu;


    // This is a constructor, as every page need a base driver to find android elements
    public HomeScreen(AppiumDriver driver) throws IOException {

        this.driver = driver;
        //Initialize Elements of a Page class without having to use ‘FindElement‘ or ‘FindElements‘
        PageFactory.initElements(new AppiumFieldDecorator(this.driver),this);
    }

    /*
    public void verifyAccountStatusModal(){
        try {
            isElementPresent(accountStatus);
            System.out.println("account status is present");
            return true;
        } catch (NoSuchElementException e){
            e.printStackTrace();
            System.out.println("account status is not present");
        }
    }
     */

    public boolean verifyHomescreen() {

        boolean boolElem1= isElementPresent(greetingText);
        boolean boolElem2= isElementPresent(notifBtn);
        boolean boolElem3= isElementPresent(searchBar);
        //boolean boolElem5= isElementPresent(firstindextproductmatches);

        return (boolElem1 && boolElem2 && boolElem3);
    }

    public boolean verifyHomescreenIos() {

        boolean boolElem2= isElementPresent(notifBtn);
        boolean boolElem3= isElementPresent(searchBar);
        //boolean boolElem5= isElementPresent(firstindextproductmatches);

        return (boolElem2 && boolElem3);
    }

    public boolean verifyAccountStatusModal() {

        boolean checkAccountStatusModal = isElementPresent(accountCompleteVerBtn);
        if (checkAccountStatusModal == true) {
            tapByElement(closeAccountStatusModal);
            System.out.println("account status modal is present");
            verifyHomescreen();
        } else {
            System.out.println("account status modal is not present");
            verifyHomescreen();
        }
        return (checkAccountStatusModal && verifyHomescreen());
    }


    /*
    public void verifyAccountStatusModal() {

        boolean checkAccountStatusModal = isElementPresent(accountCompleteVerBtn);
        if (checkAccountStatusModal) {
            tapByElement(closeAccountStatusModal);
            System.out.println("account status modal is present");
            verifyHomescreen();
        } else {
            System.out.println("account status modal is not present");
            verifyHomescreen();
        }
    }
     */

    public void verifyAccountStatusModalIos() {

        boolean checkAccountStatusModal = isElementPresent(accountCompleteVerBtn);
        if (checkAccountStatusModal == true) {
            tapByElement(closeAccountStatusModal);
            System.out.println("account status modal is present");
            verifyHomescreenIos();
        } else {
            System.out.println("account status modal is not present");
            verifyHomescreen();
        }
//        capabilities.setCapability("autoAcceptAlerts",true);
    }

    public void verifyProductMatches() {

        isElementPresent(firstindextproductmatches);
        System.out.println("product matches is present");
    }

    public void clickAccountCompleteVerBtn(){

        tapByElement(accountCompleteVerBtn);
    }

    public HomeScreen clickAddReviewHomeMenu() throws IOException {

        tapByElement(plusTab);
        tapByElement(addReviewMenu);
        return new HomeScreen(driver);
    }

    public HomeScreen clickAddPostHomeMenu() throws IOException {

        tapByElement(plusTab);
        tapByElement(addPostMenu);
        return new HomeScreen(driver);
    }

    public HomeScreen clickDiscoverHomeMenu() throws IOException {

        tapByElement(discoverTab);
        return new HomeScreen(driver);
    }

    public HomeScreen clickHomeMenu() throws IOException {

        tapByElement(homeTab);
        return new HomeScreen(driver);
    }

    //search
    public HomeScreen clickSearch() throws IOException {

        tapByElement(searchBar);
        return new HomeScreen(driver);
    }

    public HomeScreen clickUsersTab() throws IOException {

        isElementPresent(usersTab);
        tapByElement(usersTab);
        return new HomeScreen(driver);
    }

    public HomeScreen inputSearch(String fullname) throws IOException {

        inputValue(searchBar, fullname);
        return new HomeScreen(driver);
    }

    public HomeScreen clickFirstElementSearch() throws IOException {

        tapByElement(firstResultUsersTab);
        return new HomeScreen(driver);
    }



}
