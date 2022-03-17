package jfc.src;
import java.awt.*; 
import javax.swing.*; 
 
/**
 * Class Credits - write a description of the class here
 * 
 * @author (your name) 
 * @version (a version number)
 */
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
        P.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

     /**
     * Called by the browser or applet viewer to inform this JApplet that it
     * has been loaded into the system. It is always called before the first 
     * time that the start method is called.
     */
    public void init()
    {
        // this is a workaround for a security conflict with some browsers
        // including some versions of Netscape & Internet Explorer which do 
        // not allow access to the AWT system event queue which JApplets do 
        // on startup to check access. May not be necessary with your browser. 
        JRootPane rootPane = this.getRootPane();    
        rootPane.putClientProperty("defeatSystemEventQueueCheck", Boolean.TRUE);
    
        // provide any initialisation necessary for your JApplet
    }

    public void destroy() 
    {
        remove(object);
    }

    public void start()
    {
        object.setEnabled(true);
        repaint();
    }

    public void stop()
    {
        object.setEnabled(false);
    }

    /**
     * Paint method for applet. 
     * 
     * @param  g   the Graphics object for this applet
     */
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

    


    /**
     * Returns parameter information about this JApplet. 
     * Returns information about the parameters than are understood by this JApplet.
     * An applet should override this method to return an array of Strings 
     * describing these parameters. 
     * Each element of the array should be a set of three Strings containing 
     * the name, the type, and a description.
     *
     * @return a String[] representation of parameter information about this JApplet
     */
    public String[][] getParameterInfo()
    {
        // provide parameter information about the applet
        String paramInfo[][] = {
                 {"firstParameter",    "1-10",    "description of first parameter"},
                 {"status", "boolean", "description of second parameter"},
                 {"images",   "url",     "description of third parameter"}
        };
        return paramInfo;
    }
}
