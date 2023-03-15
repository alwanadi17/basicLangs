package com.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //program sum a to b

        Scanner in = new Scanner(System.in);
        int a, b, res;

        System.out.println("Program sum a to b\n");

        System.out.print("input a: ");
        a = in.nextInt();
        System.out.print("input b: ");
        b = in.nextInt();

        res = 0;
        while(a <= b) {
            res = res + a;
            System.out.printf("hasil ditambah %d = %d\n", a++, res);
        }
    }
}
