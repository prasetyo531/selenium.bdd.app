package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class LoginScreen extends ActionBase {

    @AndroidFindBy(id="com.fdbr.android.debug:id/inputUsernameEmail")
    public MobileElement UsernameEmailField;

    @AndroidFindBy(id="com.fdbr.android.debug:id/inputPassword")
    public MobileElement PasswordField;

    @AndroidFindBy(id="com.fdbr.android.debug:id/buttonLogin")
    public MobileElement LoginBtn;

    @AndroidFindBy(id="com.fdbr.android.debug:id/buttonBackToolbar")
    public MobileElement BackArrow;

    @AndroidFindBy(id="com.fdbr.android.debug:id/text_input_end_icon")
    public MobileElement UnhidePassword;

    @AndroidFindBy(id="com.fdbr.android.debug:id/buttonForgotPassword")
    public MobileElement ForgotPassword;

    // This is a constructor, as every page need a base driver to find android elements
    public LoginScreen(AppiumDriver driver) throws IOException {

        this.driver = driver;
        //Initialize Elements of a Page class without having to use ‘FindElement‘ or ‘FindElements‘
        PageFactory.initElements(new AppiumFieldDecorator(this.driver),this);
    }

    public void inputusername(String username) {

        UsernameEmailField.setValue(username);
    }

    public void inputpassword(String password) {

        PasswordField.setValue(password);
    }

    public void clickLogin() {

        tapByElement(LoginBtn);
    }




}
