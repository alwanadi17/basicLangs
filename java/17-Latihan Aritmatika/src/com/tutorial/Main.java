package com.tutorial;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //define "in" as new object Scanner

        int s;
        System.out.printf("PERSEGI\n\n");
        System.out.printf("input sisi persegi(int): ");
        s = in.nextInt();

        System.out.printf("Keliling: %d\n", s*4);
        System.out.printf("Luas: %d\n", s*s);
    }
}
