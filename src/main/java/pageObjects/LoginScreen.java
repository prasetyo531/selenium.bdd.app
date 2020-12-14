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
    public LoginScreen(AppiumDriver driver) throws IOException {

        this.driver = driver;
        //Initialize Elements of a Page class without having to use ‘FindElement‘ or ‘FindElements‘
        PageFactory.initElements(new AppiumFieldDecorator(this.driver),this);
    }

    public void inputUsrEmailPhoneName(String usremailphonename) {

        inputValue(usernameEmailField, usremailphonename);
    }

    public void inputPassword(String password) {

        inputValue(passwordField, password);
    }

    // ** hardcode
    public void inputHardcodeAuth() {

        inputValue(usernameEmailField, "putwid");
    }

    public void inputHardcodePassword() {

        inputValue(passwordField, "123tester");
    }
    // hardcode **
    public LoginScreen clickLogin() throws IOException {

        tapByElement(nextLoginBtn);
        return new LoginScreen(driver);
    }

    /*  error msg underneath field   */
    public void assertTextWarningLogin(String text){

        String txtWarning = txtWarningPhoneId.getText();
        Assert.assertEquals(txtWarning, text);
    }

    /*  action modal phone number and email */
    /*  title modal */
    public LoginScreen errorTitlePhoneNumberNotVerifiedModal() throws IOException {

        isElementPresent(titleModal);
        String getTitle = titleModal.getText();
        Assert.assertEquals(getTitle,"Identify your phone number");
        return new LoginScreen(driver);
    }

    public void errorTitleEmailDuplicateModal(){

        isElementPresent(titleModal);
        String getTitle = titleModal.getText();
        Assert.assertEquals(getTitle,"Identify your username");
    }

    public void errorTitleUsernameDuplicateModal(){

        isElementPresent(titleModal);
        String getTitle = titleModal.getText();
        Assert.assertEquals(getTitle,"Identify your email");
    }

    public LoginScreen errorTitlePhoneNumberNotRegisteredModal() throws IOException {

        isElementPresent(titleModal);
        String getTitle = titleModal.getText();
        Assert.assertEquals(getTitle,"Phone number is not registered");
        return new LoginScreen(driver);
    }

    public LoginScreen errorTitlePhoneNumberNotRegisteredModalIos() throws IOException {

        isElementPresent(titlePhoneNumberIsNotRegisteredIos);
        String getTitle = titlePhoneNumberIsNotRegisteredIos.getText();
        Assert.assertEquals(getTitle,"Phone number is not registered");
        return new LoginScreen(driver);
    }

    public LoginScreen errorTitleEmailUsernameNotRegisteredModal() throws IOException {

        isElementPresent(titleModal);
        String getTitle = titleModal.getText();
        Assert.assertEquals(getTitle,"Uh-oh! Account not found!");
        return new LoginScreen(driver);
    }

    public LoginScreen errorTitleEmailUsernameNotRegisteredModalIos() throws IOException {

        isElementPresent(accountNotFoundIos);
        String getTitle = accountNotFoundIos.getText();
        Assert.assertTrue(getTitle.contains("Uh-oh! Account not found!"));
        return new LoginScreen(driver);
    }

    /*  content or description modal */
    public LoginScreen errorDescPhoneNumberNotVerifiedModal() throws IOException {

        isElementPresent(descModal);
        String getDesc = descModal.getText();
        System.out.println(getDesc);
        Assert.assertTrue(getDesc.contains("Hi! The phone number you have entered matches this account:"));
        Assert.assertTrue(getDesc.contains("Please login with the correct email.\n" +
                "If the email does not belong to you, please create a new account."));

        return new LoginScreen(driver);
    }

    public LoginScreen errorDescEmailDuplicateModal() throws IOException {

        isElementPresent(descModal);
        String getDesc = descModal.getText();
        System.out.println(getDesc);
        Assert.assertTrue(getDesc.contains("Hi! The email you have entered matches these accounts:"));
        Assert.assertTrue(getDesc.contains("Please login with the correct username."));

        return new LoginScreen(driver);
    }

    public LoginScreen errorDescPhoneNumberNotRegisteredModal() throws IOException {

        isElementPresent(descModal);
        String getDesc = descModal.getText();
        System.out.println(getDesc);
        Assert.assertTrue(getDesc.contains("Create a new account with this number? +62"));

        return new LoginScreen(driver);
    }

    public LoginScreen errorDescEmailNotRegisteredModal() throws IOException {

        isElementPresent(descModal);
        String getDesc = descModal.getText();
        System.out.println(getDesc);
        Assert.assertTrue(getDesc.contains("The email and password you entered do not match."));
        Assert.assertTrue(getDesc.contains("Do you want to reset your password?"));

        return new LoginScreen(driver);
    }

    public LoginScreen errorDescPasswordNotValidModal() throws IOException {

        isElementPresent(descModal);
        String textInvalidPassword = descModal.getText();
        Assert.assertTrue(textInvalidPassword.contains("The username and password you entered do not match."));
        Assert.assertTrue(textInvalidPassword.contains("Do you want to reset your password?"));

        return new LoginScreen(driver);
    }

    public LoginScreen errorDescUsernamePasswordNotValidModalIos() throws IOException {

        isElementPresent(usernamePasswordNotValidIos);
        String textInvalidPassword = usernamePasswordNotValidIos.getText();
        Assert.assertTrue(textInvalidPassword.contains("The username and password you entered do not match."));
        Assert.assertTrue(textInvalidPassword.contains("Do you want to reset your password?"));

        return new LoginScreen(driver);
    }

    public LoginScreen errorDescEmailPasswordNotValidModalIos() throws IOException {

        isElementPresent(emailPasswordNotValidIos);
        String textInvalidPassword = emailPasswordNotValidIos.getText();
        Assert.assertTrue(textInvalidPassword.contains("The email and password you entered do not match."));
        Assert.assertTrue(textInvalidPassword.contains("Do you want to reset your password?"));

        return new LoginScreen(driver);
    }

    public LoginScreen clickLoginBtnModal() throws IOException {

        tapByElement(yesBtnModal);

        return new LoginScreen(driver);
    }

    public LoginScreen clickYesBtnPhoneUnregisteredModal() throws IOException {

        tapByElement(yesBtnModal);

        return new LoginScreen(driver);
    }

    public LoginScreen clickRegisterBtnModal() throws IOException {

        tapByElement(noBtnModal);

        return new LoginScreen(driver);
    }

    public LoginScreen inputNewChannelToLogin(String channel) throws IOException {

        usernameEmailField.clear();
        inputValue(usernameEmailField, channel);

        return new LoginScreen(driver);
    }

    //toast msg
    public LoginScreen assertToastSuspend(String text) throws IOException {

        isElementPresent(toastMsg);
        String txtWarning = toastMsg.getText();
        Assert.assertTrue(txtWarning.contains(text));

        return new LoginScreen(driver);
    }

}
