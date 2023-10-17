package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","html:target/default-html-reports","json:target/default-html-reports/cucumber.json",
                "rerun:target/reports/rerun.txt"},
        features = {"src/test/resources/testCasesFeature/NhsCostResult.feature"},
        glue = {"src/test/java/stepdefinitions"},
        tags = {"@nhsTask1"},
        monochrome = true,
        dryRun = false
)
public class Runners {
        public Runners() {
        }
}
