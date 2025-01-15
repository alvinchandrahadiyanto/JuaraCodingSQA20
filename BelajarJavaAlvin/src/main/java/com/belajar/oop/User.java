package com.belajar.oop;

public class User {
    private String username;
    private String phoneNumber;
    private String email;
    private String password;


    public void login(String email, String linkVerify) {
        System.out.println("login with email");
    }

    public void login(String phoneNumber, boolean sendCode) {
        System.out.println("login with phonenumber");
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
