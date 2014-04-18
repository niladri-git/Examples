package rtype;

import javax.swing.JFrame;

public class RType1 extends JFrame {

    public RType1() {

        add(new Board1());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setTitle("R - Type");
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        new RType1();
    }
}