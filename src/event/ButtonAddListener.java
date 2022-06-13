package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ButtonAddListener implements ActionListener {
    WindowFrame frame;
    
	public ButtonAddListener(WindowFrame frame) {
	    this.frame =frame;	
	}
	
	public void actionPerformed(ActionEvent e) {
		
		JButton b = (JButton) e.getSource();
		AccountAdder adder = frame.getAccountadder();
        frame.setupPanel(adder);
	}
}
