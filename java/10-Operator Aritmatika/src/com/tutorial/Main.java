package com.tutorial;

public class Main {
    public static void main(String[] args) {
        //arithmetic
        float a = 25f;
        System.out.println("a = " + a);
        float b = 2f;
        System.out.println("b = " + b);

        float hasil;

        //penjumlahan
        hasil = a+b;
        System.out.printf("a + b = %d\n", (int)hasil);

        //pengurangan
        hasil = a-b;
        System.out.printf("a - b = %d\n", (int)hasil);

        //perkalian
        hasil = a*b;
        System.out.printf("a * b = %d\n", (int)hasil);

        //pembagian
        hasil = a/b;
        System.out.printf("a / b = %.1f\n", hasil);

        //modulus
        hasil = a%b;
        System.out.printf("a %% b = %d\n", (int)hasil);
    }
}
