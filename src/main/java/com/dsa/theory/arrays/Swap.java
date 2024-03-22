package com.dsa.theory.arrays;

import java.util.Arrays;

public class Swap {

    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 9, 18};
        swap(arr, 1, 3);

        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
