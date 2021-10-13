package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class FollowerFollowingScreen extends ActionBase {

    public static int totalBeforeFollow;
    public static int totalAfterFollow;

    @AndroidFindBy(xpath="//android.view.ViewGroup[contains(@resource-id, 'com.fdbr.android.main:id/parent')]")
    public List<MobileElement> userListSize;

    @AndroidFindBy(xpath="//android.widget.Button[contains(@resource-id, 'com.fdbr.android.main:id/buttonFollow') and @text='FOLLOW']")
    public List<MobileElement> btnFollowListSize;

    @AndroidFindBy(xpath="//android.widget.Button[contains(@resource-id, 'com.fdbr.android.main:id/buttonFollow') and @text='FOLLOWING']")
    public List<MobileElement> btnFollowingListSize;

    @AndroidFindBy(xpath="//android.view.ViewGroup[contains(@resource-id, 'com.fdbr.android.main:id/parent') and @index='0']")
    public MobileElement firstElement;

    public FollowerFollowingScreen(AppiumDriver driver) {

        this.driver = driver;
        //Initialize Elements of a Page class without having to use ‘FindElement‘ or ‘FindElements‘
        PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
    }

    public FollowerFollowingScreen waitUntilListVisible() {

        WaitUntilElementIsVisible(firstElement);
        verticalSwipe(firstElement, 3, 900);
        return new FollowerFollowingScreen(driver);
    }

    public FollowerFollowingScreen getUserList() {

        WaitUntilElementIsVisible(firstElement);
        verticalSwipe(firstElement, 3, 900);
        clickFirstMenus(btnFollowListSize);
        return new FollowerFollowingScreen(driver);
    }

    public FollowerFollowingScreen clickFollow() {

        clickFirstMenus(btnFollowListSize);
        return new FollowerFollowingScreen(driver);
    }

    public FollowerFollowingScreen clickUnfollow() {

        clickFirstMenus(btnFollowingListSize);
        return new FollowerFollowingScreen(driver);
    }

    public FollowerFollowingScreen clickRandomUserToVisit() {

        WaitUntilElementIsVisible(firstElement);
        verticalSwipe(firstElement, 1, 900);
        clickFirstMenus(userListSize);
        return new FollowerFollowingScreen(driver);
    }

    public void beforeFollow() {

        WaitUntilElementIsVisible(firstElement);
        totalBeforeFollow = btnFollowListSize.size();
        System.out.println("total before follow"+"="+totalBeforeFollow);
    }

    public void beforeUnfollow() {

        WaitUntilElementIsVisible(firstElement);
        totalBeforeFollow = btnFollowingListSize.size();
        System.out.println("total before unfollow"+"="+totalBeforeFollow);
    }

    public void checkAfterFollow() {

        WaitUntilElementIsVisible(firstElement);
        totalAfterFollow = btnFollowListSize.size();
        System.out.println("total after follow"+"="+totalAfterFollow);
        if(totalAfterFollow==totalBeforeFollow){
            Assert.fail("total follow should not same");
        }
    }

    public void checkAfterUnfollow() {

        WaitUntilElementIsVisible(firstElement);
        totalAfterFollow = btnFollowingListSize.size();
        System.out.println("total after unfollow"+"="+totalAfterFollow);
        if(totalAfterFollow==totalBeforeFollow){
            Assert.fail("total follow should not same");
        }
    }
}
