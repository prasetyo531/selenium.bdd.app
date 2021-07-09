package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.List;

public class ProfileScreen extends ActionBase{

    @AndroidFindBy(id="com.fdbr.android:id/tv_message")
    public MobileElement toastMsg;

    @AndroidFindBy(xpath="//android.widget.ImageButton[@content-desc='Navigate up']")
    public MobileElement backArrow;

    @AndroidFindBy(id="com.fdbr.android.main:id/labelName")
    public MobileElement fullnameLabelProfile;

    @AndroidFindBy(id="com.fdbr.android.main:id/labelLocationAge")
    public MobileElement locationAgeLabelProfile;

    @AndroidFindBy(id="com.fdbr.android.main:id/labelBio")
    public MobileElement bioLabelProfile;

    @AndroidFindBy(id="com.fdbr.android.main:id/labelBio")
    public List<MobileElement> bioLabelProfileArray;

    @AndroidFindBy(xpath="//android.widget.LinearLayout[@content-desc=\"Posts\"]")
    public MobileElement postsTab;

    @AndroidFindBy(xpath="//android.widget.LinearLayout[@content-desc=\"Reviews\"]")
    public MobileElement reviewsTab;

    @AndroidFindBy(xpath="//android.widget.LinearLayout[@content-desc=\"Topics\"]")
    public MobileElement topicsTab;

    @AndroidFindBy(xpath="//android.widget.LinearLayout[@content-desc=\"Talks\"]")
    public MobileElement talksTab;

    @AndroidFindBy(id="com.fdbr.android.main:id/setting")
    public MobileElement settingIcon;

    @AndroidFindBy(id="com.fdbr.android.main:id/buttonFollow")
    public MobileElement btnFollow;

    @AndroidFindBy(id="com.fdbr.android:id/buttonAction")
    public MobileElement btnAddPostReviewProfile;

    @AndroidFindBy(xpath="//android.widget.Button[contains(@resource-id, 'com.fdbr.android:id/buttonAction')]")
    public List<MobileElement> buttonAddPostReviewProfile;

    /* drawer beauty id */
    @AndroidFindBy(id="com.fdbr.android.main:id/buttonUpdateBeautyId")
    public MobileElement updateBeautyIdBeautyBox;

    @AndroidFindBy(id="com.fdbr.android:id/buttonAction")
    public MobileElement completeMyBeautyIdDrawer;

    /* review or post list */
    @AndroidFindBy(id="com.fdbr.android.main:id/labelProductName")
    public List<MobileElement> listProductReviewsProfile;

    @AndroidFindBy(xpath="//android.widget.ImageView[contains(@resource-id, 'com.fdbr.android.main:id/imagePhoto') and @index='0']")
    public MobileElement firstPostProfile;

    @AndroidFindBy(id="com.fdbr.android.main:id/imagePhoto")
    public MobileElement listPhotoReviewsProfile;

    @AndroidFindBy(id="com.fdbr.android.main:id/buttonQrCode")
    public MobileElement drawerQRCode;

    @AndroidFindBy(id="com.fdbr.android.main:id/buttonInviteFriend")
    public MobileElement drawerInviteFriends;

    @AndroidFindBy(id="com.fdbr.android.main:id/buttonSettings")
    public MobileElement drawerSetting;

    @AndroidFindBy(id="com.fdbr.android.main:id/buttonSupport")
    public MobileElement drawerSupport;

    /**** setting list option ****/
    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android.setting:id/textTitle') and @text='Profile']")
    public MobileElement editProfile;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android.setting:id/textTitle') and @text='Account']")
    public MobileElement editAccount;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android.setting:id/textTitle') and @text='Beauty ID']")
    public MobileElement editBeautyID;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android.setting:id/textSub') and @text='Log Out']")
    public MobileElement Logout;

