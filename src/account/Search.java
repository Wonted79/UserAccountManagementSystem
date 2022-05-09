package account;
import java.util.Scanner;

public class  Search extends Account implements AccountInput {
	public Search(AccountKind kind){
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
	    
	    char answer = 'x';
	    while(answer != 'y'&& answer != 'Y' && answer != 'n'&& answer != 'N') {
	    System.out.print("Do you have an email address(Y/N)" );
	    answer = input.next().charAt(0);
	    if(answer == 'y'||answer == 'Y') {
	    	System.out.print("Email:" );
		    String email = input.next();
		    this.setEmail(email);
		    break;
	    }
	    else if(answer == 'n'||answer == 'N') {
	    	this.setEmail("");
	    	break;
	    }
	    else {
	    	
	    }
	    }   
	    this.setSecondPassword("");	    
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
