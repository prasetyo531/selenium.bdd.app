package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;

public class VerifyAccountScreen extends ActionBase {

    @AndroidFindBy(id = "com.fdbr.android.beauty:id/close")
    public MobileElement closeStep;

    @AndroidFindBy(id="com.fdbr.android.beauty:id/buttonChangeEmail")
    public MobileElement changeAuth;

    @AndroidFindBy(id = "com.fdbr.android:id/textinput_error")
    public MobileElement txtWarningEmailPhone;

    /***  email screen  ***/
    @AndroidFindBy(id="com.fdbr.android:id/textinput_placeholder")
    public MobileElement fieldVerifyEmail;

    @AndroidFindBy(id="com.fdbr.android.beauty:id/labelEmail")
    public MobileElement inputedEmail;

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
    @AndroidFindBy(id="com.fdbr.android:id/textinput_placeholder")
    public MobileElement fieldVerifyPhone;

    @AndroidFindBy(id="com.fdbr.android.beauty:id/buttonVerifyPhone")
    public MobileElement verifyNowPhoneBtn;

//    @AndroidFindBy(id="com.fdbr.android.beauty:id/labelEmail")
//    public MobileElement inputedPhone;

    @AndroidFindBy(id="com.fdbr.android.beauty:id/buttonSkipVerifyPhone")
    public MobileElement skipPhoneBtn;

    @AndroidFindBy(id="com.fdbr.android:id/textTitle")
    public MobileElement titleModalSuccessVerifyPhone;

    @AndroidFindBy(id="com.fdbr.android:id/textDescription")
    public MobileElement descModalSuccessVerifyPhone;

    @AndroidFindBy(id="com.fdbr.android:id/buttonPositive")
    public MobileElement nextButtonModalVerifyPhone;

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

    @AndroidFindBy(id="com.fdbr.android:id/toolbarSearch")
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

    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[2]")
    public MobileElement skinTypeCombination;

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
    @AndroidFindBy(xpath="//android.widget.ImageView[contains(@resource-id, 'com.android.documentsui:id/icon_thumb') and @index='0']")
    public MobileElement firstIndexImg;

    @AndroidFindBy(id="com.fdbr.android:id/menu_crop")
    public MobileElement doneCropBtn;


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

