package com.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float a, b, res;
        char c;

        System.out.println("Kalkulator sederhana\n");
        System.out.print("input angka pertama: ");
        a = in.nextFloat();
        System.out.print("input operator: ");
        c = in.next().charAt(0);
        System.out.print("input angka kedua: ");
        b = in.nextFloat();

        System.out.printf("\ninput: %.1f %c %.1f\n", a, c, b);

        if (c == '+') res = a+b;
        else if (c == '-') res = a-b;
        else if (c == '*') res = a*b;
        else if (c == '/') {
            if (b == 0) {
                System.out.println("pembagi oleh nol, result error");
                res = Float.MAX_VALUE;
            } else res = a / b;
        }
        else {
            System.out.println("operator tidak ditemukan");
            res = 0;
        }

        System.out.printf("hasil: %.1f\n", res);
    }
}
