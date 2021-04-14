package stepDefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import pageObjects.ActionBase;
import utils.AppiumServer;
import utils.CommonUtils;
import utils.DriverFactory;

import java.io.File;
import java.io.IOException;

public class MasterHooks extends DriverFactory {

    @Before
    public void setUp() throws IOException {

        System.out.println("setUp");
        driver = getDriver();

        System.out.println("driver before : "+driver);
    }

    @After
    public void tearDownScreenshootFailure(Scenario scenario) throws InterruptedException, IOException {
        if (scenario.isFailed() && driver !=null) {
            ActionBase.captureScreenshot();
            ActionBase.sendMessageToTelegram(scenario.getName(), scenario.getStatus());
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
                AppiumServer.stop();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } if (driver != null) {
            AppiumServer.stop();
            System.out.println("end of test");
        }
    }
}

