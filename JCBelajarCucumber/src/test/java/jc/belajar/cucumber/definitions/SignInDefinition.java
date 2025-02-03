package jc.belajar.cucumber.definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignInDefinition {
    @Given("User is on the signin page")
    public void step01() {
        System.out.println("SignInDefinition:step01()");
    }

    @When("User enters valid username and password")
    public void step02() {
        System.out.println("SignInDefinition:step02()");
    }

    @And("User clicks the signin button")
    public void step03() {
        System.out.println("SignInDefinition:step03()");
    }

    @Then("User should be redirected to the homepage")
    public void step04() {
        System.out.println("SignInDefinition:step04()");
    }
}