package account;

import java.util.Scanner;

import exception.EmailFormatException;

public interface AccountInput {
	public String getSite();
	public void getUserInput(Scanner input);
	public void setSite(String site);
	public void setID(String iD);
	public void setPassword(String password);
	
	public void setEmail(String email) throws EmailFormatException; 
	
	public void setSecondPassword(String SecondPassword);
	public void printInfo();
	public void setAccountSite(Scanner input); 
	public void setAccountID(Scanner input);
	public void setAccountPassword(Scanner input);
	public void setAccountEmail(Scanner input);
	public void setAccountSecondPassword(Scanner input);
}
