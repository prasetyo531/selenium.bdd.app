package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OtpScreen extends ActionBase{

    @AndroidFindBy(id="com.google.android.gms:id/positive_button")
    @iOSXCUITFindBy(id="suggestion")
    public MobileElement allowReadOtpBtn;

    @AndroidFindBy(id="com.fdbr.android.auth:id/labelAuthReceiver")
    @iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[contains(text(),'Enter the 6 digit code we have sent to')]")
    public MobileElement authReceiverLabel;

    @AndroidFindBy(id="com.fdbr.android.auth:id/labelTapToChange")
    @iOSXCUITFindBy(id="Haven't receive the code? Resend now")
    public MobileElement tapToChangeLabel;

    @AndroidFindBy(id="com.fdbr.android.auth:id/labelResendOtp")
    @iOSXCUITFindBy(id="Resend now")
    public MobileElement resendCodeLabel;

    @AndroidFindBy(id="com.fdbr.android.auth:id/labelCountDownTimer")
    @iOSXCUITFindBy(id="Resend now")
    public MobileElement countdownTimer;

    @AndroidFindBy(id="com.fdbr.android.auth:id/labelWarningInputOtp")
    @iOSXCUITFindBy(id="Resend now")
    public MobileElement errorMsgOtp;

    @AndroidFindBy(id="com.fdbr.android.auth:id/buttonConfirm")
    @iOSXCUITFindBy(id="id_otp_confirm")
    public MobileElement confirmOtpBtn;

    /* otp box*/
    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.EditText[1]")
    public MobileElement box1;

    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.EditText[2]")
    public MobileElement box2;

    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.EditText[3]")
    public MobileElement box3;

    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.EditText[4]")
    public MobileElement box4;

    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.EditText[5]")
    public MobileElement box5;

    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.EditText[6]")
    public MobileElement box6;

    public OtpScreen(AppiumDriver driver) throws IOException {

        this.driver = driver;
        //Initialize Elements of a Page class without having to use ‘FindElement‘ or ‘FindElements‘
        PageFactory.initElements(new AppiumFieldDecorator(this.driver),this);
    }

    /***  android ***/
    public void clickAllowReadMsg() {

        tapByElement(allowReadOtpBtn);
    }

    public OtpScreen getCounter() throws IOException {

        isElementPresent(countdownTimer);
        String counter = countdownTimer.getText();
        Assert.assertTrue(counter.contains("00:2"));

        return new OtpScreen(driver);
    }

    public OtpScreen clickConfirmOtp() throws IOException {

        tapByElement(confirmOtpBtn);

        return new OtpScreen(driver);
    }

    public OtpScreen fillByPassOtp() throws IOException {

        inputValue(box1,"1");
        inputValue(box2,"1");
        inputValue(box3,"1");
        inputValue(box4,"1");
        inputValue(box5,"1");
        inputValue(box6,"1");

        return new OtpScreen(driver);
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
