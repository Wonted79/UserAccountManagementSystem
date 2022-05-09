package account;

import java.util.Scanner;

public abstract class Account {
	
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

	public void setEmail(String email) {
		this.Email = email;
	}
	
	public String getSecondPassword() {
		return SecondPassword;
	}

	public void setSecondPassword(String SecondPassword) {
		this.SecondPassword = SecondPassword;
	}
 
	public abstract void printInfo();
	
}
