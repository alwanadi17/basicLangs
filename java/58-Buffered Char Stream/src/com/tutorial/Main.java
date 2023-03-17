package com.tutorial;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //open and set mark file
        FileReader charIn = new FileReader("input.txt");
        BufferedReader buffIn = new BufferedReader(charIn);

        buffIn.mark(200);

        //readline file
        System.out.println(buffIn.readLine());
        System.out.println(buffIn.readLine());
        buffIn.reset();

        //open output file
        FileWriter charOut = new FileWriter("output.txt");
        BufferedWriter buffOut = new BufferedWriter(charOut);

        //write to output
        System.out.println();
        String tmp = buffIn.readLine();
        System.out.println("Push \"" + tmp + "\" to buffer");
        buffOut.write(tmp,0,tmp.length());
        buffOut.newLine();

        tmp = buffIn.readLine();
        System.out.println("Push \"" + tmp + "\" to buffer");
        buffOut.write(tmp,0,tmp.length());
        buffOut.newLine();

        buffOut.flush();

        //close files
        charIn.close();
        charOut.close();
        buffIn.close();
        buffOut.close();


    }
}
