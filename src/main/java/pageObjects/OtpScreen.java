package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OtpScreen extends ActionBase{

    @AndroidFindBy(id="com.google.android.gms:id/positive_button")
    @iOSFindBy(id="suggestion")
    public MobileElement allowReadOtpBtn;

    @AndroidFindBy(id="com.fdbr.android.auth:id/labelAuthReceiver")
    @iOSFindBy(xpath="//XCUIElementTypeStaticText[contains(text(),'Enter the 6 digit code we have sent to')]")
    public MobileElement authReceiverLabel;

    @AndroidFindBy(id="com.fdbr.android.auth:id/labelTapToChange")
    @iOSFindBy(id="Haven't receive the code? Resend now")
    public MobileElement tapToChangeLabel;

    @AndroidFindBy(id="com.fdbr.android.auth:id/labelResendOtp")
    @iOSFindBy(id="Resend now")
    public MobileElement resendCodeLabel;

    @AndroidFindBy(id="com.fdbr.android.auth:id/buttonConfirm")
    @iOSFindBy(id="id_otp_confirm")
    public MobileElement confirmOtpBtn;


    public OtpScreen(AppiumDriver driver) throws IOException {

        this.driver = driver;
        //Initialize Elements of a Page class without having to use ‘FindElement‘ or ‘FindElements‘
        PageFactory.initElements(new AppiumFieldDecorator(this.driver),this);
    }

    /***  android ***/
    public void clickAllowReadMsg() {

        tapByElement(allowReadOtpBtn);
    }

    public void clickConfirmOtp() {

        tapByElement(confirmOtpBtn);
    }

    //get String phone android
    public void comparePhoneReceiver() {

        String labelReceiver = authReceiverLabel.getText();
        Assert.assertTrue(labelReceiver.startsWith("+628"));
    }

    /***  ios ***/
    public void clickAllowReadMsgIos() {

        tapByElement(allowReadOtpBtn);
    }

    public void clickConfirmOtpIos() {

        tapByElement(confirmOtpBtn);
    }

    //get String phone ios
    public void comparePhoneReceiverIos() {

        String labelReceiver = authReceiverLabel.getText();
        Assert.assertTrue(labelReceiver.contains("+628"));
    }

    //get phone
    public void compareEmailReceiver() {

        //https://mkyong.com/regular-expressions/how-to-validate-email-address-with-regular-expression/
        final String EMAIL_PATTERN =
                "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher;

        String labelReceiver = authReceiverLabel.getText();
        matcher = pattern.matcher(labelReceiver);
        matcher.matches();
        //Assert.assertTrue(labelReceiver.contains(".com"));
    }

}
