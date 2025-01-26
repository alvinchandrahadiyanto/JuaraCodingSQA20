package com.ujianMingguKe3.authentication;

import com.ujianMingguKe3.drivers.DriverSingleton;
import com.ujianMingguKe3.drivers.utils.BrowserType;
import com.ujianMingguKe3.pages.authentications.DashboardPage;
import com.ujianMingguKe3.pages.authentications.SignInPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SignInTestAdmin {
    private SignInPage signInPage;
    private DashboardPage dashboardPage;
    private WebDriver driver;

    @BeforeClass
    public void setup() {
        System.out.println("teststststs");
//        System.setProperty("webdriver.chrome.driver","C:\\chromedriver-win64\\chromedriver.exe");
//        driver = new EdgeDriver();
        driver = DriverSingleton.getDriver(BrowserType.CHROME);
    }

    @Test
    public void signInTest() {
        System.out.println("lele goreng");
        driver.get("http://127.0.0.1:8000/admin");
        signInPage = new SignInPage(driver);
        signInPage.loginActivity("admin", "admin");

        dashboardPage = new DashboardPage(driver);

        String expected = "Welcome to Demo SQA Testing Portal";
        String actual = dashboardPage.getTextWelocmeHeadingElement();

//        Assert.assertTrue(actual.toLowerCase().equals(expected.toLowerCase()));
        Assert.assertEquals(actual.toLowerCase(), expected.toLowerCase());
    }
}
