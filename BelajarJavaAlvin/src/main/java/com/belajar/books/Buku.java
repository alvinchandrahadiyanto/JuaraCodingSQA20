package com.belajar.books;

public class Buku {
    private String isbn;
    public String title;
    private int price;


    public String getIsbn() {

        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static void info() {
        System.out.println("Ini adalah Kendaraan.");
    }
}
