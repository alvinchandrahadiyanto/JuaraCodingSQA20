package com.belajar.belajarlist;

import java.util.ArrayList;

public class DemoCarts {
    public static void main(String[] args) {
        Cart carts = new Cart();
        carts.addProduct(new Product("P1", 100, 1200));
        carts.addProduct(new Product("P2", 140, 5200));
        carts.addProduct(new Product("P3", 540, 8200));

        carts.getCart(1).addQty();
        carts.getCart(1).addQty();
        carts.getCart(1).addQty();
        carts.calculateTotal();

        carts.display();

    }
}
