package com.zetcode;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class UtilityTimerExample extends JFrame {

    public UtilityTimerExample() {

        add(new BoardUT());

        setTitle("Star");
                        
        setResizable(false);
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            
            @Override
            public void run() {                
                JFrame ex = new UtilityTimerExample();
                ex.setVisible(true);                
            }
        });
    }
}