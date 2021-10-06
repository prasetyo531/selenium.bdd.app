package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;

public class CompleteAccountScreen extends ActionBase {

    @AndroidFindBy(id="com.fdbr.android.auth:id/inputEmail")
    @iOSXCUITFindBy(id="id_compacc_email")
    public MobileElement emailField;

    @AndroidFindBy(id="com.fdbr.android.auth:id/inputPhone")
    @iOSXCUITFindBy(id="id_compacc_phone")
    public MobileElement phoneField;

    //bio options
    @AndroidFindBy(id="com.fdbr.android.auth:id/inputUsername")
    @iOSXCUITFindBy(id="id_compacc_username")
    public MobileElement usernameField;

    @AndroidFindBy(id="com.fdbr.android.auth:id/inputPassword")
    @iOSXCUITFindBy(id="id_compacc_password")
    public MobileElement passwordField;

    @AndroidFindBy(id="com.fdbr.android:id/text_input_end_icon")
    @iOSXCUITFindBy(id="id_showpassword")
    public MobileElement showPasswordIcon;

    //dob
    @AndroidFindBy(id="com.fdbr.android.auth:id/inputBirthDate")
    @iOSXCUITFindBy(id=" Date of birth")
    public MobileElement birthdayField;

    @AndroidFindBy(id="com.fdbr.android:id/buttonOk")
    @iOSXCUITFindBy(id="Done")
    public MobileElement birthdayYesDoneModal;

    @AndroidFindBy(id="com.fdbr.android:id/btn_cancel")
    @iOSXCUITFindBy(id="Cancel")
    public MobileElement birthdayNoModal;

    @AndroidFindBy(id="com.fdbr.android.auth:id/buttonSubmit")
    @iOSXCUITFindBy(id="id_compacc_submit")
    public MobileElement submitField;

    //error msg
    @AndroidFindBy(id="com.fdbr.android:id/textinput_error")
    @iOSXCUITFindBy(id="id_compacc_submit")
    public MobileElement errorMsg;

    public CompleteAccountScreen(AppiumDriver driver) {

        this.driver = driver;
        //Initialize Elements of a Page class without having to use ‘FindElement‘ or ‘FindElements‘
        PageFactory.initElements(new AppiumFieldDecorator(this.driver),this);
    }

    public CompleteAccountScreen inputEmail(String email) {

        inputValue(emailField, email);

        return new CompleteAccountScreen(driver);
    }

    public CompleteAccountScreen inputPhone(String phone) {

        inputValue(phoneField, phone);

        return new CompleteAccountScreen(driver);
    }

    public CompleteAccountScreen inputUsername(String username) {

        inputValue(usernameField, username);

        return new CompleteAccountScreen(driver);
    }

    public CompleteAccountScreen inputPassword() {

        inputValue(passwordField, "test123");

        return new CompleteAccountScreen(driver);
    }

    public CompleteAccountScreen inputPassword(String password) {

        inputValue(passwordField, password);

        return new CompleteAccountScreen(driver);
    }

    public CompleteAccountScreen inputBirthday() {

        tapByElement(birthdayField);
        tapByElement(birthdayYesDoneModal);

        return new CompleteAccountScreen(driver);
    }

    public CompleteAccountScreen clickSubmitCompleteAccount() {

        tapByElement(submitField);

        return new CompleteAccountScreen(driver);
    }

    public CompleteAccountScreen getErrorMsg(String msg) {

        String error = errorMsg.getText();
        Assert.assertTrue(error.equals(msg));

        return new CompleteAccountScreen(driver);
    }
}
