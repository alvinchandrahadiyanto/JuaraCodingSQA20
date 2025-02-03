package jc.belajar.cucumber.definitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LuasSegitigaDefinition {
    private double alas;
    private double tinggi;
    private double luas;

    @Given("saya memiliki alas segitiga {double}")
    public void punyaAlas(double alas) {
        this.alas = alas;
        System.out.println("Alas segitiga: " + alas);
    }

    @And("saya memiliki tinggi segitiga {double}")
    public void punyaTinggi(double tinggi) {
        this.tinggi = tinggi;
        System.out.println("Tinggi segitiga: " + tinggi);
//        Assert.assertTrue(false);
    }

    @When("saya menghitung luas segitiga")
    public void hitungLuas() {
        this.luas = (this.alas * this.tinggi) / 2;
        System.out.println("Menghitung luas segitiga...");
    }

    @Then("hasil hitung luas segitiga harus {double}")
    public void hasilnyaHarus(double expectedLuas) {
        System.out.println("Memeriksa hasil perhitungan...");
        Assert.assertEquals(this.luas, expectedLuas, 0.001);
        // Delta 0.001 untuk perbandingan double
    }


}
