package com.marshal.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessFrame extends JFrame {

    public GuessFrame(){
        super();
        setSize(600,400);
        setLocation(300,200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        JButton button = new JButton("Hi");

        JLabel label = new JLabel("Zzzz.");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                System.out.println("Hello");
                label.setText("Hello!!");
            }
        });

        setLayout(new FlowLayout());
        add(label);
        add(button);
        setVisible(true);

    }


    public static void main(String[] args) {
        GuessFrame guessFrame = new GuessFrame();
    }
}
