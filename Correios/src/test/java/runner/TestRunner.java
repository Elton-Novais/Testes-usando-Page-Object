package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Sempre IT\\OneDrive\\Área de Trabalho\\Estudo-Automação\\Testes-usando-Page-Object\\Correios\\src\\test\\java\\feature\\Passos.feature",
 glue = "stepsCorreios", plugin = {"pretty"})
public class TestRunner {
}
