package com.partho;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLoopString {
    public static void main(String[] args) {
        String[] str = new String[4];
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 4 string: ");
        String input = in.nextLine();
        System.out.println(input);

        for (int i = 0; i < str.length; i++) {
            str[i] = in.nextLine();
        }
        System.out.println(Arrays.toString(str));
    }
}
