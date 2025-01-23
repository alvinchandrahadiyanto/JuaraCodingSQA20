package com.juaracoding;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

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

            // Positive test Login
            login("standard_user","secret_sauce");

            // Step validation Positive test Login
            WebElement titleWeb = driver.findElement(By.xpath("//span[@class='title']"));
            String actual = titleWeb.getText();
            String expected = "Products";

            // Assert Login Positive test Login
            assertEquals(actual,expected,"Login");
            delay(5);

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

            delay(5);

            //Membuka Shop Cart
            WebElement ShopCart = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
            ShopCart.click();

            delay(5);

            logout();

            delay(5);

            // Negative test Login

            login("locked_out_user","secret_sauce");

            delay(5);

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
        driver.findElement(By.linkText("Logout")).click();
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
        if(actual.equals(expected)){
            System.out.println(Test+" Passed");
        } else {
            System.out.println(Test+" Failed");
        }
    }
}