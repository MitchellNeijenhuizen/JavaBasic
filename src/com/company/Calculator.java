package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Calculator extends JFrame implements ActionListener { //Door de "extends" is calculator nu een Jframe.
    // ActionListener is een interface voor het ontvangen van acties, actionevents die iemand verstuurd door de .
    //Knopje en label maken
    JLabel display = new JLabel("");
    JButton button = new JButton("OK");

    public Calculator() {

        String[] labels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "+",
                "C", "0", "=", "-" };

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4,4));
        getContentPane().add(panel, BorderLayout.CENTER);



        getContentPane().add(button, BorderLayout.SOUTH); // requires import java.awt.BorderLayout;
        getContentPane().add(display, BorderLayout.NORTH);
        button.addActionListener(this); //Knopje zou clicked moeten printen. ik kan door this naar mezelf verwijzen.
        //
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator(); //Jframe calculator maken.
        calculator.setSize(400, 400); // size van het frame.
        calculator.setVisible(true); // zichtbaar maken van het frame.
        calculator.setDefaultCloseOperation(EXIT_ON_CLOSE);  // echt afsluiten anders vreet het geheuegen.
    }

    @Override

    public void actionPerformed(ActionEvent e) {
        String currentButton = e.getActionCommand();
        display.setText("clicked");
    }
}
