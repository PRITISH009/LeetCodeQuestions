package com.dsa.theory.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        // Specifying number of columns is not necessary
        int[][] arr = new int[3][];

        int[][] initializedArr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // This is because the first size defines the number of rows that are present
        // which declares how many integer arrays will be present
        // The number of columns are not necessary (it can also be variable) because we don't need
        // to define the memory (like in case of declaration of 1D array) Hence just giving 1 size
        // means how many integer arrays are declared. But allocating memories is not necessary;

        // We can declare variable sizes in multi dimensional array
        int[][] variableSizeArr = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };

        // Input -
        Scanner in = new Scanner(System.in);
        int[][] inputIn2DArr = new int[3][3];

        for(int row=0; row<inputIn2DArr.length; row++){
            for(int col=0; col<inputIn2DArr[row].length; col++){
                inputIn2DArr[row][col] = in.nextInt();
            }
        }

        // output
        // Method 1
        for(int row=0; row<inputIn2DArr.length; row++){
            System.out.println(Arrays.toString(inputIn2DArr[row]));
        }

        // Method 2
        for(int[] a : inputIn2DArr) {
            System.out.println(Arrays.toString(a));
        }

        // Taking input in a variable size array

        for(int row = 0; row < arr.length; row++) {
            System.out.println("Input Size for Array " + (row + 1));
            int size = in.nextInt();
            arr[row] = new int[size];
            System.out.println("Input Elements for Array " + (row + 1));
            for(int col = 0; col < size; col++) {
                arr[row][col] = in.nextInt();
            }
        }

        for(int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }
    }
}
