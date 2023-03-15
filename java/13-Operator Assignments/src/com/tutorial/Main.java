package com.tutorial;

public class Main {
    public static void main(String[] args) {
        //operator assignment
        System.out.println("assignment operator assigning to the variable after doing operation");
        int a = 100;
        System.out.println("a = " + a);
        a += 20;
        System.out.println("a += 20, a = " + a);
        System.out.println("Syntax: <variable> <operation>= <value>");
        System.out.printf("Ex: a -= 50, a = %d\n", a -= 50);
        System.out.println("a = " + a);
    }
}
