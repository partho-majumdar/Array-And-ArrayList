package com.partho;

import java.util.Arrays;
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 9 number: ");
        int[][] arr2D = new int[3][3];

        for (int row = 0; row < arr2D.length; row++) {
            for (int col = 0; col < arr2D[row].length; col++) {
                arr2D[row][col] = in.nextInt();
            }
        }

        for (int[] ints : arr2D) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
