package stepDefinitions;

import pageObjects.ActionBase;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.AppiumServer;
import utils.DriverFactory;

import java.io.IOException;

public class MasterHooks extends DriverFactory {

    @Before
    public void setUp() throws IOException, InterruptedException {

        driver = getDriver();

    }

    @After
    public void tearDownScreenshootFailure(Scenario scenario) throws InterruptedException, IOException {
        try {
            if (driver !=null && scenario.isFailed()) {
                ActionBase.captureScreenshot();
                AppiumServer.stop();
            } if (driver != null) {
                AppiumServer.stop();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    /* attaching images to report at dir target/cucumber
    @After
    public void tearDown() throws InterruptedException,IOException {

        AppiumServer.stop();
    }
    */
}

