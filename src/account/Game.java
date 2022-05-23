package account;
import java.io.Serializable;
import java.util.Scanner;

public class  Game extends Account {


	public Game(AccountKind kind){
		super(kind);
	}
	public void getUserInput(Scanner input) {
		
        setAccountSite(input);
	    
	    setAccountID(input);
	    
	    setAccountPassword(input);
	    	    
	    //this.setEmail(""); //이메일에는 아무것도 넣지않음
	    
	    setAccountSecondPasswordwithYN(input);
	   
	}
	
	public void setAccountSecondPasswordwithYN(Scanner input) {
		 char answer = 'x';
		    while(answer != 'y'&& answer != 'Y' && answer != 'n'&& answer != 'N') {
		        System.out.print("Do you have an SecondPassword(Y/N)" );
		        answer = input.next().charAt(0);
		        if(answer == 'y'||answer == 'Y') {
		            setAccountSecondPassword(input);   
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
		String skind = getKindString();
		System.out.println("kind: "+skind+" 사이트: "+site+" ID: "+ID+" Password: "+Password + " Email: "+Email +" SecondPassword: "+SecondPassword);
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
