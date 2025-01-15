package com.belajar;

public class DemoArray03 {
    public static void main(String[] args) {
        String[] daftarNamaKaryawan = {
                "Andi", "Budi", "Santo",
                "Wina", "Wenty", "Siska"
        };

        for (int i = 0; i < daftarNamaKaryawan.length; i++) {
            System.out.println(daftarNamaKaryawan[i]);
        }
        System.out.println(" ");
        for (String nama : daftarNamaKaryawan) {
            System.out.println(nama);
        }
    }
}