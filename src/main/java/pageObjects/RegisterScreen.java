package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;

public class RegisterScreen extends ActionBase {

    @AndroidFindBy(id="com.fdbr.android.auth:id/inputEmailPhone")
    @iOSXCUITFindBy(id="id_reg_emailphone")
    public MobileElement emailPhoneField;

    @AndroidFindBy(id="com.fdbr.android.auth:id/buttonNext")
    @iOSXCUITFindBy(id="id_next_register")
    public MobileElement nextLoginRegisterBtn;

    @AndroidFindBy(id="com.fdbr.android:id/textinput_error")
    @iOSXCUITFindBy(id="id_reg_emailphone")
    public MobileElement errorMsgUnderField;

    @AndroidFindBy(xpath="//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
    @iOSXCUITFindBy(id="id_back_emailphone")
    public MobileElement backArrow;

    /*  element modal login phone number and email */
    @AndroidFindBy(id="com.fdbr.android:id/textTitle")
    @iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@value='Identify your phone number']")
    public MobileElement titleModal;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@value='Phone number has been registered']")
    public MobileElement titleModal2;

    @AndroidFindBy(id="com.fdbr.android:id/textDescription")
    public MobileElement descModal;

    @AndroidFindBy(id="com.fdbr.android:id/buttonPositive")
    @iOSXCUITFindBy(id="Identify your phone number")
    public MobileElement loginBtnModal;

    @AndroidFindBy(id="com.fdbr.android:id/buttonNegative")
    @iOSXCUITFindBy(id="Identify your phone number")
    public MobileElement createNewBtnModal;

    public RegisterScreen(AppiumDriver driver) {

        this.driver = driver;
        //Initialize Elements of a Page class without having to use ‘FindElement‘ or ‘FindElements‘
        PageFactory.initElements(new AppiumFieldDecorator(this.driver),this);
    }

    public RegisterScreen inputUsrEmailPhoneName(String usremailphonename) {

        inputValue(emailPhoneField, usremailphonename);
        return new RegisterScreen(driver);
    }

    public RegisterScreen clickNext() {

        tapByElement(nextLoginRegisterBtn);
        return new RegisterScreen(driver);
    }

    public void assertTextWarningLogin(String text){

        String txtWarning = errorMsgUnderField.getText();
        Assert.assertEquals(txtWarning, text);
    }

    /*  action modal phone number and email */
    /*  title modal */
    public RegisterScreen errorTitlePhoneNumberNotVerifiedModal() {

        isElementPresent(titleModal);
        String getTitle = titleModal.getText();
        System.out.println(getTitle);
        Assert.assertEquals(getTitle,"Identify your phone number");
        return new RegisterScreen(driver);
    }

    public RegisterScreen errorTitlePhoneNumberIsVerifiedModal() {

        isElementPresent(titleModal);
        String getTitle = titleModal.getText();
        System.out.println(getTitle);
        Assert.assertEquals(getTitle,"Phone number has been registered");
        return new RegisterScreen(driver);
    }

    public RegisterScreen errorTitleEmailIsVerifiedModal() throws IOException {

        isElementPresent(titleModal);
        String getTitle = titleModal.getText();
        System.out.println(getTitle);
        Assert.assertEquals(getTitle,"Email has been registered");

        return new RegisterScreen(driver);
    }

    public RegisterScreen errorTitlePhoneNumberIsVerifiedModalIos() throws IOException {

        isElementPresent(titleModal2);
        String getTitle = titleModal2.getText();
        System.out.println(getTitle);
        Assert.assertEquals(getTitle,"Phone number has been registered");
        return new RegisterScreen(driver);
    }

    /*  content or description modal */
    public RegisterScreen errorDescPhoneNumberNotVerifiedModal() {

        WaitUntilElementIsVisible(descModal);
        isElementPresent(descModal);
        String getTitle = titleModal.getText();
        String getDesc = descModal.getText();
        System.out.println("debug"+getTitle);
        System.out.println("debug"+getDesc);
        Assert.assertTrue(getTitle.contains("Identify your phone number"));
        Assert.assertTrue(getDesc.contains("Please login with the correct email.\n" +
                "If the email does not belong to you, please create a new account."));
        return new RegisterScreen(driver);
    }

    public RegisterScreen errorDescPhoneNumberIsVerifiedModal() {

        isElementPresent(descModal);
        String getDesc = descModal.getText();
        System.out.println(getDesc);
        Assert.assertTrue(getDesc.contains("Continue to login with this phone number?"));
        return new RegisterScreen(driver);
    }

    public RegisterScreen errorDescEmailIsVerifiedModal() {

        isElementPresent(descModal);
        String getDesc = descModal.getText();
        System.out.println(getDesc);
        Assert.assertTrue(getDesc.contains("Continue to login with this email?"));
        return new RegisterScreen(driver);
    }
}
