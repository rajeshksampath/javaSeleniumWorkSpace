package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/java/Feature",
		glue="stepDefinition")
public class TestNGTestrunner extends AbstractTestNGCucumberTests {

}
