package com.marshal.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessFrame extends JFrame {

    JButton button = new JButton("Guess");
    JLabel label = new JLabel("請在1~30間猜數字");
    JTextField number = new JTextField(10);

    public GuessFrame(){
        super();
        setSize(600,400);
        setLocation(300,200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        Random rand = new Random();
        int secret = rand.nextInt(30) + 1;

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                System.out.println("Hello");
//                label.setText("Hello!!");
                int num =Integer.parseInt(number.getText());
                System.out.println(num);


                if(num == secret) {
                    label.setText("恭喜你猜對了!!數字是"+ secret);
                }
                else if(num > 0  && num < secret){
                        label.setText("再大一點");
                    }
                else if(num <31 && num > secret) {
                    label.setText("再小一點");
                }
                else{
                    label.setText("超出範圍了，請重新輸入!!");
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
