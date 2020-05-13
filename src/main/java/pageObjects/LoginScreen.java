package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class LoginScreen extends ActionBase {

    @AndroidFindBy(id="com.fdbr.android.auth:id/inputEmailUsernamePhone")
    @iOSFindBy(xpath="/AppiumAUT/XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField")
    public MobileElement usernameEmailField;

    @AndroidFindBy(id="com.fdbr.android.auth:id/inputPassword")
    public MobileElement passwordField;

    @AndroidFindBy(id="com.fdbr.android.auth:id/buttonNext")
    public MobileElement nextLoginBtn;

    @AndroidFindBy(id="Navigate up")
    public MobileElement backArrow;

    @AndroidFindBy(id="com.fdbr.android.auth:id/buttonChange")
    public MobileElement changeBtn;

    @AndroidFindBy(id="Show password")
    public MobileElement unhidePassword;

    @AndroidFindBy(id="com.fdbr.android.auth:id/buttonForgotPassword")
    public MobileElement forgotPassword;

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




}
