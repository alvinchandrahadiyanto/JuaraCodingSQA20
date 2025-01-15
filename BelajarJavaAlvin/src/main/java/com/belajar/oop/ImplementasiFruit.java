package com.belajar.oop;

import com.belajar.oop.Fruit;

public class ImplementasiFruit {
    public static void main(String[] args) {
        Fruit anggur = new Fruit();
        anggur.setGrams(15);
        anggur.setCalsPerGrams(-2);
        System.out.println(anggur.totalCalories());
    }
}
