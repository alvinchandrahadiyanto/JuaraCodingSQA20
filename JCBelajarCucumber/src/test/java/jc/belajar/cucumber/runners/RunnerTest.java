package jc.belajar.cucumber.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "",
//        monochrome = false,
        features = {
//                "src/test/resources/features/Persegi.feature",
//                "src/test/resources/features/Kalkulator.feature",
//                "src/test/resources/features/Segitiga.feature",
                "src/test/resources/features/Authentication.feature",
                "src/test/resources/features/Checkout.feature",
        },
        glue = {
                "jc.belajar.cucumber.hooks",
                "jc.belajar.cucumber.definitions",
        },
        plugin = {
                "pretty",
                "html:target/cucumbers/reports.html",
                "json:target/cucumbers/reports.json",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        }
)
public class RunnerTest extends AbstractTestNGCucumberTests {
}