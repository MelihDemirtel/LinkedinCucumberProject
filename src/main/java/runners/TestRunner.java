package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

    @CucumberOptions(
            features = {"src/test/java/features"},
            glue = {"stepDefinitions","utils"},
            plugin = {"summary","pretty", "html:target/cucumber-reports.html"},
            monochrome = true
    )

    public class TestRunner extends AbstractTestNGCucumberTests {

    }
