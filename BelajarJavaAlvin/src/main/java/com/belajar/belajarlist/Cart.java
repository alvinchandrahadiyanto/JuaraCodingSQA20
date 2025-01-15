package com.belajar.belajarlist;

import java.util.ArrayList;

public class Cart {
    private ArrayList<CartMapper> carts;
    private int total;


    Cart() {
        carts = new ArrayList<CartMapper>();
        total = 0;
    }

    public ArrayList<CartMapper> getCarts() {
        return carts;
    }

    public CartMapper getCart(int i) {
        return carts.get(i);
    }

    public void addProduct(Product product) {
        carts.add(CartMapper.addProduct(product));
    }

    void display() {

        for (CartMapper cartmapper: carts) {
            System.out.println(cartmapper.getName());
            System.out.println("price " + cartmapper.getPrice());
            System.out.println("stock " + cartmapper.getStock());
            System.out.println("qty " + cartmapper.getQty());
        }

        System.out.println("TOTAL YANG HARUS DIBAYAR: " + getTotal());
    }

    void calculateTotal() {
        for (CartMapper cartmapper: carts) {
            this.total += cartmapper.getTotal();
        }
    }

    public int getTotal() {
        return total;
    }
}
