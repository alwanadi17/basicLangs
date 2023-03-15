package com.tutorial;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream fileIn = new FileInputStream("input.txt");
        System.out.println("fileIn = " + fileIn);
        System.out.println((char)fileIn.read());
        System.out.println((char)fileIn.read());
        System.out.println((char)fileIn.read());
        System.out.println((char)fileIn.read());
        System.out.println((char)fileIn.read());

    }
}