    /**** edit account list option ****/
    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]")
    public MobileElement listFullname;

    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]")
    public MobileElement listPhoneNumber;

    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]")
    public MobileElement listEmail;

    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout")
    public MobileElement listChangePassword;

    /**** edit account ****/
    @AndroidFindBy(id="com.fdbr.android.main:id/inputFullname")
    public MobileElement fullnameField;

    @AndroidFindBy(id="com.fdbr.android.main:id/labelChangePassword")
    public MobileElement changePassword;

    //@AndroidFindBy(id="com.fdbr.android.main:id/textStatusEmail")
    @AndroidFindBy(xpath="//android.widget.TextView[@content-desc='textStatusEmail']")
    public MobileElement labelVerifyEmail;

    //@AndroidFindBy(id="com.fdbr.android.main:id/textStatusPhone")
    @AndroidFindBy(xpath="//android.widget.TextView[@content-desc='textStatusPhone']")
    public MobileElement labelVerifyPhone;

    @AndroidFindBy(xpath="//android.view.ViewGroup[contains(@resource-id, 'com.fdbr.android.main:id/layoutItem') and @index='2']")
    public MobileElement changeEmail;

    @AndroidFindBy(xpath="//android.view.ViewGroup[contains(@resource-id, 'com.fdbr.android.main:id/layoutItem') and @index='1']")
    public MobileElement changePhone;

    @AndroidFindBy(id="com.fdbr.android.beauty:id/inputEmail")
    public MobileElement fieldEmail;

    @AndroidFindBy(id="com.fdbr.android.beauty:id/inputPhone")
    public MobileElement fieldPhone;

    @AndroidFindBy(id="com.fdbr.android.beauty:id/buttonVerifyEmail")
    public MobileElement btnVerifyEmailProfile;

    @AndroidFindBy(id="com.fdbr.android.beauty:id/buttonVerifyPhone")
    public MobileElement btnVerifyPhoneProfile;

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

    /**** edit profile ****/
    @AndroidFindBy(xpath="//android.widget.ImageButton[@content-desc='Navigate up']")
    public MobileElement cancelEditprofile;

    @AndroidFindBy(id="com.fdbr.android.main:id/buttonSave")
    public MobileElement saveEditprofile;

    @AndroidFindBy(id="com.fdbr.android.main:id/viewChooseImage")
    public MobileElement uploadImgBtn;

    @AndroidFindBy(id="com.fdbr.android.main:id/layoutDob")
    public MobileElement dobEditProfile;

    @AndroidFindBy(id="com.fdbr.android.main:id/inputDob")
    public MobileElement inputedDob;

    @AndroidFindBy(xpath="//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
    public MobileElement editCancel;

    //previous month
    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.NumberPicker[1]/android.widget.Button[1]")
    public MobileElement MonthDob;

    @AndroidFindBy(id="com.fdbr.android:id/btn_cancel")
    public MobileElement dobCancel;

    @AndroidFindBy(id="com.fdbr.android:id/btn_ok")
    public MobileElement dobOk;

    @AndroidFindBy(id="com.fdbr.android.main:id/tvItemSpinner")
    public MobileElement genderField;

    @AndroidFindBy(id="com.fdbr.android.main:id/radioFemale")
    public MobileElement rbFemalePersonalInfo;

    @AndroidFindBy(id="com.fdbr.android.main:id/radioMale")
    public MobileElement rbMalePersonalInfo;

    @AndroidFindBy(id="com.fdbr.android.main:id/layoutLocation")
    public MobileElement locationField;

    @AndroidFindBy(id="com.fdbr.android.main:id/inputBio")
    public MobileElement fieldBio;

    //location screen
    @AndroidFindBy(id="com.fdbr.android:id/toolbarSearch")
    public MobileElement searchLocField;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android.main:id/textCityName') and @text='Ambon']")
    public MobileElement ambon;

    //drawer
    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android.setting:id/labelAction') and @text='Invite Friends']")
    public MobileElement inviteFriends;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android.setting:id/labelAction') and @text='Feedback']")
    public MobileElement feedback;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android.setting:id/labelAction') and @text='Rate Our App']")
    public MobileElement rateOurApp;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android.setting:id/labelAction') and @text='Privacy Policy']")
    public MobileElement privacyPolicy;

    /**** beauty id ****/
    /***  beauty profile screen  ***/
    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android:id/toolbarTitle') and @text='Beauty ID']")
    public MobileElement titleBeautyIDScreen;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android.beauty:id/textInfoBeautyProfile') and @text='Please complete your beauty profile']")
    public MobileElement labelCompleteBeautyProfile;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android.beauty:id/textInfoBeautyProfile') and @text='Please complete your beauty profile']")
    public List<MobileElement> labelCompleteBeautyProfileEmpty;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android.beauty:id/textInfoBeautyConcern') and @text='Please complete your beauty concern']")
    public MobileElement labelCompleteBeautyConcern;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android.beauty:id/textInfoBeautyConcern') and @text='Please complete your beauty concern']")
    public List<MobileElement> labelCompleteBeautyConcernEmpty;

    @AndroidFindBy(id="com.fdbr.android.beauty:id/textEditBeautyProfile")
    public MobileElement editBeautyProf;

    @AndroidFindBy(id="com.fdbr.android.beauty:id/textEditBeautyConcern")
    public MobileElement editBeautyCon;

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

    /* inputed value profile and concern */
    @AndroidFindBy(id="com.fdbr.android.beauty:id/inputSkinType")
    public MobileElement valueSkinType;

    @AndroidFindBy(id="com.fdbr.android.beauty:id/inputSkinTone")
    public MobileElement valueSkinTone;

    @AndroidFindBy(id="com.fdbr.android.beauty:id/inputSkinUndertone")
    public MobileElement valueSkinUndertone;

    @AndroidFindBy(id="com.fdbr.android.beauty:id/inputHairType")
    public MobileElement valueHairType;

    @AndroidFindBy(id="com.fdbr.android.beauty:id/inputColoredHair")
    public MobileElement valueColoredHair;

    @AndroidFindBy(id="com.fdbr.android.beauty:id/inputHijaber")
    public MobileElement valueIsHijab;

    /* beauty concern screen */
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

    @AndroidFindBy(id="com.fdbr.android:id/buttonLeftCustom")
    public MobileElement retakeBtn;

    @AndroidFindBy(id="com.fdbr.android:id/buttonRightCustom")
    public MobileElement doneArrow;

    /**** change password ****/
    @AndroidFindBy(id="com.fdbr.android.auth:id/inputOldPassword")
    public MobileElement oldPassField;

    @AndroidFindBy(id="com.fdbr.android.auth:id/inputNewPassword")
    public MobileElement newPassField;

    @AndroidFindBy(id="com.fdbr.android.auth:id/inputConfirmPassword")
    public MobileElement confirmNewPassField;

    @AndroidFindBy(id="com.fdbr.android.auth:id/text_input_end_icon")
    public MobileElement showPassIcon;

    @AndroidFindBy(id="com.fdbr.android.auth:id/buttonSubmit")
    public MobileElement submitBtn;

    @AndroidFindBy(xpath="//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
    public MobileElement backArrowForgotPassScreen;

    @AndroidFindBy(id="com.fdbr.android:id/snackbar_text")
    public MobileElement sneakbarChangePassword;

    /***** Talk ****/
    @AndroidFindBy(id="com.fdbr.android.main:id/listItems")
    public MobileElement topicTalkList;

    @AndroidFindBy(xpath="//android.view.ViewGroup[contains(@resource-id, 'com.fdbr.android.main:id/itemMenuParent') and @index='0']")
    public MobileElement firstTopicTalkProfile;
    
    @AndroidFindBy(id = "com.fdbr.android.talk:id/buttonMore")
    public MobileElement buttonSeeMore;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, 'com.fdbr.android:id/textValue') and @index='0']")
    public MobileElement buttonEditTopic;

    @AndroidFindBy(id = "com.fdbr.android.talk:id/inputTitle")
    public MobileElement fieldTopicTitle;

    @AndroidFindBy(id = "com.fdbr.android.talk:id/inputDescription")
    public MobileElement fieldTopicDesc;

    /*@AndroidFindBy(xpath="//android.view.View[@content-desc=Remove kombinasi]")
    public MobileElement t*//*agOne;*/
    
    @AndroidFindBy(id ="Remove kombinasi")
    public MobileElement tagHardCode;

    @AndroidFindBy(id = "com.fdbr.android.talk:id/buttonSubmit")
    public MobileElement buttonSubmitTopic;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android:id/textDescription') and @index='0']")
    public MobileElement descErrorEditTitleTopic;
    
    @AndroidFindBy(id= "com.fdbr.android:id/buttonNegative")
    public MobileElement btnOkModal;

    @AndroidFindBy(id="com.fdbr.android.main:id/layoutBeautyProfile")
    public MobileElement updateBeautyProfile;

    @AndroidFindBy(id="com.fdbr.android.main:id/layoutBeautyConcern")
    public MobileElement updateBeautyConcern;

    // This is a constructor, as every page need a base driver to find android elements
    public ProfileScreen(AppiumDriver driver) {

        this.driver = driver;
        //Initialize Elements of a Page class without having to use ‘FindElement‘ or ‘FindElements‘
        PageFactory.initElements(new AppiumFieldDecorator(this.driver),this);
    }

    public ProfileScreen clickReviewsTab() {
        WaitUntilElementIsVisible(reviewsTab);
        tapByElement(reviewsTab);
        return new ProfileScreen(driver);
    }

    public ProfileScreen clickPostsTab() {
        WaitUntilElementIsVisible(postsTab);
        tapByElement(postsTab);
        return new ProfileScreen(driver);
    }

    public ProfileScreen clickTopicTab() {
        WaitUntilElementIsVisible(topicsTab);
        verticalSwipeByPercentagesDirectly(891,752,862, 2452);
        tapByElement(topicsTab);
        return new ProfileScreen(driver);
    }

    public ProfileScreen clickTalkTab() {
        WaitUntilElementIsVisible(talksTab);
        verticalSwipeByPercentagesDirectly(891,752,862, 2452);
        tapByElement(talksTab);
        return new ProfileScreen(driver);
    }

    public ProfileScreen clickBeautyIdOnBeautyBox() {
        WaitUntilElementIsVisible(updateBeautyIdBeautyBox);
        tapByElement(updateBeautyIdBeautyBox);

        WaitUntilElementIsVisible(completeMyBeautyIdDrawer);
        tapByElement(completeMyBeautyIdDrawer);
        return new ProfileScreen(driver);
    }

    public ProfileScreen clickSettingProfile() {
        isElementPresent(settingIcon);
        tapByElement(settingIcon);
        return new ProfileScreen(driver);
    }

    public ProfileScreen clickDrawerSetting() {
        WaitUntilElementIsVisible(drawerSetting);
        tapByElement(drawerSetting);
        return new ProfileScreen(driver);
    }

    public ProfileScreen getTextFullname(String fullname) {
        WaitUntilElementIsVisible(fullnameLabelProfile);
        String fn = fullnameLabelProfile.getText();
        org.testng.Assert.assertEquals(fn, fullname);
        return new ProfileScreen(driver);
    }

    public ProfileScreen isToastAppear() {
        WaitUntilElementIsVisible(toastMsg);
        String fn = toastMsg.getText();
        org.testng.Assert.assertEquals(fn, "Successfully updated full name");
        return new ProfileScreen(driver);
    }

    /* setting list  */
    public ProfileScreen clickEditAccount() {
        WaitUntilElementIsVisible(editAccount);
        tapByElement(editAccount);
        return new ProfileScreen(driver);
    }

    public ProfileScreen clickEditProfile() {
        WaitUntilElementIsVisible(editProfile);
        tapByElement(editProfile);
        return new ProfileScreen(driver);
    }

    public ProfileScreen clickBackSetting() {
        WaitUntilElementIsVisible(backArrow);
        tapByElement(backArrow);
        return new ProfileScreen(driver);
    }

    public ProfileScreen clickEditBeautyId() {
        WaitUntilElementIsVisible(editBeautyID);
        tapByElement(editBeautyID);
        return new ProfileScreen(driver);
    }

    /* beauty id menu */
    public ProfileScreen isOnBeautyIdScreen() {
        WaitUntilElementIsVisible(titleBeautyIDScreen);
        return new ProfileScreen(driver);
    }

    public ProfileScreen isEmptyBeautyIdScreen() {
        WaitUntilElementIsVisible(labelCompleteBeautyProfile);
        WaitUntilElementIsVisible(labelCompleteBeautyConcern);
        return new ProfileScreen(driver);
    }

    public ProfileScreen clickEditBeautyProfile() {
        WaitUntilElementIsVisible(editBeautyProf);
        tapByElement(editBeautyProf);
        return new ProfileScreen(driver);
    }

    public ProfileScreen clickEditBeautyConcern() {
        WaitUntilElementIsVisible(editBeautyCon);
        tapByElement(editBeautyCon);
        return new ProfileScreen(driver);
    }

    public ProfileScreen islabelCompleteBeautyProfileDissapear() {
        WaitUntilElementIsVisible(titleBeautyIDScreen);
        List<MobileElement> bp = labelCompleteBeautyProfileEmpty;
        System.out.println("after beauty profile completed"+" "+bp.size());
        Boolean isdissapear = bp.isEmpty();
        System.out.println(isdissapear);
        //it depends screen size
        if(isdissapear==false){
            org.testng.Assert.fail("label Complete Beauty Profile Still Exist");
        }
        return new ProfileScreen(driver);
    }

    public ProfileScreen islabelCompleteBeautyConcernDissapear() {
        WaitUntilElementIsVisible(titleBeautyIDScreen);
        List<MobileElement> bc = labelCompleteBeautyConcernEmpty;
        System.out.println("after beauty profile completed"+" "+bc.size());
        Boolean isdissapear = bc.isEmpty();
        System.out.println(isdissapear);
        //it depends screen size
        if(isdissapear==false){
            org.testng.Assert.fail("label Complete Beauty Concern Still Exist");
        }
        return new ProfileScreen(driver);
    }

    /* account menu */
    public ProfileScreen inputFullname(String fullname) {
        WaitUntilElementIsVisible(listFullname);
        tapByElement(listFullname);

        WaitUntilElementIsVisible(fullnameField);
        inputValue(fullnameField, fullname);
        return new ProfileScreen(driver);
    }

    /* verify from profile */
    public ProfileScreen clickVerifyEmail() {
        isElementPresent(labelVerifyEmail);
        tapByElement(labelVerifyEmail);
        return new ProfileScreen(driver);
    }

    public ProfileScreen clickVerifyPhone() {
        isElementPresent(labelVerifyPhone);
        tapByElement(labelVerifyPhone);
        return new ProfileScreen(driver);
    }

    public ProfileScreen checkLabelVerifiedEmail() {
        String lb1 = labelVerifyEmail.getText();
        Assert.assertEquals("Verified", lb1);
        return new ProfileScreen(driver);
    }

    public ProfileScreen checkLabelVerifiedPhone() {
        String lb2 = labelVerifyPhone.getText();
        Assert.assertEquals("Verified", lb2);
        return new ProfileScreen(driver);
    }

    public ProfileScreen tapToChangeEmailProfile(String email) {
        isElementPresent(changeEmail);
        tapByElement(changeEmail);

        isElementPresent(fieldEmail);
        inputValue(fieldEmail, email);

        return new ProfileScreen(driver);
    }

    public ProfileScreen tapToChangePhoneProfile(String phone) {
        isElementPresent(changePhone);
        tapByElement(changePhone);

        isElementPresent(fieldPhone);
        inputValue(fieldPhone, phone);

        return new ProfileScreen(driver);
    }

    public ProfileScreen confirmChangeVerifyEmail() {
        tapByElement(btnVerifyEmailProfile);
        return new ProfileScreen(driver);
    }

    public ProfileScreen confirmChangeVerifyPhone() {
        tapByElement(btnVerifyPhoneProfile);
        return new ProfileScreen(driver);
    }

    /***  modal confirmation password  ***/
    public ProfileScreen inputPasswordToChangeEmailProfile() {
        isElementPresent(titleModalPassword);
        inputValue(fieldPassword, "test123");
        tapByElement(btnConfirmPassword);
        return new ProfileScreen(driver);
    }

    public ProfileScreen inputPasswordToChangePhoneProfile() {
        isElementPresent(titleModalPassword);
        inputValue(fieldPassword, "test123");
        tapByElement(btnConfirmPassword);
        return new ProfileScreen(driver);
    }

    /*  edit profile screen */
    public ProfileScreen clickSaveProfile() {
        WaitUntilElementIsVisible(saveEditprofile);
        tapByElement(saveEditprofile);

        WaitUntilElementIsVisible(editProfile);
        return new ProfileScreen(driver);
    }

    public ProfileScreen clickCancelEditProfile() {
        WaitUntilElementIsVisible(cancelEditprofile);
        tapByElement(cancelEditprofile);
        return new ProfileScreen(driver);
    }

    public ProfileScreen editDobToPreviousMonth() {
        WaitUntilElementIsVisible(dobEditProfile);
        tapByElement(dobEditProfile);

        WaitUntilElementIsVisible(MonthDob);
        tapByElement(MonthDob);

        tapByElement(dobOk);
        return new ProfileScreen(driver);
    }

    public ProfileScreen chooseFemaleGender() {
        tapByElement(genderField);
        WaitUntilElementIsVisible(rbFemalePersonalInfo);
        tapByElement(rbFemalePersonalInfo);
        return new ProfileScreen(driver);
    }

    public ProfileScreen chooseMaleGender() {
        WaitUntilElementIsVisible(rbMalePersonalInfo);
        tapByElement(rbMalePersonalInfo);
        return new ProfileScreen(driver);
    }

    public ProfileScreen chooseLocationEditProfile() {
        tapByElement(locationField);
        WaitUntilElementIsVisible(ambon);
        tapByElement(ambon);
        return new ProfileScreen(driver);
    }

    public ProfileScreen inputBio(String bio) {
        WaitUntilElementIsVisible(fieldBio);
        inputValue(fieldBio, bio);
        return new ProfileScreen(driver);
    }

    /* choose beauty id */
    public ProfileScreen clickUpdateBeautyProfile() {
        WaitUntilElementIsVisible(fullnameField);
        this.verticalSwipeByPercentages(fullnameField,0.4,0.01,0.5,500);

        tapByElement(updateBeautyProfile);
        return new ProfileScreen(driver);
    }

    public ProfileScreen clickUpdateBeautyConcern() {
        isElementPresent(fullnameField);
        this.verticalSwipeByPercentages(fullnameField,0.4,0.01,0.5,500);

        tapByElement(updateBeautyConcern);
        return new ProfileScreen(driver);
    }

    /* choose beauty profile */
    public ProfileScreen chooseSkinType() {
        tapByElement(skinTypeCombination);
        return new ProfileScreen(driver);
    }

    public ProfileScreen chooseSkinTone() {
        tapByElement(skinToneDark);
        return new ProfileScreen(driver);
    }

    public ProfileScreen chooseSkinUndertone() {
        this.verticalSwipeByPercentages(skinUnderToneWarm,0.4,0.01,0.5,500);
        tapByElement(skinUnderToneWarm);
        return new ProfileScreen(driver);
    }

    public ProfileScreen chooseHairType() {
        this.verticalSwipeByPercentages(hairTypeCurly,0.4,0.01,0.5,500);
        tapByElement(hairTypeCurly);
        return new ProfileScreen(driver);
    }

    public ProfileScreen chooseColoredHair() {
        tapByElement(coloredHairNo);
        return new ProfileScreen(driver);
    }

    public ProfileScreen chooseHijaber() {
        this.verticalSwipeByPercentages(isHijaberNo,0.4,0.01,0.5,500);
        tapByElement(isHijaberNo);
        return new ProfileScreen(driver);
    }

    public ProfileScreen clickSaveBeautyProf() {
        tapByElement(buttonSaveBeautyProfile);
        return new ProfileScreen(driver);
    }

    /* choose beauty concern */
    public ProfileScreen chooseSkinCon() {

        isElementPresent(contentScreenBodyCon);
        tapByElement(blackOrWhite);
        return new ProfileScreen(driver);
    }

    public ProfileScreen chooseBodyCon() {
        verticalSwipeByPercentages(contentScreenBodyCon, 0.8,0.01,0.5,500);
        isElementPresent(looseSkin);
        tapByElement(looseSkin);
        return new ProfileScreen(driver);
    }

    public ProfileScreen chooseHairCon() {
        isElementPresent(greyHair);
        tapByElement(greyHair);
        return new ProfileScreen(driver);
    }

    public ProfileScreen clickSaveBeautyCon() {
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
    public ProfileScreen getTextDob() {
        isElementPresent(dobEditProfile);
        String getDob = dobEditProfile.getText();
        System.out.println("dob is"+" "+getDob);
        Assert.assertNotSame(null, getDob);
        return new ProfileScreen(driver);
    }

    public ProfileScreen getFullnameEditProfile(String fullname) {
        isElementPresent(fullnameField);
        String getFullname = fullnameField.getText();
        System.out.println("fullname is"+" "+getFullname);
        Assert.assertEquals(fullname, getFullname);
        return new ProfileScreen(driver);
    }

    public ProfileScreen getLocationEditProfile() {
        WaitUntilElementIsVisible(locationAgeLabelProfile);

        String getLoc = locationAgeLabelProfile.getText();
        System.out.println("loc is"+" "+getLoc);
        Assert.assertNotSame(null, getLoc);
        return new ProfileScreen(driver);
    }

    public ProfileScreen getTextBio(String txt) {
        isElementPresent(bioLabelProfile);
        String getBio = bioLabelProfile.getText();
        System.out.println("dobiob is"+" "+getBio);
        Assert.assertEquals(txt, getBio);
        return new ProfileScreen(driver);
    }

    public ProfileScreen getTextEmptyDob() {
        isElementPresent(dobEditProfile);
        String getDob = dobEditProfile.getText();
        System.out.println("dob is"+" "+getDob);
        Assert.assertSame(null, getDob);
        return new ProfileScreen(driver);
    }

    public ProfileScreen getFullnameEmptyEditProfile() {
        isElementPresent(fullnameField);
        String getFullname = fullnameField.getText();
        System.out.println("fullname is"+" "+getFullname);
        Assert.assertSame(null, getFullname);
        return new ProfileScreen(driver);
    }

    public ProfileScreen getLocationEmptyEditProfile() {
        WaitUntilElementIsVisible(locationAgeLabelProfile);
        String getLoc = locationAgeLabelProfile.getText();
        System.out.println("loc is"+" "+getLoc);
        Boolean check = getLoc.contains(",");
        if(check==Boolean.TRUE){
            org.testng.Assert.fail("location should empty");
        }
        return new ProfileScreen(driver);
    }

    public ProfileScreen isBioNotAppear() {
        WaitUntilElementIsVisible(postsTab);
        Boolean bio = driver.findElements(By.id("com.fdbr.android.main:id/labelBio")).isEmpty();
        System.out.println(bio);
        if(bio==false){
            org.testng.Assert.fail("bio should not appear on profile if empty ");
        }
        return new ProfileScreen(driver);
    }

    public ProfileScreen findToastAfterUpdateBeautyProfile() {
        //its not check text equals expected text
        toastMatches("Beauty Profile Updated", false);
        return new ProfileScreen(driver);
    }

    public ProfileScreen findToastAfterUpdateBeautyConcern() {
        //its not check text equals expected text
        toastMatches("Beauty Concern Updated", false);
        return new ProfileScreen(driver);
    }

    public ProfileScreen clickBackOnChangeEmailPhoneScreen() {
        isElementPresent(backArrow);
        tapByElement(backArrow);
        return new ProfileScreen(driver);
    }

    /*   change password   */
    public ProfileScreen clickChangePassword() {
        WaitUntilElementIsVisible(listChangePassword);
        tapByElement(listChangePassword);
        return new ProfileScreen(driver);
    }

    public ProfileScreen inputOldPassword(String oldpass) {
        isElementPresent(oldPassField);
        inputValue(oldPassField, oldpass);
        return new ProfileScreen(driver);
    }

    public ProfileScreen inputNewPassword(String newpass) {
        isElementPresent(newPassField);
        inputValue(newPassField, newpass);
        return new ProfileScreen(driver);
    }

    public ProfileScreen inputConfirmNewPassword(String confirmnewpass) {
        isElementPresent(confirmNewPassField);
        inputValue(confirmNewPassField, confirmnewpass);
        return new ProfileScreen(driver);
    }

    public ProfileScreen clickSubmitChangePassword() {
        isElementPresent(submitBtn);
        tapByElement(submitBtn);
        return new ProfileScreen(driver);
    }

    public ProfileScreen getSneakMsgOldPassword(String text) {
        isElementPresent(toastMsg);
        String msg = toastMsg.getText();
        Assert.assertEquals(text, msg);
        return new ProfileScreen(driver);
    }

    /* review */
    public ProfileScreen clickRandomReviewListProfile() {
        this.verticalSwipeByPercentages(listPhotoReviewsProfile, 0.4,0.01,0.5,500);
        isElementPresent(listPhotoReviewsProfile);
        clickRandomMenus(listProductReviewsProfile);
        return new ProfileScreen(driver);
    }

    /* post */
    public ProfileScreen clickFirstPostProfile() {
        this.verticalSwipeByPercentages(postsTab, 0.4,0.01,0.5,500);
        isElementPresent(firstPostProfile);
        tapByElement(firstPostProfile);
        return new ProfileScreen(driver);
    }

    /* topic */
    public ProfileScreen clickFirstTopicListProfile()  {
        WaitUntilElementIsVisible(topicTalkList);
        verticalSwipeByPercentagesDirectly(609,1843,604, 996);
        WaitUntilElementIsVisible(firstTopicTalkProfile);
        isElementPresent(firstTopicTalkProfile);
        tapByElement(firstTopicTalkProfile);
        return new ProfileScreen(driver);
    }

    /* edit topic */
    public ProfileScreen clickBtnSeeMore() {
        tapByElement(buttonSeeMore);
        return new ProfileScreen(driver);
    }
    
    public ProfileScreen clickBtnEditTopic() {
        tapByElement(buttonEditTopic);
        return new ProfileScreen(driver);
    }

    public ProfileScreen deleteTopicTitle() {
        fieldTopicTitle.clear();
        return new ProfileScreen(driver);
    }

    public ProfileScreen deleteTopicDesc() {
        isElementPresent(fieldTopicDesc);
        tapByElement(fieldTopicDesc);
        fieldTopicDesc.clear();
        return new ProfileScreen(driver);
    }

    public ProfileScreen deleteTopicTags() {
        isElementPresent(tagHardCode);
        tapByElement(tagHardCode);
        return new ProfileScreen(driver);
    }

    public ProfileScreen submitTopic() {
        tapByElement(buttonSubmitTopic);
        return new ProfileScreen(driver);
    }

    public TalkScreen getErrorEditTitleTopic() {
        isElementEnabled(descErrorEditTitleTopic);
        String desc = descErrorEditTitleTopic.getText();
        Assert.assertEquals("Whoops! We need you to tell us more to start the topic. Please enter title at least 15 characters.", desc);
        tapByElement(btnOkModal);
        return new TalkScreen(driver);
    }

    public TalkScreen getErrorErrorEditDescTopic() {
        isElementEnabled(descErrorEditTitleTopic);
        String desc = descErrorEditTitleTopic.getText();
        Assert.assertEquals("Whoops! We need you to tell us more to start the topic. You need at least 100 characters to submit this", desc);
        tapByElement(btnOkModal);
        return new TalkScreen(driver);
    }

    public TalkScreen getErrorRemoveTagsTopic() {
        isElementEnabled(descErrorEditTitleTopic);
        String desc = descErrorEditTitleTopic.getText();
        Assert.assertEquals("Whoops! We need you to tell us more to start the topic. You need at least 1 tag", desc);
        tapByElement(btnOkModal);
        return new TalkScreen(driver);
    }

    /* talk */
    public ProfileScreen clickFirstTalkListProfile() {
        WaitUntilElementIsVisible(topicTalkList);
        verticalSwipeByPercentagesDirectly(609,1843,604, 996);
        WaitUntilElementIsVisible(firstTopicTalkProfile);
        isElementPresent(firstTopicTalkProfile);
        tapByElement(firstTopicTalkProfile);
        return new ProfileScreen(driver);
    }
    
    /* follow user from profile */
    public ProfileScreen followUserFromProfile() {
        WaitUntilElementIsVisible(btnFollow);
        tapByElement(btnFollow);
        return new ProfileScreen(driver);
    }

    public ProfileScreen checkButtonAfterFollow() {
        isElementPresent(btnFollow);
        String getValue = btnFollow.getText();
        org.testng.Assert.assertEquals(getValue, "Following");
        System.out.println(getValue);
        return new ProfileScreen(driver);
    }

    public ProfileScreen isButtonAddPostReviewAppear() {
        WaitUntilElementIsVisible(btnAddPostReviewProfile);
        return new ProfileScreen(driver);
    }

    public ProfileScreen clickButtonAddPostReviewAppear() {
        WaitUntilElementIsVisible(btnAddPostReviewProfile);
        tapByElement(btnAddPostReviewProfile);
        return new ProfileScreen(driver);
    }

    public ProfileScreen isButtonAddPostReviewDissappear() {
        WaitUntilElementIsVisible(firstPostProfile);
        Boolean fol = buttonAddPostReviewProfile.isEmpty();
        System.out.println(fol);
        //it depends screen size
        if(fol==false){
            org.testng.Assert.fail("follow btn still appear");
        }
        return new ProfileScreen(driver);
    }

    public void verifyCompletedDataBeautyId() {

        String getTxtSkinType = valueSkinType.getText();
        String getTxtSkinTone  = valueSkinTone.getText();
        String getTxtSkinUndertone = valueSkinUndertone.getText();
        String getTxtHairType = valueHairType.getText();
        String getTxtIsHijab = valueIsHijab.getText();

        Boolean ck1= getTxtSkinType.contains("[^-]+");
        Boolean ck2= getTxtSkinTone.contains("[^-]+");
        Boolean ck3= getTxtSkinUndertone.contains("[^-]+");
        Boolean ck4= getTxtHairType.contains("[^-]+");
        Boolean ck5= getTxtIsHijab.contains("[^-]+");

        if(ck1 || ck2 || ck3 || ck4 || ck5 ==true){
            Assert.fail("beauty profile not updated");
        }
    }
}
