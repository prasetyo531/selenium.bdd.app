package stepDefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utils.AppiumServer;
import utils.CommonUtils;
import utils.DriverFactory;

import java.io.IOException;

public class MasterHooks extends DriverFactory {

    @Before
    public void setUp() throws IOException, InterruptedException {

        driver = getDriver();

    }

    /* attaching images to report at dir target/cucumber */
    @After
    public void tearDown() throws InterruptedException,IOException {

        AppiumServer.stop();
    }
}

    /* attaching images to report at dir target/cucumber
    @After
    public void tearDownScreenshootFailure(Scenario scenario) throws InterruptedException, IOException {
        try {
            if (driver !=null && scenario.isFailed()) {
                scenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES), "images.png");
                driver.quit();
                AppiumServer.stop();
            } if (driver != null) {
                driver.quit();
                AppiumServer.stop();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
     */
