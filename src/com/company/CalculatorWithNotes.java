/*
package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener { // naam leeg scherm. door extends is calcular een jframe.
    JLabel display = new JLabel("");
    JButton button = new JButton("OK");

    public Calculator() {
        getContentPane().add(button, BorderLayout.SOUTH);
        getContentPane().add(display, BorderLayout.NORTH);
        button.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String currentButton = e.getActionCommand();
        System.out.println(currentButton);
    }

    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(4,4));
    getContentPane().add(panel, BorderLayout.CENTER);

    for (int i = 0; i< 16; i++) {
        JButton button = new JButton(
        panel.add(button);
        button.addActionListener(this);

        String[] labels =
                {"7", "8", "9", "/",
                        "4", "5", "6",
                        "*"
                        ,
                        "1", "2", "3", "+",
                        "C", "0", "=", "-"};


    }


    public static void main(String[] args) {
        Calculator calculator = new Calculator(); //VISIBLE = false standaard
        calculator.setSize(400, 400); // size
        calculator.setVisible(true); // zichtbaar maken
        calculator.setDefaultCloseOperation(EXIT_ON_CLOSE);  // echt afsluiten
    }

}





    JLabel label = new JLabel(""); // label maken

        button.addActionListener(this); // knopje zou cliked moetn printen

        public Calculator() {
            JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(4,4)); // grid maken
            getContentPane().add(panel, BorderLayout.CENTER);

            getContentPane().add(button, BorderLayout.SOUTH);
            getContentPane().a

        }


}
*/
