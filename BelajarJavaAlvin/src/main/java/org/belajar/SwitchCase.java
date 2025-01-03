package org.belajar;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        char nilai;
        Scanner input = new Scanner(System.in);

        System.out.print("MASUKKAN NILAI PESERTA (A-D): ");
        nilai = input.next().charAt(0);

        switch (nilai){
            case 'A':
                System.out.println("Best Employee");
                break;
            case 'B':
                System.out.println("Nice Employee");
                break;
            case 'C':
                System.out.println("Good Employee");
                break;
            case 'D':
                System.out.println("Bad Employee");
                break;
            default:
                System.out.println("Try again");
        }
    }
}
