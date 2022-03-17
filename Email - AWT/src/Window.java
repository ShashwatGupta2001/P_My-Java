package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 
import java.lang.String.*;
 
public class Window extends JFrame implements ActionListener 
 {
    static JLabel prompt1,prompt2,prompt3,prompt4,ll;
    static JPanel check,buttonPanela,centerPanel; 
    static JButton send,sid,spass,attach;
    static JPasswordField pass;
    static Window obj = new Window(),object=new Window();
    static JTextField inputField1,inputField2,inputField3,inputField4,url,id;
    public static String v;
    static final String SEND="Send",ATTACH="Attach";
    static Window frame = new Window();
    static Window X=new Window();
   	static SendFileEmail BB=new SendFileEmail();

    public Window() {
                
        JMenuBar menuBar = new JMenuBar();
        JMenu menuFile = new JMenu();
        JMenuItem menuFileExit = new JMenuItem(),menuFileClear=new JMenuItem(),menuFileCredit=new JMenuItem();;
        
        menuFile.setText("File");
        menuFileExit.setText("Exit");
        menuFileClear.setText("Clear");
        menuFileCredit.setText("Credits");
        
        menuFileExit.addActionListener        (
            new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    Window.this.windowClosed();
                }
                
            }
        ); 
        menuFileClear.addActionListener(
         new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    Window.inputField1.setText("");
                    Window.inputField2.setText(""); 
                    Window.inputField3.setText("");
                    Window.inputField4.setText("");
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
        
        
        
        setTitle("Frame");
        setJMenuBar(menuBar);
        setSize(new Dimension(400, 400));

        this.addWindowListener
        (
            new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    Window.this.windowClosed();
                }
            }
        );  
    }
        
    protected void windowClosed() {
        System.exit(0);
    }
    
    public static void main()
    {
        Window Y=new Window();
        Y.mainw(frame,X);
    }  
    
    public void mainw(Window fr,Window S)throws StackOverflowError
    { 
        fr.setTitle("Window");
        fr.setVisible(true); 
        S.init();
        fr.setResizable(false);
        fr.resize(950,250);   
        fr.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);     
    }
    
    public void init()
    {
        frame.setBackground(Color.black);
               
        centerPanel = new JPanel(); 
        prompt1 = new JLabel("To :");
        centerPanel.add(prompt1,BorderLayout.CENTER);
        inputField1 = new JTextField(23);
        inputField1.setText("");
        centerPanel.add(inputField1,BorderLayout.CENTER);
        prompt2 = new JLabel("From:");
        centerPanel.add(prompt2,BorderLayout.CENTER);
        inputField2 = new JTextField(23);
        inputField2.setText("");
        centerPanel.add(inputField2,BorderLayout.CENTER);
        prompt3 = new JLabel("Subject");
        centerPanel.add(prompt3,BorderLayout.CENTER);
        inputField3 = new JTextField(23);
        inputField3.setText("");
        centerPanel.add(inputField3,BorderLayout.CENTER);
        prompt4 = new JLabel("Message");
        centerPanel.add(prompt4,BorderLayout.CENTER);
        inputField4 = new JTextField(75);
        inputField4.setText("");
        centerPanel.add(inputField4,BorderLayout.CENTER);
        
        frame.add(centerPanel,BorderLayout.CENTER);
        centerPanel.setBackground(Color.black);

        JPanel bottomPanel = new JPanel();
        JPanel topPanel = new JPanel();
                
        topPanel.add(new JLabel("Enter User ID :"));
        id = new JPasswordField(16);
        id.setText("");
        topPanel.add(id);
        sid = new JButton("Submit id");
        sid.addActionListener(this);
        topPanel.add(sid);
        topPanel.add(new JLabel("Enter Password :"));
        pass = new JPasswordField(16);
        pass.setText("");
        topPanel.add(pass);
        spass = new JButton("Submit pass.");
        spass.addActionListener(this);
        topPanel.add(spass);
        
        send = new JButton(SEND);
        send.addActionListener(this);
        bottomPanel.add(send);
        ll=new JLabel("");
        bottomPanel.add(ll);
        bottomPanel.add(new JLabel("Enter URL OF Attachments:"));
        url = new JTextField(25);
        url.setText("");
        bottomPanel.add(url);
        attach = new JButton(ATTACH);
        attach.addActionListener(this);
        bottomPanel.add(attach);

        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(bottomPanel, BorderLayout.SOUTH);
                
        frame.setBackground(Color.black);
         
       
    }
    
    public void actionPerformed(ActionEvent evt)
    {
        String command = evt.getActionCommand();
        if(SEND.equals(command))
        {            
            BB.SUB=inputField3.getText();
           	BB.MES=inputField4.getText();
           	BB.to=inputField1.getText();
           	BB.from=inputField2.getText();
           	BB.main();
         }
        else if(ATTACH.equals(command))
        {            
            BB.filename=url.getText();
            BB.main();
        }
        else if("Submit id".equals(command))
        {
        	BB.ID=id.getText();
        }
        else if("Submit pass.".equals(command))
        {
        	BB.PASS=pass.getText();
        }
    }
}