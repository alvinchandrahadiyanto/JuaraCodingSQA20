package com.belajar;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        int x =0; // assignment value
        int sum =0;
        while (x < 5){
            System.out.println(x);
            sum=sum+x;
            x++;
        }
        System.out.println("Jumlah x: "+sum);

        Scanner input = new Scanner(System.in);
        while (true){
            System.out.println("Input Angka 0 untuk menyelesaikan program: ");
            int angka = input.nextInt();
            if (angka==0){
                break;
            }
        }
    }
}
