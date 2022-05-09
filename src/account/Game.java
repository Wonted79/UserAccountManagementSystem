package account;
import java.util.Scanner;

public class  Game extends Account implements AccountInput {
	public Game(AccountKind kind){
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
	    
	    this.setEmail(""); //이메일에는 아무것도 넣지않음
	    
	    char answer = 'x';
	    while(answer != 'y'&& answer != 'Y' && answer != 'n'&& answer != 'N') {
	    System.out.print("Do you have an SecondPassword(Y/N)" );
	    answer = input.next().charAt(0);
	    if(answer == 'y'||answer == 'Y') {
	    	System.out.print("SencondPassword:" );
		    String SecondPassword = input.next();
		    this.setSecondPassword(SecondPassword);
		    break;
	    }
	    else if(answer == 'n'||answer == 'N') {
	    	this.setSecondPassword("");
	    	break;
	    }
	    else {	    	
	    }
	    }
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
		System.out.println("kind: "+skind+" 사이트: "+site+" ID: "+ID+" Password: "+Password + " Email: "+Email +" SecondPassword: "+SecondPassword);
	}
}
