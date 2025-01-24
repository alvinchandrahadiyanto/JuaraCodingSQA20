package com.belajartestng.authentication;

import com.belajartestng.drivers.DriverSingleton;
import com.belajartestng.drivers.utils.BrowserType;
import com.belajartestng.pages.authentications.DashboardPage;
import com.belajartestng.pages.authentications.SignInPage;
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
        driver = DriverSingleton.driver;
    }

    @Test
    public void signInTest() {
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
