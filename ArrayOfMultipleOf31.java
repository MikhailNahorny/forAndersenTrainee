package com.nahornyi.toandersen.task3;

import java.util.Arrays;

public class ArrayOfMultipleOf31 {
    public static void main(String[] args) {
        int[] arg = new int[31];
        for (int i = 0; i <= 30; i++) {
            arg[i] = i;
        }
        System.out.println();
        filterArrayWithCycle(arg);
    }

    public static void filterArrayWithCycle(int[] arg) {
        //for case if I don't need to save or return filtered array but to print only
        if (arg == null) throw new IllegalArgumentException("bad argument");
        System.out.println("given array:");
        System.out.println(Arrays.toString(arg));
        System.out.print("filtered array:\n[");
        for (int i = 0; i < arg.length; i++) {
            if (arg[i] % 3 == 0) {
                System.out.print(arg[i] + ", ");
            }
        }
        System.out.println("\b\b]");
    }
}
