package account;

import java.util.Scanner;

public class Common extends Account implements AccountInput{
	public Common(AccountKind kind){
		super(kind);
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
	public void printInfo() {
		String skind = "none";
		switch(this.kind) {
		case Common:
			skind ="Common";
			break;
		case Search:
			skind ="Search";
			break;
		case Game:
			skind ="Game";
			break;
		
		}
		System.out.println("kind: "+skind+" ªÁ¿Ã∆Æ: "+site+" ID: "+ID+" Password: "+Password + " Email: "+Email +" SecondPassword: "+SecondPassword);
	}
}
