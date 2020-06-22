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

    @AndroidFindBy(id="Navigate up")
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

    /*  action modal phone number and email */
    /*  title modal */
    public void errorTitlePhoneNumberNotVerifiedModal(){

        isElementPresent(titleModal);
        String getTitle = titleModal.getText();
        System.out.println(getTitle);
        Assert.assertEquals(getTitle,"Identify your phone number");
    }

    public void errorTitlePhoneNumberIsVerifiedModal(){

        isElementPresent(titleModal);
        String getTitle = titleModal.getText();
        System.out.println(getTitle);
        Assert.assertEquals(getTitle,"Phone number has been registered");
    }

    public void errorTitleEmailIsVerifiedModal(){

        isElementPresent(titleModal);
        String getTitle = titleModal.getText();
        System.out.println(getTitle);
        Assert.assertEquals(getTitle,"Email has been registered");
    }

    public void errorTitlePhoneNumberIsVerifiedModalIos(){

        isElementPresent(titleModal2);
        String getTitle = titleModal2.getText();
        System.out.println(getTitle);
        Assert.assertEquals(getTitle,"Phone number has been registered");
    }


    /*  content or description modal */
    public void errorDescPhoneNumberNotVerifiedModal() {

        isElementPresent(descModal);
        String getDesc = descModal.getText();
        System.out.println(getDesc);
        Assert.assertTrue(getDesc.contains("Hi! The phone number you have entered matches these accounts:"));
        Assert.assertTrue(getDesc.contains("Please login with the correct email.\n" +
                "If the email does not belong to you, please create a new account."));
    }

    public void errorDescPhoneNumberIsVerifiedModal(){

        isElementPresent(descModal);
        String getDesc = descModal.getText();
        System.out.println(getDesc);
        Assert.assertTrue(getDesc.contains("Continue to login with this phone number?"));
    }

    public void errorDescEmailIsVerifiedModal(){

        isElementPresent(descModal);
        String getDesc = descModal.getText();
        System.out.println(getDesc);
        Assert.assertTrue(getDesc.contains("Continue to login with this email?"));
    }
}
