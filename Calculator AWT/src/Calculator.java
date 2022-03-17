package jfc.src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 
import javax.swing.*;     
import java.lang.String.*;
import java.applet.Applet;
 
public class Calculator implements ActionListener 
 {
	static JLabel prompt1,prompt2,prompt3;
    static JPanel check,buttonPanela,centerPanel; 
    static JLabel mess,meT;
    static JButton send,ad,sub,mul,div,exp,sq,sqrt,cb,cbrt,log,sine,cosine,tangent,fact,clear,mp,mr,mm,win,cls;
    static Calculator obj = new Calculator(),object=new Calculator();
    static JTextField inputField1,inputField2,inputFieldx,label3;
    static String v;
    static final String ADD = "Add",SUB = "Substract",WIN="Window",CLS="Close",MUL = "Multiply",DIV = "Divide",EXP = "Exponent",SQ = "Square",SQRT = "Square Root",CB = "Cube",CBRT = "Cube Root",LOG = "Logarithm",SINE="sin",COSINE="cos",TANGENT="tan",FACT="Factorial",CLEAR = "Clear",MP="M+",MR="MR",MM="M-";
    static myFrame frame = new myFrame();
    static Calculator X=new Calculator();
    
    public static void main(String args[])
    {
    	Calculator Y=new Calculator();
    	Y.mainw(frame,X);
    }  
    public void mainw(myFrame fr,Calculator S)throws StackOverflowError
   	{
    	fr.setVisible(true);  // Show frame.
       	S.init();
       	fr.setResizable(false);
       	fr.resize(1350,350);   
       	fr.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);     
    }
    public void init()
    {
   
               
        // add the title label
        JLabel title = new JLabel("My Calaculator");
        frame.add(title, BorderLayout.NORTH);
       
        // create the center part with prompt and text field and add it
        centerPanel = new JPanel();
        prompt1 = new JLabel("Enter 1st Number");
        centerPanel.add(prompt1);
        inputField1 = new JTextField(16);
        inputField1.setText("");
        centerPanel.add(inputField1);
        prompt2 = new JLabel("Enter 2nd Number");
        centerPanel.add(prompt2);
        inputField2 = new JTextField(16);
        inputField2.setText("");
        centerPanel.add(inputField2);
        prompt3 = new JLabel("Answer");
        centerPanel.add(prompt3);
        label3 = new JTextField(16);
        label3.setEnabled(false); 
        centerPanel.add(label3);
        
        frame.add(centerPanel, BorderLayout.CENTER);
        
        centerPanel.setBackground(Color.black);

        // make a panel for the buttons
        JPanel buttonPanela = new JPanel();
        JLabel la=new JLabel("Functions :   ");
        buttonPanela.add(la);
        
        // add the buttons to the button panel
        ad = new JButton(ADD);
        ad.addActionListener(this);
        buttonPanela.add(ad);
        sub = new JButton(SUB);
        sub.addActionListener(this);
        buttonPanela.add(sub);
        mul = new JButton(MUL);
        mul.addActionListener(this);
        buttonPanela.add(mul);
        div = new JButton(DIV);
        div.addActionListener(this);
        buttonPanela.add(div);
        exp = new JButton(EXP);
       	exp.addActionListener(this);
        buttonPanela.add(exp);
        sq = new JButton(SQ);
        sq.addActionListener(this);
        buttonPanela.add(sq);
        sqrt = new JButton(SQRT);
        sqrt.addActionListener(this);
        buttonPanela.add(sqrt);
        cb = new JButton(CB);
        cb.addActionListener(this);
        buttonPanela.add(cb);
        cbrt = new JButton(CBRT);
      	 cbrt.addActionListener(this);
        buttonPanela.add(cbrt);
        log = new JButton(LOG);
        log.addActionListener(this);
        buttonPanela.add(log);
        sine = new JButton(SINE);
        sine.addActionListener(this);
        buttonPanela.add(sine);
        cosine = new JButton(COSINE);
        cosine.addActionListener(this);
        buttonPanela.add(cosine);
        tangent = new JButton(TANGENT);
        tangent.addActionListener(this);
        buttonPanela.add(tangent);
        fact = new JButton(FACT);
        fact.addActionListener(this);
        buttonPanela.add(fact);
        
        //add the buttons panel to the content pane
        frame.add(buttonPanela, BorderLayout.SOUTH);
        
         //make a panel for the buttons
        JPanel buttonPanelb = new JPanel();
        JLabel lb=new JLabel("Calculator Options :  ");
        buttonPanelb.add(lb);
        
        mp = new JButton(MP);
        mp.addActionListener(this);
        buttonPanelb.add(mp); 
        mr = new JButton(MR);
        mr.addActionListener(this);
        buttonPanelb.add(mr);
        mm = new JButton(MM);
        mm.addActionListener(this);
        buttonPanelb.add(mm);
       
        // add the buttons panel to the content pane
        frame.add(buttonPanelb, BorderLayout.NORTH);
        
        frame.setBackground(Color.black);
         
       
    }
    
    public void actionPerformed(ActionEvent evt)
    {
        String command = evt.getActionCommand();
        // add button pressed
        if(ADD.equals(command))
        {
            if(inputField1.getText()=="")
            {
                inputField1.setText("0");
            }
            if(inputField2.getText()=="")
            {
                inputField1.setText("0");
            }
            label3.setText(String.valueOf((Double.parseDouble(inputField1.getText()))+(Double.parseDouble(inputField2.getText()))));
        }
        // substract button pressed
        else if(SUB.equals(command))
        {
            if(inputField1.getText()=="")
            {
                inputField1.setText("0");
            }
            if(inputField2.getText()=="")
            {
                inputField1.setText("0");
            }
            label3.setText(String.valueOf((Double.parseDouble(inputField1.getText()))-(Double.parseDouble(inputField2.getText()))));
        }
        // multiply button pressed
        else if(MUL.equals(command))
        {
            if(inputField1.getText()=="")
            {
                inputField1.setText("0");
            }
            if(inputField2.getText()=="")
            {
                inputField1.setText("0");
            }
            label3.setText(String.valueOf((Double.parseDouble(inputField1.getText()))*(Double.parseDouble(inputField2.getText()))));
        }
        // divide button pressed
        else if(DIV.equals(command))
        {
            if(inputField1.getText()=="")
            {
                inputField1.setText("0");
            }
            if(inputField2.getText()=="")
            {
                inputField1.setText("0");
            }
            label3.setText(String.valueOf((Double.parseDouble(inputField1.getText()))/(Double.parseDouble(inputField2.getText()))));
        }
        // exponent button pressed
        else if(EXP.equals(command))
        {
           if(inputField1.getText()=="")
            {
                inputField1.setText("0");
            }
            if(inputField2.getText()=="")
            {
                inputField1.setText("0");
            }
            label3.setText(String.valueOf(Math.pow((Double.parseDouble(inputField1.getText())),(Double.parseDouble(inputField2.getText())))));
        }
        // square button pressed
        else if(SQ.equals(command))
        {
           if(inputField1.getText()=="")
            {
                inputField1.setText("0");
            }
            if(inputField2.getText()=="")
            {
                inputField1.setText("0");
            }
            label3.setText(String.valueOf(Math.pow((Double.parseDouble(inputField1.getText())),2)+" ; "+String.valueOf(Math.pow((Double.parseDouble(inputField2.getText())),2))));
        }
        // square root button pressed
        else if(SQRT.equals(command))
        {
           if(inputField1.getText()=="")
            {
                inputField1.setText("0");
            }
            if(inputField2.getText()=="")
            {
                inputField1.setText("0");
            }
            label3.setText(String.valueOf(Math.sqrt(Double.parseDouble(inputField1.getText()))+" ; "+String.valueOf(Math.sqrt(Double.parseDouble(inputField2.getText())))));
        }
        // cube button pressed
        else if(CB.equals(command))
        {
           if(inputField1.getText()=="")
            {
                inputField1.setText("0");
            }
            if(inputField2.getText()=="")
            {
                inputField1.setText("0");
            }
            label3.setText(String.valueOf(Math.pow((Double.parseDouble(inputField1.getText())),3)+" ; "+String.valueOf(Math.pow((Double.parseDouble(inputField2.getText())),3))));        }
        // cube root button pressed
        else if(CBRT.equals(command))
        {
           if(inputField1.getText()=="")
            {
                inputField1.setText("0");
            }
            if(inputField2.getText()=="")
            {
                inputField1.setText("0");
            }
            label3.setText(String.valueOf(Math.cbrt(Double.parseDouble(inputField1.getText()))+" ; "+String.valueOf(Math.cbrt(Double.parseDouble(inputField2.getText())))));
        }
        // logarithm button pressed
        else if(LOG.equals(command))
        {
           if(inputField1.getText()=="")
            {
                inputField1.setText("0");
            }
            if(inputField2.getText()=="")
            {
                inputField1.setText("0");
            }
            label3.setText(String.valueOf(Math.log(Double.parseDouble(inputField1.getText()))+" ; "+String.valueOf(Math.log(Double.parseDouble(inputField2.getText())))));
        }
         // memory buttons pressed
         //M+
        else if(MP.equals(command))
        {
            v=label3.getText();
        }
        //MR
        else if(MR.equals(command))
        {
           inputField1.setText(v);
           inputField2.setText("");
        }
        //M-
        else if(MM.equals(command))
        {
           v="";
        }
        else if(CLS.equals(command))
        {
           System.exit(0);
        }
        else if(SINE.equals(command))
        {
            label3.setText(fac((Long.parseLong(inputField1.getText())),(Long.parseLong(inputField2.getText()))));
        }
        else if(COSINE.equals(command))
        {
            label3.setText(String.valueOf(Math.cos(Double.parseDouble(inputField1.getText()))+" ; "+String.valueOf(Math.cos(Double.parseDouble(inputField2.getText())))));
        }
        else if(TANGENT.equals(command))
        {
            label3.setText(String.valueOf(Math.tan(Double.parseDouble(inputField1.getText()))+" ; "+String.valueOf(Math.tan(Double.parseDouble(inputField2.getText())))));
        }
        else if(FACT.equals(command))
        {
            label3.setText(String.valueOf(Math.sin(Double.parseDouble(inputField1.getText()))+" ; "+String.valueOf(Math.sin(Double.parseDouble(inputField2.getText())))));
        } 
    }
    
    public String fac(long aaaa,long bbbb)
    {
        long varb=1,vard=1,vara,varc;
        for(vara=1;vara<=aaaa;vara++)
        {
            varb=varb*vara;
        }
        for(varc=1;varc<=bbbb;varc++)
        {
            vard=vard*varc;
        }
        return String.valueOf(aaaa)+"  "+String.valueOf(bbbb);
    }
    
    
    
    
    
    
}