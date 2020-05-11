package runner;

import com.cucumber.listener.Reporter;
import pageObjects.ActionBase;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;

import java.io.File;
import java.io.IOException;

@RunWith(Cucumber.class) //this annotations tells junit run test
@CucumberOptions(
        features = {"src/test/java/feature"},
        glue = {"stepDefinitions"},
        monochrome = true,
        tags = {"@android"},
        plugin =  {"pretty","html:test-output/cucumber", //report 1, index html
                "json:test-output/cucumber/cucumber.json",  //report 2
                "com.cucumber.listener.ExtentCucumberFormatter:test-output/cucumber/report.html",  //report 3
                "rerun:test-output/cucumber/rerun.txt",
                "usage:test-output/cucumber/cucumber-usage.json"}
)

public class MainRunner extends AbstractTestNGCucumberTests {

    @AfterClass
    public static void writeExtentReport() throws IOException {
        Reporter.loadXMLConfig(new File(System.getProperty("user.dir") + "/src/main/java/utils/ReportsConfig.xml"));
        ActionBase.copyLatestExtentReport();
    }
}
