package pageObjects;

import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

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

    /***********************************************
     group detail and topic list and add topic screen
     ***********************************************/
    @AndroidFindBy(id="com.fdbr.android.talk:id/buttonJoin")
    public MobileElement joinBtnGroupDetail;

    @AndroidFindBy(id="com.fdbr.android.talk:id/buttonMember")
    public MobileElement memberBtnGroupDetail;

    @AndroidFindBy(id="com.fdbr.android.talk:id/toolbarSearchClick")
    public MobileElement searchTopicGroupDetail;

    @AndroidFindBy(id="com.fdbr.android.talk:id/buttonSortBy")
    public MobileElement sortGroupDetail;

    @AndroidFindBy(id="com.fdbr.android.talk:id/listTopics")
    public MobileElement listAllTopic;

    @AndroidFindBy(id="com.fdbr.android.talk:id/buttonAddTopic")
    public MobileElement addTopicBtn;

    @AndroidFindBy(xpath="//android.view.ViewGroup[contains(@resource-id, 'com.fdbr.android.talk:id/itemMenuParent') and @index='0']")
    public List<MobileElement> topicList1;

    //add topic screen
    @AndroidFindBy(id="com.fdbr.android:id/toolbarTitle")
    public MobileElement titleAddTopicScreen;

    @AndroidFindBy(id="com.fdbr.android.talk:id/labelCounterDescription")
    public MobileElement counterDescTopic;

    @AndroidFindBy(id="com.fdbr.android.talk:id/inputTitle")
    public MobileElement inputTitleAddTopicScreen;

    @AndroidFindBy(id="com.fdbr.android.talk:id/inputDescription")
    public MobileElement inputDescAddTopicScreen;

    @AndroidFindBy(id="com.fdbr.android.talk:id/inputTagging")
    public MobileElement inputTaggingAddTopicScreen;

    @AndroidFindBy(id="com.fdbr.android.talk:id/buttonSubmit")
    public MobileElement submitAddTopicBtn;

    //error modal add topic screen
    @AndroidFindBy(id="com.fdbr.android:id/textDescription")
    public MobileElement descErrorModal;

    //By submitting this topic, you automatically joined this group.

    @AndroidFindBy(id="com.fdbr.android:id/buttonPositive")
    public MobileElement okModal;

    // This is a constructor, as every page need a base driver to find android elements
    public TalkScreen(AppiumDriver driver) {

        this.driver = driver;
        //Initialize Elements of a Page class without having to use ‘FindElement‘ or ‘FindElements‘
        PageFactory.initElements(new AppiumFieldDecorator(this.driver),this);
    }

    //find topic talk
    public TalkScreen scrollGroupTalk() {
        try {
            tapByElement(seeMoreGrouptn);
            for (int i = 0; i < 4; i++) {
                isElementEnabled((MobileElement) groupCard);
                this.verticalSwipeByPercentages((MobileElement) groupCard,0.4,0.01,0.5,500);
            }
        }catch (Exception e){
            e.getMessage();
        }
        return new TalkScreen(driver);
    }

    public TalkScreen joinRandomGrupTalk() {
        clickRandomMenus(joinBtnGroupList);
        return new TalkScreen(driver);
    }

    public TalkScreen clickRandomTalk() {
        clickRandomMenus(groupCard);
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

    public TalkScreen checkBtnAfterJoinGroupDetail() throws InterruptedException {
        isElementPresent(memberBtnGroupDetail);
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

    public TalkScreen submitAddTopicAsGuest() {
        isElementEnabled(addTopicBtn);
        tapByElement(addTopicBtn);
        isElementEnabled(titleAddTopicScreen);
        FakeValuesService fakeValuesService = new FakeValuesService(new Locale("en-GB"),new RandomService());

        //add topic screen
        tapByElement(inputTitleAddTopicScreen);
        inputValue(inputTitleAddTopicScreen, faker.book().publisher()+" "+"talk title");
        tapByElement(inputDescAddTopicScreen);
        inputValue(inputDescAddTopicScreen, fakeValuesService.regexify("[a-z1-9]{100}")+" "+"talk description");
        tapByElement(inputTaggingAddTopicScreen);
        inputValueEnter(inputTaggingAddTopicScreen, faker.book().genre());
        tapByElement(submitAddTopicBtn);
        return new TalkScreen(driver);
    }

    public TalkScreen getConfirmationJoin() {
        isElementEnabled(descErrorModal);
        String desc = descErrorModal.getText();
        Assert.assertEquals(desc,"By submitting this topic, you automatically joined this group.");
        tapByElement(okModal);
        return new TalkScreen(driver);
    }

    public TalkScreen checkNewSubmittedTopic() {
        isElementPresent(listAllTopic);
        return new TalkScreen(driver);
    }
}
