package googlesearchstepdefinitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features/GoogleSearchResults.feature", glue = {"googlestepdefinitions"}, plugin = {"html:target"}, monochrome = true, dryRun = false)

public class TestRunner {

}
