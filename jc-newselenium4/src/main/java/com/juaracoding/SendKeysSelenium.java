package com.juaracoding;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SendKeysSelenium {

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

        WebElement elmt = driver.findElement(By.id("user-name"));
        // enter text then ctrl+a
        elmt.sendKeys("selenium");
        elmt.sendKeys(Keys.CONTROL+"A");

        // locator
        //login("standard_user","secret_sauce");

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