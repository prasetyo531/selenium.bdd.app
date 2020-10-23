package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.List;

public class ProfileScreen extends ActionBase{

    @AndroidFindBy(xpath="//android.widget.LinearLayout[@content-desc=\"Posts\"]")
    public MobileElement postsTab;

    @AndroidFindBy(xpath="//android.widget.LinearLayout[@content-desc=\"Reviews\"]")
    public MobileElement reviewsTab;

    @AndroidFindBy(xpath="//android.widget.LinearLayout[@content-desc=\"Topics\"]")
    public MobileElement topicsTab;

    @AndroidFindBy(xpath="//android.widget.LinearLayout[@content-desc=\"Talks\"]")
    public MobileElement talksTab;

    @AndroidFindBy(id="com.fdbr.android.main:id/buttonUpdateBeautyId")
    public MobileElement updateBeautyIdBeautyBox;

    @AndroidFindBy(id="com.fdbr.android.main:id/setting")
    public MobileElement settingIcon;

    /* review or post list */
    @AndroidFindBy(id="com.fdbr.android.main:id/labelProductName")
    public List<MobileElement> listProductReviewsProfile;

    @AndroidFindBy(xpath="//android.widget.ImageView[contains(@resource-id, 'com.fdbr.android.main:id/imagePhoto') and @index='0']")
    public MobileElement firstPostProfile;

    @AndroidFindBy(id="com.fdbr.android.main:id/imagePhoto")
    public MobileElement listPhotoReviewsProfile;

    /****
     setting option
     ****/
    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android.setting:id/labelAction') and @text='Edit Profile']")
    public MobileElement editProfile;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android.setting:id/labelAction') and @text='Invite Friends']")
    public MobileElement inviteFriends;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android.setting:id/labelAction') and @text='Feedback']")
    public MobileElement feedback;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android.setting:id/labelAction') and @text='Rate Our App']")
    public MobileElement rateOurApp;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android.setting:id/labelAction') and @text='Privacy Policy']")
    public MobileElement privacyPolicy;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android.setting:id/labelAction') and @text='Log Out']")
    public MobileElement logout;

