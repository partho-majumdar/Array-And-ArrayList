package com.partho;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLoopInt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 4 number: ");
        int[] arr = new int[4];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

//         Rule-01
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

//        Rule-02
//        System.out.print(Arrays.toString(arr));

//        Rule-03 ==> enhance for loop
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
