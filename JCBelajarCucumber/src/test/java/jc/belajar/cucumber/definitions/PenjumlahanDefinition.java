package jc.belajar.cucumber.definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class PenjumlahanDefinition {
    private int one;
    private int two;
    private int actual;

    @Given("saya memiliki angka {int}")
    public void haveANumberOne(int one) {
        this.one = one;
    }

    @And("saya memiliki angka kedua {int}")
    public void haveANumberTwo(int two) {
        this.two = two;
    }

    @When("saya menjumlahkan kedua angka tersebut")
    public void calculate() {
        this.actual = this.one + this.two;
    }

    @Then("hasil penjumlahan harus {int}")
    public void resultMustBe(int expected) {
        Assert.assertEquals(actual, expected);
    }
}
