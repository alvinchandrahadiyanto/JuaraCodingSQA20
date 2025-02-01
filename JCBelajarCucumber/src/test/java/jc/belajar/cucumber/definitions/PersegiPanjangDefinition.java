package jc.belajar.cucumber.definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class PersegiPanjangDefinition {
    private int length;
    private int width;
    private int result;

    @Given("saya punya meja dengan panjang {int} cm.")
    public void haveATableWith(int length) {
        System.out.println("dipanggil....");
        this.length = length;
    }

    @And("lebarnya {int} cm.")
    public void andHave(int width) {
        this.width = width;
    }

    @When("saya menghitung luas meja tersebut.")
    public void calculate() {
        this.result = this.width * this.length;
    }

    @Then("hasilnya harus {int}.")
    public void resultMustBe(int expected) {
        int actual = result;
        result = 0;
        Assert.assertEquals(actual, expected);
    }


}
