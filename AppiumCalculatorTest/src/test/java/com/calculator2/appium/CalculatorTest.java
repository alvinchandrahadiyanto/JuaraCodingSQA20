package com.calculator2.appium;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class CalculatorTest {
    AndroidDriver driver;
    DesiredCapabilities capabilities;
    UiAutomator2Options options;

    public void launchApp() throws InterruptedException, IOException {
        ProcessBuilder pb = new ProcessBuilder(
                "C:\\Windows\\System32\\cmd.exe",
                "/c",
                "adb.exe",
                "shell", "am", "start",
                "-n", "com.digitalchemy.calculator.freedecimal/.Calculator");
        Process pc = pb.start();
        pc.waitFor();
    }

    @BeforeTest
    public void setup() throws InterruptedException, IOException {
        launchApp();

        capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appium:deviceName", "emulator-5554");
        capabilities.setCapability("appium:automationName", "UiAutomator2");

        options = new UiAutomator2Options();
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.hideKeyboard();
    }

    @Test
    public void penjumlahanTest() {
        WebElement buttonClear = driver.findElement(AppiumBy.accessibilityId("Clear"));
        WebElement buttonNine = driver.findElement(AppiumBy.accessibilityId("9"));
        WebElement buttonPlus = driver.findElement(AppiumBy.accessibilityId("Plus"));
        WebElement buttonFive = driver.findElement(AppiumBy.accessibilityId("5"));
        WebElement buttonEqual = driver.findElement(AppiumBy.accessibilityId("Calculation"));
        WebElement textEdit = driver.findElement(AppiumBy.id("com.sec.android.app.popupcalculator:id/calc_edt_formula"));

        buttonClear.click();
        buttonNine.click();
        buttonPlus.click();
        buttonFive.click();
        buttonEqual.click();

        Assert.assertEquals(textEdit.getText(), "14 Calculation result");

    }

    @AfterTest
    public void tearDone() {
        driver.quit();
    }
}