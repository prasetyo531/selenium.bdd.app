package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;

public class LoginScreen extends ActionBase {

    @AndroidFindBy(id="com.fdbr.android.auth:id/inputEmailUsernamePhone")
    @iOSXCUITFindBy(id="Email, Username or phone number")
    public MobileElement usernameEmailField;

    @AndroidFindBy(id ="com.fdbr.android:id/textinput_error")
    public MobileElement txtWarningPhoneId;

    @AndroidFindBy(id="com.fdbr.android.auth:id/inputPassword")
    @iOSXCUITFindBy(id="id_password_login")
    public MobileElement passwordField;

    @AndroidFindBy(id="com.fdbr.android.auth:id/buttonNext")
    @iOSXCUITFindBy(id="id_next_login")
    public MobileElement nextLoginBtn;

    @AndroidFindBy(id="Navigate up")
    @iOSXCUITFindBy(id="id_back_login")
    public MobileElement backArrow;

    @AndroidFindBy(id="com.fdbr.android.auth:id/buttonChange")
    @iOSXCUITFindBy(id="id_next_login")
    public MobileElement changeBtn;

    @AndroidFindBy(id="Show password")
    @iOSXCUITFindBy(id="id_showpassword")
    public MobileElement unhidePassword;

    @AndroidFindBy(id="com.fdbr.android.auth:id/buttonForgotPassword")
    @iOSXCUITFindBy(id="id_forgotpassword")
    public MobileElement forgotPassword;

    @AndroidFindBy(id="com.fdbr.android:id/tv_message")
    public MobileElement toastMsg;

    @iOSXCUITFindBy(id="Done")
    public MobileElement doneKeyboard;

    /*  element modal login phone number and email */
    @AndroidFindBy(id="com.fdbr.android:id/textTitle")
    @iOSXCUITFindBy(id="Identify your phone number")
    public MobileElement titleModal;

