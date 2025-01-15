package com.belajar.belajarlist;

import java.util.LinkedList;

public class DemoLinked {
    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList<>();
        myList.add("001");
        myList.add("002");
        myList.add("003");
        myList.add("004");

        System.out.println("SIZE: " + myList.size());
        System.out.println("ITEMS: " + myList);

        myList.addFirst("000");
        myList.addLast("005");

        System.out.println("SIZE: " + myList.size());
        System.out.println("ITEMS: " + myList);

        myList.set(1, "A001");
        myList.set(4, "A004");

        System.out.println("SIZE: " + myList.size());
        System.out.println("ITEMS: " + myList);

        myList.removeFirst();
        myList.removeLast();
        System.out.println("SIZE: " + myList.size());
        System.out.println("ITEMS: " + myList);

        myList.remove(1);
        System.out.println("SIZE: " + myList.size());
        System.out.println("ITEMS: " + myList);
    }
}
