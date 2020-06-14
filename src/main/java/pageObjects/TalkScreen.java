package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.List;

public class TalkScreen extends ActionBase {

    @AndroidFindBy(id="com.fdbr.android:id/swipeRepoList")
    public List<MobileElement> topicList;

    // This is a constructor, as every page need a base driver to find android elements
    public TalkScreen(AppiumDriver driver) throws IOException {

        this.driver = driver;
        //Initialize Elements of a Page class without having to use ‘FindElement‘ or ‘FindElements‘
        PageFactory.initElements(new AppiumFieldDecorator(this.driver),this);
    }

    //find topic talk
    public TalkScreen scrollTopicTalk(){
        try {
            for (int i = 0; i < 4; i++) {
                isElementEnabled(topicList);
                this.verticalSwipeByPercentages(topicList,0.4,0.01,0.5,500);
                topicList.get(i).click();
            }
        }catch (Exception e){
            e.getMessage();
        }
        return new TalkScreen(driver);
    }

}
