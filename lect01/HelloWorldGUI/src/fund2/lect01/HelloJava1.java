package fund2.lect01;

import javax.swing.*;
import java.awt.*;

public class HelloJava1 extends JComponent {
    public void paintComponent(Graphics g) {
        g.drawString ( "Hello, Java!", 125, 95);
    }
}
