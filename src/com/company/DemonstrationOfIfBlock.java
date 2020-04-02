package com.company;

import java.util.Scanner;

public class DemonstrationOfIfBlock {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a value for x: ");
        double x = scanner.nextDouble();
        System.out.print("Please enter a value for y: ");
        double y = scanner.nextDouble();
        if (5 == x / y) {
            x = 100;
        } else if (5 == x * y) {
            x = 1;
        } else if (x < y) {
            x = x * 2;
        } else if (x > y) {
            x += 1;
        }
        System.out.println("The value for x is " + x);
    }
}
