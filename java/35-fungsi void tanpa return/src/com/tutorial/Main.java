package com.tutorial;

public class Main {
    public static void main(String[] args) {
        sayHi("Alwan");
        sayHi("hello world");
        sayHi("bro");
    }

    private static void sayHi(String input) {
        //void function is a function with no return
        System.out.println("HI " + input);
    }
}
