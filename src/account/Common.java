package account;

import java.util.Scanner;

public class Common extends Account {
	public Common(AccountKind kind){
		super(kind);
	}
			
	
	public void getUserInput(Scanner input) {
		
		setAccountSite(input);
	    
	    setAccountID(input);
	    
	    setAccountPassword(input);
	    
	    setAccountEmail(input);
	    
	    setAccountSecondPassword(input);    
	}
	
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind: "+skind+" ����Ʈ: "+site+" ID: "+ID+" Password: "+Password + " Email: "+Email +" SecondPassword: "+SecondPassword);
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
