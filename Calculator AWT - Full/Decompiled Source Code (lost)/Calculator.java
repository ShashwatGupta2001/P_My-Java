package Decompiled;

import java.awt.event.ActionEvent;
import java.awt.Component;
import java.awt.Color;
import java.awt.event.WindowListener;
import java.awt.Dimension;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import javax.swing.JFrame;


public class Calculator extends JFrame implements ActionListener
{
    static JLabel prompt1;
    static JLabel prompt2;
    static JLabel prompt3;
    static JPanel check;
    static JPanel buttonPanela;
    static JPanel centerPanel;
    static JLabel mess;
    static JLabel meT;
    static JButton send;
    static JButton ad;
    static JButton sub;
    static JButton mul;
    static JButton div;
    static JButton exp;
    static JButton sq;
    static JButton sqrt;
    static JButton cb;
    static JButton cbrt;
    static JButton log;
    static JButton sine;
    static JButton cosine;
    static JButton tangent;
    static JButton fact;
    static JButton clear;
    static JButton mp;
    static JButton mr;
    static JButton mm;
    static JButton win;
    static JButton cls;
    static Calculator obj;
    static Calculator object;
    static JTextField inputField1;
    static JTextField inputField2;
    static JTextField inputFieldx;
    static JTextField label3;
    public static String v;
    static final String ADD = "Add";
    static final String SUB = "Substract";
    static final String WIN = "Window";
    static final String CLS = "Close";
    static final String MUL = "Multiply";
    static final String DIV = "Divide";
    static final String EXP = "Exponent";
    static final String SQ = "Square";
    static final String SQRT = "Square Root";
    static final String CB = "Cube";
    static final String CBRT = "Cube Root";
    static final String LOG = "Logarithm";
    static final String SINE = "sin";
    static final String COSINE = "cos";
    static final String TANGENT = "tan";
    static final String FACT = "Factorial";
    static final String CLEAR = "Clear";
    static final String MP = "M+";
    static final String MR = "MR";
    static final String MM = "M-";
    static Calculator frame;
    static Calculator X;
    static Exit R;
    
    public Calculator() {
        final JMenuBar menuBar = new JMenuBar();
        final JMenu menuFile = new JMenu();
        final JMenuItem menuFileExit = new JMenuItem();
        final JMenuItem menuFileClear = new JMenuItem();
        final JMenuItem menuFileCredit = new JMenuItem();
        menuFile.setText("File");
        menuFileExit.setText("Exit");
        menuFileClear.setText("Clear");
        menuFileCredit.setText("Credits");
        menuFileExit.addActionListener((ActionListener)new Calculator.Calculator$1(this));
        menuFileClear.addActionListener((ActionListener)new Calculator.Calculator$2(this));
        menuFileCredit.addActionListener((ActionListener)new Calculator.Calculator$3(this));
        menuFile.add(menuFileExit);
        menuFile.add(menuFileClear);
        menuFile.add(menuFileCredit);
        menuBar.add(menuFile);
        final JMenu menuMemory = new JMenu();
        final JMenuItem menuMemoryPlus = new JMenuItem();
        final JMenuItem menuMemoryRecall = new JMenuItem();
        final JMenuItem menuMemoryMinus = new JMenuItem();
        menuMemory.setText("Memory Functions");
        menuMemoryPlus.setText("M+");
        menuMemoryRecall.setText("MR");
        menuMemoryMinus.setText("M-");
        menuMemoryPlus.addActionListener((ActionListener)new Calculator.Calculator$4(this));
        menuMemoryRecall.addActionListener((ActionListener)new Calculator.Calculator$5(this));
        menuMemoryMinus.addActionListener((ActionListener)new Calculator.Calculator$6(this));
        menuMemory.add(menuMemoryPlus);
        menuMemory.add(menuMemoryRecall);
        menuMemory.add(menuMemoryMinus);
        menuBar.add(menuMemory);
        this.setTitle("Frame");
        this.setJMenuBar(menuBar);
        this.setSize(new Dimension(400, 400));
        this.addWindowListener((WindowListener)new Calculator.Calculator$7(this));
    }
    
    protected void windowClosed() {
        final Exit r = Calculator.R;
        Exit.main();
    }
    
    public static void main() {
        final Calculator Y = new Calculator();
        Y.mainw(Calculator.frame, Calculator.X);
    }
    
    public void mainw(final Calculator fr, final Calculator S) throws StackOverflowError {
        fr.setTitle("Calculator");
        fr.setVisible(true);
        S.init();
        fr.setResizable(false);
        fr.resize(625, 250);
        final Calculator frame = Calculator.frame;
        fr.setDefaultCloseOperation(3);
    }
    
