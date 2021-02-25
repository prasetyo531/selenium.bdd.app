package pageObjects;

import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;
import com.google.common.collect.ImmutableMap;
import gherkin.lexer.Th;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

public class TalkScreen extends ActionBase {

    public static String titleEditTopic = "tile edit topic android";
    public static String descEditTopic = "desc edit topic android desc edit topic android desc edit topic android desc edit topic android desc edit topic android desc edit topic android desc edit topic android desc edit topic android desc edit topic android desc edit topic android desc edit topic android";
    public static String tagEditTopic = "editTopic";
    public String beforeLike;
    public String afterLike;
    public String beforeSort;
    public String afterSort;

    FakeValuesService fakeValuesService = new FakeValuesService(new Locale("en-GB"),new RandomService());

    /************************
     talk home and group list
     ***********************/
    @AndroidFindBy(xpath="//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
    public MobileElement backIcon;

    @AndroidFindBy(id="com.fdbr.android:id/toolbarBottomSearch")
    public MobileElement searchTalkBar;

    @AndroidFindBy(id="com.fdbr.android.talk:id/buttonSeeMore")
    public MobileElement seeMoreGrouptn;

    @AndroidFindBy(id="com.fdbr.android.talk:id/listGroups")
    public MobileElement listAllGroup;

    @AndroidFindBy(xpath="//android.widget.LinearLayout[contains(@resource-id, 'com.fdbr.android.talk:id/talkParent') and @index='0']")
    public MobileElement group1;

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

    @AndroidFindBy(xpath="//android.widget.LinearLayout[@content-desc=\"Talk\"]/android.widget.TextView")
    public MobileElement tabTalk;

    @AndroidFindBy(xpath="//android.widget.LinearLayout[@content-desc=\"Topic\"]/android.widget.TextView")
    public MobileElement tabTopic;

    @AndroidFindBy(xpath="//android.widget.ImageView[contains(@resource-id, 'com.fdbr.android.talk:id/imageUserIcon') and @index='0']")
    public MobileElement userProfile;

    @AndroidFindBy(xpath="//android.widget.CheckedTextView[contains(@resource-id, 'com.fdbr.android.talk:id/buttonLove')]")
    public List<MobileElement> listBtnLikeRecentTalk;

    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.CheckedTextView")
    public MobileElement counterFirstLike;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android.talk:id/buttonComment') and @index='1']")
    public List<MobileElement> listBtnReplyRecentTalk;

    @AndroidFindBy(xpath="//android.view.ViewGroup[contains(@resource-id, 'com.fdbr.android.talk:id/itemMenuParent')]")
    public List<MobileElement> recentTopic;

    @AndroidFindBy(id="com.fdbr.android.talk:id/listRecent")
    public MobileElement listRecentTalkTopic;

    @AndroidFindBy(id="com.fdbr.android.talk:id/buttonBottomSeeMore")
    public MobileElement btnSeeMoreTalkTopic;
    
    
    /***********************************************
     group detail and topic list and add topic screen
     ***********************************************/
    @AndroidFindBy(id="com.fdbr.android.talk:id/buttonJoin")
    public MobileElement joinBtnGroupDetail;

    @AndroidFindBy(id="com.fdbr.android.talk:id/buttonMember")
    public MobileElement memberBtnGroupDetail;

    @AndroidFindBy(id="com.fdbr.android.talk:id/toolbarSearchClick")
    public MobileElement searchTopicGroupDetail;

    @AndroidFindBy(id="com.fdbr.android.talk:id/buttonRightCancel")
    public MobileElement cancelLbl;

    @AndroidFindBy(id="com.fdbr.android.talk:id/buttonSortBy")
    public MobileElement sortGroupDetail;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android:id/textItem') and @text='Newest']")
    public MobileElement sortTopicByNewest;
    
    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android:id/textItem') and @text='Popular']")
    public MobileElement sortTopicByPopular;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android:id/textItem') and @text='Most Talks']")
    public MobileElement sortTopicByMostTalks;

    @AndroidFindBy(id="com.fdbr.android.talk:id/labelTalkName")
    public MobileElement firstTopic;
    
    @AndroidFindBy(id="com.fdbr.android.talk:id/buttonAddTopic")
    public MobileElement addTopicBtn;

    @AndroidFindBy(id="com.fdbr.android.talk:id/listTopics")
    public MobileElement listAllTopic;

    @AndroidFindBy(xpath="//android.view.ViewGroup[contains(@resource-id, 'com.fdbr.android.talk:id/itemMenuParent') and @index='0']")
    public MobileElement topicList1;

    @AndroidFindBy(id="com.fdbr.android.talk:id/itemMenuParent")
    public MobileElement topicResultSearch1;

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
    public MobileElement submitAddTopicTalkBtn;

    /***********************************************
     topic detail reply, like talk screen, talk desc field
     ***********************************************/
    @AndroidFindBy(id="com.fdbr.android.talk:id/labelTalkName")
    public MobileElement titleTopic;

    @AndroidFindBy(id="com.fdbr.android.talk:id/labelTalkDescription")
    public MobileElement descTopic;

    @AndroidFindBy(id="com.fdbr.android.talk:id/listTag")
    public MobileElement tagTopic;

    @AndroidFindBy(id="com.fdbr.android.talk:id/buttonReply")
    public MobileElement replyTopicBtn;

    @AndroidFindBy(id="com.fdbr.android.talk:id/labelWelcome")
    public MobileElement talksLabel;

    @AndroidFindBy(id="com.fdbr.android.talk:id/listTalks")
    public MobileElement listTalk;

    @AndroidFindBy(xpath="android.widget.CheckedTextView[contains(@resource-id, 'com.fdbr.android.talk:id/buttonLove')]")
    public List<MobileElement> listLikeTopicTalk;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android.talk:id/buttonComment')]")
    public List<MobileElement> listReplyTopicTalk;

    @AndroidFindBy(id="com.fdbr.android.talk:id/labelDescription")
    public MobileElement replyingLabel;

    @AndroidFindBy(id="com.fdbr.android.talk:id/labelReplyTo")
    public MobileElement replyingToLabel;

    @AndroidFindBy(id="com.fdbr.android.talk:id/inputDescription")
    public MobileElement inputDescAddTalkScreen;
    
    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android:id/textItem') and @text='Newest']")
    public MobileElement sortTalkByNewest;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android:id/textItem') and @text='Oldest']")
    public MobileElement sortTalkByOldest;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android:id/textItem') and @text='Most Likes']")
    public MobileElement sortTalkByMostLikes;

    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView")
    public MobileElement firstTalk;
    
    //more option topic detail
    @AndroidFindBy(id="com.fdbr.android.talk:id/buttonMore")
    public MobileElement topicDetailMoreBtn;

    @AndroidFindBy(id="com.fdbr.android:id/listViewDialog")
    public MobileElement moreOptionModal;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android:id/textValue') and @text='Edit']")
    public MobileElement editTopicFromMoreModal;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id, 'com.fdbr.android:id/textValue') and @text='Cancel']")
    public MobileElement cancelTopicFromMoreModal;

    //reply topic screen
    @AndroidFindBy(id="com.fdbr.android.talk:id/inputDescription")
    public MobileElement descReplyTopic;

    @AndroidFindBy(id="com.fdbr.android.talk:id/buttonSubmit")
    public MobileElement submitReplyTopicBtn;

    //reply talk screen
    @AndroidFindBy(id="com.fdbr.android.talk:id/inputDescription")
    public MobileElement descFieldReplyTalk;

    @AndroidFindBy(id="com.fdbr.android.talk:id/buttonSubmit")
    public MobileElement submitReplyTalkBtn;
    
    //error modal add, reply topic and reply talk as guest
    @AndroidFindBy(id="com.fdbr.android:id/textDescription")
    public MobileElement descErrorModal;

    @AndroidFindBy(id="com.fdbr.android:id/buttonPositive")
    public MobileElement okModal;
    
    String replyTalkTopic = "bdd test reply topic bdd test reply topic bdd test reply topic";

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
                isElementEnabled(listAllGroup);
                verticalSwipeByPercentagesDirectly(609,1843,604, 996);
            }
        }catch (Exception e){
            e.getMessage();
        }
        return new TalkScreen(driver);
    }

    public TalkScreen checkTopicDetail() {
        WaitUntilElementIsVisible(talksLabel);
        String lbl = talksLabel.getText();
        Assert.assertEquals("TALKS", lbl);
        return new TalkScreen(driver);
    }

    public TalkScreen scrollToTopGroupDetail() {
        verticalSwipeByPercentagesDirectly(891,752,862, 2452);
        verticalSwipeByPercentagesDirectly(891,752,862, 2452);
        verticalSwipeByPercentagesDirectly(891,752,862, 2452);
        return new TalkScreen(driver);
    }

    public TalkScreen searchGroupTalk(String group) throws InterruptedException {
        tapByElement(seeMoreGrouptn);
        inputValue(searchTalkBar,group);
        Thread.sleep(3000);
        return new TalkScreen(driver);
    }

    public TalkScreen joinRandomGrupTalk() {
        clickRandomMenus(joinBtnGroupList);
        return new TalkScreen(driver);
    }

    public TalkScreen clickFirstGroupTalk() {
        clickFirstMenus(groupCard);
        return new TalkScreen(driver);
    }

    public TalkScreen clickFirstGroup() {
        tapByElement(group1);
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

    public TalkScreen checkBtnAfterJoinGroupDetail() {
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

        //add topic screen
        isElementPresent(titleAddTopicScreen);
        String getTextEditTopic = titleAddTopicScreen.getText();
        Assert.assertEquals("Add Topic", getTextEditTopic);

        tapByElement(inputTitleAddTopicScreen);
        inputValue(inputTitleAddTopicScreen, faker.book().publisher()+" "+"talk title");
        tapByElement(inputDescAddTopicScreen);
        inputValue(inputDescAddTopicScreen, fakeValuesService.regexify("[a-z1-9]{100}")+" "+"talk description");
        tapByElement(inputTaggingAddTopicScreen);
        inputValueEnter(inputTaggingAddTopicScreen, faker.book().genre());
        tapByElement(submitAddTopicTalkBtn);
        return new TalkScreen(driver);
    }

    //edit topic
    public TalkScreen submitEditTopicAsGuest(String topic) throws InterruptedException {
        isElementPresent(searchTopicGroupDetail);
        tapAndInputValueKeyboard(searchTopicGroupDetail,topic);

        Thread.sleep(3000);
        WaitUntilElementIsVisible(topicResultSearch1);
        tapByElement(topicResultSearch1);

        isElementPresent(topicDetailMoreBtn);
        tapByElement(topicDetailMoreBtn);
        isElementPresent(moreOptionModal);
        isElementEnabled(editTopicFromMoreModal);
        tapByElement(editTopicFromMoreModal);

        //edit topic screen
        isElementPresent(titleAddTopicScreen);
        String getTextEditTopic = titleAddTopicScreen.getText();
        Assert.assertEquals("Edit Topic", getTextEditTopic);

        tapByElement(inputTitleAddTopicScreen);
        //inputValue(inputTitleAddTopicScreen, titleEditTopic);
        tapByElement(inputDescAddTopicScreen);
        inputValue(inputDescAddTopicScreen, descEditTopic);
        tapByElement(inputTaggingAddTopicScreen);
        driver.hideKeyboard();
        inputValueEnter(inputTaggingAddTopicScreen, tagEditTopic);
        tapByElement(submitAddTopicTalkBtn);
        return new TalkScreen(driver);
    }

    public TalkScreen checkTopicUpdated() {
        isElementEnabled(titleTopic);
        isElementEnabled(descTopic);
        isElementEnabled(tagTopic);
        String title = titleTopic.getText();
        String desc = descTopic.getText();
        String tag = tagTopic.getText();
        //Assert.assertEquals(titleEditTopic, title);
        Assert.assertEquals(descEditTopic, desc);
        //Assert.assertEquals(tagEditTopic, tag);
        return new TalkScreen(driver);
    }

    public TalkScreen getConfirmationJoinTopic() {
        isElementEnabled(descErrorModal);
        String desc = descErrorModal.getText();
        Assert.assertEquals("By submitting this topic, you automatically joined this group.", desc);
        tapByElement(okModal);
        return new TalkScreen(driver);
    }

    public TalkScreen getConfirmationJoinTalk() {
        isElementEnabled(descErrorModal);
        String desc = descErrorModal.getText();
        Assert.assertEquals("By submitting this talk, you automatically joined this group.", desc);
        tapByElement(okModal);
        return new TalkScreen(driver);
    }

    public TalkScreen checkNewSubmittedTopic() {
        isElementPresent(listAllTopic);
        return new TalkScreen(driver);
    }

    public TalkScreen clickMostTopTopic() {
        isElementPresent(listAllTopic);
        tapByElement(topicList1);
        return new TalkScreen(driver);
    }

    //submit reply topic
    public TalkScreen submitReplyTopicAsGuest() {
        isElementPresent(listAllTopic);
        tapByElement(topicList1);

        isElementPresent(listTalk);
        isElementPresent(replyTopicBtn);
        tapByElement(replyTopicBtn);

        isElementEnabled(descReplyTopic);
        inputValue(descReplyTopic, faker.regexify("[a-z1-9]{100}")+" "+"description reply topic");
        tapByElement(submitReplyTopicBtn);
        return new TalkScreen(driver);
    }

    public TalkScreen checkToastTopicEdited() {
        toastMatches("Your topic successfully edited!", false);
        return new TalkScreen(driver);
    }

    public TalkScreen checkNewSubmittedTalk() {
        isElementPresent(listTalk);
        return new TalkScreen(driver);
    }

    public TalkScreen clickCancelSearchTopic() {
        WaitUntilElementIsVisible(cancelLbl);
        tapByElement(cancelLbl);
        return new TalkScreen(driver);
    }

    public TalkScreen clickBackToGroupDetail() {
        WaitUntilElementIsVisible(backIcon);
        tapByElement(backIcon);
        return new TalkScreen(driver);
    }

    //submit reply talk
    public TalkScreen submitReplyTalkAsGuest(String topic) throws InterruptedException {
        isElementPresent(searchTopicGroupDetail);
        tapAndInputValueKeyboard(searchTopicGroupDetail,topic);

        Thread.sleep(3000);
        WaitUntilElementIsVisible(topicResultSearch1);
        tapByElement(topicResultSearch1);

        WaitUntilElementIsVisible(listTalk);
        clickRandomMenus(listReplyTopicTalk);
        WaitUntilElementIsVisible(inputDescAddTalkScreen);
        isElementPresent(replyingLabel);
        isElementPresent(replyingToLabel);

        //reply talk screen
        isElementPresent(titleAddTopicScreen);
        String getTextReplyTalk = titleAddTopicScreen.getText();
        Assert.assertEquals("Reply Talk", getTextReplyTalk);

        tapByElement(inputDescAddTalkScreen);
        inputValue(inputDescAddTalkScreen, fakeValuesService.regexify("[a-z1-9]{100}")+" "+"reply talk description");
        tapByElement(submitAddTopicTalkBtn);
        return new TalkScreen(driver);
    }
    
    public TalkScreen scrollToRecentTalk() {
        verticalSwipeByPercentagesDirectly(45,431,64, 1813);
        verticalSwipeByPercentagesDirectly(64,1813,54, 1224);
        verticalSwipeByPercentagesDirectly(54,1224,32, 500);
        return new TalkScreen(driver);
    }

    public TalkScreen scrollUntilLastScreen() {
        verticalSwipeByPercentagesDirectly(55,681,55, 1984);
        verticalSwipeByPercentagesDirectly(55,1984,55, 922);
        verticalSwipeByPercentagesDirectly(32,1993,23, 1534);
        verticalSwipeByPercentagesDirectly(32,1993,51, 800);
        verticalSwipeByPercentagesDirectly(32,1993,51, 800);
        verticalSwipeByPercentagesDirectly(32,1993,51, 800);
        return new TalkScreen(driver);
    }

    public TalkScreen scrollAndClickTabTopic() {
        verticalSwipeByPercentagesDirectly(55,681,55, 1984);
        verticalSwipeByPercentagesDirectly(55,1984,55, 922);
        verticalSwipeByPercentagesDirectly(32,1993,23, 1534);
        tapByElement (tabTopic);
        
        verticalSwipeByPercentagesDirectly(32,1993,51, 200);

        return new TalkScreen(driver);
    }

    public TalkScreen clickTabTopic() {
        tapByElement(tabTopic);
        return new TalkScreen(driver);
    }

    public TalkScreen clickOnProfileUser() {
        tapByElement(userProfile);
        return new TalkScreen(driver);
    }

    public TalkScreen checkCounterBeforeLike() {
        beforeLike = counterFirstLike.getText();
        System.out.println("before like"+" "+beforeLike);
        return new TalkScreen(driver);
    }

    public TalkScreen likeRecentTalk() {
        clickFirstMenus(listBtnLikeRecentTalk);
        return new TalkScreen(driver);
    }

    public TalkScreen checkCounterAfterLike() {
        afterLike = counterFirstLike.getText();
        System.out.println("after like"+" "+afterLike);
        Assert.assertNotEquals(afterLike, beforeLike);
        return new TalkScreen(driver);
    }

    public TalkScreen replyRecentTalk() {
        clickLastMenus(listBtnReplyRecentTalk);
        return new TalkScreen(driver);
    }

    public TalkScreen getTopicDetail() {
        WaitUntilElementIsVisible(titleTopic);
        
        isElementPresent(titleTopic);
        isElementPresent(replyTopicBtn);
        isElementPresent(talksLabel);
        return new TalkScreen(driver);
    }

    public TalkScreen replyTalkOnTopicDetail() {
        clickLastMenus(listReplyTopicTalk);
        isElementPresent(descFieldReplyTalk);
        
        tapAndInputValueKeyboard(descFieldReplyTalk, replyTalkTopic);
        tapByElement(submitReplyTalkBtn);
        
        return new TalkScreen(driver);
    }

    public TalkScreen tapRecentTopic() {
        clickLastMenus(recentTopic);
        return new TalkScreen(driver);
    }

    public TalkScreen replyTopicOnTopicDetail() {
        tapByElement(replyTopicBtn);
        isElementPresent(descReplyTopic);

        tapAndInputValueKeyboard(descReplyTopic, replyTalkTopic);
        tapByElement(submitReplyTopicBtn);

        return new TalkScreen(driver);
    }

    public TalkScreen tapSeeMoreTalkTopic() {
        WaitUntilElementIsVisible(btnSeeMoreTalkTopic);
        tapByElement(btnSeeMoreTalkTopic);
        return new TalkScreen(driver);
    }

    public TalkScreen getListRecentTalkTopic() {
        isElementPresent(listRecentTalkTopic);
        return new TalkScreen(driver);
    }

    public TalkScreen checkBeforeSort() {
        beforeSort = firstTopic.getText();
        System.out.println("before sort"+" "+beforeSort);
        return new TalkScreen(driver);
    }
    
    public TalkScreen sortTopicByNewest() {
        tapByElement(sortGroupDetail);
        tapByElement(sortTopicByNewest);
        return new TalkScreen(driver);
    }

    public TalkScreen sortTopicByPopular() {
        tapByElement(sortGroupDetail);
        tapByElement(sortTopicByPopular);
        return new TalkScreen(driver);
    }

    public TalkScreen sortTopicByMostTalks() {
        tapByElement(sortGroupDetail);
        tapByElement(sortTopicByMostTalks);
        return new TalkScreen(driver);
    }

    public TalkScreen checkAfterSortNewest() {
        afterSort = firstTopic.getText();
        System.out.println("after sort"+" "+afterSort);
        Assert.assertEquals(afterSort, beforeSort);
        return new TalkScreen(driver);
    }
    
    public TalkScreen checkAfterSortPopularMostTalks() {
        afterSort = firstTopic.getText();
        System.out.println("after sort"+" "+afterSort);
        Assert.assertNotEquals(afterSort, beforeSort);
        return new TalkScreen(driver);
    }
    
    public TalkScreen checkBeforeSortTalk() {
        beforeSort = firstTalk.getText();
        System.out.println("before sort"+" "+beforeSort);
        return new TalkScreen(driver);
    }

    public TalkScreen sortTalkByNewest() {
        tapByElement(sortGroupDetail);
        tapByElement(sortTalkByNewest);
        return new TalkScreen(driver);
    }

    public TalkScreen sortTalkByOldest() {
        tapByElement(sortGroupDetail);
        tapByElement(sortTalkByOldest);
        return new TalkScreen(driver);
    }

    public TalkScreen sortTalkByMostLikes() {
        tapByElement(sortGroupDetail);
        tapByElement(sortTalkByMostLikes);
        return new TalkScreen(driver);
    }

    public TalkScreen checkAfterSortNewestTalks() {
        afterSort = firstTalk.getText();
        System.out.println("after sort"+" "+afterSort);
        Assert.assertEquals(afterSort, beforeSort);
        return new TalkScreen(driver);
    }

    public TalkScreen checkAfterSortOldestMostLikes() {
        afterSort = firstTalk.getText();
        System.out.println("after sort"+" "+afterSort);
        Assert.assertNotEquals(afterSort, beforeSort);
        return new TalkScreen(driver);
    }
    
}
