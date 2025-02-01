package jc.belajar.cucumber.definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class PenguranganDefinition {
    private int angkaPertama;
    private int angkaKedua;
    private int hasil;

    @Given("saya memiliki angka {int}")
    public void saya_memiliki_angka(int angka) {
        this.angkaPertama = angka;
    }

    @Given("saya memiliki angka kedua {int}")
    public void saya_memiliki_angka_kedua(int angka) {
        this.angkaKedua = angka;
    }

    @When("saya mengurangi angka kedua dari angka pertama")
    public void saya_mengurangi_angka_kedua_dari_angka_pertama() {
        this.hasil = angkaPertama - angkaKedua;
    }

    @Then("hasil pengurangan harus {int}")
    public void hasil_pengurangan_harus(int expectedHasil) {
        Assert.assertEquals(expectedHasil, hasil);
    }
}