package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= "Features/MyTest.feature", glue="sample/CreationCompte")
public class RunnerClass {
	

}
