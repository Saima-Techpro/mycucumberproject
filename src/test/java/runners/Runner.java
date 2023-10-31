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
        tags = "@excel"
)
public class Runner {
}
/*
Runner class is used to run the feature files
And add some report plug ins
Runner class also connects the JAVA(step definitions) and NON-JAVA(feature files) parts
@RunWith(Cucumber.class) is used for making the class Runnable
@CucumberOptions is used for connecting features and step definitions. It is also used for configurations and cucumber report plugins
features is used for path of the features folder
glue is used to give the path of the step definitions folder
dryRun = true  // generates missing step defs without running the existing step defs
dryRun = false must be used to run normally

 */
