package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class ProfileScreen extends ActionBase{

    @AndroidFindBy(xpath="//android.widget.LinearLayout[@content-desc=\"Posts\"]")
    public MobileElement postsTab;

    @AndroidFindBy(xpath="//android.widget.LinearLayout[@content-desc=\"Reviews\"]")
    public MobileElement reviewsTab;

    @AndroidFindBy(id="com.fdbr.android:id/buttonUpdateBeautyId")
    public MobileElement updateBeautyIdBeautyBox;

    @AndroidFindBy(id="com.fdbr.android:id/buttonMenuToolbar")
    public MobileElement settingIcon;

    /****
     setting option
     ****/
    @AndroidFindBy(id="com.fdbr.android:id/buttonEditProfile")
    public MobileElement editProfile;

    @AndroidFindBy(id="com.fdbr.android:id/buttonInviteFriends")
    public MobileElement inviteFriends;

    @AndroidFindBy(id="com.fdbr.android:id/buttonFeedback")
    public MobileElement feedback;

    @AndroidFindBy(id="com.fdbr.android:id/buttonRateOurApp")
    public MobileElement rateOurApp;

    @AndroidFindBy(id="com.fdbr.android:id/buttonPrivacyPolicy")
    public MobileElement privacyPolicy;

    @AndroidFindBy(id="com.fdbr.android:id/buttonLogOut")
    public MobileElement logout;

    /****
     edit profile
     ****/
    @AndroidFindBy(id="com.fdbr.android:id/imageBack")
    public MobileElement cancelEditprofile;

    @AndroidFindBy(id="com.fdbr.android:id/textSave")
    public MobileElement saveEditprofile;

    @AndroidFindBy(id="com.fdbr.android:id/viewChooseImage")
    public MobileElement uploadImgBtn;

    @AndroidFindBy(id="com.fdbr.android:id/layoutDob")
    public MobileElement dobEditProfile;

    @AndroidFindBy(id="com.fdbr.android:id/btn_cancel")
    public MobileElement dobCancel;

    //previous month
    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.NumberPicker[1]/android.widget.Button[1]")
    public MobileElement MonthDob;

    @AndroidFindBy(id="com.fdbr.android:id/btn_ok")
    public MobileElement dobOk;

    @AndroidFindBy(id="com.fdbr.android:id/inputName")
    public MobileElement fullnameField;

    @AndroidFindBy(id="com.fdbr.android:id/tvItemSpinner")
    public MobileElement genderField;

    @AndroidFindBy(id="//android.widget.CheckedTextView[contains(@resource-id,'android:id/text1') and @text='Female']")
    public MobileElement rbFemalePersonalInfo;

    @AndroidFindBy(xpath="//android.widget.CheckedTextView[contains(@resource-id,'android:id/text1') and @text='Male']")
    public MobileElement rbMalePersonalInfo;

    @AndroidFindBy(id="com.fdbr.android:id/layoutLocation")
    public MobileElement locationField;

    @AndroidFindBy(id="com.fdbr.android:id/inputSearch")
    public MobileElement searchLocField;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android:id/textCityName') and @text='Balikpapan']")
    public MobileElement balikpapan;

    @AndroidFindBy(id="com.fdbr.android:id/layoutUpdatePassword")
    public MobileElement changePassword;

    @AndroidFindBy(id="com.fdbr.android:id/layoutBeautyProfile")
    public MobileElement beautyProfEditProfile;

    @AndroidFindBy(id="com.fdbr.android:id/layoutBeautyProfile")
    public MobileElement concernProfEditProfile;

    @AndroidFindBy(id="com.fdbr.android:id/inputBio")
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
    @AndroidFindBy(id="com.fdbr.android:id/buttonCapture")
    public MobileElement captureBtn;

    @AndroidFindBy(id="com.fdbr.android:id/buttonBackToolbar")
    public MobileElement backArrow;

    @AndroidFindBy(id="com.fdbr.android:id/buttonRetakeToolbar")
    public MobileElement retakeBtn;

    @AndroidFindBy(id="com.fdbr.android:id/buttonDoneToolbar")
    public MobileElement doneArrow;

    /****
     change password
     ****/
    @AndroidFindBy(id="com.fdbr.android:id/inputOldPassword")
    public MobileElement oldPassField;

    @AndroidFindBy(id="com.fdbr.android:id/inputNewPassword")
    public MobileElement newPassField;

    @AndroidFindBy(id="com.fdbr.android:id/text_input_end_icon")
    public MobileElement showPassIcon;

    @AndroidFindBy(xpath="//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
    public MobileElement backArrowForgotPassScreen;


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


}
