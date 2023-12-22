package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Feature", 
glue = "stepDefinition", stepNotifications = true, tags = "@MobileTest", publish = true, monochrome = true, plugin = {
		"pretty", "html:target/cucumber.html", "json:target/cucumber.json", "junit:target/cukes.xml" })

public class TestRunner {

}
