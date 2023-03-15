package com.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p,l;

        System.out.println("Program menggambar persegi panjang");
        System.out.print("input panjang: ");
        p = in.nextInt();
        System.out.print("input lebar: ");
        l = in.nextInt();

        printGmtry(p,l);
        print(p,l);
    }

    private static void print(int p, int l) {
        System.out.println("\nkeliling: " + keliling(p,l));
        System.out.println("luas: " + luas(p,l));

    }

    private static void printGmtry(int p, int l) {
        //xor swap
        System.out.println();
        if (l > p) {
            System.out.println("Lebar > panjang, swap panjang dan lebar");
            l ^= p;
            p ^= l;
            l ^= p;
        }

        if (l == p) System.out.println("it's a square, but it's fine");

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < p; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static int keliling(int p, int l) {
        return 2*(p+l);
    }

    private static int luas(int p, int l) {
        return p*l;
    }
}
