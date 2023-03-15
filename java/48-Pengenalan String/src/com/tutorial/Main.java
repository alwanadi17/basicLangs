package com.tutorial;

import java.lang.String;

public class Main {
    public static void main(String[] args) {
        //define string in stack
        String str = "hello world";
        
        //output string
        System.out.println("str = " + str);
        printAddress("str", str);

        System.out.println();
        //access a part of the string
        System.out.println("str.charAt(0) = " + str.charAt(0));

        //string is immutable, cannot be manipulated
        System.out.println("string is immutable, cannot be changed");
        System.out.println("str[0] = 'd'; //will lead to error");

        System.out.println();
        //assign defined string
        System.out.println("assign defined string");
        str = "Good morning!";
        System.out.println("str = " + str);
        printAddress("str", str);

        //change defined string through assignment
        System.out.println();
        System.out.println("change defined string through assignment");
        str = str.substring(0,5) + "world";
        System.out.println("str = " + str);
        printAddress("str", str);

        str = str.substring(0,5) + "world";
        System.out.println("str = " + str);
        printAddress("str", str);
        printAddress("str", str);
        printAddress("str", str);

        System.out.println();
        String str1 = "Good world";
        printAddress("str1", str1);

        System.out.println();
        System.out.println("String pool, address will be same as the above");
        str = "Good morning!";
        System.out.println("str = " + str);
        printAddress("str", str); //address will be same as above. Known as string pool
        System.out.println();

        /*
        string pool is a special storage for literal string
        string which made by a method won't be stored in the string pool
        */

        int n = 100;
        String str2 = "There is " + n + " sheep";
        printAddress("str2", str2);
        String str3 = "There is 100 sheep";
        printAddress("str3", str3);
        n = 50;
        str2 = "There is " + n + " sheep";
        printAddress("str2", str2);

    }

    private static void printAddress (String var, String str) {
        int id = System.identityHashCode(str);
        System.out.println(var + " = " + str + " | address: " + Integer.toHexString(id));
    }
}
