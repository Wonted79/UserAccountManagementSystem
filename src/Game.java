import java.util.Scanner;

public class  Game extends Account {
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
	    
	    this.setEmail("");
	    
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

}
