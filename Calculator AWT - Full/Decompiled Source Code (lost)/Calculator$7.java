import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

// 
// Decompiled by Procyon v0.5.36
// 

class Calculator$7 extends WindowAdapter {
    @Override
    public void windowClosing(final WindowEvent e) {
        Calculator.this.windowClosed();
    }
}