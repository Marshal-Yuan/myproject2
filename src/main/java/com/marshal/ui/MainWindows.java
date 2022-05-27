package com.marshal.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindows {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
//        frame.setSize(400,300);
//        frame.setLocation(550,200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
        frame.setBounds(600,200,500,500);
        JButton button = new JButton("OK");
        button.setBounds(250,200,60,60);
        button.setBackground(Color.pink);
        button.setForeground(Color.BLUE);
//        button.setLocation(150,100);
        frame.add(button);
        System.out.println("END?");

//        MyActionListener listener = new MyActionListener();
//        button.addActionListener(listener);
        // Anonymous class 匿名類別
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("hahaha");
            }
        });

//        frame.setLayout(new FlowLayout());


    }
}
