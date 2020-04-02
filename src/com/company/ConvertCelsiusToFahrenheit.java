package com.company;

import java.util.Scanner;

public class ConvertCelsiusToFahrenheit {

    public static void main(String[] args) {
        final float CONVERSIONFACTOR = 1.8F;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a temperature in Celsius: ");
        float valueInCelsius = scanner.nextFloat();
        float valueInFahrenheit = valueInCelsius * CONVERSIONFACTOR;
        System.out.println("The temperature in Fahrenheit is " + valueInFahrenheit + " °F");
    }
}
