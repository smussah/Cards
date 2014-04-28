package mygui;
import javafx.scene.image.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.util.*;
import java.util.jar.JarEntry;
import java.awt.FlowLayout.*;

/**.
 * Created by sadikmussah on 4/23/14.
 */
public class Shibly extends JFrame {

  private   JLabel label1, label2, label3;
    JTextArea je;
    private JButton button, button1,button2;
private JPanel j1, j2, j3, j4;
    public Shibly(){
        super("my new window");
        super.setSize(5566,23233);
        setLayout(new FlowLayout());
       j1 = new JPanel();
        j2 = new JPanel();
        j3 = new JPanel();
        j4 = new JPanel();
        j4.setBackground(Color.blue);
        j3.setBackground(Color.red);
        j2.setBackground(Color.pink);
        j1.setBackground(Color.cyan);
        getContentPane().add(j1).setBounds(55,34,34,24 );
        getContentPane().add(j3);
        getContentPane().add(j4);
        getContentPane().add(j2);

label1 = new JLabel("My name is sadik and you know that don't YO?");
j1.add(label1);
        button1 = new JButton("push it hard men");
        j2.add(button1);
        setBackground(Color.black);

        button = new JButton("god is greater");
        j3.add(button);
        je = new JTextArea(10, 23);
        je.setBackground(Color.orange);
        j4.add(je);
        button2 = new JButton("Go goo goo goooo\n gooo gOOOOO");
        button2.setForeground(Color.pink);
button2.addActionListener(new Listener());
        button1.addActionListener(new Listener ());
this.add(button1);
button1.addActionListener(new Listener());
        button2.addActionListener(new Listener());
        add(button2);
    }

public class Listener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {

if(e.getSource() == button1){
    System.exit(0);
}
        if(e.getSource() == button2){
           label1.setText("we all know what it takes to doe this ");
            label1.setBackground(Color.blue);
            je.setBackground(Color.magenta);
            je.setText("JTextArea je");
            je.add(new JColorChooser());
        }


    }



}


}
