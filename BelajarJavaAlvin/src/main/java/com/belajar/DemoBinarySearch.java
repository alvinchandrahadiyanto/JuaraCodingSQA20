package com.belajar;

public class DemoBinarySearch {

    public static int binarySearch(int[] arr, int target, int low, int high) {
        if (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                return binarySearch(arr, target, mid + 1, high);
            } else {
                return binarySearch(arr, target, low, mid - 1);
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] data = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target = 23;
        int index = binarySearch(data, target, 0, data.length - 1);

        if (index != -1) {
            System.out.println("Elemen " + target + " ditemukan pada indeks " + index);
        } else {
            System.out.println("Elemen " + target + " tidak ditemukan dalam array");
        }
    }
}