package com.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n, a, b, res;
        System.out.println("Program deret fibonacci");

        System.out.print("input deret ke-n: ");
        n = in.nextInt();

        a = 0;
        b = 1;
        res = 0;

        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", res);
            res = a + b;
            a = b;
            b = res;
        }
        System.out.println("\n==============");
    }
}
