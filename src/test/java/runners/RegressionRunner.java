package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",//generates reports in the console as well
                "html:target/cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-reports/cucumber.xml"
        },
        monochrome = true,//makes the console reports more readable
        features = "./src/test/resources/features",//path of the features folder
        glue = {"stepdefinitions", "hooks"},//path of the stepdefinitions folder and hooks folder
        dryRun = false, //generate the missing step definitions only. Do not run the existing step definitions
        tags = ""
)
public class RegressionRunner {
}
//use @regression tag in some test scenarios

