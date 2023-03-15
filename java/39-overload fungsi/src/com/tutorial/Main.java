package com.tutorial;

public class Main {
    public static void main(String[] args) {
        //method overload
        //it is a method that can have parameter more than one type data
        print(1);
        print(1.1f);
        print(1.2d);
        print("Hello world");
    }

    private static void print(int angkaInt) {
        System.out.println(angkaInt);
    }
    private static void print(float angkaFloat) {
        System.out.println(angkaFloat + "f");
    }
    private static void print(double angkaDouble) {
        System.out.println(angkaDouble + "d");
    }
    private static void print(String string) {
        System.out.println(string);
    }
}
