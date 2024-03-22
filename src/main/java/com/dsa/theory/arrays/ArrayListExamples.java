package com.dsa.theory.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExamples {
    public static void main(String[] args) {
        // Syntax -
        ArrayList<Integer> list = new ArrayList<>(4); // Size is not mandatory to be given

        // adding elements to the list -
        list.add(10);
        list.add(100);
        list.add(1000);
        list.add(10000);
        list.add(1);
        list.add(-1);

        System.out.println(list);

        // How it dynamically increases capacity -

        // setting a particular index with a value -
        list.set(0, 0); // (index, value)

        // Get Item at any index
        System.out.println("Item at 0th Index - " + list.get(0));

        // Printing with index -
        for(int i=0; i<list.size(); i++) {
            System.out.println("Item at index " + i + " " + list.get(i));
        }

    }
}
