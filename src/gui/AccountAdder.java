package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import event.AccountAdderCancelListener;
import event.AccountAdderListener;
import manager.AccountManager;

public class AccountAdder extends JPanel{
	WindowFrame frame;
	AccountManager accountManager;
	
	public AccountAdder(WindowFrame frame ,AccountManager accountManager) {
		this.frame = frame;
		this.accountManager = accountManager;
				
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelSite = new JLabel("Site : ",JLabel.TRAILING);
		JTextField fieldSite = new JTextField(10);
		labelSite.setLabelFor(fieldSite);
		panel.add(labelSite);
		panel.add(fieldSite);
		
		JLabel labelID = new JLabel("ID : ",JLabel.TRAILING);
		JTextField fieldID = new JTextField(10);
		labelID.setLabelFor(fieldID);
		panel.add(labelID);
		panel.add(fieldID);
		
		JLabel labelPassword = new JLabel("Password : ",JLabel.TRAILING);
		JTextField fieldPassword = new JTextField(10);
		labelID.setLabelFor(fieldPassword);
		panel.add(labelPassword);
		panel.add(fieldPassword);
		
		JLabel labelEmail = new JLabel("Email : ",JLabel.TRAILING);
		JTextField fieldEmail = new JTextField(10);
		labelID.setLabelFor(fieldEmail);
		panel.add(labelEmail);
		panel.add(fieldEmail);
				
		JLabel labelSecondPassword = new JLabel("SecondPassword : ",JLabel.TRAILING);
		JTextField fieldSecondPassword = new JTextField(10);
		labelID.setLabelFor(fieldSecondPassword);
		panel.add(labelSecondPassword);
		panel.add(fieldSecondPassword);
		
		JButton saveButton = new JButton("save");
		saveButton.addActionListener(new AccountAdderListener(fieldSite,fieldID,fieldPassword,fieldEmail,fieldSecondPassword,accountManager));
		JButton cancelButton = new JButton("cancel");
		cancelButton.addActionListener(new AccountAdderCancelListener(frame));
		
		panel.add(saveButton);
		panel.add(cancelButton);
		
		SpringUtilities.makeCompactGrid(panel,6,2,6,6,6,6);
		
		this.add(panel);		
		this.setVisible(true);
	}
}
