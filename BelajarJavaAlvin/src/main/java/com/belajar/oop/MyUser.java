package com.belajar.oop;

public class MyUser {
    public static void main(String[] args) {
        User budiAtmaja = new User();
        budiAtmaja.setUsername("budiatmaja92");
        budiAtmaja.setPassword("123mimintamvan");

        System.out.println("Username: " + budiAtmaja.getUsername());
        System.out.println("Password: " + budiAtmaja.getPassword());
    }
}
