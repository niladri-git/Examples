package com.zetcode;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class SwingTimerExample extends JFrame {

    public SwingTimerExample() {

        add(new Board());

        setTitle("Star");
        pack();
        setResizable(false);
        setLocationRelativeTo(null);        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            
            @Override
            public void run() {                
                JFrame ex = new SwingTimerExample();
                ex.setVisible(true);                
            }
        });
    }
}