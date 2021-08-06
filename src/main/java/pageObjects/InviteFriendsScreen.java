package pageObjects;

import cucumber.api.java.en_old.Ac;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class InviteFriendsScreen extends ActionBase {

    @AndroidFindBy(id="com.fdbr.android.setting:id/labelSendCode")
    public MobileElement inviteCodeLabel;

    @AndroidFindBy(id="com.fdbr.android.setting:id/buttonShare")
    public MobileElement shareBtn;

    @AndroidFindBy(id="com.fdbr.android.setting:id/buttonPhoneBook")
    public MobileElement contactBtn;

    @AndroidFindBy(id="com.fdbr.android.setting:id/buttonClipBoard")
    public MobileElement copyBtn;

    @AndroidFindBy(id="android:id/profile_tabhost")
    public MobileElement drawerShare;

    public InviteFriendsScreen(AppiumDriver driver) {

        this.driver = driver;
        //Initialize Elements of a Page class without having to use ‘FindElement‘ or ‘FindElements‘
        PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
    }

    public InviteFriendsScreen clickShareInvite() {

        WaitUntilElementIsVisible(inviteCodeLabel);
        tapByElement(shareBtn);
        WaitUntilElementIsVisible(drawerShare);
        return new InviteFriendsScreen(driver);
    }
}
