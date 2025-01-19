package org.BelajarTesNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    @Test
    public void add(){
        int actualResult = Calculator.add(10,20);
        int expectedResult = 30;

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void subtract(){
        int actualResult = Calculator.subtract(10,20);
        int expectedResult = -10;

        Assert.assertEquals(actualResult, expectedResult);
    }
}
