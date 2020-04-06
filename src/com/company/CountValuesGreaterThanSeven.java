package com.company;

import java.util.Scanner;

public class CountValuesGreaterThanSeven {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter integers separated by a space to calculate the average: ");
            String input = scanner.nextLine().trim();
            String[] listOfWords = input.split("\\W+");
            int [] listOfNumbers = new int[listOfWords.length];
            for (int i = 0; i < listOfWords.length; i++) {
                listOfNumbers[i] = Integer.parseInt(listOfWords[i]); }
            double summedValue = 0.0;
            int numberOfValuesGreaterThanSeven = 0;
            for (int i = 0; i < listOfNumbers.length; i++) {
                if (listOfNumbers[i] > 7) {
                    summedValue += listOfNumbers[i];
                    numberOfValuesGreaterThanSeven += 1;
                }
            }
            if (numberOfValuesGreaterThanSeven > 1) {
                System.out.println(summedValue / numberOfValuesGreaterThanSeven);
            }
            else {
                System.out.println("Cannot divide by zero"); }
        }
    }
//



/*Write a program that prompts the user to enter five test scores between 1 and 10.
The program will then count the number of scores that are greater than 7. */

