package com.belajar;

public class TernaryOperator {
    public static void main(String[] args) {
        int myValueSQA = -1;
        int standardCompanyQA = 6;

        int salary = (myValueSQA > standardCompanyQA) ? 10000000 :
                (myValueSQA > 0) ? 50000000 : 0;
        System.out.println(salary);
    }
}