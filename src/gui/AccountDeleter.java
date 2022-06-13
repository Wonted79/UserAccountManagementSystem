package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import event.AccountAdderCancelListener;
import event.AccountDeleterListener;
import manager.AccountManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;


import manager.AccountManager;

public class AccountDeleter extends JPanel{
	WindowFrame frame;
	AccountManager accountManager;
	
	public AccountDeleter(WindowFrame frame ,AccountManager accountManager) {
		this.frame = frame;
		this.accountManager = accountManager;
				
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelSite = new JLabel("Site : ",JLabel.TRAILING);
		JTextField fieldSite = new JTextField(10);
		labelSite.setLabelFor(fieldSite);
		panel.add(labelSite);
		panel.add(fieldSite);
		
				
		JButton DeleteButton = new JButton("Delete");
		DeleteButton.addActionListener(new AccountDeleterListener(fieldSite,accountManager));
		JButton cancelButton = new JButton("cancel");
		cancelButton.addActionListener(new AccountAdderCancelListener(frame));
		
		panel.add(DeleteButton);
		panel.add(cancelButton);
		
		SpringUtilities.makeCompactGrid(panel,2,2,6,6,6,6);
		
		this.add(panel);		
		this.setVisible(true);
	}
}
