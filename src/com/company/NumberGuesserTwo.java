package com.company;

import java.util.Random;

public class NumberGuesserTwo {

    private int randomNumber;

    public void setRandomNumber(int NumberGuesser) {
        Random r = new Random();
        randomNumber = r.nextInt(NumberGuesser);
    }

    public int getRandomNumber() {
        return randomNumber;
    }
}

//
