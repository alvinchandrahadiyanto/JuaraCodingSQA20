package org.belajar;

import java.util.Scanner;

public class HargaPrint {
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        //40ml CMY 7500 halaman dan 40 ml K 4500 halaman
        //CMYK = 7500 + 4500 /2 = 6000
        double cmyk = 6000;
        double priceTinta = 216860;
        double constantBaseCoverage = 5;

        System.out.print("MASUKKAN baseCoverage: ");
        double baseCoverage = input.nextDouble();

        double hasilBaseCoverage = baseCoverage /constantBaseCoverage;
        double pageDiv = cmyk / hasilBaseCoverage;
        double result = priceTinta /pageDiv;
        int resultFinal = (int) Math.ceil(result);
        System.out.println(resultFinal);
    }
}
