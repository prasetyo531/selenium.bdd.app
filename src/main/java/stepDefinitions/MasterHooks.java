package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.AppiumDriver;
import utils.AppiumServer;
import utils.CommonUtils;
import utils.DriverFactory;

import java.io.IOException;

public class MasterHooks extends DriverFactory {

    //set configuration
    public static String loadPropertyFile = "android.properties";

    @Before
    public void setUp() throws IOException, InterruptedException{

        if(driver==null){

            AppiumServer.stop();
            AppiumServer.start();

            if(loadPropertyFile.contains("ios")){
                CommonUtils.loadIosConfigProp("ios.properties");
                CommonUtils.setIOSCapabilities();
                driver = CommonUtils.getIOSDriver();
            } else if(loadPropertyFile.contains("android")){
                CommonUtils.loadAndroidConfigProp("android.properties");
                CommonUtils.setAndroidCapabilities();
                driver = CommonUtils.getAndroidDriver();
            }
        }

    }


    @After
    public void tearDown() throws InterruptedException, IOException {
        //driver.quit();
        AppiumServer.stop();

    }
}
