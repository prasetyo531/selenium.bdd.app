package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class CompleteAccountScreen extends ActionBase {

    @AndroidFindBy(id="com.fdbr.android.auth:id/inputEmail")
    @iOSFindBy(xpath="com.fdbr.android.auth:id/inputEmail")
    public MobileElement emailField;

//    @AndroidFindBy(id="")
//    @iOSFindBy(xpath="")
//    public MobileElement phoneField;

    @AndroidFindBy(id="com.fdbr.android.auth:id/inputUsername")
    @iOSFindBy(xpath="com.fdbr.android.auth:id/inputEmail")
    public MobileElement usernameField;

    @AndroidFindBy(id="com.fdbr.android.auth:id/inputPassword")
    @iOSFindBy(xpath="com.fdbr.android.auth:id/inputEmail")
    public MobileElement passwordField;

    @AndroidFindBy(id="com.fdbr.android:id/text_input_end_icon")
    @iOSFindBy(xpath="com.fdbr.android.auth:id/inputEmail")
    public MobileElement showPasswordIcon;

    /*  dob   */
    @AndroidFindBy(id="com.fdbr.android.auth:id/inputBirthDate")
    @iOSFindBy(xpath="com.fdbr.android.auth:id/inputEmail")
    public MobileElement birthdayField;

    @AndroidFindBy(id="com.fdbr.android:id/btn_ok")
    @iOSFindBy(xpath="com.fdbr.android.auth:id/inputEmail")
    public MobileElement birthdayYesModal;

    @AndroidFindBy(id="com.fdbr.android:id/btn_cancel")
    @iOSFindBy(xpath="com.fdbr.android.auth:id/inputEmail")
    public MobileElement birthdayNoModal;

    @AndroidFindBy(id="com.fdbr.android.auth:id/buttonSubmit")
    @iOSFindBy(xpath="com.fdbr.android.auth:id/inputEmail")
    public MobileElement submitField;

    public CompleteAccountScreen(AppiumDriver driver) throws IOException {

        this.driver = driver;
        //Initialize Elements of a Page class without having to use ‘FindElement‘ or ‘FindElements‘
        PageFactory.initElements(new AppiumFieldDecorator(this.driver),this);
    }

    public void inputEmail(String email){

        inputValue(emailField, email);
    }

//    public void inputPhone(String phone){
//
//        inputValue(phoneField, phone);
//    }

    public void inputUsername(String username){

        inputValue(usernameField, username);
    }

    public void inputPassword(){

        inputValue(passwordField, "test123");
    }

    public void inputBirthday(){

        tapByElement(birthdayField);
        tapByElement(birthdayYesModal);
    }

    public void clickSubmitCompleteAccount(){

        tapByElement(submitField);
    }
}
