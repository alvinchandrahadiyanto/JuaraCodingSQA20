package org.ujian;

import java.util.Scanner;

public class HargaTiket {
    public static void main(String[] args) {
        int jumlahMinimalTiketDapatDiskon = 6;
        float diskon = (float) 0.1;
        int hargaTiket = 35000;
        Scanner input = new Scanner(System.in);
        System.out.println("1.Senin");
        System.out.println("2.Selasa");
        System.out.println("3.Rabu");
        System.out.println("4.Kamis");
        System.out.println("5.Jumat");
        System.out.println("6.Sabtu");
        System.out.println("7.Minggu");

        try {
            System.out.print("Masukan Nilai Hari Ini (1-7): ");
            int day = input.nextInt();
            if (day < 1 || day > 7) {
                System.out.println("Masukan Nilai Hari yang benar");
                System.exit(0);
            } else if (day > 5) {
                hargaTiket = 45000;
            }
            System.out.print("Masukan Jumlah Tiket Yang Ingin dibeli: ");
            int jumlahTiket = input.nextInt();
            if (jumlahTiket < 1) {
                System.out.println("Jumlah Tiket tidak boleh kurang dari 1");
            } else if (jumlahTiket < jumlahMinimalTiketDapatDiskon) {
                System.out.println("Jumlah Tiket: "+jumlahTiket);
                System.out.println("Total Harga: "+hargaTiket*jumlahTiket);
            }else {
                System.out.println("Jumlah Tiket: "+jumlahTiket);
                System.out.println("Total Harga: "+hargaTiket*jumlahTiket*(1-diskon));
            }
        }
        catch(Exception e) {
            System.out.println(e.toString());
        }
    }
}
