package com.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {0,1,2,3,4};
        int n = 0;

        System.out.print("input index ke-n: ");
        try {
            n = in.nextInt();
        } catch (Exception e) {
            System.err.println(e);
            System.out.println("n = " + n);
        }

        try {
            System.out.println("arr[n] = " + arr[n]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("array di luar batas");
        } finally {
            System.out.println("finally"); //always run whether it's error or not
        }
        
    }
}
