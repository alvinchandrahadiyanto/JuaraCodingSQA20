package com.belajar.belajarlist;

import java.util.ArrayList;

public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList<String> carts = new ArrayList<String>();
        carts.add("Wortel");
        carts.add("Lada Bubuk");
        carts.add("Minyak Goreng");

        // merubah nilai pada index tertentu
        carts.set(1, "Lada Kasar");

        // menampilkan semua list dalam kurung siku
        System.out.println(carts);

        // mengakses nilai tertentu berdasarkan index-nya.
        System.out.println(carts.get(0));

        // Menghapus item ke 1
        carts.remove(1);
        System.out.println(carts);

        // clear semua item
//        carts.clear();
//        System.out.println(carts);

        // Perulangan tradisional
        System.out.println("Perulangan Traditional: ");
        for (int i = 0; i < carts.size(); i++) {
            System.out.println(carts.get(i));
        }

        // Perulangan mudah
        System.out.println("Perulangan Mudah: ");
        for (String cart: carts) {
            System.out.println(cart);
        }
    }
}
