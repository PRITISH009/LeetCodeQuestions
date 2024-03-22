package com.dsa.theory.arrays;

public class MaxItem {
    public static void main(String[] args) {
        int[] arr = {1, 2 ,3, 9, 9, 22, -3, 22};

        int maxItem = max(arr, 0, arr.length);

        System.out.println("Max Item - " + maxItem);
    }

    static int max(int[] arr, int start, int length) {
        int max = Integer.MIN_VALUE;
        for(int i=start; i<length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
