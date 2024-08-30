package cucumberProject;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:/Users/User/eclipse-workspace/cucumberProject/src/test/resources/Features",
		glue="stepdefinition",
		plugin= {"pretty"}
		)
public class runner {

}