    public void init() {
        Calculator.frame.setBackground(Color.black);
        Calculator.centerPanel = new JPanel();
        Calculator.prompt1 = new JLabel("Enter 1st Number");
        Calculator.centerPanel.add(Calculator.prompt1, "Center");
        (Calculator.inputField1 = new JTextField(16)).setText("");
        Calculator.centerPanel.add(Calculator.inputField1, "Center");
        Calculator.prompt2 = new JLabel("Enter 2nd Number");
        Calculator.centerPanel.add(Calculator.prompt2, "Center");
        (Calculator.inputField2 = new JTextField(16)).setText("");
        Calculator.centerPanel.add(Calculator.inputField2, "Center");
        Calculator.prompt3 = new JLabel("Answer");
        Calculator.centerPanel.add(Calculator.prompt3, "Center");
        (Calculator.label3 = new JTextField(16)).setEnabled(true);
        Calculator.centerPanel.add(Calculator.label3, "Center");
        Calculator.frame.add(Calculator.centerPanel, "Center");
        Calculator.centerPanel.setBackground(Color.black);
        final JPanel buttonPanelb = new JPanel();
        final JPanel buttonPanela = new JPanel();
        (Calculator.ad = new JButton("Add")).addActionListener(this);
        buttonPanelb.add(Calculator.ad);
        (Calculator.sub = new JButton("Substract")).addActionListener(this);
        buttonPanelb.add(Calculator.sub);
        (Calculator.mul = new JButton("Multiply")).addActionListener(this);
        buttonPanelb.add(Calculator.mul);
        (Calculator.div = new JButton("Divide")).addActionListener(this);
        buttonPanelb.add(Calculator.div);
        (Calculator.exp = new JButton("Exponent")).addActionListener(this);
        buttonPanelb.add(Calculator.exp);
        (Calculator.sq = new JButton("Square")).addActionListener(this);
        buttonPanelb.add(Calculator.sq);
        (Calculator.sqrt = new JButton("Square Root")).addActionListener(this);
        buttonPanelb.add(Calculator.sqrt);
        (Calculator.cb = new JButton("Cube")).addActionListener(this);
        buttonPanela.add(Calculator.cb);
        (Calculator.cbrt = new JButton("Cube Root")).addActionListener(this);
        buttonPanela.add(Calculator.cbrt);
        (Calculator.log = new JButton("Logarithm")).addActionListener(this);
        buttonPanela.add(Calculator.log);
        (Calculator.sine = new JButton("sin")).addActionListener(this);
        buttonPanela.add(Calculator.sine);
        (Calculator.cosine = new JButton("cos")).addActionListener(this);
        buttonPanela.add(Calculator.cosine);
        (Calculator.tangent = new JButton("tan")).addActionListener(this);
        buttonPanela.add(Calculator.tangent);
        (Calculator.fact = new JButton("Factorial")).addActionListener(this);
        buttonPanela.add(Calculator.fact);
        Calculator.frame.add(buttonPanela, "South");
        Calculator.frame.add(buttonPanelb, "North");
        Calculator.frame.setBackground(Color.black);
    }
    
