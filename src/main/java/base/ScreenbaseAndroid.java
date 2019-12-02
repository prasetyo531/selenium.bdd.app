package base;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverFactory;

public class ScreenbaseAndroid extends DriverFactory {

    protected WebDriverWait wait;

    public void loadElements(){

        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
}
