package com.belajar.oop;

public class MyKalkulator {
    public static void main(String[] args) {
        Kalkulator k1 = new Kalkulator();
        System.out.println("sum(int, int): " + k1.sum(1, 10));
        System.out.println("sum(int, string): " + k1.sum(1, "Ini contoh"));
    }
}