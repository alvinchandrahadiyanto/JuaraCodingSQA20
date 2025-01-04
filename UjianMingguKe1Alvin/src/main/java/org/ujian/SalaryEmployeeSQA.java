package org.ujian;

import java.util.Scanner;

public class SalaryEmployeeSQA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String divisi = "";
        String level = "";
        int salary = 0;
        int standardCompanySQA = 6;
        int standardSeniorAutomation = 8;
        int standardSeniorManual = standardCompanySQA;

        try {
            System.out.print("MASUKKAN NAMA KANDIDAT: ");
            String nama = input.nextLine();

            System.out.print("MASUKKAN NILAI KANDIDAT (0-10): ");
            int myValueSQA = input.nextInt();

            if (myValueSQA > standardCompanySQA) {
                divisi = "QA Automation";

                if (myValueSQA >= standardSeniorAutomation) {
                    level = "Senior";
                    salary = 10000000;
                } else {
                    level = "Junior";
                    salary = 8000000;
                }
            } else if (myValueSQA != 0) {
                divisi = "QA Manual";
                if (myValueSQA == standardSeniorManual) {
                    level = "Senior";
                    salary = 8000000;
                } else {
                    level = "Junior";
                    salary = 6000000;
                }
            } else {
                System.out.println("Maaf Anda tidak memenuhi kualifikasi");
                System.exit(0);
            }
            System.out.println("NAMA = " + nama);
            System.out.println("DIVISI = " + divisi);
            System.out.println("LEVEL = " + level);
            System.out.println("SALARY/MONTH = IDR. " + salary);
        }
        catch(Exception e) {
            System.out.println(e.toString());
        }
    }
}
