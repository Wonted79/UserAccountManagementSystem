package gui;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.TextArea;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import event.ButtonAddListener;
import event.ButtonDeleteListener;
import event.ButtonEditListener;
import event.ButtonViewListener;

public class MenuSelection extends JPanel{
	WindowFrame frame;
	public MenuSelection(WindowFrame frame) {
		this.frame = frame;
        this.setLayout(new BorderLayout());
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
	    JLabel label = new JLabel("Menu Selection");
		
		JButton button1 = new JButton("Add Account");
		JButton button2 = new JButton("Delete Account");
		JButton button3 = new JButton("Edit Account");
		JButton button4 = new JButton("View Account");
		JButton button5 = new JButton("Exit Program");
		
		button1.addActionListener(new ButtonAddListener(frame));
		button4.addActionListener(new ButtonViewListener(frame));
		button2.addActionListener(new ButtonDeleteListener(frame));
		button3.addActionListener(new ButtonEditListener(frame));
				
		panel1.add(label);
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);		
		
		this.add(panel1,BorderLayout.NORTH);
		this.add(panel2,BorderLayout.CENTER);
	
	}
}
