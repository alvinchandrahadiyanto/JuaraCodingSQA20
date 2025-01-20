package com.belajartestng;

import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class Demo5Test {
    //    @Test(timeOut = 1011)
    @BeforeGroups(groups = {"g2", "g4"})
    public void beforeGroup() {
        System.out.println("Before group g2 dan g4");
    }

    @AfterGroups(groups = {"g2"})
    public void afterGroup() {
        System.out.println("After group g2");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Demo2Test:: before suite method");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("Demo2Test:: after suite method");
    }

    @BeforeClass
    public void beforeClass() {

        System.out.println("Demo2Test:: BeforeClass Method");

    }

    @AfterClass
    public void afterClass() {
        System.out.println("Demo2Test:: AfterClass Method");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Demo2Test:: before Method ");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("Demo2Test:: after Method ");
    }

    @Test(groups = {"g1", "g2"})
    @Parameters("x")
    public void test1(int x) throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        System.out.println("test1: " + x);
    }

    @Test(groups = {"g4", "g5"})
    @Parameters({"x", "nama"})
    public void test2(String x, String nama) throws InterruptedException {
//        TimeUnit.SECONDS.sleep(1);
        System.out.println("test2:" + x);
        System.out.println("test2:" + nama);
    }

    @Test(groups = {"g2"})
    public void test03() {
        System.out.println("test03");
    }

}
