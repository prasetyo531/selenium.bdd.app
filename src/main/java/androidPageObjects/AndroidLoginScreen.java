package androidPageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class AndroidLoginScreen extends ActionBaseAndroid {

    @AndroidFindBy(id="com.fdbr.android.debug:id/inputUsernameEmail")
    public AndroidElement UsernameEmailField;

    @AndroidFindBy(id="com.fdbr.android.debug:id/inputPassword")
    public AndroidElement PasswordField;

    @AndroidFindBy(id="com.fdbr.android.debug:id/buttonLogin")
    public AndroidElement LoginBtn;

    @AndroidFindBy(id="com.fdbr.android.debug:id/buttonBackToolbar")
    public AndroidElement BackArrow;

    @AndroidFindBy(id="com.fdbr.android.debug:id/text_input_end_icon")
    public AndroidElement UnhidePassword;

    @AndroidFindBy(id="com.fdbr.android.debug:id/buttonForgotPassword")
    public AndroidElement ForgotPassword;

    // This is a constructor, as every page need a base driver to find android elements
    public AndroidLoginScreen(AppiumDriver driver) throws IOException {

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
