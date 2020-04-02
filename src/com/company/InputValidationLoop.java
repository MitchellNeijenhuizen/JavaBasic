package com.company;

import java.util.Scanner;

public class InputValidationLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a value: ");
        double input = scanner.nextDouble();
        while (true) {
            if (!(input >= 0 && input <= 10)) {
                System.out.print("Invalid value, please enter another value: ");
                input = scanner.nextDouble();
            } else {
                System.out.print("The value was valid, please enter another value: ");
                input = scanner.nextDouble();
            }
        }
    }
}


/*Create an input validation loop that only accepts numbers in the range of 1
through 10.*/