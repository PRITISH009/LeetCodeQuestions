package com.dsa.theory.arrays;

import java.util.Scanner;

public class L1_TakingInputForProgram {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        String name;

        System.out.println("Enter your name - ");
        name = in.nextLine();

        System.out.println("You Entered - " + name);
    }
}
