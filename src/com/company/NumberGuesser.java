package com.company;

import java.util.Random;
import java.util.Scanner;

public class NumberGuesser {

    private int randomNumber;

    public void setRandomNumber(int NumberGuesser) {
        Random r = new Random();
        randomNumber = r.nextInt(NumberGuesser);
    }

    public int getRandomNumber() {
        return randomNumber;
    }
}

class NumberGuesserTestDrive {

    public static void main(String[] args) {
        int upperBoundRandomNumber = 11;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a value between O and " + (upperBoundRandomNumber-1) +". ");
        int userGuess = scanner.nextInt();

        NumberGuesser game = new NumberGuesser();
        game.setRandomNumber(upperBoundRandomNumber);


        while ( ! (game.getRandomNumber() == userGuess)) {
            System.out.print("Incorrect, please try again ");
            userGuess = scanner.nextInt();
            if ((game.getRandomNumber() == userGuess)) {
                System.out.print("Correct!");
            }
        }
    }
}

