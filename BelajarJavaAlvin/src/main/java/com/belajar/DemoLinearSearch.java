package com.belajar;

public class DemoLinearSearch {
    public static int[] getIndexesByArray(int target, int [] array) {
        int [] capacityTemp = new int[array.length];

        for (int i=0; i < array.length; i++) {
            if (target == array[i]) {
                capacityTemp[i] = array[i];
            }
        }

        return capacityTemp;
    }

    public static int getIndexByArray(int target, int [] array) {

        for (int i=0; i < array.length; i++) {
            if (target == array[i]) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int [] kumpulan = { 23, 45, 32, 78, 90, 32,  32};
        int targetPencarian = 32;

        int [] arr = getIndexesByArray(targetPencarian, kumpulan);

        for (int num: arr) {
            if (num == targetPencarian) {
                System.out.println(num);
            }
        }
    }
}