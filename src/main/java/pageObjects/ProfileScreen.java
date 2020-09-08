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

    @AndroidFindBy(id="com.fdbr.android.main:id/textSave")
    public MobileElement saveEditprofile;

    @AndroidFindBy(id="com.fdbr.android.main:id/viewChooseImage")
    public MobileElement uploadImgBtn;

    @AndroidFindBy(id="com.fdbr.android.main:id/layoutDob")
    public MobileElement dobEditProfile;

    @AndroidFindBy(id=" com.fdbr.android.main:id/inputDob")
    public MobileElement inputedDob;

    @AndroidFindBy(xpath="//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
    public MobileElement dobCancel;

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

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android:id/textCityName') and @text='Balikpapan']")
    public MobileElement balikpapan;

    @AndroidFindBy(id="com.fdbr.android.main:id/labelChangePassword")
    public MobileElement changePassword;

    @AndroidFindBy(id="com.fdbr.android.main:id/layoutBeautyProfile")
    public MobileElement beautyProfEditProfile;

    @AndroidFindBy(id="com.fdbr.android.main:id/layoutBeautyConcern")
    public MobileElement concernProfEditProfile;

    @AndroidFindBy(id="com.fdbr.android.main:id/inputBio")
    public MobileElement fieldBio;

    /****
     permission
     ****/
    @AndroidFindBy(id="com.android.permissioncontroller:id/permission_allow_button")
    public MobileElement allowBtn;

    @AndroidFindBy(id="com.android.permissioncontroller:id/permission_deny_button")
    public MobileElement denyBtn;

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

    /*  edit profile screen */
    public ProfileScreen clickSaveProfile() throws IOException {

        tapByElement(saveEditprofile);
        return new ProfileScreen(driver);
    }

    public ProfileScreen clickCancelEditProfile() throws IOException {

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

        isElementPresent(balikpapan);
        tapByElement(balikpapan);
        return new ProfileScreen(driver);
    }

    public ProfileScreen inputBio(String bio) throws IOException {

        isElementPresent(fieldBio);
        inputValue(fieldBio, bio);
        return new ProfileScreen(driver);
    }

    /*  change password screen */

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

    /*   change password   */
    public ProfileScreen clickChangePassword() throws IOException {

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
        Assert.assertEquals(msg, text);
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
