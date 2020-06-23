package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;
import java.util.List;

public class VerifyAccountScreen extends ActionBase {

    @AndroidFindBy(id="com.fdbr.android.beautyprofile:id/buttonChangeEmail")
    public MobileElement changeAuth;

    @AndroidFindBy(id = "com.fdbr.android:id/textinput_error")
    public MobileElement txtWarningEmailPhone;

    /***  email screen  ***/
    @AndroidFindBy(id="com.fdbr.android.beautyprofile:id/inputEmail")
    public MobileElement fieldVerifyEmail;

    @AndroidFindBy(id="com.fdbr.android.beautyprofile:id/buttonVerifyEmail")
    public MobileElement verifyNowEmailBtn;

    @AndroidFindBy(id="com.fdbr.android.beautyprofile:id/buttonSkipVerifyEmail")
    public MobileElement skipEmailBtn;

    /***  phone screen  ***/
    @AndroidFindBy(id="com.fdbr.android.beautyprofile:id/inputPhone")
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

    @AndroidFindBy(id="com.fdbr.android.beautyprofile:id/textErrorGender")
    public MobileElement errorMsgGender;

    @AndroidFindBy(id="com.fdbr.android:id/textinput_error")
    public MobileElement errorMsgLocation;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android:id/textCityName') and @text='Ambon']")
    public MobileElement ambonCity;

    /***  beauty profile screen  ***/
    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[2]")
    public MobileElement skinTypeCombination;

    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[1]")
    public MobileElement skinToneDark;

    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[1]")
    public MobileElement skinUnderToneWarm;

    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.RadioButton")
    public MobileElement hairTypeCurly;

    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.RadioButton")
    public MobileElement coloredHairNo;

    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.RadioButton")
    public MobileElement isHijaberNo;

    @AndroidFindBy(id="com.fdbr.android.beautyprofile:id/buttonSaveBeautyProfile")
    public MobileElement buttonSaveBeautyProfile;

    @AndroidFindBy(id="com.fdbr.android.beautyprofile:id/buttonSkipBeautyProfile")
    public MobileElement skipBeautyProfile;

    /***  beauty concern screen  ***/
    @AndroidFindBy(id="com.fdbr.android.beautyprofile:id/labelSubBodyConcern")
    public MobileElement midScreenBodyCon;

    @AndroidFindBy(xpath="com.fdbr.android.beautyprofile:id/flowSkinConcern")
    public List<MobileElement> skinCon;

    @AndroidFindBy(xpath="com.fdbr.android.beautyprofile:id/flowBodyConcern")
    public List<MobileElement> bodyCon;

    @AndroidFindBy(xpath="com.fdbr.android.beautyprofile:id/flowHairConcern")
    public List<MobileElement> hairCon;

    @AndroidFindBy(id="com.fdbr.android.bseautyprofile:id/buttonSaveBeautyConcern")
    public MobileElement btnSaveBeautyConcern;

    @AndroidFindBy(id="com.fdbr.android.beautyprofile:id/buttonSkipBeautyConcern")
    public MobileElement btnSkipBeautyConcern;

    //error msg verify email and phone
    @AndroidFindBy(id="com.fdbr.android:id/textinput_error")
    public MobileElement errorMsgUnderField;

    //snackbar msg
    @AndroidFindBy(id="com.fdbr.android:id/snackbar_text")
    public MobileElement snackbarMsg;

    @AndroidFindBy(id="com.fdbr.android:id/appBar")
    public MobileElement sneakMsg;

    // This is a constructor, as every page need a base driver to find android elements
    public VerifyAccountScreen(AppiumDriver driver) throws IOException {

        this.driver = driver;
        //Initialize Elements of a Page class without having to use ‘FindElement‘ or ‘FindElements‘
        PageFactory.initElements(new AppiumFieldDecorator(this.driver),this);
    }

    public void clickChangeAuth(){

        tapByElement(changeAuth);
    }

    /*  error msg underneath field   */
    public void assertTextWarningLogin(String text){

        String txtWarning = txtWarningEmailPhone.getText();
        Assert.assertEquals(txtWarning, text);
    }

    /***  email screen  ***/
    public void inputFieldVerifyEmail(String email) throws InterruptedException {

        isElementPresent(fieldVerifyEmail);
        inputValue(fieldVerifyEmail, email);
    }

