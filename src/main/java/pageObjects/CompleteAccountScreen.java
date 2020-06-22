package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

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

    /*  dob   */
    @AndroidFindBy(id="com.fdbr.android.auth:id/inputBirthDate")
    @iOSXCUITFindBy(id=" Date of birth")
    public MobileElement birthdayField;

    @AndroidFindBy(id="com.fdbr.android:id/btn_ok")
    @iOSXCUITFindBy(id="Done")
    public MobileElement birthdayYesDoneModal;

    @AndroidFindBy(id="com.fdbr.android:id/btn_cancel")
    @iOSXCUITFindBy(id="Cancel")
    public MobileElement birthdayNoModal;

    @AndroidFindBy(id="com.fdbr.android.auth:id/buttonSubmit")
    @iOSXCUITFindBy(id="id_compacc_submit")
    public MobileElement submitField;

    public CompleteAccountScreen(AppiumDriver driver) throws IOException {

        this.driver = driver;
        //Initialize Elements of a Page class without having to use ‘FindElement‘ or ‘FindElements‘
        PageFactory.initElements(new AppiumFieldDecorator(this.driver),this);
    }

    public void inputEmail(String email){

        inputValue(emailField, email);
    }

    public void inputPhone(String phone){

        inputValue(phoneField, phone);
    }

    public void inputUsername(String username){

        inputValue(usernameField, username);
    }

    public void inputPassword(){

        inputValue(passwordField, "test123");
    }

    public void inputBirthday(){

        tapByElement(birthdayField);
        tapByElement(birthdayYesDoneModal);
    }

    public void clickSubmitCompleteAccount(){

        tapByElement(submitField);
    }
}
