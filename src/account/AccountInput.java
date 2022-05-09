package account;

import java.util.Scanner;

public interface AccountInput {
	public String getSite();
	public void getUserInput(Scanner input);
	public void setSite(String site);
	public void setID(String iD);
	public void setPassword(String password);
	public void setEmail(String email);
	public void setSecondPassword(String SecondPassword);
	public void printInfo();
}
