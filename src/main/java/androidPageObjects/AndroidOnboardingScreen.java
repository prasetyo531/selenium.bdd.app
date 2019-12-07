package androidPageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utils.DriverFactory;

import java.io.IOException;
import java.time.Duration;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class AndroidOnboardingScreen extends DriverFactory {

    @AndroidFindBy(id="com.fdbr.android.debug:id/buttonLogin")
    public AndroidElement LoginBtn;

    @AndroidFindBy(id="com.fdbr.android.debug:id/buttonSignUp")
    public AndroidElement SignupBtn;

    @AndroidFindBy(id="com.fdbr.android.debug:id/buttonFacebook")
    public AndroidElement FacebookBtn;

    @AndroidFindBy(id="io.selendroid.testapp:id/visibleButtonTest")
    public AndroidElement textField;

    @AndroidFindBy(id="io.selendroid.testapp:id/visibleTextView")
    public AndroidElement displayBtn;

    public AndroidOnboardingScreen(AppiumDriver driver) throws IOException {

        this.driver = driver;
        //Initialize Elements of a Page class without having to use ‘FindElement‘ or ‘FindElements‘
        PageFactory.initElements(new AppiumFieldDecorator(this.driver),this);
    }

    public void clickLoginBtn(){

        try {
            new TouchAction(driver)
                    .tap(tapOptions().withElement(element(LoginBtn)))
                    .waitAction(waitOptions(Duration.ofMillis(250))).perform();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
