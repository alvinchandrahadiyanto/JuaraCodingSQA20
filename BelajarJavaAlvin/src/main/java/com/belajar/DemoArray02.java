package com.belajar;

public class DemoArray02 {
    public static void main(String[] args) {
        int[] myArray = new int[4];

        int index = 0;
        int value = 10;
        for (int i : myArray) {
            myArray[index] = value * (index + 1);
            index++;
        }

        for (int i : myArray) {
            System.out.println(i);
        }
    }
}