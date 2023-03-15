package com.tutorial;

//import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
                if (i == j) break;
            }
            System.out.println();
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("* ");
                if (i + j == 3) break;
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print("* ");
                if (i == j) break;
                if (i+j == 8) break;
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < 5; i++) {
            for (int j = 5; j >= 0; j--) {
                System.out.print("* ");
                if (i == j-1) break;
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < 5; i++) {
            for (int j = i+1; j < 5; j++) {
                System.out.print(' ');
            }

            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
                if (i == j) break;
            }
            System.out.println();
        }

        for (int i = 0; i < 5; i++) {
            for (int j = i-1; j >= 0; j--) {
                System.out.print(' ');
            }

            for (int j = 0; j < 5; j++) {
                if (i == 0) break;
                System.out.print("* ");
                if (i + j == 4) break;
            }
            if (i != 0) System.out.println();
        }
    }
}
