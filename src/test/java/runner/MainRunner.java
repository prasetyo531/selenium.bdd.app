package runner;

import pageObjects.ActionBase;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;

import java.io.IOException;

@RunWith(Cucumber.class) //this annotations tells junit run test
@CucumberOptions(
        features = {"src/test/java/feature"},
        glue = {"stepDefinitions"},
        monochrome = true,
        tags = {"@ios"},
        plugin = {"pretty","html:target/cucumber", //report 1, index html
                "json:target/cucumber.json",  //report 2
                "com.cucumber.listener.ExtentCucumberFormatter:target/report.html",  //report 3
                "rerun:target/cucumber/rerun.txt",
                "usage:target/cucumber-usage.json"}
)

public class MainRunner extends AbstractTestNGCucumberTests {

    @AfterClass
    public static void writeExtentReport() throws IOException {
        //Reporter.loadXMLConfig(new File(System.getProperty("user.dir") + "//src//main//java//utils//ReportsConfig.xml"));
        ActionBase.copyLatestExtentReport();
    }
}
