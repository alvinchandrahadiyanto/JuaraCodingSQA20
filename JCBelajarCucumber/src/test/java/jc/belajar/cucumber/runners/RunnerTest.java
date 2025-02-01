package jc.belajar.cucumber.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {
                "src/test/resources/features/Persegi.feature",
                "src/test/resources/features/Kalkulator.feature",
        },
        glue = {
                "jc.belajar.cucumber.definitions",
        }
)
public class RunnerTest extends AbstractTestNGCucumberTests {
}