    public void actionPerformed(final ActionEvent evt) {
        final String command = evt.getActionCommand();
        if ("Add".equals(command)) {
            if (Calculator.inputField1.getText() == "") {
                Calculator.inputField1.setText("0");
            }
            if (Calculator.inputField2.getText() == "") {
                Calculator.inputField1.setText("0");
            }
            Calculator.label3.setText(String.valueOf(Double.parseDouble(Calculator.inputField1.getText()) + Double.parseDouble(Calculator.inputField2.getText())));
        }
        else if ("Substract".equals(command)) {
            if (Calculator.inputField1.getText() == "") {
                Calculator.inputField1.setText("0");
            }
            if (Calculator.inputField2.getText() == "") {
                Calculator.inputField1.setText("0");
            }
            Calculator.label3.setText(String.valueOf(Double.parseDouble(Calculator.inputField1.getText()) - Double.parseDouble(Calculator.inputField2.getText())));
        }
        else if ("Multiply".equals(command)) {
            if (Calculator.inputField1.getText() == "") {
                Calculator.inputField1.setText("0");
            }
            if (Calculator.inputField2.getText() == "") {
                Calculator.inputField1.setText("0");
            }
            Calculator.label3.setText(String.valueOf(Double.parseDouble(Calculator.inputField1.getText()) * Double.parseDouble(Calculator.inputField2.getText())));
        }
        else if ("Divide".equals(command)) {
            if (Calculator.inputField1.getText() == "") {
                Calculator.inputField1.setText("0");
            }
            if (Calculator.inputField2.getText() == "") {
                Calculator.inputField1.setText("0");
            }
            Calculator.label3.setText(String.valueOf(Double.parseDouble(Calculator.inputField1.getText()) / Double.parseDouble(Calculator.inputField2.getText())));
        }
        else if ("Exponent".equals(command)) {
            if (Calculator.inputField1.getText() == "") {
                Calculator.inputField1.setText("0");
            }
            if (Calculator.inputField2.getText() == "") {
                Calculator.inputField1.setText("0");
            }
            Calculator.label3.setText(String.valueOf(Math.pow(Double.parseDouble(Calculator.inputField1.getText()), Double.parseDouble(Calculator.inputField2.getText()))));
        }
        else if ("Square".equals(command)) {
            if (Calculator.inputField1.getText() == "") {
                Calculator.inputField1.setText("0");
            }
            if (Calculator.inputField2.getText() == "") {
                Calculator.inputField1.setText("0");
            }
            Calculator.label3.setText(String.valueOf(Math.pow(Double.parseDouble(Calculator.inputField1.getText()), 2.0) + " ; " + String.valueOf(Math.pow(Double.parseDouble(Calculator.inputField2.getText()), 2.0))));
        }
        else if ("Square Root".equals(command)) {
            if (Calculator.inputField1.getText() == "") {
                Calculator.inputField1.setText("0");
            }
            if (Calculator.inputField2.getText() == "") {
                Calculator.inputField1.setText("0");
            }
            Calculator.label3.setText(String.valueOf(Math.sqrt(Double.parseDouble(Calculator.inputField1.getText())) + " ; " + String.valueOf(Math.sqrt(Double.parseDouble(Calculator.inputField2.getText())))));
        }
        else if ("Cube".equals(command)) {
            if (Calculator.inputField1.getText() == "") {
                Calculator.inputField1.setText("0");
            }
            if (Calculator.inputField2.getText() == "") {
                Calculator.inputField1.setText("0");
            }
            Calculator.label3.setText(String.valueOf(Math.pow(Double.parseDouble(Calculator.inputField1.getText()), 3.0) + " ; " + String.valueOf(Math.pow(Double.parseDouble(Calculator.inputField2.getText()), 3.0))));
        }
        else if ("Cube Root".equals(command)) {
            if (Calculator.inputField1.getText() == "") {
                Calculator.inputField1.setText("0");
            }
            if (Calculator.inputField2.getText() == "") {
                Calculator.inputField1.setText("0");
            }
            Calculator.label3.setText(String.valueOf(Math.cbrt(Double.parseDouble(Calculator.inputField1.getText())) + " ; " + String.valueOf(Math.cbrt(Double.parseDouble(Calculator.inputField2.getText())))));
        }
        else if ("Logarithm".equals(command)) {
            if (Calculator.inputField1.getText() == "") {
                Calculator.inputField1.setText("0");
            }
            if (Calculator.inputField2.getText() == "") {
                Calculator.inputField1.setText("0");
            }
            Calculator.label3.setText(String.valueOf(Math.log(Double.parseDouble(Calculator.inputField1.getText())) + " ; " + String.valueOf(Math.log(Double.parseDouble(Calculator.inputField2.getText())))));
        }
        else if ("Close".equals(command)) {
            System.exit(0);
        }
        else if ("sin".equals(command)) {
            Calculator.label3.setText(String.valueOf(Math.sin(0.017453292519943295 * Double.parseDouble(Calculator.inputField1.getText())) + " ; " + String.valueOf(Math.sin(0.017453292519943295 * Double.parseDouble(Calculator.inputField2.getText())))));
        }
        else if ("cos".equals(command)) {
            Calculator.label3.setText(String.valueOf(Math.cos(0.017453292519943295 * Double.parseDouble(Calculator.inputField1.getText())) + " ; " + String.valueOf(Math.cos(0.017453292519943295 * Double.parseDouble(Calculator.inputField2.getText())))));
        }
        else if ("tan".equals(command)) {
            Calculator.label3.setText(String.valueOf(Math.tan(0.017453292519943295 * Double.parseDouble(Calculator.inputField1.getText())) + " ; " + String.valueOf(Math.tan(0.017453292519943295 * Double.parseDouble(Calculator.inputField2.getText())))));
        }
        else if ("Factorial".equals(command)) {
            Calculator.label3.setText(this.fac(Long.parseLong(Calculator.inputField1.getText()), Long.parseLong(Calculator.inputField2.getText())));
        }
    }
    
    public String fac(final long aaaa, final long bbbb) {
        long varb = 1L;
        long vard = 1L;
        for (long vara = 1L; vara <= aaaa; ++vara) {
            varb *= vara;
        }
        for (long varc = 1L; varc <= bbbb; ++varc) {
            vard *= varc;
        }
        return String.valueOf(varb) + "  " + String.valueOf(vard);
    }
    
    static {
        Calculator.obj = new Calculator();
        Calculator.object = new Calculator();
        Calculator.frame = new Calculator();
        Calculator.X = new Calculator();
        Calculator.R = new Exit();
    }
}