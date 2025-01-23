package com.juaracoding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class UjianMingguKe3Selenium {
    static WebDriver driver;

    public static void main(String[] args) {
        try {
            System.out.println("Selenium 4");
            System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Documents\\Juara Coding Bootcamp\\others\\chromedriver-win64\\chromedriver.exe");
            driver = new ChromeDriver();
            new WebDriverWait(driver, Duration.ofSeconds(20)); // Pengganti driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.get("https://www.saucedemo.com/");

            System.out.println(driver.getCurrentUrl());
            System.out.println(driver.getTitle());

    // Positive test
            System.out.println("==== Positive Test ====");
            // Login
            login("standard_user","secret_sauce");

            // Step validation Positive test Login
            WebElement titleWeb = driver.findElement(By.xpath("//span[@class='title']"));
            String actual = titleWeb.getText();

            // Assert Login Positive test Login
            assertEquals(actual,"Products","Login");
            delay(2);

            // Menguji Fitur Add to Cart
            List<WebElement> addToCartButtons = driver.findElements(By.xpath("//*[@class='btn btn_primary btn_small btn_inventory ']"));

            // Klik setiap tombol Add to Cart
            for (int i = 0; i < addToCartButtons.size(); i++) {
                addToCartButtons.get(i).click(); // Klik tombol Add to Cart
            }

            List<WebElement> AssertAddCartButtons = driver.findElements(By.xpath("//*[@class='btn btn_secondary btn_small btn_inventory ']"));
            if(addToCartButtons.size()==AssertAddCartButtons.size()){
                for (int i = 0; i < AssertAddCartButtons.size(); i++) {
                    assertEquals(AssertAddCartButtons.get(i).getText(),"Remove","Tombol Add to Cart ke "+(i+1)); // Assert Add to Cart
                }
            }else {
                System.out.println("Tombol Add to Cart Failed");
            }

            delay(2);

            //Membuka Shop Cart
            WebElement shopCart = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
            shopCart.click();
            delay(3);

            //Checkout Shop Cart
            WebElement checkout = driver.findElement(By.xpath("//button[@id='checkout']"));
            checkout.click();

            //Fill Identity
            WebElement firstName = driver.findElement(By.xpath("//input[@id='first-name']"));
            WebElement lastName = driver.findElement(By.xpath("//input[@id='last-name']"));
            WebElement postalCode = driver.findElement(By.xpath("//input[@id='postal-code']"));

            firstName.sendKeys("Budi");
            lastName.sendKeys("Setiawan");
            postalCode.sendKeys("4125");

            //Continue payment
            WebElement goCheckout = driver.findElement(By.xpath("//input[@id='continue']"));
            goCheckout.click();

            WebElement finishCheckout = driver.findElement(By.xpath("//button[@id='finish']"));
            finishCheckout.click();

            delay(2);
            logout();
            delay(2);

    // Negative test
            System.out.println(" ");
            System.out.println("==== Negative Test ====");

            // Login
            login("locked_out_user","secret_sauce");
            WebElement loginFail = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3"));
            System.out.println(loginFail.getText());
            actual=loginFail.getText();

            assertEquals(actual,"Epic sadface","Fail Login");

            delay(2);

            driver.quit();
        }
        catch(Exception e) {
            System.out.println(e.toString());
            driver.quit();
        }
    }

    // method login
    private static void login(String username, String password){
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
    }

    private static void logout(){
        // step logout id=react-burger-menu-btn, logout_sidebar_link
        driver.findElement(By.id("react-burger-menu-btn")).click();
        driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")).click();
    }

    public static void delay(long second){
        try {
            Thread.sleep(second*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    // custom assertion if assertEquals()
    public static void assertEquals(String actual, String expected, String Test){
        if(actual.contains(expected)){
            System.out.println(Test+": Passed");
        } else {
            System.out.println(Test+": Failed");
        }
    }
}