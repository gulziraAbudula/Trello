import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json"
        , "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-extentReports/report.html"},
        features = {"classpath:trello_feature"},
        tags = {"@login"},
        dryRun = false)

public class TestRunner {
}
