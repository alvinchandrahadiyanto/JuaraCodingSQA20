package com.belajar.belajarlist;

public class Tiket {
    private String kode;
    private int stok;
    private int qty;
    private int price;

    Tiket(String kode, int stok, int price) {
        this.kode = kode;
        this.stok = stok;
        this.price = price;
        this.setQty(1);
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void display() {
        System.out.println(kode);
        System.out.println("STOK: " + stok);
        System.out.println("QTY: " + qty);
    }

    public int subtotal() {
        return this.qty * this.price;
    }
}
