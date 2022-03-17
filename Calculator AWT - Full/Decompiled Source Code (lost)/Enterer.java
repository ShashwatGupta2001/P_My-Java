package Decompiled;

import java.awt.event.ActionEvent;
import java.awt.HeadlessException;
import java.awt.Color;
import java.awt.LayoutManager;
import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.JPanel;
import java.awt.Container;
import javax.swing.JButton;
import java.awt.Graphics;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import javax.swing.JApplet;

// 
// Decompiled by Procyon v0.5.36
// 

public class Enterer extends JApplet implements ActionListener
{
    static int p;
    static JFrame P;
    static JPasswordField iF;
    static JLabel sub;
    static Graphics z;
    static JButton s;
    static Enterer object;
    static Enterer obi;
    static int phase;
    Container c;
    public static JPanel jp;
    public static JPanel fal;
    Calculator R;
    
    public Enterer() {
        this.R = new Calculator();
    }
    
    public static void main(final String[] args) throws StackOverflowError {
        final int x = 400;
        final int y = 100;
        Enterer.P = new JFrame("PASSWORD NEEDED!");
        final Enterer aonp = new Enterer();
        aonp.init();
        aonp.start();
        Enterer.P.add("Center", aonp);
        Enterer.P.setSize(x, y);
        Enterer.P.show();
        Enterer.P.setResizable(false);
        Enterer.P.setDefaultCloseOperation(2);
    }
    
    @Override
    public void destroy() {
        this.remove(Enterer.object);
    }
    
    @Override
    public void start() {
        Enterer.object.setEnabled(true);
    }
    
    @Override
    public void stop() {
        Enterer.object.setEnabled(false);
    }
    
    @Override
    public void init() throws HeadlessException {
        (this.c = this.getContentPane()).setLayout(new BorderLayout());
        this.c.setBackground(Color.black);
        final JLabel title = new JLabel("Security Check");
        this.c.add(title, "North");
        Enterer.jp = new JPanel();
        Enterer.sub = new JLabel("Enter Password");
        Enterer.jp.add(Enterer.sub);
        (Enterer.iF = new JPasswordField(16)).setText("");
        Enterer.jp.add(Enterer.iF);
        (Enterer.s = new JButton("Submit")).addActionListener(this);
        Enterer.jp.add(Enterer.s);
        Enterer.jp.setBackground(Color.black);
        this.c.add(Enterer.jp, "South");
    }
    
    public void actionPerformed(final ActionEvent evt) {
        final int L = 5;
        Enterer.phase = (Enterer.phase + 1) % 3;
        final String command = evt.getActionCommand();
        if ("Submit".equals(command)) {
            ++Enterer.p;
            if (Enterer.iF.getText().equals(password.main())) {
                Enterer.iF.setText("");
                Enterer.iF.setEnabled(false);
                Enterer.s.setEnabled(false);
                Enterer.sub.setEnabled(false);
                final Calculator r = this.R;
                Calculator.main();
                Enterer.P.dispose();
            }
            else if (Enterer.iF.getText() != password.main()) {
                Enterer.iF.setText("");
                if (Enterer.p < L - 1 && Enterer.p > 0) {
                    Enterer.P.setTitle("WRONG PASSWORD! TRY AGAIN");
                }
                else if (Enterer.p == L - 1) {
                    Enterer.P.setTitle("LAST TRY!");
                }
            }
            if (Enterer.p == L) {
                this.destroy();
                Enterer.P.dispose();
            }
        }
    }
    
    static {
        Enterer.p = 0;
        Enterer.object = new Enterer();
        Enterer.obi = new Enterer();
        Enterer.phase = 0;
    }
}