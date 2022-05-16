package account;

import java.util.Scanner;

import exception.EmailFormatException;

public abstract class Account implements AccountInput {
	
	protected AccountKind kind = AccountKind.Common;
	protected String site;
	protected String ID;
	protected String Password;
	protected String Email;
	protected String SecondPassword;
	
	public Account(){
	}
	
	public Account(AccountKind Kind){
		this.kind = kind; 
	}
	
	public Account(String site,String ID,String Password){
		this.site=site;
		this.ID=ID;
		this.Password=Password;	
	}
	
	public AccountKind getKind() {
		return kind;
	}

	public void setKind(AccountKind kind) {
		this.kind = kind;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}
	
	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) throws EmailFormatException {
		if(!email.contains("@")&& !email.equals("")) {
			throw new EmailFormatException();
		}
		this.Email = email;
	}
	
	public String getSecondPassword() {
		return SecondPassword;
	}

	public void setSecondPassword(String SecondPassword) {
		this.SecondPassword = SecondPassword;
	}
 
	public abstract void printInfo();
	
	public void setAccountSite(Scanner input) {
		System.out.print("Account Site:");
        String site = input.next();
        this.setSite(site);		
	}	
	public void setAccountID(Scanner input) {
		System.out.print("Account Id:");
        String ID = input.next();
        this.setID(ID);
	}	
	public void setAccountPassword(Scanner input) {
		 System.out.print("Account Password:");
	     String Password = input.next();
	     this.setPassword(Password);
	}
	public void setAccountEmail(Scanner input) {
		 String Email = "";
		 while (!Email.contains("@")) {
		     System.out.print("Account Email:");
	         Email = input.next();
	         try {
	    	     this.setEmail(Email);
	         }
	         catch(EmailFormatException e) {
	    	     System.out.println("Incorrect Email Format. put the e-mail address that contaims @");
	    	     
	         }
		 }	
	}
	public void setAccountSecondPassword(Scanner input) {
		 System.out.print("Account SecondPassword:");
         String SecondPassword = input.next();
         this.setSecondPassword(SecondPassword);
	
}
}
