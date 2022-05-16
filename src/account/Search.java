package account;
import java.util.Scanner;

import exception.EmailFormatException;

public class  Search extends Account  {
	public Search(AccountKind kind){
		super(kind);
	}
	
	public void getUserInput(Scanner input) {		
		setAccountSite(input);
		    
		setAccountID(input);
		    
		setAccountPassword(input);
	    
		setAccountEmailwithYN(input);
	      
	    this.setSecondPassword("");	    
	}
	
	public void setAccountEmailwithYN(Scanner input) {
		char answer = 'x';
	    while(answer != 'y'&& answer != 'Y' && answer != 'n'&& answer != 'N') {
	        System.out.print("Do you have an email address(Y/N)" );
	        answer = input.next().charAt(0);
	        try {
	        if(answer == 'y'||answer == 'Y') {
	    	    setAccountEmail(input);
		        break;
	        }
	        else if(answer == 'n'||answer == 'N') {
	    	    this.setEmail("");
	    	    break;
	        }
	        else {	    	
	        }
	    }
	        catch(EmailFormatException e) {
	        	 System.out.println("Incorrect Email Format. put the e-mail address that contaims @");
	        }
	    }
	}
	
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind: "+skind+" ªÁ¿Ã∆Æ: "+site+" ID: "+ID+" Password: "+Password + " Email: "+Email +" SecondPassword: "+SecondPassword);
	}
	
	public String getKindString() {
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
        default:		
		}
        return skind; 		
	}
}
