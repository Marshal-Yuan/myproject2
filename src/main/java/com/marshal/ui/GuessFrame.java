package com.marshal.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessFrame extends JFrame {

    JButton button = new JButton("Guess");
    JLabel label = new JLabel("Zzzz.");
    JTextField number = new JTextField(10);

    public GuessFrame(){
        super();
        setSize(600,400);
        setLocation(300,200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                System.out.println("Hello");
//                label.setText("Hello!!");
                int num =Integer.parseInt(number.getText());
                System.out.println(num);
                if(num == 15) {
                    label.setText("恭喜你猜對了!!");
                }
                else if(num < 15){
                        label.setText("再大一點");
                    }
                else{
                    label.setText("再小一點");
                }
            }
        });

        setLayout(new FlowLayout());
        add(number);
        add(button);
        add(label);
        setVisible(true);

    }


    public static void main(String[] args) {
        GuessFrame guessFrame = new GuessFrame();
    }
}
