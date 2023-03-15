package com.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //ternary operator

        Scanner in = new Scanner(System.in);
        int a, x;

        System.out.print("Input angka: ");
        a = in.nextInt();

        x = (a < 0) ? (a * -10) : (a * 10);
        System.out.println("x = " + x);

    }
}