        isElementEnabled(skipEmailBtn);
        tapByElement(skipEmailBtn);
        return new VerifyAccountScreen(driver);
    }

    /***  modal success verify email and phone  ***/
    public VerifyAccountScreen checkVerifiedSuccessEmail(String email) throws IOException {

        isElementPresent(titleModalSuccessVerifyEmail);
        isElementPresent(descModalSuccessVerifyEmail);
        String content = descModalSuccessVerifyEmail.getText();
        Assert.assertTrue(content.contains(email));

        tapByElement(nextButtonModalVerifyEmail);
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen checkVerifiedSuccessPhone(String phone) throws IOException {

        isElementPresent(titleModalSuccessVerifyPhone);
        isElementPresent(descModalSuccessVerifyPhone);
        String content = descModalSuccessVerifyPhone.getText();
        Assert.assertTrue(content.contains(phone));

        tapByElement(nextButtonModalVerifyPhone);
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

        isElementEnabled(skipPhoneBtn);
        tapByElement(skipPhoneBtn);
        return new VerifyAccountScreen(driver);
    }

    /***  personal info screen  ***/
    public VerifyAccountScreen clickCaptureImg() throws IOException, InterruptedException {

        isElementPresent(imgPersonalInfo);
        tapByElement(imgPersonalInfo);

        tapByElement(capturePhoto);

        isElementPresent(doneBtn);
        tapByElement(doneBtn);
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen clickGalleryBtn() throws IOException {

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

    public Boolean getErrorModalFullname() throws IOException {

        boolean modalError = isElementPresent(modalErrorFullname);
        boolean titleModalError = isElementPresent(titleModalErrorFullname);
        boolean descModalError = isElementPresent(descModalErrorFullname);
        boolean okBtn = isElementPresent(okModalErrorFullname);
        return (modalError && titleModalError && descModalError && okBtn );
    }

    public VerifyAccountScreen chooseGender() throws IOException {

        tapByElement(rbFemalePersonalInfo);
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen chooseLocation() throws IOException {

        tapByElement(fieldlocationPersonalInfo);

        isElementPresent(searchLocationPersonalInfo);
        isElementPresent(ambonCity);
        tapByElement(ambonCity);
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen chooseRandomLocation(String provinsi) throws IOException {

        tapByElement(fieldlocationPersonalInfo);

        isElementPresent(searchLocationPersonalInfo);
        isElementPresent((MobileElement) driver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id, 'com.fdbr.android:id/textCityName') and @text='"+provinsi+"']")));

        tapByElement((MobileElement) driver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id, 'com.fdbr.android:id/textCityName') and @text='"+provinsi+"']")));
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen clickSavePersonalInfo() throws IOException {

        tapByElement(saveBtnPersonalInfo);
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen getErrorFullname() throws IOException {

        isElementPresent(errorMsgFullname);
        String txtErrorFullname = errorMsgFullname.getText();
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

    public VerifyAccountScreen clikOkOnModalErrorMsg() throws IOException {

        tapByElement(okModalErrorFullname);
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen skipPersonalInfo() throws IOException {

        tapByElement(skipBtnPersonalInfo);
        return new VerifyAccountScreen(driver);
    }

    /***  beauty profile  ***/
    public VerifyAccountScreen clickSaveBeautyProf() throws IOException {

        isElementPresent(contentBeautyProf);
        verticalSwipeByPercentages(contentBeautyProf, 0.4,0.01,0.5,500);
        verticalSwipeByPercentages(contentBeautyProf, 0.4,0.01,0.5,500);
        tapByElement(buttonSaveBeautyProfile);
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen clickSkipBeautyProfile() throws IOException {

        isElementPresent(contentBeautyProf);
        verticalSwipeByPercentages(contentBeautyProf, 0.4,0.01,0.5,500);
        verticalSwipeByPercentages(contentBeautyProf, 0.4,0.01,0.5,500);
        tapByElement(skipBeautyProfile);

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

    public VerifyAccountScreen getErrorSkinType() throws IOException {

        isElementPresent(errorMsgSkinType);
        String txtErrorSkinType = errorMsgSkinType.getText();
        System.out.println(txtErrorSkinType);
        Assert.assertEquals(txtErrorSkinType, "Please choose your skin type");
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen getErrorSkinTone() throws IOException {

        isElementPresent(errorMsgSkinTone);
        String txtErrorSkinTone = errorMsgSkinTone.getText();
        System.out.println(txtErrorSkinTone);
        Assert.assertEquals(txtErrorSkinTone, "Please choose your skin tone");
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen getErrorSkinUndertone() throws IOException {

        isElementPresent(errorMsgSkinUndertone);
        String txtErrorSkinUndertone = errorMsgSkinUndertone.getText();
        System.out.println(txtErrorSkinUndertone);
        Assert.assertEquals(txtErrorSkinUndertone, "Please choose your skin undertone");
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen getErrorHairType() throws IOException {

        isElementPresent(errorMsgHairType);
        String txtErrorHairType = errorMsgHairType.getText();
        System.out.println(txtErrorHairType);
        Assert.assertEquals(txtErrorHairType, "Please choose your hair type");
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen getErrorColoredHair() throws IOException {

        isElementPresent(errorMsgColoredHair);
        String txtErrorColoredHair = errorMsgColoredHair.getText();
        System.out.println(txtErrorColoredHair);
        Assert.assertEquals(txtErrorColoredHair, "Please choose one");
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen getErrorHijaber() throws IOException {

        isElementPresent(errorMsgHijaber);
        String txtErrorHijaber = errorMsgHijaber.getText();
        System.out.println(txtErrorHijaber);
        Assert.assertEquals(txtErrorHijaber, "Please choose one");
        return new VerifyAccountScreen(driver);
    }

    /***  beauty concern  ***/
    public VerifyAccountScreen clickSaveBeautyCon() throws IOException {

        isElementPresent(contentScreenBodyCon);
        verticalSwipeByPercentages(contentScreenBodyCon,0.4,0.01,0.5,500);
        verticalSwipeByPercentages(contentScreenBodyCon, 0.4,0.01,0.5,500);
        tapByElement(btnSaveBeautyConcern);
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen clickSkipBeautyCon() throws IOException {

        isElementPresent(contentScreenBodyCon);
        verticalSwipeByPercentages(contentScreenBodyCon,0.4,0.01,0.5,500);
        verticalSwipeByPercentages(contentScreenBodyCon, 0.4,0.01,0.5,500);
        tapByElement(btnSkipBeautyConcern);
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen chooseSkinCon() throws IOException {

        isElementPresent(blackOrWhite);
        tapByElement(blackOrWhite);
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen getErrorSkinCon() throws IOException {

        isElementPresent(errorSkinCon);
        String txtErrorSkinCon = errorSkinCon.getText();
        System.out.println(txtErrorSkinCon);
        Assert.assertEquals(txtErrorSkinCon, "Please enter your skin concern");
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen chooseBodyCon() throws IOException {

        isElementPresent(looseSkin);
        tapByElement(looseSkin);
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen getErrorBodyCon() throws IOException {

        isElementPresent(errorBodyCon);
        String txtErrorBodyCon = errorBodyCon.getText();
        System.out.println(txtErrorBodyCon);
        Assert.assertEquals(txtErrorBodyCon, "Please enter your body concern");
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen chooseHairCon() throws IOException {

        isElementPresent(greyHair);
        tapByElement(greyHair);
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen getErrorHairCon() throws IOException {

        isElementPresent(errorHairCon);
        String txtErrorHairCon = errorHairCon.getText();
        System.out.println(txtErrorHairCon);
        Assert.assertEquals(txtErrorHairCon, "Please enter your hair concern");
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen verifySneakMsg() throws IOException {

        isElementPresent(snackbarMsg);
        String sm = snackbarMsg.getText();
        System.out.println(sm);
        return new VerifyAccountScreen(driver);
    }

    /***  get title screen  ***/
    public VerifyAccountScreen checkTitleScreenBeautyProfile() throws IOException, InterruptedException {

        //Thread.sleeps(200);
        isElementPresent(titleScreen);
        String title = titleScreen.getText();
        System.out.println("title screen"+" "+title);
        Assert.assertEquals(title, "Beauty Profile");

        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen checkTitleScreenBeautyConcern() throws IOException, InterruptedException {

        //Thread.sleep(200);
        isElementPresent(titleScreen);
        String title = titleScreen.getText();
        System.out.println("title screen"+" "+title);
        Assert.assertEquals(title, "Beauty Concern");

        return new VerifyAccountScreen(driver);
    }

    /***  modal successfully complete profile  ***/
    public VerifyAccountScreen checkModalSuccessfullyCompleteProfile() throws IOException, InterruptedException {

        Thread.sleep(500);
        isElementPresent(imgModalSuccessComplete);
        isElementPresent(descModalSuccessComplete);
        tapByElement(closeModalSuccessComplete);

        return new VerifyAccountScreen(driver);
    }

    /* compare image */
    public VerifyAccountScreen checkPercentage(String namafile1, String namafile2) throws IOException, InterruptedException {

        compareImgIfUploaded(namafile1, namafile2);
        Thread.sleep(300);
        return new VerifyAccountScreen(driver);
    }

    public VerifyAccountScreen deleteImageStored(String namafile1, String namafile2) throws IOException {

        deleteFile(namafile1, namafile2);
        return new VerifyAccountScreen(driver);
    }
}
