package com.belajartestng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class OOT {
    //    @Test(timeOut = 1011)
    @Test()
    @Parameters("x")
    public void test(int x) throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        System.out.println(x + 5);
//        int counter = 0;
//        while (counter < 1020) {
//            counter++;
//            System.out.println("aaa");
//        }

    }
}