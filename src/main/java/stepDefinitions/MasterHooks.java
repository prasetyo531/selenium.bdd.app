package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.AppiumDriver;
import utils.AppiumServer;
import utils.CommonUtils;
import utils.DriverFactory;

import java.io.IOException;

public class MasterHooks extends DriverFactory {

    @Before
    public void setUp() throws IOException, InterruptedException{

        driver = getDriver();

    }


    @After
    public void tearDown() throws InterruptedException, IOException {
        //driver.quit();
        AppiumServer.stop();

    }
}
