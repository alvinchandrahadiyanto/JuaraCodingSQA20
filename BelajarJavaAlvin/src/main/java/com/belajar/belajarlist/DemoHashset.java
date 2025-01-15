package com.belajar.belajarlist;

import java.util.HashSet;

public class DemoHashset {
    public static void main(String[] args) {
        HashSet<String> x = new HashSet<String>();

        x.add("Xiami");
        x.add("Sumsang");
        x.add("Ipool");
//        x.add("Sumsang");
        System.out.println(x.size());
        System.out.println(x);
    }
}
