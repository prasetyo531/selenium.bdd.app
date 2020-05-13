package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.List;

public class VerifyAccountScreen extends ActionBase {

    /***  email screen  ***/
    @AndroidFindBy(id="com.fdbr.android:id/textinput_placeholder")
    public MobileElement fieldVerifyEmail;

    @AndroidFindBy(id="com.fdbr.android.beautyprofile:id/buttonVerifyEmail")
    public MobileElement verifyNowEmailBtn;

    @AndroidFindBy(id="com.fdbr.android.beautyprofile:id/buttonSkipVerifyEmail")
    public MobileElement skipEmailBtn;

    /***  phone screen  ***/
    @AndroidFindBy(id="com.fdbr.android:id/textinput_placeholder")
    public MobileElement fieldVerifyPhone;

    @AndroidFindBy(id="com.fdbr.android.beautyprofile:id/buttonVerifyPhone")
    public MobileElement verifyNowPhoneBtn;

    @AndroidFindBy(id="com.fdbr.android.beautyprofile:id/buttonSkipVerifyPhone")
    public MobileElement skipPhoneBtn;

    /***  personal info screen  ***/
    @AndroidFindBy(id="com.fdbr.android.beautyprofile:id/imgProfilePicture")
    public MobileElement imgPersonalInfo;

    @AndroidFindBy(id="com.fdbr.android.beautyprofile:id/inputFullName")
    public MobileElement fieldFullnamePersonalInfo;

    @AndroidFindBy(id="com.fdbr.android.beautyprofile:id/rbFemale")
    public MobileElement rbFemalePersonalInfo;

    @AndroidFindBy(id="com.fdbr.android.beautyprofile:id/rbMale")
    public MobileElement rbMalePersonalInfo;

    @AndroidFindBy(id="com.fdbr.android.beautyprofile:id/inputLocation")
    public MobileElement fieldlocationPersonalInfo;

    @AndroidFindBy(id="com.fdbr.android.beautyprofile:id/buttonSavePersonalInfo")
    public MobileElement saveBtnPersonalInfo;

    @AndroidFindBy(id="com.fdbr.android.beautyprofile:id/buttonSkipPersonalInfo")
    public MobileElement skipBtnPersonalInfo;

    @AndroidFindBy(id="com.fdbr.android:id/inputSearch")
    public MobileElement inputLocationPersonalInfo;

    @AndroidFindBy(id="com.fdbr.android:id/buttonBackToolbar")
    public MobileElement backLocationPersonalInfo;

    /***  beauty profile screen  ***/
    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.HorizontalScrollView/android.widget.LinearLayout")
    public MobileElement skinType;

    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.HorizontalScrollView/android.widget.LinearLayout")
    public MobileElement skinTone;

    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.HorizontalScrollView/android.widget.LinearLayout")
    public MobileElement skinUnderTone;

    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.HorizontalScrollView/android.widget.LinearLayout")
    public MobileElement hairType;

    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.HorizontalScrollView/android.widget.LinearLayout")
    public MobileElement coloredHair;

    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.HorizontalScrollView/android.widget.LinearLayout")
    public MobileElement isHijaber;

    @AndroidFindBy(id="com.fdbr.android.beautyprofile:id/buttonSaveBeautyProfile")
    public MobileElement buttonSaveBeautyProfile;

    @AndroidFindBy(id="com.fdbr.android.beautyprofile:id/buttonSkipBeautyProfile")
    public MobileElement skipBtnPersonalInfo;

    /***  beauty concern screen  ***/
    @AndroidFindBy(xpath="com.fdbr.android.beautyprofile:id/flowSkinConcern")
    public MobileElement skinCon;

    @AndroidFindBy(xpath="com.fdbr.android.beautyprofile:id/flowBodyConcern")
    public MobileElement bodyCon;

    @AndroidFindBy(xpath="com.fdbr.android.beautyprofile:id/flowHairConcern")
    public MobileElement hairCon;

    @AndroidFindBy(id="com.fdbr.android.bseautyprofile:id/buttonSaveBeautyConcern")
    public MobileElement btnSaveBeautyConcern;

    @AndroidFindBy(id="com.fdbr.android.beautyprofile:id/buttonSkipBeautyConcern")
    public MobileElement btnSkipBeautyConcern;

    //error msg verify email and phone
    @AndroidFindBy(id="com.fdbr.android:id/textinput_error")
    public MobileElement errorMsgUnderField;

    // This is a constructor, as every page need a base driver to find android elements
    public VerifyAccountScreen(AppiumDriver driver) throws IOException {

        this.driver = driver;
        //Initialize Elements of a Page class without having to use ‘FindElement‘ or ‘FindElements‘
        PageFactory.initElements(new AppiumFieldDecorator(this.driver),this);
    }

    /***  email screen  ***/
    public void inputFieldVerifyEmail(String email){

        inputValue(fieldVerifyEmail, email);
    }

    public void clickVerifyEmailNow(){

        tapByElement(verifyNowEmailBtn);
    }

    public void clickSkipEmail(){

        tapByElement(skipEmailBtn);
    }

    /***  phone screen  ***/
    public void inputFieldVerifyPhone(String email){

        inputValue(fieldVerifyPhone, email);
    }

    public void clickVerifyPhoneNow(){

        tapByElement(verifyNowPhoneBtn);
    }

    public void clickSkipPhone(){

        tapByElement(skipPhoneBtn);
    }

    /***  beauty profile  ***/
    public void clickColoredHair(){

        List<MobileElement> li = coloredHair;
        li.get(1).click();
    }

    /***  beauty concern  ***/
    public void clickSkinCon(){

        List<MobileElement> sc = skinCon;
        sc.get(1).click();
    }

    public void clickSkinCon(){

        List<MobileElement> bc = bodyCon;
        bc.get(1).click();
    }

    public void clickSkinCon(){

        List<MobileElement> hc = hairCon;
        hc.get(1).click();
    }
}
