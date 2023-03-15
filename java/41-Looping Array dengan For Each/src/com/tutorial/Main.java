package com.tutorial;

import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[10];
        int len = arr.length; //array property

        System.out.println("Array example");
        System.out.println();
        System.out.println("Fill array with random value");

        //fill arr with random value
        for (int i = 0; i < len; i++) {
            arr[i] = rand.nextInt();
        }

        //looping with array property
        for (int i = 0; i < len; i++) {
            System.out.println("arr[" + i + "] : " + arr[i]);
        }

        System.out.println();
        System.out.println("Array with for each");

        //looping with for each
        int i = 0;
        for (int n : arr) {
            System.out.println("arr[" + i + "] : " + n);
            i++;
        }
    }
}
