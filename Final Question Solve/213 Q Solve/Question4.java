package FInalQuestionSolve.Fall2021;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Question4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(275, 120);
        JTextField tf1 = new JTextField(10);
        JTextField tf2 = new JTextField(10);

        JButton swap = new JButton("Swap!");
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(tf1);
        frame.add(tf2);
        frame.add(swap);
        frame.setVisible(true);

        swap.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               String temp = tf2.getText();
               tf2.setText(tf1.getText());
               tf1.setText(temp);
           }
        });

    }
}
