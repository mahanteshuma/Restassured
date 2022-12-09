package TestRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty",
        "html:target/cucumber-reports/cucumber.html"
        },
        features = {"src/test/resources/Features"},
        glue = {"StepDefinitions"},
        publish = true,
        tags = "@Smoke"

)
public class TestRunnerPOM extends AbstractTestNGCucumberTests {

}
