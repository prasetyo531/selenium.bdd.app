package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class HomeScreen extends ActionBase {

    //@AndroidFindBy(xpath="//class[contains(@resource-id, '') and @text='FD Flash Sale']")

    /**********
     tab bar
     **********/
    @AndroidFindBy(accessibility="Home")
    public MobileElement homeTab;

    @AndroidFindBy(accessibility="Feed")
    public MobileElement feedTab;

    @AndroidFindBy(accessibility="Discover")
    public MobileElement discoverTab;

    @AndroidFindBy(accessibility="com.fdbr.android:id/")
    public MobileElement plusTab;

    @AndroidFindBy(accessibility="com.fdbr.android:id/")
    public MobileElement profileTab;

    /*  account status  */
    @AndroidFindBy(id="com.fdbr.android:id/btnAction")
    @iOSFindBy(id="COMPLETE VERIFY")
    public MobileElement accountCompleteVerBtn;

    @AndroidFindBy(id="com.fdbr.android:id/btnClose")
    @iOSFindBy(id="icon close")
    public MobileElement closeAccountStatusModal;

    /*
    home screen
     */
    @AndroidFindBy(id="com.fdbr.android:id/labelHello")
    @iOSFindBy(id="Hello Beautiful")
    public MobileElement greetingText;

    @AndroidFindBy(id="com.fdbr.android:id/layoutAds")
    @iOSFindBy(id="COMPLETE VERIFY")
    public MobileElement adsBanner;

    @AndroidFindBy(id="com.fdbr.android:id/buttonMenuToolbar")
    @iOSFindBy(id="ic notification")
    public MobileElement notifBtn;

    @AndroidFindBy(id="com.fdbr.android:id/inputSearch")
    @iOSFindBy(id="Find product, article, brand or user here")
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

    public void verifyAccountStatusModal() {

        boolean checkAccountStatusModal = isElementPresent(accountCompleteVerBtn);
        if (checkAccountStatusModal == true) {
            tapByElement(closeAccountStatusModal);
            System.out.println("account status modal is present");
            verifyHomescreen();
        } else {
            System.out.println("account status modal is not present");
            verifyHomescreen();
        }
    }

    public void verifyAccountStatusModalIos() {

        boolean checkAccountStatusModal = isElementPresent(accountCompleteVerBtn);
        if (checkAccountStatusModal == true) {
            tapByElement(closeAccountStatusModal);
            System.out.println("account status modal is present");
            verifyHomescreen();
        } else {
            System.out.println("account status modal is not present");
            verifyHomescreen();
        }
    }

    public boolean verifyHomescreen() {

        boolean boolElem1= isElementPresent(greetingText);
        boolean boolElem2= isElementPresent(notifBtn);
        boolean boolElem3= isElementPresent(searchBar);
        //boolean boolElem5= isElementPresent(firstindextproductmatches);

        return (boolElem1 && boolElem2 && boolElem3);
    }

    public void verifyProductMatches() {

        isElementPresent(firstindextproductmatches);
        System.out.println("product matches is present");
    }

    public void clickAccountCompleteVerBtn(){

        tapByElement(accountCompleteVerBtn);
    }



}
