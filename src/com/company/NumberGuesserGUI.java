package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberGuesserGUI extends JFrame implements ActionListener {

    int userGuess;
    NumberGuesserTwo game = new NumberGuesserTwo();

    String text = "Please enter a a number in the field";
    JLabel label = new JLabel(text);
    JTextField textField = new JTextField("Please enter a random number");

    public NumberGuesserGUI() {
        getContentPane().add(label, BorderLayout.NORTH);
        getContentPane().add(textField, BorderLayout.SOUTH);

        textField.addActionListener(this);

        int upperBoundRandomNumber = 11;
        game.setRandomNumber(upperBoundRandomNumber);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String textField = e.getActionCommand();
        userGuess = Integer.parseInt(textField);

        System.out.println(userGuess);
        System.out.println(game.getRandomNumber());


        if (!(game.getRandomNumber() == userGuess)) {
            label.setText("Please try again");
        } else {
            label.setText("Correct");
        }
    }

    public static void main (String[]args) {
        NumberGuesserGUI numberGuesserGUI = new NumberGuesserGUI();
        numberGuesserGUI.setSize(400, 400);
        numberGuesserGUI.setVisible(true);
        numberGuesserGUI.setDefaultCloseOperation(EXIT_ON_CLOSE);
        }
    }



