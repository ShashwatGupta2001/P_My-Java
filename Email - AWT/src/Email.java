package src;

import java.awt.*;
import javax.swing.*;
import java.applet.Applet;
import java.awt.event.*;
import java.lang.String.*;
public class Email extends JApplet implements ActionListener {
    static int p=0;
    static JFrame P;
    static JPasswordField iF;
    static  JLabel sub;
    static Graphics z;
    static JButton s; 
    static Email object = new Email(),obi=new Email();  
    static int phase = 0;
    Container c;
    public static JPanel jp,fal;
    Window R =new Window();
    public static void main(String args[])throws StackOverflowError
    {
        int x=400,y=100;
        P= new JFrame("PASSWORD NEEDED!");
        Email aonp = new Email();
        aonp.init();
        aonp.start();
        P.add("Center", aonp);
        P.setSize(x, y);
        P.show();
        P.setResizable(false);
        P.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
    public void destroy() 
    {
        remove(object);
    }

    public void start()
    {
        object.setEnabled(true);
    }

    public void stop()
    {
        object.setEnabled(false);
    }
    
    public void init() throws HeadlessException {
        c = this.getContentPane();
        c.setLayout(new BorderLayout());
        c.setBackground(Color.black);
        
        JLabel title = new JLabel("Security Check");
        c.add(title, BorderLayout.NORTH);
        jp=new JPanel();
        sub = new JLabel("Enter Password");
        jp.add(sub);
        iF = new JPasswordField(16);
        iF.setText("");
        jp.add(iF);
        s = new JButton("Submit");
        s.addActionListener(this);
        jp.add(s);
                      
        jp.setBackground(Color.black);
        c.add(jp, BorderLayout.SOUTH);
      }
    
       public void actionPerformed(ActionEvent evt)
       {
        int L=5;
        phase = (phase + 1) % 3;
        String command = evt.getActionCommand(); 
        if("Submit".equals(command))
        {
            p++;
            if(iF.getText().equals(password.main))
            {
                iF.setText("");
                iF.setEnabled(false);
                s.setEnabled(false);
                sub.setEnabled(false);
                R.main();
                P.dispose();
            }
            else if(iF.getText()!=password.main)
            {
                iF.setText("");
                if(p<(L-1) && p>0)
                {
                    P.setTitle("WRONG PASSWORD! TRY AGAIN");
                }
                else if(p==(L-1))
                {
                    P.setTitle("LAST TRY!");
                }
            }
            if(p==L)
                {
                    this.destroy();
                    P.dispose();                
                }
        }
    }
}
