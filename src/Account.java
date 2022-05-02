
import java.util.Scanner;

public class Account {
	

	protected AccountKind kind = AccountKind.Common;
	protected String site;
	protected String ID;
	protected String Password;
	protected String Email;
	protected String SecondPassword;
	
	public Account(){		
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
 
	public void printInfo() {
		System.out.println(" ªÁ¿Ã∆Æ: "+site+" ID: "+ID+" Password: "+Password + " Email: "+Email +" SecondPassword: "+SecondPassword);
	}
	
	public void getUserInput(Scanner input) {
	
		System.out.print("Site:" );
	    String site= input.next();
	    this.setSite(site);
	    
	    System.out.print("Id:" );
	    String ID= input.next();
	    this.setID(ID); 
	    
	    System.out.print("PassWord:" );
	    String Password = input.next();
	    this.setPassword(Password);
	    
	    System.out.print("Email:" );
	    String Email = input.next();
	    this.setEmail(Email);
	    
	    System.out.print("SecondPassword:" );
	    String SecondPassword = input.next();
	    this.setSecondPassword(SecondPassword);
	    
	    
	}

}
