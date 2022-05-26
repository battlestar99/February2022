package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features  = "Features",
		glue = "stepDefinitions",
		plugin = {"pretty", "html:report"}
//		tags = {"@standardUser"}
		)


public class TestRunner {
	

}
