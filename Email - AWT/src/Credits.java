package src;

import java.awt.*; 
import javax.swing.*; 
public class Credits extends JApplet
{
    static Credits object = new Credits();
    private int x;
    Font f1 = new Font("Serif",Font.BOLD, 24);
    Font f2 = new Font("Aerial",Font.PLAIN,11);
    public static void main()
    {
        int x=340,y=200;
        JFrame P= new JFrame("Credits & Contacts");
        Credits aonp = new Credits(); 
        aonp.init();
        aonp.start();
        P.add("Center", aonp);
        P.setSize(x, y);
        P.show();
        P.setResizable(false);
        P.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public void init()
    {
        JRootPane rootPane = this.getRootPane();    
        rootPane.putClientProperty("defeatSystemEventQueueCheck", Boolean.TRUE);
        }

    public void start()
    {
        object.setEnabled(true);
        repaint();
    }

    public void paint(Graphics g)
    {
        g.setColor(Color.yellow);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        g.setColor(Color.black);
        g.setFont(f1); 
        g.drawString("Credits -",20,20);
        g.setColor(Color.blue);
        g.drawLine(20,30,300,30);
        g.setColor(Color.red);
        g.setFont(f2);
        g.drawString("SOFTWARE NAME:    Calculator",20,50);
        g.drawString("USE OF SOFTWARE:  To aid Mathematical Calculations",20,70);
        g.drawString("VERSION:  1",20,90);
        g.drawString("AUTHOR:   Shashwat Gupta",20,110);
        g.drawString("EMAIL:    meshashwatgupta@rediffmail.com",20,130);
        g.setColor(Color.blue);
        g.drawLine(20,150,300,150);
    }

}