    public VerifyAccountScreen clickVerifyEmailNow() throws IOException {

        tapByElement(verifyNowEmailBtn);
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen clickSkipEmail() throws IOException {

        tapByElement(skipEmailBtn);
        return new VerifyAccountScreen(driver);
    }

    /***  phone screen  ***/
    public VerifyAccountScreen inputFieldVerifyPhone(String phone) throws IOException {

        isElementPresent(fieldVerifyPhone);
        inputValue(fieldVerifyPhone, phone);
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen clickVerifyPhoneNow() throws IOException {

        tapByElement(verifyNowPhoneBtn);
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen clickSkipPhone() throws IOException {

        tapByElement(skipPhoneBtn);
        return new VerifyAccountScreen(driver);
    }

    /***  personal info screen  ***/
    public VerifyAccountScreen inputFieldFullname(String fullname) throws IOException {

        inputValue(fieldFullnamePersonalInfo, fullname);
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen chooseGender() throws IOException {

        tapByElement(rbFemalePersonalInfo);
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen chooseLocation() throws IOException {

        tapByElement(fieldlocationPersonalInfo);

        isElementPresent(ambonCity);
        tapByElement(ambonCity);
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen clickSavePersonalInfo() throws IOException {

        tapByElement(saveBtnPersonalInfo);
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen getErrorFullname() throws IOException {

        isElementPresent(errorMsgUnderField);
        String txtErrorFullname = errorMsgUnderField.getText();
        System.out.println(txtErrorFullname);
        Assert.assertEquals(txtErrorFullname, "Please enter your full name");
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen getErrorGender() throws IOException {

        isElementPresent(errorMsgGender);
        String txtErrorGender = errorMsgGender.getText();
        System.out.println(txtErrorGender);
        Assert.assertEquals(txtErrorGender, "Please enter your gender");
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen getErrorLocation() throws IOException {

        isElementPresent(errorMsgLocation);
        String txtErrorLoc = errorMsgLocation.getText();
        System.out.println(txtErrorLoc);
        Assert.assertEquals(txtErrorLoc, "Please enter your location");
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen skipPersonalInfo() throws IOException {

        tapByElement(skipBtnPersonalInfo);
        return new VerifyAccountScreen(driver);
    }

    /***  beauty profile  ***/
    public VerifyAccountScreen clickSaveBeautyProf() throws IOException {

        this.verticalSwipeByPercentages(skinTypeCombination,0.4,0.01,0.5,500);
        this.verticalSwipeByPercentages(skinTypeCombination, 0.4,0.01,0.5,500);
        this.verticalSwipeByPercentages(skinTypeCombination, 0.4,0.01,0.5,500);
        this.verticalSwipeByPercentages(skinTypeCombination, 0.4,0.01,0.5,500);
        tapByElement(buttonSaveBeautyProfile);
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen chooseSkinType() throws IOException {

        tapByElement(skinTypeCombination);
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen chooseSkinTone() throws IOException {

        tapByElement(skinToneDark);
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen chooseSkinUndertone() throws IOException {

        tapByElement(skinUnderToneWarm);
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen chooseHairType() throws IOException {

        tapByElement(hairTypeCurly);
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen chooseColoredHair() throws IOException {

        tapByElement(coloredHairNo);
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen chooseHijaber() throws IOException {

        tapByElement(isHijaberNo);
        return new VerifyAccountScreen(driver);
    }

    /***  beauty concern  ***/
    public VerifyAccountScreen clickSaveBeautyCon() throws IOException {

        this.verticalSwipeByPercentages(midScreenBodyCon,0.4,0.01,0.5,500);
        this.verticalSwipeByPercentages(midScreenBodyCon, 0.4,0.01,0.5,500);
        tapByElement(btnSaveBeautyConcern);
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen chooseSkinCon() throws IOException {

        List<MobileElement> sc = skinCon;
        sc.get(1).click();
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen chooseBodyCon(){

        List<MobileElement> bc = bodyCon;
        bc.get(1).click();
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen chooseHairCon(){

        List<MobileElement> hc = hairCon;
        hc.get(1).click();
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen verifySneakMsg(){

       isElementPresent(sneakMsg);
       String sm = sneakMsg.getText();
       System.out.println(sm);
    }
}
