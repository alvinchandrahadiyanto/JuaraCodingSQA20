package org.ujian;

import java.util.Scanner;

public class BiayaTintaPerLembar {
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        //40ml CMY 7500 halaman dan 40 ml K 4500 halaman
        //CMYK = 7500 + 4500 /2 = 6000
        try {
            double cmyk = 6000;
            double priceTinta = 216860;
            double constantBaseCoverage = 5;

            System.out.print("MASUKKAN baseCoverage (5-100): ");
            double baseCoverage = input.nextDouble();
            if (baseCoverage < 5 || baseCoverage > 100) {
                System.out.println("Masukan Nilai baseCoverage yang benar");
                System.exit(0);
            }

            double hasilBaseCoverage = baseCoverage /constantBaseCoverage;
            double pageDiv = cmyk / hasilBaseCoverage;
            double result = priceTinta /pageDiv;
            int resultFinal = (int) Math.ceil(result);
            System.out.println(resultFinal);
        }
        catch(Exception e) {
            System.out.println(e.toString());
        }
    }
}