    /****
     edit profile
     ****/
    @AndroidFindBy(xpath="//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
    public MobileElement cancelEditprofile;

    @AndroidFindBy(id="com.fdbr.android.main:id/save")
    public MobileElement saveEditprofile;

    @AndroidFindBy(id="com.fdbr.android.main:id/viewChooseImage")
    public MobileElement uploadImgBtn;

    @AndroidFindBy(id="com.fdbr.android.main:id/layoutDob")
    public MobileElement dobEditProfile;

    @AndroidFindBy(id="com.fdbr.android.main:id/inputDob")
    public MobileElement inputedDob;

    @AndroidFindBy(xpath="//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
    public MobileElement editCancel;

    @AndroidFindBy(id="com.fdbr.android.main:id/textStatusEmail")
    public MobileElement labelVerifyEmail;

    @AndroidFindBy(id="com.fdbr.android.main:id/textStatusPhone")
    public MobileElement labelVerifyPhone;

    //previous month
    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.NumberPicker[1]/android.widget.Button[1]")
    public MobileElement MonthDob;

    @AndroidFindBy(id="com.fdbr.android:id/btn_cancel")
    public MobileElement dobCancel;

    @AndroidFindBy(id="com.fdbr.android:id/btn_ok")
    public MobileElement dobOk;

    @AndroidFindBy(id="com.fdbr.android.main:id/inputName")
    public MobileElement fullnameField;

    @AndroidFindBy(id="com.fdbr.android.main:id/tvItemSpinner")
    public MobileElement genderField;

    @AndroidFindBy(id="//android.widget.CheckedTextView[contains(@resource-id,'android:id/text1') and @text='Female']")
    public MobileElement rbFemalePersonalInfo;

    @AndroidFindBy(xpath="//android.widget.CheckedTextView[contains(@resource-id,'android:id/text1') and @text='Male']")
    public MobileElement rbMalePersonalInfo;

    @AndroidFindBy(id="com.fdbr.android.main:id/layoutLocation")
    public MobileElement locationField;

    @AndroidFindBy(id="com.fdbr.android:id/toolbarSearch")
    public MobileElement searchLocField;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android.main:id/textCityName') and @text='Ambon']")
    public MobileElement ambon;

    @AndroidFindBy(id="com.fdbr.android.main:id/labelChangePassword")
    public MobileElement changePassword;

    @AndroidFindBy(id="com.fdbr.android.main:id/layoutBeautyProfile")
    public MobileElement updateBeautyProfile;

    @AndroidFindBy(id="com.fdbr.android.main:id/layoutBeautyConcern")
    public MobileElement updateBeautyConcern;

    @AndroidFindBy(id="com.fdbr.android.main:id/inputBio")
    public MobileElement fieldBio;

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

    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.RadioButton")
    public MobileElement coloredHairNo;

    @AndroidFindBy(id="com.fdbr.android.beauty:id/textErrorColoredHair")
    public MobileElement errorMsgColoredHair;

    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[4]/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.RadioButton")
    public MobileElement isHijaberNo;

    @AndroidFindBy(id="com.fdbr.android.beauty:id/textErrorHijab")
    public MobileElement errorMsgHijaber;

    @AndroidFindBy(id="com.fdbr.android.beauty:id/buttonSaveBeautyProfile")
    public MobileElement buttonSaveBeautyProfile;

    @AndroidFindBy(id="com.fdbr.android.beauty:id/buttonSkipBeautyProfile")
    public MobileElement skipBeautyProfile;

    /***  beauty concern screen  ***/
    //title screen
    @AndroidFindBy(id="com.fdbr.android:id/toolbarTitle")
    public MobileElement titleScreen;

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

    /****
     capture img
     ****/
    @AndroidFindBy(id="com.fdbr.android.photo:id/buttonCapture")
    public MobileElement captureBtn;

    @AndroidFindBy(xpath="//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
    public MobileElement backArrow;

    @AndroidFindBy(id="com.fdbr.android:id/buttonLeftCustom")
    public MobileElement retakeBtn;

    @AndroidFindBy(id="com.fdbr.android:id/buttonRightCustom")
    public MobileElement doneArrow;

    /****
     change password
     ****/
    @AndroidFindBy(id="com.fdbr.android.auth:id/inputOldPassword")
    public MobileElement oldPassField;

    @AndroidFindBy(id="com.fdbr.android.auth:id/inputNewPassword")
    public MobileElement newPassField;

    @AndroidFindBy(id="com.fdbr.android.auth:id/text_input_end_icon")
    public MobileElement showPassIcon;

    @AndroidFindBy(id="com.fdbr.android.auth:id/buttonSubmit")
    public MobileElement submitBtn;

    @AndroidFindBy(xpath="//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
    public MobileElement backArrowForgotPassScreen;

    @AndroidFindBy(id="com.fdbr.android:id/snackbar_text")
    public MobileElement sneakbarChangePassword;


    // This is a constructor, as every page need a base driver to find android elements
    public ProfileScreen(AppiumDriver driver) throws IOException {

        this.driver = driver;
        //Initialize Elements of a Page class without having to use ‘FindElement‘ or ‘FindElements‘
        PageFactory.initElements(new AppiumFieldDecorator(this.driver),this);
    }

    public ProfileScreen clickReviewsTab() throws IOException {

        tapByElement(reviewsTab);
        return new ProfileScreen(driver);
    }

    public ProfileScreen clickPostsTab() throws IOException {

        tapByElement(postsTab);
        return new ProfileScreen(driver);
    }

    public ProfileScreen clickBeautyIdOnBeautyBox() throws IOException {

        isElementPresent(updateBeautyIdBeautyBox);
        tapByElement(updateBeautyIdBeautyBox);
        return new ProfileScreen(driver);
    }

    public ProfileScreen clickSettingProfile() throws IOException {

        isElementPresent(settingIcon);
        tapByElement(settingIcon);
        return new ProfileScreen(driver);
    }

    public ProfileScreen clickEditProfile() throws IOException {

        isElementPresent(editProfile);
        tapByElement(editProfile);
        return new ProfileScreen(driver);
    }

    public ProfileScreen clickBackSetting() throws IOException {

        isElementPresent(backArrow);
        tapByElement(backArrow);
        return new ProfileScreen(driver);
    }

    /* verify from profile */
    public ProfileScreen clickVerifyEmail() throws IOException {

        isElementPresent(labelVerifyEmail);
        tapByElement(labelVerifyEmail);
        return new ProfileScreen(driver);
    }

    public ProfileScreen clickVerifyPhone() throws IOException {

        isElementPresent(labelVerifyPhone);
        tapByElement(labelVerifyPhone);
        return new ProfileScreen(driver);
    }

    public ProfileScreen checkLabelVerifiedEmail() throws IOException {

        String lb1 = labelVerifyEmail.getText();
        Assert.assertEquals("Verified", lb1);
        return new ProfileScreen(driver);
    }

    public ProfileScreen checkLabelVerifiedPhone() throws IOException {

        String lb2 = labelVerifyPhone.getText();
        Assert.assertEquals("Verified", lb2);
        return new ProfileScreen(driver);
    }


    /*  edit profile screen */
    public ProfileScreen clickSaveProfile() throws IOException {

        isElementPresent(saveEditprofile);
        tapByElement(saveEditprofile);
        return new ProfileScreen(driver);
    }

    public ProfileScreen clickCancelEditProfile() throws IOException {

        isElementPresent(cancelEditprofile);
        tapByElement(cancelEditprofile);
        return new ProfileScreen(driver);
    }

    public ProfileScreen editDobToPreviousMonth() throws IOException {

        isElementPresent(dobEditProfile);
        tapByElement(dobEditProfile);

        isElementPresent(MonthDob);
        tapByElement(MonthDob);

        tapByElement(dobOk);
        return new ProfileScreen(driver);
    }

    public ProfileScreen inputFullname(String fullname) throws IOException {

        isElementPresent(fullnameField);
        inputValue(fullnameField, fullname);
        return new ProfileScreen(driver);
    }

    public ProfileScreen chooseFemaleGender() throws IOException {

        tapByElement(genderField);

        isElementPresent(rbFemalePersonalInfo);
        tapByElement(rbFemalePersonalInfo);
        return new ProfileScreen(driver);
    }

    public ProfileScreen chooseMaleGender() throws IOException {

        tapByElement(genderField);

        isElementPresent(rbMalePersonalInfo);
        tapByElement(rbMalePersonalInfo);
        return new ProfileScreen(driver);
    }

    public ProfileScreen chooseLocationEditProfile() throws IOException {

        verticalSwipeByPercentages(locationField, 0.4,0.01,0.5,500);
        tapByElement(locationField);

        isElementPresent(ambon);
        tapByElement(ambon);
        return new ProfileScreen(driver);
    }

    public ProfileScreen inputBio(String bio) throws IOException {

        isElementPresent(fieldBio);
        inputValue(fieldBio, bio);
        return new ProfileScreen(driver);
    }

    public ProfileScreen clickUpdateBeautyProfile() throws IOException {

        isElementPresent(fullnameField);
        this.verticalSwipeByPercentages(fullnameField,0.4,0.01,0.5,500);

        tapByElement(updateBeautyProfile);
        return new ProfileScreen(driver);
    }

    public ProfileScreen clickUpdateBeautyConcern() throws IOException {

        isElementPresent(fullnameField);
        this.verticalSwipeByPercentages(fullnameField,0.4,0.01,0.5,500);

        tapByElement(updateBeautyConcern);
        return new ProfileScreen(driver);
    }

    /* choose beauty profile */
    public ProfileScreen chooseSkinType() throws IOException {

        tapByElement(skinTypeCombination);
        return new ProfileScreen(driver);
    }

    public ProfileScreen chooseSkinTone() throws IOException {

        tapByElement(skinToneDark);
        return new ProfileScreen(driver);
    }

    public ProfileScreen chooseSkinUndertone() throws IOException {

        this.verticalSwipeByPercentages(skinUnderToneWarm,0.4,0.01,0.5,500);
        tapByElement(skinUnderToneWarm);
        return new ProfileScreen(driver);
    }

    public ProfileScreen chooseHairType() throws IOException {

        this.verticalSwipeByPercentages(hairTypeCurly,0.4,0.01,0.5,500);
        tapByElement(hairTypeCurly);
        return new ProfileScreen(driver);
    }

    public ProfileScreen chooseColoredHair() throws IOException {

        tapByElement(coloredHairNo);
        return new ProfileScreen(driver);
    }

    public ProfileScreen chooseHijaber() throws IOException {

        this.verticalSwipeByPercentages(isHijaberNo,0.4,0.01,0.5,500);
        tapByElement(isHijaberNo);
        return new ProfileScreen(driver);
    }

    public ProfileScreen clickSaveBeautyProf() throws IOException {

        tapByElement(buttonSaveBeautyProfile);
        return new ProfileScreen(driver);
    }

    /* choose beauty concern */
    public ProfileScreen chooseSkinCon() throws IOException {

        isElementPresent(contentScreenBodyCon);
        tapByElement(blackOrWhite);
        return new ProfileScreen(driver);
    }

    public ProfileScreen chooseBodyCon() throws IOException {

        verticalSwipeByPercentages(contentScreenBodyCon, 0.8,0.01,0.5,500);
        isElementPresent(looseSkin);
        tapByElement(looseSkin);
        return new ProfileScreen(driver);
    }

    public ProfileScreen chooseHairCon() throws IOException {

        isElementPresent(greyHair);
        tapByElement(greyHair);
        return new ProfileScreen(driver);
    }

    public ProfileScreen clickSaveBeautyCon() throws IOException {

        tapByElement(btnSaveBeautyConcern);
        return new ProfileScreen(driver);
    }

    public void checkTitleScreenBeautyProfile() throws InterruptedException {

        Thread.sleep(2000);
        isElementPresent(titleScreen);
        String title = titleScreen.getText();
        System.out.println("title screen"+" "+title);
        org.testng.Assert.assertEquals(title, "Beauty Profile");
    }

    public void checkTitleScreenBeautyConcern() throws InterruptedException {

        Thread.sleep(2000);
        isElementPresent(titleScreen);
        String title = titleScreen.getText();
        System.out.println("title screen"+" "+title);
        org.testng.Assert.assertEquals(title, "Beauty Concern");
    }

    /*  get inputed field profile screen */
    public ProfileScreen getTextDob() throws IOException {

        isElementPresent(dobEditProfile);
        String getDob = dobEditProfile.getText();
        System.out.println("dob is"+" "+getDob);
        Assert.assertNotSame(null, getDob);
        return new ProfileScreen(driver);
    }

    public ProfileScreen getFullnameEditProfile(String fullname) throws IOException {

        isElementPresent(fullnameField);
        String getFullname = fullnameField.getText();
        System.out.println("fullname is"+" "+getFullname);
        Assert.assertEquals(fullname, getFullname);
        return new ProfileScreen(driver);
    }

    public ProfileScreen getLocationEditProfile() throws IOException {

        verticalSwipeByPercentages(locationField, 0.4,0.01,0.5,500);
        isElementPresent(locationField);

        String getLoc = locationField.getText();
        System.out.println("loc is"+" "+getLoc);
        Assert.assertNotSame(null, getLoc);
        return new ProfileScreen(driver);
    }

    public ProfileScreen getTextBio(String txt) throws IOException {

        isElementPresent(fieldBio);
        String getBio = fieldBio.getText();
        System.out.println("dobiob is"+" "+getBio);
        Assert.assertEquals(txt, getBio);
        return new ProfileScreen(driver);
    }

    public ProfileScreen getTextEmptyDob() throws IOException {

        isElementPresent(dobEditProfile);
        String getDob = dobEditProfile.getText();
        System.out.println("dob is"+" "+getDob);
        Assert.assertSame(null, getDob);
        return new ProfileScreen(driver);
    }

    public ProfileScreen getFullnameEmptyEditProfile() throws IOException {

        isElementPresent(fullnameField);
        String getFullname = fullnameField.getText();
        System.out.println("fullname is"+" "+getFullname);
        Assert.assertSame(null, getFullname);
        return new ProfileScreen(driver);
    }

    public ProfileScreen getLocationEmptyEditProfile() throws IOException {

        verticalSwipeByPercentages(locationField, 0.4,0.01,0.5,500);
        isElementPresent(locationField);

        String getLoc = locationField.getText();
        System.out.println("loc is"+" "+getLoc);
        Assert.assertSame(null, getLoc);
        return new ProfileScreen(driver);
    }

    public ProfileScreen getTextEmptyBio() throws IOException {

        isElementPresent(fieldBio);
        String getBio = fieldBio.getText();
        System.out.println("dobiob is"+" "+getBio);
        Assert.assertSame(null, getBio);
        return new ProfileScreen(driver);
    }

    public ProfileScreen findToastAfterUpdateBeautyProfile() throws IOException {

        //WebDriverWait wait = new WebDriverWait(driver, 2);
        //its not check text equals expected text
        toastMatches("Beauty Profile Updated", false);

        return new ProfileScreen(driver);
    }

    public ProfileScreen findToastAfterUpdateBeautyConcern() throws IOException {

        //WebDriverWait wait = new WebDriverWait(driver, 2);
        //its not check text equals expected text
        toastMatches("Beauty Concern Updated", false);

        return new ProfileScreen(driver);
    }

    /*   change password   */
    public ProfileScreen clickChangePassword() throws IOException {

        this.verticalSwipeByPercentages(locationField,0.4,0.01,0.5,500);

        tapByElement(changePassword);
        return new ProfileScreen(driver);
    }

    public ProfileScreen inputOldPassword(String oldpass) throws IOException {

        isElementPresent(oldPassField);
        inputValue(oldPassField, oldpass);
        return new ProfileScreen(driver);
    }

    public ProfileScreen inputNewPassword(String newpass) throws IOException {

        isElementPresent(newPassField);
        inputValue(newPassField, newpass);
        return new ProfileScreen(driver);
    }

    public ProfileScreen clickSubmitChangePassword() throws IOException {

        isElementPresent(submitBtn);
        tapByElement(submitBtn);
        return new ProfileScreen(driver);
    }

    public ProfileScreen getSneakMsgOldPassword(String text) throws IOException {

        isElementPresent(sneakbarChangePassword);
        String msg = sneakbarChangePassword.getText();
        Assert.assertEquals(text, msg);
        return new ProfileScreen(driver);
    }

    /* review */
    public ProfileScreen clickRandomReviewListProfile() throws IOException {

        this.verticalSwipeByPercentages(listPhotoReviewsProfile, 0.4,0.01,0.5,500);
        isElementPresent(listPhotoReviewsProfile);
        clickRandomMenus(listProductReviewsProfile);

        return new ProfileScreen(driver);
    }

    /* post */
    public ProfileScreen clickFirstPostProfile() throws IOException {

        this.verticalSwipeByPercentages(postsTab, 0.4,0.01,0.5,500);
        isElementPresent(firstPostProfile);
        tapByElement(firstPostProfile);

        return new ProfileScreen(driver);
    }
}
