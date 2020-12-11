package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.List;

public class HomeScreen extends ActionBase {

    private static DesiredCapabilities capabilities = new DesiredCapabilities();

    //@AndroidFindBy(xpath="//class[contains(@resource-id, '') and @text='FD Flash Sale']")

    /***********
     account status
     ***********/
    @AndroidFindBy(id="com.fdbr.android:id/buttonAction")
    public List<MobileElement> accountCompleteVerBtnCheck;

    @AndroidFindBy(id="com.fdbr.android:id/buttonAction")
    @iOSXCUITFindBy(id="COMPLETE VERIFY")
    public MobileElement accountCompleteVerBtn;

    @AndroidFindBy(id="com.fdbr.android:id/buttonClose")
    @iOSXCUITFindBy(id="icon close")
    public MobileElement closeAccountStatusModal;

    /************
     home screen
     ************/
    @AndroidFindBy(id="com.android.packageinstaller:id/permission_allow_button")
    public MobileElement permissionAllow;

    @AndroidFindBy(id="com.android.packageinstaller:id/permission_deny_button")
    public MobileElement permissionDeny;

    @AndroidFindBy(id="com.fdbr.android:id/toolbarTitle")
    @iOSXCUITFindBy(id="Hello Beautiful")
    public MobileElement greetingText;

    @AndroidFindBy(id="com.fdbr.android:id/layoutAds")
    @iOSXCUITFindBy(id="COMPLETE VERIFY")
    public MobileElement adsBanner;

    @AndroidFindBy(id="com.fdbr.android:id/toolbarNotif")
    @iOSXCUITFindBy(id="ic notification")
    public MobileElement notifBtn;

    @AndroidFindBy(id="com.fdbr.android:id/buttonSearch")
    @iOSXCUITFindBy(id="Find product, article, brand or user here")
    public MobileElement searchIcon;

    @AndroidFindBy(id="com.fdbr.android.main:id/imageXb")
    public MobileElement floatingImg;

    @AndroidFindBy(id="com.fdbr.android.main:id/fabClose")
    public MobileElement closeFloatingImg;

    @AndroidFindBy(xpath="//android.view.ViewGroup[contains(@resource-id, 'com.fdbr.android:id/itemMenuParent') and @index='1']")
    public MobileElement tnrMenu;

    @AndroidFindBy(xpath="//android.view.ViewGroup[contains(@resource-id,'com.fdbr.android:id/itemMenuParent') and @index='4']")
    public MobileElement productCategoryMenu;

    /************
     plus button
     ************/
    @AndroidFindBy(id="com.fdbr.android.main:id/actionAddReview")
    public MobileElement addReviewMenu;

    @AndroidFindBy(id="com.fdbr.android.main:id/actionAddPost")
    public MobileElement addPostMenu;

    @AndroidFindBy(id="com.fdbr.android.main:id/actionAddProduct")
    public MobileElement addProductMenu;

    @AndroidFindBy(id="com.fdbr.android.main:id/buttonCancel")
    public MobileElement cancelMenu;


    /**********
     product matches
     **********/
    @AndroidFindBy(id="com.fdbr.android.main:id/buttonComplete")
    public MobileElement btnCompleteBeautyID;

