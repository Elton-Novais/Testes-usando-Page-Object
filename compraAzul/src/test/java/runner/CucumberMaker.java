package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Sempre IT\\IdeaProjects\\compraAzul\\src\\test\\java\\feature", glue = "steps")

public class CucumberMaker {
}
