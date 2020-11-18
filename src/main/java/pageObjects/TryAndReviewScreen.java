package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class TryAndReviewScreen extends ActionBase {

    @AndroidFindBy(xpath="//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
    public MobileElement backIcon;

    @AndroidFindBy(id="com.fdbr.android.tryreview:id/textHighlightMore")
    public MobileElement moreHighlightCampBtn;

    @AndroidFindBy(id="com.fdbr.android.tryreview:id/buttonJoinNow")
    public MobileElement joinNowBtn;

    @AndroidFindBy(xpath="//android.widget.LinearLayout[@content-desc=\"FINISHED\"]")
    public MobileElement finishedTab;

    @AndroidFindBy(xpath="//android.widget.LinearLayout[@content-desc=\"ONGOING\"]")
    public MobileElement ongoingTab;

    @AndroidFindBy(id="com.fdbr.android:id/tv_message")
    public MobileElement toastMsg;

    /***
     Participant Summary
     ***/
    @AndroidFindBy(id="com.fdbr.android.tryreview:id/imageEditPersonal")
    public MobileElement editPersonalInfoTnrIcon;

    @AndroidFindBy(id="com.fdbr.android.tryreview:id/buttonAddBeautyProfile")
    public MobileElement addBeautyProfTnrIcon;

    @AndroidFindBy(id="com.fdbr.android.tryreview:id/buttonAddConcern")
    public MobileElement addBeautyConTnrIcon;

    @AndroidFindBy(id="com.fdbr.android.tryreview:id/buttonAddAddress")
    public MobileElement addAddNewAddressSumTnrIcon;

    @AndroidFindBy(id="com.fdbr.android.tryreview:id/buttonSubmit")
    public MobileElement submitJoinBtn;

    /***
     Personal Info
     ***/
    @AndroidFindBy(id="com.fdbr.android.beauty:id/inputFullname")
    public MobileElement fullNameField;

    @AndroidFindBy(id="com.fdbr.android:id/tvItemSpinner")
    public MobileElement genderOpt;

    @AndroidFindBy(id="com.fdbr.android.beauty:id/buttonSave")
    public MobileElement savePersonalInfoBtn;

    /***
     Beauty Profile
     ***/
    @AndroidFindBy(id="com.fdbr.android.beauty:id/scrollBeautyProfile")
    public MobileElement contentBeautyProf;

    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[2]")
    public MobileElement skinTypeNormal;

    @AndroidFindBy(id="com.fdbr.android.beauty:id/textErrorSkinType")
    public MobileElement errorMsgSkinType;

    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[1]")
    public MobileElement skinToneDark;

    @AndroidFindBy(id="com.fdbr.android.beauty:id/textErrorSkinTone")
    public MobileElement errorMsgSkinTone;

    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.RadioButton")
    public MobileElement skinUnderToneWarm;

    @AndroidFindBy(id="com.fdbr.android.beauty:id/textErrorSkinUnderTone")
    public MobileElement errorMsgSkinUndertone;

    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.RadioButton")
    public MobileElement hairTypeCurly;

    @AndroidFindBy(id="com.fdbr.android.beauty:id/textErrorHairType")
    public MobileElement errorMsgHairType;

    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.RadioButton")
    public MobileElement coloredHairNo;

    @AndroidFindBy(id="com.fdbr.android.beauty:id/textErrorColoredHair")
    public MobileElement errorMsgColoredHair;

    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.RadioButton")
    public MobileElement isHijaberNo;

    @AndroidFindBy(id="com.fdbr.android.beauty:id/textErrorHijab")
    public MobileElement errorMsgHijaber;

    @AndroidFindBy(id="com.fdbr.android.beauty:id/buttonSaveBeautyProfile")
    public MobileElement buttonSaveBeautyProfile;

    /***
     Beauty Concern
     ***/
    @AndroidFindBy(id="com.fdbr.android.beauty:id/scrollBeautyConcern")
    public MobileElement contentScreenBodyCon;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android.beauty:id/textView') and @text='Black or White Heads']")
    public MobileElement blackOrWhite;

    @AndroidFindBy(id="com.fdbr.android.beauty:id/textErrorSkinConcern")
    public MobileElement errorSkinCon;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android.beauty:id/textView') and @text='Loose Skin']")
    public MobileElement looseSkin;

    @AndroidFindBy(id="com.fdbr.android.beauty:id/textErrorBodyConcern")
    public MobileElement errorBodyCon;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android.beauty:id/textView') and @text='Grey Hair']")
    public MobileElement greyHair;

    @AndroidFindBy(id="com.fdbr.android.beauty:id/textErrorHairConcern")
    public MobileElement errorHairCon;

    @AndroidFindBy(id="com.fdbr.android.beauty:id/buttonSaveBeautyConcern")
    public MobileElement btnSaveBeautyConcern;

    /***
     Add New Address
     ***/
    @AndroidFindBy(id="com.fdbr.android.beauty:id/inputFirstname")
    public MobileElement firstnameField;

    @AndroidFindBy(id="com.fdbr.android.beauty:id/inputLastname")
    public MobileElement lastnameField;

    @AndroidFindBy(id="com.fdbr.android.beauty:id/inputPhone")
    public MobileElement phonenumberField;

    @AndroidFindBy(id="com.fdbr.android.beauty:id/inputProvince")
    public MobileElement provinceOpt;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android.beauty:id/textProvince') and @text='BALI']")
    public MobileElement listBaliProvince;

    @AndroidFindBy(id="com.fdbr.android.beauty:id/inputCity")
    public MobileElement cityOpt;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android.beauty:id/textProvince') and @text='KAB. BADUNG']")
    public MobileElement listBaliCity;

    @AndroidFindBy(id="com.fdbr.android.beauty:id/inputDistrict")
    public MobileElement districtOpt;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android.beauty:id/textProvince') and @text='ABIANSEMAL']")
    public MobileElement listBaliDistrict;

    @AndroidFindBy(id="com.fdbr.android.beauty:id/inputZip")
    public MobileElement zipField;

    @AndroidFindBy(id="com.fdbr.android.beauty:id/inputCompleteAddress")
    public MobileElement completeAddressField;

    @AndroidFindBy(id="com.fdbr.android.beauty:id/checkBoxMainAddress")
    public MobileElement checkMainAddBtn;

    @AndroidFindBy(id="com.fdbr.android.beauty:id/buttonSave")
    public MobileElement saveAddressBtn;


    public TryAndReviewScreen(AppiumDriver driver) throws IOException {

        this.driver = driver;
        //Initialize Elements of a Page class without having to use ‘FindElement‘ or ‘FindElements‘
        PageFactory.initElements(new AppiumFieldDecorator(this.driver),this);
    }

    public TryAndReviewScreen clickMoreAndJoinHiglightedCamp(){

        isElementPresent(moreHighlightCampBtn);
        tapByElement(moreHighlightCampBtn);

        isElementPresent(joinNowBtn);
        tapByElement(joinNowBtn);
        return new TryAndReviewScreen(driver);
    }
}
