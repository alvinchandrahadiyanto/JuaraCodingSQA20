package com.juaracoding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
import java.util.List;

public class CollectionSelenium {

    static WebDriver driver;

    public static void main(String[] args) {
        System.out.println("Selenium 4");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Documents\\Juara Coding Bootcamp\\others\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

        // locator
        login("standard_user","secret_sauce");

        List<WebElement> listproduct = driver.findElements(By.xpath("//div[@class='inventory_item_name ']"));

        System.out.println("Jumlah Product: "+listproduct.size());

        for (int i = 0; i < listproduct.size(); i++) {
            // Mengambil teks dari elemen Web
            String productName = listproduct.get(i).getText();
            System.out.println("Nama Produk: " + productName);
        }

        List<WebElement> addToCartButtons = driver.findElements(By.xpath("//button[contains(@class, 'btn_primary btn_small btn_inventory')]"));

        System.out.println("Jumlah tombol Add to Cart: " + addToCartButtons.size());

        // Klik setiap tombol Add to Cart
        for (int i = 0; i < addToCartButtons.size(); i++) {
            addToCartButtons.get(i).click(); // Klik tombol Add to Cart
            System.out.println("Tombol Add to Cart ke-" + (i + 1) + " diklik.");
        }

        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();

        // Mendapatkan elemen harga produk
        List<WebElement> priceElements = driver.findElements(By.className("inventory_item_price"));

        System.out.println("Jumlah Produk: " + priceElements.size());

        // Mengambil harga setiap produk dan mengonversi ke float

        float totalHarga = 0.0f;

        for (int i = 0; i < priceElements.size(); i++) {
            String priceText = priceElements.get(i).getText(); // Mengambil teks harga
            priceText = priceText.replace("$", ""); // Menghapus simbol dolar (atau simbol lainnya)

            try {
                float price = Float.parseFloat(priceText); // Mengonversi ke float
                totalHarga += price;
                System.out.println("Harga Produk ke-" + (i + 1) + ": " + price);
            } catch (NumberFormatException e) {
                System.out.println("Gagal mengonversi harga: " + priceText);
            }
        }

        System.out.println("Total Harga: "+totalHarga);

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();

    }

    // method login
    private static void login(String username, String password){
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
        driver.findElement(By.name("login-button")).click();
    }

    // custom assertion if

}