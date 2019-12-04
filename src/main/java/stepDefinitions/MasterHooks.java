package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.DriverFactory;

import java.io.IOException;

public class MasterHooks extends DriverFactory {

    @Before
    public void setup() throws IOException, InterruptedException {

        driver = getDriver();
    }

    @After
    public void tearDown() throws InterruptedException, IOException {
        endDriver();
    }
}
