package com.belajar.books;

public class SoftCopy extends Buku {
    /**
     * penerapan variable hiding
     * yang menandakan bahwasanya variabel
     * tidak dapat di override, hanya dapat
     * di hiding.
     */
//    public String title = "amirah";



    public void reading() {
//        super.title = "Ayam";
//        System.out.println(super.title);
//        System.out.println(this.title);
        System.out.println("BACA...PDF");
    }

    /**
     * method hiding ada dengan kondisi
     * yang memiliki behavior yang sama dengan
     * variabel hiding. Catatan, bahwasanyanya
     * method hiding hanya dapat diterapkan ke dalam
     * method static.
     */

//    public static void info() { // Method hiding
//        System.out.println("Ini adalah Mobil.");
//    }
}
