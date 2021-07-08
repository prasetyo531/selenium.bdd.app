package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;
import java.util.List;

public class VerifyAccountScreen extends ActionBase {

    @AndroidFindBy(id = "com.fdbr.android:id/buttonGetIt")
    public MobileElement btnGetItNow;

    @AndroidFindBy(id = "com.fdbr.android.beauty:id/close")
    public MobileElement closeStep;

    @AndroidFindBy(id="com.fdbr.android.beauty:id/buttonChangeEmail")
    public MobileElement changeAuth;

    @AndroidFindBy(id = "com.fdbr.android:id/textinput_error")
    public MobileElement txtWarningEmailPhone;

    /***  email screen  ***/
    @AndroidFindBy(id="com.fdbr.android.beauty:id/inputEmail")
    public MobileElement fieldVerifyEmail;

    @AndroidFindBy(id="com.fdbr.android.beauty:id/labelEmail")
    public MobileElement inputedEmail;

    @AndroidFindBy(id="com.fdbr.android.beauty:id/buttonChangeEmail")
    public MobileElement changeEmailBtn;

    @AndroidFindBy(id="com.fdbr.android.beauty:id/buttonVerifyEmail")
    public MobileElement verifyNowEmailBtn;

    @AndroidFindBy(id="com.fdbr.android.beauty:id/buttonSkipVerifyEmail")
    public MobileElement skipEmailBtn;

    @AndroidFindBy(id="com.fdbr.android:id/textTitle")
    public MobileElement titleModalSuccessVerifyEmail;

    @AndroidFindBy(id="com.fdbr.android:id/textDescription")
    public MobileElement descModalSuccessVerifyEmail;

    @AndroidFindBy(id="com.fdbr.android:id/buttonPositive")
    public MobileElement nextButtonModalVerifyEmail;

    /***  phone screen  ***/
    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android.beauty:id/labelSubtitle') and @index='0']")
    @iOSXCUITFindBy(id="Verify your phone number to keep using your account")
    public MobileElement subtitleVerifyPhoneStepper;

    @AndroidFindBy(id="com.fdbr.android.beauty:id/inputPhone")
    public MobileElement fieldVerifyPhone;

    @AndroidFindBy(id="com.fdbr.android.beauty:id/labelPhone")
    public MobileElement inputedPhone;

    @AndroidFindBy(id="com.fdbr.android.beauty:id/buttonChangePhone")
    public MobileElement changePhoneBtn;

    @AndroidFindBy(id="com.fdbr.android.beauty:id/buttonSkipVerifyPhone")
    public MobileElement skipPhoneBtn;

    @AndroidFindBy(id="com.fdbr.android.beauty:id/buttonVerifyPhone")
    @iOSXCUITFindBy(id="VERIFY NOW")
    public MobileElement verifyNowPhoneBtn;

    @AndroidFindBy(id="com.fdbr.android:id/textTitle")
    public MobileElement titleModalSuccessVerifyPhone;

    @AndroidFindBy(id="com.fdbr.android:id/textDescription")
    public MobileElement descModalSuccessVerifyPhone;

    @AndroidFindBy(id="com.fdbr.android:id/buttonPositive")
    public MobileElement nextButtonModalVerifyPhone;

    @AndroidFindBy(id = "com.fdbr.android.beauty:id/buttonChangeAccount")
    public MobileElement btnChangeAccount;

    /* modal switch account */
    @AndroidFindBy(id = "com.fdbr.android:id/textTitle")
    public MobileElement modalSwitchAccountTittle;

    @AndroidFindBy(id = "com.fdbr.android:id/buttonNegative")
    public MobileElement btnOkChangeAccount;

    @AndroidFindBy(id = "com.fdbr.android:id/buttonPositive")
    public MobileElement btnCancelChangeAccount;

    /***  modal change password screen  ***/
    @AndroidFindBy(id="com.fdbr.android.beauty:id/tvTitle")
    public MobileElement titleModalPassword;

    @AndroidFindBy(id="com.fdbr.android.beauty:id/tvSubtitle")
    public MobileElement subtitleModalPassword;

    @AndroidFindBy(id="com.fdbr.android.beauty:id/inputPassword")
    public MobileElement fieldPassword;

    @AndroidFindBy(id="com.fdbr.android:id/text_input_end_icon")
    public MobileElement unhideIcon;

    @AndroidFindBy(id="com.fdbr.android.beauty:id/btnConfirm")
    public MobileElement btnConfirmPassword;

    @AndroidFindBy(id="com.fdbr.android.beauty:id/btnClose")
    public MobileElement closeModalPassword;

