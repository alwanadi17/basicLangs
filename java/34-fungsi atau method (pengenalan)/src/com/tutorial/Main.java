package com.tutorial;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = a*a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = 10;
        b = a*a;

        System.out.println("\na = " + a);
        System.out.println("b = " + b);

        a = 4;
        b = res(a);

        System.out.println("\na = " + a);
        System.out.println("b = " + b);

        a = 90;
        b = res(a);

        System.out.println("\na = " + a);
        System.out.println("b = " + b);
    }

    private static int res(int a) {
        return a*a;
    }
}
