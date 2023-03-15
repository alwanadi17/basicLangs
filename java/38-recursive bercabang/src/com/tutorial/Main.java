package com.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //fibonacci
        //multiple recursive was a dangerous algorithm due to its complexity
        Scanner in = new Scanner(System.in);
        int n;

        System.out.println("Fibonacci");
        System.out.print("input n: ");
        n = in.nextInt();
        System.out.println("Fibonacci ke-n = " + fibonacci(n));
    }

    private static int fibonacci(int n) {
        if (n == 1 || n == 0) {
            return n;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}
