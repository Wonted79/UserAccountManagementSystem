package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import account.AccountInput;
import account.AccountKind;
import account.Common;
import exception.EmailFormatException;
import manager.AccountManager;

public class AccountEditerListener implements ActionListener {
	JTextField fieldSite;
	JTextField fieldID;
	JTextField fieldPassword;
	JTextField fieldEmail;
	JTextField fieldSecondPassword;
	
	AccountManager accountManager;
	
	public AccountEditerListener(
			JTextField fieldSite,
			JTextField fieldID,
			JTextField fieldPassword,
			JTextField fieldEmail,
			JTextField fieldSecondPassword,
			AccountManager accountManager) {
		this.fieldSite=fieldSite;
		this.fieldID=fieldID;
		this.fieldPassword=fieldPassword;
		this.fieldEmail=fieldEmail;
		this.fieldSecondPassword=fieldSecondPassword;
		this.accountManager = accountManager;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		AccountInput account = new Common(AccountKind.Common);
		
			accountManager.editAccount(
					fieldSite.getText(),
					fieldID.getText(),
					fieldPassword.getText(),
					fieldEmail.getText(),
					fieldSecondPassword.getText()
				    ); 		
			putObject(accountManager,"accountmanager.ser");
			account.printInfo();
		
	}
	  public static void putObject(AccountManager accountManager,String filename) {
	    	
	    	try {
	    		FileOutputStream file = new FileOutputStream(filename);
				ObjectOutputStream out = new ObjectOutputStream(file);
				
				out.writeObject(accountManager);
				
				out.close();
				file.close();
	    	} 
	    	catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	       	
	    }

}