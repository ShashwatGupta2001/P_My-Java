import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 
// Decompiled by Procyon v0.5.36
// 

class Calculator$5 implements ActionListener {
    public void actionPerformed(final ActionEvent e) {
        Calculator.inputField1.setText(Calculator.v);
        Calculator.inputField2.setText("");
    }
}