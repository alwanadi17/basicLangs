package com.tutorial;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class MarkReset {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("input.txt");
//        BufferedInputStream buffIn = new BufferedInputStream(in,3); //error resetting to invalid mark, buffIn don't have enough size
//        BufferedInputStream buffIn = new BufferedInputStream(in,5); //error resetting to invalid mark, buffIn don't have enough size
        BufferedInputStream buffIn = new BufferedInputStream(in); //still don't understand why mark need readlimit

        System.out.println((char)buffIn.read());
        System.out.println((char)buffIn.read());
        buffIn.mark(0);
        System.out.println("mark called");
        System.out.println((char)buffIn.read());
        System.out.println((char)buffIn.read());
        System.out.println((char)buffIn.read());
        System.out.println((char)buffIn.read());
        System.out.println((char)buffIn.read());
        buffIn.reset();
        System.out.println("reset called");
        System.out.println((char)buffIn.read());
        System.out.println((char)buffIn.read());
        System.out.println((char)buffIn.read());
        System.out.println((char)buffIn.read());
        System.out.println((char)buffIn.read());
        System.out.println((char)buffIn.read());
        buffIn.reset();
        System.out.println("reset called");
        System.out.println((char)buffIn.read());
        System.out.println((char)buffIn.read());
        System.out.println((char)buffIn.read());
        System.out.println((char)buffIn.read());
        System.out.println((char)buffIn.read());
        System.out.println((char)buffIn.read());
        System.out.println((char)buffIn.read());
        System.out.println((char)buffIn.read());
        System.out.println((char)buffIn.read());


    }
}
