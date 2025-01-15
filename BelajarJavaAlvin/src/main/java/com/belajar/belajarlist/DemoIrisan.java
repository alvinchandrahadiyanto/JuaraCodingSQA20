package com.belajar.belajarlist;

import java.util.ArrayList;

public class DemoIrisan {
    public static void main(String[] args) {
        ArrayList<String> batch20 = new ArrayList<String>();
        batch20.add("Glen");
        batch20.add("Yonas");
        batch20.add("Alvin");

        ArrayList<String> batch21 = new ArrayList<>();
        batch21.add("Uus");
        batch21.add("Feronika");
        batch21.add("Sandi");
        batch21.add("Glen");
        batch21.add("Yonas");

        batch20.retainAll(batch21);

//        System.out.println(batch20);

        ArrayList<String> hobiGlen = new ArrayList<String>();
        ArrayList<String> hobiMeymand = new ArrayList<String>();

        hobiGlen.add("Naik Gunung"); // dibuang
        hobiGlen.add("Puisi"); // dibuang
        hobiGlen.add("Berkuda"); // dibuang
        hobiGlen.add("Berenang");

        hobiMeymand.add("Mancing");
        hobiMeymand.add("Bersepeda");
        hobiMeymand.add("Berenang");


        hobiGlen.retainAll(hobiMeymand);

//        System.out.println(hobiGlen);

        // lowongan
        // - java
        // - sql
        // - automation
        // - selenium

        ArrayList<String> lowongan = new ArrayList<>();
        lowongan.add("java");
        lowongan.add("sql");
        lowongan.add("automation");
        lowongan.add("selenium");

        // pelamar x
        // - java
        // - sql
        // - python
        // - git

        ArrayList<String> pelamar = new ArrayList<>();
        pelamar.add("java");
        pelamar.add("sql");
        pelamar.add("python");
        pelamar.add("git");

        pelamar.retainAll(lowongan);

        System.out.println(pelamar);
        int size = pelamar.size();

        if (size<3){
            System.out.println("Anda tidak memenuhi kualifikasi");
        }else{
            System.out.println("Anda diterima");
        }

        // syarat minimum diterima minimal punya 3 keahlian yang sesuai
        // anda tidak sesuai

    }
}
