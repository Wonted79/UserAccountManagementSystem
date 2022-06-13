package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.AccountEditer;
import gui.WindowFrame;

public class ButtonEditListener implements ActionListener {
    WindowFrame frame;
    
	public ButtonEditListener(WindowFrame frame) {
	    this.frame =frame;	
	}
	
	public void actionPerformed(ActionEvent e) {
		
		JButton b = (JButton) e.getSource();
		AccountEditer editer = frame.getAccountediter();
        frame.setupPanel(editer);
	}
}
