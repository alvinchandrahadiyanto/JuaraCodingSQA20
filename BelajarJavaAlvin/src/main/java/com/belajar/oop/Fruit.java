package com.belajar.oop;

public class Fruit {
    private int grams;
    private int calsPerGrams;

    int totalCalories() {
        return grams * calsPerGrams;
    }

    public int getGrams() {
        return grams;
    }

    public void setGrams(int grams) {
        this.grams = grams;
    }

    public int getCalsPerGrams() {
        return calsPerGrams;
    }

    public void setCalsPerGrams(int calsPerGrams) {
        if (calsPerGrams <= 0) {
            this.calsPerGrams = 1;
        } else {
            this.calsPerGrams = calsPerGrams;
        }

    }
}
