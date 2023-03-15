package com.tutorial;

import java.lang.reflect.Array;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = new int[5];

        System.out.println("arr1 = " + Arrays.toString(arr1));
        System.out.println("arr2 = " + Arrays.toString(arr2));

        arr2 = arr1; //array variable works as reference that referring to index 0
        System.out.println("arr1 = " + Arrays.toString(arr1));
        System.out.println("arr2 = " + Arrays.toString(arr2));

        arr1[0] = 10;
        arr2[2] = 323;
        System.out.println("arr1 = " + Arrays.toString(arr1));
        System.out.println("arr2 = " + Arrays.toString(arr2));

        changeIndex0To457(arr1);
        System.out.println("arr1 = " + Arrays.toString(arr1));
        System.out.println("arr2 = " + Arrays.toString(arr2));
    }

    //Pass by reference
    private static void changeIndex0To457(int[] arr) {
        arr[0] = 457;
    }
}
