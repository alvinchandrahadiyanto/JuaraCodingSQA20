package com.belajartestng;

import org.testng.annotations.Test;

public class Demo4Test {
    @Test(priority = 5)
    public void test01() {
        System.out.println("test01: 5");
    }

    @Test(priority = -5)
    public void test02() {
        System.out.println("test02: -5");
    }
}
