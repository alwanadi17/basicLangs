package com.tutorial;

public class Main {
    public static void main(String[] args) {
        //unary operation is an operation that only using one variable

        //unary + and -
        int n = -1;
        int m = 1;
        System.out.printf("unary '+' terhadap n, %d -> %d\n", n, +n);
        System.out.printf("unary '-' terhadap n, %d -> %d\n", n, -n);
        System.out.println("n = " + n);
        System.out.printf("unary '+' terhadap m, %d -> %d\n", m, +m);
        System.out.printf("unary '-' terhadap m, %d -> %d\n", m, -m);
        System.out.println("m = " + m);

        System.out.println("unary '+' and '-' tidak merubah value\n");

        //unary increment dan decrement
        //increment n
        System.out.println("n = " + n);
        n++;
        System.out.println("n increment = " + n);

        //decrement m
        System.out.println("m = " + m);
        m--;
        System.out.println("m decrement= " + m);

        //postfix and prefix
        int num = 10;
        System.out.println("num = " + num);
        System.out.println("num prefix dengan '++', ++num = " + ++num);
        System.out.println("hasil prefix num = " + num);
        System.out.println("num postfix dengan '++', num++ = " + num++);
        System.out.println("hasil postfix num = " + num);
        System.out.println("increment dan decrement merubah value\n");

        //boolean unary dengan negasi (!)
        boolean b = true;
        System.out.println("b = " + b);
        System.out.println("!b = " + !b);
        System.out.println("b = " + b);
        System.out.println("Negasi (!) tidak merubah value");

    }
}
