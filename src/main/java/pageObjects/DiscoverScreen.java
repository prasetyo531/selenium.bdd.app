package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;
import java.util.List;

public class DiscoverScreen extends ActionBase {

    //android.widget.ImageView[contains(@resource-id, 'com.fdbr.android:id/imagePhoto') and @index='0']
    @AndroidFindBy(id="com.fdbr.android.main:id/search")
    public MobileElement iconSearchHashtag;

    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]")
    public MobileElement firstTrendingHashtag;

    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]")
    public MobileElement secondTrendingHashtag;

    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]")
    public MobileElement thirdTrendingHashtag;

    @AndroidFindBy(id="com.fdbr.android:id/swipeRepoList")
    public MobileElement postList;

    @AndroidFindBy(xpath="//android.widget.ImageView[contains(@resource-id, 'com.fdbr.android.main:id/imagePhoto') and @index='0']")
    public MobileElement firstPostDiscover;

    /******
     post detail
     *******/
    @AndroidFindBy(id="com.fdbr.android:id/buttonBackToolbar")
    public MobileElement backBtn;

    @AndroidFindBy(xpath="//android.widget.Button[contains(@resource-id, 'com.fdbr.android:id/buttonFollow') and @index='3']")
    public List<MobileElement> followBtn;

    @AndroidFindBy(id="com.fdbr.android:id/textCommentCounter")
    public MobileElement clickCommentIcon;

    @AndroidFindBy(id="com.fdbr.android:id/textLikeCounter")
    public MobileElement clickLikeIcon;

    /******
     search hashtag
     ******/
    @AndroidFindBy(id="com.fdbr.android.main:id/header")
    public MobileElement titlePopularNow;

    @AndroidFindBy(id="com.fdbr.android:id/toolbarSearch")
    public MobileElement searchHashtag;

    @AndroidFindBy(xpath="//android.widget.LinearLayout[contains(@resource-id, 'com.fdbr.android.main:id/layoutHashtags') and @index='1']")
    public MobileElement firstTrendingHashtagSearch;

    @AndroidFindBy(xpath="//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
    public MobileElement hashtagBackBtn;

    /******
     hashtag detail
     ******/
    @AndroidFindBy(xpath="//androidx.recyclerview.widget.RecyclerView[contains(@resource-id, 'com.fdbr.android.main:id/listDiscover') and @index='0']")
    public MobileElement postHashtagGrid;

    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.widget.ImageView")
    public MobileElement firstPostHashtag;

    @AndroidFindBy(id="com.fdbr.android:id/listFeeds")
    public List<MobileElement> postHashtagList;

    @AndroidFindBy(id="com.fdbr.android:id/imagePhoto")
    public MobileElement imgPost;

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

        isElementEnabled(firstPostDiscover);
        tapByElement(firstPostDiscover);
        return new DiscoverScreen(driver);
    }

    public DiscoverScreen clickPostList() throws IOException {

        isElementEnabled(postList);
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

    //trending hashtag
    public DiscoverScreen clickFirstHashtag() throws IOException {

        isElementPresent(firstTrendingHashtag);
        tapByElement(firstTrendingHashtag);
        return new DiscoverScreen(driver);
    }

    public DiscoverScreen scrollOnHashtag() throws IOException {

        //isElementEnabled(postList);
        isElementPresent(postHashtagGrid);
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        this.verticalSwipeByPercentages(postList,0.4,0.01,0.5,500);
        this.verticalSwipeByPercentages(postList, 0.4,0.01,0.5,500);
        this.verticalSwipeByPercentages(postList, 0.4,0.01,0.5,500);
        return new DiscoverScreen(driver);
    }

    public DiscoverScreen clickRandomPost() throws IOException {

        isElementPresent(postHashtagGrid);
        tapByElement(firstPostHashtag);
        return new DiscoverScreen(driver);
    }

    public DiscoverScreen scrollPostList() throws IOException {

        isElementPresent(clickCommentIcon);
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        this.verticalSwipeByPercentages(postList,0.4,0.01,0.5,500);
        this.verticalSwipeByPercentages(postList, 0.4,0.01,0.5,500);
        this.verticalSwipeByPercentages(postList, 0.4,0.01,0.5,500);
        return new DiscoverScreen(driver);
    }

    public DiscoverScreen inputKeywordHashtag(String hashtag) throws IOException {

        tapByElement(iconSearchHashtag);
        isElementEnabled(searchHashtag);

        inputValue(searchHashtag, hashtag);
        return new DiscoverScreen(driver);
    }

    public DiscoverScreen clickFirstHashtagAfterSearch() throws IOException {

        tapByElement(firstTrendingHashtagSearch);
        return new DiscoverScreen(driver);
    }

    public DiscoverScreen clickSearchIcon() throws IOException {

        tapByElement(iconSearchHashtag);
        return new DiscoverScreen(driver);
    }

    public DiscoverScreen clickFirstHashtagOnSearch() throws IOException {

        isElementPresent(titlePopularNow);
        isElementPresent(firstTrendingHashtagSearch);
        tapByElement(firstTrendingHashtagSearch);
        return new DiscoverScreen(driver);
    }


    public DiscoverScreen scrollHashtagResult() throws IOException {

        isElementPresent(firstTrendingHashtagSearch);
        verticalSwipeByPercentages(firstTrendingHashtagSearch, 0.8,0.01,0.5,500);
        return new DiscoverScreen(driver);
    }

    public DiscoverScreen backToSearchHashtagScreen() throws IOException {

        isElementPresent(backBtn);
        tapByElement(backBtn);
        return new DiscoverScreen(driver);
    }

    public DiscoverScreen checkHashtagDetail() throws IOException {

        isElementPresent(firstPostHashtag);
        return new DiscoverScreen(driver);
    }
}
