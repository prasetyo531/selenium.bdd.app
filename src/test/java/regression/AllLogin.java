package regression;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;

import java.io.IOException;
import java.nio.file.FileSystems;

@RunWith(Cucumber.class) //this annotations tells junit run test
@CucumberOptions(
        features = {"src/test/java/feature"},
        glue = {"stepDefinitions"},
        monochrome = true,
        tags = {"@Regression","@RealAccount", "@RealDevices", "@Android, @Login", "~@Ios, ~@Login", "~@WIP"},
        plugin =  {"pretty","html:test-output/cucumber", //report 1, index html
                "json:test-output/cucumber/cucumber.json",  //report 2
                "com.cucumber.listener.ExtentCucumberFormatter:test-output/cucumber/report.html",  //report 3
                "rerun:test-output/cucumber/rerun.txt",
                "usage:test-output/cucumber/cucumber-usage.json"}
)

public class AllLogin extends AbstractTestNGCucumberTests {

    @AfterClass
    public static void writeExtentReport() throws IOException {
        String userDirectory = FileSystems.getDefault()
                .getPath("")
                .toAbsolutePath()
                .toString();
        System.out.println("directory"+" "+userDirectory);

        Reporter.loadXMLConfig(userDirectory +"/src/main/java/utils/ReportsConfig.xml");
    }
}

//@Regression, @RealAccount, @RealDevices, @IntegrationTest", "~@Android, ~@Login", "@Ios, @Login", "~@WIP
//{"@Regression, @RealAccount, @RealDevices, @IntegrationTest", "@Ios", "@Login"},