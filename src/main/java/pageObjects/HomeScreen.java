package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomeScreen extends ActionBase {

    //@AndroidFindBy(xpath="//class[contains(@resource-id, '') and @text='FD Flash Sale']")

    /***********
     account status
     ***********/
    @AndroidFindBy(id="com.fdbr.android:id/buttonAction")
    public List<MobileElement> accountCompleteVerBtnCheck;

    @AndroidFindBy(id="com.fdbr.android:id/buttonAction")
    @iOSXCUITFindBy(id="COMPLETE VERIFY")
    public MobileElement accountCompleteVerBtn;

    @FindBy(id="com.fdbr.android:id/buttonAction")
    public List<WebElement> accountCompleteVerBtnOnModal;

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

    @AndroidFindBy(id="com.fdbr.android:id/toolbarSearch")
    public MobileElement toolbarSearch;

    @AndroidFindBy(id="com.fdbr.android.main:id/imageXb")
    public MobileElement floatingImg;

    @AndroidFindBy(id="com.fdbr.android.main:id/fabClose")
    public MobileElement closeFloatingImg;

    @AndroidFindBy(xpath="//android.view.ViewGroup[contains(@resource-id, 'com.fdbr.android:id/itemMenuParent') and @index='1']")
    public MobileElement editorialMenu;

    @AndroidFindBy(xpath="//android.view.ViewGroup[contains(@resource-id, 'com.fdbr.android:id/itemMenuParent') and @index='2']")
    public MobileElement bsMenu;

    @AndroidFindBy(xpath="//android.view.ViewGroup[contains(@resource-id, 'com.fdbr.android:id/itemMenuParent') and @index='3']")
    public MobileElement tnrMenu;

    @AndroidFindBy(xpath="//android.view.ViewGroup[contains(@resource-id, 'com.fdbr.android:id/itemMenuParent') and @index='4']")
    public MobileElement talkMenu;

    @AndroidFindBy(xpath="//android.view.ViewGroup[contains(@resource-id, 'com.fdbr.android:id/itemMenuParent') and @index='5']")
    public MobileElement fdawardsMenu;

    @AndroidFindBy(id="com.fdbr.android.main:id/buttonCategory")
    public MobileElement productCategoryMenu;

    @AndroidFindBy(xpath="//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[5]")
    public MobileElement brandMenu;

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

    @AndroidFindBy(xpath="//android.widget.ImageView[contains(@resource-id, 'com.fdbr.android.main:id/imagePhoto')]")
    public List<MobileElement> firstResultUsersTab;

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

    /**********
     talk section
     ***********/
    @AndroidFindBy(xpath="//android.widget.Button[contains(@resource-id, 'com.fdbr.android.main:id/buttonJoin') and @index='3']")
    public List<MobileElement> btnJoinGroup;

    @AndroidFindBy(xpath="//android.widget.Button[contains(@resource-id, 'com.fdbr.android.main:id/buttonMember') and @index='3']")
    public List<MobileElement> btnMemberGroup;

    /**********
     rating app modal
     ***********/
    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android:id/textDesc') and @index='2']")
    public MobileElement modalRateApp;

    @AndroidFindBy(id="com.fdbr.android:id/buttonRateNow")
    public MobileElement btnRateNow;

    @FindBy(id="com.fdbr.android:id/buttonRateNow")
    public List<WebElement> btnRateNowWebelement;

    @AndroidFindBy(id="com.fdbr.android:id/buttonRemindMeLater")
    public MobileElement btnRemindMeLater;

    // This is a constructor, as every page need a base driver to find android elements
    public HomeScreen(AppiumDriver driver) {

        this.driver = driver;
        //Initialize Elements of a Page class without having to use ‘FindElement‘ or ‘FindElements‘
        PageFactory.initElements(new AppiumFieldDecorator(this.driver),this);
    }

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

    public void remindMeLaterRatingModal() {
        WaitUntilElementIsVisible(modalRateApp);
        List<WebElement> checkAppRatingModal = btnRateNowWebelement;
        try {
            if (checkAppRatingModal.size()>0) {
                tapByElement(btnRemindMeLater);
                System.out.println("rate app modal is present");
                verifyHomescreen();
            } else {
                System.out.println("rate app modal is not present");
                verifyHomescreen();
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void verifyAccountStatusModal() {
        //WaitUntilElementIsVisible(accountCompleteVerBtn);
        //http://appium.io/docs/en/commands/element/find-elements/#find-elements
        List<WebElement> checkAccountStatusModal = accountCompleteVerBtnOnModal;
        //List<MobileElement> checkAccountStatusModal = (List<MobileElement>) driver.findElementsById("com.fdbr.android:id/buttonAction");
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
    }

    public void verifyAccountStatusModalAndAppRatingModal() {
        WaitUntilElementIsVisible(accountCompleteVerBtn);
        //http://appium.io/docs/en/commands/element/find-elements/#find-elements
        List<WebElement> checkAccountStatusModal = accountCompleteVerBtnOnModal;
        //List<MobileElement> checkAccountStatusModal = (List<MobileElement>) driver.findElementsById("com.fdbr.android:id/buttonAction");
        //boolean checkAccountStatusModal = isElementPresent(accountCompleteVerBtn);
        try {
            if (checkAccountStatusModal.size()>0) {
                tapByElement(closeAccountStatusModal);
                System.out.println("account status modal is present");
                remindMeLaterRatingModal();
                verifyHomescreen();
            } else {
                remindMeLaterRatingModal();
                System.out.println("account status modal is not present");
                verifyHomescreen();
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public HomeScreen verifyAccountStatusModalIos() {

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

    public Boolean checkProgressBarVerifyEmailPhone() {
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

    public HomeScreen findAndCloseFloatingImg() {
        isElementPresent(floatingImg);
        tapByElement(closeFloatingImg);
        return new HomeScreen(driver);
    }

    public HomeScreen completeMyBeautyIdProductMatches() {
        isElementPresent(btnCompleteBeautyID);
        tapByElement(btnCompleteBeautyID);
        System.out.println("complete my beautyId is present");
        return new HomeScreen(driver);
    }

    //menu bar
    public HomeScreen clickProductCategory() {
        isElementPresent(productCategoryMenu);
        tapByElement(productCategoryMenu);
        return new HomeScreen(driver);
    }

    public HomeScreen clickTnrMenu() {
        isElementPresent(tnrMenu);
        tapByElement(tnrMenu);
        return new HomeScreen(driver);
    }

    public HomeScreen clickTalkMenu() {
        isElementPresent(talkMenu);
        tapByElement(talkMenu);
        return new HomeScreen(driver);
    }

    public HomeScreen verifyProductMatches() {
        isElementPresent(firstindextproductmatches);
        System.out.println("product matches is present");
        return new HomeScreen(driver);
    }

    public HomeScreen clickAccountCompleteVerBtn() {
        isElementPresent(accountCompleteVerBtn);
        tapByElement(accountCompleteVerBtn);
        return new HomeScreen(driver);
    }

    public HomeScreen clickAddReviewHomeMenu() {
        tapByElement(plusTab);
        tapByElement(addReviewMenu);
        return new HomeScreen(driver);
    }

    public HomeScreen clickAddProductHomeMenu() {
        tapByElement(plusTab);
        tapByElement(addProductMenu);
        return new HomeScreen(driver);
    }

    public HomeScreen clickAddPostHomeMenu() {
        tapByElement(plusTab);
        tapByElement(addPostMenu);
        return new HomeScreen(driver);
    }

    public HomeScreen clickHomeMenu() {
        tapByElement(homeTab);
        return new HomeScreen(driver);
    }

    public HomeScreen clickFeedMenu() {
        tapByElement(feedTab);
        return new HomeScreen(driver);
    }

    public HomeScreen clickDiscoverHomeMenu() {
        tapByElement(discoverTab);
        return new HomeScreen(driver);
    }

    public HomeScreen clickProfileHomeMenu() {
        tapByElement(profileTab);
        return new HomeScreen(driver);
    }

    public HomeScreen scrollClickMenuAppToAllBrands() {
        horizontalSwipeByPercentagesDirectly(991,798, 460, 803);
        isElementEnabled(brandMenu);
        tapByElement(brandMenu);
        return new HomeScreen(driver);
    }

    //search
    public HomeScreen clickSearch() {
        WaitUntilElementIsVisible(searchIcon);
        tapByElement(searchIcon);
        return new HomeScreen(driver);
    }

    public HomeScreen clickUsersTab() {
        isElementPresent(usersTab);
        tapByElement(usersTab);
        return new HomeScreen(driver);
    }

    public HomeScreen inputSearch(String fullname) {
        inputValue(toolbarSearch, fullname);
        return new HomeScreen(driver);
    }

    public HomeScreen clickFirstElementSearch() {
        clickFirstMenus(firstResultUsersTab);
        return new HomeScreen(driver);
    }

    public HomeScreen acceptAlertPermission() {
        acceptAlert();
        return new HomeScreen(driver);
    }

    /*talk*/
    public HomeScreen scrollToTalkSection() {
        verticalSwipeByPercentagesDirectly(90,1736,90, 316);
        verticalSwipeByPercentagesDirectly(85,1729,85, 259);
        verticalSwipeByPercentagesDirectly(99,1703,97, 882);
        Integer btnJoin = btnJoinGroup.size();
        if(btnJoin==0) {
            verticalSwipeByPercentagesDirectly(83,683,74, 1749);
        }
        return new HomeScreen(driver);
    }

    public HomeScreen joinGroupTalk() {
        clickLastMenus(btnJoinGroup);
        return new HomeScreen(driver);
    }

    public HomeScreen checkBtnAfterJoinGroup() throws InterruptedException {
        Thread.sleep(1500);
        Integer btnMember = btnMemberGroup.size();
        if(btnMember==0){
            Assert.fail("button changed to member is not appear");
        }else {
            System.out.println("button changed to member is appear");
        }
        return new HomeScreen(driver);
    }

}
