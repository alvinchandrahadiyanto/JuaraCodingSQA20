package com.belajar.books;

public class MyBook {
    public static void main(String[] args) {
        SoftCopy softCopy = new SoftCopy();
        softCopy.reading();
        // override
        System.out.println(softCopy.title);
        SoftCopy.info();
//        softCopy.checkStock();
//        softCopy.decreaseStock(1);
    }
}