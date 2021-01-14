package fund2.lect01;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello, Java!");
        JLabel label = new JLabel("Hello Fund2!");
        frame.add(label);
        // frame.add(new HelloJava1());
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
