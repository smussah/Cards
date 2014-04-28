/**
 * Created by sadikmussah on 4/23/14.
 */
import java.awt.*;
import java.awt.image.BufferStrategy;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BSTest extends JFrame {
    BufferStrategy bs;
    DrawPanel panel = new DrawPanel();


    public BSTest() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());   // edited line
        setVisible(true);
        setSize(800,420);
        setLocationRelativeTo(null);
        setIgnoreRepaint(true);
        createBufferStrategy(2);
        bs = getBufferStrategy();
        panel.setIgnoreRepaint(true);
        panel.setPreferredSize(new Dimension(800,420));
        add(panel, BorderLayout.CENTER);     // edited line
        panel.drawStuff();
    }

    public class DrawPanel extends JPanel {
        public void drawStuff() {
            while(true) {
                try {
                    Graphics2D g = (Graphics2D)bs.getDrawGraphics();
                    g.setColor(Color.BLACK);
                    System.out.println("W:"+getSize().width+", H:"+getSize().height);
                    g.fillRect(0,0,getSize().width,getSize().height);
                    bs.show();
                    g.dispose();
                    Thread.sleep(20);
                } catch (Exception e) { System.exit(0); }
            }
        }
    }

    public static void main(String[] args) {
        BSTest bst = new BSTest();
    }
}