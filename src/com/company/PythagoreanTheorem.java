package com.company;

import java.util.Scanner;

public class PythagoreanTheorem {

    public static void main(String[] args) {
        final byte toThePowerOfTwo = 2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the length of A: ");
        double sideA = scanner.nextDouble();
        System.out.print("Please enter the length of B: ");
        double sideB = scanner.nextDouble();
        double hypotenuseC = Math.sqrt(Math.pow(sideA, toThePowerOfTwo) +
                Math.pow(sideB,toThePowerOfTwo));
        System.out.println(hypotenuseC);
    }
}
