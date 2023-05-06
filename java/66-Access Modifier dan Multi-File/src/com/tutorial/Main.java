package com.tutorial;

public class Main {
    public static void main(String[] args) {
        System.out.println("Dalam package: ");
        bukanMain.publicbukanMain();
//        bukanMain.privatebukanMain(); tidak bisa diakses di luar package

        //keduanya dapat diakses karena termasuk dalam satu package
        bukanMain.defaultbukanMain();
        bukanMain.protectedbukanMain();
    }
}
