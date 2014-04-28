package mygui;

/**
 * Created by sadikmussah on 4/24/14.
 */

import java.awt.*;
import javax.swing.*;

public class Frame4a
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame("JFrame with a JPanel");

        JLabel L = new JLabel("Hello World !");   // Make a JLabel;
        JPanel P = new JPanel();                  // Make a JPanel;

        P.add(L);                   // Add L to JPanel P

        f.getContentPane().add(P);  // Add P to JFrame f

        f.setSize(400,300);
        f.setVisible(true);
    }
}