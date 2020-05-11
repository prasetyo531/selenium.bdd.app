package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;

public class OtpScreen extends ActionBase{

    @AndroidFindBy(id="com.google.android.gms:id/positive_button")
    public MobileElement allowReadOtpBtn;

    @AndroidFindBy(id="com.fdbr.android.debug.auth:id/labelAuthReceiver")
    public MobileElement authReceiverLabel;

    @AndroidFindBy(id="com.fdbr.android.debug.auth:id/labelTapToChange")
    public MobileElement tapToChangeLabel;

    @AndroidFindBy(id="com.fdbr.android.debug.auth:id/labelResendOtp")
    public MobileElement resendCodeLabel;

    @AndroidFindBy(id="com.fdbr.android.debug.auth:id/buttonConfirm")
    public MobileElement confirmOtpBtn;


    public OtpScreen(AppiumDriver driver) throws IOException {

        this.driver = driver;
        //Initialize Elements of a Page class without having to use ‘FindElement‘ or ‘FindElements‘
        PageFactory.initElements(new AppiumFieldDecorator(this.driver),this);
    }

    public void clickAllowReadMsg() {

        tapByElement(allowReadOtpBtn);
    }

    public void clickConfirmOtp() {

        tapByElement(confirmOtpBtn);
    }

    //get text
    public void compareTextReceiver() {

        String labelReceiver = authReceiverLabel.getText();
        Assert.assertTrue(labelReceiver.startsWith("+628"));
    }

}
