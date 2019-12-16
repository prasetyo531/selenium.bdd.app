package androidPageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class AndroidHomeScreen extends ActionBaseAndroid{

    /**********
     tab bar
     **********/
    @AndroidFindBy(accessibility="Home")
    public AndroidElement homeTab;

    @AndroidFindBy(accessibility="Feed")
    public AndroidElement feedTab;

    @AndroidFindBy(accessibility="Discover")
    public AndroidElement discoverTab;

    @AndroidFindBy(accessibility="com.fdbr.android.debug:id/")
    public AndroidElement plusTab;

    @AndroidFindBy(accessibility="com.fdbr.android.debug:id/")
    public AndroidElement profileTab;

    /*
    home screen
     */
    @AndroidFindBy(id="com.fdbr.android.debug:id/id_addreview")
    public AndroidElement addReview;

    @AndroidFindBy(id="com.fdbr.android.debug:id/id_addpost")
    public AndroidElement addPost;

    @AndroidFindBy(id="com.fdbr.android.debug:id/id_addproduct")
    public AndroidElement addProduct;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'com.fdbr.android.debug:id/buttonCancel') and @text='Cancel']")
    public AndroidElement cancel;

    @AndroidFindBy(xpath ="//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[4]")
    public AndroidElement firstindextproductmatches;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'com.fdbr.android.debug:id/textMatch') and @text='Match: Skin Type, Skin Undertone']")
    public AndroidElement productMatchesSkinTypeAndSkinUndertone;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'com.fdbr.android.debug:id/textMatch') and @text='Match: Skin Type, Skin Tone']")
    public AndroidElement productMatchesSkinTypeAndSkinTone;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'com.fdbr.android.debug:id/textMatch') and @text='Match: Skin Tone']")
    public AndroidElement productMatchesSkinTone;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'com.fdbr.android.debug:id/textMatch') and @text='Match: Skin Type']")
    public AndroidElement productMatchesSkinType;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'com.fdbr.android.debug:id/textMatch') and @text='Match: Hair Type']")
    public AndroidElement productMatchesHairType;

    // This is a constructor, as every page need a base driver to find android elements
    public AndroidHomeScreen(AppiumDriver driver) throws IOException {

        this.driver = driver;
        //Initialize Elements of a Page class without having to use ‘FindElement‘ or ‘FindElements‘
        PageFactory.initElements(new AppiumFieldDecorator(this.driver),this);
    }

}
