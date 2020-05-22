package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;

public class LoginScreen extends ActionBase {

    @AndroidFindBy(id="com.fdbr.android.auth:id/inputEmailUsernamePhone")
    @iOSFindBy(id="Email, Username or phone number")
    public MobileElement usernameEmailField;

    @AndroidFindBy(id = "com.fdbr.android:id/textinput_error")
    public MobileElement txtWarningPhoneId;

    @AndroidFindBy(id="com.fdbr.android.auth:id/inputPassword")
    public MobileElement passwordField;

    @AndroidFindBy(id="com.fdbr.android.auth:id/buttonNext")
    @iOSFindBy(id="id_next_login")
    public MobileElement nextLoginBtn;

    @AndroidFindBy(id="Navigate up")
    public MobileElement backArrow;

    @AndroidFindBy(id="com.fdbr.android.auth:id/buttonChange")
    public MobileElement changeBtn;

    @AndroidFindBy(id="Show password")
    public MobileElement unhidePassword;

    @AndroidFindBy(id="com.fdbr.android.auth:id/buttonForgotPassword")
    public MobileElement forgotPassword;

    @iOSFindBy(id="Done")
    public MobileElement doneKeyboard;

    /*  element modal login phone number and email */
    @AndroidFindBy(id="com.fdbr.android:id/textTitle")
    public MobileElement titleModal;

    @AndroidFindBy(id="com.fdbr.android:id/textDescription")
    public MobileElement descModal;

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

    public void clickNext() {

        tapByElement(nextLoginBtn);
    }

    public void clickLogin() {

        tapByElement(nextLoginBtn);
    }

    /*  error msg underneath field   */
    public void assertTextWarningLogin(String text){

        String txtWarning = txtWarningPhoneId.getText();
        Assert.assertEquals(txtWarning, text);
    }

    /*  action modal phone number and email */
    /*  title modal */
    public void errorTitlePhoneNumberNotVerifiedModal(){

        isElementPresent(titleModal);
        String getTitle = titleModal.getText();
        Assert.assertEquals(getTitle,"Identify your phone number");
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

    public void errorTitlePhoneNumberNotRegisteredModal(){

        isElementPresent(titleModal);
        String getTitle = titleModal.getText();
        Assert.assertEquals(getTitle,"Phone number is not registered");
    }

    public void errorTitleEmailUsernameNotRegisteredModal(){

        isElementPresent(titleModal);
        String getTitle = titleModal.getText();
        Assert.assertEquals(getTitle,"Uh-oh! Account not found!");
    }

    /*  content or description modal */
    public void errorDescPhoneNumberNotVerifiedModal() {

        isElementPresent(descModal);
        String getDesc = descModal.getText();
        System.out.println(getDesc);
        Assert.assertTrue(getDesc.contains("Hi! The phone number you have entered matches this account:"));
        Assert.assertTrue(getDesc.contains("Please login with the correct email.\n" +
                "If the email does not belong to you, please create a new account."));
    }

    public void errorDescEmailDuplicateModal(){

        isElementPresent(descModal);
        String getDesc = descModal.getText();
        System.out.println(getDesc);
        Assert.assertTrue(getDesc.contains("Hi! The email you have entered matches these accounts:"));
        Assert.assertTrue(getDesc.contains("Please login with the correct username."));
    }

    public void errorDescPhoneNumberNotRegisteredModal(){

        isElementPresent(descModal);
        String getDesc = descModal.getText();
        System.out.println(getDesc);
        Assert.assertTrue(getDesc.contains("Create a new account with this number? +62"));
    }

    public void errorDescEmailNotRegisteredModal(){

        isElementPresent(descModal);
        String getDesc = descModal.getText();
        System.out.println(getDesc);
        Assert.assertTrue(getDesc.contains("The email and password you entered do not match."));
        Assert.assertTrue(getDesc.contains("Do you want to reset your password?"));
    }

    public void clickYesBtnModal(){

        tapByElement(yesBtnModal);
    }

    public void clickNoBtnModal(){

        tapByElement(noBtnModal);
    }



}
