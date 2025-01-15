package com.belajar.books;

public class HardCopy extends Buku {


    private int stock;

    public void decreaseStock(int qty) {
        this.stock -= qty;

    }

    public void checkFulfillment(String store) {
        System.out.println("buku fisik");
    }

    public void checkStock() {
        System.out.println("Title: " + getTitle());
        System.out.println("Stock available in: ");
        System.out.println("Store SCBD: " + 10);
        System.out.println("Store Kalibata: " + 20);
        System.out.println("Store Mall Puri Indah: " + 45);
    }
}
