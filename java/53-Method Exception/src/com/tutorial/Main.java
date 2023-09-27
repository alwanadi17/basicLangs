package com.tutorial;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        while(true) {
            try {
                fun();
            } catch (Exception e) {
                System.out.println("inside main");
                System.out.println("e = " + e);
            }

            System.out.println();
            int[] arr = {0, 1, 2, 3, 4, 5};
            int n;

            System.out.print("input index ke-n:");
            n = in.nextInt();

            try {
                System.out.println(printData(arr, n));
            } catch (Exception e) {
                System.err.println("index di luar batas");
                System.err.println("e = " + e);
            }
        }
    }

    private static void fun() throws Exception {
        System.out.println("inside fun");
        throw new Exception("demo");
    }

    private static int printData(int[] arr, int i) throws Exception {
        return arr[i];
    }
}
