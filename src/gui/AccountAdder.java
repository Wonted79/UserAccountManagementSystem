package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class AccountAdder extends JFrame{
	public AccountAdder() {
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
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		
		SpringUtilities.makeCompactGrid(panel,6,2,6,6,6,6);
		
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			
		this.setContentPane(panel);		
		this.setVisible(true);
	}
}
