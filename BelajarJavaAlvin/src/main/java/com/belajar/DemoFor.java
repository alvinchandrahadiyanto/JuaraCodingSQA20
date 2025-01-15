package com.belajar;

public class DemoFor {
    public static void main(String[] args) {
        System.out.println("Looping");
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        for (int i = 5; i > 0; i--) {
            System.out.print(i);
        }

        System.out.println();

//         1,3,5,7,9
//         1. ubah increment
        for (int i = 1; i < 10; i=i+2) {
            System.out.print(i);
        }
        System.out.println(" ");
        //2. if mod
        for (int i = 1; i < 10; i++) {
            if (i%2==1) System.out.print(i);
        }
        System.out.println();

//        *
//        **
//        ***

        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

//        ***
//        **
//        *

        for (int i = 1; i < 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
