package com.tutorial;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        
        //toString()
        System.out.println("Arrays.toString(arr1) = " + Arrays.toString(arr1));

        //Copy array
        //copyOf
        System.out.println("copyOf");
        int[] arr2 = Arrays.copyOf(arr1, arr1.length);
        printArr(arr1);
        System.out.println("arr1 = " + arr1);
        printArr(arr2);
        System.out.println("arr2 = " + arr2);
        System.out.println();

        System.out.println("copyOf under original length");
        int[] arr3 = Arrays.copyOf(arr1, 3);
        printArr(arr3);
        System.out.println();

        //copyOfRange
        System.out.println("copyOfRange");//will got 0 if it out of range unless for from
        int[] arr4 = Arrays.copyOfRange(arr1, 2, 7);
        printArr(arr1);
        System.out.println("arr1 = " + arr1);
        printArr(arr4);
        System.out.println("arr4 = " + arr4);
        System.out.println();

        //Fill array
        //fill
        System.out.println("fill");
        int[] arr5 = new int[10];
        printArr(arr5);
        Arrays.fill(arr5, 1);
        printArr(arr5);
        System.out.println();

        //Compare array
        int[] arr6 = {1,2,3,6,5};
        int[] arr7 = {1,2,3,4,5};

        //equals
        System.out.println("equals");
        System.out.println(Arrays.equals(arr6, arr7));
        System.out.println();

        //compare
        System.out.println("compare");
        System.out.println(Arrays.compare(arr6, arr7));
        //comparing each element in same index. First discovered difference will be the result
        System.out.println();

        //mismatch
        System.out.println("mismatch");
        System.out.println(Arrays.mismatch(arr6, arr7));
        //output as an index
        System.out.println();

        //Sorting
        //sort
        System.out.println("sort");
        int[] arr8 = {2,4,5,2,5,7,4,9,7,1,1,2};
        printArr(arr8);
        Arrays.sort(arr8);
        printArr(arr8);
        System.out.println();

        //Searching
        //binarySearch
        //must be sorted arr
        System.out.println("sort");
        System.out.println(Arrays.binarySearch(arr8, 1));
        System.out.println();

    }
    private static void printArr(int[] arr) {
        System.out.println("Array: " + Arrays.toString(arr));
    }
}
