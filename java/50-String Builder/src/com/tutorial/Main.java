package com.tutorial;

import java.lang.StringBuilder;
public class Main {
    public static void main(String[] args) {
        //declare stringbuilder
        StringBuilder str = new StringBuilder();

        printStrBuilder(str);

        //append
        System.out.println("append");
        str.append("hello ");
        printStrBuilder(str);

        str.append(16);
        printStrBuilder(str);

        str.append(" world. Throw your phone and have a great day!");
        printStrBuilder(str);

        //insert
        str.insert(str.indexOf("phone"), "hand");
        printStrBuilder(str);

        //delete
        str.delete(str.indexOf("16"),str.indexOf("16")+3);
        printStrBuilder(str);

        //set char at index
        str.setCharAt(str.indexOf("hello"), 'H');
        printStrBuilder(str);

        //replace
        str.replace(str.indexOf("have"), str.indexOf(" a great"), "start");
        printStrBuilder(str);

        //toString
        //in order to use string operator, toString is necessary
        String str1 = str.toString();
        System.out.println("str = " + str);
        System.out.println("str1 = " + str1);


    }

    private static void printStrBuilder(StringBuilder str) {
        System.out.println("data: " + str);
        System.out.println("length: " + str.length());
        System.out.println("kapasitas: " + str.capacity());
        System.out.println("address: " + Integer.toHexString(System.identityHashCode(str)));
        System.out.println();
    }
}
