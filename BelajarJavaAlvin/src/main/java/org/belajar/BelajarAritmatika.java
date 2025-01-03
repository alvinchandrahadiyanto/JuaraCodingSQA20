package org.belajar;

public class BelajarAritmatika {
    public static void main( String[] args )
    {
        byte num1=10;
        byte num2=35;
        int sum=num1+num2;
        System.out.println("Penjumlahan "+sum);
        int pengurangan=num1-num2;
        System.out.println("Pengurangan "+pengurangan);
        int perkalian=num1*num2;
        System.out.println("Perkalian "+perkalian);
        double pembagian=num2/num1;
        System.out.println("pembagian "+pembagian);
        double num2Double=num2;
        double pembagianPresisi=num2Double/num1;
        System.out.println("pembagian presisi "+pembagianPresisi);

        int pembagi = 4;
        int angka1 = 8;
        int angka2 = 4;
        int hasilModule1= angka1 % pembagi;
        int hasilModule2= angka2 % pembagi;
        System.out.println(hasilModule1);
        System.out.println(hasilModule2);


    }
}
