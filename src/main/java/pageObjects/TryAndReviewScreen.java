package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

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
    @AndroidFindBy(id="com.fdbr.android.tryreview:id/textTitle")
    public MobileElement titleParticipantSum;

    @AndroidFindBy(id="com.fdbr.android.tryreview:id/imageEditPersonal")
    public MobileElement editPersonalInfoTnrIcon;

    @AndroidFindBy(id="com.fdbr.android.tryreview:id/buttonAddBeautyProfile")
    public MobileElement addBeautyProfTnrIcon;

    @AndroidFindBy(id="com.fdbr.android.tryreview:id/imageEditBeautyProfile")
    public MobileElement editBeautyProfTnrIcon;

    @AndroidFindBy(id="com.fdbr.android.tryreview:id/buttonAddConcern")
    public MobileElement addBeautyConTnrIcon;

    @AndroidFindBy(id="com.fdbr.android.tryreview:id/imageEditBeautyConcern")
    public MobileElement editBeautyConTnrIcon;

    @AndroidFindBy(id="com.fdbr.android.tryreview:id/buttonAddAddress")
    public MobileElement addAddNewAddressSumTnrIcon;

    @AndroidFindBy(id="com.fdbr.android.tryreview:id/imageEditAddress")
    public MobileElement editAddNewAddressSumTnrIcon;

    @AndroidFindBy(id="com.fdbr.android.tryreview:id/buttonSubmit")
    public MobileElement submitJoinBtn;

    @AndroidFindBy(id="com.fdbr.android.tryreview:id/imageExpandArrow1")
    public MobileElement expandArrow1;

    @AndroidFindBy(id="com.fdbr.android.tryreview:id/imageExpandArrow2")
    public MobileElement expandArrow2;

    @AndroidFindBy(id="com.fdbr.android.tryreview:id/imageExpandArrow3")
    public MobileElement expandArrow3;

    /***
     Personal Info
     ***/
    @AndroidFindBy(id="com.fdbr.android.beauty:id/inputFullname")
    public MobileElement fullNameField;

    @AndroidFindBy(id="com.fdbr.android.beauty:id/layoutDob")
    public MobileElement dobOpt;

    @AndroidFindBy(id="com.fdbr.android:id/btn_ok")
    public MobileElement dobOK;

    @AndroidFindBy(id="com.fdbr.android:id/tvItemSpinner")
    public MobileElement genderOpt;

    @AndroidFindBy(xpath="//android.widget.CheckedTextView[contains(@resource-id, 'android:id/text1') and @text='Female']")
    public MobileElement femalePersonalInfo;

    @AndroidFindBy(xpath="//android.widget.CheckedTextView[contains(@resource-id, 'android:id/text1') and @text='Male']")
    public MobileElement malePersonalInfo;

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

    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[3]")
    public MobileElement skinToneDark;

    @AndroidFindBy(id="com.fdbr.android.beauty:id/textErrorSkinTone")
    public MobileElement errorMsgSkinTone;

    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.RadioButton")
    public MobileElement skinUnderToneWarm;

    @AndroidFindBy(id="com.fdbr.android.beauty:id/textErrorSkinUnderTone")
    public MobileElement errorMsgSkinUndertone;

    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.RadioButton")
    public MobileElement hairTypeCurly;

    @AndroidFindBy(id="com.fdbr.android.beauty:id/textErrorHairType")
    public MobileElement errorMsgHairType;

    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.RadioButton")
    public MobileElement coloredHairNo;

    @AndroidFindBy(id="com.fdbr.android.beauty:id/textErrorColoredHair")
    public MobileElement errorMsgColoredHair;

    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[4]/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.RadioButton")
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
    public MobileElement mainAddressBtn;

    @AndroidFindBy(id="com.fdbr.android.tryreview:id/tagMainAddress")
    public MobileElement flagMainAddressParticipantSummary;

    @AndroidFindBy(id="com.fdbr.android.beauty:id/buttonSave")
    public MobileElement saveAddressBtn;


    public TryAndReviewScreen(AppiumDriver driver) throws IOException {

        this.driver = driver;
        //Initialize Elements of a Page class without having to use ‘FindElement‘ or ‘FindElements‘
        PageFactory.initElements(new AppiumFieldDecorator(this.driver),this);
    }

    public TryAndReviewScreen clickMoreAndJoinHiglightedCamp() throws IOException {

        isElementPresent(moreHighlightCampBtn);
        tapByElement(moreHighlightCampBtn);

        isElementPresent(joinNowBtn);
        tapByElement(joinNowBtn);
        return new TryAndReviewScreen(driver);
    }

    public TryAndReviewScreen clickToCollapse() throws IOException, InterruptedException {

        isElementEnabled(expandArrow1);
        tapByElement(expandArrow1);
        tapByElement(expandArrow2);
        tapByElement(expandArrow3);

        Thread.sleep(500);
        return new TryAndReviewScreen(driver);
    }

    //participant summary
    public TryAndReviewScreen checkIsOnScreenParticapantSummary() throws IOException, InterruptedException {

        Thread.sleep(2000);
        isElementPresent(titleParticipantSum);
        return new TryAndReviewScreen(driver);
    }

    public TryAndReviewScreen clickEditPersonalInfo() throws IOException {

        isElementPresent(editPersonalInfoTnrIcon);
        isElementEnabled(editPersonalInfoTnrIcon);

        tapByElement(editPersonalInfoTnrIcon);
        return new TryAndReviewScreen(driver);
    }

    public TryAndReviewScreen clickAddNewBeautyProfile() throws IOException {

        isElementPresent(addBeautyProfTnrIcon);
        tapByElement(addBeautyProfTnrIcon);
        return new TryAndReviewScreen(driver);
    }

    public TryAndReviewScreen clickAddNewBeautyConcern() throws IOException {

        isElementPresent(addBeautyConTnrIcon);
        tapByElement(addBeautyConTnrIcon);
        return new TryAndReviewScreen(driver);
    }

    public TryAndReviewScreen clickAddNewAddressParticipantSum() throws IOException, InterruptedException {

        isElementEnabled(addAddNewAddressSumTnrIcon);
        tapByElement(addAddNewAddressSumTnrIcon);
        return new TryAndReviewScreen(driver);
    }


    //personal info
    public TryAndReviewScreen inputPersonalInfoForm(String fullname) throws IOException {

        isElementPresent(fullNameField);
        inputValueEnter(fullNameField, fullname);

        tapByElement(dobOpt);
        isElementPresent(dobOK);
        tapByElement(dobOK);

        tapByElement(genderOpt);
        tapByElement(femalePersonalInfo);

        tapByElement(savePersonalInfoBtn);

        return new TryAndReviewScreen(driver);
    }

    public TryAndReviewScreen inputFullname(String fullname) throws IOException {

        isElementPresent(fullNameField);
        inputValueEnter(fullNameField, fullname);

        return new TryAndReviewScreen(driver);
    }

    public TryAndReviewScreen chooseDob() throws IOException {

        isElementEnabled(dobOpt);
        tapByElement(dobOpt);

        isElementEnabled(dobOK);
        tapByElement(dobOK);

        return new TryAndReviewScreen(driver);
    }

    public TryAndReviewScreen chooseGender() throws IOException {

        isElementEnabled(genderOpt);
        tapByElement(genderOpt);

        isElementEnabled(femalePersonalInfo);
        tapByElement(femalePersonalInfo);

        return new TryAndReviewScreen(driver);
    }

    public TryAndReviewScreen savePersonalInfoEmpty() throws IOException {

        isElementPresent(fullNameField);
        tapByElement(savePersonalInfoBtn);

        return new TryAndReviewScreen(driver);
    }

    //beauty profile
    public TryAndReviewScreen clickSaveBeautyProfile() throws IOException {

        isElementPresent(contentBeautyProf);
        verticalSwipeByPercentages(contentBeautyProf, 0.4,0.01,0.5,500);
        verticalSwipeByPercentages(contentBeautyProf, 0.4,0.01,0.5,500);
        tapByElement(buttonSaveBeautyProfile);
//        isElementPresent(toastMsg);
        return new TryAndReviewScreen(driver);
    }

    public TryAndReviewScreen getErrorSkinType() throws IOException {

        isElementPresent(errorMsgSkinType);
        String txtErrorSkinType = errorMsgSkinType.getText();
        System.out.println(txtErrorSkinType);
        Assert.assertEquals(txtErrorSkinType, "Please choose your skin type");
        return new TryAndReviewScreen(driver);
    }

    public TryAndReviewScreen getErrorSkinTone() throws IOException {

        isElementPresent(errorMsgSkinTone);
        String txtErrorSkinTone = errorMsgSkinTone.getText();
        System.out.println(txtErrorSkinTone);
        Assert.assertEquals(txtErrorSkinTone, "Please choose your skin tone");
        return new TryAndReviewScreen(driver);
    }

    public TryAndReviewScreen getErrorSkinUndertone() throws IOException {

        isElementPresent(errorMsgSkinUndertone);
        String txtErrorSkinUndertone = errorMsgSkinUndertone.getText();
        System.out.println(txtErrorSkinUndertone);
        Assert.assertEquals(txtErrorSkinUndertone, "Please choose your skin undertone");
        return new TryAndReviewScreen(driver);
    }

    public TryAndReviewScreen getErrorHairType() throws IOException {

        isElementPresent(errorMsgHairType);
        String txtErrorHairType = errorMsgHairType.getText();
        System.out.println(txtErrorHairType);
        Assert.assertEquals(txtErrorHairType, "Please choose your hair type");
        return new TryAndReviewScreen(driver);
    }

    public TryAndReviewScreen getErrorColoredHair() throws IOException {

        isElementPresent(errorMsgColoredHair);
        String txtErrorColoredHair = errorMsgColoredHair.getText();
        System.out.println(txtErrorColoredHair);
        Assert.assertEquals(txtErrorColoredHair, "Please choose one");
        return new TryAndReviewScreen(driver);
    }

    public TryAndReviewScreen getErrorHijaber() throws IOException {

        isElementPresent(errorMsgHijaber);
        String txtErrorHijaber = errorMsgHijaber.getText();
        System.out.println(txtErrorHijaber);
        Assert.assertEquals(txtErrorHijaber, "Please choose one");
        return new TryAndReviewScreen(driver);
    }

    public TryAndReviewScreen chooseSkinType() throws IOException {

        tapByElement(skinTypeNormal);
        return new TryAndReviewScreen(driver);
    }

    public TryAndReviewScreen chooseSkinTone() throws IOException {

        tapByElement(skinToneDark);
        return new TryAndReviewScreen(driver);
    }

    public TryAndReviewScreen chooseSkinUndertone() throws IOException {

        tapByElement(skinUnderToneWarm);
        return new TryAndReviewScreen(driver);
    }

    public TryAndReviewScreen chooseHairType() throws IOException {

        tapByElement(hairTypeCurly);
        return new TryAndReviewScreen(driver);
    }

    public TryAndReviewScreen chooseColoredHair() throws IOException {

        tapByElement(coloredHairNo);
        return new TryAndReviewScreen(driver);
    }

    public TryAndReviewScreen chooseHijaber() throws IOException {

        tapByElement(isHijaberNo);
        return new TryAndReviewScreen(driver);
    }

    //beauty concern
    public TryAndReviewScreen clickSaveBeautyConcern() throws IOException {

        isElementPresent(contentScreenBodyCon);
        verticalSwipeByPercentages(contentScreenBodyCon,0.4,0.01,0.5,500);
        verticalSwipeByPercentages(contentScreenBodyCon, 0.4,0.01,0.5,500);
        tapByElement(btnSaveBeautyConcern);
//        isElementPresent(toastMsg);
        return new TryAndReviewScreen(driver);
    }

    public TryAndReviewScreen chooseSkinCon() throws IOException {

        isElementPresent(blackOrWhite);
        tapByElement(blackOrWhite);
        return new TryAndReviewScreen(driver);
    }

    public TryAndReviewScreen getErrorSkinCon() throws IOException {

        isElementPresent(errorSkinCon);
        String txtErrorSkinCon = errorSkinCon.getText();
        System.out.println(txtErrorSkinCon);
        Assert.assertEquals(txtErrorSkinCon, "Please enter your skin concern");
        return new TryAndReviewScreen(driver);
    }

    public TryAndReviewScreen chooseBodyCon() throws IOException {

        isElementPresent(looseSkin);
        tapByElement(looseSkin);
        return new TryAndReviewScreen(driver);
    }

    public TryAndReviewScreen getErrorBodyCon() throws IOException {

        isElementPresent(errorBodyCon);
        String txtErrorBodyCon = errorBodyCon.getText();
        System.out.println(txtErrorBodyCon);
        Assert.assertEquals(txtErrorBodyCon, "Please enter your body concern");
        return new TryAndReviewScreen(driver);
    }

    public TryAndReviewScreen chooseHairCon() throws IOException {

        isElementPresent(greyHair);
        tapByElement(greyHair);
        return new TryAndReviewScreen(driver);
    }

    public TryAndReviewScreen getErrorHairCon() throws IOException {

        isElementPresent(errorHairCon);
        String txtErrorHairCon = errorHairCon.getText();
        System.out.println(txtErrorHairCon);
        Assert.assertEquals(txtErrorHairCon, "Please enter your hair concern");
        return new TryAndReviewScreen(driver);
    }

    //address form
    public TryAndReviewScreen setAsMainAddress() throws IOException {

        isElementPresent(mainAddressBtn);
        tapByElement(mainAddressBtn);
        return new TryAndReviewScreen(driver);
    }

    public TryAndReviewScreen completeAddressBali(String firstname, String lastname) throws IOException {

        isElementPresent(firstnameField);
        isElementPresent(provinceOpt);
        inputValueEnter(firstnameField, firstname);
        inputValueEnter(lastnameField, lastname);

        inputValueEnter(phonenumberField, "0812812");

        tapByElement(provinceOpt);
        isElementPresent(listBaliProvince);
        tapByElement(listBaliProvince);

        isElementPresent(listBaliCity);
        tapByElement(listBaliCity);

        isElementPresent(listBaliDistrict);
        tapByElement(listBaliDistrict);

        inputValueEnter(zipField,"100451");
        inputValueEnter(completeAddressField, firstname+ " " +lastname);

        setAsMainAddress();

        tapByElement(saveAddressBtn);

        return new TryAndReviewScreen(driver);
    }

    public TryAndReviewScreen checkFlagMainAddress() throws IOException, InterruptedException {

        Thread.sleep(2000);
        isElementPresent(flagMainAddressParticipantSummary);
        return new TryAndReviewScreen(driver);
    }

    public TryAndReviewScreen clickSaveJoinCampaign() throws IOException {

        isElementPresent(submitJoinBtn);
        tapByElement(submitJoinBtn);
        return new TryAndReviewScreen(driver);
    }

    //toast
    public TryAndReviewScreen checkToastSuccess() throws IOException {

        isElementPresent(toastMsg);
        return new TryAndReviewScreen(driver);
    }

    public TryAndReviewScreen checkToastEmptyField(String msg) throws IOException {

        isElementPresent(toastMsg);
        String txt = toastMsg.getText();
        org.junit.Assert.assertEquals(msg, txt);
        return new TryAndReviewScreen(driver);
    }
}
