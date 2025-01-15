package com.belajar.belajarcollection;

public class Mobil {
    private String merk;
    private int price;

    Mobil(String merk, int price) {
        this.merk = merk;
        this.price = price;
    }

    public String getMerk() {
        return merk;
    }

    public int getPrice() {
        return price;
    }
}
