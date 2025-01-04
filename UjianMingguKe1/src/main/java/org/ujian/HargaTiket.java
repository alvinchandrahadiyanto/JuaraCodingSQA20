package org.ujian;

import java.util.Scanner;

public class HargaTiket {
    public static void main(String[] args) {
        int jumlahMinimalTiketDapatDiskon = 5;
        float Diskon = (float) 0.1;
        Scanner input = new Scanner(System.in);
        System.out.println("1.Senin");
        System.out.println("2.Selasa");
        System.out.println("3.Rabu");
        System.out.println("4.Kamis");
        System.out.println("5.Jumat");
        System.out.println("6.Sabtu");
        System.out.println("7.Minggu");
        System.out.print("Masukan Nilai Hari Ini (1-7): ");
        int day = input.nextInt();
        System.out.print("Masukan Jumlah Tiket Yang Ingin dibeli: ");
        int jumlahTiket = input.nextInt();
        int hargaTiketWeekday = 35000;
        int hargaTiketWeekend = 45000;
    }
}
