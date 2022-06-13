package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.AccountAdder;
import gui.WindowFrame;

public class AccountAdderCancelListener implements ActionListener {
    WindowFrame frame;
    
	public AccountAdderCancelListener(WindowFrame frame) {
	    this.frame =frame;	
	}
	
	public void actionPerformed(ActionEvent e) {
		
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getMenuselection());
		frame.revalidate();
		frame.repaint();
	}
}