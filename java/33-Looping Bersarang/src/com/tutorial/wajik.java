package com.tutorial;

import java.util.Scanner;

public class wajik {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        byte n;

        System.out.print("input lebar: ");
        n = in.nextByte();

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                System.out.print(' ');
            }

            for (int j = 0; j < n; j++) {
                System.out.print("* ");
                if (i == j) break;
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i-1; j >= 0; j--) {
                System.out.print(' ');
            }

            for (int j = 0; j < n; j++) {
                if (i == 0) break;
                System.out.print("* ");
                if (i + j == n-1) break;
            }
            if (i != 0) System.out.println();
        }
    }
}
