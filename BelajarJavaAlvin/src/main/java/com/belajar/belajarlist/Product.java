package com.belajar.belajarlist;

public class Product {
    private String name;
    private int stock;
    private int price;

    Product(String name, int stock, int price) {
        this.name = name;
        this.stock = stock;
        this.price = price;
    }

    public void display() {
        System.out.println(name);
        System.out.println("Stock: " + stock);
        System.out.println("Price: " + price);
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    public int getPrice() {
        return price;
    }
}
