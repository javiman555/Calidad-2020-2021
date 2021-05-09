package gradle.cucumber;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        plugin = {"pretty",
                "html:target/cucumber",
                "json:target/cucumber.json",
                "html:build/cucumber-html-report",
                "json-pretty:build/cucumber-report.json"})
public class RunTest {


}
