import java.util.Scanner;

public class  Search extends Account {
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
	}

}
