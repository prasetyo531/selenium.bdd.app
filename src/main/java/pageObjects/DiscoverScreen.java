package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import utils.AppiumServer;

import java.io.IOException;
import java.util.List;

public class DiscoverScreen extends ActionBase {

    //android.widget.ImageView[contains(@resource-id, 'com.fdbr.android:id/imagePhoto') and @index='0']
    @AndroidFindBy(xpath="//android.view.ViewGroup[contains(@resource-id, 'com.fdbr.android:id/layoutParent') and @index='0']")
    public MobileElement firstPopularProduct;

    @AndroidFindBy(id="com.fdbr.android:id/swipeRepoList")
    public MobileElement postList;

    /*
    post detai
     */
    @AndroidFindBy(id="com.fdbr.android:id/buttonBackToolbar")
    public MobileElement backBtn;

    @AndroidFindBy(xpath="//android.widget.Button[contains(@resource-id, 'com.fdbr.android:id/buttonFollow') and @index='3']")
    public List<MobileElement> followBtn;

    // This is a constructor, as every page need a base driver to find android elements
    public DiscoverScreen(AppiumDriver driver) throws IOException {

        this.driver = driver;
        //Initialize Elements of a Page class without having to use ‘FindElement‘ or ‘FindElements‘
        PageFactory.initElements(new AppiumFieldDecorator(this.driver),this);
    }

    public DiscoverScreen scrollOnDiscover() throws IOException {

        isElementEnabled(postList);
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        this.verticalSwipeByPercentages(postList,0.4,0.01,0.5,500);
        this.verticalSwipeByPercentages(postList, 0.4,0.01,0.5,500);
        this.verticalSwipeByPercentages(postList, 0.4,0.01,0.5,500);
        this.verticalSwipeByPercentages(postList, 0.4,0.01,0.5,500);
        this.verticalSwipeByPercentages(postList,0.4,0.01,0.5,500);
        this.verticalSwipeByPercentages(postList,0.4,0.01,0.5,500);
        this.verticalSwipeByPercentages(postList, 0.4,0.01,0.5,500);
        this.verticalSwipeByPercentages(postList, 0.4,0.01,0.5,500);
        this.verticalSwipeByPercentages(postList, 0.4,0.01,0.5,500);
        this.verticalSwipeByPercentages(postList,0.4,0.01,0.5,500);
        this.verticalSwipeByPercentages(postList,0.4,0.01,0.5,500);
        this.verticalSwipeByPercentages(postList, 0.4,0.01,0.5,500);
        this.verticalSwipeByPercentages(postList, 0.4,0.01,0.5,500);
        this.verticalSwipeByPercentages(postList, 0.4,0.01,0.5,500);
        this.verticalSwipeByPercentages(postList,0.4,0.01,0.5,500);

        return new DiscoverScreen(driver);
    }

    public DiscoverScreen clickFirstPost() throws IOException {

        tapByElement(postList);
        return new DiscoverScreen(driver);
    }

    public DiscoverScreen checkFollowShouldDissapear() throws IOException {

        List<MobileElement> li = followBtn;
        System.out.println("after follow"+" "+li.size());
        Boolean fol = li.isEmpty();
        System.out.println(fol);
        //it depends screen size
        if(fol==false){
            Assert.fail("follow btn still appear");
        }
        return new DiscoverScreen(driver);
    }

    public DiscoverScreen clickFollow() throws IOException {

        List<MobileElement> li = followBtn;
        System.out.println("before follow"+" "+li.size());
        li.get(0).click();
        return new DiscoverScreen(driver);
    }

    public DiscoverScreen clickBack() throws IOException {

        tapByElement(backBtn);
        return new DiscoverScreen(driver);
    }
}
