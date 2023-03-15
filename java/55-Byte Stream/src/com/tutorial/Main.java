package com.tutorial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream fIn = null;
        FileOutputStream fOut = null;

        //open file
        fIn = new FileInputStream("input.txt");

        //read file
        byte b = (byte) fIn.read();
        while (b != -1) {
            System.out.print((char)b);
            b = (byte) fIn.read();
        }
        System.out.println();
        System.out.println();

        //close file
        fIn.close();


        //write to output
        try {
            fIn = new FileInputStream("input.txt");
            fOut = new FileOutputStream("output.txt");

            b = (byte) fIn.read();
            while (b != -1) {
                System.out.print((char) b);
                fOut.write(b);
                b = (byte) fIn.read();
            }
        } finally {
            fIn.close();
            fOut.close();
        }

        System.out.println();
        System.out.println("fIn = " + fIn);
        System.out.println("fOut = " + fOut);
        System.out.println();

        //read write inside a scope to auto close outside the scope
        //can't use variable outside the scope, have to make new
        try (
                FileInputStream f2In = new FileInputStream("input.txt");
                FileOutputStream f2Out = new FileOutputStream("output2.txt")
        ) {
            b = (byte) f2In.read();
            while (b != -1) {
                System.out.print((char) b);
                f2Out.write(b);
                b = (byte) f2In.read();
            }
        }

        //both are dead
//        System.out.println("f2In = " + f2In);
//        System.out.println("f2Out = " + f2Out);

        System.out.println();
    }
}
