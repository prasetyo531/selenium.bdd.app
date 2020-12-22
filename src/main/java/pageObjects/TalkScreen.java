package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.List;

public class TalkScreen extends ActionBase {

    /************************
     talk home and group list
     ***********************/
    @AndroidFindBy(xpath="//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
    public MobileElement backIcon;

    @AndroidFindBy(id="com.fdbr.android:id/toolbarBottomSearch")
    public MobileElement searchTalkBar;

    @AndroidFindBy(id="com.fdbr.android.talk:id/buttonSeeMore")
    public MobileElement seeMoreGrouptn;

    @AndroidFindBy(xpath="//android.widget.LinearLayout[contains(@resource-id, 'com.fdbr.android.talk:id/talkParent')]")
    public List<MobileElement> groupCard;

    @AndroidFindBy(xpath="//android.widget.Button[contains(@resource-id, 'com.fdbr.android.main:id/buttonJoin')]")
    public List<MobileElement> joinBtnGroupList;

    @AndroidFindBy(xpath="//android.widget.Button[contains(@resource-id, 'com.fdbr.android.main:id/buttonMember')]")
    public List<MobileElement> memberBtnGroupList;

    @AndroidFindBy(xpath="//android.widget.LinearLayout[@content-desc=\"All Groups\"]")
    public MobileElement allGroupTab;

    @AndroidFindBy(xpath="//android.widget.LinearLayout[@content-desc=\"Joined\"]")
    public MobileElement joinedGroupTab;

    // This is a constructor, as every page need a base driver to find android elements
    public TalkScreen(AppiumDriver driver) {

        this.driver = driver;
        //Initialize Elements of a Page class without having to use ‘FindElement‘ or ‘FindElements‘
        PageFactory.initElements(new AppiumFieldDecorator(this.driver),this);
    }

    //find topic talk
    public TalkScreen scrollGroupTalk() {
        try {
            for (int i = 0; i < 4; i++) {
                isElementEnabled((MobileElement) groupCard);
                this.verticalSwipeByPercentages((MobileElement) groupCard,0.4,0.01,0.5,500);
                groupCard.get(i).click();
            }
        }catch (Exception e){
            e.getMessage();
        }
        return new TalkScreen(driver);
    }

    public TalkScreen joinRandomGrupTalk() {
        //isElementPresent(joinBtnGroupList);
        clickRandomMenus(joinBtnGroupList);
        return new TalkScreen(driver);
    }

    public TalkScreen checkBtnAfterJoin() throws InterruptedException {
        //isElementPresent(memberBtnGroupList);
        Thread.sleep(1500);
        Integer btnMember = memberBtnGroupList.size();
        if(btnMember==0){
            Assert.fail("button changed to member is not appear");
        }else {
            System.out.println("button changed to member is appear");
        }
        return new TalkScreen(driver);
    }

    public TalkScreen checkJoinedGroupJoinedTab() throws InterruptedException {
        tapByElement(seeMoreGrouptn);

        isElementEnabled(joinedGroupTab);
        tapByElement(joinedGroupTab);
        Thread.sleep(1500);
        //isElementPresent(memberBtnGroupList);
        Integer btnMember = memberBtnGroupList.size();
        if(btnMember==0){
            Assert.fail("button changed to member is not appear");
        }else {
            System.out.println("button changed to member is appear");
        }
        return new TalkScreen(driver);
    }

}
