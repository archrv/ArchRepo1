package stepdefinitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions (features = "Features/LinkedinLogin.feature", glue = {"stepdefinitions"}, plugin = {"html:target"}, 
					monochrome = true, dryRun = false)

public class TestRunner {

}
