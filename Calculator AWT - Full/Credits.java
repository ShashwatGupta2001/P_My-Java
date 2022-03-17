package Decompiled;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JRootPane;
import java.awt.Component;
import javax.swing.JFrame;
import java.awt.Font;
import javax.swing.JApplet;

public class Credits extends JApplet
{
    static Credits object;
    private int x;
    Font f1;
    Font f2;
    
    public Credits() {
        this.f1 = new Font("Serif", 1, 24);
        this.f2 = new Font("Aerial", 0, 11);
    }
    
    public static void main() {
        final int x = 340;
        final int y = 200;
        final JFrame P = new JFrame("Credits & Contacts");
        final Credits aonp = new Credits();
        aonp.init();
        aonp.start();
        P.add("Center", aonp);
        P.setSize(x, y);
        P.show();
        P.setResizable(false);
        P.setDefaultCloseOperation(2);
    }
    
    @Override
    public void init() {
        final JRootPane rootPane = this.getRootPane();
        rootPane.putClientProperty("defeatSystemEventQueueCheck", Boolean.TRUE);
    }
    
    @Override
    public void start() {
        Credits.object.setEnabled(true);
        this.repaint();
    }
    
    @Override
    public void paint(final Graphics g) {
        g.setColor(Color.black);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        g.setColor(Color.yellow);
        g.setFont(this.f1);
        g.drawString("Credits -", 20, 20);
        g.setColor(Color.blue);
        g.drawLine(20, 30, 300, 30);
        g.setColor(Color.white);
        g.setFont(this.f2);
        g.drawString("SOFTWARE NAME:    Calculator", 20, 50);
        g.drawString("USE OF SOFTWARE:  To aid Mathematical Calculations", 20, 70);
        g.drawString("VERSION:  1", 20, 90);
        g.drawString("AUTHOR:   Shashwat Gupta", 20, 110);
        g.drawString("EMAIL:    guptashashwatme@gmail.com", 20, 130);
        g.setColor(Color.red);
        g.drawLine(20, 150, 300, 150);
    }
    
    static {
        Credits.object = new Credits();
    }
}