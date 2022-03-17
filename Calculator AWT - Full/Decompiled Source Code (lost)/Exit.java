package Decompiled;

import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import javax.swing.JFrame;


public class Exit extends JFrame implements ActionListener
{
    static JButton yes;
    static JButton no;
    static Exit object;
    static Exit obi;
    static JFrame P;
    static Exit R;
    public static JPanel jp;
    public static JPanel fal;
    
    public static void main() {
        Exit.R.init();
    }
    
    public void init() throws StackOverflowError {
        final int x = 230;
        final int y = 100;
        (Exit.P = new JFrame("EXIT CONFIRMATION!")).add(new JLabel("Are You Sure You Want To Exit?"), "North");
        Exit.P.setBackground(Color.black);
        Exit.jp = new JPanel();
        (Exit.yes = new JButton("Yes")).addActionListener(this);
        Exit.jp.add(Exit.yes);
        (Exit.no = new JButton("No")).addActionListener(this);
        Exit.jp.add(Exit.no);
        Exit.jp.setBackground(Color.black);
        Exit.P.add(Exit.jp, "South");
        Exit.P.setSize(x, y);
        Exit.P.show();
        Exit.P.setResizable(false);
        Exit.P.setDefaultCloseOperation(2);
    }
    
    public void actionPerformed(final ActionEvent evt) {
        final String command = evt.getActionCommand();
        if ("Yes".equals(command)) {
            System.exit(0);
        }
        else if ("No".equals(command)) {
            Exit.P.dispose();
        }
    }
    
    static {
        Exit.object = new Exit();
        Exit.obi = new Exit();
        Exit.R = new Exit();
    }
}


