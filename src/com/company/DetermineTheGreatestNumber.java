package com.company;

import java.util.Scanner;

public class DetermineTheGreatestNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double [] valueStorage = new double [3];

        System.out.print("Please enter value one: ");
        double valueOne = scanner.nextDouble();
        valueStorage[0] = valueOne;
        System.out.print("Please enter value two: ");
        double valueTwo = scanner.nextDouble();
        valueStorage[1] = valueTwo;
        System.out.print("Please enter value three: ");
        double valueThree = scanner.nextDouble();
        valueStorage[2] = valueThree;

        double maxValue = 0.0;
        for (int i = 0; i < 3; i++) {
            if (valueStorage[i] > maxValue) {
                maxValue = valueStorage[i];
            }
        }
        System.out.println("The maximum value is " + maxValue);
    }
}


/* Write a program that asks the user to enter three numbers. The program will
then determine and print the largest of the three numbers. */
