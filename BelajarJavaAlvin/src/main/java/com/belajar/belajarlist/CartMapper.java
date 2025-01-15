package com.belajar.belajarlist;

public class CartMapper extends Product {
    private int qty;

    CartMapper(String name, int stock, int price) {
        super(name, stock, price);
        qty = 1;
    }

    public static CartMapper addProduct(Product product) {
        return new CartMapper(product.getName(), product.getStock(), product.getPrice());
    }

    public void addQty() {
        qty += 1;
    }

    public void decQty() {
        qty -= 1;
    }

    public int getQty() {
        return qty;
    }

    public int getTotal() {
        return qty * getPrice();
    }
}
