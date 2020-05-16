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
            switch (this.loadPropertyFile) {
                case "android.properties":
                    driver.resetApp();
                    System.out.println("need reset app");
                    break;
                case "ios.properties":
                    System.out.println("no need reset app");
                    break;
            }

            if (driver !=null && scenario.isFailed()) {
                //ActionBase.captureScreenshot();
                ActionBase.sendMessageToTelegram(scenario.getName(), scenario.getStatus());
                AppiumServer.stop();
            } if (driver != null) {
                AppiumServer.stop();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

