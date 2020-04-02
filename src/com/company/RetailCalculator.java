package com.company;

import java.util.Scanner;

public class RetailCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter number of products sold: ");
        int soldAmount = scanner.nextInt();
        double [] productArrayValue = new double[soldAmount];

        for (int i = 0; i < soldAmount; i++) {
            System.out.print("Please enter the according retail price of product number " + (i+1) + ": ");
            double input = scanner.nextDouble();
            productArrayValue[i] = input;
        }

        double summedValue = 0.0;
        for (int j = 0; j < soldAmount; j++) {
            summedValue += productArrayValue[j];
        }
        System.out.println(summedValue);
    }
}


/*
A company sells five different products whose retail prices are shown in the
following table. Write a program that asks the user to enter the product number
and the quantity sold. The program will then calculate and display the total
retail value.
product number retail price

1 2.95
2 4.99
3 5.49
4 7.80
5 8.85

*/