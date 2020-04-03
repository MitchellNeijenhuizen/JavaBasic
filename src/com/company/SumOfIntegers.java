package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the amount of numbers in the array: ");
        int arrayLength = scanner.nextInt();
        int[] arrayValues = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            System.out.print("Please enter up to enter a value for position " + i + ": ");
            int input = scanner.nextInt();
            arrayValues[i] = input;
        }


        for (int j = 0; j < arrayLength; j++) {
            if (!(arrayValues[j] % 2 == 0 || arrayValues[j] % 2 == 1)) {
                System.out.println(arrayValues[j]);
            }
        }


    }
}





/*Write a program that calculates and displays the sum of all integers between 1
and 20. */