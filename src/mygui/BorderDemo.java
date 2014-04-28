package mygui;

/**
 * Created by sadikmussah on 4/25/14.
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;


public class BorderDemo extends JPanel
{
    public BorderDemo()
    {
        //super(new GridLayout(1,0));

        Border blackline;

        setLayout(new FlowLayout());
        setBorder(BorderFactory.createLineBorder(Color.white,10));
        setBackground(Color.blue);

        JLabel label1 = new JLabel("Borders",JLabel.CENTER);

        label1.setBorder(BorderFactory.createLineBorder(Color.red,5));
        label1.setOpaque(true);
        label1.setBackground(Color.green);
        add(label1);


        JLabel label2 = new JLabel("Titled Border",JLabel.CENTER);
        label2.setBorder(BorderFactory.createTitledBorder("Title"));
        label2.setOpaque(true);
        label2.setBackground(Color.green);
        add(label2);

    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("BorderDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(new BorderDemo());
        //Display the window.
        frame.pack();
        frame.setVisible(true);

    }
}