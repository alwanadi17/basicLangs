package com.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //recursive sederhana
        Scanner in = new Scanner(System.in);
        int n;

        System.out.println("Factorial\n");
        System.out.print("input angka: ");
        n = in.nextInt();

        System.out.printf("Factorial %d = %d\n", n, factorial(n));
    }

    private static int factorial(int n) {
        if (n == 1) {
            System.out.println("1");
            return 1;
        } else {
            System.out.printf("%d*", n);
            return n * factorial(n-1);
        }
    }
}
