package com.belajar.belajarlist;

import java.util.ArrayList;

public class DemoArrayListLanjutan {
    public static void main(String[] args) {
        ArrayList<String> anotherStudents = new ArrayList<String>();
        anotherStudents.add("Budi");
        anotherStudents.add("Andi");
        anotherStudents.add("Santi");

        ArrayList<String> students = new ArrayList<String>();
        students.addAll(anotherStudents);
        System.out.println(students.isEmpty());
        System.out.println(students);
        // contains
        System.out.println(students.contains("andi"));
        // toArray
        String[] samples = students.toArray(new String[0]);
        System.out.println(samples[0]);
        System.out.println(samples[1]);
        System.out.println(samples[2]);

        ArrayList<String> stm = new ArrayList<String>();
        anotherStudents.add("Budi2");
//        anotherStudents.add("Andi");
        anotherStudents.add("Santi2");

        System.out.println(students.containsAll(stm));
    }
}