package com.tutorial;

public class Main {
    public static void main(String[] args) {
        System.out.println("Konversi data numerik dengan casting");

        int a;
        int b;
        float hasil;

        a = 10;
        b = 3;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        hasil = a/b;
        System.out.printf("a/b = %.1f\n", hasil); //error wrong result
        System.out.printf("a/b = %.1f\n", (float)hasil); //error wrong computation at hasil
        hasil = (float) a/b;
        System.out.printf("a/b = %.1f\n", hasil);
    }
}
