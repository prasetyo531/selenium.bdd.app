package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/feature/"},
        glue = {"stepDefinitions"},
        monochrome = true,
        tags = {"@android"},
        plugin = {"pretty","html:target/cucumber", //report 1, index html
                "json:target/cucumber.json",  //report 2
                "com.cucumber.listener.ExtentCucumberFormatter:target/report.html",  //report 3
                "rerun:target/cucumber/rerun.txt",
                "usage:target/cucumber-usage.json"}
)

public class MainRunner {

}
