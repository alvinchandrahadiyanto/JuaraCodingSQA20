package com.belajar.belajarcollection;

public class Customer {
    private String name;
    private String email;
    private Mobil[] listOfMobil;

    Customer(String name, String email, int totalOfMobil) {
        this.name = name;
        this.email = email;
        this.listOfMobil = new Mobil[totalOfMobil];
    }

    void addMobil(Mobil mobil) {
        this.listOfMobil[listOfMobil.length - 1] = mobil;
    }

    void cetakMobil() throws NullPointerException {
        for (Mobil m: listOfMobil) {
            System.out.println(m.getMerk() + " " + m.getPrice());
        }
    }
}