    @iOSXCUITFindBy(id="id_modallogin")
    public MobileElement accountNotFoundIos;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Phone number is not registered\"]")
    public MobileElement titlePhoneNumberIsNotRegisteredIos;

    @AndroidFindBy(id="com.fdbr.android:id/textDescription")
    public MobileElement descModal;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"The username and password you entered do not match. Do you want to reset your password?\"]")
    public MobileElement usernamePasswordNotValidIos;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"The email and password you entered do not match. Do you want to reset your password?\"]")
    public MobileElement emailPasswordNotValidIos;

    @AndroidFindBy(id="com.fdbr.android:id/buttonPositive")
    public MobileElement yesBtnModal;

    @AndroidFindBy(id="com.fdbr.android:id/buttonNegative")
    public MobileElement noBtnModal;

    //String selectorUsernameEmailField = "type == 'UIAccessibilityTextFieldElement' AND value BEGINSWITH[c] 'Email, Username or phone number' AND visible == 1";

    // This is a constructor, as every page need a base driver to find android elements
    public LoginScreen(AppiumDriver driver) {

        this.driver = driver;
        //Initialize Elements of a Page class without having to use ‘FindElement‘ or ‘FindElements‘
        PageFactory.initElements(new AppiumFieldDecorator(this.driver),this);
    }

    public LoginScreen inputUsrEmailPhoneName(String usremailphonename) {
        inputValue(usernameEmailField, usremailphonename);
        return new LoginScreen(driver);
    }

    public LoginScreen inputPassword(String password) {
        inputValue(passwordField, password);
        return new LoginScreen(driver);
    }

    // ** hardcode
    public LoginScreen inputHardcodeAuth() {
        inputValue(usernameEmailField, "fixnotif");
        return new LoginScreen(driver);
    }

    public LoginScreen inputHardcodeAuthHavePost() {
        inputValue(usernameEmailField, "fixnotif");
        return new LoginScreen(driver);
    }

    public LoginScreen inputHardcodeAuthHaveReview() {
        inputValue(usernameEmailField, "testcampaign");
        return new LoginScreen(driver);
    }

    public LoginScreen inputHardcodePassword() {
        inputValue(passwordField, "test123");
        return new LoginScreen(driver);
    }

    public LoginScreen clickLogin() {
        tapByElement(nextLoginBtn);
        return new LoginScreen(driver);
    }

    /*  error msg underneath field   */
    public LoginScreen assertTextWarningLogin(String text){
        String txtWarning = txtWarningPhoneId.getText();
        Assert.assertEquals(txtWarning, text);
        return new LoginScreen(driver);
    }

    /*  action modal phone number and email */
    /*  title modal */
    public LoginScreen errorTitlePhoneNumberNotVerifiedModal() {
        isElementPresent(titleModal);
        String getTitle = titleModal.getText();
        Assert.assertEquals(getTitle,"Identify your phone number");
        return new LoginScreen(driver);
    }

    public LoginScreen errorTitleEmailDuplicateModal(){
        isElementPresent(titleModal);
        String getTitle = titleModal.getText();
        Assert.assertEquals(getTitle,"Identify your username");
        return new LoginScreen(driver);
    }

    public LoginScreen errorTitleUsernameDuplicateModal(){
        isElementPresent(titleModal);
        String getTitle = titleModal.getText();
        Assert.assertEquals(getTitle,"Identify your email");
        return new LoginScreen(driver);
    }

    public LoginScreen errorTitlePhoneNumberNotRegisteredModal() {
        isElementPresent(titleModal);
        String getTitle = titleModal.getText();
        Assert.assertEquals(getTitle,"Phone number is not registered");
        return new LoginScreen(driver);
    }

    public LoginScreen errorTitlePhoneNumberNotRegisteredModalIos() {
        isElementPresent(titlePhoneNumberIsNotRegisteredIos);
        String getTitle = titlePhoneNumberIsNotRegisteredIos.getText();
        Assert.assertEquals(getTitle,"Phone number is not registered");
        return new LoginScreen(driver);
    }

    public LoginScreen errorTitleEmailUsernameNotRegisteredModal() {
        isElementPresent(titleModal);
        String getTitle = titleModal.getText();
        Assert.assertEquals(getTitle,"Uh-oh! Account not found!");
        return new LoginScreen(driver);
    }

    public LoginScreen errorTitleEmailUsernameNotRegisteredModalIos() {
        isElementPresent(accountNotFoundIos);
        String getTitle = accountNotFoundIos.getText();
        Assert.assertTrue(getTitle.contains("Uh-oh! Account not found!"));
        return new LoginScreen(driver);
    }

    /*  content or description modal */
    public LoginScreen errorDescPhoneNumberNotVerifiedModal() {
        isElementPresent(descModal);
        String getDesc = descModal.getText();
        System.out.println(getDesc);
        Assert.assertTrue(getDesc.contains("Hi! The phone number you have entered matches this account:"));
        Assert.assertTrue(getDesc.contains("Please login with the correct email.\n" +
                "If the email does not belong to you, please create a new account."));
        return new LoginScreen(driver);
    }

    public LoginScreen errorDescEmailDuplicateModal() {
        isElementPresent(descModal);
        String getDesc = descModal.getText();
        System.out.println(getDesc);
        Assert.assertTrue(getDesc.contains("Hi! The email you have entered matches these accounts:"));
        Assert.assertTrue(getDesc.contains("Please login with the correct username."));
        return new LoginScreen(driver);
    }

    public LoginScreen errorDescPhoneNumberNotRegisteredModal() {
        isElementPresent(descModal);
        String getDesc = descModal.getText();
        System.out.println(getDesc);
        Assert.assertTrue(getDesc.contains("Create a new account with this number? +62"));
        return new LoginScreen(driver);
    }

    public LoginScreen errorDescEmailNotRegisteredModal() {
        isElementPresent(descModal);
        String getDesc = descModal.getText();
        System.out.println(getDesc);
        Assert.assertTrue(getDesc.contains("The email and password you entered do not match."));
        Assert.assertTrue(getDesc.contains("Do you want to reset your password?"));
        return new LoginScreen(driver);
    }

    public LoginScreen errorDescPasswordNotValidModal() {
        isElementPresent(descModal);
        String textInvalidPassword = descModal.getText();
        Assert.assertTrue(textInvalidPassword.contains("The username and password you entered do not match."));
        Assert.assertTrue(textInvalidPassword.contains("Do you want to reset your password?"));
        return new LoginScreen(driver);
    }

    public LoginScreen errorDescUsernamePasswordNotValidModalIos() {
        isElementPresent(usernamePasswordNotValidIos);
        String textInvalidPassword = usernamePasswordNotValidIos.getText();
        Assert.assertTrue(textInvalidPassword.contains("The username and password you entered do not match."));
        Assert.assertTrue(textInvalidPassword.contains("Do you want to reset your password?"));
        return new LoginScreen(driver);
    }

    public LoginScreen errorDescEmailPasswordNotValidModalIos() {
        isElementPresent(emailPasswordNotValidIos);
        String textInvalidPassword = emailPasswordNotValidIos.getText();
        Assert.assertTrue(textInvalidPassword.contains("The email and password you entered do not match."));
        Assert.assertTrue(textInvalidPassword.contains("Do you want to reset your password?"));
        return new LoginScreen(driver);
    }

    public LoginScreen clickLoginBtnModal() {
        tapByElement(yesBtnModal);
        return new LoginScreen(driver);
    }

    public LoginScreen clickYesBtnPhoneUnregisteredModal() {
        tapByElement(yesBtnModal);
        return new LoginScreen(driver);
    }

    public LoginScreen clickRegisterBtnModal() {
        tapByElement(noBtnModal);
        return new LoginScreen(driver);
    }

    public LoginScreen inputNewChannelToLogin(String channel) {
        usernameEmailField.clear();
        inputValue(usernameEmailField, channel);
        return new LoginScreen(driver);
    }

    //toast msg
    public LoginScreen assertToastSuspend(String text) {
        isElementPresent(toastMsg);
        String txtWarning = toastMsg.getText();
        Assert.assertTrue(txtWarning.contains(text));
        return new LoginScreen(driver);
    }
}
