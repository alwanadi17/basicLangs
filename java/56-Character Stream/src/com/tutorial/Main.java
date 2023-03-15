package com.tutorial;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //open input file
        FileInputStream inByte = new FileInputStream("input.txt");
        FileOutputStream outByte = new FileOutputStream("outByte.txt");

        FileReader inChar = new FileReader("input.txt");
        FileWriter outChar = new FileWriter("outChar.txt");

        //read write file
        //byte stream
        int c = inByte.read();
        while(c != -1) {
            System.out.print((char)c);
            outByte.write(c); //same results with char stream but error at System.out.print
            c = inByte.read();
        }

        System.out.println();
        System.out.println();

        //char stream
        c = inChar.read();
        while(c != -1) {
            System.out.print((char)c);
            outChar.write(c); //same results
            c = inChar.read();
        }

        //close file
        inByte.close();
        outByte.close();

        inChar.close();
        outChar.close();
    }
}
