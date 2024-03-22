package com.dsa.theory.arrays;

public class L3_Looping {
    public static void main(String[] args) {
        int[] arr = new int [10];

        // Normal loop to work with indexes
        for(int i=0; i<arr.length; i++) {
            arr[i] = i + 1;
        }

        // Loop to get all elements -
        System.out.println("Printing Elements from the array");
        for(int num: arr) {
            System.out.print(num + " ");
        }

    }
}
