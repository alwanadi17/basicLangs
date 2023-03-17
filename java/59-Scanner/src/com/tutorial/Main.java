package com.tutorial;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader fileIn = new FileReader("input.txt");
        BufferedReader buffIn = new BufferedReader(fileIn);
        buffIn.mark(200);

        Scanner in = new Scanner(buffIn);
        in.useDelimiter(",");

        while (in.hasNext()) {
            System.out.println(in.next());
        }


        //separate all word with string tokenizer
        System.out.println();
        System.out.println();
        buffIn.reset();
        String str = buffIn.readLine();
        System.out.println("str = " + str);

        StringTokenizer strToken = new StringTokenizer(str);
        System.out.println("strToken = " + strToken.countTokens());

        while (strToken.hasMoreTokens()) {
            System.out.println(strToken.nextToken()); //default delimiter is space
        }

        str = buffIn.readLine();
        strToken = new StringTokenizer(str);

        while (strToken.hasMoreTokens()) {
            System.out.println(strToken.nextToken(","));
        }
    }
}