    /***  personal info screen  ***/
    @AndroidFindBy(id="com.fdbr.android.beauty:id/imgProfilePicture")
    public MobileElement imgPersonalInfo;

    @AndroidFindBy(id="com.fdbr.android.beauty:id/inputFullName")
    public MobileElement fieldFullnamePersonalInfo;

    @AndroidFindBy(id="android:id/content")
    public MobileElement modalErrorFullname;

    @AndroidFindBy(id="com.fdbr.android:id/textTitle")
    public MobileElement titleModalErrorFullname;

    @AndroidFindBy(id="com.fdbr.android:id/textDescription")
    public MobileElement descModalErrorFullname;

    @AndroidFindBy(id="com.fdbr.android:id/buttonPositive")
    public MobileElement okModalErrorFullname;

    @AndroidFindBy(id="com.fdbr.android.beauty:id/rbFemale")
    public MobileElement rbFemalePersonalInfo;

    @AndroidFindBy(id="com.fdbr.android.beauty:id/rbMale")
    public MobileElement rbMalePersonalInfo;

    @AndroidFindBy(id="com.fdbr.android.beauty:id/inputLocation")
    public MobileElement fieldlocationPersonalInfo;

    @AndroidFindBy(id="com.fdbr.android.beauty:id/buttonSavePersonalInfo")
    public MobileElement saveBtnPersonalInfo;

    @AndroidFindBy(id="com.fdbr.android.beauty:id/buttonSkipPersonalInfo")
    public MobileElement skipBtnPersonalInfo;

    @AndroidFindBy(id="com.fdbr.android:id/toolbarBottomSearch")
    public MobileElement searchLocationPersonalInfo;

    @AndroidFindBy(id="com.fdbr.android:id/buttonBackToolbar")
    public MobileElement backLocationPersonalInfo;

    @AndroidFindBy(id="com.fdbr.android:id/textinput_error")
    public MobileElement errorMsgFullname;

    @AndroidFindBy(id="com.fdbr.android.beauty:id/textErrorGender")
    public MobileElement errorMsgGender;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android:id/textinput_error') and @text='Please enter your location']")
    public MobileElement errorMsgLocation;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android.main:id/textCityName') and @text='Ambon']")
    public MobileElement ambonCity;

    /***  beauty profile screen  ***/
    @AndroidFindBy(id="com.fdbr.android.beauty:id/scrollBeautyProfile")
    public MobileElement contentBeautyProf;

    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.RadioButton")
    public MobileElement skinTypeNormal;

    @AndroidFindBy(id="com.fdbr.android.beauty:id/textErrorSkinType")
    public MobileElement errorMsgSkinType;

    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[5]/android.widget.RadioButton")
    public MobileElement skinToneDark;

    @AndroidFindBy(id="com.fdbr.android.beauty:id/textErrorSkinTone")
    public MobileElement errorMsgSkinTone;

    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[3]/android.widget.RadioButton")
    public MobileElement skinUnderToneWarm;

    @AndroidFindBy(id="com.fdbr.android.beauty:id/textErrorSkinUnderTone")
    public MobileElement errorMsgSkinUndertone;

    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[3]/android.widget.RadioButton")
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

    @AndroidFindBy(id="com.fdbr.android.beauty:id/buttonSkipBeautyProfile")
    public MobileElement skipBeautyProfile;

    /***  beauty concern screen  ***/
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

    @AndroidFindBy(id="com.fdbr.android.beauty:id/buttonSkipBeautyConcern")
    public MobileElement btnSkipBeautyConcern;

    //error msg verify email and phone
    @AndroidFindBy(id="com.fdbr.android:id/textinput_error")
    public MobileElement errorMsgUnderField;

    //snackbar msg
    @AndroidFindBy(id="com.fdbr.android:id/snackbar_text")
    public MobileElement snackbarMsg;

    //title screen
    @AndroidFindBy(id="com.fdbr.android:id/toolbarTitle")
    public MobileElement titleScreen;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android:id/toolbarTitle') and @text='Beauty Profile']")
    public MobileElement titleBeautyProfileScreen;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android:id/toolbarTitle') and @text='Beauty Concern']")
    public MobileElement titleBeautyConcernScreen;

    //take picture
    @AndroidFindBy(id="com.fdbr.android.photo:id/buttonCapture")
    public MobileElement capturePhoto;

    @AndroidFindBy(id="com.fdbr.android.photo:id/buttonPicker")
    public MobileElement gallery;

    @AndroidFindBy(id="com.fdbr.android:id/buttonRightCustom")
    public MobileElement doneBtn;

    @AndroidFindBy(id="com.fdbr.android:id/buttonLeftCustom")
    public MobileElement retakePicture;

