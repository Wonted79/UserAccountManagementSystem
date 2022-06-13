package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import event.AccountAdderCancelListener;
import event.AccountEditerListener;
import manager.AccountManager;

public class AccountEditer extends JPanel{
	WindowFrame frame;
	AccountManager accountManager;
	
	public AccountEditer(WindowFrame frame ,AccountManager accountManager) {
		this.frame = frame;
		this.accountManager = accountManager;
				
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelSite = new JLabel("Eidt Site : ",JLabel.TRAILING);
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
		
		JButton EditButton = new JButton("Edit");
		EditButton.addActionListener(new AccountEditerListener(fieldSite,fieldID,fieldPassword,fieldEmail,fieldSecondPassword,accountManager));
		JButton cancelButton = new JButton("cancel");
		cancelButton.addActionListener(new AccountAdderCancelListener(frame));
		
		panel.add(EditButton);
		panel.add(cancelButton);
		
		SpringUtilities.makeCompactGrid(panel,6,2,6,6,6,6);
		
		this.add(panel);		
		this.setVisible(true);
	}
}