package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class RegisterScreen extends ActionBase {

    @AndroidFindBy(id="com.fdbr.android.auth:id/inputEmailPhone")
    @iOSFindBy(id="id_reg_emailphone")
    public MobileElement emailPhoneField;

    @AndroidFindBy(id="com.fdbr.android.auth:id/buttonNext")
    @iOSFindBy(id="id_next_register")
    public MobileElement nextLoginRegisterBtn;

    @AndroidFindBy(id="Navigate up")
    @iOSFindBy(id="id_back_emailphone")
    public MobileElement backArrow;

    public RegisterScreen(AppiumDriver driver) throws IOException {

        this.driver = driver;
        //Initialize Elements of a Page class without having to use ‘FindElement‘ or ‘FindElements‘
        PageFactory.initElements(new AppiumFieldDecorator(this.driver),this);
    }

    public void inputUsrEmailPhoneName(String usremailphonename) {

        inputValue(emailPhoneField, usremailphonename);
    }

    public void clickNext() {

        tapByElement(nextLoginRegisterBtn);
    }
}
