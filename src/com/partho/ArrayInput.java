package com.partho;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;

public class ArrayInput {
    public static void main(String[] args) {
        int[] arr = new int[4];
        arr[0] = 7;
        arr[1] = 3;
        arr[2] = 1;
        arr[3] = 5;
        System.out.println(Arrays.toString(arr));
    }
}
