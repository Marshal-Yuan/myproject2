package com.marshal.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindows {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(400,300);
        frame.setLocation(550,200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JButton button = new JButton("OK");

//        MyActionListener listener = new MyActionListener();
//        button.addActionListener(listener);
        // Anonymous class 匿名類別
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("hahaha");
            }
        });


                frame.setLayout(new FlowLayout());
        frame.add(button);
        frame.setVisible(true);
        System.out.println("END?");
    }
}
