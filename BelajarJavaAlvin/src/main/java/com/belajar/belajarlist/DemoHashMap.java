package com.belajar.belajarlist;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.*;

public class DemoHashMap {
    public static void main(String[] args) {
        HashMap<String, Product> listOfProducts = new HashMap<>();
        listOfProducts.put("P1", new Product("Produk 01", 20, 120000));
        listOfProducts.put("P2", new Product("Produk 02", 50, 450000));
        System.out.println(listOfProducts);

//        System.out.println(listOfProducts.get("P2").getName());

        for (String key: listOfProducts.keySet()) {
            System.out.println(listOfProducts.get(key).getName());
        }

        for (Product p: listOfProducts.values()) {
            System.out.println(p.getName());
        }

        ArrayList<Product> products = new ArrayList<>(Arrays.asList(listOfProducts.values().toArray(new Product[0])));
        Set<String> keys = listOfProducts.keySet();
        ArrayList<String> keys2 = new ArrayList<>(Arrays.asList(listOfProducts.keySet().toArray(new String[0])));
        System.out.println(products);
        System.out.println(keys2.get(0));
        System.out.println(products.get(0).getStock());
    }
}
