package com.partho;

import java.util.Arrays;

public class ArraySwap {
    public static void main(String[] args) {
        int[] arr = {6, 3, 5, 9, 1, 8};
        swap(arr);
        System.out.println("New array ==> " + Arrays.toString(arr));
    }

    static void swap(int[] arr2) {
        int temp = arr2[0];
        arr2[0] = arr2[5];
        arr2[5] = temp;
    }

    /*
        Rule-02
        static void swap(int[] arr2, int index1, int index2) {
        int temp = arr2[index1];
        arr2[index1] = arr2[index2];
        arr2[index2] = temp;
    }

    */
}