    @AndroidFindBy(xpath ="//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[4]")
    public MobileElement firstindextproductmatches;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'com.fdbr.android.main:id/textMatch') and @text='Match: Skin Type, Skin Undertone']")
    public MobileElement productMatchesSkinTypeAndSkinUndertone;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'com.fdbr.android.main:id/textMatch') and @text='Match: Skin Type, Skin Tone']")
    public MobileElement productMatchesSkinTypeAndSkinTone;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'com.fdbr.android.main:id/textMatch') and @text='Match: Skin Tone']")
    public MobileElement productMatchesSkinTone;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'com.fdbr.android.main:id/textMatch') and @text='Match: Skin Type']")
    public MobileElement productMatchesSkinType;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'com.fdbr.android.main:id/textMatch') and @text='Match: Hair Type']")
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

    @AndroidFindBy(xpath="//android.widget.ImageView[contains(@resource-id, 'com.fdbr.android.main:id/imageUser') and @index='0']")
    public MobileElement firstResultUsersTab;

    /**********
     tab bar
     **********/
    @AndroidFindBy(id="com.fdbr.android.main:id/home")
    public MobileElement homeTab;

    @AndroidFindBy(id="com.fdbr.android.main:id/feed")
    public MobileElement feedTab;

    @AndroidFindBy(id="com.fdbr.android.main:id/discover")
    public MobileElement discoverTab;

    @AndroidFindBy(id="com.fdbr.android.main:id/plus")
    public MobileElement plusTab;

    @AndroidFindBy(id="com.fdbr.android.main:id/profile")
    public MobileElement profileTab;

    /**********
     verify user component
     ***********/
    @AndroidFindBy(id="com.fdbr.android.main:id/seekBarStatusUser")
    public MobileElement progressBar;

    @AndroidFindBy(id="com.fdbr.android.main:id/textNeedVerify")
    public MobileElement textNeedVerify;

    @AndroidFindBy(id="com.fdbr.android.main:id/buttonVerifyUser")
    public MobileElement btnNeedVerify;

    // This is a constructor, as every page need a base driver to find android elements
    public HomeScreen(AppiumDriver driver) throws IOException {

        this.driver = driver;
        //Initialize Elements of a Page class without having to use ‘FindElement‘ or ‘FindElements‘
        PageFactory.initElements(new AppiumFieldDecorator(this.driver),this);
    }

    public HomeScreen allowPermission() throws IOException {

        isElementPresent(permissionAllow);
        tapByElement(permissionAllow);
        return new HomeScreen(driver);
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
        boolean boolElem3= isElementPresent(searchIcon);
        //boolean boolElem5= isElementPresent(firstindextproductmatches);

        return (boolElem1 && boolElem2 && boolElem3);
    }

    public boolean verifyHomescreenIos() {

        boolean boolElem2= isElementPresent(notifBtn);
        boolean boolElem3= isElementPresent(searchIcon);
        //boolean boolElem5= isElementPresent(firstindextproductmatches);

        return (boolElem2 && boolElem3);
    }

    public boolean verifyAccountStatusModal() throws InterruptedException {

        Thread.sleep(2000);
        //http://appium.io/docs/en/commands/element/find-elements/#find-elements
        List<MobileElement> checkAccountStatusModal = (List<MobileElement>) driver.findElementsById("com.fdbr.android:id/buttonAction");
        //boolean checkAccountStatusModal = isElementPresent(accountCompleteVerBtn);
        try {
            if (checkAccountStatusModal.size()>0) {
                tapByElement(closeAccountStatusModal);
                System.out.println("account status modal is present");
                verifyHomescreen();
            } else {
                System.out.println("account status modal is not present");
                verifyHomescreen();
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return (verifyHomescreen());
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

    public HomeScreen verifyAccountStatusModalIos() throws IOException {

        boolean checkAccountStatusModal = isElementPresent(accountCompleteVerBtn);
        if (checkAccountStatusModal == true) {
            tapByElement(closeAccountStatusModal);
            System.out.println("account status modal is present");
            verifyHomescreenIos();
        } else {
            System.out.println("account status modal is not present");
            verifyHomescreen();
        }
        return new HomeScreen(driver);
    }

    public Boolean checkProgressBarVerifyEmailPhone(){

        boolean e1= isElementPresent(progressBar);
        boolean e2= isElementPresent(textNeedVerify);
        boolean e3= isElementPresent(btnNeedVerify);
        String txt = btnNeedVerify.getText().toString();
        Assert.assertTrue(txt.equalsIgnoreCase("Verify"));
        //boolean boolElem5= isElementPresent(firstindextproductmatches);

        return (e1 && e2 && e3);
    }

    public Boolean checkProgressBarCompleteProfile(){

        boolean e1= isElementPresent(progressBar);
        boolean e2= isElementPresent(textNeedVerify);
        boolean e3= isElementPresent(btnNeedVerify);
        String txt = btnNeedVerify.getText().toString();
        Assert.assertTrue(txt.equalsIgnoreCase("Complete"));
        //boolean boolElem5= isElementPresent(firstindextproductmatches);

        return (e1 && e2 && e3);
    }

    public HomeScreen findAndCloseFloatingImg() throws IOException {

        isElementPresent(floatingImg);
        tapByElement(closeFloatingImg);
        return new HomeScreen(driver);
    }

    public HomeScreen completeMyBeautyIdProductMatches() throws IOException {

        isElementPresent(btnCompleteBeautyID);
        tapByElement(btnCompleteBeautyID);
        System.out.println("complete my beautyId is present");
        return new HomeScreen(driver);
    }

    //menu bar
    public HomeScreen clickProductCategory() throws IOException {

        isElementPresent(productCategoryMenu);
        tapByElement(productCategoryMenu);
        return new HomeScreen(driver);
    }

    public HomeScreen clickTnrMenu() throws IOException {

        isElementPresent(tnrMenu);
        tapByElement(tnrMenu);
        return new HomeScreen(driver);
    }

    public HomeScreen verifyProductMatches() throws IOException {

        isElementPresent(firstindextproductmatches);
        System.out.println("product matches is present");
        return new HomeScreen(driver);
    }

    public HomeScreen clickAccountCompleteVerBtn() throws IOException {

        isElementPresent(accountCompleteVerBtn);
        tapByElement(accountCompleteVerBtn);
        return new HomeScreen(driver);
    }

    public HomeScreen clickAddReviewHomeMenu() throws IOException {

        tapByElement(plusTab);
        tapByElement(addReviewMenu);
        return new HomeScreen(driver);
    }

    public HomeScreen clickAddProductHomeMenu() throws IOException {

        tapByElement(plusTab);
        tapByElement(addProductMenu);
        return new HomeScreen(driver);
    }

    public HomeScreen clickAddPostHomeMenu() throws IOException {

        tapByElement(plusTab);
        tapByElement(addPostMenu);
        return new HomeScreen(driver);
    }

    public HomeScreen clickHomeMenu() throws IOException {

        tapByElement(homeTab);
        return new HomeScreen(driver);
    }

    public HomeScreen clickFeedMenu() throws IOException {

        tapByElement(feedTab);
        return new HomeScreen(driver);
    }

    public HomeScreen clickDiscoverHomeMenu() throws IOException {

        tapByElement(discoverTab);
        return new HomeScreen(driver);
    }

    public HomeScreen clickProfileHomeMenu() throws IOException {

        tapByElement(profileTab);
        return new HomeScreen(driver);
    }

    //search
    public HomeScreen clickSearch() throws IOException {

        tapByElement(searchIcon);
        return new HomeScreen(driver);
    }

    public HomeScreen clickUsersTab() throws IOException {

        isElementPresent(usersTab);
        tapByElement(usersTab);
        return new HomeScreen(driver);
    }

    public HomeScreen inputSearch(String fullname) throws IOException {

        inputValue(searchIcon, fullname);
        return new HomeScreen(driver);
    }

    public HomeScreen clickFirstElementSearch() throws IOException {

        tapByElement(firstResultUsersTab);
        return new HomeScreen(driver);
    }

    public HomeScreen acceptAlertPermission() throws IOException {

        acceptAlert();
        return new HomeScreen(driver);
    }

}
