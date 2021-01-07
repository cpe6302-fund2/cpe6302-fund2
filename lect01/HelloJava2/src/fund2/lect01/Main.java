package fund2.lect01;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("HelloJava2");
        //frame.add( new HelloComponent2("Hello, Java!"));
        HelloComponent2 component2 = new HelloComponent2( "Hello, " + args[0] + "!");
        frame.add( component2 );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setSize( 300, 300);
        frame.setVisible( true );
    }

}

class HelloComponent2 extends JComponent
    implements MouseMotionListener
{
    String theMessage;
    int messageX = 125, messageY = 95;

    public HelloComponent2(String message ) {
        theMessage = message;
        addMouseMotionListener(this);
    }

    public void paintComponent( Graphics g ) {
        g.drawString(theMessage, messageX, messageY );
    }

    public void mouseDragged(MouseEvent e) {
        // save the mouse coordinates and paint the message.
        messageX = e.getX();
        messageY = e.getY();
        repaint();
    }
    public void mouseMoved(MouseEvent e) {}
}

