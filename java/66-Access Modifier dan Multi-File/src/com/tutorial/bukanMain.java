package com.tutorial;

public class bukanMain {
    //terdapat 4 macam access modifier
    //dan terdapat beberapa level dalam pengaksesan
    //skala class dan package
    public static void publicbukanMain() {
        //skala terluar dapat mengakses public
        System.out.println("bukanMain: Public");
    }

    private static void privatebukanMain() {
        //hanya dapat diakses di dalam class yang bersangkutan
        System.out.println("bukanMain: Private");
    }

    public static void callPrivate() { //karena public, dapat diakses siapa pun
        privatebukanMain();
    }

    static void defaultbukanMain() {
        //dapat diakses oleh class di dalam package yang sama
        System.out.println("bukanMain: Default");
    }

    protected static void protectedbukanMain() {
        //dapat diakses oleh class di dalam package yang sama dan subclass nya
        System.out.println("bukanMain: Protected");
    }
}
