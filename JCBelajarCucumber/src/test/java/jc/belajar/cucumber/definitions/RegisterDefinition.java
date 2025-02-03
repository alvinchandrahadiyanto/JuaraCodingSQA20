package jc.belajar.cucumber.definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterDefinition {
    @Given("User is on the registration page")
    public void step01() {
        System.out.println("RegisterDefinition:step01()");
    }

    @When("User enters valid registration details")
    public void step02() {
        System.out.println("RegisterDefinition:step02()");
    }

    @And("User submits the registration form")
    public void step03() {
        System.out.println("RegisterDefinition:step03()");
    }

    @Then("User should see a success message")
    public void step04() {
        System.out.println("RegisterDefinition:step04()");
    }
}
