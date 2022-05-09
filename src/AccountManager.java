import java.util.ArrayList;
import java.util.Scanner;

import account.Account;
import account.AccountInput;
import account.AccountKind;
import account.Common;
import account.Game;
import account.Search;

public class AccountManager {
	ArrayList<AccountInput> accounts = new ArrayList<AccountInput>(); //AccountInput 의 내용을 나열한다.
	Scanner input;
		
	AccountManager(Scanner input){
		this.input = input;
	}

	public  void addAccount() {	
		int kind =0;
		AccountInput AccountInput; //A
		while(kind !=1 &&kind !=2) {
		System.out.print("<1 Common>  " );
		System.out.print("<2 Search>  " );
		System.out.print("<3 Game>" );
		System.out.print("  Select num for Account Kind between 1 , 2, 3 " );
		kind = input.nextInt();
		if(kind == 1) {
			AccountInput = new Common(AccountKind.Common);
			AccountInput.getUserInput(input);
			accounts.add(AccountInput);
			break;
		}
		else if (kind ==2 ) {
			AccountInput = new Search(AccountKind.Search);
			AccountInput.getUserInput(input);
			accounts.add(AccountInput);
			break;
		}
		else if (kind ==3 ) {
			AccountInput = new Game(AccountKind.Game);
			AccountInput.getUserInput(input);
			accounts.add(AccountInput);
			break;
		}
		else {
			System.out.print("Select num for Account Kind between 1 , 2 , 3:" );
		}
		}
			    
	}
	
	public void deleteAccount() {
		System.out.print("remove Account site:" );
		String Accountsite = input.next();
		int index = -1;
		for(int i=0;i<accounts.size();i++) {			
			if (accounts.get(i).getSite().equals(Accountsite)) {
				index = i;
				break;				
			}
		}
		if (index>=0) {
			accounts.remove(index);
			System.out.println("the account "+Accountsite+"is deleted");
			}
		else {
			System.out.println("the account has not been registered");
	        return;
		}	
	}
	
	public void editAccount() {
		System.out.print("Edit Account site:" );
		String Accountsite = input.next();
		for(int i=0;i<accounts.size();i++) {
			AccountInput accountInput = accounts.get(i);
		    if (accountInput.getSite().equals(Accountsite)) {
		        
		        int num = -1;    //메뉴 선택 초기값

	            while (num!=6) {
	    	    System.out.println("**Account Info Edit Menu**");
                System.out.println("1.Edit site");
                System.out.println("2.Edit Id");
                System.out.println("3.Edit Password");
                System.out.println("4.Edit Email");
                System.out.println("5.Edit SecondPassword");
                System.out.println("6.Exit ");
                System.out.println("Select one number between in 1-6:");
                num = input.nextInt();

                if (num==1) {
            	    System.out.print("Account Site:");
            	    String site = input.next();
            	    accountInput.setSite(site);
                }
                else if (num==2) {
                	System.out.print("Account Id:");
            	    String ID = input.next();
            	    accountInput.setID(ID);
                }
                else if (num==3) {
                	System.out.print("Account Password:");
            	    String Password = input.next();
            	    accountInput.setPassword(Password);
                }
                else if (num==4) {
                	System.out.print("Account Email:");
            	    String Email = input.next();
            	    accountInput.setEmail(Email);
                }      
                else if (num==5) {
                	System.out.print("Account SecondPassword:");
            	    String SecondPassword = input.next();
            	    accountInput.setSecondPassword(SecondPassword);
                }      
                else {
            	    continue;
                } //if
	       } // while
	            break;
	   } //if
	} //for
	}
	public void viewAccounts() {		
//		System.out.println("view Account site:" );
//		String Accsite = input.next();
		System.out.println("# of registered accounts:" + accounts.size());
		for(int i=0;i<accounts.size();i++) {	
			accounts.get(i).printInfo();
		}
	
  }
}
