package stepDefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import pageObjects.ActionBase;
import utils.AppiumServer;
import utils.CommonUtils;
import utils.DriverFactory;

import java.io.IOException;
import java.time.Duration;

public class MasterHooks extends DriverFactory {

    Runtime rt = Runtime.getRuntime();

    @Before
    public void setUp() throws IOException, InterruptedException {

        System.out.println("setUp");
        driver = getDriver();

        System.out.println("driver before : "+driver);
    }

    @After
    public void tearDownScreenshootFailure(Scenario scenario) throws InterruptedException, IOException {
        try {
            switch (this.loadPropertyFile) {
                case "android.properties":
                    driver.closeApp();
                    driver.resetApp();
                    System.out.println("need reset app");
                    //AppiumServer.killPort();
                    break;
                case "ios.properties":
                    Thread.sleep(800);
                    driver.closeApp();
                    driver.removeApp(CommonUtils.BUNDLEID);
                    driver.installApp(CommonUtils.APPDIR);
                    driver.launchApp();
                    System.out.println("no need reset app");
                    break;
            }

            if (driver !=null && scenario.isFailed()) {
                //ActionBase.captureScreenshot();
                ActionBase.sendMessageToTelegram(scenario.getName(), scenario.getStatus());
                AppiumServer.stop();
            } if (driver != null) {
                AppiumServer.stop();
                System.out.println("end of test");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

