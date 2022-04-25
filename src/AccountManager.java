import java.util.ArrayList;
import java.util.Scanner;

public class AccountManager {
	ArrayList<Account> accounts = new ArrayList<Account>();
	Scanner input;
		
	AccountManager(Scanner input){
		this.input = input;
	}

	public  void addAccount() {	
		int kind =0;
		Account account;
		while(kind !=1 &&kind !=2) {
		System.out.print("1 Common" );
		System.out.print("2 Search" );
		System.out.print("Select num for Account Kind between 1 and 2:" );
		kind = input.nextInt();
		if(kind == 1) {
			account = new Account();
			account.getUserInput(input);
			accounts.add(account);
			break;
		}
		else if (kind ==2 ) {
			account = new Search();
			account.getUserInput(input);
			accounts.add(account);
			break;
		}
		else {
			System.out.print("Select num for Account Kind between 1 and 2:" );
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
		String Accsite = input.next();
		for(int i=0;i<accounts.size();i++) {
			Account account = accounts.get(i);
		    if (accounts.get(i).getSite().equals(Accsite)) {
		        
		        int num = -1;    //메뉴 선택 초기값

	            while (num!=4) {
	    	    System.out.println("**Account Info Edit Menu**");
                System.out.println("1.Edit site");
                System.out.println("2.Edit Id");
                System.out.println("3.Edit Password");
                System.out.println("4.Exit ");
                System.out.println("Select one number between in 1-4:");
                num = input.nextInt();

                if (num==1) {
            	    System.out.print("Account Site:");
            	    String site = input.next();
            	    account.setSite(site);
                }
                else if (num==2) {
                	System.out.print("Account Id:");
            	    String ID = input.next();
            	    account.setID(ID);
                }
                else if (num==3) {
                	System.out.print("Account Password:");
            	    String Password = input.next();
            	    account.setPassword(Password);
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
