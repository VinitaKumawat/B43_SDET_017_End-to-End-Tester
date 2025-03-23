package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

@CucumberOptions(
    features = "src/test/resources/features",
    glue = {"stepDefinition", "utils"},
    plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/cucumber.json"}
)
public class TestRunner extends AbstractTestNGCucumberTests {

    @BeforeSuite
    public void setup() {
        System.out.println("Setting up before running the tests...");
    }

    @AfterSuite
    public void tearDown() {
        System.out.println("Cleaning up after running the tests...");
    }
}
