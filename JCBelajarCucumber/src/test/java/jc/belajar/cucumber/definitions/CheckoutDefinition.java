package jc.belajar.cucumber.definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class CheckoutDefinition {
    @Given("User has items in the cart")
    public void step01() {
        System.out.println("CheckoutDefinition:step01()");
    }

    @When("User proceeds to checkout")
    public void step02() {
        System.out.println("CheckoutDefinition:step02()");
    }

    @And("User enters valid payment details")
    public void step03() {
        System.out.println("CheckoutDefinition:step03()");
    }

    @And("User confirms the order")
    public void step04() {
        System.out.println("CheckoutDefinition:step04()");
    }

    @Then("User should see an order confirmation message")
    public void step05() {
        System.out.println("CheckoutDefinition:step05()");
        Assert.assertEquals(true, false);
    }
}
