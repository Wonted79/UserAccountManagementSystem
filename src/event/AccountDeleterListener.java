package event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import account.AccountInput;
import account.AccountKind;
import account.Common;
import exception.EmailFormatException;
import manager.AccountManager;

public class AccountDeleterListener implements ActionListener {
	JTextField fieldSite;
	AccountManager accountManager;
	public AccountDeleterListener(JTextField fieldSite,AccountManager accountManager) {
		this.fieldSite=fieldSite;
		this.accountManager = accountManager;
	}
    public void actionPerformed(ActionEvent e) {    	
    	accountManager.deleteAccount(fieldSite.getText());
    	putObject(accountManager,"accountmanager.ser");
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