    //modal successfully complete profile
    @AndroidFindBy(id="com.fdbr.android.main:id/imageCompleteProfile")
    public MobileElement imgModalSuccessComplete;

    @AndroidFindBy(id="com.fdbr.android.main:id/tvSubtitle")
    public MobileElement descModalSuccessComplete;

    @AndroidFindBy(id="com.fdbr.android.main:id/btnClose")
    public MobileElement closeModalSuccessComplete;

    /* first img in gallery */
    @AndroidFindBy(xpath="//android.widget.ImageView[contains(@resource-id, 'com.google.android.documentsui:id/icon_thumb') and @index='0']")
    public MobileElement firstIndexImg;

    @AndroidFindBy(id="com.fdbr.android:id/menu_crop")
    public MobileElement doneCropBtn;

    @AndroidFindBy(id="com.fdbr.android.beauty:id/imgVerifyStep")
    public MobileElement stepper;

    // This is a constructor, as every page need a base driver to find android elements
    public VerifyAccountScreen(AppiumDriver driver) {

        this.driver = driver;
        //Initialize Elements of a Page class without having to use ‘FindElement‘ or ‘FindElements‘
        PageFactory.initElements(new AppiumFieldDecorator(this.driver),this);
    }

    public VerifyAccountScreen checkStepper() {

        isElementPresent(stepper);
        return new VerifyAccountScreen(driver);
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
    public VerifyAccountScreen tapToChangeEmail(String email) {

        isElementPresent(changeEmailBtn);
        tapByElement(changeEmailBtn);
        inputValue(fieldVerifyEmail, email);
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen inputFieldVerifyEmail(String email) {

        isElementPresent(fieldVerifyEmail);
        inputValue(fieldVerifyEmail, email);
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen clickVerifyEmailNow() {

        tapByElement(verifyNowEmailBtn);
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen clickSkipEmail() {

        isElementEnabled(skipEmailBtn);
        tapByElement(skipEmailBtn);
        return new VerifyAccountScreen(driver);
    }

    /***  phone screen  ***/
    public VerifyAccountScreen verifyPhoneStepper() {

        WaitUntilElementIsVisible(subtitleVerifyPhoneStepper);
        WaitUntilElementIsVisible(verifyNowPhoneBtn);
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen tapToChangePhone(String phone) {

        isElementPresent(changePhoneBtn);
        tapByElement(changePhoneBtn);
        inputValue(fieldVerifyPhone, phone);
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen inputFieldVerifyPhone(String phone) {

        isElementPresent(fieldVerifyPhone);
        inputValue(fieldVerifyPhone, phone);
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen clickVerifyPhoneNow() {

        tapByElement(verifyNowPhoneBtn);
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen clickSkipPhone() {

        isElementEnabled(skipPhoneBtn);
        tapByElement(skipPhoneBtn);
        return new VerifyAccountScreen(driver);
    }

    /***  modal success verify email and phone  ***/
    public VerifyAccountScreen checkVerifiedSuccessEmail(String email) {

        isElementPresent(titleModalSuccessVerifyEmail);
        isElementPresent(descModalSuccessVerifyEmail);
        String content = descModalSuccessVerifyEmail.getText();
        Assert.assertTrue(content.contains(email));

        tapByElement(nextButtonModalVerifyEmail);
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen checkVerifiedSuccessPhone(String phone) {

        isElementPresent(titleModalSuccessVerifyPhone);
        isElementPresent(descModalSuccessVerifyPhone);
        String content = descModalSuccessVerifyPhone.getText();
        Assert.assertTrue(content.contains(phone));

        tapByElement(nextButtonModalVerifyPhone);
        return new VerifyAccountScreen(driver);
    }

    /***  modal confirmation password  ***/
    public VerifyAccountScreen inputPasswordToChangeEmail() {

        isElementPresent(titleModalPassword);
        inputValue(fieldPassword, "test123");
        tapByElement(btnConfirmPassword);
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen inputPasswordToChangePhone() {

        isElementPresent(titleModalPassword);
        inputValue(fieldPassword, "test123");
        tapByElement(btnConfirmPassword);
        return new VerifyAccountScreen(driver);
    }

    /***  personal info screen  ***/
    public VerifyAccountScreen clickCaptureImg() {

        isElementPresent(imgPersonalInfo);
        tapByElement(imgPersonalInfo);

        tapByElement(capturePhoto);

        isElementPresent(doneBtn);
        tapByElement(doneBtn);
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen clickGalleryBtn() {

        isElementPresent(imgPersonalInfo);
        tapByElement(imgPersonalInfo);

        tapByElement(gallery);
        isElementPresent(firstIndexImg);
        tapByElement(firstIndexImg);

        tapByElement(firstIndexImg);

        isElementPresent(doneCropBtn);
        tapByElement(doneCropBtn);

        isElementPresent(doneBtn);
        tapByElement(doneBtn);

        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen captureSS(String nama) throws IOException, InterruptedException {

        isElementPresent(fieldFullnamePersonalInfo);
        captureScreenshot(nama);
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen inputFieldFullname(String fullname) throws IOException {

        inputValue(fieldFullnamePersonalInfo, fullname);
        return new VerifyAccountScreen(driver);
    }

    public Boolean getErrorModalFullname() {

        boolean modalError = isElementPresent(modalErrorFullname);
        boolean titleModalError = isElementPresent(titleModalErrorFullname);
        boolean descModalError = isElementPresent(descModalErrorFullname);
        boolean okBtn = isElementPresent(okModalErrorFullname);
        return (modalError && titleModalError && descModalError && okBtn );
    }

    public VerifyAccountScreen chooseGender() {

        tapByElement(rbFemalePersonalInfo);
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen chooseLocation() {

        tapByElement(fieldlocationPersonalInfo);

        isElementPresent(searchLocationPersonalInfo);
        isElementPresent(ambonCity);
        tapByElement(ambonCity);
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen chooseRandomLocation(String provinsi) {

        tapByElement(fieldlocationPersonalInfo);

        isElementPresent(searchLocationPersonalInfo);
        isElementPresent((MobileElement) driver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id, 'com.fdbr.android:id/textCityName') and @text='"+provinsi+"']")));

        tapByElement((MobileElement) driver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id, 'com.fdbr.android:id/textCityName') and @text='"+provinsi+"']")));
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen clickSavePersonalInfo() {

        tapByElement(saveBtnPersonalInfo);
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen getErrorFullname() {

        isElementPresent(errorMsgFullname);
        String txtErrorFullname = errorMsgFullname.getText();
        System.out.println(txtErrorFullname);
        Assert.assertEquals(txtErrorFullname, "Please enter your full name");
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen getErrorGender() {

        isElementPresent(errorMsgGender);
        String txtErrorGender = errorMsgGender.getText();
        System.out.println(txtErrorGender);
        Assert.assertEquals(txtErrorGender, "Please enter your gender");
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen getErrorLocation() {

        isElementPresent(errorMsgLocation);
        String txtErrorLoc = errorMsgLocation.getText();
        System.out.println(txtErrorLoc);
        Assert.assertEquals(txtErrorLoc, "Please enter your location");
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen clikOkOnModalErrorMsg() {

        tapByElement(okModalErrorFullname);
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen skipPersonalInfo() {

        tapByElement(skipBtnPersonalInfo);
        return new VerifyAccountScreen(driver);
    }

    /***  beauty profile  ***/
    public VerifyAccountScreen clickSaveBeautyProf() {

        WaitUntilElementIsVisible(contentBeautyProf);
        verticalSwipe(contentBeautyProf, 3, 900);
        tapByElement(buttonSaveBeautyProfile);
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen clickSkipBeautyProfile() {

        WaitUntilElementIsVisible(contentBeautyProf);
        verticalSwipe(contentBeautyProf, 3, 900);
        tapByElement(skipBeautyProfile);

        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen chooseSkinType() {

        tapByElement(skinTypeNormal);
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen chooseSkinTone() {

        tapByElement(skinToneDark);
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen chooseSkinUndertone() {

        tapByElement(skinUnderToneWarm);
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen chooseHairType() {

        tapByElement(hairTypeCurly);
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen chooseColoredHair() {

        tapByElement(coloredHairNo);
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen chooseHijaber() {

        tapByElement(isHijaberNo);
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen getErrorSkinType() {

        isElementPresent(errorMsgSkinType);
        String txtErrorSkinType = errorMsgSkinType.getText();
        System.out.println(txtErrorSkinType);
        Assert.assertEquals(txtErrorSkinType, "Please choose your skin type");
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen getErrorSkinTone() {

        isElementPresent(errorMsgSkinTone);
        String txtErrorSkinTone = errorMsgSkinTone.getText();
        System.out.println(txtErrorSkinTone);
        Assert.assertEquals(txtErrorSkinTone, "Please choose your skin tone");
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen getErrorSkinUndertone() {

        isElementPresent(errorMsgSkinUndertone);
        String txtErrorSkinUndertone = errorMsgSkinUndertone.getText();
        System.out.println(txtErrorSkinUndertone);
        Assert.assertEquals(txtErrorSkinUndertone, "Please choose your skin undertone");
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen getErrorHairType() {

        isElementPresent(errorMsgHairType);
        String txtErrorHairType = errorMsgHairType.getText();
        System.out.println(txtErrorHairType);
        Assert.assertEquals(txtErrorHairType, "Please choose your hair type");
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen getErrorColoredHair() {

        isElementPresent(errorMsgColoredHair);
        String txtErrorColoredHair = errorMsgColoredHair.getText();
        System.out.println(txtErrorColoredHair);
        Assert.assertEquals(txtErrorColoredHair, "Please choose one");
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen getErrorHijaber() {

        isElementPresent(errorMsgHijaber);
        String txtErrorHijaber = errorMsgHijaber.getText();
        System.out.println(txtErrorHijaber);
        Assert.assertEquals(txtErrorHijaber, "Please choose one");
        return new VerifyAccountScreen(driver);
    }

    /***  beauty concern  ***/
    public VerifyAccountScreen clickSaveBeautyCon() {

        isElementPresent(contentScreenBodyCon);
        verticalSwipe(contentScreenBodyCon, 3, 900);
        tapByElement(btnSaveBeautyConcern);
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen clickSkipBeautyCon() {

        isElementPresent(contentScreenBodyCon);
        verticalSwipe(contentScreenBodyCon, 3, 900);
        tapByElement(btnSkipBeautyConcern);
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen chooseSkinCon() {

        isElementPresent(blackOrWhite);
        tapByElement(blackOrWhite);
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen getErrorSkinCon() {

        isElementPresent(errorSkinCon);
        String txtErrorSkinCon = errorSkinCon.getText();
        System.out.println(txtErrorSkinCon);
        Assert.assertEquals(txtErrorSkinCon, "Please enter your skin concern");
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen chooseBodyCon() {

        isElementPresent(looseSkin);
        tapByElement(looseSkin);
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen getErrorBodyCon() {

        isElementPresent(errorBodyCon);
        String txtErrorBodyCon = errorBodyCon.getText();
        System.out.println(txtErrorBodyCon);
        Assert.assertEquals(txtErrorBodyCon, "Please enter your body concern");
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen chooseHairCon() {

        isElementPresent(greyHair);
        tapByElement(greyHair);
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen getErrorHairCon() {

        isElementPresent(errorHairCon);
        String txtErrorHairCon = errorHairCon.getText();
        System.out.println(txtErrorHairCon);
        Assert.assertEquals(txtErrorHairCon, "Please enter your hair concern");
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen verifySneakMsg() {

        isElementPresent(snackbarMsg);
        String sm = snackbarMsg.getText();
        System.out.println(sm);
        return new VerifyAccountScreen(driver);
    }

    /***  get title screen  ***/
    public VerifyAccountScreen checkTitleScreenBeautyProfile() {
        WaitUntilElementIsVisible(titleBeautyProfileScreen);
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen checkTitleScreenBeautyConcern() {
        WaitUntilElementIsVisible(titleBeautyConcernScreen);
        return new VerifyAccountScreen(driver);
    }

    /***  modal successfully complete profile  ***/
    public VerifyAccountScreen checkModalSuccessfullyCompleteProfile() {

        WaitUntilElementIsVisible(imgModalSuccessComplete);
        WaitUntilElementIsVisible(descModalSuccessComplete);
        tapByElement(closeModalSuccessComplete);

        return new VerifyAccountScreen(driver);
    }

    /* compare image */
    public VerifyAccountScreen checkPercentage(String namafile1, String namafile2) throws InterruptedException {

        compareImgIfUploaded(namafile1, namafile2);
        Thread.sleep(300);
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen deleteImageStored(String namafile1, String namafile2) {

        deleteFile(namafile1, namafile2);
        return new VerifyAccountScreen(driver);
    }

    /* switch account */
    public VerifyAccountScreen tapBtnGetItNow() {
        tapByElement(btnGetItNow);
        return new VerifyAccountScreen(driver);
    }
    public VerifyAccountScreen tapBtnChangeAccount() {
        isElementPresent(btnChangeAccount);
        tapByElement(btnChangeAccount);
        return new VerifyAccountScreen(driver);
    }
    public VerifyAccountScreen confirmChangeAccount() {
        isElementPresent(modalSwitchAccountTittle);
        tapByElement(btnOkChangeAccount);
        return new VerifyAccountScreen(driver);
    }
    public VerifyAccountScreen tapBtnNextOnModalVerifySuccess() {
        isElementPresent(descModalSuccessVerifyPhone);
        tapByElement(nextButtonModalVerifyPhone);
        return new VerifyAccountScreen(driver);
    }

}
