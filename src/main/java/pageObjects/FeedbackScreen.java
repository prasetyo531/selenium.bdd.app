package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FeedbackScreen extends ActionBase {

    @AndroidFindBy(id="com.fdbr.android.setting:id/inputFeedback")
    public MobileElement feedbackField;

    @AndroidFindBy(id="com.fdbr.android.setting:id/buttonImagePicker")
    public MobileElement attachImgBtn;

    @AndroidFindBy(id="com.fdbr.android.photo:id/buttonCapture")
    public MobileElement captureBtn;

    @AndroidFindBy(id="com.fdbr.android:id/buttonRightCustom")
    public MobileElement doneBtn;

    @AndroidFindBy(id="com.fdbr.android.photo:id/buttonPicker")
    public MobileElement galleryBtn;

    @AndroidFindBy(xpath="//android.widget.ImageView[contains(@resource-id, 'com.google.android.documentsui:id/icon_thumb') and @index='0']")
    public MobileElement firstIndexImg;

    @AndroidFindBy(id="com.fdbr.android.setting:id/buttonSend")
    public MobileElement submitBtn;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android:id/textDescription') and @text='Please fill out the field']")
    public MobileElement errorModalFeedback;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android:id/textDescription') and @text='Thank you for your feedback']")
    public MobileElement successModalFeedback;

    @AndroidFindBy(id="com.fdbr.android:id/buttonPositive")
    public MobileElement okBtn;

    // This is a constructor, as every page need a base driver to find android elements
    public FeedbackScreen(AppiumDriver driver) {

        this.driver = driver;
        //Initialize Elements of a Page class without having to use ‘FindElement‘ or ‘FindElements‘
        PageFactory.initElements(new AppiumFieldDecorator(this.driver),this);
    }

    public FeedbackScreen clickSubmit() {
        tapByElement(submitBtn);
        return new FeedbackScreen(driver);
    }

    public FeedbackScreen isErrorModalAppear() {
        WaitUntilElementIsVisible(errorModalFeedback);
        tapByElement(okBtn);
        return new FeedbackScreen(driver);
    }

    public FeedbackScreen issuccessModalAppear() {
        WaitUntilElementIsVisible(successModalFeedback);
        tapByElement(okBtn);
        return new FeedbackScreen(driver);
    }

    public FeedbackScreen inputFeedback() {
        WaitUntilElementIsVisible(feedbackField);
        inputValue(feedbackField, "test feedback staging dari app");
        return new FeedbackScreen(driver);
    }

    public FeedbackScreen inputFeedbackWithScreenshot() {
        WaitUntilElementIsVisible(feedbackField);
        inputValue(feedbackField, "test feedback staging dari app");
        tapByElement(attachImgBtn);
        WaitUntilElementIsVisible(captureBtn);
        tapByElement(captureBtn);
        tapByElement(doneBtn);
        return new FeedbackScreen(driver);
    }
}
