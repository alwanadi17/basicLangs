package com.jajal;

import java.util.Scanner;

public class close {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        
        n = in.nextInt();
        System.out.println("n = " + n);
        in.close();
//        n = in.nextInt();
//        System.out.println("n = " + n);
        //error scanner closed
        
    }
}
