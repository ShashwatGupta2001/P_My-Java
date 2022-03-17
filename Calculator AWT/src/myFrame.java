package jfc.src;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

  
public class myFrame extends JFrame {
    
    public myFrame() {
                
        JMenuBar menuBar = new JMenuBar();
        JMenu menuFile = new JMenu();
        JMenuItem menuFileExit = new JMenuItem(),menuFileClear=new JMenuItem(),menuFileCredit=new JMenuItem();;
        
        menuFile.setText("File");
        menuFileExit.setText("Exit");
        menuFileClear.setText("Clear");
        menuFileCredit.setText("Credits");
        
        // Add action listener.for the menu button
        menuFileExit.addActionListener        (
            new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    myFrame.this.windowClosed();
                }
                
            }
        ); 
        menuFileClear.addActionListener(
         new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    Calculator.inputField1.setText("");
                    Calculator.inputField2.setText(""); 
                    Calculator.label3.setText("");
                }
             }        
        ); 
        menuFileCredit.addActionListener(
         new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    Credits.main();
                }
             }        
        );
        
        menuFile.add(menuFileExit);
        menuFile.add(menuFileClear);
        menuFile.add(menuFileCredit);
        menuBar.add(menuFile);
        
        setTitle("Calculator");
        setJMenuBar(menuBar);
        setSize(new Dimension(400, 400));
        
        // Add window listener.
        this.addWindowListener
        (
            new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    myFrame.this.windowClosed();
                }
            }
        );  
    }
    
    
    /**
     * Shutdown procedure when run as an application.
     */
    protected void windowClosed() {
        
        // TODO: Check if it is safe to close the application
        
        // Exit application.
        System.exit(0);
    }
}